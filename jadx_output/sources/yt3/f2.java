package yt3;

/* loaded from: classes3.dex */
public final class f2 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f465441d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465442e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f465443f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f465444g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.InsectRelativeLayout f465445h;

    /* renamed from: i, reason: collision with root package name */
    public yt3.c2 f465446i;

    /* renamed from: m, reason: collision with root package name */
    public final android.content.Context f465447m;

    public f2(android.view.ViewGroup view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465441d = view;
        this.f465442e = status;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ghn);
        this.f465443f = viewGroup;
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.cmw);
        this.f465444g = viewGroup2;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cmt);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cmv);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.f483989cn1);
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.d6p);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        com.tencent.mm.ui.widget.InsectRelativeLayout insectRelativeLayout = (com.tencent.mm.ui.widget.InsectRelativeLayout) findViewById;
        this.f465445h = insectRelativeLayout;
        this.f465446i = yt3.c2.f465391f;
        this.f465447m = view.getContext();
        insectRelativeLayout.setPadding(0, 0, 0, com.tencent.mm.ui.bl.c(view.getContext()) + insectRelativeLayout.getPaddingBottom());
        imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_check_mark, -1));
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_close, -1));
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
        button.setOnClickListener(this);
        this.f465446i = yt3.c2.f465390e;
        viewGroup.setVisibility(0);
        viewGroup2.setVisibility(4);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (this.f465446i != yt3.c2.f465389d) {
            return false;
        }
        this.f465446i = yt3.c2.f465391f;
        ju3.d0.k(this.f465442e, ju3.c0.R1, null, 2, null);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotControlPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f465444g;
        android.view.ViewGroup viewGroup2 = this.f465443f;
        ju3.d0 d0Var = this.f465442e;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.cmt) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(4);
            ju3.d0.k(d0Var, ju3.c0.R1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.cmv) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(4);
            this.f465446i = yt3.c2.f465390e;
            ju3.d0.k(d0Var, ju3.c0.S1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f483989cn1) {
            ju3.d0.k(d0Var, ju3.c0.U1, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditWebViewScreenshotControlPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
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
        android.view.ViewGroup viewGroup = this.f465441d;
        if (viewGroup.getVisibility() == i17) {
            return;
        }
        viewGroup.setVisibility(i17);
        viewGroup.clearAnimation();
        android.content.Context context = this.f465447m;
        if (i17 == 0) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477723k);
            loadAnimation.setAnimationListener(new yt3.d2(this, i17));
            viewGroup.startAnimation(loadAnimation);
        } else {
            android.view.animation.Animation loadAnimation2 = android.view.animation.AnimationUtils.loadAnimation(context, com.tencent.mm.R.anim.f477724l);
            loadAnimation2.setAnimationListener(new yt3.e2(this, i17));
            viewGroup.startAnimation(loadAnimation2);
        }
    }

    @Override // yt3.r2
    public void t(com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider configProvider) {
        kotlin.jvm.internal.o.g(configProvider, "configProvider");
        this.f465445h.setForbidLayout(configProvider.M.getBoolean("key_forbit_edit_inset_layout", false));
    }
}
