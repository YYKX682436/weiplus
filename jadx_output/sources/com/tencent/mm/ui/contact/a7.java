package com.tencent.mm.ui.contact;

/* loaded from: classes4.dex */
public class a7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f206590d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.b7 f206591e;

    public a7(com.tencent.mm.ui.contact.b7 b7Var, java.lang.String str) {
        this.f206591e = b7Var;
        this.f206590d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", this.f206590d);
        intent.putExtra("view_mode", true);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.m(intent, this.f206591e.f206626d.getContext());
    }
}
