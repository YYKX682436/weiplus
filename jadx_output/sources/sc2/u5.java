package sc2;

/* loaded from: classes2.dex */
public final class u5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.d6 f406284d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406285e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406286f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f406287g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(sc2.d6 d6Var, android.view.View view, android.view.View view2, android.view.View view3) {
        super(0);
        this.f406284d = d6Var;
        this.f406285e = view;
        this.f406286f = view2;
        this.f406287g = view3;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        com.tencent.mm.protocal.protobuf.NativeInfo native_info;
        android.view.View view = this.f406286f;
        sc2.d6 d6Var = this.f406284d;
        d6Var.getClass();
        android.view.View view2 = this.f406285e;
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) view2.findViewById(com.tencent.mm.R.id.eej);
        android.widget.TextView textView = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.edk);
        android.view.View findViewById = view2.findViewById(com.tencent.mm.R.id.f484482pw4);
        android.view.View findViewById2 = view2.findViewById(com.tencent.mm.R.id.eet);
        android.view.View findViewById3 = view2.findViewById(com.tencent.mm.R.id.lte);
        com.tencent.mm.ui.widget.RoundedCornerFrameLayout roundedCornerFrameLayout2 = (com.tencent.mm.ui.widget.RoundedCornerFrameLayout) view2.findViewById(com.tencent.mm.R.id.eei);
        android.widget.TextView textView2 = (android.widget.TextView) view2.findViewById(com.tencent.mm.R.id.edj);
        android.view.View findViewById4 = view2.findViewById(com.tencent.mm.R.id.edl);
        android.view.View findViewById5 = view2.findViewById(com.tencent.mm.R.id.ees);
        android.view.View findViewById6 = view2.findViewById(com.tencent.mm.R.id.ltf);
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view3 = this.f406287g;
        view3.getGlobalVisibleRect(rect);
        xc2.p0 p0Var = d6Var.f3147h;
        if ((p0Var == null || (finderJumpInfo = p0Var.f453234a) == null || (native_info = finderJumpInfo.getNative_info()) == null || native_info.getNative_type() != 14) ? false : true) {
            android.view.View findViewById7 = view2.findViewById(com.tencent.mm.R.id.kfm);
            findViewById7.animate().cancel();
            findViewById7.animate().alpha(0.0f).setDuration(100L).start();
        }
        findViewById5.animate().cancel();
        findViewById5.animate().alpha(0.0f).setDuration(100L).start();
        ad2.h.F(d6Var, view, view3, 0L, null, new sc2.k5(view3, view, findViewById2), 12, null);
        kotlin.jvm.internal.o.d(roundedCornerFrameLayout2);
        kotlin.jvm.internal.o.d(roundedCornerFrameLayout);
        ad2.h.F(d6Var, roundedCornerFrameLayout2, roundedCornerFrameLayout, 0L, null, null, 28, null);
        kotlin.jvm.internal.o.d(textView2);
        kotlin.jvm.internal.o.d(textView);
        ad2.h.F(d6Var, textView2, textView, 0L, null, null, 28, null);
        kotlin.jvm.internal.o.d(findViewById4);
        kotlin.jvm.internal.o.d(findViewById);
        ad2.h.F(d6Var, findViewById4, findViewById, 0L, null, null, 28, null);
        kotlin.jvm.internal.o.d(findViewById2);
        ad2.h.F(d6Var, findViewById5, findViewById2, 0L, null, null, 28, null);
        kotlin.jvm.internal.o.d(findViewById6);
        kotlin.jvm.internal.o.d(findViewById3);
        ad2.h.F(d6Var, findViewById6, findViewById3, 0L, null, null, 28, null);
        return jz5.f0.f302826a;
    }
}
