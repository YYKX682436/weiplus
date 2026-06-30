package t14;

/* loaded from: classes11.dex */
public final class p extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t14.q f414587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f414588e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(t14.q qVar, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        super(0);
        this.f414587d = qVar;
        this.f414588e = appCompatActivity;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        t14.s sVar;
        t14.q qVar = this.f414587d;
        j75.f Q6 = qVar.Q6();
        if (Q6 == null || (sVar = (t14.s) Q6.getState()) == null) {
            return null;
        }
        for (t14.u uVar : kz5.n0.S0(((java.util.LinkedHashMap) sVar.f414592e).values())) {
            java.lang.String str = uVar.f414594b;
            if (str == null) {
                str = "";
            }
            java.lang.String str2 = uVar.f414595c;
            if ((!r26.n0.N(str)) && (!r26.n0.N(str2)) && !kotlin.jvm.internal.o.b(str, str2)) {
                jz5.l[] lVarArr = new jz5.l[8];
                lVarArr[0] = new jz5.l("page_name_kv", qVar.T6());
                lVarArr[1] = new jz5.l("view_name_kv", uVar.f414593a);
                lVarArr[2] = new jz5.l("switch_status_before", str);
                lVarArr[3] = new jz5.l("switch_status_after", str2);
                lVarArr[4] = new jz5.l("setting_sessionid", u24.n.b());
                android.content.Intent intent = qVar.getIntent();
                androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f414588e;
                com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference mMReportPreference = appCompatActivity instanceof com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference ? (com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference) appCompatActivity : null;
                lVarArr[5] = new jz5.l("setting_level", java.lang.Integer.valueOf(intent.getIntExtra("setting_level", mMReportPreference != null ? mMReportPreference.V6() : 0)));
                lVarArr[6] = new jz5.l("ui_version", java.lang.Integer.valueOf(qVar.getIntent().getIntExtra("ui_version", 1)));
                lVarArr[7] = new jz5.l("switch_button_type", 0);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("setting_switch_succeed", null, kz5.c1.l(lVarArr), 33328);
            }
        }
        return jz5.f0.f302826a;
    }
}
