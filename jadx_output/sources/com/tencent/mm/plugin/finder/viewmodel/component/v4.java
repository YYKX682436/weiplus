package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class v4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f136203d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f136204e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v4(in5.s0 s0Var, long j17) {
        super(0);
        this.f136203d = s0Var;
        this.f136204e = j17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cw2.da videoView = ((com.tencent.mm.plugin.finder.video.FinderVideoLayout) this.f136203d.p(com.tencent.mm.R.id.e_k)).getVideoView();
        if (videoView != null) {
            videoView.r(((float) this.f136204e) / 1000.0f, true, 3);
        }
        return jz5.f0.f302826a;
    }
}
