package i33;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f288187d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f288187d = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        androidx.appcompat.app.AppCompatActivity activity = this.f288187d;
        kotlin.jvm.internal.o.g(activity, "activity");
        i33.k1 k1Var = (i33.k1) pf5.z.f353948a.a(activity).e(i33.k1.class);
        if (k1Var != null) {
            i17 = k1Var.f288214n * i65.a.f(k1Var.getContext(), com.tencent.mm.R.dimen.f479923j2);
        } else {
            i17 = 0;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
