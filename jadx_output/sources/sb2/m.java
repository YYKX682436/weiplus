package sb2;

/* loaded from: classes3.dex */
public final class m extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f405423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f405424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405425f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Intent intent, com.tencent.mm.plugin.finder.convert.zf zfVar, in5.s0 s0Var) {
        super(3);
        this.f405423d = intent;
        this.f405424e = zfVar;
        this.f405425f = s0Var;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent it = (android.content.Intent) obj3;
        kotlin.jvm.internal.o.g((ug5.v) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g(it, "it");
        android.content.Intent intent = this.f405423d;
        intent.putExtras(it);
        in5.s0 s0Var = this.f405425f;
        java.lang.Object obj4 = s0Var.f293125i;
        kotlin.jvm.internal.o.f(obj4, "getAssociatedObject(...)");
        this.f405424e.S1((so2.j5) obj4, s0Var, booleanValue, intent);
        return jz5.f0.f302826a;
    }
}
