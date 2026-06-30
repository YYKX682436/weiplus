package com.tencent.mm.plugin.topstory.ui.uic;

/* loaded from: classes8.dex */
public final class TopStorySearchUIC extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f175122d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC$searchIconVisibilityListener$1 f175123e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC$homePageSearchResultChangedListener$1 f175124f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f175125g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v2, types: [com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC$searchIconVisibilityListener$1] */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC$homePageSearchResultChangedListener$1] */
    public TopStorySearchUIC(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f175122d = jz5.h.b(new en4.i(activity));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f175123e = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.UpdateSearchIconVisibilityEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC$searchIconVisibilityListener$1
            {
                this.__eventId = -855851730;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.UpdateSearchIconVisibilityEvent updateSearchIconVisibilityEvent) {
                com.tencent.mm.autogen.events.UpdateSearchIconVisibilityEvent event = updateSearchIconVisibilityEvent;
                kotlin.jvm.internal.o.g(event, "event");
                event.f54923g.getClass();
                throw null;
            }
        };
        this.f175124f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HomePageSearchResultChangedEvent>(this, a0Var) { // from class: com.tencent.mm.plugin.topstory.ui.uic.TopStorySearchUIC$homePageSearchResultChangedListener$1
            {
                this.__eventId = -1200661207;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HomePageSearchResultChangedEvent homePageSearchResultChangedEvent) {
                com.tencent.mm.autogen.events.HomePageSearchResultChangedEvent event = homePageSearchResultChangedEvent;
                kotlin.jvm.internal.o.g(event, "event");
                event.f54437g.getClass();
                throw null;
            }
        };
    }

    public final void T6(boolean z17) {
        ((com.tencent.mm.plugin.topstory.ui.home.j) ((jz5.n) this.f175122d).getValue()).h();
        com.tencent.mars.xlog.Log.isDebug();
        if (this.f175125g) {
            this.f175125g = false;
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.ogi);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        findViewById.setContentDescription(getString(com.tencent.mm.R.string.cvh));
        findViewById.setOnClickListener(new en4.g(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/uic/TopStorySearchUIC", "handleSearchButtonVisibility", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/topstory/ui/uic/TopStorySearchUIC", "handleSearchButtonVisibility", "(ZZ)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        alive();
        alive();
        R6(new en4.h(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        dead();
        dead();
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
    }
}
