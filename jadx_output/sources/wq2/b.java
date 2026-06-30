package wq2;

/* loaded from: classes2.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f448510d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f448511e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f448512f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wq2.h f448513g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(int i17, int i18, boolean z17, wq2.h hVar) {
        super(0);
        this.f448510d = i17;
        this.f448511e = i18;
        this.f448512f = z17;
        this.f448513g = hVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        r45.yz2 yz2Var;
        r45.xz2 xz2Var = new r45.xz2();
        r45.kv0 a17 = db2.t4.f228171a.a(10200);
        wq2.h hVar = this.f448513g;
        android.app.Activity activity = hVar.f448529a;
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.ui.MMFinderUI");
        a17.set(1, java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.ui.MMFinderUI) activity).getD()));
        xz2Var.f390610d = a17;
        xz2Var.f390616m = this.f448510d;
        xz2Var.f390626w = this.f448511e;
        xz2Var.f390611e = (this.f448512f || (yz2Var = hVar.f448532d) == null) ? null : yz2Var.f391522i;
        xz2Var.f390628y = new java.util.LinkedList();
        xz2Var.A = null;
        xz2Var.B = hVar.f448535g;
        dk2.of ofVar = hVar.f448534f;
        xz2Var.D = ofVar != null ? ofVar.f233865e : null;
        xz2Var.E = ofVar != null ? ofVar.f233867g : 0;
        return (az2.j) xz2Var.b();
    }
}
