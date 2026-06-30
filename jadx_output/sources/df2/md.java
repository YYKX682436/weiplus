package df2;

/* loaded from: classes3.dex */
public final class md extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.od f230772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.pb2 f230773e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public md(df2.od odVar, r45.pb2 pb2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f230772d = odVar;
        this.f230773e = pb2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.md(this.f230772d, this.f230773e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        df2.md mdVar = (df2.md) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        mdVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        df2.od odVar = this.f230772d;
        com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView finderLiveInfiniteLoopView = (com.tencent.mm.plugin.finder.live.widget.FinderLiveInfiniteLoopView) odVar.S6(com.tencent.mm.R.id.ubl);
        r45.pb2 pb2Var = this.f230773e;
        if (!odVar.b7((r45.ug1) pb2Var.getCustom(0))) {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew Z6 = df2.od.Z6(odVar);
            if (Z6 != null && finderLiveInfiniteLoopView != null) {
                finderLiveInfiniteLoopView.f(Z6);
            }
        } else if (finderLiveInfiniteLoopView != null) {
            com.tencent.mm.plugin.finder.live.widget.FinderLiveTaskBannerViewNew Z62 = df2.od.Z6(odVar);
            if (Z62 != null) {
                boolean contains = finderLiveInfiniteLoopView.f117650p.contains(Z62);
                java.lang.String str = odVar.f230953m;
                if (!contains) {
                    com.tencent.mars.xlog.Log.i(str, "add banner item");
                    finderLiveInfiniteLoopView.c(Z62);
                    Z62.post(new df2.kd(Z62, odVar, pb2Var));
                    com.tencent.mm.plugin.finder.live.widget.rx rxVar = odVar.f230954n;
                    if (rxVar != null) {
                        java.util.LinkedList linkedList = rxVar.S;
                        if (linkedList == null || linkedList.isEmpty()) {
                            rxVar.h0(null);
                        }
                    }
                } else if (kotlin.jvm.internal.o.b(df2.od.a7(odVar, odVar.f230956p), df2.od.a7(odVar, (r45.ug1) pb2Var.getCustom(0)))) {
                    com.tencent.mars.xlog.Log.i(str, "same one, do noting");
                } else {
                    com.tencent.mars.xlog.Log.i(str, "update banner item");
                    com.tencent.mm.plugin.finder.live.view.FinderLiveMarqueeTextView finderLiveMarqueeTextView = Z62.f117687e;
                    if (finderLiveMarqueeTextView == null) {
                        kotlin.jvm.internal.o.o("txtView");
                        throw null;
                    }
                    finderLiveMarqueeTextView.e();
                    Z62.post(new df2.ld(Z62, odVar, pb2Var));
                }
            }
            finderLiveInfiniteLoopView.setSmoothScrollDuration(800);
        }
        boolean isShown = finderLiveInfiniteLoopView != null ? finderLiveInfiniteLoopView.isShown() : false;
        android.view.View S6 = odVar.S6(com.tencent.mm.R.id.egj);
        if (S6 != null) {
            android.view.ViewGroup.LayoutParams layoutParams = S6.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.height = isShown ? odVar.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479704cz) : -2;
            }
            S6.requestLayout();
        }
        android.view.View S62 = odVar.S6(com.tencent.mm.R.id.fj9);
        if (S62 != null) {
            android.view.ViewGroup.LayoutParams layoutParams2 = S62.getLayoutParams();
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams2 : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.topMargin = isShown ? odVar.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479738dv) : 0;
            }
            S62.requestLayout();
        }
        odVar.f230956p = (r45.ug1) pb2Var.getCustom(0);
        return jz5.f0.f302826a;
    }
}
