package mx0;

/* loaded from: classes4.dex */
public final class f6 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f331979d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(android.content.Context context) {
        super(0);
        this.f331979d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f331979d;
        hu3.q0 q0Var = new hu3.q0(context);
        q0Var.b(i65.a.r(context, com.tencent.mm.R.string.hth));
        q0Var.setCancelable(false);
        return q0Var;
    }
}
