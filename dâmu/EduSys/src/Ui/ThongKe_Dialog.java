/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ui;

import DAO.KhoaHocDAO;
import DAO.ThongKeDAO;
import Entity.KhoaHoc;
import Utils.Auth;
import Utils.XDate;
import Utils.XImage;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author vietm
 */
public class ThongKe_Dialog extends java.awt.Dialog {

    /**
     * Creates new form ThongKe_Dialog
     */
    public ThongKe_Dialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl1 = new javax.swing.JPanel();
        lbl_THTK = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnl_Bangdiem = new javax.swing.JPanel();
        lbl_Khoahoc = new javax.swing.JLabel();
        cbo_Khoahoc = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Bangdiem = new javax.swing.JTable();
        pnl_Nguoihoc = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_Nguoihoc = new javax.swing.JTable();
        pnl_DiemCD = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_DiemCD = new javax.swing.JTable();
        pnl_Doanhthu = new javax.swing.JPanel();
        lbl_Nam = new javax.swing.JLabel();
        cbo_Nam = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_Doanhthu = new javax.swing.JTable();

        setTitle("EduSys - TỔNG HỢP & THỐNG KÊ");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        pnl1.setBackground(new java.awt.Color(255, 255, 255));

        lbl_THTK.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_THTK.setForeground(new java.awt.Color(102, 102, 102));
        lbl_THTK.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_THTK.setText("TỔNG HỢP THỐNG KÊ");

        tabs.setBackground(new java.awt.Color(255, 255, 255));
        tabs.setForeground(new java.awt.Color(255, 102, 102));
        tabs.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N

        pnl_Bangdiem.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Khoahoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Khoahoc.setForeground(new java.awt.Color(102, 102, 102));
        lbl_Khoahoc.setText("KHÓA HỌC");

        cbo_Khoahoc.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbo_Khoahoc.setForeground(new java.awt.Color(255, 102, 102));
        cbo_Khoahoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_Khoahoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_KhoahocActionPerformed(evt);
            }
        });

        tbl_Bangdiem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_Bangdiem.setForeground(new java.awt.Color(102, 102, 102));
        tbl_Bangdiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ NH", "HỌ VÀ TÊN", "ĐIỂM", "XẾP LOẠI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Bangdiem.setRowHeight(22);
        tbl_Bangdiem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Bangdiem.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(tbl_Bangdiem);

        javax.swing.GroupLayout pnl_BangdiemLayout = new javax.swing.GroupLayout(pnl_Bangdiem);
        pnl_Bangdiem.setLayout(pnl_BangdiemLayout);
        pnl_BangdiemLayout.setHorizontalGroup(
            pnl_BangdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BangdiemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Khoahoc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbo_Khoahoc, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        pnl_BangdiemLayout.setVerticalGroup(
            pnl_BangdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_BangdiemLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_BangdiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Khoahoc, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(cbo_Khoahoc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        );

        tabs.addTab("BẢNG ĐIỂM", pnl_Bangdiem);

        pnl_Nguoihoc.setBackground(new java.awt.Color(255, 255, 255));

        tbl_Nguoihoc.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_Nguoihoc.setForeground(new java.awt.Color(102, 102, 102));
        tbl_Nguoihoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NĂM", "SỐ NGƯỜI HỌC", "ĐK SỚM NHẤT", "ĐK MUỘN NHẤT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Nguoihoc.setRowHeight(22);
        tbl_Nguoihoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Nguoihoc.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tbl_Nguoihoc);

        javax.swing.GroupLayout pnl_NguoihocLayout = new javax.swing.GroupLayout(pnl_Nguoihoc);
        pnl_Nguoihoc.setLayout(pnl_NguoihocLayout);
        pnl_NguoihocLayout.setHorizontalGroup(
            pnl_NguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnl_NguoihocLayout.setVerticalGroup(
            pnl_NguoihocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_NguoihocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
        );

        tabs.addTab("LƯỢNG NGƯỜI HỌC", pnl_Nguoihoc);

        pnl_DiemCD.setBackground(new java.awt.Color(255, 255, 255));

        tbl_DiemCD.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_DiemCD.setForeground(new java.awt.Color(102, 102, 102));
        tbl_DiemCD.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHUYÊN ĐỀ", "SỐ HV", "ĐIỂM T.NHẤT", "ĐIỂM C.NHẤT", "ĐIỂM T.BÌNH"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_DiemCD.setRowHeight(22);
        tbl_DiemCD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_DiemCD.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane3.setViewportView(tbl_DiemCD);

        javax.swing.GroupLayout pnl_DiemCDLayout = new javax.swing.GroupLayout(pnl_DiemCD);
        pnl_DiemCD.setLayout(pnl_DiemCDLayout);
        pnl_DiemCDLayout.setHorizontalGroup(
            pnl_DiemCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnl_DiemCDLayout.setVerticalGroup(
            pnl_DiemCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DiemCDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE))
        );

        tabs.addTab("ĐIỂM CHUYÊN ĐỀ", pnl_DiemCD);

        pnl_Doanhthu.setBackground(new java.awt.Color(255, 255, 255));

        lbl_Nam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_Nam.setForeground(new java.awt.Color(102, 102, 102));
        lbl_Nam.setText("NĂM");

        cbo_Nam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbo_Nam.setForeground(new java.awt.Color(255, 102, 102));
        cbo_Nam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbo_Nam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_NamActionPerformed(evt);
            }
        });

        tbl_Doanhthu.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbl_Doanhthu.setForeground(new java.awt.Color(102, 102, 102));
        tbl_Doanhthu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHUYÊN ĐỀ", "SỐ KH", "SỐ HV", "D.THU", "HP. TN", "HP. CN", "HP. TB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Doanhthu.setRowHeight(22);
        tbl_Doanhthu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbl_Doanhthu.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane4.setViewportView(tbl_Doanhthu);

        javax.swing.GroupLayout pnl_DoanhthuLayout = new javax.swing.GroupLayout(pnl_Doanhthu);
        pnl_Doanhthu.setLayout(pnl_DoanhthuLayout);
        pnl_DoanhthuLayout.setHorizontalGroup(
            pnl_DoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_DoanhthuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_Nam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbo_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jScrollPane4)
        );
        pnl_DoanhthuLayout.setVerticalGroup(
            pnl_DoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_DoanhthuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_DoanhthuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbl_Nam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbo_Nam, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 223, Short.MAX_VALUE))
        );

        tabs.addTab("DOANH THU", pnl_Doanhthu);

        javax.swing.GroupLayout pnl1Layout = new javax.swing.GroupLayout(pnl1);
        pnl1.setLayout(pnl1Layout);
        pnl1Layout.setHorizontalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_THTK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(tabs)
        );
        pnl1Layout.setVerticalGroup(
            pnl1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_THTK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeDialog

    private void cbo_KhoahocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_KhoahocActionPerformed
        // TODO add your handling code here:
        this.fillTableBangDiem();
    }//GEN-LAST:event_cbo_KhoahocActionPerformed

    private void cbo_NamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_NamActionPerformed
        // TODO add your handling code here:
        this.fillTableDoanhThu();
    }//GEN-LAST:event_cbo_NamActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKe_Dialog dialog = new ThongKe_Dialog(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbo_Khoahoc;
    private javax.swing.JComboBox<String> cbo_Nam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lbl_Khoahoc;
    private javax.swing.JLabel lbl_Nam;
    private javax.swing.JLabel lbl_THTK;
    private javax.swing.JPanel pnl1;
    private javax.swing.JPanel pnl_Bangdiem;
    private javax.swing.JPanel pnl_DiemCD;
    private javax.swing.JPanel pnl_Doanhthu;
    private javax.swing.JPanel pnl_Nguoihoc;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tbl_Bangdiem;
    private javax.swing.JTable tbl_DiemCD;
    private javax.swing.JTable tbl_Doanhthu;
    private javax.swing.JTable tbl_Nguoihoc;
    // End of variables declaration//GEN-END:variables

    ThongKeDAO dao = new ThongKeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();

    private void init() {
        //chuyển Dialog ra giữa
        this.setLocationRelativeTo(null);
        //gọi hàm tạo icon tiêu đề cho Dialog
        this.setIconImage(XImage.getAppIcon());
        this.setTbale();
        this.fillComboBoxKhoaHoc();
        this.fillTableBangDiem();
        this.fillTableLuongNguoiHoc();
        this.fillTableDiemChuyenDe();
        this.fillComboBoxNam();
        this.fillTableDoanhThu();
        this.selectTab(0);
        if (!Auth.isManager()) {
            tabs.remove(3);
        }
    }

    public void selectTab(int index) {
        tabs.setSelectedIndex(index);
    }

    private void fillTableBangDiem() {
        try {
            DefaultTableModel model = (DefaultTableModel) tbl_Bangdiem.getModel();
            model.setRowCount(0);
            KhoaHoc kh = (KhoaHoc) cbo_Khoahoc.getSelectedItem();
            List<Object[]> list = dao.getBangDiem(kh.getMaKH());
            for (Object[] row : list) {
                double diem = (double) row[2];
                model.addRow(new Object[]{row[0], row[1], diem, getXepLoai(diem)});
            }
        } catch (Exception e) {
        }
    }

    private void fillTableLuongNguoiHoc() {
        try {
            DefaultTableModel model = (DefaultTableModel) tbl_Nguoihoc.getModel();
            model.setRowCount(0);
            List<Object[]> list = dao.getLuongNguoiHoc();
            for (Object[] row : list) {
                model.addRow(row);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fillTableDiemChuyenDe() {
        try {
            DefaultTableModel model = (DefaultTableModel) tbl_DiemCD.getModel();
            model.setRowCount(0);
            List<Object[]> list = dao.getDiemChuyenDe();
            for (Object[] row : list) {
                model.addRow(new Object[]{row[0], row[1], row[2], row[3], String.format("%.1f", row[4])});
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    String getXepLoai(double diem) {
        if (diem < 5) {
            return "Chưa Đạt";
        }
        if (diem < 6.5) {
            return "trung Bình";
        }
        if (diem < 7.5) {
            return "Khá";
        }
        if (diem < 9) {
            return "Giỏi";
        }
        return "Xuất Xắc";
    }

    private void fillComboBoxNam() {
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbo_Nam.getModel();
            model.removeAllElements();
            List<Integer> list = khdao.selectYears();
            for (Integer year : list) {
                model.addElement(year);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fillComboBoxKhoaHoc() {
        try {
            DefaultComboBoxModel model = (DefaultComboBoxModel) cbo_Khoahoc.getModel();
            model.removeAllElements();
            List<KhoaHoc> list = khdao.selectAll();
            for (KhoaHoc kh : list) {
                model.addElement(kh);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private void fillTableDoanhThu() {
        try {
            DefaultTableModel model = (DefaultTableModel) tbl_Doanhthu.getModel();
            model.setRowCount(0);
            int nam = (Integer) cbo_Nam.getSelectedItem();
            List<Object[]> list = dao.getDoanhThu(nam);
            for (Object[] row : list) {
                model.addRow(row);
            }
        } catch (Exception e) {
        }
    }

    void setTbale() {
        DefaultTableCellRenderer render = new DefaultTableCellRenderer();
        render.setHorizontalAlignment(JLabel.CENTER);
        TableColumnModel model = tbl_Bangdiem.getColumnModel();
        model.getColumn(0).setMaxWidth(80);
        model.getColumn(2).setMaxWidth(80);
        model.getColumn(2).setMinWidth(80);
        model.getColumn(3).setMinWidth(100);
        model.getColumn(3).setMaxWidth(100);
        model.getColumn(0).setCellRenderer(render);
        model.getColumn(2).setCellRenderer(render);
        model.getColumn(3).setCellRenderer(render);

        TableColumnModel modell = tbl_Nguoihoc.getColumnModel();
        modell.getColumn(0).setMaxWidth(80);
        modell.getColumn(0).setCellRenderer(render);
        modell.getColumn(1).setCellRenderer(render);
        modell.getColumn(2).setCellRenderer(render);
        modell.getColumn(3).setCellRenderer(render);

        TableColumnModel modelll = tbl_DiemCD.getColumnModel();
        modelll.getColumn(0).setMaxWidth(250);
        modelll.getColumn(0).setMinWidth(250);
        modelll.getColumn(1).setMaxWidth(80);
        modelll.getColumn(1).setMinWidth(80);
        modelll.getColumn(2).setMaxWidth(100);
        modelll.getColumn(3).setMaxWidth(100);
        modelll.getColumn(4).setMaxWidth(100);
        modelll.getColumn(1).setCellRenderer(render);
        modelll.getColumn(2).setCellRenderer(render);
        modelll.getColumn(3).setCellRenderer(render);
        modelll.getColumn(4).setCellRenderer(render);

        TableColumnModel modellll = tbl_Doanhthu.getColumnModel();
        modellll.getColumn(0).setMaxWidth(220);
        modellll.getColumn(0).setMinWidth(220);
        modellll.getColumn(1).setCellRenderer(render);
        modellll.getColumn(2).setCellRenderer(render);
        modellll.getColumn(3).setCellRenderer(render);
        modellll.getColumn(4).setCellRenderer(render);
    }
}
