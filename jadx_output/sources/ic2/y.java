package ic2;

/* loaded from: classes10.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f290379d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f290380e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290381f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290382g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f290383h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f290384i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ic2.z f290385m;

    public y(java.util.Map map, int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, kotlin.jvm.internal.h0 h0Var, ic2.z zVar) {
        this.f290379d = map;
        this.f290380e = i17;
        this.f290381f = str;
        this.f290382g = str2;
        this.f290383h = str3;
        this.f290384i = h0Var;
        this.f290385m = zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ic2.z, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map = this.f290379d;
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.force_push_info");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.msg_type");
        if (str2 == null) {
            str2 = "";
        }
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.sessionbuffer");
        java.lang.String str4 = str3 == null ? "" : str3;
        if ((str.length() > 0 ? str : null) == null) {
            return;
        }
        java.lang.String str5 = this.f290381f;
        java.lang.String str6 = this.f290382g;
        java.lang.String str7 = this.f290383h;
        kotlin.jvm.internal.h0 h0Var = this.f290384i;
        int i17 = this.f290380e;
        ?? r112 = this.f290385m;
        try {
            if (i17 != 1) {
                r112.getClass();
                com.tencent.mars.xlog.Log.i("FinderLiveNotifyMsgInterceptor", "dont show force notify,case live has end.");
                return;
            }
            try {
                cl0.g gVar = new cl0.g(str);
                java.lang.String optString = gVar.optString("description");
                long optLong = gVar.optLong("expiredTime");
                cl0.g gVar2 = new cl0.g(gVar.optString("extinfo"));
                java.lang.String optString2 = gVar2.optString("auth_icon_url");
                java.lang.String str8 = optString2 == null ? "" : optString2;
                java.lang.String optString3 = gVar2.optString("nickname");
                java.lang.String str9 = optString3 == null ? "" : optString3;
                java.lang.String optString4 = gVar2.optString("notify_wording");
                java.lang.String str10 = optString4 == null ? "" : optString4;
                gVar2.optString("start_time");
                java.lang.String optString5 = gVar.optString("subject");
                java.lang.String str11 = optString5 == null ? "" : optString5;
                java.lang.String optString6 = gVar.optString("forcePushId");
                java.lang.String optString7 = gVar.optString("userIcon");
                java.lang.String optString8 = gVar.optString("userName");
                kotlin.jvm.internal.o.d(optString8);
                if (optString8.length() == 0) {
                    java.lang.String str12 = (java.lang.String) map.get(".msg.appmsg.extinfo.notifymsg.tipsinfo.finder_username");
                    optString8 = str12 == null ? "" : str12;
                }
                i50.o oVar = (i50.o) i95.n0.c(i50.o.class);
                kotlin.jvm.internal.o.d(optString6);
                kotlin.jvm.internal.o.d(optString7);
                kotlin.jvm.internal.o.d(optString);
                kotlin.jvm.internal.o.d(str5);
                kotlin.jvm.internal.o.d(str6);
                kotlin.jvm.internal.o.d(str7);
                i50.p Ai = ((h50.i) oVar).Ai(optString6, optString7, str9, optString, str5, str6, str7, str10, str8, str11, optString8, (java.lang.String) h0Var.f310123d, str2, com.tencent.mm.sdk.platformtools.t8.D1(str2, 0), str4);
                if (optLong <= 0 || optLong >= c01.id.e()) {
                    ((h50.i) ((i50.o) i95.n0.c(i50.o.class))).getClass();
                    ((h13.l0) i95.n0.c(h13.l0.class)).aj((i13.o) Ai);
                } else {
                    r112.getClass();
                    com.tencent.mars.xlog.Log.i("FinderLiveNotifyMsgInterceptor", "has expired, not force push, expiredTime = " + optLong);
                }
            } catch (java.lang.Exception e17) {
                e = e17;
                map = r112;
                str = "FinderLiveNotifyMsgInterceptor";
                map.getClass();
                com.tencent.mars.xlog.Log.i(str, "force notify exception:" + e.getMessage());
            }
        } catch (java.lang.Exception e18) {
            e = e18;
        }
    }
}
