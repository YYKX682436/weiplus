package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class j6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f207777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q5 f207778e;

    public j6(com.tencent.mm.ui.conversation.q5 q5Var, int i17) {
        this.f207778e = q5Var;
        this.f207777d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.q5 q5Var = this.f207778e;
        android.app.ProgressDialog progressDialog = q5Var.f208008n;
        if (progressDialog != null) {
            progressDialog.setMessage(q5Var.f208009o.getString(com.tencent.mm.R.string.f490469vy) + this.f207777d + "%");
        }
    }
}
