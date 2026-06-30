package ye3;

/* loaded from: classes15.dex */
public class k implements qh3.a {

    /* renamed from: a, reason: collision with root package name */
    public final wh3.b f461222a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f461223b;

    /* renamed from: c, reason: collision with root package name */
    public ye3.n f461224c;

    public k(wh3.b mediaSource, java.lang.String playMediaId) {
        kotlin.jvm.internal.o.g(mediaSource, "mediaSource");
        kotlin.jvm.internal.o.g(playMediaId, "playMediaId");
        this.f461222a = mediaSource;
        this.f461223b = playMediaId;
        ye3.n a17 = ye3.m.f461226a.a(mediaSource.f445965a, false);
        java.lang.String value = mediaSource.f445966b;
        kotlin.jvm.internal.o.g(value, "value");
        a17.field_url = value;
        this.f461224c = a17;
        boolean j17 = com.tencent.mm.vfs.w6.j(a17.t0());
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "create MBExternalVideoFileStateCache, cache:" + this.f461224c + " path:" + this.f461224c.t0() + ", exists:" + j17);
        int i17 = this.f461224c.field_state;
        if (i17 == -2 || i17 == -1 || i17 == 0) {
            com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "resetMediaCache");
            i(1);
        } else if (i17 == 2 && !j17) {
            com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "resetMediaCache");
            i(1);
        }
    }

    @Override // qh3.a
    public boolean a() {
        ye3.n nVar = this.f461224c;
        return nVar.field_totalSize > 0 && nVar.field_cacheSize > 0 && nVar.field_state == 2;
    }

    @Override // qh3.a
    public long b() {
        return this.f461224c.field_cacheSize;
    }

    @Override // qh3.a
    public long c() {
        return this.f461224c.field_totalSize;
    }

    @Override // qh3.a
    public void d(java.lang.String fileFormat) {
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "updateFileFormat fileFormat:".concat(fileFormat));
        ye3.m mVar = ye3.m.f461226a;
        java.lang.String str = this.f461223b;
        ye3.n a17 = mVar.a(str, false);
        if (!kotlin.jvm.internal.o.b(a17.field_specFormat, fileFormat)) {
            a17.field_specFormat = fileFormat;
        }
        mVar.b(a17, "MBVideoFileStateCache.updateCache");
        this.f461224c = mVar.a(str, false);
    }

    @Override // qh3.a
    public boolean e() {
        return this.f461224c.field_moovReady;
    }

    @Override // qh3.a
    public void f(int i17) {
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "markStateError retCode:" + i17);
        i(-1);
    }

    @Override // qh3.a
    public void g(long j17, long j18, int i17) {
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "updateProgressMemory cacheSize:" + j17 + " totalSize:" + j18 + " state:" + i17);
        ye3.m mVar = ye3.m.f461226a;
        java.lang.String str = this.f461223b;
        ye3.n a17 = mVar.a(str, false);
        a17.field_cacheSize = j17;
        a17.field_totalSize = j18;
        a17.field_state = i17;
        mVar.b(a17, "MBVideoFileStateCache.updateCache");
        this.f461224c = mVar.a(str, false);
    }

    @Override // qh3.a
    public java.lang.String getFilePath() {
        return this.f461224c.t0();
    }

    @Override // qh3.a
    public void h() {
        com.tencent.mars.xlog.Log.i("MB_External_surface_DB", "updateMoovReady");
        ye3.m mVar = ye3.m.f461226a;
        java.lang.String str = this.f461223b;
        ye3.n a17 = mVar.a(str, false);
        a17.field_moovReady = true;
        mVar.b(a17, "MBVideoFileStateCache.updateCache");
        this.f461224c = mVar.a(str, false);
    }

    public final void i(int i17) {
        ye3.m mVar = ye3.m.f461226a;
        java.lang.String url = this.f461222a.f445966b;
        ye3.n nVar = this.f461224c;
        int i18 = nVar.field_codecFormat;
        java.lang.String str = nVar.field_specFormat;
        if (str == null) {
            str = "";
        }
        int i19 = nVar.field_duration;
        java.lang.String mediaId = this.f461223b;
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(url, "url");
        if (mediaId.length() == 0) {
            com.tencent.mars.xlog.Log.w("MB_External_surface_DB", "[store] mediaId is isNullOrEmpty, skip");
        } else {
            ye3.n a17 = mVar.a(mediaId, false);
            a17.field_mediaId = mediaId;
            a17.field_url = url;
            a17.field_specFormat = str;
            a17.field_codecFormat = i18;
            a17.field_dynamicRangeType = 0;
            a17.field_cacheSize = 0L;
            a17.field_totalSize = 0L;
            a17.field_state = i17;
            a17.field_duration = i19;
            mVar.b(a17, "store");
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[store] success. mediaId:");
            sb6.append(mediaId);
            sb6.append(" state:");
            sb6.append(i17);
            sb6.append(" progress=");
            long j17 = a17.field_totalSize;
            sb6.append(j17 <= 0 ? 0 : (int) ((((float) a17.field_cacheSize) / ((float) j17)) * 100));
            sb6.append('%');
            com.tencent.mars.xlog.Log.i("MB_External_surface_DB", sb6.toString());
        }
        this.f461224c = mVar.a(mediaId, false);
    }
}
