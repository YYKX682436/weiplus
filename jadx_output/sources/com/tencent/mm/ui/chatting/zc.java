package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class zc implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f206288d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f206289e;

    public zc(com.tencent.mm.storage.f9 f9Var, android.content.Context context) {
        this.f206288d = f9Var;
        this.f206289e = context;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str = ((java.lang.Object) menuItem.getTitle()) + "";
        wf0.x1 x1Var = (wf0.x1) i95.n0.c(wf0.x1.class);
        com.tencent.mm.storage.f9 f9Var = this.f206288d;
        java.lang.String z07 = f9Var.z0();
        ((vf0.y1) x1Var).getClass();
        t21.v2 h17 = t21.d3.h(z07);
        com.tencent.mars.xlog.Log.i("MicroMsg.LongClickBrandServiceHelper", "connector click[video]: to[%s] imgPath[%s]", str, f9Var.z0());
        dk5.c2 c2Var = new dk5.c2();
        android.content.Context context = this.f206289e;
        java.lang.String string = context.getResources().getString(com.tencent.mm.R.string.f490573yv);
        android.content.Context context2 = this.f206289e;
        com.tencent.mm.ui.widget.dialog.u3 Q = db5.e1.Q(context, string, context2.getResources().getString(com.tencent.mm.R.string.f490552yb), true, true, new com.tencent.mm.ui.chatting.yc(this, c2Var));
        c2Var.f234542b = context2;
        c2Var.f234546f = f9Var.z0();
        c2Var.f234541a = Q;
        c2Var.f234548h = str;
        c2Var.f234544d = h17.f415022t;
        c2Var.f234545e = h17.f415015m;
        c2Var.execute(new java.lang.Object[0]);
        c01.sc.d().a(c01.sc.f37461d, null);
        db5.e1.T(context2, context2.getString(com.tencent.mm.R.string.f490548y7));
    }
}
