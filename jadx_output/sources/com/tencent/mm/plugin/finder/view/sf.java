package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class sf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f133035d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout f133036e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f133037f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.k8 f133038g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout finderNPSFrameLayout, in5.s0 s0Var, com.tencent.mm.plugin.finder.feed.k8 k8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f133036e = finderNPSFrameLayout;
        this.f133037f = s0Var;
        this.f133038g = k8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.view.sf(this.f133036e, this.f133037f, this.f133038g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.sf) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.LinkedList list;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f133035d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout finderNPSFrameLayout = this.f133036e;
            r45.yk2 yk2Var = finderNPSFrameLayout.f131337m;
            r45.zk2 zk2Var = (yk2Var == null || (list = yk2Var.getList(1)) == null) ? null : (r45.zk2) list.getFirst();
            if (zk2Var != null) {
                finderNPSFrameLayout.f131333f = this.f133037f;
                finderNPSFrameLayout.f131332e = new java.lang.ref.WeakReference(this.f133038g);
                if (finderNPSFrameLayout.getContext() instanceof android.app.Activity) {
                    android.content.Context context = finderNPSFrameLayout.getContext();
                    kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                    finderNPSFrameLayout.f131334g = (com.tencent.mm.ui.MMActivity) context;
                }
                this.f133035d = 1;
                if (com.tencent.mm.plugin.finder.view.FinderNPSFrameLayout.a(finderNPSFrameLayout, zk2Var, false, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
