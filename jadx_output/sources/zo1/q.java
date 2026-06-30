package zo1;

/* loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f474739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f474740f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.ui.widget.dialog.u3 u3Var, yz5.l lVar, int i17) {
        super(0);
        this.f474738d = u3Var;
        this.f474739e = lVar;
        this.f474740f = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f474738d.dismiss();
        this.f474739e.invoke(java.lang.Boolean.valueOf(this.f474740f == 0));
        return jz5.f0.f302826a;
    }
}
