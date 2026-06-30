package com.tencent.mm.plugin.topstory.ui.home;

/* loaded from: classes8.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.topstory.ui.home.y1 f175095d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wm4.y f175096e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.extension.reddot.jb f175097f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f175098g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f175099h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(com.tencent.mm.plugin.topstory.ui.home.y1 y1Var, wm4.y yVar, com.tencent.mm.plugin.finder.extension.reddot.jb jbVar, r45.f03 f03Var, android.view.View view) {
        super(0);
        this.f175095d = y1Var;
        this.f175096e = yVar;
        this.f175097f = jbVar;
        this.f175098g = f03Var;
        this.f175099h = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("popwindow onDismiss isClickOnBubbleTab:");
        com.tencent.mm.plugin.topstory.ui.home.y1 y1Var = this.f175095d;
        sb6.append(y1Var.f175114e);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStoryTabBubbleUIC", sb6.toString());
        boolean z17 = y1Var.f175114e;
        wm4.y yVar = this.f175096e;
        if (!z17) {
            yVar.a(1, "", this.f175097f, this.f175098g);
        }
        y1Var.f175113d = yVar;
        this.f175099h.postDelayed(new com.tencent.mm.plugin.topstory.ui.home.v1(y1Var), 250L);
        return jz5.f0.f302826a;
    }
}
