package um2;

/* loaded from: classes3.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428925d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewStub f428926e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fm2.c f428927f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(um2.x5 x5Var, android.view.ViewStub viewStub, fm2.c cVar) {
        super(0);
        this.f428925d = x5Var;
        this.f428926e = viewStub;
        this.f428927f = cVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f428925d.f19605b;
        kotlin.jvm.internal.o.e(appCompatActivity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        android.view.View inflate = this.f428926e.inflate();
        kotlin.jvm.internal.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        fm2.c cVar = this.f428927f;
        return new fe2.q((com.tencent.mm.ui.MMActivity) appCompatActivity, (android.view.ViewGroup) inflate, cVar, cVar);
    }
}
