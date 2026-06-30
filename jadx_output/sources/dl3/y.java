package dl3;

/* loaded from: classes13.dex */
public class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dl3.a0 f235351d;

    public y(dl3.a0 a0Var) {
        this.f235351d = a0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        this.f235351d.f235273e.getClass();
        if (gl3.e.d()) {
            ((ml3.e) ((gl3.c) sl3.b.b(gl3.c.class))).getClass();
            z17 = com.tencent.mm.plugin.music.model.cache.ipc.n.i();
        } else {
            com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicDataStorageImpl", "IMusicDataStorage service not exist");
            z17 = false;
        }
        if (z17) {
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            dp.a.makeText(context, context.getString(com.tencent.mm.R.string.h3v), 0).show();
        }
    }
}
