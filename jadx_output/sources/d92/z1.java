package d92;

/* loaded from: classes.dex */
public final class z1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d92.a2 f227525d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(d92.a2 a2Var) {
        super(1);
        this.f227525d = a2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return this.f227525d.getContext().getString(com.tencent.mm.R.string.cur) + e92.b.f250347d.c(it, com.tencent.mm.R.id.e7i);
    }
}
