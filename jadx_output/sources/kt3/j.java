package kt3;

/* loaded from: classes10.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt3.l f311989d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(kt3.l lVar) {
        super(2);
        this.f311989d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        java.util.Map metadata = (java.util.Map) obj2;
        kotlin.jvm.internal.o.g(metadata, "metadata");
        kt3.l lVar = this.f311989d;
        at0.n nVar = lVar.f311996p;
        kotlin.jvm.internal.o.d(nVar);
        nVar.f13594b.s(false);
        if (bitmap == null) {
            bi3.i iVar = lVar.f311998r;
            if (iVar != null) {
                iVar.a();
            }
            int i17 = kt3.l.F;
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandCameraPluginLayout", "record picture error cause null bitmap ");
        } else if (lVar.f311993m != lVar.f311991h) {
            di3.d dVar = lVar.f311997q;
            kotlin.jvm.internal.o.d(dVar);
            float b17 = dVar.b();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_photo_align_long_side, true);
            int i18 = wo.v1.f447829i.B;
            if (i18 != -1) {
                if (i18 == 0) {
                    fj6 = false;
                } else if (i18 == 1) {
                    fj6 = true;
                }
            }
            if (fj6) {
                if (bitmap.getHeight() > bitmap.getWidth()) {
                    if (bitmap.getHeight() > 1920.0f) {
                        float height = 1920.0f / bitmap.getHeight();
                        bitmap = com.tencent.mm.sdk.platformtools.x.z0(bitmap, b17, height, height);
                    } else {
                        if (!(b17 == 0.0f)) {
                            bitmap = com.tencent.mm.sdk.platformtools.x.w0(bitmap, b17);
                        }
                    }
                } else if (bitmap.getWidth() > 1920.0f) {
                    float width = 1920.0f / bitmap.getWidth();
                    bitmap = com.tencent.mm.sdk.platformtools.x.z0(bitmap, b17, width, width);
                } else {
                    if (!(b17 == 0.0f)) {
                        bitmap = com.tencent.mm.sdk.platformtools.x.w0(bitmap, b17);
                    }
                }
            } else if (bitmap.getHeight() > bitmap.getWidth()) {
                if (bitmap.getWidth() > 1080.0f) {
                    float width2 = 1080.0f / bitmap.getWidth();
                    bitmap = com.tencent.mm.sdk.platformtools.x.z0(bitmap, b17, width2, width2);
                } else {
                    if (!(b17 == 0.0f)) {
                        bitmap = com.tencent.mm.sdk.platformtools.x.w0(bitmap, b17);
                    }
                }
            } else if (bitmap.getHeight() > 1080.0f) {
                float height2 = 1080.0f / bitmap.getHeight();
                bitmap = com.tencent.mm.sdk.platformtools.x.z0(bitmap, b17, height2, height2);
            } else {
                if (!(b17 == 0.0f)) {
                    bitmap = com.tencent.mm.sdk.platformtools.x.w0(bitmap, b17);
                }
            }
            bi3.i iVar2 = lVar.f311998r;
            if (iVar2 != null) {
                iVar2.b(bitmap, metadata);
            }
        } else {
            bi3.i iVar3 = lVar.f311998r;
            if (iVar3 != null) {
                iVar3.b(bitmap, metadata);
            }
        }
        return jz5.f0.f302826a;
    }
}
