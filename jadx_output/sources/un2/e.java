package un2;

/* loaded from: classes10.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.f f429459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ un2.k f429460e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.tencent.mm.modelbase.f fVar, un2.k kVar) {
        super(0);
        this.f429459d = fVar;
        this.f429460e = kVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        un2.k kVar;
        boolean z17 = false;
        un2.k kVar2 = this.f429460e;
        com.tencent.mm.modelbase.f fVar = this.f429459d;
        if (fVar != null) {
            int i17 = fVar.f70616b;
            int i18 = fVar.f70615a;
            java.lang.String str = fVar.f70617c;
            if (i17 != -4014) {
                long j17 = ((r45.z41) fVar.f70618d).getLong(3);
                long j18 = ((r45.z41) fVar.f70618d).getLong(4);
                if (i18 != 4 || j17 <= 0 || j17 >= j18 || j17 <= kVar2.f429474d) {
                    kVar = kVar2;
                    kVar.f429476f = false;
                } else {
                    long j19 = 1000;
                    kVar = kVar2;
                    un2.k.a(kVar, (int) (j17 / j19), (int) (j18 / j19));
                    kVar.f429474d = j17;
                    kVar.f429475e = j18;
                    kVar.f429476f = true;
                }
                com.tencent.mars.xlog.Log.e("FinderBulletLoader", "onGetBulletCgiFailure: errType=" + i18 + ", errCode=" + i17 + ", errMsg=" + str + "hasMore=" + kVar.f429476f + ", minBulletTime=" + j17 + ", maxBulletTime=" + j18);
                z17 = false;
                kVar.f429477g = z17;
                return jz5.f0.f302826a;
            }
            android.content.Context context = kVar2.f429478h;
            if (context != null) {
                com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(context);
                u1Var.g(context.getString(com.tencent.mm.R.string.own));
                u1Var.a(true);
                u1Var.l(un2.d.f429458a);
                u1Var.q(false);
            }
            kVar2.f429480j = null;
        }
        kVar = kVar2;
        kVar.f429477g = z17;
        return jz5.f0.f302826a;
    }
}
