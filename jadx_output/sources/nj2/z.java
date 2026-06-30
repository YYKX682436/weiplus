package nj2;

/* loaded from: classes10.dex */
public final class z extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f337868h;

    /* renamed from: i, reason: collision with root package name */
    public final zh2.c f337869i;

    /* renamed from: m, reason: collision with root package name */
    public final zh2.e f337870m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f337871n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f337872o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f337873p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f337874q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f337875r;

    /* renamed from: s, reason: collision with root package name */
    public android.widget.TextView f337876s;

    /* renamed from: t, reason: collision with root package name */
    public final android.view.View f337877t;

    /* renamed from: u, reason: collision with root package name */
    public final nj2.w f337878u;

    /* renamed from: v, reason: collision with root package name */
    public final kj2.o f337879v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(android.content.Context context, gk2.e liveData, zh2.c pluginAbility, zh2.e userInterface) {
        super(context, false, null, false, 12, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(userInterface, "userInterface");
        this.f337868h = liveData;
        this.f337869i = pluginAbility;
        this.f337870m = userInterface;
        this.f337871n = jz5.h.b(new nj2.v(context, this));
        this.f337872o = jz5.h.b(new nj2.s(this));
        this.f337873p = jz5.h.b(new nj2.y(context, this));
        android.view.View view = this.f337875r;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.View inviteListLayout = view.findViewById(com.tencent.mm.R.id.qtx);
        this.f337877t = inviteListLayout;
        this.f337878u = new nj2.w(this);
        kotlin.jvm.internal.o.f(inviteListLayout, "inviteListLayout");
        this.f337879v = new kj2.o(inviteListLayout, liveData, new nj2.t(this), null, new nj2.u(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488853ci0;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int l() {
        return 8;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomLinkPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.f6c) {
            a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/applypanel/FinderLiveVoiceRoomLinkPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f337875r = rootView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.f6c);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f337874q = findViewById;
        findViewById.setOnClickListener(this);
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.fno);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f337876s = (android.widget.TextView) findViewById2;
        android.view.View view = this.f337875r;
        if (view == null) {
            kotlin.jvm.internal.o.o("rootView");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = (com.tencent.mm.ui.bl.b(rootView.getContext()).y * 2) / 3;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void t() {
        super.t();
        this.f337879v.b();
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void w() {
        if (q()) {
            return;
        }
        super.w();
        gk2.e eVar = this.f337868h;
        if (((mm2.e1) eVar.a(mm2.e1.class)).b7()) {
            android.widget.TextView textView = this.f337876s;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleView");
                throw null;
            }
            textView.setText(this.f118381d.getString(com.tencent.mm.R.string.nwa));
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 1);
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.X1, jSONObject.toString(), null, 4, null);
        }
        this.f337879v.f();
        y().n();
        z().r("onBind");
        boolean Z6 = ((mm2.e1) eVar.a(mm2.e1.class)).Z6();
        jz5.g gVar = this.f337871n;
        if (!Z6) {
            ((lj2.n) ((jz5.n) gVar).getValue()).a();
        } else {
            ((lj2.n) ((jz5.n) gVar).getValue()).b();
            ((lj2.n) ((jz5.n) gVar).getValue()).c();
        }
    }

    public final nj2.r y() {
        return (nj2.r) ((jz5.n) this.f337872o).getValue();
    }

    public final mj2.m z() {
        return (mj2.m) ((jz5.n) this.f337873p).getValue();
    }
}
