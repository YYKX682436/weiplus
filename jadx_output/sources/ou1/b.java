package ou1;

/* loaded from: classes5.dex */
public final class b extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f348916m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f348917n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScreenCastEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ScreenCastEvent>(a0Var) { // from class: com.tencent.mm.plugin.cast.banner.ScreenCastBanner$_initialize$1
            {
                this.__eventId = 949107551;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.ScreenCastEvent screenCastEvent) {
                com.tencent.mm.autogen.events.ScreenCastEvent event = screenCastEvent;
                kotlin.jvm.internal.o.g(event, "event");
                boolean z17 = event.f54742g.f6706a;
                ou1.b bVar = ou1.b.this;
                if (z17) {
                    bVar.f();
                    bVar.k(0);
                } else {
                    bVar.k(8);
                }
                return false;
            }
        };
        this.f348917n = iListener;
        iListener.alive();
    }

    @Override // s35.b
    public void a() {
        com.tencent.mm.sdk.event.IListener iListener = this.f348917n;
        if (iListener != null) {
            iListener.dead();
        }
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.f488376rn;
    }

    @Override // s35.b
    public int c() {
        return 5;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        if (view != null) {
            this.f348916m = view.findViewById(com.tencent.mm.R.id.bd8);
            view.setOnClickListener(ou1.a.f348915d);
        }
        k(8);
    }

    @Override // s35.b
    public void k(int i17) {
        super.k(i17);
        if (!this.f402844i) {
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.ScreenCastBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.view.View findViewById = this.f402843h.findViewById(com.tencent.mm.R.id.bd8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/cast/banner/ScreenCastBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/cast/banner/ScreenCastBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
