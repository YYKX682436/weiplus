package sj3;

/* loaded from: classes5.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.g3 f408473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(sj3.g3 g3Var) {
        super(0);
        this.f408473d = g3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sj3.g3 g3Var = this.f408473d;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) g3Var.f408520a.findViewById(com.tencent.mm.R.id.jwt);
        com.tencent.mm.plugin.multitalk.ui.MultiTalkMainUI multiTalkMainUI = g3Var.f408520a;
        multiTalkMainUI.getLayoutInflater().inflate(com.tencent.mm.R.layout.c3f, (android.view.ViewGroup) frameLayout, true);
        android.view.ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.topMargin += com.tencent.mm.ui.bk.p(multiTalkMainUI) + i65.a.b(multiTalkMainUI, 12);
        frameLayout.setLayoutParams(layoutParams2);
        return frameLayout;
    }
}
