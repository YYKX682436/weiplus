package ml;

/* loaded from: classes13.dex */
public class c implements ml.h {

    /* renamed from: a, reason: collision with root package name */
    public boolean f327172a = false;

    /* renamed from: b, reason: collision with root package name */
    public volatile boolean f327173b = true;

    /* renamed from: c, reason: collision with root package name */
    public ml.f f327174c;

    /* renamed from: d, reason: collision with root package name */
    public n01.b f327175d;

    public c(ml.f fVar) {
        this.f327174c = fVar;
    }

    public void a(ml.d dVar) {
        android.os.Handler handler;
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(this.f327172a)};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioDownloadProcess", "download process end, download finish:%b", objArr);
        if (ml.e.f327179e == null) {
            synchronized (ml.e.class) {
                if (ml.e.f327179e == null) {
                    ml.e.f327179e = new ml.e();
                }
            }
        }
        ml.e eVar = ml.e.f327179e;
        synchronized (eVar.f327180a) {
            eVar.f327182c.remove(dVar);
            if (eVar.f327182c.size() <= 4) {
                eVar.f327183d = 4;
                eVar.a(4);
            }
        }
        eVar.f327181b.remove(dVar);
        if (this.f327172a) {
            ml.f fVar = this.f327174c;
            if (fVar != null) {
                n01.b bVar = this.f327175d;
                ml.a aVar = (ml.a) fVar;
                java.lang.String str = "";
                synchronized (aVar.f327166a.f327170d) {
                    if (bVar != null) {
                        aVar.f327166a.f327167a.remove(bVar.f333837b);
                        str = bVar.f333837b;
                        aVar.f327166a.f327169c.add(bVar.f333837b);
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioDownloadMgr", "download finish, src:%s", str);
                ml.g gVar = aVar.f327166a.f327171e;
                if (gVar != null) {
                    dl3.s sVar = (dl3.s) gVar;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "loadCache audio:%s", bVar.f333836a);
                    java.lang.String str2 = bVar.f333836a;
                    dl3.i iVar = sVar.f235345a;
                    n01.b n17 = iVar.n(str2);
                    boolean z17 = (n17 == null || android.text.TextUtils.isEmpty(n17.f333838c) || !iVar.B.e(n17.f333838c)) ? false : true;
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerMgr", "cached:%b", java.lang.Boolean.valueOf(z17));
                    if (!z17 && (handler = iVar.f235307J) != null) {
                        handler.post(new dl3.r(sVar, bVar));
                    }
                }
            }
        } else {
            ml.f fVar2 = this.f327174c;
            if (fVar2 != null) {
                ((ml.a) fVar2).a(this.f327175d);
            }
        }
        this.f327173b = true;
        dVar.f327178i = null;
        this.f327174c = null;
    }
}
