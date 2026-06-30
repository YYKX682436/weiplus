package z21;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z21.z f469570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ z21.h f469571e;

    public f(z21.h hVar, z21.z zVar) {
        this.f469571e = hVar;
        this.f469570d = zVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        z21.z zVar = this.f469570d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "real doLastScene voiceId:%s, voiceFileMarkEnd:%s,hashCode:%s", zVar.f469702a, java.lang.Integer.valueOf(zVar.f469705d), java.lang.Integer.valueOf(this.f469571e.hashCode()));
        com.tencent.mm.network.s dispatcher = this.f469571e.dispatcher();
        if (dispatcher != null) {
            z21.h hVar = this.f469571e;
            hVar.doScene(dispatcher, hVar.f469576d);
        }
    }
}
