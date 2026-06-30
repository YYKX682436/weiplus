package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class r1 implements c01.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.s1 f208030d;

    public r1(com.tencent.mm.ui.conversation.s1 s1Var) {
        this.f208030d = s1Var;
    }

    @Override // c01.da
    public boolean a() {
        android.app.ProgressDialog progressDialog;
        com.tencent.mm.ui.conversation.s1 s1Var = this.f208030d;
        return s1Var.f208058f.value || (progressDialog = s1Var.f208059g) == null || !progressDialog.isShowing();
    }

    @Override // c01.da
    public void c() {
        com.tencent.mm.ui.conversation.s1 s1Var = this.f208030d;
        s01.r.b(s1Var.f208057e, false, null);
        android.app.ProgressDialog progressDialog = s1Var.f208059g;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }
}
