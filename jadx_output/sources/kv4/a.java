package kv4;

/* loaded from: classes3.dex */
public final class a extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f312680d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(android.view.View view) {
        super(0);
        this.f312680d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f312680d;
        return kz5.c0.i(view.findViewById(com.tencent.mm.R.id.u2x), view.findViewById(com.tencent.mm.R.id.u2y));
    }
}
