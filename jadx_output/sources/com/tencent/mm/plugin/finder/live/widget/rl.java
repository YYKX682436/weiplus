package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class rl extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f119656d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f119657e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.sl f119658f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rl(android.view.View view, com.tencent.mm.plugin.finder.live.widget.sl slVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f119657e = view;
        this.f119658f = slVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.rl(this.f119657e, this.f119658f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.rl) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f119656d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.live.widget.sl slVar = this.f119658f;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int[] iArr = new int[2];
            android.view.View view = this.f119657e;
            view.getLocationOnScreen(iArr);
            jz5.l a17 = slVar.a(view, iArr);
            try {
                slVar.showAtLocation(view, 0, ((java.lang.Number) a17.f302833d).intValue(), ((java.lang.Number) a17.f302834e).intValue());
                if (slVar.f119805i != null) {
                    slVar.setTouchInterceptor(new com.tencent.mm.plugin.finder.live.widget.pl(slVar));
                }
                slVar.f119802f.invoke();
                slVar.getContentView().setOnClickListener(new com.tencent.mm.plugin.finder.live.widget.ql(slVar));
                long j17 = slVar.f119799c;
                this.f119656d = 1;
                if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                    return aVar;
                }
            } catch (android.view.WindowManager.BadTokenException unused) {
                slVar.f119803g.invoke();
                return f0Var;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        slVar.dismiss();
        slVar.f119801e.invoke();
        return f0Var;
    }
}
