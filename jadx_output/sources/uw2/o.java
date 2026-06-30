package uw2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f431700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f431701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(boolean z17, android.view.View view) {
        super(0);
        this.f431700d = z17;
        this.f431701e = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if (this.f431700d) {
            android.view.View view = this.f431701e;
            view.post(new uw2.n(view));
        }
        return jz5.f0.f302826a;
    }
}
