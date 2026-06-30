package te2;

/* loaded from: classes2.dex */
public final class a0 implements te2.v {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f417844d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f417845e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f417846f;

    /* renamed from: g, reason: collision with root package name */
    public kotlinx.coroutines.r2 f417847g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.FrameLayout f417848h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.view.MMPAGView f417849i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f417850m;

    public a0(android.view.View root, com.tencent.mm.ui.MMActivity activity, te2.u uVar) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f417844d = root;
        this.f417845e = activity;
        this.f417846f = kotlinx.coroutines.z0.b();
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) root.findViewById(com.tencent.mm.R.id.e__);
        this.f417848h = frameLayout;
        this.f417850m = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.f485427hn2);
        if (this.f417849i == null) {
            com.tencent.mars.xlog.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#initSmallAnim create smallAnim!");
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            android.content.Context context = root.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            com.tencent.mm.view.MMPAGView mMPAGView = new com.tencent.mm.view.MMPAGView(context);
            this.f417849i = mMPAGView;
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.f463318p0));
            com.tencent.mm.view.MMPAGView mMPAGView2 = this.f417849i;
            if (mMPAGView2 != null) {
                mMPAGView2.setScaleMode(1);
            }
            if (frameLayout != null) {
                frameLayout.addView(this.f417849i);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(java.lang.String r10, te2.a0 r11, kotlin.coroutines.Continuation r12) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: te2.a0.a(java.lang.String, te2.a0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f417845e;
    }
}
