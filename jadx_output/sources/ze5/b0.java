package ze5;

/* loaded from: classes9.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w05.h f471831d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(w05.h hVar) {
        super(1);
        this.f471831d = hVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.widget.ImageView imageView = (android.widget.ImageView) obj;
        kotlin.jvm.internal.o.g(imageView, "imageView");
        n11.a b17 = n11.a.b();
        java.lang.String t17 = this.f471831d.t();
        o11.f fVar = new o11.f();
        fVar.f342096t = true;
        fVar.f342079c = true;
        b17.h(t17, imageView, fVar.a());
        return jz5.f0.f302826a;
    }
}
