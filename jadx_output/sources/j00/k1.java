package j00;

@j95.b
/* loaded from: classes9.dex */
public final class k1 extends i95.w implements c00.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f296810d = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f296811e = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f296812f = java.util.Collections.synchronizedList(new java.util.LinkedList());

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f296813g = new com.tencent.mm.sdk.platformtools.r2(4);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f296814h = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f296815i = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f296816m = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Runnable f296817n = new j00.i0(this);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f296818o = jz5.h.b(j00.g1.f296776d);

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f296819p = jz5.h.b(j00.f1.f296774d);

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f296820q = jz5.h.b(j00.l0.f296826d);

    /* renamed from: r, reason: collision with root package name */
    public final j00.s0 f296821r = new j00.s0(this);

    public static final android.content.Context Ai(j00.k1 k1Var, android.content.Context context) {
        k1Var.getClass();
        if ((context instanceof android.app.Activity) && ((android.app.Activity) context).isFinishing()) {
            android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            return context2;
        }
        if (context == null) {
            context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        return context;
    }

    public static final void Bi(j00.k1 k1Var, com.tencent.mm.storage.f9 f9Var) {
        bw5.s8 c17;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String o17;
        k1Var.getClass();
        boolean N4 = com.tencent.mm.storage.z3.N4(f9Var.Q0());
        bw5.t8 b17 = n00.g.f333821a.b();
        if (N4) {
            if (b17 != null) {
                c17 = b17.b();
            }
            c17 = null;
        } else {
            if (b17 != null) {
                c17 = b17.c();
            }
            c17 = null;
        }
        if (c17 != null && c17.f32853q == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "preloadGiftImg, preload img");
        } else {
            if (c17 != null && c17.f32853q == 2) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "preloadGiftImg, not preload img");
                return;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "preloadGiftImg, default action");
                if (N4) {
                    return;
                }
            }
        }
        l15.c cVar = new l15.c();
        java.lang.String j17 = f9Var.j();
        java.lang.String str6 = "";
        if (j17 == null) {
            j17 = "";
        }
        cVar.fromXml(j17);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.getCustom(k17.f432315e + 66) : null;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "preloadGiftImg, ecsGiftAppMsgInfo is null");
            return;
        }
        java.lang.String t17 = dVar.t();
        java.util.List list = k1Var.f296812f;
        if (list.contains(t17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "preloadGiftImg, giftMsgId: " + t17 + " has in limit list");
            return;
        }
        list.add(t17);
        if (dVar.s().size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "preloadGiftImg, gift msg list is empty");
            return;
        }
        java.lang.Object obj = dVar.s().get(0);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        w05.e eVar = (w05.e) obj;
        k1Var.Zi(eVar.q());
        w05.f q17 = dVar.q();
        if (q17 == null || (str = q17.l()) == null) {
            str = "";
        }
        k1Var.Zi(str);
        if (q17 == null || (str2 = q17.k()) == null) {
            str2 = "";
        }
        k1Var.Zi(str2);
        if (q17 == null || (str3 = q17.j()) == null) {
            str3 = "";
        }
        k1Var.Zi(str3);
        if (q17 == null || (str4 = q17.n()) == null) {
            str4 = "";
        }
        k1Var.Zi(str4);
        if (q17 == null || (str5 = q17.p()) == null) {
            str5 = "";
        }
        k1Var.Zi(str5);
        if (q17 != null && (o17 = q17.o()) != null) {
            str6 = o17;
        }
        k1Var.Zi(str6);
        k1Var.Zi(eVar.t());
    }

    public static final void Di(j00.k1 k1Var, java.lang.String str) {
        java.lang.String str2;
        k1Var.getClass();
        new bw5.i8();
        try {
            str2 = new org.json.JSONObject(kz5.c1.k(new jz5.l("errCode", bw5.o8.EcsOpenRespRet_Fail), new jz5.l("errMsg", "cgi request failed"))).toString();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "json to string fail:" + e17);
            str2 = "{}";
        }
        kotlin.jvm.internal.o.d(str2);
        c00.d3 d3Var = (c00.d3) i95.n0.c(c00.d3.class);
        bw5.j8 j8Var = bw5.j8.EcsOpenEventType_receiveGiftPageExit;
        bw5.i8 i8Var = new bw5.i8();
        i8Var.f28494f = str2;
        i8Var.f28496h[3] = true;
        ((j00.o) d3Var).Ai(str, j8Var, i8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void rj(j00.k1 r6, java.util.Map r7, java.lang.String r8, java.lang.String r9) {
        /*
            int r0 = r8.length()
            r1 = 1
            r2 = 0
            if (r0 != 0) goto La
            r0 = r1
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto Le
            return
        Le:
            r6.getClass()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "getEcsGiftOpenPagUnzipFilePath: "
            r0.<init>(r3)
            r0.append(r8)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.EcsGiftMsgService"
            com.tencent.mars.xlog.Log.i(r3, r0)
            if (r8 == 0) goto L2e
            int r0 = r8.length()
            if (r0 != 0) goto L2d
            goto L2e
        L2d:
            r1 = r2
        L2e:
            r0 = 0
            if (r1 == 0) goto L33
        L31:
            r8 = r0
            goto L88
        L33:
            java.lang.Class<com.tencent.mm.udr.e0> r1 = com.tencent.mm.udr.e0.class
            i95.m r1 = i95.n0.c(r1)
            com.tencent.mm.udr.e0 r1 = (com.tencent.mm.udr.e0) r1
            com.tencent.mm.udr.a1 r1 = (com.tencent.mm.udr.a1) r1
            java.lang.String r4 = "ilinkres_b516b52d"
            java.lang.String r5 = "EcsGiftOpenAnimation"
            com.tencent.wechat.aff.udr.x r1 = r1.Ui(r4, r5)
            if (r1 == 0) goto L4c
            java.lang.String r1 = r1.c()
            goto L4d
        L4c:
            r1 = r0
        L4d:
            boolean r4 = com.tencent.mm.vfs.w6.j(r1)
            if (r4 == 0) goto L31
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "getEcsGiftOpenPagUnzipFilePath, unzipFileDir exists: "
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            com.tencent.mars.xlog.Log.i(r3, r4)
            com.tencent.mm.vfs.r6 r4 = new com.tencent.mm.vfs.r6
            r4.<init>(r1, r8)
            boolean r8 = r4.m()
            if (r8 == 0) goto L31
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "file exists, return path: "
            r8.<init>(r1)
            java.lang.String r1 = r4.o()
            r8.append(r1)
            java.lang.String r8 = r8.toString()
            com.tencent.mars.xlog.Log.i(r3, r8)
            java.lang.String r8 = r4.o()
        L88:
            if (r8 == 0) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "openEcsGiftReceivePage, "
            r1.<init>(r4)
            r1.append(r9)
            java.lang.String r4 = ": "
            r1.append(r4)
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r3, r1)
            if (r7 == 0) goto Lab
            r7.put(r9, r8)
            jz5.f0 r7 = jz5.f0.f302826a
            r0 = r7
        Lab:
            if (r0 != 0) goto Lb2
            java.util.concurrent.atomic.AtomicBoolean r6 = r6.f296815i
            r6.set(r2)
        Lb2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.k1.rj(j00.k1, java.util.Map, java.lang.String, java.lang.String):void");
    }

    public static final void wi(j00.k1 k1Var, com.tencent.mm.storage.f9 f9Var) {
        k1Var.getClass();
        try {
            if (k1Var.f296815i.get()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "checkResourceReadyByMsg, resource is ready");
                return;
            }
            l15.c cVar = new l15.c();
            java.lang.String j17 = f9Var.j();
            if (j17 == null) {
                j17 = "";
            }
            cVar.fromXml(j17);
            v05.b k17 = cVar.k();
            w05.d dVar = k17 != null ? (w05.d) k17.getCustom(k17.f432315e + 66) : null;
            if (dVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "checkOpenResourceReady, ecsGiftAppMsgInfo is null");
                return;
            }
            w05.c p17 = dVar.p();
            java.lang.String k18 = p17 != null ? p17.k() : null;
            w05.c p18 = dVar.p();
            k1Var.Ui(k18, p18 != null ? p18.j() : null);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "checkResourceReadyByMsg, " + e17);
        }
    }

    public boolean Ni(com.tencent.mm.storage.f9 oldMsg, com.tencent.mm.storage.f9 newMsg) {
        kotlin.jvm.internal.o.g(oldMsg, "oldMsg");
        kotlin.jvm.internal.o.g(newMsg, "newMsg");
        if (oldMsg.getType() == -2113929167 || oldMsg.getType() == -2130706383) {
            if (newMsg.getType() == -2113929167 || newMsg.getType() == -2130706383) {
                l15.c cVar = new l15.c();
                java.lang.String j17 = oldMsg.j();
                if (j17 == null) {
                    j17 = "";
                }
                cVar.fromXml(j17);
                v05.b k17 = cVar.k();
                w05.d dVar = k17 != null ? (w05.d) k17.getCustom(k17.f432315e + 66) : null;
                if (dVar == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, oldEcsGiftAppMsgInfo is null");
                    return false;
                }
                l15.c cVar2 = new l15.c();
                java.lang.String j18 = newMsg.j();
                cVar2.fromXml(j18 != null ? j18 : "");
                v05.b k18 = cVar2.k();
                w05.d dVar2 = k18 != null ? (w05.d) k18.getCustom(k18.f432315e + 66) : null;
                if (dVar2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, newEcsGiftAppMsgInfo is null");
                    return false;
                }
                java.lang.String t17 = dVar2.t();
                java.lang.String t18 = dVar.t();
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, oldGiftMsgId:" + t18 + ", newGiftMsgId:" + t17);
                if (!kotlin.jvm.internal.o.b(t17, t18)) {
                    ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).wi("EcsGiftMsgUpdateError", 2, null);
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, msg id is not equal");
                    return false;
                }
                if (dVar2.s().isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, new gift msg list is empty");
                    return false;
                }
                java.lang.Object obj = dVar2.s().get(0);
                kotlin.jvm.internal.o.f(obj, "get(...)");
                w05.e eVar = (w05.e) obj;
                long l17 = eVar.l();
                long w17 = eVar.w();
                if (dVar.s().isEmpty()) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, old gift msg list is empty");
                    return false;
                }
                java.lang.Object obj2 = dVar.s().get(0);
                kotlin.jvm.internal.o.f(obj2, "get(...)");
                w05.e eVar2 = (w05.e) obj2;
                long l18 = eVar2.l();
                long w18 = eVar2.w();
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, oldGiftMsgStatus:" + l18 + ", oldGiftMsgStatusVersion:" + w18 + ", newGiftMsgStatus:" + l17 + ", newGiftMsgStatusVersion:" + w17);
                return kotlin.jvm.internal.o.b(t18, t17) && w17 >= w18;
            }
        }
        ((b00.q2) ((c00.b4) i95.n0.c(c00.b4.class))).wi("EcsGiftMsgUpdateError", 1, null);
        com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "canEcsGiftMsgUpdate, msg is not ecs gift msg");
        return false;
    }

    public final boolean Ri(java.lang.String str) {
        if (!aj()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "canHandleConversationDigest, toggle close, not show red digest");
            return false;
        }
        if (str == null || str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "handleConvDigestOnEcsGiftInvalid, talker is null");
            return false;
        }
        if (!gm0.j1.a()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "canHandleConversationDigest, acc not ready");
            return false;
        }
        java.lang.String str2 = ((com.tencent.mm.booter.notification.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f330407d).f63517c;
        if (str2 == null) {
            str2 = "";
        }
        if (kotlin.jvm.internal.o.b(str2, str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "canHandleConversationDigest, is in current conv");
            return false;
        }
        if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(str) != null) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "canHandleConversationDigest, conv is null");
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002a A[Catch: Exception -> 0x019b, TryCatch #0 {Exception -> 0x019b, blocks: (B:97:0x000e, B:7:0x001c, B:13:0x002a, B:15:0x003f, B:20:0x0051, B:24:0x009b, B:25:0x00d9, B:29:0x00f1, B:72:0x00ff, B:79:0x00e7, B:80:0x00ab, B:82:0x00b3, B:83:0x00c9, B:84:0x0095, B:85:0x0061, B:87:0x0069, B:88:0x007f, B:89:0x0049), top: B:96:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0113 A[Catch: Exception -> 0x018a, TRY_ENTER, TryCatch #1 {Exception -> 0x018a, blocks: (B:36:0x0113, B:40:0x011e, B:41:0x0124, B:44:0x012c, B:45:0x0132, B:47:0x0137, B:49:0x013f, B:50:0x0143, B:52:0x0158, B:56:0x0170, B:61:0x017e, B:63:0x018e, B:65:0x0166, B:68:0x0197, B:92:0x019f), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Ui(java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.k1.Ui(java.lang.String, java.lang.String):void");
    }

    public void Vi(java.lang.String talker) {
        kotlin.jvm.internal.o.g(talker, "talker");
        try {
            if (talker.length() == 0) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "clearEcsGiftRedLabel, talker is empty");
                return;
            }
            com.tencent.mm.storage.l4 p17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().p(talker);
            if (p17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "clearEcsGiftRedLabel, conv is empty");
                return;
            }
            if (p17.d2(4096)) {
                p17.e2(4096);
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "clearEcsGiftRedLabel, convRet:" + ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(p17, talker, true, true));
            }
            ((ku5.t0) ku5.t0.f312615d).h(new j00.j0(talker), "MicroMsg.EcsGiftMsgService");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.EcsGiftMsgService", e17, "clearEcsGiftRedLabel error", new java.lang.Object[0]);
        }
    }

    public final void Zi(java.lang.String str) {
        if (str.length() == 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "downloadEcsGiftImage, empty url");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "downloadEcsGiftImage, start preload img:".concat(str));
        java.lang.String valueOf = java.lang.String.valueOf((java.lang.String) ((jz5.n) ((j00.d2) ((c00.m3) i95.n0.c(c00.m3.class))).f296746d).getValue());
        n11.a b17 = n11.a.b();
        o11.f fVar = new o11.f();
        fVar.f342083g = valueOf;
        fVar.f342078b = true;
        b17.d(str, fVar.a(), new j00.k0(str));
    }

    public boolean aj() {
        return ((java.lang.Number) ((jz5.n) this.f296818o).getValue()).intValue() > 0;
    }

    public java.lang.String bj(java.lang.String content) {
        java.lang.String str;
        w05.d dVar;
        java.lang.String C;
        kotlin.jvm.internal.o.g(content, "content");
        l15.c cVar = new l15.c();
        cVar.fromXml(content);
        v05.b k17 = cVar.k();
        java.lang.String string = k17 != null ? k17.getString(k17.f368365d + 2) : null;
        java.lang.String str2 = "";
        if (string == null || string.length() == 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("generate gift msg summary with illegal msg: ");
            sb6.append(k17 != null ? k17.getString(k17.f368365d + 2) : null);
            sb6.append('}');
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", sb6.toString());
            return "";
        }
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (k17 == null || (str = k17.getString(k17.f368365d + 2)) == null) {
            str = "";
        }
        objArr[0] = str;
        if (k17 != null && (dVar = (w05.d) k17.getCustom(k17.f432315e + 66)) != null && (C = dVar.C()) != null) {
            str2 = C;
        }
        objArr[1] = str2;
        java.lang.String format = java.lang.String.format("[%s] %s", java.util.Arrays.copyOf(objArr, 2));
        kotlin.jvm.internal.o.f(format, "format(...)");
        return format;
    }

    public java.lang.String cj(java.lang.String templateTitle, int i17, java.lang.String talker, java.lang.String recUserName, android.widget.TextView textView) {
        kotlin.jvm.internal.o.g(templateTitle, "templateTitle");
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(recUserName, "recUserName");
        ((sg3.a) ((tg3.v0) i95.n0.c(tg3.v0.class))).getClass();
        java.lang.String f17 = c01.a2.f(recUserName, talker);
        if (!r26.n0.B(templateTitle, "$nickname$", false)) {
            return templateTitle;
        }
        kotlin.jvm.internal.o.d(f17);
        java.lang.String t17 = r26.i0.t(templateTitle, "$nickname$", f17, false);
        if (textView == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle, titleTv is null");
            return t17;
        }
        int width = textView.getWidth();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle viewWidth: %s", java.lang.Integer.valueOf(width));
        if (width <= 0) {
            width = i65.a.f(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479667c4);
        }
        java.lang.String substring = t17.substring(t17.length() - i17);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String substring2 = t17.substring(0, t17.length() - i17);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        float measureText = textView.getPaint().measureText(substring);
        float measureText2 = textView.getPaint().measureText(substring2);
        float measureText3 = textView.getPaint().measureText("...");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle, head:" + substring2 + ", fixedTail:" + substring + ", headSize:" + measureText2 + ", viewWidth:" + width + ", tailSize:" + measureText);
        float f18 = ((float) width) - measureText;
        if (measureText2 <= f18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle, return head + fixedTail");
            return substring2.concat(substring);
        }
        if (f18 <= measureText3) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle, availableWidth <= ellipsisSize");
            return "...".concat(substring);
        }
        int length = substring2.length();
        int i18 = 0;
        int i19 = 0;
        while (i18 <= length) {
            int i27 = (i18 + length) / 2;
            java.lang.String substring3 = substring2.substring(0, i27);
            kotlin.jvm.internal.o.f(substring3, "substring(...)");
            if (textView.getPaint().measureText(substring3) + measureText3 <= f18) {
                i18 = i27 + 1;
                i19 = i27;
            } else {
                length = i27 - 1;
            }
        }
        java.lang.String substring4 = substring2.substring(0, i19);
        kotlin.jvm.internal.o.f(substring4, "substring(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "getEcsExclusiveGiftTitle, displayHead:" + substring4 + ", fixedTail:" + substring);
        return substring4 + "..." + substring;
    }

    public int fj(com.tencent.mm.storage.l4 l4Var) {
        if (!aj()) {
            int i17 = h20.c.f278263a;
            return 0;
        }
        if (l4Var == null) {
            int i18 = h20.c.f278263a;
            return 0;
        }
        java.lang.String h17 = l4Var.h1();
        if (h17 == null || h17.length() == 0) {
            int i19 = h20.c.f278263a;
            return 0;
        }
        w20.g wi6 = ((w20.d) ((c00.b3) i95.n0.c(c00.b3.class))).wi();
        kotlin.jvm.internal.o.d(h17);
        w20.f y07 = wi6.y0(h17);
        if (y07 == null) {
            int i27 = h20.c.f278263a;
            return 0;
        }
        int i28 = y07.field_ecsUnhandledGiftCount;
        int i29 = y07.field_ecsGiftRedLabelType;
        int i37 = h20.c.f278263a;
        return i29 == 2 ? i29 : i28 > 0 ? 1 : 0;
    }

    public java.lang.String hj(com.tencent.mm.storage.f9 msg, java.lang.String msgXml) {
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(msgXml, "msgXml");
        if (com.tencent.mm.storage.z3.N4(msg.Q0()) && msg.A0() == 0) {
            l15.c cVar = new l15.c();
            java.lang.String j17 = msg.j();
            if (j17 == null) {
                j17 = "";
            }
            cVar.fromXml(j17);
            java.lang.String fromUsername = cVar.getFromUsername();
            v05.b k17 = cVar.k();
            w05.d dVar = k17 != null ? (w05.d) k17.getCustom(k17.f432315e + 66) : null;
            if (dVar == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "handleGroupChatMsgIfNeeded, ecsGiftAppMsgInfo is null");
                return msgXml;
            }
            if (!(fromUsername == null || fromUsername.length() == 0)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "handleGroupChatSenderMsg, giftMsgId:" + dVar.t() + ", msgId:" + msg.getMsgId() + ", talker:" + msg.Q0() + ", isChatroom msg, fromUserName:" + fromUsername);
                java.lang.String A = c01.w9.A(msgXml, fromUsername);
                return A == null ? msgXml : A;
            }
            java.lang.String s17 = c01.w9.s(msg.j());
            if (s17 == null) {
                s17 = c01.w9.s(msgXml);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "handleGroupChatSenderMsg, giftMsgId:" + dVar.t() + ", msgId:" + msg.getMsgId() + ", talker:" + msg.Q0() + ", isChatroom msg, sender:" + s17);
            if (s17 != null) {
                if (s17.length() > 0) {
                    java.lang.String A2 = c01.w9.A(msgXml, s17);
                    return A2 == null ? msgXml : A2;
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "handleGroupChatSenderMsg, return origin msg xml");
        return msgXml;
    }

    public final void ij(java.lang.String str, java.lang.String str2, boolean z17, java.lang.Long l17) {
        boolean z18;
        int i17;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, xml:" + str + ", touser:" + str2);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, xml:" + str + ", touser:" + str2);
        l15.c cVar = new l15.c();
        kotlin.jvm.internal.o.d(str);
        cVar.fromXml(str);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.getCustom(k17.f432315e + 66) : null;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, ecsGiftAppMsgInfo is null");
            return;
        }
        java.lang.String t17 = dVar.t();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "isGiftMsgIdHandled, giftMsgId: " + t17);
        java.util.List giftMsgIdList = this.f296810d;
        kotlin.jvm.internal.o.f(giftMsgIdList, "giftMsgIdList");
        synchronized (giftMsgIdList) {
            if (this.f296810d.contains(t17)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "isGiftMsgIdHandled, giftMsgId: " + t17 + " contains");
                z18 = true;
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "isGiftMsgIdHandled, giftMsgId: " + t17 + " not contain");
                this.f296810d.add(t17);
                if (this.f296810d.size() >= 100) {
                    this.f296810d.remove(0);
                }
                z18 = false;
            }
        }
        if (z18 || n00.d.f333815a.a().D0(t17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, giftMsgId:" + t17 + " is handled or in db");
            n00.e y07 = n00.d.f333815a.a().y0(t17);
            java.lang.String str3 = y07.field_talkerUserName;
            long j17 = y07.field_msgLocalId;
            com.tencent.mm.storage.f9 k18 = pt0.f0.f358209b1.k(str3, j17);
            if (k18 != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg check update svr id " + k18.I0() + " to " + l17);
                if (l17 != null) {
                    k18.o1(l17.longValue());
                    ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, k18, true);
                }
            } else {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg get msg null");
            }
        } else {
            com.tencent.mm.storage.z3.N4(str2);
            r05.k kVar = new r05.k();
            kVar.fromXml(str, true);
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, start assemble msg, giftMsgId:" + t17 + ", talker:" + str2 + ", type:" + kVar.getInteger(kVar.f368365d + 6));
            if (kVar.getInteger(kVar.f368365d + 6) == 115) {
                i17 = -2130706383;
            } else {
                kVar.getInteger(kVar.f368365d + 6);
                i17 = -2113929167;
            }
            com.tencent.mm.storage.f9 f9Var = new com.tencent.mm.storage.f9();
            f9Var.d1(str);
            f9Var.r1(2);
            f9Var.u1(str2);
            f9Var.e1(c01.w9.o(str2));
            f9Var.j1(1);
            f9Var.setType(i17);
            if (l17 != null) {
                long longValue = l17.longValue();
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, insert msg, with svrId:" + longValue);
                f9Var.o1(longValue);
            }
            long M9 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().M9(f9Var);
            if (M9 < 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, insert msg failed, msgId:" + M9);
            } else {
                kotlin.jvm.internal.o.d(str2);
                mj(str2, f9Var);
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, msgId is " + M9);
            }
        }
        if (z17) {
            long j18 = -1;
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "tryGetMsgId, xml:".concat(str));
            } else {
                l15.c cVar2 = new l15.c();
                cVar2.fromXml(str);
                v05.b k19 = cVar2.k();
                w05.d dVar2 = k19 != null ? (w05.d) k19.getCustom(k19.f432315e + 66) : null;
                if (dVar2 == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "tryGetMsgId, ecsGiftAppMsgInfo is null");
                } else {
                    j18 = n00.d.f333815a.a().y0(dVar2.t()).field_msgLocalId;
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "insertLocalGiftMsg, jump with msgId:" + j18);
            android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("Chat_User", str2);
            intent.putExtra("finish_direct", false);
            intent.putExtra("msg_local_id", j18);
            intent.putExtra("from_global_search", true);
            j45.l.u(context, ".ui.chatting.ChattingUI", intent, null);
        }
    }

    public void mj(java.lang.String talker, com.tencent.mm.storage.f9 msg) {
        kotlin.jvm.internal.o.g(talker, "talker");
        kotlin.jvm.internal.o.g(msg, "msg");
        l15.c cVar = new l15.c();
        java.lang.String j17 = msg.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.fromXml(j17);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.getCustom(k17.f432315e + 66) : null;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "insertToEcsGiftMsgStorage, ecsGiftAppMsgInfo is null");
            return;
        }
        java.lang.String t17 = dVar.t();
        java.lang.String j18 = dVar.j();
        long msgId = msg.getMsgId();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "insertToEcsGiftMsgStorage, giftMsgId:" + t17 + ", msgId:" + msgId + ", talker:" + talker);
        n00.d.f333815a.a().z0(t17, msgId, talker, false, j18, false);
    }

    public final boolean nj(java.lang.String str) {
        java.lang.String k17 = gm0.j1.b().k();
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "isExclusiveGiftReceiver, current user:" + k17 + ", recv user:" + str);
        if (kotlin.jvm.internal.o.b(str, k17)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "isExclusiveGiftReceiver");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "is not ExclusiveGiftReceiver");
        return false;
    }

    public final boolean oj(bw5.bf0 bf0Var) {
        if (bf0Var == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp is null");
            return false;
        }
        if (bf0Var.b() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp present_order_info is null");
            return false;
        }
        if (bf0Var.b().b() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp present_order_info ecsgift is null");
            return false;
        }
        if (bf0Var.b().b().c() == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp present_order_info ecsgift gifts is null");
            return false;
        }
        if (bf0Var.b().b().c().f32124d == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp present_order_info ecsgift gifts gift is null");
            return false;
        }
        if (bf0Var.b().b().c().f32124d.size() >= 1) {
            return true;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "isPresentOrderRespValid, resp gift is null");
        return false;
    }

    @Override // i95.w
    public void onCreate(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        super.onCreate(context);
        com.tencent.matrix.lifecycle.supervisor.AppExplicitBackgroundOwner.INSTANCE.addLifecycleCallback(this.f296821r);
    }

    public void pj(android.content.Context context, java.util.Map params) {
        kotlin.jvm.internal.o.g(params, "params");
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "openEcsGiftGivePreviewPOIPage, params: " + params);
        java.lang.String k17 = gm0.j1.b().k();
        b00.p0 p0Var = b00.p0.f16747a;
        kotlin.jvm.internal.o.d(k17);
        java.lang.String c17 = p0Var.c(k17);
        params.put("giverUserName", k17);
        params.put("giverNickName", c17);
        j00.y yVar = j00.y.f296946a;
        kotlinx.coroutines.l.d(j00.y.f296947b, null, null, new j00.x("ecs_gift_give_preview_poi", params, context, null, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void qj(android.content.Context r18, boolean r19, boolean r20, java.lang.String r21, long r22, java.util.Map r24, yz5.a r25) {
        /*
            Method dump skipped, instructions count: 739
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j00.k1.qj(android.content.Context, boolean, boolean, java.lang.String, long, java.util.Map, yz5.a):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13, types: [int] */
    /* JADX WARN: Type inference failed for: r0v22 */
    public final void sj(android.content.Context context, java.util.Map map, yz5.a aVar, yz5.q qVar) {
        java.lang.Object obj = map.get("orderId");
        java.lang.String str = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "requestPresentOrderInfoWithLoading, orderId is empty!");
            if (aVar != null) {
                aVar.invoke();
                return;
            }
            return;
        }
        java.lang.String valueOf = java.lang.String.valueOf(map.get("ecsOpenEventId"));
        java.lang.Object orDefault = map.getOrDefault("isGiver", java.lang.Boolean.FALSE);
        java.lang.Boolean bool = orDefault instanceof java.lang.Boolean ? (java.lang.Boolean) orDefault : null;
        ?? booleanValue = bool != null ? bool.booleanValue() : 0;
        java.lang.Object orDefault2 = map.getOrDefault("cgiScene", 1);
        java.lang.Integer num = orDefault2 instanceof java.lang.Integer ? (java.lang.Integer) orDefault2 : null;
        int intValue = num != null ? num.intValue() : 1;
        bw5.af0 af0Var = new bw5.af0();
        af0Var.f25176d = java.lang.Long.parseLong(str2);
        boolean[] zArr = af0Var.f25181i;
        zArr[2] = true;
        af0Var.f25177e = intValue;
        zArr[3] = true;
        af0Var.f25179g = 1;
        zArr[5] = true;
        af0Var.f25180h = booleanValue;
        zArr[6] = true;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = af0Var;
        lVar.f70665b = new bw5.bf0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_getpresentorder";
        lVar.f70667d = 9823;
        ((ku5.t0) ku5.t0.f312615d).B(new j00.c1(this, context, lVar.a(), str2, aVar, valueOf, map, qVar));
    }

    public boolean tj(com.tencent.mm.storage.l4 l4Var) {
        if (l4Var == null || !aj()) {
            return false;
        }
        if (l4Var.d2(4096)) {
            return true;
        }
        int fj6 = fj(l4Var);
        int i17 = h20.c.f278263a;
        if (fj6 <= 0) {
            return false;
        }
        l4Var.j1(l4Var.u0() | 4096);
        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().Y(l4Var, l4Var.h1(), true, true);
        return true;
    }

    public void uj(android.content.Context context, com.tencent.mm.storage.f9 msg, java.util.Map map) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        java.lang.String str5;
        java.lang.String str6;
        java.lang.String str7;
        java.lang.String str8;
        java.lang.String str9;
        java.lang.String str10;
        java.lang.String str11;
        java.lang.String str12;
        java.lang.String str13;
        java.lang.String str14;
        java.lang.String str15;
        int i17;
        java.lang.String str16;
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(msg, "msg");
        l15.c cVar = new l15.c();
        java.lang.String j17 = msg.j();
        if (j17 == null) {
            j17 = "";
        }
        cVar.fromXml(j17);
        v05.b k17 = cVar.k();
        w05.d dVar = k17 != null ? (w05.d) k17.getCustom(k17.f432315e + 66) : null;
        if (dVar == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "startEcsGiftLogic, ecsGiftAppMsgInfo is null");
            return;
        }
        boolean z17 = msg.A0() == 1;
        int subType = dVar.getSubType();
        if (subType != 1 && subType != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "startEcsGiftLogic, open with jumpInfo");
            if (dVar.x() == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "startEcsGiftLogic, giftAppMsg jumpInfo is null");
                return;
            }
            if (context != null) {
                i95.m c17 = i95.n0.c(pq.q.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                pq.q qVar = (pq.q) c17;
                pq.a aVar = new pq.a(context);
                w05.g x17 = dVar.x();
                kotlin.jvm.internal.o.d(x17);
                bw5.x7 x7Var = new bw5.x7();
                x7Var.f34973d = x17.k();
                boolean[] zArr = x7Var.f34984r;
                zArr[1] = true;
                w05.k n17 = x17.n();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(n17 != null ? n17.getAppId() : null)) {
                    bw5.u7 u7Var = new bw5.u7();
                    w05.k n18 = x17.n();
                    u7Var.e(n18 != null ? n18.getAppId() : null);
                    w05.k n19 = x17.n();
                    u7Var.f33755e = n19 != null ? n19.j() : null;
                    u7Var.f33768u[2] = true;
                    w05.k n27 = x17.n();
                    u7Var.f(n27 != null ? n27.getPath() : null);
                    w05.k n28 = x17.n();
                    u7Var.g(n28 != null ? n28.getScene() : 1157);
                    w05.k n29 = x17.n();
                    u7Var.i(n29 != null ? n29.k() : null);
                    w05.k n37 = x17.n();
                    u7Var.j(n37 != null ? n37.l() : 0);
                    x7Var.k(u7Var);
                }
                w05.j l17 = x17.l();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(l17 != null ? l17.getAppId() : null)) {
                    bw5.q7 q7Var = new bw5.q7();
                    w05.j l18 = x17.l();
                    q7Var.f31979d = l18 != null ? l18.getAppId() : null;
                    boolean[] zArr2 = q7Var.f31987o;
                    zArr2[1] = true;
                    w05.j l19 = x17.l();
                    q7Var.f31980e = l19 != null ? l19.getPath() : null;
                    zArr2[2] = true;
                    w05.j l27 = x17.l();
                    q7Var.f31981f = l27 != null ? l27.k() : null;
                    zArr2[3] = true;
                    w05.j l28 = x17.l();
                    q7Var.f31982g = l28 != null ? l28.j() : null;
                    zArr2[4] = true;
                    x7Var.f34975f = q7Var;
                    zArr[3] = true;
                }
                w05.i j18 = x17.j();
                if (!com.tencent.mm.sdk.platformtools.t8.K0(j18 != null ? j18.getUrl() : null)) {
                    bw5.o7 o7Var = new bw5.o7();
                    w05.i j19 = x17.j();
                    o7Var.f31001d = j19 != null ? j19.getUrl() : null;
                    o7Var.f31006i[1] = true;
                    x7Var.f34976g = o7Var;
                    zArr[4] = true;
                }
                pq.q.Lb(qVar, aVar, x7Var, null, 4, null);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "hy: no context retrieved!");
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "startEcsGiftLogic, subtype is " + subType);
        if (dVar.s().size() <= 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftMsgService", "startEcsGiftLogic, gift msg list is empty");
            return;
        }
        java.lang.Object obj = dVar.s().get(0);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        w05.e eVar = (w05.e) obj;
        b00.p0 p0Var = b00.p0.f16747a;
        java.lang.String y07 = msg.y0();
        if (y07 == null) {
            y07 = "";
        }
        java.lang.String c18 = p0Var.c(y07);
        java.lang.String T0 = msg.T0();
        if (T0 == null) {
            T0 = "";
        }
        java.lang.String c19 = p0Var.c(T0);
        boolean N4 = com.tencent.mm.storage.z3.N4(msg.Q0());
        int wi6 = N4 ? ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(msg.Q0()) : 1;
        n00.e y08 = n00.d.f333815a.a().y0(dVar.t());
        java.lang.String j27 = dVar.j();
        if ((j27.length() == 0) && (j27 = y08.field_appMsgSign) == null) {
            j27 = "";
        }
        boolean z18 = y08.field_hasMsgClicked;
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("wishContent", dVar.C());
        linkedHashMap.put("orderId", eVar.n());
        linkedHashMap.put("giftMsgId", dVar.t());
        linkedHashMap.put("isGiver", java.lang.Boolean.valueOf(z17));
        linkedHashMap.put("giftStatus", java.lang.Long.valueOf(eVar.l()));
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("imgUrl", eVar.q());
        linkedHashMap2.put(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, eVar.s());
        linkedHashMap2.put("saleParamsText", eVar.r());
        linkedHashMap.put("skuCard", linkedHashMap2);
        linkedHashMap.put("isBoxUnWrapped", java.lang.Integer.valueOf(z18 ? 1 : 0));
        linkedHashMap.put("isGroupChatroom", java.lang.Boolean.valueOf(N4));
        linkedHashMap.put("appMsgSign", j27);
        java.lang.String Q0 = msg.Q0();
        if (Q0 == null) {
            Q0 = "";
        }
        linkedHashMap.put("chatroomId", Q0);
        linkedHashMap.put("groupMemberCnt", java.lang.Integer.valueOf(wi6));
        linkedHashMap.put("giftTakeMethod", java.lang.Integer.valueOf(dVar.B()));
        linkedHashMap.put("detailStatusWording", eVar.k());
        linkedHashMap.put("presentCntWording", eVar.o());
        linkedHashMap.put("exclusiveRecUserName", dVar.z());
        w05.f q17 = dVar.q();
        if (q17 == null || (str = q17.l()) == null) {
            str = "";
        }
        linkedHashMap.put("giftMsgCover", str);
        if (q17 == null || (str2 = q17.k()) == null) {
            str2 = "";
        }
        linkedHashMap.put("giftBoxOuterCover", str2);
        if (q17 == null || (str3 = q17.j()) == null) {
            str3 = "";
        }
        linkedHashMap.put("giftBoxInnerCover", str3);
        if (q17 == null || (str4 = q17.n()) == null) {
            str4 = "";
        }
        linkedHashMap.put("giftNormalCover", str4);
        if (q17 == null || (str5 = q17.p()) == null) {
            str5 = "";
        }
        linkedHashMap.put("videorecvcover", str5);
        if (q17 == null || (str6 = q17.o()) == null) {
            str6 = "";
        }
        linkedHashMap.put("videonomalcover", str6);
        linkedHashMap.put("skuTitleTagName", eVar.t());
        linkedHashMap.put("fromProductSet", java.lang.Integer.valueOf(dVar.o()));
        java.util.LinkedList A = dVar.A();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(A, 10));
        java.util.Iterator it = A.iterator();
        while (it.hasNext()) {
            arrayList.add(((w05.n) it.next()).j());
        }
        linkedHashMap.put("skuImgUrlLists", arrayList);
        linkedHashMap.put("drawTimeWording", dVar.l());
        linkedHashMap.put("lotteryMethod", java.lang.Integer.valueOf(dVar.y()));
        java.util.LinkedList r17 = dVar.r();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(r17, 10));
        java.util.Iterator it6 = r17.iterator();
        while (it6.hasNext()) {
            arrayList2.add(java.lang.Byte.valueOf((byte) ((java.lang.Number) it6.next()).intValue()));
        }
        linkedHashMap.put("giftLabels", kz5.n0.N0(arrayList2));
        w05.c p17 = dVar.p();
        if (p17 == null || (str7 = p17.k()) == null) {
            str7 = "";
        }
        linkedHashMap.put("openFrontAnimationResName", str7);
        if (p17 == null || (str8 = p17.j()) == null) {
            str8 = "";
        }
        linkedHashMap.put("openBackgroundAnimationResName", str8);
        linkedHashMap.put("delivery_method", java.lang.Integer.valueOf(eVar.j()));
        w05.m p18 = eVar.p();
        if (p18 == null || (str9 = p18.k()) == null) {
            str9 = "";
        }
        linkedHashMap.put("secretImg", str9);
        if (p18 == null || (str10 = p18.l()) == null) {
            str10 = "";
        }
        linkedHashMap.put("secretImgWithBow", str10);
        if (p18 == null || (str11 = p18.j()) == null) {
            str11 = "";
        }
        linkedHashMap.put("orignialImg", str11);
        if (p18 == null || (str12 = p18.o()) == null) {
            str12 = "";
        }
        linkedHashMap.put("secretTitle", str12);
        if (p18 == null || (str13 = p18.n()) == null) {
            str13 = "";
        }
        linkedHashMap.put("secretSkuDescription", str13);
        linkedHashMap.put("isSecretPresent", java.lang.Boolean.valueOf((p18 != null ? p18.q() : 0) != 0));
        linkedHashMap.put("isRevealed", java.lang.Boolean.valueOf((p18 != null ? p18.p() : 0) != 0));
        if (p17 == null || (str14 = p17.l()) == null) {
            str14 = "";
        }
        linkedHashMap.put("mbBasicItemType", str14);
        if (p17 == null || (str15 = p17.n()) == null) {
            str15 = "";
        }
        linkedHashMap.put("mbFlyItemType", str15);
        linkedHashMap.put("mbMiniVersion", java.lang.Long.valueOf(p17 != null ? p17.o() : 0L));
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (N4) {
            java.lang.String j28 = msg.j();
            if (j28 == null) {
                j28 = "";
            }
            java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(j28, "msg", null);
            if (d17 == null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.EcsGiftUtil", "getAppMsgFromUserName fail, value is null");
                str16 = null;
            } else {
                str16 = (java.lang.String) d17.get(".msg.fromusername");
                com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftUtil", "getAppMsgFromUserName, fromUserName:" + str16);
            }
            if (str16 != null) {
                java.lang.String c27 = p0Var.c(str16);
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.r0 n07 = com.tencent.mm.modelavatar.d1.Ni().n0(str16);
                java.lang.String d18 = n07 != null ? n07.d() : null;
                if (d18 == null) {
                    d18 = "";
                }
                linkedHashMap.put("giverNickName", c27);
                linkedHashMap.put("giverHeadImgUrl", d18);
            }
            i17 = 1;
            linkedHashMap.put("sendType", 1);
            linkedHashMap.put("presentStyleType", 1);
            linkedHashMap.put("isReceiveGiftDisable", java.lang.Integer.valueOf(dVar.k()));
            java.lang.String T02 = msg.T0();
            if (T02 == null) {
                T02 = "";
            }
            linkedHashMap.put("recipientUserName", T02);
        } else {
            i17 = 1;
            java.lang.String y09 = msg.y0();
            if (y09 == null) {
                y09 = "";
            }
            linkedHashMap.put("giverUserName", y09);
            linkedHashMap.put("giverNickName", c18);
            java.lang.String T03 = msg.T0();
            if (T03 == null) {
                T03 = "";
            }
            linkedHashMap.put("recipientUserName", T03);
            linkedHashMap.put("recipientNickName", c19);
            linkedHashMap.put("sendType", 0);
            linkedHashMap.put("presentStyleType", 0);
        }
        qj(context, z17, N4, dVar.t(), eVar.l(), linkedHashMap, null);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("ecs_gift_msg", "view_clk", kz5.c1.k(new jz5.l("type", java.lang.Integer.valueOf(N4 ? 2 : i17)), new jz5.l("group_member_uv", java.lang.Integer.valueOf(wi6)), new jz5.l("chatroom_id", msg.Q0()), new jz5.l("gift_msg_id", dVar.t()), new jz5.l("order_id", eVar.n()), new jz5.l("gift_status", java.lang.Long.valueOf(eVar.l())), new jz5.l("is_sender", java.lang.Integer.valueOf(msg.A0())), new jz5.l("take_method", java.lang.Integer.valueOf(dVar.B()))), 12, false);
    }

    public final void vj() {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f296816m;
        if (atomicBoolean.get()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "triggerOpenPagUdrCheck, already checking UDR, skip");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.EcsGiftMsgService", "triggerOpenPagUdrCheck, triggering UDR check");
        com.tencent.wechat.aff.udr.q qVar = new com.tencent.wechat.aff.udr.q();
        qVar.c("ilinkres_b516b52d");
        atomicBoolean.set(true);
        ((com.tencent.mm.udr.a1) ((com.tencent.mm.udr.e0) i95.n0.c(com.tencent.mm.udr.e0.class))).Di(qVar, new j00.h1(this));
    }
}
