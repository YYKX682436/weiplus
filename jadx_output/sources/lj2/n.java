package lj2;

/* loaded from: classes10.dex */
public final class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f318891d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f318892e;

    /* renamed from: f, reason: collision with root package name */
    public final zh2.c f318893f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.widget.g f318894g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.a f318895h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.TextView f318896i;

    public n(android.content.Context context, gk2.e liveData, android.view.View view, zh2.c pluginAbility, com.tencent.mm.plugin.finder.live.widget.g gVar, yz5.a aVar) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(liveData, "liveData");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        this.f318891d = liveData;
        this.f318892e = view;
        this.f318893f = pluginAbility;
        this.f318894g = gVar;
        this.f318895h = aVar;
        this.f318896i = view != null ? (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.tmk) : null;
        if (view == null) {
            com.tencent.mars.xlog.Log.e("FinderLiveMicTopicPanelWidget", "root is null");
        }
        if (view != null) {
            view.setOnClickListener(this);
        }
        ((mm2.y2) liveData.a(mm2.y2.class)).B.observe(pluginAbility.a(), new lj2.l(this));
    }

    public final void a() {
        android.view.View view = this.f318892e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void b() {
        android.widget.TextView textView = this.f318896i;
        if (textView != null) {
            xh2.e eVar = (xh2.e) ((mm2.y2) this.f318891d.a(mm2.y2.class)).B.getValue();
            textView.setText(eVar != null ? eVar.f454544b : null);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onBind, micTopic: ");
        sb6.append((java.lang.Object) (textView != null ? textView.getText() : null));
        com.tencent.mars.xlog.Log.i("FinderLiveMicTopicPanelWidget", sb6.toString());
    }

    public final void c() {
        android.view.View view = this.f318892e;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (kotlin.jvm.internal.o.b(view, this.f318892e)) {
            yz5.a aVar = this.f318895h;
            if (aVar != null) {
                aVar.invoke();
            }
            df2.u3 u3Var = (df2.u3) this.f318893f.getController(df2.u3.class);
            if (u3Var != null) {
                df2.h3[] h3VarArr = df2.h3.f230280d;
                u3Var.Z6(2, new lj2.m(this));
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/mic/widget/FinderLiveMicTopicPanelWidget", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
