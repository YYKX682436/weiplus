package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class wi extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f120190d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.aj f120191e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wi(com.tencent.mm.plugin.finder.live.widget.aj ajVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f120191e = ajVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.wi(this.f120191e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.wi) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.util.a1 a1Var;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f120190d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.live.widget.aj ajVar = this.f120191e;
            ajVar.b();
            com.tencent.mm.plugin.finder.live.plugin.l basePlugin = ajVar.getBasePlugin();
            if (basePlugin != null && (a1Var = (com.tencent.mm.plugin.finder.live.util.a1) basePlugin.U0(com.tencent.mm.plugin.finder.live.util.a1.class)) != null) {
                android.content.Context context = ajVar.getContext();
                com.tencent.mm.ui.MMActivity mMActivity = context instanceof com.tencent.mm.ui.MMActivity ? (com.tencent.mm.ui.MMActivity) context : null;
                this.f120190d = 1;
                obj = a1Var.c7(mMActivity, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            return jz5.f0.f302826a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        return jz5.f0.f302826a;
    }
}
