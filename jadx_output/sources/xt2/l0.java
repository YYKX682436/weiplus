package xt2;

/* loaded from: classes3.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f456862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.p0 f456863e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(android.content.Context context, xt2.p0 p0Var) {
        super(0);
        this.f456862d = context;
        this.f456863e = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        return android.view.LayoutInflater.from(this.f456862d).inflate(com.tencent.mm.R.layout.a4h, this.f456863e.f456926a, false);
    }
}
