package tm2;

/* loaded from: classes3.dex */
public final class y0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.b f420637e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(tm2.s2 s2Var, fm2.b bVar) {
        super(0);
        this.f420636d = s2Var;
        this.f420637e = bVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f420636d.f19600b;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
        android.view.View findViewById = appCompatActivity.findViewById(com.tencent.mm.R.id.evz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.w5((android.view.ViewGroup) findViewById, this.f420637e);
    }
}
