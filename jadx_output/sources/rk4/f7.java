package rk4;

/* loaded from: classes.dex */
public final class f7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f396653d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f7(kotlin.jvm.internal.h0 h0Var, android.content.Context context) {
        super(0);
        this.f396653d = h0Var;
        this.f396654e = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f396654e;
        this.f396653d.f310123d = db5.e1.Q(context, j65.q.a(context).getString(com.tencent.mm.R.string.f490573yv), j65.q.a(this.f396654e).getString(com.tencent.mm.R.string.f490604zq), true, true, null);
        return jz5.f0.f302826a;
    }
}
