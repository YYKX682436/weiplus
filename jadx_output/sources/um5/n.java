package um5;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.p f429173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f429174e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(um5.p pVar, android.graphics.Bitmap bitmap) {
        super(0);
        this.f429173d = pVar;
        this.f429174e = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        um5.p pVar = this.f429173d;
        int i17 = pVar.f429177u.f429150a;
        if (i17 > 0) {
            android.opengl.GLES20.glDeleteTextures(1, new int[i17], 0);
        }
        int createTexture = com.tencent.tav.decoder.RenderContext.createTexture(3553);
        um5.f fVar = pVar.f429177u;
        fVar.f429150a = createTexture;
        xm5.b.c(pVar.f429176t, "create input textureId:" + fVar.f429150a, new java.lang.Object[0]);
        fVar.f429151b = false;
        android.opengl.GLES20.glBindTexture(3553, fVar.f429150a);
        android.graphics.Bitmap bitmap = this.f429174e;
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
        android.opengl.GLES20.glBindTexture(3553, 0);
        fVar.f429152c = bitmap.getWidth();
        fVar.f429153d = bitmap.getHeight();
        fVar.f429154e = 0;
        return jz5.f0.f302826a;
    }
}
