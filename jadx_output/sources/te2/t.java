package te2;

/* loaded from: classes.dex */
public final class t implements te2.q {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f418415d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.MMActivity f418416e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f418417f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f418418g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f418419h;

    /* renamed from: i, reason: collision with root package name */
    public yz5.a f418420i;

    public t(android.view.View root, com.tencent.mm.ui.MMActivity activity, te2.p pVar) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f418415d = root;
        this.f418416e = activity;
        this.f418417f = root.findViewById(com.tencent.mm.R.id.hwy);
        this.f418418g = root.findViewById(com.tencent.mm.R.id.hvh);
        this.f418419h = root.findViewById(com.tencent.mm.R.id.hyx);
        android.widget.ImageView imageView = (android.widget.ImageView) root.findViewById(com.tencent.mm.R.id.bys);
        if (imageView != null) {
            imageView.setOnClickListener(new te2.s(this));
        }
    }

    @Override // fs2.c
    public com.tencent.mm.ui.MMFragmentActivity getActivity() {
        return this.f418416e;
    }
}
