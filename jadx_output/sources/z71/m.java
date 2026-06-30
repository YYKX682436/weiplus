package z71;

@j95.b
/* loaded from: classes8.dex */
public class m extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public long f470533d = 0;

    /* renamed from: e, reason: collision with root package name */
    public boolean f470534e = false;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.AiWeixinGpsInfoStruct f470535f = null;

    public static z71.m wi() {
        return (z71.m) i95.n0.c(z71.m.class);
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        c81.b wi6 = c81.b.wi();
        wi6.requireAccountInitialized();
        com.tencent.mm.sdk.platformtools.o4 a17 = wi6.f39656d.a();
        java.lang.String string = a17 != null ? a17.getString("last_gps_info", "") : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            this.f470535f = new com.tencent.mm.autogen.mmdata.rpt.AiWeixinGpsInfoStruct();
        } else {
            this.f470535f = new com.tencent.mm.autogen.mmdata.rpt.AiWeixinGpsInfoStruct(string);
        }
    }
}
