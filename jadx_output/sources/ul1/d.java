package ul1;

/* loaded from: classes7.dex */
public final class d extends android.widget.FrameLayout implements ul1.n, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f428565d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f428566e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f428567f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f428568g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f428569h;

    public d(android.content.Context context) {
        super(context);
        this.f428566e = new ul1.a(this);
        this.f428567f = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488091h1, (android.view.ViewGroup) this, true);
        this.f428565d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.obc);
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandNewBanAlert", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandNewBanAlert", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
