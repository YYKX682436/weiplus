package pm1;

/* loaded from: classes14.dex */
public final class h extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pm1.o f356822d;

    public h(pm1.o oVar) {
        this.f356822d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pm1.o oVar = this.f356822d;
        android.media.AudioManager audioManager = oVar.f356835g;
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        oVar.f356831c = java.lang.Boolean.valueOf(audioManager.isBluetoothScoOn());
        com.tencent.mars.xlog.Log.i(oVar.f356829a, "isBluetoothScoOn = " + oVar.f356831c);
    }
}
