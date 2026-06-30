package ml;

/* loaded from: classes13.dex */
public class a implements ml.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ml.b f327166a;

    public a(ml.b bVar) {
        this.f327166a = bVar;
    }

    public void a(n01.b bVar) {
        java.lang.String str = "";
        synchronized (this.f327166a.f327170d) {
            if (bVar != null) {
                this.f327166a.f327167a.remove(bVar.f333837b);
                str = bVar.f333837b;
            }
        }
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.e("MicroMsg.Audio.AudioDownloadMgr", "download fail, src:%s", str);
    }
}
