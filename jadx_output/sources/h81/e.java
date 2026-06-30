package h81;

/* loaded from: classes10.dex */
public class e extends bi3.l {

    /* renamed from: b, reason: collision with root package name */
    public ei3.m f279525b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.modelcontrol.VideoTransPara f279526c;

    @Override // bi3.l
    public ei3.m a() {
        ei3.m k0Var;
        ei3.m mVar;
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = this.f279526c;
        if (videoTransPara != null) {
            int i17 = di3.w.f232770d.f232700a;
            if (i17 == 1) {
                k0Var = new ei3.k0(videoTransPara);
            } else if (i17 != 2) {
                mVar = null;
                this.f279525b = mVar;
            } else {
                k0Var = new ei3.w0(videoTransPara);
            }
            mVar = k0Var;
            this.f279525b = mVar;
        }
        ei3.m mVar2 = this.f279525b;
        if (mVar2 instanceof ei3.k0) {
            ei3.k0 k0Var2 = (ei3.k0) mVar2;
            k0Var2.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightFFMpegRecorder", "setStopOnCameraDataThread: %s", java.lang.Boolean.TRUE);
            k0Var2.f253070J = true;
        }
        return this.f279525b;
    }
}
