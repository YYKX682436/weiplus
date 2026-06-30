package yt3;

/* loaded from: classes3.dex */
public final class t0 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f465671d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465672e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f465673f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f465674g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.Button f465675h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.Button f465676i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f465677m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f465678n;

    /* renamed from: o, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.InsectRelativeLayout f465679o;

    /* renamed from: p, reason: collision with root package name */
    public yt3.q0 f465680p;

    /* renamed from: q, reason: collision with root package name */
    public final android.content.Context f465681q;

    public t0(android.view.ViewGroup view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465671d = view;
        this.f465672e = status;
        this.f465673f = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ghn);
        this.f465674g = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.cmw);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.cmt);
        this.f465675h = button;
        android.widget.Button button2 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.cmv);
        this.f465676i = button2;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483989cn1);
        this.f465677m = imageView;
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cmz);
        this.f465678n = imageView2;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.d6p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.InsectRelativeLayout insectRelativeLayout = (com.tencent.mm.ui.widget.InsectRelativeLayout) findViewById;
        this.f465679o = insectRelativeLayout;
        this.f465680p = yt3.q0.f465603f;
        this.f465681q = view.getContext();
        insectRelativeLayout.setPadding(0, 0, 0, com.tencent.mm.ui.bl.c(view.getContext()) + insectRelativeLayout.getPaddingBottom());
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_undo, -1));
        imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_rotate, -1));
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        a();
    }

    public final void a() {
        this.f465680p = yt3.q0.f465602e;
        this.f465673f.setVisibility(0);
        this.f465674g.setVisibility(4);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (this.f465680p != yt3.q0.f465601d) {
            return false;
        }
        this.f465680p = yt3.q0.f465603f;
        ju3.d0.k(this.f465672e, ju3.c0.R1, null, 2, null);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditPhotoControlPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f465674g;
        android.view.ViewGroup viewGroup2 = this.f465673f;
        ju3.d0 d0Var = this.f465672e;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.cmt) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(4);
            ju3.d0.k(d0Var, ju3.c0.R1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.cmv) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(4);
            this.f465680p = yt3.q0.f465602e;
            ju3.d0.k(d0Var, ju3.c0.S1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f483989cn1) {
            ju3.d0.k(d0Var, ju3.c0.U1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.cmz) {
            ju3.d0.k(d0Var, ju3.c0.T1, null, 2, null);
            this.f465678n.announceForAccessibility(i65.a.r(this.f465671d.getContext(), com.tencent.mm.R.string.f489974h3));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditPhotoControlPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void onPause() {
    }

    @Override // yt3.r2
    public void onResume() {
    }

    @Override // yt3.r2
    public void release() {
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        android.view.ViewGroup viewGroup = this.f465671d;
        if (viewGroup.getVisibility() == i17) {
            return;
        }
        viewGroup.setVisibility(i17);
        viewGroup.clearAnimation();
        android.content.Context context = this.f465681q;
        if (i17 == 0) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477723k);
            loadAnimation.setAnimationListener(new yt3.r0(this, i17));
            viewGroup.startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477724l);
            loadAnimation2.setAnimationListener(new yt3.s0(this, i17));
            viewGroup.startAnimation(loadAnimation2);
        }
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f465679o.setForbidLayout(configProvider.M.getBoolean("key_forbit_edit_inset_layout", false));
    }
}
