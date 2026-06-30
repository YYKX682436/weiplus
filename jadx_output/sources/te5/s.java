package te5;

/* loaded from: classes9.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418735d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f418736e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f418737f;

    /* renamed from: g, reason: collision with root package name */
    public long f418738g;

    /* renamed from: h, reason: collision with root package name */
    public int f418739h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ x05.k f418740i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f418741m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.View f418742n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ long f418743o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f418744p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x05.k kVar, long j17, android.view.View view, long j18, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f418740i = kVar;
        this.f418741m = j17;
        this.f418742n = view;
        this.f418743o = j18;
        this.f418744p = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new te5.s(this.f418740i, this.f418741m, this.f418742n, this.f418743o, this.f418744p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((te5.s) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String authContent;
        java.lang.Object a17;
        long j17;
        android.view.View view;
        x05.k kVar;
        java.lang.String headUrl;
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f418739h;
        sl2.h hVar = sl2.h.f409251a;
        long j18 = this.f418741m;
        android.view.View view2 = this.f418742n;
        x05.k kVar2 = this.f418740i;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
            r45.g92 a18 = zy2.e5.a(kVar2);
            android.content.Context context = view2.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            this.f418735d = view2;
            authContent = this.f418744p;
            this.f418736e = authContent;
            this.f418737f = kVar2;
            this.f418738g = j18;
            this.f418739h = 1;
            ((com.tencent.mm.feature.finder.live.v4) w0Var).getClass();
            a17 = hVar.a(a18, context, this);
            if (a17 == aVar) {
                return aVar;
            }
            j17 = j18;
            view = view2;
            kVar = kVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            long j19 = this.f418738g;
            x05.k kVar3 = (x05.k) this.f418737f;
            java.lang.String str2 = (java.lang.String) this.f418736e;
            android.view.View view3 = (android.view.View) this.f418735d;
            kotlin.ResultKt.throwOnFailure(obj);
            view = view3;
            authContent = str2;
            a17 = obj;
            kVar = kVar3;
            j17 = j19;
        }
        boolean booleanValue = ((java.lang.Boolean) a17).booleanValue();
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!booleanValue) {
            s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
            java.lang.String s17 = kVar.s();
            ((com.tencent.mm.feature.finder.live.v4) w0Var2).getClass();
            kotlin.jvm.internal.o.g(authContent, "authContent");
            hVar.d((android.app.Activity) context2, j17, authContent, s17);
            return f0Var;
        }
        if (j18 != 0) {
            boolean Zi = ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Zi(kVar2.getFinderUsername(), view2.findViewById(com.tencent.mm.R.id.f4x), view2.findViewById(com.tencent.mm.R.id.f7y), this.f418743o);
            boolean vk6 = ((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).vk(null, "chat");
            if (!Zi || vk6) {
                java.lang.String finderUsername = kVar2.getFinderUsername();
                boolean z17 = finderUsername == null || finderUsername.length() == 0;
                long j27 = this.f418743o;
                if (!z17) {
                    if (com.tencent.mm.sdk.platformtools.t8.D0(kVar2.getFinderUsername(), ((k40.f) ((l40.e) i95.n0.c(l40.e.class))).Ui(view2.getContext()))) {
                        android.content.Intent intent = new android.content.Intent();
                        intent.putExtra("KEY_PARAMS_SOURCE_TYPE", kVar2.getSourceType());
                        s40.w0 w0Var3 = (s40.w0) i95.n0.c(s40.w0.class);
                        android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        long j28 = this.f418741m;
                        java.lang.Long l17 = new java.lang.Long(j27);
                        java.lang.String B = kVar2.B();
                        ((com.tencent.mm.feature.finder.live.v4) w0Var3).oj(intent, context3, j28, l17, B == null ? "" : B, kVar2.s(), "", "", "");
                    }
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelperKt", "onQuoteLiveMsgClick livestate: " + kVar2.getLiveStatus());
                android.content.Context context4 = view2.getContext();
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                android.content.Intent intent2 = new android.content.Intent();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelperKt", "enterFinderLiveVisitorUI feedId:" + pm0.v.u(j18) + ", liveId:" + pm0.v.u(j27));
                java.lang.String Gj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(3, 2, 65);
                intent2.putExtra("CURRENT_FEED_ID", j18);
                intent2.putExtra("key_enter_live_param_bind_type", kVar2.k());
                java.lang.String bizUsername = kVar2.getBizUsername();
                if (bizUsername == null) {
                    bizUsername = "";
                }
                intent2.putExtra("key_enter_live_param_by_biz_username", bizUsername);
                java.lang.String bizNickname = kVar2.getBizNickname();
                if (bizNickname == null) {
                    bizNickname = "";
                }
                intent2.putExtra("key_enter_live_param_by_biz_nickname", bizNickname);
                x05.n K = kVar2.K();
                java.lang.String coverUrl = K != null ? K.getCoverUrl() : null;
                if (coverUrl == null || coverUrl.length() == 0) {
                    java.lang.String headUrl2 = kVar2.getHeadUrl();
                    headUrl = !(headUrl2 == null || headUrl2.length() == 0) ? kVar2.getHeadUrl() : "";
                } else {
                    x05.n K2 = kVar2.K();
                    headUrl = K2 != null ? K2.getCoverUrl() : null;
                }
                intent2.putExtra("key_enter_live_cover_url", headUrl);
                x05.o E = kVar2.E();
                if (E == null || (str = E.j()) == null) {
                    str = "";
                }
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_DISCOUNT_ACTIVITY_KEY", str);
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_SOURCE", 7);
                r45.m84 m84Var = new r45.m84();
                m84Var.set(0, java.lang.Long.valueOf(j18));
                m84Var.set(1, java.lang.Long.valueOf(j27));
                java.lang.String B2 = kVar2.B();
                if (B2 == null) {
                    B2 = "";
                }
                m84Var.set(2, B2);
                java.lang.String finderUsername2 = kVar2.getFinderUsername();
                if (finderUsername2 == null) {
                    finderUsername2 = "";
                }
                m84Var.set(3, finderUsername2);
                m84Var.set(4, "");
                m84Var.set(5, kVar2.s());
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, Gj);
                wk0Var.set(1, "");
                wk0Var.set(3, -1);
                wk0Var.set(4, -1);
                wk0Var.set(5, 1);
                wk0Var.set(7, new r45.ta4());
                ((vd2.f1) ((ss5.e0) i95.n0.c(ss5.e0.class))).Ri(context4, intent2, m84Var, false, wk0Var, null);
            } else {
                android.content.Context context5 = view2.getContext();
                kotlin.jvm.internal.o.f(context5, "getContext(...)");
                long j29 = this.f418741m;
                long j37 = this.f418743o;
                java.lang.String Gj2 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Gj(3, 2, 65);
                int n17 = kVar2.n();
                ((vd2.d5) ((ss5.i0) i95.n0.c(ss5.i0.class))).Vi(false, j29, ya.a.SHARE, ((n17 == 2 || n17 == 8 || n17 == 16) || kVar2.n() == 6) ? 1 : 2, 1);
                ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                android.content.Intent b17 = vd2.t3.f435921a.b(null, ya.a.SHARE, 1);
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemHelperKt", "jumpToReplayLive validStatus");
                ss5.i0 i0Var = (ss5.i0) i95.n0.c(ss5.i0.class);
                java.lang.String finderUsername3 = kVar2.getFinderUsername();
                java.lang.String str3 = finderUsername3 == null ? "" : finderUsername3;
                java.lang.String B3 = kVar2.B();
                ((vd2.d5) i0Var).wi(b17, context5, j29, j37, str3, B3 == null ? "" : B3, kVar2.s(), Gj2, ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Ck());
            }
        }
        return f0Var;
    }
}
