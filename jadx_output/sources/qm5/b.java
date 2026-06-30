package qm5;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f364790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f364791e;

    public b(qm5.c cVar, int i17, float f17) {
        this.f364790d = i17;
        this.f364791e = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.opengl.GLES20.glUniform1f(this.f364790d, this.f364791e);
    }
}
