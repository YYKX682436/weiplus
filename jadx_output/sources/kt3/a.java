package kt3;

/* loaded from: classes10.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kt3.l f311977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f311978e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(kt3.l lVar, kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f311977d = lVar;
        this.f311978e = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            di3.d dVar = this.f311977d.f311997q;
            kotlin.jvm.internal.o.d(dVar);
            float b17 = dVar.b();
            boolean fj6 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_photo_align_long_side, true);
            int i17 = wo.v1.f447829i.B;
            if (i17 != -1) {
                if (i17 == 0) {
                    fj6 = false;
                } else if (i17 == 1) {
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
            this.f311978e.f310123d = bitmap;
        }
        return jz5.f0.f302826a;
    }
}
