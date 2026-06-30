package com.tencent.mm.ui.conversation;

/* loaded from: classes11.dex */
public class i6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.conversation.q5 f207746d;

    public i6(com.tencent.mm.ui.conversation.q5 q5Var) {
        this.f207746d = q5Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.conversation.q5 q5Var = this.f207746d;
        q5Var.f208004g.a();
        w11.k0 k0Var = q5Var.f208007m;
        if (k0Var != null) {
            k0Var.hashCode();
        }
        android.app.ProgressDialog progressDialog = q5Var.f208008n;
        if (progressDialog != null && progressDialog.isShowing()) {
            q5Var.f208008n.dismiss();
        }
        l71.e eVar = (l71.e) ((js.z0) i95.n0.c(js.z0.class));
        java.util.Map map = eVar.f316829d;
        if (map != null) {
            eVar.f316829d = null;
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("login_loading_msg", "view_exp", map, 34575);
        }
        android.app.Activity activity = q5Var.f208009o;
        q5Var.f208008n = db5.e1.Q(activity, activity.getString(com.tencent.mm.R.string.f490573yv), q5Var.f208009o.getString(com.tencent.mm.R.string.f490469vy), true, false, new com.tencent.mm.ui.conversation.h6(this));
        if (((java.lang.Boolean) ((jz5.n) q5Var.f208014t.f207944a).getValue()).booleanValue()) {
            return;
        }
        gm0.j1.e().n();
    }
}
