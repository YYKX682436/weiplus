package za3;

/* loaded from: classes14.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.VolumeMeter f470972d;

    public k1(com.tencent.mm.plugin.location.ui.VolumeMeter volumeMeter) {
        this.f470972d = volumeMeter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.location.ui.VolumeMeter volumeMeter = this.f470972d;
        volumeMeter.f144674e = true;
        volumeMeter.f144673d = false;
        com.tencent.mm.sdk.platformtools.n3 n3Var = volumeMeter.f144680n;
        if (n3Var != null) {
            n3Var.getSerial().f457303b.g();
            volumeMeter.f144680n = null;
        }
    }
}
