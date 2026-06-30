package zo1;

/* loaded from: classes5.dex */
public final class o2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI f474716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wo1.i1 f474718g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.ui.widget.dialog.u3 u3Var, com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI, java.lang.String str, wo1.i1 i1Var) {
        super(2);
        this.f474715d = u3Var;
        this.f474716e = packageManagerUI;
        this.f474717f = str;
        this.f474718g = i1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        pm0.v.X(new zo1.n2(this.f474715d, ((java.lang.Number) obj).intValue(), this.f474716e, this.f474717f, (com.tencent.wechat.aff.affroam.g) obj2, this.f474718g));
        return jz5.f0.f302826a;
    }
}
