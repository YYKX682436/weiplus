package jn1;

/* loaded from: classes4.dex */
public final class c0 implements com.tencent.mm.sdk.platformtools.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f300488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f300489b;

    public c0(android.graphics.Bitmap bitmap, java.lang.String str) {
        this.f300488a = bitmap;
        this.f300489b = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.w
    public final void a(java.io.OutputStream outputStream) {
        try {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.Avatar.HdAvatarUpdateSmallFilePPC", "update small bitmap result:" + this.f300488a.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, outputStream) + " username:" + this.f300489b);
            } finally {
                try {
                } finally {
                    try {
                        outputStream.close();
                    } catch (java.lang.Exception unused) {
                    }
                }
            }
        } catch (java.lang.Exception unused2) {
        }
    }
}
