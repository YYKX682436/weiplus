package jk3;

/* loaded from: classes8.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jk3.v f300093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f300094e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f300095f;

    public m(jk3.v vVar, int i17, android.graphics.Bitmap bitmap) {
        this.f300093d = vVar;
        this.f300094e = i17;
        this.f300095f = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap;
        int i17 = this.f300094e;
        jk3.v vVar = this.f300093d;
        if (vVar.F(i17)) {
            bitmap = vVar.P(this.f300095f, vVar.f300124q);
        } else {
            bitmap = null;
        }
        vVar.l(bitmap, false);
    }
}
