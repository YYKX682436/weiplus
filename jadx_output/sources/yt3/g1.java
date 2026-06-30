package yt3;

/* loaded from: classes3.dex */
public final class g1 implements yt3.r2, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f465457d;

    /* renamed from: e, reason: collision with root package name */
    public final ju3.d0 f465458e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.ViewGroup f465459f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.ViewGroup f465460g;

    /* renamed from: h, reason: collision with root package name */
    public final yt3.f1 f465461h;

    public g1(android.view.ViewGroup view, ju3.d0 status) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(status, "status");
        this.f465457d = view;
        this.f465458e = status;
        this.f465459f = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.ghn);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.findViewById(com.tencent.mm.R.id.cmw);
        this.f465460g = viewGroup;
        android.widget.Button button = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.cmt);
        android.widget.Button button2 = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.cmv);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.f483989cn1);
        android.widget.ImageView imageView2 = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.cmz);
        this.f465461h = yt3.f1.f465439e;
        viewGroup.setVisibility(4);
        view.findViewById(com.tencent.mm.R.id.d6p);
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.undo_normal, -1));
        imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(view.getContext(), com.tencent.mm.R.raw.icons_filled_refresh, -1));
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
        imageView.setOnClickListener(this);
        imageView2.setOnClickListener(this);
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        if (this.f465461h != yt3.f1.f465438d) {
            return false;
        }
        ju3.d0.k(this.f465458e, ju3.c0.R1, null, 2, null);
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/recordvideo/plugin/EditVideoControlContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        android.view.ViewGroup viewGroup = this.f465460g;
        android.view.ViewGroup viewGroup2 = this.f465459f;
        ju3.d0 d0Var = this.f465458e;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.cmt) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(4);
            ju3.d0.k(d0Var, ju3.c0.R1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.cmv) {
            viewGroup2.setVisibility(0);
            viewGroup.setVisibility(4);
            ju3.d0.k(d0Var, ju3.c0.S1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f483989cn1) {
            ju3.d0.k(d0Var, ju3.c0.U1, null, 2, null);
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.cmz) {
            ju3.d0.k(d0Var, ju3.c0.T1, null, 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/recordvideo/plugin/EditVideoControlContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f465457d.setVisibility(i17);
    }
}
