package com.tencent.mm.plugin.webview.ui.tools.video.samelayer.finder;

/* loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nw4.k f186999d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f187000e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(nw4.k kVar, nw4.y2 y2Var) {
        super(1);
        this.f186999d = kVar;
        this.f187000e = y2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCVoid it = (com.tencent.mm.ipcinvoker.type.IPCVoid) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewVideoFinderActionHandler", "operateFinderVideo callback");
        nw4.g gVar = this.f186999d.f340863d;
        nw4.y2 y2Var = this.f187000e;
        gVar.e(y2Var.f341013c, y2Var.f341019i + ":ok", null);
        return jz5.f0.f302826a;
    }
}
