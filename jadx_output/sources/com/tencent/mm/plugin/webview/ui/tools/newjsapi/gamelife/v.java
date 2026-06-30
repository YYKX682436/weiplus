package com.tencent.mm.plugin.webview.ui.tools.newjsapi.gamelife;

/* loaded from: classes8.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f186200d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.util.LinkedList linkedList) {
        super(1);
        this.f186200d = linkedList;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean z17;
        java.lang.String username = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(username, "username");
        if (com.tencent.mm.storage.z3.Z3(username)) {
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("GameLife.PluginGameLife", "check username failed");
            z17 = false;
        }
        if (z17) {
            this.f186200d.add(username);
        }
        return jz5.f0.f302826a;
    }
}
