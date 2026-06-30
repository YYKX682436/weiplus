package pk2;

/* loaded from: classes3.dex */
public final class ba extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(pk2.o9 o9Var) {
        super(1);
        this.f355588d = o9Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.e3 e3Var;
        com.tencent.mm.plugin.finder.view.e3 e3Var2;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        pk2.o9 o9Var = this.f355588d;
        if (booleanValue) {
            pk2.d9 d9Var = o9Var.f356082f;
            if (d9Var != null && (e3Var2 = d9Var.f355663f) != null) {
                e3Var2.i();
            }
        } else {
            pk2.d9 d9Var2 = o9Var.f356082f;
            if (d9Var2 != null && (e3Var = d9Var2.f355663f) != null) {
                e3Var.f131965o = true;
                e3Var.h();
            }
        }
        return jz5.f0.f302826a;
    }
}
