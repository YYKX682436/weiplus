package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public final class hb implements gp1.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199157a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f199158b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f199159c;

    public hb(int i17, boolean z17, long j17) {
        this.f199157a = i17;
        this.f199158b = z17;
        this.f199159c = j17;
    }

    @Override // gp1.t
    public final void a(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FloatBallComponent", "onChattingResume fromScene: %d, canShowMessageFloatBall: %b, addMessageBallResult: %d", java.lang.Integer.valueOf(this.f199157a), java.lang.Boolean.valueOf(this.f199158b), java.lang.Integer.valueOf(i17));
        gp1.s Ai = ((ov.i0) ((pv.d0) i95.n0.c(pv.d0.class))).Ai();
        if (Ai != null) {
            Ai.a(this.f199159c, i17);
        }
    }
}
