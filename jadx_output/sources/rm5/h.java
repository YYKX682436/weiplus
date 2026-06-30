package rm5;

/* loaded from: classes10.dex */
public final class h implements rm5.k {

    /* renamed from: h, reason: collision with root package name */
    public static final rm5.c f397489h = new rm5.c(null);

    /* renamed from: i, reason: collision with root package name */
    public static final android.util.LruCache f397490i = new android.util.LruCache(200);

    /* renamed from: a, reason: collision with root package name */
    public final yz5.a f397491a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f397492b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.tavkit.component.TAVSourceImageGenerator f397493c;

    /* renamed from: f, reason: collision with root package name */
    public boolean f397496f;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.tav.coremedia.CGSize f397494d = new com.tencent.tav.coremedia.CGSize(300.0f, 300.0f);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f397495e = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.tav.core.AssetImageGenerator.ImageGeneratorListener f397497g = new rm5.g(this);

    public h(yz5.a aVar, java.lang.String str) {
        this.f397491a = aVar;
        this.f397492b = str;
        xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "init: " + hashCode(), new java.lang.Object[0]);
    }

    @Override // rm5.k
    public void a(java.util.List times, yz5.p callback) {
        kotlin.jvm.internal.o.g(times, "times");
        kotlin.jvm.internal.o.g(callback, "callback");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = times.iterator();
        while (true) {
            boolean z17 = false;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            long longValue = ((java.lang.Number) next).longValue();
            xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "requestFrames: " + longValue, new java.lang.Object[0]);
            android.graphics.Bitmap bitmap = (android.graphics.Bitmap) f397490i.get(this.f397492b + '-' + longValue);
            if (bitmap != null) {
                callback.invoke(java.lang.Long.valueOf(longValue), bitmap);
            } else {
                z17 = true;
            }
            if (z17) {
                arrayList.add(next);
            }
        }
        java.util.List Q = kz5.n0.Q(arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(Q, 10));
        java.util.Iterator it6 = Q.iterator();
        while (it6.hasNext()) {
            arrayList2.add(new rm5.d(((java.lang.Number) it6.next()).longValue(), callback, null, 4, null));
        }
        if (arrayList2.isEmpty()) {
            xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "requestFrames: no new request", new java.lang.Object[0]);
            return;
        }
        synchronized (this.f397495e) {
            this.f397495e.addAll(arrayList2);
        }
        e();
    }

    @Override // rm5.k
    public void b(long j17) {
        synchronized (this.f397495e) {
            kz5.h0.B(this.f397495e, new rm5.e(j17));
        }
    }

    public final void c() {
        com.tencent.tav.core.AssetImageGenerator assetImageGenerator;
        if (this.f397493c != null) {
            xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "destroy generator: " + this.f397493c, new java.lang.Object[0]);
            com.tencent.tavkit.component.TAVSourceImageGenerator tAVSourceImageGenerator = this.f397493c;
            if (tAVSourceImageGenerator != null && (assetImageGenerator = tAVSourceImageGenerator.getAssetImageGenerator()) != null) {
                assetImageGenerator.release();
            }
            this.f397493c = null;
        }
    }

    public final void d() {
        com.tencent.tav.core.AssetImageGenerator assetImageGenerator;
        if (this.f397493c == null) {
            this.f397493c = new com.tencent.tavkit.component.TAVSourceImageGenerator((com.tencent.tavkit.composition.TAVSource) this.f397491a.invoke(), this.f397494d);
            xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "create generator " + this.f397493c, new java.lang.Object[0]);
            com.tencent.tavkit.component.TAVSourceImageGenerator tAVSourceImageGenerator = this.f397493c;
            if (tAVSourceImageGenerator == null || (assetImageGenerator = tAVSourceImageGenerator.getAssetImageGenerator()) == null) {
                return;
            }
            assetImageGenerator.setApertureMode(com.tencent.tav.core.AssetImageGenerator.ApertureMode.aspectFill);
        }
    }

    @Override // rm5.k
    public void destroy() {
        xm5.b.c("MicroMsg.VLogCompositionCoverGenerator", "destroy: " + hashCode(), new java.lang.Object[0]);
        synchronized (this.f397495e) {
            this.f397495e.clear();
        }
        c();
    }

    public final void e() {
        synchronized (this.f397495e) {
            if (this.f397496f) {
                return;
            }
            if (!this.f397495e.isEmpty()) {
                java.lang.Object obj = this.f397495e.get(0);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                rm5.d dVar = (rm5.d) obj;
                d();
                this.f397496f = true;
                com.tencent.tavkit.component.TAVSourceImageGenerator tAVSourceImageGenerator = this.f397493c;
                if (tAVSourceImageGenerator != null) {
                    tAVSourceImageGenerator.generateThumbnailAtTime(dVar.f397483c, this.f397497g);
                }
            } else {
                c();
            }
        }
    }

    @Override // rm5.k
    public void setSize(int i17, int i18) {
        com.tencent.tav.coremedia.CGSize cGSize = this.f397494d;
        cGSize.width = i17;
        cGSize.height = i18;
    }
}
