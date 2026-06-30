package ik4;

/* loaded from: classes4.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public static final ik4.l f291941a = new ik4.l();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.HashSet f291942b = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashSet f291943c = new java.util.HashSet();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashMap f291944d = new java.util.HashMap();

    /* JADX WARN: Removed duplicated region for block: B:19:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(android.content.Context r21, java.lang.String r22, java.lang.Object r23, boolean r24, boolean r25, kotlin.coroutines.Continuation r26) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ik4.l.a(android.content.Context, java.lang.String, java.lang.Object, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(ik4.g gVar, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TPFlexiblePlayerManager", "initPlayer");
        gVar.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(147, ck4.a.f42529c));
        gVar.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(102, ck4.a.f42530d));
        gVar.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildLong(148, ck4.a.f42531e));
        gVar.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildBoolean(445, z17));
        gVar.setPlayerOptionalParam(new com.tencent.thumbplayer.api.TPOptionalParam().buildString(452, "assets/shaders"));
        gVar.setLoopback(true);
    }

    public final void c(ik4.g gVar, boolean z17) {
        if (gVar == null) {
            return;
        }
        gVar.setOnInfoListener(null);
        gVar.setOnPreparedListener(null);
        gVar.f291923r = kotlinx.coroutines.l.d(kotlinx.coroutines.z0.b(), kotlinx.coroutines.q1.f310568a, null, new ik4.k(gVar, null), 2, null);
        if (z17) {
            return;
        }
        pm0.v.O("MicroMsg.TPFlexiblePlayerManager_release", new ik4.j(gVar));
    }
}
