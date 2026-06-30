package zx4;

/* loaded from: classes4.dex */
public final class b0 implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f477114a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f477115b;

    public b0(java.lang.String str, android.graphics.Bitmap bitmap) {
        this.f477114a = str;
        this.f477115b = bitmap;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public void a(java.io.OutputStream os6) {
        kotlin.jvm.internal.o.g(os6, "os");
        try {
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(this.f477114a);
            android.graphics.Bitmap bitmap = this.f477115b;
            if (K0) {
                bitmap.compress(android.graphics.Bitmap.CompressFormat.PNG, 100, os6);
            } else {
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, os6);
            }
            vz5.b.a(os6, null);
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(os6, th6);
                throw th7;
            }
        }
    }
}
