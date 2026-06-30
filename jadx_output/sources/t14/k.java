package t14;

/* loaded from: classes11.dex */
public final class k implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t14.q f414581a;

    public k(t14.q qVar) {
        this.f414581a = qVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[5];
        t14.q qVar = this.f414581a;
        lVarArr[0] = new jz5.l("page_name_kv", qVar.T6());
        lVarArr[1] = new jz5.l("setting_from_source", java.lang.Integer.valueOf(qVar.getIntent().getIntExtra("setting_from_source", 2)));
        lVarArr[2] = new jz5.l("ui_version", java.lang.Integer.valueOf(qVar.getIntent().getIntExtra("ui_version", 1)));
        android.content.Intent intent = qVar.getIntent();
        androidx.appcompat.app.AppCompatActivity activity = qVar.getActivity();
        com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference mMReportPreference = activity instanceof com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference ? (com.tencent.mm.plugin.setting.ui.setting.report.MMReportPreference) activity : null;
        lVarArr[3] = new jz5.l("setting_level", java.lang.Integer.valueOf(intent.getIntExtra("setting_level", mMReportPreference != null ? mMReportPreference.V6() : 0)));
        lVarArr[4] = new jz5.l("setting_sessionid", u24.n.b());
        return kz5.c1.k(lVarArr);
    }
}
