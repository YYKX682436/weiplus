package w41;

/* loaded from: classes4.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f442877d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f442878e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        super(1);
        this.f442877d = u3Var;
        this.f442878e = y1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f442877d.hide();
        w41.u.a(w41.u.f442888a, booleanValue, this.f442878e);
        return jz5.f0.f302826a;
    }
}
