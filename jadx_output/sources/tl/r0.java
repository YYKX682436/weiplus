package tl;

/* loaded from: classes12.dex */
public class r0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tl.s0 f420108d;

    public r0(tl.s0 s0Var) {
        this.f420108d = s0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoiceService", "onSceneEnd fin and try run");
        this.f420108d.f420118g.e();
    }
}
