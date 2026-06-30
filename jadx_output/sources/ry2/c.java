package ry2;

/* loaded from: classes10.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f401369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ry2.e f401370e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.graphics.Bitmap bitmap, ry2.e eVar) {
        super(0);
        this.f401369d = bitmap;
        this.f401370e = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.graphics.Bitmap bitmap = this.f401369d;
        if (bitmap != null) {
            this.f401370e.n(bitmap);
        }
        return jz5.f0.f302826a;
    }
}
