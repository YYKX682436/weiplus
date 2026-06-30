package com.tencent.mm.ui.chatting.adapter;

/* loaded from: classes12.dex */
public class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.w f198440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f198441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.adapter.a0 f198442f;

    public s(com.tencent.mm.ui.chatting.adapter.a0 a0Var, com.tencent.mm.ui.chatting.adapter.w wVar, int i17) {
        this.f198442f = a0Var;
        this.f198440d = wVar;
        this.f198441e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f198440d.f198446a.endsWith("hd")) {
            return;
        }
        boolean z17 = true;
        if (!((a80.b) ((xs.w0) i95.n0.c(xs.w0.class))).mj(this.f198440d.f198447b, null)) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            if (m11.b1.Di().b2(this.f198440d.f198447b.Q0(), this.f198440d.f198447b.I0()).f322651s != 1) {
                z17 = false;
            }
        }
        if (z17) {
            ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
            if (m11.b1.Di().z0(this.f198440d.f198447b, com.tencent.mm.R.drawable.bzt, 0, -1)) {
                mt1.b0.f331191a.r(this.f198440d.f198447b.getMsgId(), this.f198440d.f198447b.Q0());
                ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.adapter.r(this));
            }
        }
    }
}
