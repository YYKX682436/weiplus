package za3;

/* loaded from: classes14.dex */
public class j1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.VolumeMeter f470968d;

    public j1(com.tencent.mm.plugin.location.ui.VolumeMeter volumeMeter) {
        this.f470968d = volumeMeter;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.sdk.platformtools.n3 n3Var = new com.tencent.mm.sdk.platformtools.n3();
        com.tencent.mm.plugin.location.ui.VolumeMeter volumeMeter = this.f470968d;
        volumeMeter.f144680n = n3Var;
        n3Var.post(volumeMeter);
    }
}
