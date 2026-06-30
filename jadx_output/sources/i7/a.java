package i7;

/* loaded from: classes13.dex */
public class a implements i7.e {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Bitmap.CompressFormat f289388a = android.graphics.Bitmap.CompressFormat.JPEG;

    /* renamed from: b, reason: collision with root package name */
    public final int f289389b = 100;

    @Override // i7.e
    public w6.z0 a(w6.z0 z0Var, t6.l lVar) {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        ((android.graphics.Bitmap) z0Var.get()).compress(this.f289388a, this.f289389b, byteArrayOutputStream);
        z0Var.recycle();
        return new e7.c(byteArrayOutputStream.toByteArray());
    }
}
