package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class v0 implements java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public final zq5.k f215116d;

    /* renamed from: e, reason: collision with root package name */
    public final yq5.h f215117e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f215118f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f215119g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f215120h;

    /* renamed from: i, reason: collision with root package name */
    public int f215121i;

    /* renamed from: m, reason: collision with root package name */
    public final yq5.c f215122m;

    public v0(zq5.k logger, yq5.h regionDecoder) {
        kotlin.jvm.internal.o.g(logger, "logger");
        kotlin.jvm.internal.o.g(regionDecoder, "regionDecoder");
        this.f215116d = logger;
        this.f215117e = regionDecoder;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f215119g = arrayList;
        this.f215120h = new java.lang.Object();
        this.f215122m = (yq5.c) ((jz5.n) ((com.tencent.mm.zoomimage.subsampling.internal.d) regionDecoder).f214933i).getValue();
        arrayList.add(regionDecoder);
        this.f215121i++;
        logger.a(new com.tencent.mm.zoomimage.subsampling.internal.r0(this));
    }

    public final android.graphics.Bitmap a(zq5.e srcRect, int i17) {
        boolean z17;
        yq5.h hVar;
        kotlin.jvm.internal.o.g(srcRect, "srcRect");
        synchronized (this.f215120h) {
            z17 = this.f215118f;
        }
        if (!(!z17)) {
            throw new java.lang.IllegalStateException(("TileDecoder is closed. " + this.f215117e).toString());
        }
        com.tencent.mm.zoomimage.subsampling.internal.t0 t0Var = new com.tencent.mm.zoomimage.subsampling.internal.t0(srcRect, i17);
        synchronized (this.f215120h) {
            hVar = ((java.util.ArrayList) this.f215119g).isEmpty() ^ true ? (yq5.h) ((java.util.ArrayList) this.f215119g).remove(0) : null;
        }
        if (hVar == null) {
            this.f215121i++;
            this.f215116d.a(new com.tencent.mm.zoomimage.subsampling.internal.u0(this));
            com.tencent.mm.zoomimage.subsampling.internal.d dVar = (com.tencent.mm.zoomimage.subsampling.internal.d) this.f215117e;
            hVar = new com.tencent.mm.zoomimage.subsampling.internal.d(dVar.f214928d, dVar.f214929e, (yq5.c) ((jz5.n) dVar.f214933i).getValue());
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) t0Var.invoke(hVar);
        synchronized (this.f215120h) {
            if (this.f215118f) {
                try {
                    ((com.tencent.mm.zoomimage.subsampling.internal.d) hVar).close();
                } catch (java.lang.RuntimeException e17) {
                    throw e17;
                } catch (java.lang.Exception unused) {
                }
            } else {
                ((java.util.ArrayList) this.f215119g).add(hVar);
            }
        }
        return bitmap;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        boolean z17;
        synchronized (this.f215120h) {
            z17 = this.f215118f;
        }
        if (z17) {
            return;
        }
        this.f215118f = true;
        this.f215116d.a(new com.tencent.mm.zoomimage.subsampling.internal.s0(this));
        synchronized (this.f215120h) {
            java.util.Iterator it = ((java.util.ArrayList) this.f215119g).iterator();
            while (it.hasNext()) {
                yq5.h hVar = (yq5.h) it.next();
                kotlin.jvm.internal.o.g(hVar, "<this>");
                try {
                    ((com.tencent.mm.zoomimage.subsampling.internal.d) hVar).close();
                } catch (java.lang.RuntimeException e17) {
                    throw e17;
                } catch (java.lang.Exception unused) {
                }
            }
            ((java.util.ArrayList) this.f215119g).clear();
        }
    }

    public java.lang.String toString() {
        return "TileDecoder(" + this.f215117e + ')';
    }
}
