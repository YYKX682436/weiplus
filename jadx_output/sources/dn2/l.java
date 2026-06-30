package dn2;

/* loaded from: classes3.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f241937d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.view.View view) {
        super(0);
        this.f241937d = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f241937d;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.f483512b20);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f483513b21);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = view.findViewById(com.tencent.mm.R.id.f483514b22);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        return new android.widget.ImageView[]{findViewById, findViewById2, findViewById3};
    }
}
