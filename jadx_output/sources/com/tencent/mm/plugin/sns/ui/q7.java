package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class q7 extends com.tencent.mm.plugin.sns.ui.u4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.p7 f170330a;

    public q7(com.tencent.mm.plugin.sns.ui.p7 p7Var) {
        this.f170330a = p7Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.u4
    public void a(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.PicWidget$1");
        final com.tencent.mm.plugin.sns.ui.p7 p7Var = this.f170330a;
        if (i17 < 0) {
            p7Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            gm0.j1.i();
            boolean l17 = gm0.j1.u().l();
            com.tencent.mm.ui.MMActivity mMActivity = p7Var.f169957c;
            if (!l17) {
                db5.t7.k(mMActivity, null);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            } else if (p7Var.f170164g.c() >= 9) {
                db5.e1.i(mMActivity, com.tencent.mm.R.string.jgz, com.tencent.mm.R.string.f490573yv);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            } else {
                if (com.tencent.mm.plugin.sns.ui.ws.a()) {
                    p7Var.u();
                } else {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.PicWidget");
                    com.tencent.mars.xlog.Log.i("MicroMsg.PicWidget", "showAddPicDialog: ");
                    try {
                        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) mMActivity, 1, false);
                        k0Var.f211872n = new db5.o4() { // from class: com.tencent.mm.plugin.sns.ui.p7$$a
                            @Override // db5.o4
                            public final void onCreateMMMenu(db5.g4 g4Var) {
                                com.tencent.mm.plugin.sns.ui.p7 p7Var2 = com.tencent.mm.plugin.sns.ui.p7.this;
                                p7Var2.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$showAddPicDialog$0", "com.tencent.mm.plugin.sns.ui.PicWidget");
                                boolean z17 = x51.o1.f452042a;
                                com.tencent.mm.ui.MMActivity mMActivity2 = p7Var2.f169957c;
                                g4Var.f(0, mMActivity2.getString(com.tencent.mm.R.string.f490407u4));
                                g4Var.f(1, mMActivity2.getString(com.tencent.mm.R.string.f490415uc));
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$showAddPicDialog$0", "com.tencent.mm.plugin.sns.ui.PicWidget");
                            }
                        };
                        k0Var.f211881s = new db5.t4() { // from class: com.tencent.mm.plugin.sns.ui.p7$$b
                            @Override // db5.t4
                            public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i18) {
                                com.tencent.mm.plugin.sns.ui.p7 p7Var2 = com.tencent.mm.plugin.sns.ui.p7.this;
                                p7Var2.getClass();
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("lambda$showAddPicDialog$1", "com.tencent.mm.plugin.sns.ui.PicWidget");
                                int itemId = menuItem.getItemId();
                                if (itemId == 0) {
                                    p7Var2.q();
                                } else if (itemId == 1) {
                                    p7Var2.u();
                                }
                                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("lambda$showAddPicDialog$1", "com.tencent.mm.plugin.sns.ui.PicWidget");
                            }
                        };
                        k0Var.v();
                    } catch (java.lang.Exception unused) {
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("showAddPicDialog", "com.tencent.mm.plugin.sns.ui.PicWidget");
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("selectPhoto", "com.tencent.mm.plugin.sns.ui.PicWidget");
            }
        } else {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(p7Var.f169957c, com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI.class);
            intent.putExtra("sns_gallery_position", i17);
            intent.putExtra("sns_gallery_temp_paths", p7Var.f170164g.d());
            intent.putExtra("key_from_scene", 7);
            p7Var.f169957c.startActivityForResult(intent, 7);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ui.PicWidget$1");
    }
}
