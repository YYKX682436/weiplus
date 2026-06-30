package com.tencent.mm.plugin.finder.uniComments;

/* loaded from: classes10.dex */
public final class t2 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.uniComments.q3 f130412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jv2.i f130413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f130414f;

    public t2(com.tencent.mm.plugin.finder.uniComments.q3 q3Var, jv2.i iVar, android.content.Context context) {
        this.f130412d = q3Var;
        this.f130413e = iVar;
        this.f130414f = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.uniComments.q3 q3Var = this.f130412d;
        android.app.Dialog dialog = q3Var.D;
        if (dialog != null) {
            dialog.show();
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        android.content.Context context = this.f130414f;
        if (f0Var == null) {
            q3Var.D = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, false, com.tencent.mm.plugin.finder.uniComments.n2.f130319d);
        }
        jv2.i iVar = this.f130413e;
        com.tencent.mm.plugin.finder.uniComments.p2 p2Var = new com.tencent.mm.plugin.finder.uniComments.p2(q3Var, iVar, new com.tencent.mm.plugin.finder.uniComments.s2(q3Var, iVar, context), new com.tencent.mm.plugin.finder.uniComments.q2(q3Var, context));
        jv2.c cVar = iVar.f302223d;
        int i18 = cVar.field_state;
        if (((i18 == 1 || i18 == -1) ? false : true) || cVar.field_localCommentId == 0) {
            p2Var.invoke();
        }
    }
}
