package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes15.dex */
public final class dm extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f118131d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView f118132e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm(com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f118132e = finderLiveInfiniteLoopView;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.dm(this.f118132e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.dm) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f118131d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView = this.f118132e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView.f117640r;
            if (!finderLiveInfiniteLoopView.e()) {
                return f0Var;
            }
            long j17 = finderLiveInfiniteLoopView.f117647m;
            this.f118131d = 1;
            if (kotlinx.coroutines.k1.b(j17, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        kotlin.jvm.internal.f0 f0Var2 = new kotlin.jvm.internal.f0();
        com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager = finderLiveInfiniteLoopView.f117643f;
        if (finderLiveViewPager == null) {
            kotlin.jvm.internal.o.o("viewPager");
            throw null;
        }
        int currentItem = finderLiveViewPager.getCurrentItem() + 1;
        f0Var2.f310116d = currentItem;
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = true;
        if (currentItem >= finderLiveInfiniteLoopView.f117649o.size()) {
            c0Var.f310112d = false;
            f0Var2.f310116d = 0;
        }
        com.tencent.mars.xlog.Log.i(finderLiveInfiniteLoopView.f117641d, "[startAutoScroll] targetPos = " + f0Var2.f310116d + ", needSmooth = " + c0Var.f310112d);
        if (f0Var2.f310116d == finderLiveInfiniteLoopView.f117649o.size() - 1) {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView.b(finderLiveInfiniteLoopView);
            finderLiveInfiniteLoopView.f117645h.post(new com.tencent.mm.plugin.finder.live.widget.bm(finderLiveInfiniteLoopView, f0Var2, c0Var));
        } else {
            int i19 = f0Var2.f310116d;
            if (i19 == 0) {
                com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView.a(finderLiveInfiniteLoopView);
                finderLiveInfiniteLoopView.f117646i.post(new com.tencent.mm.plugin.finder.live.widget.cm(finderLiveInfiniteLoopView, f0Var2, c0Var));
            } else {
                com.tencent.mm.plugin.finder.live.widget.FinderLiveViewPager finderLiveViewPager2 = finderLiveInfiniteLoopView.f117643f;
                if (finderLiveViewPager2 == null) {
                    kotlin.jvm.internal.o.o("viewPager");
                    throw null;
                }
                finderLiveViewPager2.setCurrentItem(i19, c0Var.f310112d);
            }
        }
        return f0Var;
    }
}
