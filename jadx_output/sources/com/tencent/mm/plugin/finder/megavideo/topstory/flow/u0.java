package com.tencent.mm.plugin.finder.megavideo.topstory.flow;

/* loaded from: classes10.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.megavideo.topstory.flow.w0 f121019d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(com.tencent.mm.plugin.finder.megavideo.topstory.flow.w0 w0Var) {
        super(0);
        this.f121019d = w0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.megavideo.topstory.flow.q0 f17 = this.f121019d.f();
        synchronized (f17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MegaVideoFlutterTabLifeCycle", "onEngineCreateDone isTabShow:" + f17.f120996i + ", queue size:" + ((java.util.ArrayList) f17.f120995h).size());
            f17.f120994g = true;
            if (((java.util.ArrayList) f17.f120995h).isEmpty()) {
                f17.f120993f.f(androidx.lifecycle.m.ON_CREATE);
            } else {
                java.util.Iterator it = ((java.util.ArrayList) f17.f120995h).iterator();
                while (it.hasNext()) {
                    ((yz5.a) it.next()).invoke();
                }
            }
            synchronized (f17) {
                ((java.util.ArrayList) f17.f120995h).clear();
            }
            return jz5.f0.f302826a;
        }
        return jz5.f0.f302826a;
    }
}
