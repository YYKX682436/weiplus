package te2;

/* loaded from: classes.dex */
public final class ma extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k0 f418236d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.hc f418237e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma(com.tencent.mm.ui.widget.dialog.k0 k0Var, te2.hc hcVar) {
        super(1);
        this.f418236d = k0Var;
        this.f418237e = hcVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        this.f418236d.u();
        te2.hc hcVar = this.f418237e;
        pf5.e.launchUI$default(hcVar, null, null, new te2.la(hcVar, (java.lang.String) obj, null), 3, null);
        return jz5.f0.f302826a;
    }
}
