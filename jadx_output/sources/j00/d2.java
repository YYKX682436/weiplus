package j00;

@j95.b
/* loaded from: classes9.dex */
public final class d2 extends i95.w implements c00.m3 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f296746d = jz5.h.b(j00.y1.f296950d);

    /* renamed from: e, reason: collision with root package name */
    public yz5.l f296747e;

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0122, code lost:
    
        if (r11 == null) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public bw5.x7 Ai(long r10, int r12) {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.d2.Ai(long, int):bw5.x7");
    }

    public boolean Bi(boolean z17, com.tencent.mm.storage.z3 z3Var) {
        boolean isTeenMode = ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode();
        com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String d17 = z3Var != null ? z3Var.d1() : null;
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (d17 == null) {
            d17 = "";
        }
        com.tencent.mm.storage.z3 n17 = Bi.n(d17, true);
        boolean o27 = n17 != null ? n17.o2() : true;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hy: check send gift start. talkerUsername: ");
        sb6.append(z3Var != null ? z3Var.d1() : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", sb6.toString());
        if (isTeenMode || o27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: is teen mode? " + isTeenMode + " isBlacklistContact " + o27);
            return false;
        }
        if (z3Var != null && !z3Var.r2() && !com.tencent.mm.storage.z3.R4(z3Var.d1())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: is open im chatroom");
            return false;
        }
        if (com.tencent.mm.storage.z3.H3(z3Var != null ? z3Var.d1() : null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isBottleContact");
            return false;
        }
        if (com.tencent.mm.storage.z3.s4(z3Var != null ? z3Var.d1() : null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isQQContact");
            return false;
        }
        if (com.tencent.mm.storage.z3.G4(z3Var != null ? z3Var.d1() : null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isTContact");
            return false;
        }
        if (com.tencent.mm.storage.z3.H4(z3Var != null ? z3Var.d1() : null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isTextStatusSession");
            return false;
        }
        if (com.tencent.mm.storage.z3.V3(z3Var != null ? z3Var.d1() : null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isFinderSession");
            return false;
        }
        if (com.tencent.mm.storage.z3.e4(z3Var != null ? z3Var.d1() : null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isMediaNoteHelper");
            return false;
        }
        if (com.tencent.mm.storage.z3.z4(z3Var != null ? z3Var.d1() : null)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isSPUserWeixin");
            return false;
        }
        if (!com.tencent.mm.storage.z3.m4(z3Var != null ? z3Var.d1() : null)) {
            if (!com.tencent.mm.storage.z3.p4(z3Var != null ? z3Var.d1() : null)) {
                if (!com.tencent.mm.storage.z3.q4(z3Var != null ? z3Var.d1() : null)) {
                    if (com.tencent.mm.storage.z3.R3(z3Var != null ? z3Var.d1() : null)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isFileHelper");
                        return false;
                    }
                    if (com.tencent.mm.storage.z3.L3(z3Var != null ? z3Var.d1() : null)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isChatBot");
                        return false;
                    }
                    if (z3Var != null && z3Var.k2()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isBizContact");
                        return false;
                    }
                    if (kotlin.jvm.internal.o.b(c01.z1.r(), z3Var != null ? z3Var.d1() : null)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: is self");
                        return false;
                    }
                    if (com.tencent.mm.storage.z3.z3(z3Var != null ? z3Var.d1() : null)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isAppBrandContact");
                        return false;
                    }
                    if (com.tencent.mm.storage.z3.a4(z3Var != null ? z3Var.d1() : null)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isGameLifeSession");
                        return false;
                    }
                    if (com.tencent.mm.storage.z3.d4(z3Var != null ? z3Var.d1() : null)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: isMassSendHelper");
                        return false;
                    }
                    if (!(wi(z17) != null)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: no entrance from svr");
                        return false;
                    }
                    if (com.tencent.mm.storage.z3.E3(z3Var != null ? z3Var.d1() : null)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "isBizFansSession");
                        return false;
                    }
                    if (!com.tencent.mm.storage.z3.G3(z3Var != null ? z3Var.d1() : null)) {
                        return true;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "isBizPhotoFansSession");
                    return false;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: openIm");
        return false;
    }

    public void Di(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "notify send thanks result: " + z17);
        yz5.l lVar = this.f296747e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(z17));
        }
        this.f296747e = null;
    }

    public void Ni(android.content.Context context, java.lang.String paramsBytesString) {
        kotlin.jvm.internal.o.g(paramsBytesString, "paramsBytesString");
        j00.y yVar = j00.y.f296946a;
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.i("Ecs.EcsGiftFlutterMgr", "open lottery page on main process");
            kotlinx.coroutines.l.d(j00.y.f296947b, null, null, new j00.t(paramsBytesString, context, null), 3, null);
        } else {
            com.tencent.mars.xlog.Log.i("Ecs.EcsGiftFlutterMgr", "open lottery page on sub process");
            com.tencent.mm.ipcinvoker.extension.l.a(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCString(paramsBytesString), j00.q.class, j00.s.f296883d);
        }
    }

    public void Ri(android.content.Context context, long j17, java.lang.String finderUsername, byte[] giftItemData, c00.l3 callback) {
        java.lang.Object m521constructorimpl;
        kotlin.jvm.internal.o.g(finderUsername, "finderUsername");
        kotlin.jvm.internal.o.g(giftItemData, "giftItemData");
        kotlin.jvm.internal.o.g(callback, "callback");
        j00.e0 e0Var = (j00.e0) ((j00.z3) i95.n0.c(j00.z3.class));
        e0Var.getClass();
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            java.lang.String valueOf = java.lang.String.valueOf(e0Var.f296754d.incrementAndGet());
            bw5.hm parseFrom = new bw5.hm().parseFrom(giftItemData);
            j00.g0 g0Var = e0Var.f296756f;
            bw5.gm b17 = parseFrom.b();
            java.lang.String str = b17.f27917s[12] ? b17.f27916r : "";
            kotlin.jvm.internal.o.f(str, "getGiftId(...)");
            g0Var.a(valueOf, j17, finderUsername, str);
            jz5.l[] lVarArr = new jz5.l[7];
            lVarArr[0] = new jz5.l("finder_username", finderUsername);
            lVarArr[1] = new jz5.l("object_id", java.lang.Long.valueOf(j17));
            lVarArr[2] = new jz5.l("setting_flag", java.lang.Long.valueOf(parseFrom.b().f27914p));
            lVarArr[3] = new jz5.l("panel_item_id", java.lang.Integer.valueOf(parseFrom.f28267d));
            bw5.gm b18 = parseFrom.b();
            lVarArr[4] = new jz5.l("last_gift_id", b18.f27917s[12] ? b18.f27916r : "");
            lVarArr[5] = new jz5.l("attend_duration", java.lang.Integer.valueOf(parseFrom.b().f27909h));
            jz5.l[] lVarArr2 = new jz5.l[2];
            bw5.gm b19 = parseFrom.b();
            lVarArr2[0] = new jz5.l("attend_type", java.lang.Integer.valueOf((b19.f27917s[11] ? b19.f27915q : new bw5.ao()).f25281d));
            bw5.gm b27 = parseFrom.b();
            bw5.ao aoVar = b27.f27917s[11] ? b27.f27915q : new bw5.ao();
            lVarArr2[1] = new jz5.l("attend_wording", aoVar.f25287m[2] ? aoVar.f25282e : "");
            lVarArr[6] = new jz5.l("attend_info", kz5.c1.k(lVarArr2));
            java.lang.String jSONObject = new org.json.JSONObject(kz5.c1.k(lVarArr)).toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            jz5.l[] lVarArr3 = new jz5.l[4];
            lVarArr3[0] = new jz5.l("seqId", valueOf);
            bw5.gm b28 = parseFrom.b();
            lVarArr3[1] = new jz5.l("presentOrderId", b28.f27917s[12] ? b28.f27916r : "");
            lVarArr3[2] = new jz5.l("finderUsername", finderUsername);
            lVarArr3[3] = new jz5.l("finderPresentInfoJson", jSONObject);
            java.util.Map k17 = kz5.c1.k(lVarArr3);
            e0Var.f296755e.put(valueOf, callback);
            j00.y yVar = j00.y.f296946a;
            kotlinx.coroutines.l.d(j00.y.f296947b, null, null, new j00.w(kz5.c1.t(k17), context, null), 3, null);
            m521constructorimpl = kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl);
        if (m524exceptionOrNullimpl != null) {
            com.tencent.mars.xlog.Log.printErrStackTrace("Ecs.Gift.Live.EcsGiftInLiveMgr", m524exceptionOrNullimpl, "Failed to resend gift in live", new java.lang.Object[0]);
        }
    }

    public void Ui(android.content.Context activityContext, java.lang.String orderId, yz5.l lVar) {
        kotlin.jvm.internal.o.g(activityContext, "activityContext");
        kotlin.jvm.internal.o.g(orderId, "orderId");
        if (orderId.length() == 0) {
            if (lVar != null) {
                lVar.invoke(java.lang.Boolean.FALSE);
            }
        } else {
            this.f296747e = lVar;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("order_id", orderId);
            j45.l.j(activityContext, "gift", "com.tencent.mm.feature.ecs.gift.ui.EcsGiftSendThanksLogicUI", intent, null);
        }
    }

    public boolean Vi(boolean z17) {
        bw5.s8 c17;
        bw5.s8 c18;
        int intValue;
        bw5.s8 b17;
        bw5.t8 b18 = n00.g.f333821a.b();
        boolean z18 = !z17 ? (c17 = b18.c()) == null || c17.f32852p != 2 : (b17 = b18.b()) == null || b17.f32852p != 2;
        n00.g gVar = n00.g.f333821a;
        gVar.getClass();
        boolean booleanValue = z17 ? ((java.lang.Boolean) n00.g.f333828h.b(gVar, n00.g.f333822b[5])).booleanValue() : ((java.lang.Boolean) n00.g.f333827g.b(gVar, n00.g.f333822b[4])).booleanValue();
        bw5.t8 b19 = n00.g.f333821a.b();
        int i17 = (!z17 ? (c18 = b19.c()) != null : (c18 = b19.b()) != null) ? 0 : c18.f32854r;
        if (z17) {
            n00.g gVar2 = n00.g.f333821a;
            gVar2.getClass();
            intValue = ((java.lang.Number) n00.g.f333830j.b(gVar2, n00.g.f333822b[7])).intValue();
        } else {
            n00.g gVar3 = n00.g.f333821a;
            gVar3.getClass();
            intValue = ((java.lang.Number) n00.g.f333829i.b(gVar3, n00.g.f333822b[6])).intValue();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: panel reddot isStrategyShowReddot " + z18 + " hasClickedLegacy " + booleanValue + " requestClickVersion " + i17 + " lastClickVersion " + intValue);
        if (z18) {
            return i17 <= 0 ? !booleanValue : i17 > intValue;
        }
        return false;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "hy: ecs gift service on create!");
    }

    public final bw5.x7 wi(boolean z17) {
        bw5.s8 b17 = z17 ? n00.g.f333821a.b().b() : n00.g.f333821a.b().c();
        if (b17 != null) {
            if (b17.b() != null) {
                if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsHardcodeChattingGiftJump", 0) == 1) {
                    b17.b().j(new java.util.LinkedList(kz5.b0.c("native")));
                    com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "mango: hard code jump native");
                } else {
                    if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsHardcodeChattingGiftJump", 0) == 2) {
                        b17.b().j(new java.util.LinkedList(kz5.b0.c("wxa")));
                        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftService", "mango: hard code jump wxa");
                    } else {
                        if (((qq.s) ((qq.c0) i95.n0.c(qq.c0.class))).Bi("EcsHardcodeChattingGiftJump", 0) == 3) {
                            bw5.x7 b18 = b17.b();
                            bw5.s7 s7Var = new bw5.s7();
                            s7Var.f32825d = "MagicEcsNirvanaGift";
                            boolean[] zArr = s7Var.f32839u;
                            zArr[1] = true;
                            s7Var.f32826e = 0;
                            zArr[2] = true;
                            s7Var.f32827f = 0;
                            zArr[3] = true;
                            org.json.JSONObject jSONObject = new org.json.JSONObject();
                            jSONObject.put("routeName", "ecs_send_gift");
                            s7Var.e(jSONObject.toString());
                            s7Var.f32829h = 2;
                            zArr[5] = true;
                            s7Var.f32832n = false;
                            zArr[8] = true;
                            s7Var.f32837s = true;
                            zArr[13] = true;
                            s7Var.f32838t = 500;
                            zArr[14] = true;
                            s7Var.f32835q = 0;
                            zArr[11] = true;
                            s7Var.f32830i = true;
                            zArr[6] = true;
                            b18.f34982p = s7Var;
                            b18.f34984r[10] = true;
                            b17.b().j(new java.util.LinkedList(kz5.b0.c("mbapp")));
                        }
                    }
                }
            }
            bw5.x7 b19 = b17.b();
            if (b19 != null) {
                if (b17.f32843d == 2) {
                    return b19;
                }
            }
        }
        return null;
    }
}
