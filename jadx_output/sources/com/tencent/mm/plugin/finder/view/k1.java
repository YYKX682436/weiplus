package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f132472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.ECProductCardView f132473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.rg0 f132474f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.plugin.finder.view.ECProductCardView eCProductCardView, r45.rg0 rg0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f132473e = eCProductCardView;
        this.f132474f = rg0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.view.k1(this.f132473e, this.f132474f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.view.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.view.ViewGroup showBoxContainer;
        android.view.ViewGroup showBoxContainer2;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f132472d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            com.tencent.mm.plugin.finder.view.s1 s1Var = com.tencent.mm.plugin.finder.view.s1.f132991a;
            com.tencent.mm.plugin.finder.view.ECProductCardView eCProductCardView = this.f132473e;
            android.content.Context context = eCProductCardView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            java.util.LinkedList list = this.f132474f.getList(20);
            kotlin.jvm.internal.o.f(list, "getShow_box_items(...)");
            showBoxContainer = eCProductCardView.getShowBoxContainer();
            showBoxContainer2 = eCProductCardView.getShowBoxContainer();
            int width = showBoxContainer2.getWidth();
            this.f132472d = 1;
            if (s1Var.e(context, list, showBoxContainer, width, this) == aVar) {
                return aVar;
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
