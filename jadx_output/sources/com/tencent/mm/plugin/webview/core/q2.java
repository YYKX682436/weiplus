package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class q2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.core.e3 f181912d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(com.tencent.mm.plugin.webview.core.e3 e3Var) {
        super(0);
        this.f181912d = e3Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.add("file:///android_asset/");
        java.lang.String h17 = lp0.b.h();
        hashSet.add("file://".concat(((uv4.b) com.tencent.mm.plugin.websearch.l2.g(0)).o()));
        hashSet.add("file://" + com.tencent.mm.plugin.websearch.l2.g(3).l());
        hashSet.add("file://" + com.tencent.mm.plugin.websearch.l2.g(4).h());
        hashSet.add("file://" + com.tencent.mm.plugin.websearch.l2.g(8).h());
        hashSet.add("file://" + com.tencent.mm.plugin.websearch.l2.g(11).h());
        com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(h17, "emoji/res");
        hashSet.add("file://" + r6Var.o());
        hashSet.add("file://" + lp0.b.X() + "files/liteapp/pkg");
        com.tencent.mm.vfs.r6 r6Var2 = new com.tencent.mm.vfs.r6(lp0.b.D(), "emoji/res");
        hashSet.add("file://" + r6Var2.o());
        com.tencent.mm.plugin.webview.core.e3 e3Var = this.f181912d;
        com.tencent.mars.xlog.Log.i(e3Var.o1(), "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", r6Var.o(), r6Var2.o());
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) it.next();
            com.tencent.mars.xlog.Log.i(e3Var.o1(), "albie: WebViewUI white list path : " + str);
        }
        return hashSet;
    }
}
