package qm5;

/* loaded from: classes14.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f364788d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f364789e;

    public a(qm5.c cVar, int i17, int i18) {
        this.f364788d = i17;
        this.f364789e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.opengl.GLES20.glUniform1i(this.f364788d, this.f364789e);
    }
}
