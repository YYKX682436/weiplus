package ih1;

/* loaded from: classes7.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f291493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ih1.u f291494e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ih1.m f291495f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f291496g;

    public h(java.lang.String str, ih1.u uVar, ih1.m mVar, int i17) {
        this.f291493d = str;
        this.f291494e = uVar;
        this.f291495f = mVar;
        this.f291496g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i17 = mq0.c0.T0;
            java.lang.String frameSetName = this.f291493d;
            kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
            if (frameSetName.length() == 0) {
                frameSetName = "";
            } else {
                java.util.List f07 = r26.n0.f0(frameSetName, new java.lang.String[]{"_"}, false, 0, 6, null);
                if (f07.size() >= 3) {
                    frameSetName = (java.lang.String) f07.get(1);
                }
            }
            java.lang.String str = frameSetName;
            mq0.c0 c0Var = (mq0.c0) i95.n0.c(mq0.c0.class);
            if (c0Var != null) {
                mq0.c0.Xa(c0Var, mq0.z.f330636g, "MagicAdMiniProgram", "RewardAd", str, this.f291493d, mq0.a0.f330532e, null, kz5.b1.e(new jz5.l("appId", this.f291494e.f291530a)), 64, null);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MBADFullLinkReporter", "[MBAd] report ViewStay1s failed", e17);
        }
        this.f291495f.f291512f.remove(java.lang.Integer.valueOf(this.f291496g));
    }
}
