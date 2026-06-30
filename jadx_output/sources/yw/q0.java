package yw;

/* loaded from: classes11.dex */
public final class q0 {

    /* renamed from: a, reason: collision with root package name */
    public static final yw.q0 f466429a = new yw.q0();

    /* renamed from: b, reason: collision with root package name */
    public static final com.tencent.mm.sdk.platformtools.o4 f466430b;

    /* renamed from: c, reason: collision with root package name */
    public static jz5.l f466431c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.sdk.event.IListener f466432d;

    static {
        com.tencent.mm.sdk.platformtools.o4 R = com.tencent.mm.sdk.platformtools.o4.R("brandService");
        kotlin.jvm.internal.o.f(R, "getSingleMMKV(...)");
        f466430b = R;
        f466431c = new jz5.l("", 0);
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        f466432d = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.BizCreationCenterInfoUpdateEvent>(a0Var) { // from class: com.tencent.mm.feature.brandservice.flutter.BizFlutterDigestHelper$bizCreationCenterInfoUpdateEvent$1
            {
                this.__eventId = -694955796;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.BizCreationCenterInfoUpdateEvent bizCreationCenterInfoUpdateEvent) {
                com.tencent.mm.autogen.events.BizCreationCenterInfoUpdateEvent event = bizCreationCenterInfoUpdateEvent;
                kotlin.jvm.internal.o.g(event, "event");
                yw.q0.b(yw.q0.f466429a, yw.d0.f466293g, null, 2, null);
                return false;
            }
        };
    }

    public static /* synthetic */ void b(yw.q0 q0Var, yw.d0 d0Var, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            d0Var = yw.d0.f466298o;
        }
        if ((i17 & 2) != 0) {
            str = null;
        }
        q0Var.a(d0Var, str);
    }

    public final void a(yw.d0 scene, java.lang.String str) {
        kotlin.jvm.internal.o.g(scene, "scene");
        if (!z40.e.l4()) {
            ((ku5.t0) ku5.t0.f312615d).h(new yw.m0(scene, str), "BizDigestUpdateThread");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDigestHelper", "use Finder exp, skip UpdateBizMainCell");
        z40.e eVar = z40.e.get();
        java.lang.String str2 = scene.f466300d;
        ((y40.i0) eVar).getClass();
        a50.a aVar = a50.a.f1445h;
        if (!kotlin.jvm.internal.o.b(str2, "BizFlutterPersonalCenterRedDotMgr.subscribePersonalCenterEvent")) {
            aVar = a50.a.f1442e;
            if (!kotlin.jvm.internal.o.b(str2, "OnBizInfoChange.onNotifyChange")) {
                aVar = a50.a.f1446i;
                if (!kotlin.jvm.internal.o.b(str2, "BizProcessorCommand.addFinderRedDot")) {
                    return;
                }
            }
        }
        a50.j0.f1496a.a(aVar, str);
    }

    public final int c() {
        int f17 = r01.q3.oj().f();
        ((sg0.y3) ((tg0.o1) i95.n0.c(tg0.o1.class))).getClass();
        int i17 = 0;
        if (!su4.r2.l()) {
            ur1.j jVar = ur1.j.f430354a;
            if (ur1.n.f430361a.a()) {
                i17 = ur1.j.f430356c;
            }
        }
        return f17 + i17;
    }

    public final boolean d(long j17) {
        long min = java.lang.Math.min(c01.id.c(), j17);
        long c17 = c01.id.c();
        com.tencent.mm.sdk.platformtools.o4 o4Var = f466430b;
        boolean i17 = o4Var.i("mmkvKeyIsLastHideBoxWhenDeleteAndKeepData", false);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDigestHelper", "needUpdateConv: isLastHideBoxWhenDeleteAndKeepData=" + i17);
        if (i17) {
            long q17 = o4Var.q("mmkvKeyBrandTimelineSessionChangeValidatorForHideBoxWhenDeleteAndKeepData", 0L);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("needUpdateConv: lastChangeValidator=");
            sb6.append(q17);
            sb6.append(", convTime=");
            sb6.append(min);
            sb6.append(", serverTime=");
            sb6.append(c17);
            sb6.append(", isUpdate=");
            sb6.append(min > q17);
            com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDigestHelper", sb6.toString());
            if (min > q17) {
                o4Var.G("mmkvKeyIsLastHideBoxWhenDeleteAndKeepData", false);
            } else {
                if (c17 <= 0 || q17 <= c17) {
                    return false;
                }
                o4Var.G("mmkvKeyIsLastHideBoxWhenDeleteAndKeepData", false);
            }
        }
        return true;
    }

    public final long e(com.tencent.mm.storage.l8 l8Var, com.tencent.mm.storage.l4 l4Var, boolean z17) {
        long Y;
        if (z17) {
            Y = ((com.tencent.mm.storage.m4) l8Var).G(l4Var);
        } else {
            Y = ((com.tencent.mm.storage.m4) l8Var).Y(l4Var, l4Var.h1(), true, true);
        }
        f466430b.B("mmkvKeyBrandTimelineSessionChangeValidatorForHideBoxWhenDeleteAndKeepData", l4Var.w0());
        return Y;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x02c2, code lost:
    
        if ((r1.length() > 0) != false) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00cf, code lost:
    
        if ((r1.length() > 0) != false) goto L168;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(com.tencent.mm.storage.l4 r11, com.tencent.wechat.mm.biz.f1 r12) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yw.q0.f(com.tencent.mm.storage.l4, com.tencent.wechat.mm.biz.f1):void");
    }

    public final void g(long j17, boolean z17, java.lang.String str) {
        com.tencent.mm.sdk.platformtools.o4 o4Var = f466430b;
        if (o4Var != null) {
            com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
            com.tencent.mm.storage.a1.f193733r = j17;
            com.tencent.mm.storage.a1.f193735t = z17;
            if (str == null) {
                str = "";
            }
            com.tencent.mm.storage.a1.G = str;
            o4Var.B("BizLastMsgId", j17);
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.BizFlutterDigestHelper", "updateLastDigestInfo failed! mmkv is null");
    }

    public final void i(int i17) {
        java.lang.String string = com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.n5z, java.lang.Integer.valueOf(i17), "");
        kotlin.jvm.internal.o.f(string, "getString(...)");
        f466431c = new jz5.l(string, 4);
    }

    public final void g(long j17, dw5.b bVar, int i17, long j18, int i18) {
        java.lang.String c17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateLastDigestTime: lastDigestTime=");
        com.tencent.mm.storage.a1 a1Var = com.tencent.mm.storage.a1.f193716a;
        sb6.append(com.tencent.mm.storage.a1.C);
        sb6.append(", curDigestTime=");
        sb6.append(j17);
        sb6.append(", bizBoxCovTimeType=");
        sb6.append(bVar);
        sb6.append(", notifyType=");
        sb6.append(i17);
        sb6.append(", msgId=");
        sb6.append(j18);
        sb6.append(", unreadNotifyMsgCount=");
        sb6.append(i18);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizFlutterDigestHelper", sb6.toString());
        long j19 = com.tencent.mm.storage.a1.C;
        dw5.b bVar2 = dw5.b.TYPE_SERVER_ASSIGN;
        if (j17 != j19) {
            if (bVar == bVar2) {
                a1Var.z(com.tencent.mm.storage.a0.f193711m, "officialaccounts");
            } else {
                a1Var.z(com.tencent.mm.storage.a0.f193710i, "officialaccounts");
            }
        }
        com.tencent.mm.storage.a1.C = j17;
        com.tencent.mm.sdk.platformtools.o4 o4Var = f466430b;
        o4Var.B("bizLastDigestTime", j17);
        boolean z17 = true;
        if (i17 == 1 || i17 == 2) {
            a1Var.A(com.tencent.mm.storage.f0.f193901m);
            com.tencent.mm.storage.g0[] g0VarArr = com.tencent.mm.storage.g0.f193942e;
            com.tencent.mm.storage.a1.f193736u = 1;
        } else if (i17 == 4) {
            if (i18 > 0) {
                if (j18 != -1) {
                    com.tencent.wechat.mm.biz.f1 h17 = a1Var.h(j18);
                    c17 = h17 != null ? h17.c() : null;
                    if (c17 != null && c17.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        a1Var.A(com.tencent.mm.storage.f0.f193902n);
                    }
                }
                a1Var.A(com.tencent.mm.storage.f0.f193903o);
            } else {
                if (j18 != -1) {
                    com.tencent.wechat.mm.biz.f1 h18 = a1Var.h(j18);
                    c17 = h18 != null ? h18.c() : null;
                    if (c17 != null && c17.length() != 0) {
                        z17 = false;
                    }
                    if (!z17) {
                        a1Var.A(com.tencent.mm.storage.f0.f193898g);
                    }
                }
                a1Var.A(com.tencent.mm.storage.f0.f193899h);
            }
            if (bVar == bVar2) {
                com.tencent.mm.storage.g0[] g0VarArr2 = com.tencent.mm.storage.g0.f193942e;
                com.tencent.mm.storage.a1.f193736u = 3;
            } else {
                com.tencent.mm.storage.g0[] g0VarArr3 = com.tencent.mm.storage.g0.f193942e;
                com.tencent.mm.storage.a1.f193736u = 2;
            }
        }
        o4Var.A("bizLastDigestTimeType", com.tencent.mm.storage.a1.f193736u);
    }
}
