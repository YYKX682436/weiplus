package sb2;

/* loaded from: classes2.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.zf f405426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f405427e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f405428f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(com.tencent.mm.plugin.finder.convert.zf zfVar, in5.s0 s0Var, android.content.Intent intent) {
        super(0);
        this.f405426d = zfVar;
        this.f405427e = s0Var;
        this.f405428f = intent;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f405427e;
        java.lang.Object obj = s0Var.f293125i;
        kotlin.jvm.internal.o.f(obj, "getAssociatedObject(...)");
        android.content.Intent intent = this.f405428f;
        this.f405426d.S1((so2.j5) obj, s0Var, true, intent);
        return jz5.f0.f302826a;
    }
}
