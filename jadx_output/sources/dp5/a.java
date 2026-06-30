package dp5;

/* loaded from: classes14.dex */
public final class a implements dp5.f {

    /* renamed from: d, reason: collision with root package name */
    public final int f242272d;

    /* renamed from: e, reason: collision with root package name */
    public int f242273e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f242274f = -1;

    /* renamed from: g, reason: collision with root package name */
    public int f242275g = com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA;

    /* renamed from: h, reason: collision with root package name */
    public int f242276h;

    public a(int i17) {
        this.f242272d = i17;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        android.opengl.GLES20.glDeleteTextures(1, new int[]{this.f242272d}, 0);
    }
}
