package sl;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sl.g f409023d;

    public f(sl.g gVar) {
        this.f409023d = gVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sl.g gVar = this.f409023d;
        if (gVar.f409024d.f409025d.f409026a.f409043p == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SceneVoicePlayer", "intOnCompletion is null!!!");
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.SceneVoicePlayer", "intOnCompletion onCompletion()");
            gVar.f409024d.f409025d.f409026a.f409043p.onCompletion();
        }
    }
}
