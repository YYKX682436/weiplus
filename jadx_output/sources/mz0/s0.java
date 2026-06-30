package mz0;

/* loaded from: classes5.dex */
public final class s0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f333039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(yz5.l lVar, mz0.b2 b2Var) {
        super(1);
        this.f333039d = lVar;
        this.f333040e = b2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f333039d.invoke(java.lang.Boolean.valueOf(booleanValue));
        if (!booleanValue) {
            android.app.Activity context = this.f333040e.getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) ((dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class))).f69789m.f245056g = "";
        }
        return jz5.f0.f302826a;
    }
}
