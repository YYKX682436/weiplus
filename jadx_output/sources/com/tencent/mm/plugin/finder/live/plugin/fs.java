package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class fs implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f112590d;

    public fs(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f112590d = etVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        java.lang.String str;
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f112590d;
        r45.qm1 qm1Var = (r45.qm1) ((mm2.e0) etVar.P0(mm2.e0.class)).f328970m.getValue();
        if (qm1Var == null || (str = qm1Var.getString(1)) == null) {
            str = "";
        }
        java.lang.String str2 = etVar.f112463y1;
        if (str2 != null) {
            if (kotlin.jvm.internal.o.b(str2, "notify@all")) {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).tj(1, null, str);
            } else {
                ((ml2.r0) i95.n0.c(ml2.r0.class)).tj(2, kz5.b0.c(str2), str);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).tj(0, null, str);
        }
        etVar.f112463y1 = null;
        etVar.f112461y.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.es(etVar), 200L);
    }
}
