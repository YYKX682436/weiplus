package w41;

/* loaded from: classes4.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f442879d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f442880e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        super(1);
        this.f442879d = u3Var;
        this.f442880e = y1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        this.f442879d.hide();
        w41.u.a(w41.u.f442888a, booleanValue, this.f442880e);
        return jz5.f0.f302826a;
    }
}
