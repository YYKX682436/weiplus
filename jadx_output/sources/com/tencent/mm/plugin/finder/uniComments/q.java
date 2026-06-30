package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class q implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.o0 f130361d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.d f130362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f130363f;

    public q(com.tencent.mm.plugin.finder.uniComments.o0 o0Var, jv2.d dVar, android.content.Context context) {
        this.f130361d = o0Var;
        this.f130362e = dVar;
        this.f130363f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.uniComments.o0 o0Var = this.f130361d;
        android.app.Dialog dialog = o0Var.F;
        if (dialog != null) {
            dialog.show();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        android.content.Context context = this.f130363f;
        if (f0Var == null) {
            o0Var.F = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, false, com.tencent.mm.plugin.finder.uniComments.k.f130278d);
        }
        jv2.d dVar = this.f130362e;
        com.tencent.mm.plugin.finder.uniComments.p pVar = new com.tencent.mm.plugin.finder.uniComments.p(o0Var, dVar, context);
        com.tencent.mm.plugin.finder.uniComments.m mVar = new com.tencent.mm.plugin.finder.uniComments.m(o0Var, dVar, pVar, new com.tencent.mm.plugin.finder.uniComments.n(o0Var, context));
        jv2.a aVar = dVar.f302207d;
        int i18 = aVar.field_state;
        boolean z17 = true;
        if (((i18 == 1 || i18 == -1) ? false : true) || aVar.field_localCommentId == 0) {
            mVar.invoke();
            return;
        }
        ev2.c cVar = ev2.c.f256900c;
        cVar.getClass();
        ev2.d dVar2 = new ev2.d(aVar, aVar.M);
        fp0.o oVar = cVar.f256901a;
        oVar.getClass();
        pm0.v.X(new fp0.l(oVar, dVar2));
        if (oVar.e(new ev2.d(aVar, aVar.M))) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusActionManager", "removeWhenNotDoingNetScene " + aVar + " is running");
            z17 = false;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.TextStatusActionManager", "removeWhenNotDoingNetScene " + aVar);
            defpackage.y.f458297f.a().z0(aVar.field_localCommentId);
        }
        if (z17) {
            pVar.invoke();
            return;
        }
        android.app.Dialog dialog2 = o0Var.F;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        db5.t7.makeText(context, com.tencent.mm.R.string.eyg, 0).show();
    }
}
