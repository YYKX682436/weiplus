package dw;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final dw.f f244070a = new dw.f();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f244071b;

    /* renamed from: c, reason: collision with root package name */
    public static final zv.r0 f244072c;

    /* renamed from: d, reason: collision with root package name */
    public static volatile java.lang.String f244073d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile boolean f244074e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f244075f;

    static {
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService_accounts");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        f244071b = R;
        f244072c = zv.r0.f476095a;
        f244073d = "";
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f244075f = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BrandServiceCreationCenterInfoUpdateEvent>(a0Var) { // from class: com.tencent.mm.feature.brandecs.digest.BrandEcsFlutterDigestHelper$brandServiceCreationCenterInfoUpdateEvent$1
            {
                this.__eventId = -2069781423;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BrandServiceCreationCenterInfoUpdateEvent brandServiceCreationCenterInfoUpdateEvent) {
                com.tencent.mm.autogen.events.BrandServiceCreationCenterInfoUpdateEvent event = brandServiceCreationCenterInfoUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                dw.f.f244070a.a();
                return false;
            }
        };
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x011a, code lost:
    
        if (r11 == null) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0407 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03cc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x02df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1171
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dw.f.a():void");
    }

    public final java.lang.String b(java.lang.String username, com.tencent.mm.storage.f9 info) {
        java.lang.String str;
        java.lang.String str2;
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(info, "info");
        if (info.getType() == -1879048173) {
            return dw.h.f244077a.a(info);
        }
        java.lang.String msgContent = username + ':' + info.j();
        zq1.c0 c0Var = (zq1.c0) i95.n0.c(zq1.c0.class);
        int type = info.getType();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((com.tencent.mm.booter.notification.b) c0Var).getClass();
        kotlin.jvm.internal.o.g(msgContent, "msgContent");
        java.lang.String l17 = qm.a0.l(0, "service_officialaccounts", msgContent, type, context);
        int L = r26.n0.L(l17, ":", 0, false, 6, null);
        if (L != -1) {
            str = l17.substring(0, L);
            kotlin.jvm.internal.o.f(str, "substring(...)");
            str2 = l17.substring(L + 1);
            kotlin.jvm.internal.o.f(str2, "substring(...)");
        } else {
            str = "";
            str2 = null;
        }
        return str + ':' + str2;
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandEcsFlutterDigestHelper", "subscribeEvent");
        com.tencent.wechat.aff.brand_service.a0 a0Var = com.tencent.wechat.aff.brand_service.a0.f216047b;
        a0Var.a(com.eclipsesource.mmv8.Platform.ANDROID, dw.a.f244065a);
        com.tencent.wechat.aff.brand_service.v.f216049c.v(com.eclipsesource.mmv8.Platform.ANDROID, dw.b.f244066a);
        a0Var.c(com.eclipsesource.mmv8.Platform.ANDROID, dw.c.f244067a);
        a0Var.b(com.eclipsesource.mmv8.Platform.ANDROID, dw.d.f244068a);
        a0Var.d(com.eclipsesource.mmv8.Platform.ANDROID, dw.e.f244069a);
        f244075f.alive();
    }
}
