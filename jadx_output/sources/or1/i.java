package or1;

/* loaded from: classes12.dex */
public class i implements or1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI f347504a;

    public i(com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI bizSearchDetailPageUI) {
        this.f347504a = bizSearchDetailPageUI;
    }

    @Override // or1.l
    public void a(or1.m mVar, fb5.c cVar, int i17, java.lang.String str, int i18, int i19) {
        com.tencent.mm.plugin.brandservice.ui.BizSearchDetailPageUI bizSearchDetailPageUI = this.f347504a;
        if (bizSearchDetailPageUI.f93978i == 1 && cVar.f260881a == 5) {
            r45.xp xpVar = (r45.xp) cVar.f260882b;
            r45.pp ppVar = xpVar.f390299e;
            if (ppVar == null || ppVar.f383263f == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BrandService.BizSearchDetailPageUI", "bcdItem.ContactItem == null || bcdItem.ContactItem.ContactItem == null");
                return;
            }
            r45.qp j17 = mVar.j(i19);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            java.lang.String str2 = bizSearchDetailPageUI.f93976g;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            java.lang.String str3 = "";
            if (str2 == null) {
                str2 = "";
            }
            sb6.append(str2);
            sb6.append(",");
            sb6.append(i17);
            sb6.append(",");
            sb6.append(str == null ? "" : str);
            sb6.append(",");
            sb6.append(i18);
            sb6.append(",");
            sb6.append(mVar.f347534q);
            sb6.append(",");
            if (j17 != null) {
                str3 = j17.f384160m + ",1";
            }
            sb6.append(str3);
            java.lang.String sb7 = sb6.toString();
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.kvStat(10866, sb7);
            if ((xpVar.f390299e.f383263f.f375621n & 8) > 0) {
                g0Var.kvStat(10298, str + ",35");
            }
        }
    }
}
