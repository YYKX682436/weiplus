package sm2;

/* loaded from: classes3.dex */
public final class b3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409369d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(sm2.o4 o4Var) {
        super(1);
        this.f409369d = o4Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i(this.f409369d.f409610f, "onAcceptMicTimeout res: " + booleanValue);
        return jz5.f0.f302826a;
    }
}
