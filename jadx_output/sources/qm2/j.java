package qm2;

/* loaded from: classes3.dex */
public final class j extends com.tencent.mm.network.b1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qm2.k f364731d;

    public j(qm2.k kVar) {
        this.f364731d = kVar;
    }

    @Override // com.tencent.mm.network.c1
    public void Za(boolean z17, float f17, float f18, boolean z18, int i17, int i18, int i19, boolean z19, int i27, int i28, int i29) {
        com.tencent.mars.xlog.Log.i("FinderStartLiveNetSpeedTestUIC", "onSpeedTestDone rttSuccessful:" + z17 + " rtt:" + f17 + " jitter:" + f18 + " uploadSuccessful:" + z18 + " aveUpSpeed:" + i17 + " minUpSpeed:" + i18 + " maxUpSpeed:" + i19 + " downloadSuccessful:" + z19 + " aveDownSpeed:" + i27 + " minDownSpeed:" + i28 + " maxDownSpeed:" + i29);
        pm0.v.X(new qm2.i(this.f364731d, z17, f17, f18, z18, i17, z19, i27));
    }

    @Override // com.tencent.mm.network.c1
    public void le(boolean z17, float f17, float f18, boolean z18, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("FinderStartLiveNetSpeedTestUIC", "onUploadAndRttDone rttSuccessful:" + z17 + " rtt:" + f17 + " jitter:" + f18 + " uploadSuccessful:" + z18 + " aveSpeed:" + i17 + " minSpeed:" + i18 + " maxSpeed:" + i19);
    }
}
