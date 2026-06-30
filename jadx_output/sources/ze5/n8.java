package ze5;

/* loaded from: classes9.dex */
public final class n8 extends com.tencent.mm.ui.chatting.viewitems.g0 {

    /* renamed from: b, reason: collision with root package name */
    public android.widget.FrameLayout f472110b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.mvvm.MvvmView f472111c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f472112d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f472113e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f472114f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f472115g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f472116h;

    public final ze5.n8 a(android.view.View view, com.tencent.mm.mvvm.MvvmView mvvmView) {
        kotlin.jvm.internal.o.g(view, "view");
        super.create(view);
        this.f472110b = (android.widget.FrameLayout) view.findViewById(com.tencent.mm.R.id.a1l);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.ott);
        this.uploadingPB = findViewById instanceof android.widget.ProgressBar ? (android.widget.ProgressBar) findViewById : null;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.bqx);
        this.stateIV = findViewById2 instanceof android.widget.ImageView ? (android.widget.ImageView) findViewById2 : null;
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.brc);
        this.userTV = findViewById3 instanceof android.widget.TextView ? (android.widget.TextView) findViewById3 : null;
        android.view.View findViewById4 = view.findViewById(com.tencent.mm.R.id.bkf);
        this.checkBox = findViewById4 instanceof android.widget.CheckBox ? (android.widget.CheckBox) findViewById4 : null;
        this.maskView = view.findViewById(com.tencent.mm.R.id.bpa);
        this.f472112d = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.v_s);
        this.f472113e = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f486007ui5);
        this.f472114f = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f485998ui2);
        this.f472115g = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.ve7);
        this.f472116h = view.findViewById(com.tencent.mm.R.id.bjy);
        android.widget.FrameLayout frameLayout = this.f472110b;
        if (frameLayout != null && mvvmView != null) {
            this.f472111c = mvvmView;
            frameLayout.addView(mvvmView);
        }
        return this;
    }
}
