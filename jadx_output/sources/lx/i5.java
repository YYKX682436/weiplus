package lx;

/* loaded from: classes11.dex */
public final class i5 implements ft.p4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f321808a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321809b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321810c;

    public i5(lx.m5 m5Var, java.lang.String str, yz5.l lVar) {
        this.f321808a = m5Var;
        this.f321809b = str;
        this.f321810c = lVar;
    }

    @Override // ft.p4
    public void a(java.lang.String str, java.lang.String str2) {
        lx.m5.a(this.f321808a);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizPublishPlugin", "launchMapMiniProgramWithCallback onDataCallback: appId=" + str + ", value=" + str2);
        ((xc1.t) ((ft.q4) i95.n0.c(ft.q4.class))).Bi(this.f321809b, this);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        if (str2 == null) {
            str2 = "";
        }
        this.f321810c.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(str2)));
    }
}
