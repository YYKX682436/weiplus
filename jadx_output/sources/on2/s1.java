package on2;

/* loaded from: classes3.dex */
public final class s1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ on2.a2 f347008d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(on2.a2 a2Var) {
        super(1);
        this.f347008d = a2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.qp1 it = (r45.qp1) obj;
        kotlin.jvm.internal.o.g(it, "it");
        android.view.View findViewById = this.f347008d.getRootView().findViewById(com.tencent.mm.R.id.exd);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        new com.tencent.mm.plugin.finder.live.widget.se(findViewById, null, null, null, 14, null).c(7, it, 0, on2.r1.f347000d);
        return jz5.f0.f302826a;
    }
}
