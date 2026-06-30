package cw2;

/* loaded from: classes2.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw2.b0 f223552d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f223553e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f223554f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ float f223555g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f223556h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener f223557i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(cw2.b0 b0Var, long j17, int i17, float f17, boolean z17, com.tencent.thumbplayer.api.ITPPlayerListener.IOnSeekCompleteListener iOnSeekCompleteListener) {
        super(0);
        this.f223552d = b0Var;
        this.f223553e = j17;
        this.f223554f = i17;
        this.f223555g = f17;
        this.f223556h = z17;
        this.f223557i = iOnSeekCompleteListener;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        cw2.b0 b0Var = this.f223552d;
        java.lang.String str = b0Var.f223580c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setStartPlayTime time:");
        long j17 = this.f223553e;
        sb6.append(j17);
        sb6.append(", ");
        int i17 = this.f223554f;
        sb6.append(i17);
        sb6.append(", ");
        float f17 = this.f223555g;
        sb6.append(f17);
        sb6.append(", ");
        sb6.append(this.f223556h);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = b0Var.f223578a;
        cw2.da videoView = finderVideoLayout.getVideoView();
        com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy finderThumbPlayerProxy = videoView instanceof com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy ? (com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) videoView : null;
        if (finderThumbPlayerProxy != null) {
            finderThumbPlayerProxy.setOnSeekCompleteListener(new cw2.z(b0Var, this.f223557i));
        }
        if (kotlin.jvm.internal.o.b(b0Var.a(b0Var.f223578a.getVideoView(), this.f223553e, this.f223556h, this.f223554f), java.lang.Boolean.TRUE)) {
            b0Var.b(f17);
            bb2.y2 bulletLifecycle = finderVideoLayout.getBulletLifecycle();
            if (bulletLifecycle != null) {
                bb2.y2.r(bulletLifecycle, (int) (j17 / 1000), false, 2, null);
            }
        } else {
            b0Var.f223587j = j17;
            b0Var.f223588k = i17;
            b0Var.f223589l = f17;
        }
        return jz5.f0.f302826a;
    }
}
