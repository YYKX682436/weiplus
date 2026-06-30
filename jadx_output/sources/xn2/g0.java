package xn2;

/* loaded from: classes2.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f455502d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(xn2.p0 p0Var) {
        super(0);
        this.f455502d = p0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.app.Activity context = this.f455502d.f455543a;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }
}
