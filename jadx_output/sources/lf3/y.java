package lf3;

/* loaded from: classes3.dex */
public final class y extends lf3.o implements lf3.j {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f318341d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.tools.s4 f318342e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f318343f;

    /* renamed from: g, reason: collision with root package name */
    public lf3.i f318344g;

    /* renamed from: h, reason: collision with root package name */
    public long f318345h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f318342e = new com.tencent.mm.ui.tools.s4(activity);
    }

    @Override // lf3.j
    public void E2(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        lf3.x xVar = new lf3.x(this);
        android.view.View view = this.f318341d;
        if (view == null) {
            return;
        }
        view.animate().setDuration(200L).setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator()).alpha(0.0f).setListener(new lf3.u(this)).start();
        contentView.animate().setDuration(200L).setInterpolator(new android.view.animation.DecelerateInterpolator(1.2f)).alpha(0.0f).setUpdateListener(new lf3.v(this)).setListener(new lf3.w(xVar)).start();
    }

    @Override // lf3.j
    public void N3(lf3.i iVar) {
        this.f318344g = iVar;
    }

    @Override // lf3.o
    public int T6() {
        return com.tencent.mm.R.layout.ejd;
    }

    @Override // lf3.j
    public void d3(float f17) {
        android.view.View view = this.f318341d;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Float.valueOf(f17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/media/PageAnimationComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(view, "com/tencent/mm/plugin/media/PageAnimationComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        lf3.i iVar = this.f318344g;
        if (iVar != null) {
            ((yh5.e) iVar).V6(f17);
        }
    }

    @Override // lf3.j
    public void m6(android.view.View contentView, int i17, int i18) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        android.content.Intent intent = getActivity().getIntent();
        if (intent == null || this.f318341d == null || this.f318343f) {
            return;
        }
        this.f318343f = true;
        int intExtra = intent.getIntExtra("img_gallery_top", 0);
        int intExtra2 = intent.getIntExtra("img_gallery_left", 0);
        int intExtra3 = intent.getIntExtra("img_gallery_width", 0);
        int intExtra4 = intent.getIntExtra("img_gallery_height", 0);
        if (intExtra == 0 && intExtra2 == 0 && intExtra3 == 0 && intExtra4 == 0) {
            com.tencent.mars.xlog.Log.e("MediaGallery.PageAnimationComponent", "get image location info failed");
            return;
        }
        com.tencent.mm.ui.tools.s4 s4Var = this.f318342e;
        s4Var.e(intExtra2, intExtra, intExtra3, intExtra4);
        s4Var.f210699f = i17;
        s4Var.f210700g = i18;
        s4Var.c(contentView, this.f318341d, new lf3.t(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        this.f318345h = java.lang.System.currentTimeMillis();
    }

    @Override // lf3.o, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
        this.f318341d = contentView.findViewById(com.tencent.mm.R.id.ght);
    }
}
