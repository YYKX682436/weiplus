package mb1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f325297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb1.d f325298e;

    public c(mb1.d dVar, int i17) {
        this.f325298e = dVar;
        this.f325297d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Ble.ConnectAction", "close", new java.lang.Object[0]);
        mb1.d dVar = this.f325298e;
        dVar.f343986a.k(false);
        dVar.p(new ob1.m(com.tencent.thumbplayer.tmediacodec.codec.CodecError.CONFIG_SURFACE_NULL, "fail:connection fail status:" + this.f325297d, jc1.c.I, null));
        dVar.m();
    }
}
