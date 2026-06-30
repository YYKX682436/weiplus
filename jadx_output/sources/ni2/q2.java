package ni2;

/* loaded from: classes3.dex */
public final class q2 extends com.tencent.mm.plugin.finder.live.widget.g implements android.view.View.OnClickListener {

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f337440h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f337441i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f337442m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f337443n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f337444o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f337445p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(android.content.Context context, com.tencent.mm.plugin.finder.live.plugin.l basePlugin, yz5.a confirmBlock) {
        super(context, false, null, false, 14, null);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(basePlugin, "basePlugin");
        kotlin.jvm.internal.o.g(confirmBlock, "confirmBlock");
        this.f337440h = confirmBlock;
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public int j() {
        return com.tencent.mm.R.layout.f488936dl0;
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
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveVoiceRoomModeConfirmPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Integer valueOf = view != null ? java.lang.Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.b5i) {
            a();
        } else if (valueOf != null && valueOf.intValue() == com.tencent.mm.R.id.c9z) {
            this.f337440h.invoke();
            a();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/panel/FinderLiveVoiceRoomModeConfirmPanel", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // com.tencent.mm.plugin.finder.live.widget.g
    public void p(android.view.View rootView) {
        kotlin.jvm.internal.o.g(rootView, "rootView");
        this.f337441i = rootView;
        android.view.View findViewById = rootView.findViewById(com.tencent.mm.R.id.b5i);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f337443n = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.tencent.mm.R.id.c9z);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f337444o = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = rootView.findViewById(com.tencent.mm.R.id.gz9);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f337442m = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = rootView.findViewById(com.tencent.mm.R.id.sae);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f337445p = (android.widget.TextView) findViewById4;
        android.widget.TextView textView = this.f337442m;
        if (textView == null) {
            kotlin.jvm.internal.o.o("headerTextView");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView);
        android.widget.TextView textView2 = this.f337443n;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView2);
        android.widget.TextView textView3 = this.f337444o;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("confirmBtn");
            throw null;
        }
        com.tencent.mm.ui.fk.a(textView3);
        android.widget.TextView textView4 = this.f337443n;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        textView4.setOnClickListener(this);
        android.widget.TextView textView5 = this.f337444o;
        if (textView5 != null) {
            textView5.setOnClickListener(this);
        } else {
            kotlin.jvm.internal.o.o("confirmBtn");
            throw null;
        }
    }
}
