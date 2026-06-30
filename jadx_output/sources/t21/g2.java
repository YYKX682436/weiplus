package t21;

/* loaded from: classes4.dex */
public class g2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414766d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f414767e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414768f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414769g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f414770h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414771i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414772m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f414773n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f414774o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ int f414775p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ int f414776q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414777r;

    public g2(java.lang.String str, java.lang.String[] strArr, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5, long j17, long j18, int i18, int i19, java.lang.String str6) {
        this.f414766d = str;
        this.f414767e = strArr;
        this.f414768f = str2;
        this.f414769g = str3;
        this.f414770h = i17;
        this.f414771i = str4;
        this.f414772m = str5;
        this.f414773n = j17;
        this.f414774o = j18;
        this.f414775p = i18;
        this.f414776q = i19;
        this.f414777r = str6;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2 = this.f414766d;
        com.tencent.mm.plugin.sight.base.b d17 = com.tencent.mm.plugin.sight.base.e.d(str2, true);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SubCoreMediaRpt", "get media info is null. %s", str2);
            return;
        }
        int k17 = (int) com.tencent.mm.vfs.w6.k(str2);
        java.lang.String[] strArr = this.f414767e;
        if (strArr != null) {
            java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer();
            for (java.lang.String str3 : strArr) {
                stringBuffer.append(str3);
                stringBuffer.append("|");
            }
            str = stringBuffer.toString();
        } else {
            str = null;
        }
        int iOSOldNetType = com.tencent.mars.comm.NetStatusUtil.getIOSOldNetType(com.tencent.mm.sdk.platformtools.x2.f193071a);
        java.lang.String Di = ((rx.a) ((sx.a0) i95.n0.c(sx.a0.class))).Di(str2);
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        stringBuffer2.append(this.f414768f);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f414769g);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f414770h);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f414771i);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f414772m);
        stringBuffer2.append(",");
        stringBuffer2.append(iOSOldNetType);
        stringBuffer2.append(",");
        stringBuffer2.append(Di);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f414773n);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f414774o);
        stringBuffer2.append(",");
        stringBuffer2.append(k17);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f162382a);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f162383b / 1000);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f162388g / 1000);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f162386e);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f162384c);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f162385d);
        stringBuffer2.append(",");
        stringBuffer2.append(str);
        stringBuffer2.append(",");
        stringBuffer2.append(d17.f162387f);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f414775p);
        stringBuffer2.append(",");
        stringBuffer2.append(this.f414776q);
        stringBuffer2.append(",");
        stringBuffer2.append(fo4.c.a(this.f414777r));
        com.tencent.mars.xlog.Log.i("MicroMsg.SubCoreMediaRpt", "download video rpt %s ", stringBuffer2.toString());
        new com.tencent.mm.autogen.mmdata.rpt.DownloadVideoInfoStruct(stringBuffer2.toString()).k();
    }
}
