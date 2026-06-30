package com.tencent.mm.ui.contact;

/* loaded from: classes10.dex */
public class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.f1 f206678d;

    public e1(com.tencent.mm.ui.contact.f1 f1Var) {
        this.f206678d = f1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.contact.f1 f1Var = this.f206678d;
        com.tencent.mm.ui.contact.ContactCountView contactCountView = f1Var.f206699d;
        android.widget.TextView textView = contactCountView.f206354e;
        if (textView != null) {
            if (contactCountView.f206358i == 1) {
                android.content.res.Resources resources = contactCountView.getContext().getResources();
                int i17 = f1Var.f206699d.f206356g;
                textView.setText(resources.getQuantityString(com.tencent.mm.R.plurals.f489665b, i17, java.lang.Integer.valueOf(i17)));
            } else {
                android.content.res.Resources resources2 = contactCountView.getContext().getResources();
                int i18 = f1Var.f206699d.f206356g;
                textView.setText(resources2.getQuantityString(com.tencent.mm.R.plurals.f489664a, i18, java.lang.Integer.valueOf(i18)));
            }
        }
        com.tencent.mm.ui.contact.ContactCountView contactCountView2 = f1Var.f206699d;
        contactCountView2.setVisible(contactCountView2.f206357h);
    }
}
