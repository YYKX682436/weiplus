package w13;

/* loaded from: classes12.dex */
public class i implements o13.u {

    /* renamed from: d, reason: collision with root package name */
    public boolean f442216d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f442217e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.wcdb.database.SQLiteStatement f442218f;

    /* renamed from: g, reason: collision with root package name */
    public o13.t f442219g;

    public i() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create %s", "FTS5SOSHistoryStorage");
    }

    @Override // o13.u
    public void F(int[] iArr, long j17) {
    }

    @Override // o13.u
    public java.lang.String K(java.lang.String str, int i17) {
        return null;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        return 0;
    }

    @Override // o13.u
    public void create() {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "OnCreate %s | isCreated =%b", "FTS5SOSHistoryStorage", java.lang.Boolean.valueOf(this.f442216d));
        if (this.f442216d) {
            return;
        }
        if (((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).mj()) {
            this.f442219g = ((com.tencent.mm.plugin.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).f137381f;
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create Success!");
            if (((com.tencent.mm.plugin.fts.o) this.f442219g).n("FTS5MetaSOSHistory") && ((com.tencent.mm.plugin.fts.o) this.f442219g).b(org.chromium.net.NetError.ERR_ADDRESS_UNREACHABLE, 2)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Table Exist, Not Need To Create");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Table Not Exist, Need To Create");
                ((com.tencent.mm.plugin.fts.o) this.f442219g).i(java.lang.String.format("DROP TABLE IF EXISTS %s;", "FTS5MetaSOSHistory"));
                ((com.tencent.mm.plugin.fts.o) this.f442219g).i(java.lang.String.format("CREATE TABLE IF NOT EXISTS %s (key TEXT PRIMARY KEY, timestamp INTEGER, content TEXT);", "FTS5MetaSOSHistory"));
                ((com.tencent.mm.plugin.fts.o) this.f442219g).i(java.lang.String.format("CREATE INDEX IF NOT EXISTS SOSHistory_timestamp ON %s(timestamp);", "FTS5MetaSOSHistory"));
                ((com.tencent.mm.plugin.fts.o) this.f442219g).q(-109L, 2L);
            }
            this.f442218f = ((com.tencent.mm.plugin.fts.o) this.f442219g).e(java.lang.String.format("INSERT OR REPLACE INTO %s (key, timestamp, content) VALUES (?, ?, ?);", "FTS5MetaSOSHistory"));
            z17 = true;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "Create Fail!");
            z17 = false;
        }
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "SetCreated");
            this.f442216d = true;
        }
    }

    @Override // o13.u
    public void destroy() {
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "OnDestroy %s | isDestroyed %b | isCreated %b", "FTS5SOSHistoryStorage", java.lang.Boolean.valueOf(this.f442217e), java.lang.Boolean.valueOf(this.f442216d));
        if (this.f442217e || !this.f442216d) {
            return;
        }
        this.f442218f.close();
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.FTS5SOSHistoryStorage", "SetDestroyed");
        this.f442217e = true;
    }

    @Override // o13.u
    public java.lang.String getName() {
        return "FTS5SOSHistoryStorage";
    }

    @Override // o13.u
    public int getPriority() {
        return 1024;
    }

    @Override // o13.u
    public int getType() {
        return 1024;
    }

    @Override // o13.u
    public void m0(int[] iArr, java.lang.String str) {
    }
}
