package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f158550d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.b3 f158551e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f158552f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(java.util.LinkedList linkedList, com.tencent.mm.plugin.ringtone.uic.b3 b3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158550d = linkedList;
        this.f158551e = b3Var;
        this.f158552f = appCompatActivity;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.y2(this.f158550d, this.f158551e, this.f158552f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.ringtone.uic.y2 y2Var = (com.tencent.mm.plugin.ringtone.uic.y2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        y2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        t45.n0 n0Var;
        com.tencent.mm.plugin.ringtone.uic.y2 y2Var = this;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.Iterator it = kz5.n0.N(y2Var.f158550d, y2Var.f158551e.f158364t).iterator();
        while (it.hasNext()) {
            for (in5.x0 x0Var : (java.util.List) it.next()) {
                in5.c cVar = x0Var.f293158a;
                ox3.g gVar = cVar instanceof ox3.g ? (ox3.g) cVar : null;
                androidx.appcompat.app.AppCompatActivity activity = y2Var.f158552f;
                kotlin.jvm.internal.o.g(activity, "activity");
                java.lang.Object a17 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class);
                kotlin.jvm.internal.o.f(a17, "get(...)");
                ed0.z0.i1((ed0.z0) a17, 1L, x0Var.f293160c, gVar, 0L, 8, null);
                if (((gVar == null || (n0Var = gVar.f349749d) == null) ? null : n0Var.f415622n) != null) {
                    java.lang.Object a18 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class);
                    kotlin.jvm.internal.o.f(a18, "get(...)");
                    ed0.z0.i1((ed0.z0) a18, 11L, x0Var.f293160c, gVar, 0L, 8, null);
                }
                y2Var = this;
            }
            y2Var = this;
        }
        return jz5.f0.f302826a;
    }
}
