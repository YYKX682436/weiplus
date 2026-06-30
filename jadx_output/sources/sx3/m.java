package sx3;

/* loaded from: classes10.dex */
public final class m extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f413565d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f413566e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f413567f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.view.recyclerview.WxRecyclerAdapter f413568g;

    /* renamed from: h, reason: collision with root package name */
    public final androidx.recyclerview.widget.LinearLayoutManager f413569h;

    /* renamed from: i, reason: collision with root package name */
    public final sx3.l f413570i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f413565d = jz5.h.b(new sx3.g(this));
        this.f413566e = jz5.h.b(new sx3.e(this));
        this.f413567f = jz5.h.b(new sx3.f(this));
        this.f413569h = new androidx.recyclerview.widget.LinearLayoutManager(activity, 1, false);
        this.f413570i = new sx3.l(this, activity);
    }

    public final com.tencent.mm.view.refreshLayout.WxRefreshLayout O6() {
        java.lang.Object value = ((jz5.n) this.f413566e).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.refreshLayout.WxRefreshLayout) value;
    }

    public final com.tencent.mm.view.recyclerview.WxRecyclerView P6() {
        java.lang.Object value = ((jz5.n) this.f413567f).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        return (com.tencent.mm.view.recyclerview.WxRecyclerView) value;
    }

    public final void Q6() {
        java.lang.Object value = ((jz5.n) this.f413565d).getValue();
        kotlin.jvm.internal.o.f(value, "getValue(...)");
        android.view.View view = (android.view.View) value;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/ringtone/history/RingtoneHistoryInfo", "showNoResultView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        P6().setVisibility(8);
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        ((com.tencent.mm.plugin.ringtone.uic.c3) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.ringtone.uic.c3.class)).f158374f = 3;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        O6().setOnSimpleAction(new sx3.h(this));
        P6().setLayoutManager(this.f413569h);
        P6().setItemViewCacheSize(10);
        P6().N(new cy3.r(getActivity()));
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        pf5.z zVar = pf5.z.f353948a;
        java.lang.Object a17 = zVar.a(activity).a(com.tencent.mm.plugin.ringtone.uic.v.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter n66 = ed0.r0.n6((ed0.r0) a17, false, 1, null);
        this.f413568g = n66;
        n66.f293104n = new sx3.j(this);
        n66.F = this.f413570i;
        P6().setAdapter(this.f413568g);
        android.content.ComponentCallbacks2 context = getContext();
        androidx.lifecycle.y yVar = context instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) context : null;
        if (yVar != null) {
            androidx.appcompat.app.AppCompatActivity activity2 = getActivity();
            kotlin.jvm.internal.o.g(activity2, "activity");
            ((sx3.b) zVar.a(activity2).a(sx3.b.class)).f413546d.observe(yVar, new sx3.d(this));
        }
        O6().getCommonConfig().f330206p = true;
        O6().getCommonConfig().f330207q = false;
        O6().setRefreshingState(false);
    }
}
