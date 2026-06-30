package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class d implements yq5.h {

    /* renamed from: d, reason: collision with root package name */
    public final yq5.k f214928d;

    /* renamed from: e, reason: collision with root package name */
    public final yq5.f f214929e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f214930f;

    /* renamed from: g, reason: collision with root package name */
    public java.io.BufferedInputStream f214931g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.BitmapRegionDecoder f214932h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f214933i;

    public d(yq5.k subsamplingImage, yq5.f imageSource, yq5.c cVar) {
        kotlin.jvm.internal.o.g(subsamplingImage, "subsamplingImage");
        kotlin.jvm.internal.o.g(imageSource, "imageSource");
        this.f214928d = subsamplingImage;
        this.f214929e = imageSource;
        this.f214930f = jz5.h.b(new com.tencent.mm.zoomimage.subsampling.internal.b(this));
        this.f214933i = jz5.h.b(new com.tencent.mm.zoomimage.subsampling.internal.c(cVar, this));
    }

    public void a() {
        java.lang.Object m521constructorimpl;
        android.graphics.BitmapRegionDecoder newInstance;
        if (this.f214931g == null || this.f214932h == null) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(((yq5.b) this.f214929e).f464589a);
            java.lang.String str = a17.f213279f;
            if (str != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            java.io.InputStream D = com.tencent.mm.vfs.w6.D(a17, com.tencent.mm.vfs.a3.f212781a.m(a17, null));
            kotlin.jvm.internal.o.f(D, "openRead(...)");
            java.io.BufferedInputStream bufferedInputStream = D instanceof java.io.BufferedInputStream ? (java.io.BufferedInputStream) D : new java.io.BufferedInputStream(D, 8192);
            this.f214931g = bufferedInputStream;
            try {
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                if (android.os.Build.VERSION.SDK_INT >= 31) {
                    newInstance = android.graphics.BitmapRegionDecoder.newInstance(bufferedInputStream);
                    kotlin.jvm.internal.o.d(newInstance);
                } else {
                    newInstance = android.graphics.BitmapRegionDecoder.newInstance((java.io.InputStream) bufferedInputStream, false);
                    kotlin.jvm.internal.o.d(newInstance);
                }
                m521constructorimpl = kotlin.Result.m521constructorimpl(newInstance);
            } catch (java.lang.Throwable th6) {
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
            }
            if (!kotlin.Result.m527isFailureimpl(m521constructorimpl)) {
                kotlin.ResultKt.throwOnFailure(m521constructorimpl);
                this.f214932h = (android.graphics.BitmapRegionDecoder) m521constructorimpl;
                return;
            }
            try {
                bufferedInputStream.close();
            } catch (java.lang.RuntimeException e17) {
                throw e17;
            } catch (java.lang.Exception unused) {
            }
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
            kotlin.jvm.internal.o.d(m524exceptionOrNullimpl);
            throw m524exceptionOrNullimpl;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        android.graphics.BitmapRegionDecoder bitmapRegionDecoder = this.f214932h;
        if (bitmapRegionDecoder != null) {
            bitmapRegionDecoder.recycle();
        }
        java.io.BufferedInputStream bufferedInputStream = this.f214931g;
        if (bufferedInputStream != null) {
            try {
                bufferedInputStream.close();
            } catch (java.lang.RuntimeException e17) {
                throw e17;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.tencent.mm.zoomimage.subsampling.internal.d.class != obj.getClass()) {
            return false;
        }
        com.tencent.mm.zoomimage.subsampling.internal.d dVar = (com.tencent.mm.zoomimage.subsampling.internal.d) obj;
        return kotlin.jvm.internal.o.b(this.f214928d, dVar.f214928d) && kotlin.jvm.internal.o.b(this.f214929e, dVar.f214929e);
    }

    public int hashCode() {
        return (this.f214928d.hashCode() * 31) + this.f214929e.hashCode();
    }

    public java.lang.String toString() {
        return "AndroidRegionDecoder(subsamplingImage=" + this.f214928d + ", imageSource=" + this.f214929e + ')';
    }
}
