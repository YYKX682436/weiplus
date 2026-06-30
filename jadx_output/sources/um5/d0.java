package um5;

/* loaded from: classes10.dex */
public final class d0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.i0 f429145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f429146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f429147f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ um5.b0 f429148g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(um5.i0 i0Var, android.graphics.Bitmap bitmap, java.lang.String str, um5.b0 b0Var) {
        super(0);
        this.f429145d = i0Var;
        this.f429146e = bitmap;
        this.f429147f = str;
        this.f429148g = b0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int createTexture = com.tencent.tav.decoder.RenderContext.createTexture(3553);
        um5.i0 i0Var = this.f429145d;
        xm5.b.c(i0Var.f429167t, "newBitmapInputTexture id:" + createTexture, new java.lang.Object[0]);
        android.opengl.GLES20.glBindTexture(3553, createTexture);
        android.graphics.Bitmap bitmap = this.f429146e;
        android.opengl.GLUtils.texImage2D(3553, 0, bitmap, 0);
        android.opengl.GLES20.glTexParameterf(3553, 10241, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, com.google.android.gms.gcm.Task.EXTRAS_LIMIT_BYTES, 9729.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10242, 10497.0f);
        android.opengl.GLES20.glTexParameterf(3553, 10243, 10497.0f);
        android.opengl.GLES20.glBindTexture(3553, 0);
        i0Var.f429168u.add(new um5.z(this.f429147f, new um5.a0(createTexture, false, bitmap.getWidth(), bitmap.getHeight(), 0, null), this.f429148g));
        return jz5.f0.f302826a;
    }
}
