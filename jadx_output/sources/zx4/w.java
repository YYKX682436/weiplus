package zx4;

/* loaded from: classes5.dex */
public final class w implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f477205a;

    public w(android.graphics.Bitmap bitmap) {
        this.f477205a = bitmap;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public final void a(java.io.OutputStream outputStream) {
        try {
            this.f477205a.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, outputStream);
            vz5.b.a(outputStream, null);
        } finally {
        }
    }
}
