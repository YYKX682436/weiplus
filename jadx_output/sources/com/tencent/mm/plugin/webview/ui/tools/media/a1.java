package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes11.dex */
public final class a1 extends com.tencent.unit_rc.BaseObject implements b66.r {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f185741d;

    /* renamed from: e, reason: collision with root package name */
    public int f185742e;

    public a1(java.lang.String standaloneId) {
        kotlin.jvm.internal.o.g(standaloneId, "standaloneId");
        this.f185741d = standaloneId;
        this.f185742e = -1;
    }

    @Override // b66.r
    public void G2() {
    }

    @Override // b66.r
    public void bd(int i17, b66.a aVar, bw5.kq0 kq0Var, int i18) {
    }

    @Override // b66.r
    public void fd(bw5.kq0 kq0Var, bw5.pq0 state, bw5.lq0 event, bw5.mq0 mq0Var) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(event, "event");
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.plugin.webview.ui.tools.media.z0(this, kq0Var, state, event, mq0Var));
    }

    @Override // b66.r
    public void h5(b66.a aVar, b66.a aVar2) {
    }

    @Override // b66.r
    public void m0(bw5.kq0 kq0Var) {
    }

    @Override // b66.r
    public void s0(byte[] context, bw5.iq0 event, byte[] info) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(info, "info");
    }
}
