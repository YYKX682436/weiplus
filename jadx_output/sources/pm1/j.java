package pm1;

/* loaded from: classes14.dex */
public final class j extends wu5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pm1.o f356824d;

    public j(pm1.o oVar) {
        this.f356824d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        pm1.o oVar = this.f356824d;
        android.media.AudioManager audioManager = oVar.f356835g;
        kotlin.jvm.internal.o.g(audioManager, "audioManager");
        oVar.f356830b = java.lang.Boolean.valueOf(audioManager.isSpeakerphoneOn());
        com.tencent.mars.xlog.Log.i(oVar.f356829a, "isSpeakerphoneOn = " + oVar.f356830b);
    }
}
