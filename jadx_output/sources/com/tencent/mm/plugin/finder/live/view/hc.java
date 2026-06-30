package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes3.dex */
public final class hc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f116358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f116360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.mc f116361g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f116362h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tx2.i0 f116363i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hc(java.lang.String str, java.lang.String str2, com.tencent.mm.plugin.finder.live.view.mc mcVar, r45.h32 h32Var, tx2.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f116359e = str;
        this.f116360f = str2;
        this.f116361g = mcVar;
        this.f116362h = h32Var;
        this.f116363i = i0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.view.hc(this.f116359e, this.f116360f, this.f116361g, this.f116362h, this.f116363i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.view.hc) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f116358d;
        boolean z17 = true;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.modelbase.i mj6 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).mj(this.f116359e, this.f116360f, 1, null, 107);
            this.f116358d = 1;
            obj = rm0.h.b(mj6, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.live.view.mc mcVar = this.f116361g;
        if (b17) {
            r45.h32 h32Var = this.f116362h;
            kotlin.jvm.internal.o.g(h32Var, "<this>");
            h32Var.set(1, 0);
            tx2.i0 i0Var = this.f116363i;
            i0Var.z(this.f116359e, h32Var, null);
            i0Var.a();
            mcVar.f116484b.a7();
            return f0Var;
        }
        com.tencent.mars.xlog.Log.w(mcVar.f116485c, "reserve notice fail " + this.f116360f + ' ' + fVar.f70615a + ' ' + fVar.f70616b);
        android.view.View view = mcVar.f116486d;
        android.content.Context context = view.getContext();
        java.lang.String str = fVar.f70617c;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            str = view.getContext().getResources().getString(com.tencent.mm.R.string.oss);
        }
        db5.t7.m(context, str);
        return f0Var;
    }
}
