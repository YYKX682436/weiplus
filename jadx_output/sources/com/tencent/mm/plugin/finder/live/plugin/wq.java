package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class wq implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.et f114990d;

    public wq(com.tencent.mm.plugin.finder.live.plugin.et etVar) {
        this.f114990d = etVar;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(android.content.DialogInterface dialogInterface) {
        jz5.f0 f0Var;
        com.tencent.mm.plugin.finder.live.plugin.et etVar = this.f114990d;
        java.lang.String str = etVar.f112463y1;
        if (str != null) {
            if (kotlin.jvm.internal.o.b(str, "notify@all")) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                ((ml2.r0) c17).tj(1, null, null);
            } else {
                i95.m c18 = i95.n0.c(ml2.r0.class);
                kotlin.jvm.internal.o.f(c18, "getService(...)");
                ((ml2.r0) c18).tj(2, kz5.b0.c(str), null);
            }
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            i95.m c19 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c19, "getService(...)");
            ((ml2.r0) c19).tj(0, null, null);
        }
        etVar.f112463y1 = null;
        etVar.f112461y.postDelayed(new com.tencent.mm.plugin.finder.live.plugin.vq(etVar), 200L);
    }
}
