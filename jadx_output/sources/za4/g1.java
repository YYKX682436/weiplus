package za4;

/* loaded from: classes4.dex */
public class g1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f471090a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f471091b;

    /* renamed from: c, reason: collision with root package name */
    public int f471092c;

    /* renamed from: d, reason: collision with root package name */
    public int f471093d;

    /* renamed from: e, reason: collision with root package name */
    public int f471094e;

    /* renamed from: f, reason: collision with root package name */
    public int f471095f;

    /* renamed from: g, reason: collision with root package name */
    public int f471096g;

    /* renamed from: h, reason: collision with root package name */
    public int f471097h;

    /* renamed from: i, reason: collision with root package name */
    public int f471098i;

    /* renamed from: j, reason: collision with root package name */
    public int f471099j;

    /* renamed from: k, reason: collision with root package name */
    public int f471100k;

    /* renamed from: l, reason: collision with root package name */
    public int f471101l;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f471102m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f471103n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f471104o;

    /* renamed from: r, reason: collision with root package name */
    public int f471107r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f471108s;

    /* renamed from: t, reason: collision with root package name */
    public long f471109t;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f471105p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f471106q = "";

    /* renamed from: u, reason: collision with root package name */
    public final org.json.JSONArray f471110u = new org.json.JSONArray();

    public void a(java.lang.String str) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("appendExtra", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesReportInfo");
        if (!android.text.TextUtils.isEmpty(str)) {
            if (this.f471105p.length() > 0) {
                this.f471105p += "&";
            }
            this.f471105p += java.net.URLEncoder.encode(str);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("appendExtra", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPagesReportInfo");
    }
}
