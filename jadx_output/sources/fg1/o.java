package fg1;

/* loaded from: classes7.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fg1.u f261876d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(fg1.u uVar) {
        super(1);
        this.f261876d = uVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        fg1.u uVar = this.f261876d;
        uVar.b().c(-1, -1);
        if (!booleanValue) {
            uVar.c(false);
        }
        return jz5.f0.f302826a;
    }
}
