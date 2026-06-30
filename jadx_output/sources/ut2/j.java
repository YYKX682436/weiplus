package ut2;

/* loaded from: classes3.dex */
public final class j extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f430927d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(android.view.View view) {
        super(0);
        this.f430927d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View findViewById = this.f430927d.findViewById(com.tencent.mm.R.id.uv7);
        kotlin.jvm.internal.o.d(findViewById);
        findViewById.post(new d92.b(new d92.c(findViewById, true)));
        return findViewById;
    }
}
