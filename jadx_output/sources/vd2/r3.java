package vd2;

/* loaded from: classes3.dex */
public final class r3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f435880a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435881b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435882c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f435883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f435884e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435885f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f435886g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f435887h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.g0 f435888i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f435889j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f435890k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ vd2.g5 f435891l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f435892m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f435893n;

    public r3(long j17, java.lang.String str, java.lang.String str2, android.content.Intent intent, kotlin.jvm.internal.h0 h0Var, java.lang.String str3, kotlin.jvm.internal.c0 c0Var, boolean z17, kotlin.jvm.internal.g0 g0Var, java.lang.String str4, vd2.g5 g5Var, vd2.g5 g5Var2, kotlin.jvm.internal.h0 h0Var2, java.util.Map map) {
        this.f435880a = j17;
        this.f435881b = str;
        this.f435882c = str2;
        this.f435883d = intent;
        this.f435884e = h0Var;
        this.f435885f = str3;
        this.f435886g = c0Var;
        this.f435887h = z17;
        this.f435888i = g0Var;
        this.f435889j = str4;
        this.f435890k = g5Var;
        this.f435891l = g5Var2;
        this.f435892m = h0Var2;
        this.f435893n = map;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        long j17;
        boolean z17;
        boolean z18;
        vd2.g5 g5Var;
        r45.rp1 rp1Var;
        long j18;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        if (fVar.f70615a == 0 && fVar.f70616b == 0 && finderObject != null) {
            vd2.t3 t3Var = vd2.t3.f435921a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpLiveUI liveId: ");
            r45.nw1 liveInfo = finderObject.getLiveInfo();
            long j19 = this.f435880a;
            sb6.append(liveInfo != null ? liveInfo.getLong(0) : j19);
            sb6.append(", username:");
            java.lang.String username = finderObject.getUsername();
            java.lang.String str = this.f435881b;
            if (username == null) {
                username = str == null ? "" : str;
            }
            sb6.append(username);
            com.tencent.mars.xlog.Log.i("Finder.FinderUtilApi", sb6.toString());
            java.lang.String str2 = this.f435882c;
            boolean z19 = str2 == null || str2.length() == 0;
            android.content.Intent intent = this.f435883d;
            if (z19) {
                j17 = j19;
            } else {
                s40.w0 w0Var = (s40.w0) i95.n0.c(s40.w0.class);
                r45.nw1 liveInfo2 = finderObject.getLiveInfo();
                if (liveInfo2 != null) {
                    j18 = liveInfo2.getLong(0);
                    j17 = j19;
                } else {
                    j17 = j19;
                    j18 = 0;
                }
                ((com.tencent.mm.feature.finder.live.v4) w0Var).Ck(intent, str2, j18);
            }
            n30.q qVar = (n30.q) i95.n0.c(n30.q.class);
            kotlin.jvm.internal.h0 h0Var = this.f435884e;
            java.lang.String str3 = (java.lang.String) h0Var.f310123d;
            ((m30.m) qVar).getClass();
            a52.a.d(str3);
            java.lang.Object obj2 = h0Var.f310123d;
            ml2.q1 q1Var = ml2.q1.f327812e;
            if (!kotlin.jvm.internal.o.b(obj2, "temp_37")) {
                ((ml2.j0) ((zy2.zb) i95.n0.c(zy2.zb.class))).getClass();
                ml2.y4 y4Var = ml2.j0.f327583i;
                java.lang.String str4 = (java.lang.String) h0Var.f310123d;
                y4Var.getClass();
                kotlin.jvm.internal.o.g(str4, "<set-?>");
                y4Var.f328286a = str4;
            }
            android.content.Intent intent2 = intent == null ? new android.content.Intent() : intent;
            java.lang.String str5 = this.f435885f;
            intent2.putExtra("key_extra_info", str5);
            r45.nw1 liveInfo3 = finderObject.getLiveInfo();
            intent2.putExtra("KEY_ENTER_LIVE_PARAM_VR_LIVE_TYPE", liveInfo3 != null ? java.lang.Integer.valueOf(liveInfo3.getInteger(42)) : null);
            if (this.f435886g.f310112d) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 8);
            } else if (this.f435887h) {
                intent2.putExtra("KEY_PARAMS_DO_ACTION", 6);
            }
            long j27 = this.f435888i.f310121d;
            if (j27 > 0) {
                intent2.putExtra("KEY_PRODUCT_ID", j27);
            }
            r45.nw1 liveInfo4 = finderObject.getLiveInfo();
            if (liveInfo4 != null && (rp1Var = (r45.rp1) liveInfo4.getCustom(45)) != null) {
                intent2.putExtra("KEY_ENTER_LIVE_PARAM_LIVE_EVENT_INFO", rp1Var.toByteArray());
            }
            int i17 = intent != null && intent.hasExtra("KEY_MINI_APP_AD_FLOW_INFO") ? -1 : 1;
            java.lang.String str6 = str5.length() > 0 ? str5 : null;
            if (str6 != null) {
                java.lang.String username2 = finderObject.getUsername();
                if (username2 != null) {
                    str = username2;
                } else if (str == null) {
                    str = "";
                }
                p52.h.f352016a.f(str6, str);
            }
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            boolean D0 = com.tencent.mm.sdk.platformtools.t8.D0(xy2.c.e(context), finderObject.getUsername());
            java.lang.String str7 = this.f435889j;
            if (D0) {
                if (intent != null && intent.hasExtra("KEY_MINI_APP_AD_FLOW_INFO")) {
                    android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context2, context2.getResources().getString(com.tencent.mm.R.string.d2a), 0).show();
                    intent.removeExtra("KEY_MINI_APP_AD_FLOW_INFO");
                } else {
                    s40.w0 w0Var2 = (s40.w0) i95.n0.c(s40.w0.class);
                    android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    long id6 = finderObject.getId();
                    r45.nw1 liveInfo5 = finderObject.getLiveInfo();
                    if (liveInfo5 != null) {
                        j17 = liveInfo5.getLong(0);
                    }
                    java.lang.Long valueOf = java.lang.Long.valueOf(j17);
                    java.lang.String objectNonceId = finderObject.getObjectNonceId();
                    ((com.tencent.mm.feature.finder.live.v4) w0Var2).oj(intent2, context3, id6, valueOf, objectNonceId == null ? "" : objectNonceId, "", this.f435889j, finderObject.getSessionBuffer(), "");
                }
            } else {
                r45.wk0 wk0Var = new r45.wk0();
                wk0Var.set(0, str7);
                wk0Var.set(1, "");
                wk0Var.set(2, java.lang.Boolean.FALSE);
                wk0Var.set(3, -1);
                wk0Var.set(4, -1);
                wk0Var.set(5, java.lang.Integer.valueOf(i17));
                r45.ta4 ta4Var = new r45.ta4();
                byte[] bytes = ((java.lang.String) this.f435892m.f310123d).getBytes(r26.c.f368865a);
                kotlin.jvm.internal.o.f(bytes, "getBytes(...)");
                ta4Var.set(1, new com.tencent.mm.protobuf.g(bytes, 0, bytes.length));
                java.util.Map map = this.f435893n;
                java.lang.Object obj3 = map != null ? map.get("key_open_live_h5_buffer") : null;
                byte[] bArr = obj3 instanceof byte[] ? (byte[]) obj3 : null;
                if (bArr != null) {
                    ta4Var.set(36, com.tencent.mm.protobuf.g.b(bArr));
                }
                wk0Var.set(7, ta4Var);
                r45.u74 u74Var = new r45.u74();
                r45.ta4 ta4Var2 = (r45.ta4) wk0Var.getCustom(7);
                u74Var.set(0, ta4Var2 != null ? ta4Var2.getByteString(1) : null);
                wk0Var.set(8, u74Var);
                ss5.e0 e0Var = (ss5.e0) i95.n0.c(ss5.e0.class);
                android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                ((vd2.f1) e0Var).Ni(context4, intent2, kz5.b0.c(finderObject), 0, wk0Var, null);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                z17 = false;
                z18 = true;
            } else {
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.Object[] objArr = new java.lang.Object[4];
                if (str7 == null) {
                    str7 = "";
                }
                z17 = false;
                objArr[0] = str7;
                z18 = true;
                objArr[1] = str5;
                objArr[2] = java.lang.Long.valueOf(finderObject.getId());
                objArr[3] = "";
                g0Var.d(21140, objArr);
            }
            if (intent != null && intent.hasExtra("KEY_MINI_APP_AD_FLOW_INFO") == z18) {
                z17 = z18;
            }
            if (!z17 && (g5Var = this.f435890k) != null) {
                g5Var.a(null);
            }
        } else {
            vd2.g5 g5Var2 = this.f435891l;
            if (g5Var2 != null) {
                g5Var2.a(java.lang.Integer.valueOf(fVar.f70616b));
            }
        }
        return jz5.f0.f302826a;
    }
}
