package qj3;

/* loaded from: classes10.dex */
public final class i implements android.view.View.OnClickListener, yt3.r2 {

    /* renamed from: d, reason: collision with root package name */
    public final ju3.d0 f363900d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f363901e;

    /* renamed from: f, reason: collision with root package name */
    public final bu3.f f363902f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.RelativeLayout f363903g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f363904h;

    public i(android.view.ViewGroup viewGroup, ju3.d0 status) {
        boolean z17;
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        kotlin.jvm.internal.o.g(status, "status");
        this.f363900d = status;
        android.view.View findViewById = viewGroup.findViewById(com.tencent.mm.R.id.d28);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById;
        this.f363903g = relativeLayout;
        sj3.n3 n3Var = sj3.o3.f408666e;
        android.content.Context context = viewGroup.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (n3Var.a(context) != 90) {
            android.content.Context context2 = viewGroup.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            if (n3Var.a(context2) != 270) {
                z17 = false;
                bu3.f fVar = new bu3.f(z17, relativeLayout);
                this.f363902f = fVar;
                fVar.f24596f = status;
                android.view.View findViewById2 = viewGroup.findViewById(com.tencent.mm.R.id.d7o);
                kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
                android.widget.ImageView imageView = (android.widget.ImageView) findViewById2;
                this.f363904h = imageView;
                imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, -1));
                imageView.setOnClickListener(this);
            }
        }
        z17 = true;
        bu3.f fVar2 = new bu3.f(z17, relativeLayout);
        this.f363902f = fVar2;
        fVar2.f24596f = status;
        android.view.View findViewById22 = viewGroup.findViewById(com.tencent.mm.R.id.d7o);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById22;
        this.f363904h = imageView2;
        imageView2.setImageDrawable(com.tencent.mm.ui.uk.e(imageView2.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, -1));
        imageView2.setOnClickListener(this);
    }

    public final void a() {
        boolean z17 = this.f363901e;
        bu3.f fVar = this.f363902f;
        if (z17) {
            if (fVar == null) {
                return;
            }
            fVar.c(0);
        } else {
            if (fVar == null) {
                return;
            }
            fVar.c(4);
        }
    }

    @Override // yt3.r2
    public boolean onBackPress() {
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/editor/MultitalkScreenEditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = !this.f363901e;
        this.f363901e = z17;
        ju3.d0 d0Var = this.f363900d;
        android.widget.ImageView imageView = this.f363904h;
        if (z17) {
            nu3.i iVar = nu3.i.f340218a;
            nu3.i.c(iVar, "KEY_CLICK_DOODLE_COUNT_INT", 0, 2, null);
            iVar.b(7);
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, imageView.getResources().getColor(com.tencent.mm.R.color.aaq)));
            ju3.d0.k(d0Var, ju3.c0.I1, null, 2, null);
        } else {
            ju3.d0.k(d0Var, ju3.c0.M1, null, 2, null);
            imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, -1));
        }
        a();
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/editor/MultitalkScreenEditPhotoPencilPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    public void reset() {
        this.f363901e = false;
        a();
        ju3.d0.k(this.f363900d, ju3.c0.M1, null, 2, null);
        android.widget.ImageView imageView = this.f363904h;
        imageView.setImageDrawable(com.tencent.mm.ui.uk.e(imageView.getContext(), com.tencent.mm.R.raw.icons_filled_duddle, -1));
    }

    @Override // yt3.r2
    public void setVisibility(int i17) {
        this.f363904h.setVisibility(i17);
        android.widget.RelativeLayout relativeLayout = this.f363903g;
        if (relativeLayout == null) {
            return;
        }
        relativeLayout.setVisibility(i17);
    }
}
