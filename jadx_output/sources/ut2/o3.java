package ut2;

/* loaded from: classes3.dex */
public final class o3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431023d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(android.view.View view) {
        super(0);
        this.f431023d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f431023d.findViewById(com.tencent.mm.R.id.uuk);
        kotlin.jvm.internal.o.d(findViewById);
        findViewById.post(new d92.b(new d92.c(findViewById, true)));
        return findViewById;
    }
}
