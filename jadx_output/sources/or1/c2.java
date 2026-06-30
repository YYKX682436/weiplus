package or1;

/* loaded from: classes12.dex */
public class c2 implements or1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ or1.d2 f347470a;

    public c2(or1.d2 d2Var) {
        this.f347470a = d2Var;
    }

    @Override // or1.l
    public void a(or1.m mVar, fb5.c cVar, int i17, java.lang.String str, int i18, int i19) {
        or1.d2 d2Var = this.f347470a;
        r45.qp j17 = d2Var.j(i19);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str2 = d2Var.f347530m;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        sb6.append(str2);
        sb6.append(",");
        sb6.append(i17);
        sb6.append(",");
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append(",");
        sb6.append(i18);
        sb6.append(",");
        sb6.append(mVar.f347534q);
        sb6.append(",");
        if (j17 != null) {
            str3 = j17.f384160m + ",0";
        }
        sb6.append(str3);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10866, sb6.toString());
    }
}
