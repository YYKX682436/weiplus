package ut2;

/* loaded from: classes3.dex */
public final class h0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.k0 f430896d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(ut2.k0 k0Var) {
        super(0);
        this.f430896d = k0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f430896d.f430958b.findViewById(com.tencent.mm.R.id.p3k);
        d92.f fVar = d92.f.f227470a;
        kotlin.jvm.internal.o.d(imageView);
        fVar.k(imageView, 20.0f, 20.0f);
        return imageView;
    }
}
