package uj3;

/* loaded from: classes14.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f428291a;

    /* renamed from: b, reason: collision with root package name */
    public final uj3.b f428292b;

    /* renamed from: c, reason: collision with root package name */
    public final uj3.k f428293c;

    /* renamed from: d, reason: collision with root package name */
    public final int f428294d;

    /* renamed from: e, reason: collision with root package name */
    public final int f428295e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f428296f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f428297g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f428298h;

    /* renamed from: i, reason: collision with root package name */
    public int f428299i;

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f428300j;

    public j1(android.content.Context context, uj3.b statusManager, uj3.k kVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(statusManager, "statusManager");
        this.f428291a = context;
        this.f428292b = statusManager;
        this.f428293c = kVar;
        this.f428294d = 4;
        this.f428295e = 1;
        this.f428299i = 4;
        this.f428300j = new com.tencent.mm.sdk.platformtools.b4(new uj3.i1(this), true);
    }

    public final void a() {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator scaleX;
        android.view.ViewPropertyAnimator scaleY;
        android.view.ViewPropertyAnimator duration;
        android.content.res.Resources resources;
        android.widget.TextView textView = this.f428297g;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(this.f428299i));
        }
        android.widget.TextView textView2 = this.f428298h;
        if (textView2 != null) {
            android.content.Context context = this.f428291a;
            textView2.setText((context == null || (resources = context.getResources()) == null) ? null : resources.getString(com.tencent.mm.R.string.f492763hs4));
        }
        android.widget.TextView textView3 = this.f428297g;
        if (textView3 != null) {
            textView3.setScaleX(1.5f);
        }
        android.widget.TextView textView4 = this.f428297g;
        if (textView4 != null) {
            textView4.setScaleY(1.5f);
        }
        android.widget.TextView textView5 = this.f428297g;
        if (textView5 == null || (animate = textView5.animate()) == null || (scaleX = animate.scaleX(1.0f)) == null || (scaleY = scaleX.scaleY(1.0f)) == null || (duration = scaleY.setDuration(200L)) == null) {
            return;
        }
        duration.start();
    }
}
