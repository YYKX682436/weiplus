package pm1;

/* loaded from: classes14.dex */
public final class k extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pm1.o f356825d;

    public k(pm1.o oVar) {
        this.f356825d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pm1.o oVar = this.f356825d;
        android.media.AudioManager audioManager = oVar.f356835g;
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        oVar.f356833e = java.lang.Boolean.valueOf(audioManager.isWiredHeadsetOn());
        com.tencent.mars.xlog.Log.i(oVar.f356829a, "isWiredHeadsetOn = " + oVar.f356833e);
    }
}
