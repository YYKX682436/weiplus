package pk2;

/* loaded from: classes3.dex */
public final class lb extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f355970e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb(pk2.o9 o9Var, android.app.Activity activity) {
        super(0);
        this.f355969d = o9Var;
        this.f355970e = activity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dk2.xf f17 = this.f355969d.f();
        if (f17 != null) {
            dk2.xf.c(f17, this.f355970e, false, 2, null);
        }
        return jz5.f0.f302826a;
    }
}
