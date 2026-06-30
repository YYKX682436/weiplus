package yn1;

/* loaded from: classes11.dex */
public final class t2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f463844d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(yn1.a4 a4Var) {
        super(0);
        this.f463844d = a4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        vn1.m mVar = new vn1.m(context);
        mVar.f438214b = new yn1.s2(this.f463844d);
        return mVar;
    }
}
