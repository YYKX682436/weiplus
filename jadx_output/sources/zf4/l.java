package zf4;

@j95.b
/* loaded from: classes13.dex */
public class l extends i95.w implements c01.t8, ct.i3 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.HashMap f472671i;

    /* renamed from: d, reason: collision with root package name */
    public zf4.b0 f472672d;

    /* renamed from: e, reason: collision with root package name */
    public x51.k0 f472673e;

    /* renamed from: f, reason: collision with root package name */
    public zf4.a0 f472674f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f472675g = new java.util.ArrayList();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f472676h = new java.util.HashSet();

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f472671i = hashMap;
        hashMap.put(1875231238, new zf4.k());
    }

    public static zf4.a0 Ai() {
        gm0.j1.b().c();
        if (wi().f472674f == null) {
            wi().f472674f = new zf4.a0();
        }
        return wi().f472674f;
    }

    public static zf4.b0 Bi() {
        gm0.j1.b().c();
        if (wi().f472672d == null) {
            zf4.l wi6 = wi();
            wi();
            if (wi().f472673e == null) {
                wi().f472673e = x51.l0.a(zf4.l.class.hashCode(), gm0.j1.u().h() + "CommonOneMicroMsg.db", f472671i, false, true);
            }
            wi6.f472672d = new zf4.b0(wi().f472673e);
        }
        return wi().f472672d;
    }

    public static zf4.l wi() {
        return (zf4.l) i95.n0.c(zf4.l.class);
    }

    public final void Di(android.content.Context context, java.lang.String str, boolean z17) {
        android.net.Uri defaultUri = str == null ? android.media.RingtoneManager.getDefaultUri(2) : z17 ? com.tencent.mm.sdk.platformtools.i1.b(context, com.tencent.mm.vfs.r6.j(new java.io.File(str))) : android.net.Uri.parse(str);
        to.g gVar = new to.g();
        try {
            gVar.setDataSource(context, defaultUri);
            gVar.setOnCompletionListener(new zf4.j(this));
            if (ym1.f.Di(5) != 0) {
                if (ym1.f.Ri()) {
                    int Di = ym1.f.Di(8);
                    ym1.e eVar = ym1.f.f463134h;
                    int g17 = eVar.b().g(8);
                    int Di2 = ym1.f.Di(5);
                    if (Di2 <= g17) {
                        g17 = Di2;
                    }
                    eVar.b().z(8, g17, 0);
                    gVar.setAudioStreamType(8);
                    gVar.setLooping(true);
                    gVar.prepare();
                    gVar.setLooping(false);
                    gVar.start();
                    eVar.b().z(8, Di, 0);
                } else {
                    gVar.setAudioStreamType(5);
                    gVar.setLooping(true);
                    gVar.prepare();
                    gVar.setLooping(false);
                    gVar.start();
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", e17, "", new java.lang.Object[0]);
            try {
                gVar.release();
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SubCoreVoiceRemind", th6, "relese error", new java.lang.Object[0]);
            }
        }
    }

    public void Ni(java.lang.String str) {
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).b0(str);
        java.util.List list = this.f472675g;
        ((java.util.ArrayList) list).clear();
        android.database.Cursor b37 = ((com.tencent.mm.storage.g9) c01.d9.b().u()).b3(str);
        b37.moveToFirst();
        while (!b37.isAfterLast()) {
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.convertFrom(b37);
            long msgId = f9Var.getMsgId();
            b37.moveToNext();
            ((java.util.ArrayList) list).add(java.lang.Long.valueOf(msgId));
        }
        b37.close();
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).Mb(str);
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        zf4.a0 a0Var = this.f472674f;
        if (a0Var != null) {
            a0Var.f472642m = 0;
        }
    }
}
