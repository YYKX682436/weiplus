package d92;

/* loaded from: classes.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f227504d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(android.content.Context context) {
        super(1);
        this.f227504d = context;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        kotlin.jvm.internal.o.g(it, "it");
        e92.a aVar = e92.b.f250347d;
        java.lang.String string = this.f227504d.getString(com.tencent.mm.R.string.f491838ee3, aVar.d(it, com.tencent.mm.R.id.f484413e70).toString(), aVar.d(it, com.tencent.mm.R.id.e6y), aVar.d(it, com.tencent.mm.R.id.f484414e71), aVar.d(it, com.tencent.mm.R.id.e6z));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        return string;
    }
}
