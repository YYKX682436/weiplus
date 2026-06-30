package gs5;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275147e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275148f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275149g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275150h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f275151i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275152m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f275153n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f275154o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275155p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275156q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ long f275157r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ long f275158s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f275159t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f275160u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f275161v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275162w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f275163x;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, long j17, java.lang.String str6, long j18, long j19, java.lang.String str7, java.lang.String str8, long j27, long j28, int i17, boolean z17, int i18, java.lang.String str9, java.lang.String str10) {
        this.f275146d = str;
        this.f275147e = str2;
        this.f275148f = str3;
        this.f275149g = str4;
        this.f275150h = str5;
        this.f275151i = j17;
        this.f275152m = str6;
        this.f275153n = j18;
        this.f275154o = j19;
        this.f275155p = str7;
        this.f275156q = str8;
        this.f275157r = j27;
        this.f275158s = j28;
        this.f275159t = i17;
        this.f275160u = z17;
        this.f275161v = i18;
        this.f275162w = str9;
        this.f275163x = str10;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.net.HttpURLConnection httpURLConnection;
        java.net.HttpURLConnection httpURLConnection2 = null;
        try {
            android.telephony.TelephonyManager telephonyManager = (android.telephony.TelephonyManager) kr5.p.f311570a.getSystemService("phone");
            try {
                if (telephonyManager != null && 5 == telephonyManager.getSimState()) {
                    str = telephonyManager.getSimOperator();
                    java.net.URL url = new java.net.URL(("https://h.trace.qq.com/kv?attaid=0f500064192&token=4725229671&carrier=" + str + "&networkType=" + this.f275146d + "&dnsId=" + this.f275147e + "&appId=" + this.f275148f + "&encryptType=" + this.f275149g + "&eventName=" + this.f275150h + "&eventTime=" + this.f275151i + "&dnsIp=" + this.f275152m + "&sdkVersion=4.11.0a&deviceName=" + gs5.b.f275164a + "&systemName=Android&systemVersion=" + gs5.b.f275165b + "&spend=" + this.f275153n + "&ldns_spend=" + this.f275154o + "&req_dn=" + this.f275155p + "&req_type=" + this.f275156q + "&req_timeout=" + this.f275157r + "&req_query=&req_ttl=0&errorCode=" + this.f275158s + "&statusCode=" + this.f275159t + "&sessionId=" + gs5.b.f275166c + "&isCache=" + (this.f275160u ? 1 : 0) + "&count=" + this.f275161v + "&ldns=" + this.f275162w + "&hdns=" + this.f275163x + "&_dc=" + java.lang.Math.random()).replace(" ", "_"));
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("开始Atta上报：");
                    sb6.append(url);
                    or5.b.a(sb6.toString(), new java.lang.Object[0]);
                    httpURLConnection = (java.net.HttpURLConnection) url.openConnection();
                    httpURLConnection.setRequestMethod("GET");
                    httpURLConnection.setConnectTimeout(2000);
                    httpURLConnection.setReadTimeout(2000);
                    httpURLConnection.connect();
                    or5.b.a("Atta respCode：" + httpURLConnection.getResponseCode(), new java.lang.Object[0]);
                    httpURLConnection.disconnect();
                    or5.b.a("Atta上报关闭", new java.lang.Object[0]);
                    return;
                }
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setConnectTimeout(2000);
                httpURLConnection.setReadTimeout(2000);
                httpURLConnection.connect();
                or5.b.a("Atta respCode：" + httpURLConnection.getResponseCode(), new java.lang.Object[0]);
                httpURLConnection.disconnect();
                or5.b.a("Atta上报关闭", new java.lang.Object[0]);
                return;
            } catch (java.io.IOException unused) {
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    or5.b.a("Atta上报关闭", new java.lang.Object[0]);
                    return;
                }
                return;
            } catch (java.lang.Throwable th6) {
                th = th6;
                httpURLConnection2 = httpURLConnection;
                if (httpURLConnection2 != null) {
                    httpURLConnection2.disconnect();
                    or5.b.a("Atta上报关闭", new java.lang.Object[0]);
                }
                throw th;
            }
            str = "-1";
            java.net.URL url2 = new java.net.URL(("https://h.trace.qq.com/kv?attaid=0f500064192&token=4725229671&carrier=" + str + "&networkType=" + this.f275146d + "&dnsId=" + this.f275147e + "&appId=" + this.f275148f + "&encryptType=" + this.f275149g + "&eventName=" + this.f275150h + "&eventTime=" + this.f275151i + "&dnsIp=" + this.f275152m + "&sdkVersion=4.11.0a&deviceName=" + gs5.b.f275164a + "&systemName=Android&systemVersion=" + gs5.b.f275165b + "&spend=" + this.f275153n + "&ldns_spend=" + this.f275154o + "&req_dn=" + this.f275155p + "&req_type=" + this.f275156q + "&req_timeout=" + this.f275157r + "&req_query=&req_ttl=0&errorCode=" + this.f275158s + "&statusCode=" + this.f275159t + "&sessionId=" + gs5.b.f275166c + "&isCache=" + (this.f275160u ? 1 : 0) + "&count=" + this.f275161v + "&ldns=" + this.f275162w + "&hdns=" + this.f275163x + "&_dc=" + java.lang.Math.random()).replace(" ", "_"));
            java.lang.StringBuilder sb62 = new java.lang.StringBuilder("开始Atta上报：");
            sb62.append(url2);
            or5.b.a(sb62.toString(), new java.lang.Object[0]);
            httpURLConnection = (java.net.HttpURLConnection) url2.openConnection();
        } catch (java.io.IOException unused2) {
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }
}
