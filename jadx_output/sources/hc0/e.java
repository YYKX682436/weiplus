package hc0;

@j95.b
/* loaded from: classes8.dex */
public final class e extends i95.w implements ic0.e {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f280276d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Bitmap f280277e;

    /* renamed from: f, reason: collision with root package name */
    public final kk.l f280278f = new kk.l(15);

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap W0(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.pluginsdk.ui.j1
    public void X9(com.tencent.mm.pluginsdk.ui.n1 drawable) {
        kotlin.jvm.internal.o.g(drawable, "drawable");
        if (drawable instanceof kv.e0) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().d((kv.e0) drawable);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String tag, int i17, int i18, int i19) {
        kotlin.jvm.internal.o.g(tag, "tag");
        return null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap loadBitmap(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        kk.l lVar = this.f280278f;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) lVar.get(tag);
        if (weakReference != null && weakReference.get() != null) {
            java.lang.Object obj = weakReference.get();
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.graphics.Bitmap");
            if (!((android.graphics.Bitmap) obj).isRecycled() && kotlin.jvm.internal.o.b(weakReference.get(), uc())) {
                return (android.graphics.Bitmap) weakReference.get();
            }
        }
        ((com.tencent.mm.feature.avatar.w) ((kv.c0) i95.n0.c(kv.c0.class))).getClass();
        android.graphics.Bitmap a17 = com.tencent.mm.modelavatar.g.a(tag);
        if (a17 != null && !a17.isRecycled()) {
            android.graphics.Bitmap s07 = com.tencent.mm.sdk.platformtools.x.s0(a17, false, a17.getWidth() / 2);
            lVar.j(tag, new java.lang.ref.WeakReference(s07));
            return s07;
        }
        if (this.f280277e == null && uc() != null) {
            try {
                android.graphics.Bitmap bitmap = this.f280276d;
                kotlin.jvm.internal.o.d(bitmap);
                this.f280277e = com.tencent.mm.sdk.platformtools.x.s0(bitmap, false, bitmap.getWidth() / 2);
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RadarAvatarBitmapLoaderService", e17, "", new java.lang.Object[0]);
            }
        }
        return this.f280277e;
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap uc() {
        if (this.f280276d == null) {
            try {
                this.f280276d = com.tencent.mm.sdk.platformtools.j.c(com.tencent.mm.sdk.platformtools.x2.f193071a.getAssets().open("avatar/default_nor_avatar.png"), i65.a.g(null));
            } catch (java.io.IOException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.RadarAvatarBitmapLoaderService", e17, "", new java.lang.Object[0]);
            }
        }
        return this.f280276d;
    }
}
