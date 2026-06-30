package i53;

/* loaded from: classes8.dex */
public class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288789d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f288790e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f288791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f288793h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f288794i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ i53.z2 f288795m;

    public y2(i53.z2 z2Var, java.lang.String str, long j17, boolean z17, java.lang.String str2, java.lang.String str3, int i17) {
        this.f288795m = z2Var;
        this.f288789d = str;
        this.f288790e = j17;
        this.f288791f = z17;
        this.f288792g = str2;
        this.f288793h = str3;
        this.f288794i = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        int i18;
        i53.u z07 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi().z0(this.f288789d);
        java.util.HashMap hashMap = new java.util.HashMap();
        if (z07 != null) {
            hashMap.put("type", java.lang.Integer.valueOf(i53.d3.a(this.f288795m.f288805a, z07.field_mediaType)));
            if (i53.d3.a(this.f288795m.f288805a, z07.field_mediaType) == 2) {
                hashMap.put("videoid", com.tencent.mm.vfs.w6.p(z07.field_filePath));
            }
        }
        hashMap.put("costtime", java.lang.Long.valueOf(this.f288790e));
        hashMap.put("origtime", java.lang.Integer.valueOf(z07.field_duration));
        hashMap.put("origsize", java.lang.Long.valueOf(z07.field_size));
        i53.x D0 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Ai().D0(this.f288795m.f288805a.f288547a);
        if (D0 != null) {
            hashMap.put("pushid", D0.field_taskId);
            i17 = D0.field_publishSource;
            i18 = D0.field_sourceSceneId;
        } else {
            i17 = 0;
            i18 = 0;
        }
        if (this.f288791f) {
            ((java.util.HashSet) this.f288795m.f288805a.f288553g).remove(this.f288789d);
            i53.w wi6 = ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).wi();
            java.lang.String str = this.f288789d;
            java.lang.String str2 = this.f288792g;
            java.lang.String str3 = this.f288793h;
            wi6.getClass();
            java.lang.String format = java.lang.String.format("update %s set %s=\"%s\", %s=\"%s\", %s=%d where %s=\"%s\"", "GameHaowanMedia", "mediaUrl", str2, "thumbPicUrl", str3, "uploadState", 2, dm.i4.COL_LOCALID, str);
            com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameHaowanPublishStorage", "updateMediaUrl, sql: " + format);
            wi6.execSQL("GameHaowanMedia", format);
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8764, 0, 48, i18, lj0.a.a(i17, hashMap));
        } else if (this.f288794i != -21006) {
            ((java.util.HashSet) this.f288795m.f288805a.f288553g).add(this.f288789d);
            hashMap.put("failid", java.lang.Integer.valueOf(this.f288794i));
            com.tencent.mm.game.report.l.c(com.tencent.mm.sdk.platformtools.x2.f193071a, 87, 8764, 0, 56, i18, lj0.a.a(i17, hashMap));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Haowan.GameUploadMediaEngine", "upload list size : %d, hasPushAllUpload: %b", java.lang.Integer.valueOf(((java.util.HashSet) this.f288795m.f288805a.f288552f).size()), java.lang.Boolean.valueOf(this.f288795m.f288805a.f288555i));
        if (((java.util.HashSet) this.f288795m.f288805a.f288552f).isEmpty()) {
            i53.d3 d3Var = this.f288795m.f288805a;
            if (d3Var.f288555i) {
                if (!((java.util.HashSet) d3Var.f288553g).isEmpty()) {
                    ((ku5.t0) ku5.t0.f312615d).k(this.f288795m.f288805a.f288558l, 60000L);
                } else {
                    i53.c3 c3Var = this.f288795m.f288805a.f288550d;
                    if (c3Var != null) {
                        ((i53.y) c3Var).a(true);
                    }
                }
            }
        }
    }
}
