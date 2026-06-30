package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class u70 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v70 f114532d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f114533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u70(com.tencent.mm.plugin.finder.live.plugin.v70 v70Var, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f114532d = v70Var;
        this.f114533e = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.u70(this.f114532d, this.f114533e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.u70) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mm.plugin.finder.live.plugin.v70 v70Var = this.f114532d;
        boolean z17 = ((mm2.o4) v70Var.P0(mm2.o4.class)).f329330x0;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            return f0Var;
        }
        v70Var.Q = this.f114533e;
        java.lang.Runnable runnable = v70Var.S;
        android.os.Handler handler = v70Var.R;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            v70Var.S = null;
        }
        com.tencent.mm.plugin.finder.live.plugin.i70 i70Var = new com.tencent.mm.plugin.finder.live.plugin.i70(v70Var);
        v70Var.S = i70Var;
        handler.postDelayed(i70Var, 200L);
        return f0Var;
    }
}
