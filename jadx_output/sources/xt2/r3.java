package xt2;

/* loaded from: classes2.dex */
public final class r3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f456978a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f456979b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f456980c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f456981d;

    /* renamed from: e, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f456982e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f456983f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456984g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f456985h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f456986i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f456987j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f456988k;

    /* renamed from: l, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f456989l;

    public r3(android.view.ViewGroup root, android.view.View cartGroup) {
        com.tencent.mm.view.MMPAGView mMPAGView;
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(cartGroup, "cartGroup");
        this.f456978a = root;
        this.f456979b = cartGroup;
        this.f456980c = new com.tencent.mm.sdk.platformtools.n3();
        this.f456982e = kotlinx.coroutines.z0.b();
        this.f456984g = "";
        this.f456985h = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.l6l);
        this.f456986i = cartGroup.findViewById(com.tencent.mm.R.id.fld);
        com.tencent.mm.view.MMPAGView mMPAGView2 = (com.tencent.mm.view.MMPAGView) cartGroup.findViewById(com.tencent.mm.R.id.rn_);
        mMPAGView2.a(new xt2.f3(mMPAGView2, this));
        this.f456987j = mMPAGView2;
        this.f456988k = "finder_live_add_cart.pag";
        android.view.ViewParent parent = root.getParent();
        com.tencent.mm.view.MMPAGView mMPAGView3 = null;
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null && (mMPAGView = (com.tencent.mm.view.MMPAGView) viewGroup.findViewById(com.tencent.mm.R.id.toq)) != null) {
            ym5.l2 l2Var = ym5.l2.f463424a;
            ym5.j2[] j2VarArr = ym5.j2.f463392d;
            mMPAGView.a(new xt2.g3(mMPAGView, this));
            mMPAGView3 = mMPAGView;
        }
        this.f456989l = mMPAGView3;
    }
}
