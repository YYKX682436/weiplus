package x44;

/* loaded from: classes4.dex */
public final class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask f451905d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.WxaExposedParams f451906e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451907f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f451908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451909h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f451910i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451911m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451912n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f451913o;

    public v2(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask adLandingPageChattingTask, com.tencent.mm.plugin.appbrand.config.WxaExposedParams wxaExposedParams, java.lang.String str, android.content.Context context, java.lang.String str2, int i17, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f451905d = adLandingPageChattingTask;
        this.f451906e = wxaExposedParams;
        this.f451907f = str;
        this.f451908g = context;
        this.f451909h = str2;
        this.f451910i = i17;
        this.f451911m = str3;
        this.f451912n = str4;
        this.f451913o = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00d7  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r12 = this;
            java.lang.String r0 = "run"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.jsapi.adapter.impl.ServiceChatHelper$doEnterChatting$1$2"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            java.lang.String r3 = r12.f451909h
            java.lang.String r4 = "uxInfo"
            r2.put(r4, r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.o.f(r2, r3)
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            r4 = 67108864(0x4000000, float:1.5046328E-36)
            android.content.Intent r3 = r3.setFlags(r4)
            com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageChattingTask r4 = r12.f451905d
            java.lang.String r5 = r4.f165006g
            java.lang.String r6 = "Chat_User"
            android.content.Intent r3 = r3.putExtra(r6, r5)
            java.lang.String r5 = "app_brand_chatting_from_scene"
            r6 = 3
            android.content.Intent r3 = r3.putExtra(r5, r6)
            java.lang.String r5 = "app_brand_chatting_expose_params"
            com.tencent.mm.plugin.appbrand.config.WxaExposedParams r6 = r12.f451906e
            android.content.Intent r3 = r3.putExtra(r5, r6)
            java.lang.String r5 = "key_temp_session_from"
            java.lang.String r6 = r12.f451907f
            android.content.Intent r3 = r3.putExtra(r5, r6)
            java.lang.String r5 = "finish_direct"
            r6 = 1
            android.content.Intent r3 = r3.putExtra(r5, r6)
            java.lang.String r5 = "app_brand_chatting_from_scene_new"
            r7 = 4
            android.content.Intent r3 = r3.putExtra(r5, r7)
            java.lang.String r5 = com.tencent.mm.sdk.platformtools.z.f193105a
            boolean r5 = z65.c.a()
            java.lang.Class<e42.e0> r7 = e42.e0.class
            i95.m r7 = i95.n0.c(r7)
            e42.e0 r7 = (e42.e0) r7
            if (r7 == 0) goto L72
            e42.d0 r8 = e42.d0.clicfg_android_appbrand_contact_support_send_video
            h62.d r7 = (h62.d) r7
            boolean r5 = r7.fj(r8, r5)
        L72:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "isSupportSendVideo#get, "
            r7.<init>(r8)
            r7.append(r5)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "MicroMsg.AppBrandContactABTests"
            com.tencent.mars.xlog.Log.i(r8, r7)
            r7 = 0
            if (r5 != 0) goto L8f
            java.lang.String r5 = "key_need_send_video"
            r3.putExtra(r5, r7)
        L8f:
            java.lang.String r5 = "showMessageCard"
            int r8 = r12.f451910i
            if (r8 != r6) goto Lbc
            java.lang.String r8 = r12.f451911m
            java.lang.String r9 = r12.f451912n
            java.lang.String r10 = r12.f451913o
            java.lang.String[] r11 = new java.lang.String[]{r8, r9, r10}
            boolean r11 = com.tencent.mm.sdk.platformtools.t8.N0(r11)
            if (r11 != 0) goto Lbc
            r3.putExtra(r5, r6)
            java.lang.String r5 = "sendMessageTitle"
            r3.putExtra(r5, r8)
            java.lang.String r5 = "sendMessagePath"
            r3.putExtra(r5, r10)
            java.lang.String r5 = "sendMessageImg"
            r3.putExtra(r5, r9)
            goto Lbf
        Lbc:
            r3.putExtra(r5, r7)
        Lbf:
            java.lang.String r5 = "sns_landing_pages_ux_info"
            r3.putExtra(r5, r2)
            java.lang.String r5 = "open ServiceChattingUI， uxInfo = "
            java.lang.String r2 = r5.concat(r2)
            java.lang.String r5 = "SnsAdJs.ServiceChat"
            com.tencent.mars.xlog.Log.i(r5, r2)
            android.content.Context r2 = r12.f451908g
            boolean r5 = r2 instanceof x54.b
            if (r5 == 0) goto Le2
            r5 = r2
            x54.b r5 = (x54.b) r5
            x44.u2 r7 = new x44.u2
            r7.<init>(r2, r4)
            r5.L2(r6, r7)
        Le2:
            java.lang.String r4 = ".ui.chatting.AppBrandServiceChattingUI"
            j45.l.v(r2, r4, r3, r6)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x44.v2.run():void");
    }
}
