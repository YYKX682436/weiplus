package oi4;

/* loaded from: classes8.dex */
public abstract class n extends in5.r implements com.tencent.mm.modelbase.u0 {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f345645e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.Context f345646f;

    public abstract void n(java.lang.String str, mj4.h hVar, java.lang.String str2);

    public final void o(android.content.Context context) {
        if (context != null) {
            android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.tencent.mm.plugin.textstatus.ui.TextStatusShowExpireStatusUI.class);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/textstatus/convert/like/ShowStatusHistoryItemConvert", "goToStatusExpiredTipsPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/textstatus/convert/like/ShowStatusHistoryItemConvert", "goToStatusExpiredTipsPage", "(Landroid/content/Context;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        pj4.g1 g1Var;
        gm0.j1.d().q(4245, this);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.ShowStatusHistory", "onSceneEnd() called with: errType = " + i17 + ", errCode = " + i18 + ", errMsg = " + str + ", scene = " + m1Var);
        if (i17 != 0 || i18 != 0) {
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f345645e;
            if (u3Var != null) {
                u3Var.dismiss();
            }
            this.f345645e = null;
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            db5.t7.m(context, context.getString(com.tencent.mm.R.string.jwt));
            return;
        }
        com.tencent.mm.ui.widget.dialog.u3 u3Var2 = this.f345645e;
        if (u3Var2 != null) {
            u3Var2.dismiss();
        }
        this.f345645e = null;
        ej4.f fVar = m1Var instanceof ej4.f ? (ej4.f) m1Var : null;
        if (fVar == null || (g1Var = fVar.f253353f) == null) {
            return;
        }
        java.util.LinkedList linkedList = g1Var.f355059d;
        if (com.tencent.mm.sdk.platformtools.t8.L0(linkedList)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.TextStatus.ShowStatusHistory", "onSceneEnd: histories isNullOrNil");
            o(this.f345646f);
            return;
        }
        pj4.n1 n1Var = (pj4.n1) linkedList.get(0);
        mj4.h a17 = n1Var != null ? fj4.b.a(n1Var) : null;
        if (a17 == null) {
            o(this.f345646f);
            return;
        }
        java.lang.String a18 = en1.a.a();
        kotlin.jvm.internal.o.f(a18, "username(...)");
        n(a18, a17, fVar.f253356i);
    }

    public final void p(android.content.Context context, java.lang.String statusId, java.lang.String str) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusId, "statusId");
        ej4.f fVar = new ej4.f(null, 4L, 0L, 1L, null, 16, null);
        fVar.f253356i = str;
        pj4.f1 f1Var = fVar.f253355h;
        if (f1Var != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(statusId);
            f1Var.f355043h = linkedList;
        }
        java.util.Objects.toString(f1Var != null ? f1Var.f355043h : null);
        gm0.j1.d().a(4245, this);
        gm0.j1.d().g(fVar);
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f345645e;
        if (u3Var != null) {
            if (!(!u3Var.isShowing())) {
                return;
            }
        }
        this.f345645e = db5.e1.P(context, context.getString(com.tencent.mm.R.string.f490468vx), 3, context.getString(com.tencent.mm.R.string.f490468vx), false, true, new oi4.m(fVar, this));
    }
}
