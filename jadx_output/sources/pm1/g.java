package pm1;

/* loaded from: classes14.dex */
public final class g extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pm1.o f356821d;

    public g(pm1.o oVar) {
        this.f356821d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pm1.o oVar = this.f356821d;
        android.media.AudioManager audioManager = oVar.f356835g;
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        oVar.f356832d = java.lang.Boolean.valueOf(audioManager.isBluetoothA2dpOn());
        com.tencent.mars.xlog.Log.i(oVar.f356829a, "isBluetoothA2dpOn = " + oVar.f356832d);
    }
}
