package vg2;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f436600a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f436601b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.l f436602c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f436603d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f436604e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f436605f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f436606g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f436607h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f436608i;

    /* renamed from: j, reason: collision with root package name */
    public final jz5.g f436609j;

    public v0(android.content.Context context, android.view.ViewGroup parentRoot, com.tencent.mm.plugin.finder.live.plugin.l plugin, yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(parentRoot, "parentRoot");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f436600a = context;
        this.f436601b = parentRoot;
        this.f436602c = plugin;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.diw, (android.view.ViewGroup) null);
        this.f436603d = inflate;
        this.f436604e = (android.widget.ImageView) inflate.findViewById(com.tencent.mm.R.id.a4f);
        this.f436605f = jz5.h.b(new vg2.n0(this));
        this.f436606g = jz5.h.b(new vg2.m0(this));
        this.f436607h = jz5.h.b(new vg2.p0(this));
        this.f436608i = jz5.h.b(new vg2.o0(this));
        this.f436609j = jz5.h.b(new vg2.l0(this));
    }

    public final android.view.View a() {
        return (android.view.View) ((jz5.n) this.f436605f).getValue();
    }

    public final void b() {
        android.view.View view = this.f436603d;
        if (view.getVisibility() == 0) {
            android.view.View view2 = this.f436603d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget", "hideWidget", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f436601b.removeView(view);
        }
    }
}
