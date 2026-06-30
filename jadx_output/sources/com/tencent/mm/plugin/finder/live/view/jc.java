package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class jc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f116424d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116425e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.mc f116426f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jc(java.lang.String str, com.tencent.mm.plugin.finder.live.view.mc mcVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116425e = str;
        this.f116426f = mcVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.jc(this.f116425e, this.f116426f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.view.jc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Object b17;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f116424d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            db2.b1 b1Var = new db2.b1(this.f116425e, null, null, 0, null, null, null, null, 0, null, null, 2046, null);
            this.f116424d = 1;
            b17 = rm0.h.b(b1Var, this);
            if (b17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
            b17 = obj;
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) b17;
        r45.h32 h32Var = (r45.h32) ((r45.v71) fVar.f70618d).getCustom(1);
        boolean b18 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.live.view.mc mcVar = this.f116426f;
        if (b18) {
            if (!(h32Var == null)) {
                if (zl2.t.e(h32Var)) {
                    mcVar.f116484b.a7();
                } else {
                    java.lang.String str = ((mm2.c1) mcVar.f116484b.business(mm2.c1.class)).f328852o;
                    android.content.Context context = mcVar.f116486d.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    tx2.i0 i0Var = new tx2.i0(context, zl2.u4.f473990f, 0, 4, null);
                    com.tencent.mm.plugin.finder.live.view.mc mcVar2 = this.f116426f;
                    java.lang.String str2 = this.f116425e;
                    i0Var.z(str, h32Var, null);
                    i0Var.A(new com.tencent.mm.plugin.finder.live.view.ic(mcVar2, str, str2, h32Var, i0Var));
                    i0Var.w();
                }
                return f0Var;
            }
        }
        com.tencent.mars.xlog.Log.w(mcVar.f116485c, "get notice fail " + this.f116425e + ' ' + fVar.f70615a + ' ' + fVar.f70616b);
        return f0Var;
    }
}
