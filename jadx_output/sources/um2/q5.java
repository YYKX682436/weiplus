package um2;

/* loaded from: classes3.dex */
public final class q5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428932d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(fm2.c cVar) {
        super(0);
        this.f428932d = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fm2.c cVar = this.f428932d;
        android.view.View findViewById = cVar.findViewById(com.tencent.mm.R.id.fpb);
        kotlin.jvm.internal.o.e(findViewById, "null cannot be cast to non-null type android.widget.RelativeLayout");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        layoutParams.addRule(12);
        layoutParams.leftMargin = relativeLayout.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        layoutParams.rightMargin = relativeLayout.getContext().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn);
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(relativeLayout.getContext());
        frameLayout.setId(com.tencent.mm.R.id.eqw);
        relativeLayout.addView(frameLayout, layoutParams);
        frameLayout.setPadding(0, 0, 0, com.tencent.mm.plugin.finder.live.plugin.gb.f112669s);
        return new com.tencent.mm.plugin.finder.live.plugin.gb(frameLayout, cVar);
    }
}
