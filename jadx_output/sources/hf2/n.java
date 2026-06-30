package hf2;

/* loaded from: classes10.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.x f281118d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281119e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f281120f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(hf2.x xVar, java.lang.String str, android.graphics.Bitmap bitmap) {
        super(0);
        this.f281118d = xVar;
        this.f281119e = str;
        this.f281120f = bitmap;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        hf2.x xVar = this.f281118d;
        hf2.b2 h76 = xVar.h7();
        java.lang.String str = this.f281119e;
        android.graphics.Bitmap bitmap = this.f281120f;
        h76.d(str, bitmap, 1.0f);
        xVar.f7().c(str, bitmap);
        return jz5.f0.f302826a;
    }
}
