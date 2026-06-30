package f93;

/* loaded from: classes11.dex */
public class a3 implements k93.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelSelectUI f260289a;

    public a3(com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI) {
        this.f260289a = contactLabelSelectUI;
    }

    @Override // k93.x
    public void T(android.view.View view, int i17) {
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260289a;
        if (contactLabelSelectUI.f143295z) {
            return;
        }
        com.tencent.mm.storage.d4 z17 = contactLabelSelectUI.E.z(i17);
        if (z17 == null || !z17.field_isTemporary || z17.field_labelID != -1000000) {
            contactLabelSelectUI.U.g(view, i17, -1L, contactLabelSelectUI, contactLabelSelectUI, contactLabelSelectUI.V, contactLabelSelectUI.W);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Label.ContactLabelSelectUI", "onItemLongClick, is no lebal title item, position = " + i17);
    }

    @Override // k93.x
    public void U(android.content.Intent intent) {
        com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260289a;
        contactLabelSelectUI.X = false;
        contactLabelSelectUI.startActivityForResult(intent, com.tencent.liteav.TXLiteAVCode.WARNING_VIRTUAL_BACKGROUND_DEVICE_UNSURPORTED);
    }

    @Override // k93.x
    public void V(f93.d5 d5Var, int i17) {
        java.lang.Integer num;
        android.widget.CheckBox checkBox = d5Var.f260317h;
        if (checkBox != null) {
            checkBox.setChecked(!checkBox.isChecked());
            android.widget.CheckBox checkBox2 = d5Var.f260317h;
            boolean isChecked = checkBox2.isChecked();
            com.tencent.mm.plugin.label.ui.ContactLabelSelectUI contactLabelSelectUI = this.f260289a;
            k93.j jVar = contactLabelSelectUI.E;
            if (jVar == null || i17 < 0) {
                return;
            }
            com.tencent.mm.storage.d4 z17 = jVar.z(i17);
            if (isChecked && !contactLabelSelectUI.E.f305896h.isEmpty() && contactLabelSelectUI.E.f305896h.contains(java.lang.String.valueOf(z17.field_labelID))) {
                checkBox2.setChecked(false);
                if (contactLabelSelectUI.H > 0) {
                    androidx.appcompat.app.AppCompatActivity context = contactLabelSelectUI.getContext();
                    int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                    e4Var.d(contactLabelSelectUI.H);
                    e4Var.c();
                    return;
                }
                return;
            }
            if (!isChecked && !contactLabelSelectUI.E.f305895g.isEmpty() && contactLabelSelectUI.E.f305895g.contains(java.lang.String.valueOf(z17.field_labelID))) {
                checkBox2.setChecked(true);
                if (contactLabelSelectUI.I > 0) {
                    androidx.appcompat.app.AppCompatActivity context2 = contactLabelSelectUI.getContext();
                    int i19 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                    com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
                    e4Var2.d(contactLabelSelectUI.I);
                    e4Var2.c();
                    return;
                }
                return;
            }
            k93.j jVar2 = contactLabelSelectUI.E;
            java.util.HashMap hashMap = jVar2.f305906u;
            if (!((hashMap == null || hashMap.isEmpty() || !jVar2.f305906u.containsKey(java.lang.Integer.valueOf(z17.field_labelID)) || (num = (java.lang.Integer) jVar2.f305906u.get(java.lang.Integer.valueOf(z17.field_labelID))) == null || num.intValue() > 0) ? false : true)) {
                if (isChecked) {
                    contactLabelSelectUI.c7(java.lang.String.valueOf(z17.field_labelID));
                    return;
                } else {
                    contactLabelSelectUI.c(java.lang.String.valueOf(z17.field_labelID), false, true);
                    return;
                }
            }
            checkBox2.setChecked(false);
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(contactLabelSelectUI.getContext());
            u1Var.g(contactLabelSelectUI.getResources().getString(com.tencent.mm.R.string.ja8));
            u1Var.n(contactLabelSelectUI.getResources().getString(com.tencent.mm.R.string.f490454vi));
            u1Var.q(false);
        }
    }
}
