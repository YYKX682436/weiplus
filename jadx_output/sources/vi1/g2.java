package vi1;

/* loaded from: classes7.dex */
public final class g2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.i2 f437323d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(vi1.i2 i2Var) {
        super(1);
        this.f437323d = i2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem it = (com.tencent.mm.plugin.appbrand.phonenumber.PhoneItem) obj;
        kotlin.jvm.internal.o.g(it, "it");
        vi1.h0 h0Var = this.f437323d.f437331a;
        if (h0Var != null) {
            vi1.b2 b2Var = (vi1.b2) h0Var;
            b2Var.f437282f.add(it);
            java.util.ArrayList arrayList = b2Var.f437281e;
            arrayList.remove(it);
            vi1.i0 i0Var = b2Var.f437280d;
            if (i0Var != null) {
                ((vi1.i2) i0Var).a(b2Var.f437283g, arrayList);
            }
        }
        return jz5.f0.f302826a;
    }
}
