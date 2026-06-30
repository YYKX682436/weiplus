package lj2;

/* loaded from: classes3.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f318864a;

    /* renamed from: b, reason: collision with root package name */
    public final lj2.v0 f318865b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.a f318866c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f318867d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.PopupWindow f318868e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f318869f;

    /* renamed from: g, reason: collision with root package name */
    public final android.view.View f318870g;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.View f318871h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f318872i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f318873j;

    public i0(android.content.Context context, lj2.v0 pluginAbility, yz5.a keyBlock) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(keyBlock, "keyBlock");
        this.f318864a = context;
        this.f318865b = pluginAbility;
        this.f318866c = keyBlock;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f488952ds2, (android.view.ViewGroup) null);
        this.f318867d = inflate;
        this.f318868e = new android.widget.PopupWindow(inflate, -1, -2, false);
        this.f318869f = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.rmt);
        this.f318870g = inflate.findViewById(com.tencent.mm.R.id.rmu);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.rmv);
        this.f318871h = findViewById;
        findViewById.setOnClickListener(new lj2.d0(this));
    }
}
