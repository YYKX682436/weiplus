package sr2;

/* loaded from: classes10.dex */
public final class v5 extends com.tencent.mm.ui.component.UIComponent implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f411743d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f411744e;

    /* renamed from: f, reason: collision with root package name */
    public int f411745f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f411746g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f411747h;

    /* renamed from: i, reason: collision with root package name */
    public sr2.p5 f411748i;

    /* renamed from: m, reason: collision with root package name */
    public int f411749m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f411750n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411749m = -1;
        this.f411750n = "";
    }

    public final void O6(int i17, java.lang.String str, int i18) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            if (i17 == 0) {
                jSONObject.put("topic_num", this.f411745f);
            } else {
                jSONObject.put("topic", str);
                jSONObject.put("num", i18);
            }
        } catch (org.json.JSONException unused) {
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        com.tencent.mm.plugin.finder.report.b6.d(com.tencent.mm.plugin.finder.report.b6.f124969a, nyVar != null ? nyVar.V6() : null, "post_comm_topic_page", i17, jSONObject, false, null, 48, null);
    }

    public final void P6() {
        pq5.g l17 = new db2.s2(1, xy2.c.e(getActivity())).l();
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        l17.f((com.tencent.mm.ui.MMActivity) activity);
        l17.K(new sr2.u5(this));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        P6();
    }

    @Override // ya2.r1
    public void w4(m92.b account) {
        kotlin.jvm.internal.o.g(account, "account");
        this.f411744e = false;
        P6();
    }
}
