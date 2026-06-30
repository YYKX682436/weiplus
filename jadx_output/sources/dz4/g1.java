package dz4;

/* loaded from: classes5.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dz4.q0 f245252d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f245253e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(dz4.q0 q0Var, java.lang.String str) {
        super(0);
        this.f245252d = q0Var;
        this.f245253e = str;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        dz4.o oVar = (dz4.o) this.f245252d;
        oVar.getClass();
        java.lang.String text = this.f245253e;
        kotlin.jvm.internal.o.g(text, "text");
        com.tencent.wechat.aff.wenote.i iVar = oVar.f245359a.f245310b;
        if (iVar != null) {
            iVar.m0(text);
        }
        return jz5.f0.f302826a;
    }
}
