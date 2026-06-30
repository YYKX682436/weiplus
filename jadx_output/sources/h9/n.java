package h9;

/* loaded from: classes15.dex */
public final class n implements r9.a0 {

    /* renamed from: d, reason: collision with root package name */
    public final g9.g f279658d;

    /* renamed from: e, reason: collision with root package name */
    public final r9.h0 f279659e;

    /* renamed from: f, reason: collision with root package name */
    public final int f279660f;

    /* renamed from: i, reason: collision with root package name */
    public final h9.m f279663i;

    /* renamed from: o, reason: collision with root package name */
    public final d9.g f279666o;

    /* renamed from: p, reason: collision with root package name */
    public h9.b f279667p;

    /* renamed from: q, reason: collision with root package name */
    public h9.a f279668q;

    /* renamed from: r, reason: collision with root package name */
    public h9.d f279669r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f279670s;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f279664m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final r9.g0 f279665n = new r9.g0("HlsPlaylistTracker:MasterPlaylist");

    /* renamed from: g, reason: collision with root package name */
    public final java.util.IdentityHashMap f279661g = new java.util.IdentityHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final android.os.Handler f279662h = new android.os.Handler();

    public n(android.net.Uri uri, g9.g gVar, d9.g gVar2, int i17, h9.m mVar, r9.h0 h0Var) {
        this.f279658d = gVar;
        this.f279666o = gVar2;
        this.f279660f = i17;
        this.f279663i = mVar;
        this.f279659e = h0Var;
    }

    public h9.d a(h9.a aVar) {
        h9.d dVar;
        java.util.IdentityHashMap identityHashMap = this.f279661g;
        h9.d dVar2 = ((h9.i) identityHashMap.get(aVar)).f279650g;
        if (dVar2 != null && aVar != this.f279668q && this.f279667p.f279592c.contains(aVar) && ((dVar = this.f279669r) == null || !dVar.f279615l)) {
            this.f279668q = aVar;
            ((h9.i) identityHashMap.get(aVar)).b();
        }
        return dVar2;
    }

    @Override // r9.a0
    public void e(r9.c0 c0Var, long j17, long j18) {
        r9.i0 i0Var;
        h9.b bVar;
        r9.i0 i0Var2 = (r9.i0) c0Var;
        h9.e eVar = (h9.e) i0Var2.f393371d;
        boolean z17 = eVar instanceof h9.d;
        if (z17) {
            if (((h9.d) eVar).f279615l) {
                d9.g gVar = this.f279666o;
                gVar.getClass();
                gVar.f227349a.post(new d9.f(gVar));
            }
            i0Var = i0Var2;
            java.util.List singletonList = java.util.Collections.singletonList(new h9.a(eVar.f279620a, new com.google.android.exoplayer2.Format("0", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.APPLICATION_M3U8, null, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, null, -1, com.tencent.wcdb.core.Database.DictDefaultMatchValue, null, null, null)));
            java.util.List emptyList = java.util.Collections.emptyList();
            bVar = new h9.b(null, java.util.Collections.emptyList(), singletonList, emptyList, emptyList, null, null);
        } else {
            i0Var = i0Var2;
            bVar = (h9.b) eVar;
        }
        this.f279667p = bVar;
        this.f279668q = (h9.a) bVar.f279592c.get(0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.addAll(bVar.f279592c);
        arrayList.addAll(bVar.f279593d);
        arrayList.addAll(bVar.f279594e);
        int size = arrayList.size();
        for (int i17 = 0; i17 < size; i17++) {
            h9.a aVar = (h9.a) arrayList.get(i17);
            this.f279661g.put(aVar, new h9.i(this, aVar));
        }
        h9.i iVar = (h9.i) this.f279661g.get(this.f279668q);
        if (z17) {
            iVar.c((h9.d) eVar);
        } else {
            iVar.b();
        }
        r9.i0 i0Var3 = i0Var;
        this.f279666o.e(i0Var3.f393368a, 4, j17, j18, i0Var3.f393373f);
    }

    @Override // r9.a0
    public int g(r9.c0 c0Var, long j17, long j18, java.io.IOException iOException) {
        r9.i0 i0Var = (r9.i0) c0Var;
        boolean z17 = iOException instanceof m8.x;
        this.f279666o.g(i0Var.f393368a, 4, j17, j18, i0Var.f393373f, iOException, z17);
        return z17 ? 3 : 0;
    }

    @Override // r9.a0
    public void q(r9.c0 c0Var, long j17, long j18, boolean z17) {
        r9.i0 i0Var = (r9.i0) c0Var;
        this.f279666o.c(i0Var.f393368a, 4, j17, j18, i0Var.f393373f);
    }
}
