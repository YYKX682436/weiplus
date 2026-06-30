package in2;

/* loaded from: classes10.dex */
public final class w0 extends androidx.recyclerview.widget.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.FrameLayout f292918d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f292919e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f292920f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f292921g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f292922h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f292923i;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f292924m;

    /* renamed from: n, reason: collision with root package name */
    public final androidx.constraintlayout.widget.ConstraintLayout f292925n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f292926o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f292927p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(in2.a1 a1Var, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        this.f292918d = (android.widget.FrameLayout) itemView.findViewById(com.tencent.mm.R.id.mxw);
        com.tencent.mm.view.MMPAGView mMPAGView = (com.tencent.mm.view.MMPAGView) itemView.findViewById(com.tencent.mm.R.id.f486940my3);
        this.f292919e = mMPAGView;
        this.f292920f = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f486938my1);
        this.f292921g = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f486936my0);
        this.f292922h = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.mya);
        this.f292923i = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.mx8);
        this.f292924m = (androidx.constraintlayout.widget.ConstraintLayout) itemView.findViewById(com.tencent.mm.R.id.mxv);
        this.f292925n = (androidx.constraintlayout.widget.ConstraintLayout) itemView.findViewById(com.tencent.mm.R.id.mx_);
        this.f292926o = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.mxs);
        this.f292927p = (android.widget.TextView) itemView.findViewById(com.tencent.mm.R.id.f486935rb3);
        ym5.l2 l2Var = ym5.l2.f463424a;
        ym5.j2[] j2VarArr = ym5.j2.f463392d;
        if (mMPAGView != null) {
            mMPAGView.o(ae2.in.f3688a.a(ym5.f6.U1));
        }
        if (mMPAGView != null) {
            android.content.res.AssetManager assets = mMPAGView.getContext().getAssets();
            kotlin.jvm.internal.o.f(assets, "getAssets(...)");
            mMPAGView.k(assets, a1Var.f292797g);
        }
        if (mMPAGView != null) {
            mMPAGView.setRepeatCount(0);
        }
    }
}
