package com.tencent.mm.ui.conversation.banner;

/* loaded from: classes5.dex */
public class q0 extends s35.b {

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f207564m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.ImageView f207565n;

    /* renamed from: o, reason: collision with root package name */
    public android.view.View f207566o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f207567p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.sdk.event.IListener f207568q;

    public q0(android.content.Context context) {
        super(context);
        this.f207566o = null;
        this.f207567p = false;
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.InitEndEvent> iListener = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.InitEndEvent>(a0Var) { // from class: com.tencent.mm.ui.conversation.banner.TryNewInitBanner$1
            {
                this.__eventId = -1671484961;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.InitEndEvent initEndEvent) {
                boolean z17 = initEndEvent.f54441g.f7712a;
                com.tencent.mm.ui.conversation.banner.q0 q0Var = com.tencent.mm.ui.conversation.banner.q0.this;
                if (z17) {
                    q0Var.f207567p = false;
                    q0Var.i();
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TryNewInitBanner", "summerinit onSceneEnd -1 show tryNewInitBanner[%s]", q0Var);
                    q0Var.f207567p = true;
                    q0Var.i();
                }
                return false;
            }
        };
        this.f207568q = iListener;
        iListener.alive();
    }

    @Override // s35.b
    public void a() {
        this.f207568q.dead();
    }

    @Override // s35.b
    public int b() {
        return com.tencent.mm.R.layout.d2e;
    }

    @Override // s35.b
    public void h(android.view.View view) {
        if (view != null) {
            this.f207566o = view.findViewById(com.tencent.mm.R.id.ody);
            this.f207564m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.odw);
            this.f207565n = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.odx);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    @Override // s35.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean i() {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.conversation.banner.q0.i():boolean");
    }

    @Override // s35.b
    public void k(int i17) {
        if (!this.f402844i) {
            if (i17 == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TryNewInitBanner", "isViewInitialized() should not be false!");
                return;
            }
            return;
        }
        android.view.View view = this.f207566o;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/conversation/banner/TryNewInitBanner", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
