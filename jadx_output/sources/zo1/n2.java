package zo1;

/* loaded from: classes5.dex */
public final class n2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f474698d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f474699e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI f474700f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474701g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.affroam.g f474702h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wo1.i1 f474703i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(com.tencent.mm.ui.widget.dialog.u3 u3Var, int i17, com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI, java.lang.String str, com.tencent.wechat.aff.affroam.g gVar, wo1.i1 i1Var) {
        super(0);
        this.f474698d = u3Var;
        this.f474699e = i17;
        this.f474700f = packageManagerUI;
        this.f474701g = str;
        this.f474702h = gVar;
        this.f474703i = i1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f474698d.hide();
        ((com.tencent.mm.plugin.backup.roambackup.p1) ((mv.y) i95.n0.c(mv.y.class))).Di("packagesUpdated", "");
        if (this.f474699e == 0) {
            com.tencent.mm.plugin.backup.roambackup.ui.pkg.PackageManagerUI packageManagerUI = this.f474700f;
            android.widget.TextView textView = packageManagerUI.f92840f;
            if (textView == null) {
                kotlin.jvm.internal.o.o("nameTv");
                throw null;
            }
            textView.setText(this.f474701g);
            com.tencent.wechat.aff.affroam.g gVar = this.f474702h;
            if (gVar == null && (gVar = packageManagerUI.f92839e) == null) {
                kotlin.jvm.internal.o.o("pkgInfo");
                throw null;
            }
            packageManagerUI.f92839e = gVar;
            this.f474703i.hide();
        }
        return jz5.f0.f302826a;
    }
}
