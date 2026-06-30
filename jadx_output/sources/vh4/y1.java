package vh4;

/* loaded from: classes9.dex */
public class y1 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437186a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437187b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f437188c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437189d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f437190e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.z3 f437191f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f437192g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f437193h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k f437194i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ vh4.t1 f437195j;

    public y1(vh4.t1 t1Var, java.lang.String str, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, com.tencent.mm.storage.z3 z3Var, byte[] bArr, android.content.Context context, com.tencent.mm.ui.widget.dialog.k kVar) {
        this.f437195j = t1Var;
        this.f437186a = str;
        this.f437187b = str2;
        this.f437188c = i17;
        this.f437189d = str3;
        this.f437190e = str4;
        this.f437191f = z3Var;
        this.f437192g = bArr;
        this.f437193h = context;
        this.f437194i = kVar;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        com.tencent.mm.ui.widget.dialog.k kVar = this.f437194i;
        vh4.t1 t1Var = this.f437195j;
        if (!z17) {
            t1Var.getClass();
            if (kVar != null) {
                kVar.a(false);
                return;
            }
            return;
        }
        ot0.q qVar = new ot0.q();
        qVar.f348654f = this.f437186a;
        qVar.f348658g = this.f437187b;
        qVar.f348674k = "https://support.weixin.qq.com/update/";
        qVar.f348734z = "http://wxapp.tc.qq.com/251/20304/stodownload?m=adb36df21d075a4c2148a2c0fc361304&filekey=30450201010420301e020200fb0402535a0410adb36df21d075a4c2148a2c0fc3613040202188a041e000000046274667300000001310000000861707073746f72650000000131&hy=SZ&storeid=32303231303932383030353631353030303362636238303062633631346565633763333930613030303030306662&dotrans=0&sourceflag=1&bizid=1023&adaptivelytrans=0";
        int i18 = this.f437188c;
        qVar.f348666i = i18 < 7 ? 84 : 103;
        rt0.e eVar = new rt0.e();
        eVar.f399379d = i18;
        eVar.f399378c = this.f437189d;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str2 = this.f437190e;
        if (str2 == null) {
            str2 = "";
        }
        eVar.f399380e = str2;
        qVar.f(eVar);
        ot0.k1 a17 = ot0.j1.a();
        com.tencent.mm.storage.z3 z3Var = this.f437191f;
        java.lang.String d17 = z3Var.d1();
        byte[] bArr = this.f437192g;
        ((ez.w0) a17).getClass();
        android.util.Pair I = com.tencent.mm.pluginsdk.model.app.k0.I(qVar, "", "", d17, "", bArr);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            ((dk5.s5) tg3.t1.a()).fj(z3Var.d1(), str, c01.e2.C(z3Var.d1()), 0);
        }
        long longValue = ((java.lang.Long) I.second).longValue();
        if (longValue > 0) {
            android.content.Context context = this.f437193h;
            new com.tencent.mm.sdk.platformtools.b4(new vh4.x1(this, longValue, db5.e1.Q(context, "", context.getString(com.tencent.mm.R.string.f490552yb), true, false, null), z17), true).c(0L, 1000L);
        } else {
            t1Var.getClass();
            if (kVar != null) {
                kVar.a(false);
            }
        }
    }
}
