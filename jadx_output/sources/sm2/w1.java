package sm2;

/* loaded from: classes3.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409763d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.a f409764e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(sm2.o4 o4Var, fm2.a aVar) {
        super(0);
        this.f409763d = o4Var;
        this.f409764e = aVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f409763d.f19594b;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type android.app.Activity");
        android.view.View findViewById = appCompatActivity.findViewById(com.tencent.mm.R.id.evz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return new com.tencent.mm.plugin.finder.live.plugin.w5((android.view.ViewGroup) findViewById, this.f409764e);
    }
}
