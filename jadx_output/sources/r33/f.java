package r33;

/* loaded from: classes8.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f368977a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f368978b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f368979c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f368980d;

    public f(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CgiGetLaunchGameInfo", "CgiGetLaunchGameInfo appId:%s, url:%s", str, str2);
        this.f368977a = str;
        this.f368978b = str2;
        this.f368979c = str3;
    }

    public final void a(int i17, m53.t3 t3Var, m33.h1 h1Var) {
        m53.x4 x4Var = new m53.x4();
        x4Var.f324175d = this.f368980d;
        x4Var.f324177f = t3Var.f324072d;
        x4Var.f324176e = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = x4Var;
        lVar.f70665b = new m53.y4();
        lVar.f70666c = "/cgi-bin/mmgame-bin/reportdistributestainid";
        lVar.f70667d = 5070;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        java.lang.String str = this.f368977a;
        java.lang.String str2 = this.f368978b;
        ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(a17, new r33.e(this, h1Var, i17, str, str2, t3Var));
    }
}
