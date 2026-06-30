package ll3;

@j95.b(dependencies = {bl3.e.class, c42.i.class})
/* loaded from: classes11.dex */
public class o2 extends i95.w implements cl3.e {

    /* renamed from: d, reason: collision with root package name */
    public ql3.b f319205d;

    /* renamed from: e, reason: collision with root package name */
    public ql3.d f319206e;

    public static ql3.b Ai() {
        if (wi().f319205d == null) {
            wi().f319205d = new ql3.b(gm0.j1.u().f273153f);
        }
        return wi().f319205d;
    }

    public static ql3.d Bi() {
        if (wi().f319206e == null) {
            wi().f319206e = new ql3.d(gm0.j1.u().f273153f);
        }
        return wi().f319206e;
    }

    public static ll3.o2 wi() {
        return (ll3.o2) i95.n0.c(ll3.o2.class);
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        kl3.e eVar = kl3.t.g().f308844e;
        ((kl3.o) eVar).f308836a = kl3.t.f308843g;
        eVar.init();
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        synchronized (kl3.t.class) {
            kl3.t tVar = kl3.t.f308843g;
            if (tVar != null) {
                tVar.i();
            }
        }
        if (sl3.b.f409252b == null) {
            synchronized (sl3.b.class) {
                if (sl3.b.f409252b == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerCoreService", "create");
                    sl3.b.f409252b = new sl3.b(null);
                }
            }
        }
        sl3.b.f409252b.f409253a.remove(kl3.i.class);
        this.f319205d = null;
        this.f319206e = null;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kl3.z zVar = new kl3.z();
        synchronized (kl3.t.class) {
            if (kl3.t.f308843g != null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Music.MusicPlayerManager", "music player mgr is init, don't it again");
                kl3.t.f308843g.f308844e = zVar;
            } else {
                kl3.t.f308843g = new kl3.t(zVar);
            }
        }
        sl3.b.a(kl3.i.class, zVar);
        sl3.b.a(kl3.h.class, new pl3.e());
    }
}
