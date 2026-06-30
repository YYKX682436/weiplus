package mm2;

/* loaded from: classes3.dex */
public final class s1 extends mm2.e {
    public boolean A;
    public final java.util.List B;
    public r45.sm1 C;
    public r45.e21 D;
    public boolean E;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f329386f;

    /* renamed from: g, reason: collision with root package name */
    public yg2.b f329387g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329388h;

    /* renamed from: i, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329389i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.LinkedList f329390m;

    /* renamed from: n, reason: collision with root package name */
    public r45.fd2 f329391n;

    /* renamed from: o, reason: collision with root package name */
    public int f329392o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f329393p;

    /* renamed from: q, reason: collision with root package name */
    public long f329394q;

    /* renamed from: r, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329395r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f329396s;

    /* renamed from: t, reason: collision with root package name */
    public int f329397t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f329398u;

    /* renamed from: v, reason: collision with root package name */
    public int f329399v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f329400w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f329401x;

    /* renamed from: y, reason: collision with root package name */
    public r45.xl6 f329402y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f329403z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329386f = "LiveCreatePrepareSlice";
        this.f329388h = kotlinx.coroutines.flow.i3.a(null);
        this.f329389i = kotlinx.coroutines.flow.i3.a(null);
        this.f329392o = -1;
        this.f329393p = "";
        this.f329395r = kotlinx.coroutines.flow.i3.a(null);
        this.f329396s = "";
        this.f329400w = "";
        this.f329401x = "";
        this.f329403z = jz5.h.b(mm2.h1.f329105d);
        this.B = kz5.b0.c(3);
    }

    public final boolean N6(r45.zg7 checkMode, java.util.LinkedList infoList) {
        boolean z17;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(checkMode, "checkMode");
        kotlin.jvm.internal.o.g(infoList, "infoList");
        java.util.Iterator it = infoList.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.p12) obj).getInteger(0) == checkMode.f392044d) {
                break;
            }
        }
        r45.p12 p12Var = (r45.p12) obj;
        if (p12Var == null) {
            return false;
        }
        int ordinal = checkMode.ordinal();
        if (ordinal != 0 && (ordinal == 1 ? !(pm0.v.z(p12Var.getInteger(3), 2) || pm0.v.z(p12Var.getInteger(3), 8) || pm0.v.z(p12Var.getInteger(3), 16)) : !(ordinal == 3 && (pm0.v.z(p12Var.getInteger(3), 1) || pm0.v.z(p12Var.getInteger(3), 2))))) {
            z17 = false;
        }
        return z17;
    }

    public final boolean O6() {
        ae2.in inVar = ae2.in.f3688a;
        return ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3921x6).getValue()).r()).intValue() == 1 || fp.e0.e() || fp.e0.d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final r45.q12 P6() {
        java.lang.String str = this.f329386f;
        r45.q12 q12Var = new r45.q12();
        boolean z17 = true;
        q12Var.set(0, 1);
        q12Var.set(1, 1);
        try {
            java.lang.String v17 = gm0.j1.u().c().v(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_LAST_POST_MODE_STRING_SYNC, "");
            com.tencent.mars.xlog.Log.i(str, "[getLastPostLiveMode] modeStr = " + v17);
            cl0.g gVar = new cl0.g(v17);
            r45.q12 q12Var2 = new r45.q12();
            q12Var2.set(0, java.lang.Integer.valueOf(gVar.optInt("live_mode")));
            q12Var2.set(1, java.lang.Integer.valueOf(gVar.optInt("live_sub_mode")));
            if (q12Var2.getInteger(0) == 5) {
                com.tencent.mars.xlog.Log.i(str, "[getLastPostLiveMode] stored mode is CoLive, fallback to default video mode");
                return q12Var;
            }
            if (q12Var2.getInteger(0) == 2) {
                ae2.in inVar = ae2.in.f3688a;
                if ((((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3886t7).getValue()).r()).booleanValue() && q12Var2.getInteger(1) == 1) || (((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3895u7).getValue()).r()).booleanValue() && q12Var2.getInteger(1) == 8)) {
                    q12Var2.set(1, 2);
                }
            }
            if (q12Var2.getInteger(0) == q12Var.getInteger(0) && q12Var2.getInteger(1) == q12Var.getInteger(1)) {
                com.tencent.mars.xlog.Log.i(str, "lastModeInfo is equals default mode, return ");
                return q12Var2;
            }
            int integer = q12Var2.getInteger(0);
            r45.zg7 zg7Var = r45.zg7.FinderLiveMode_Unknown;
            r45.p12 p12Var = null;
            r45.zg7 zg7Var2 = integer != 0 ? integer != 1 ? integer != 2 ? integer != 3 ? integer != 4 ? integer != 5 ? null : r45.zg7.FinderLiveMode_CoLive : r45.zg7.FinderLiveMode_Ktv : r45.zg7.FinderLiveMode_Game : r45.zg7.FinderLiveMode_Voice : r45.zg7.FinderLiveMode_Video : zg7Var;
            if (zg7Var2 == null || zg7Var2 == zg7Var) {
                com.tencent.mars.xlog.Log.i(str, "lastModeInfo is unKnown");
                return q12Var;
            }
            kotlinx.coroutines.flow.j2 j2Var = this.f329388h;
            java.util.LinkedList linkedList = (java.util.LinkedList) ((kotlinx.coroutines.flow.h3) j2Var).getValue();
            if (!(linkedList != null ? N6(zg7Var2, linkedList) : false)) {
                com.tencent.mars.xlog.Log.i(str, "lastModeInfo is invalid now");
                return q12Var;
            }
            java.util.LinkedList linkedList2 = (java.util.LinkedList) ((kotlinx.coroutines.flow.h3) j2Var).getValue();
            if (linkedList2 != null) {
                java.util.Iterator it = linkedList2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (((r45.p12) next).getInteger(0) == zg7Var2.f392044d) {
                        p12Var = next;
                        break;
                    }
                }
                p12Var = p12Var;
            }
            if (p12Var == null || !(this.B.contains(java.lang.Integer.valueOf(q12Var2.getInteger(0))) || pm0.v.z(p12Var.getInteger(3), q12Var2.getInteger(1)))) {
                com.tencent.mars.xlog.Log.i(str, "lastModeInfo sub mode is invalid now");
                return q12Var;
            }
            com.tencent.mars.xlog.Log.i(str, "get lastModeInfo, mode = " + q12Var2.getInteger(0));
            if (q12Var2.getInteger(0) != 1 || q12Var2.getInteger(1) != 2) {
                z17 = false;
            }
            return (z17 && (O6() || ((mm2.c1) business(mm2.c1.class)).l7())) ? q12Var : q12Var2;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.i(str, "[getLastPostLiveMode] e = " + e17.getMessage());
            return q12Var;
        }
    }

    public final void Q6(r45.q12 q12Var, java.lang.String str, java.lang.String str2) {
        yg2.b bVar;
        com.tencent.mars.xlog.Log.i(this.f329386f, "[initGameModeFromCache] lastPostLiveGameAppId = " + str);
        if (!(str.length() > 0)) {
            str = null;
        }
        java.lang.String str3 = str;
        if (str3 == null || (bVar = this.f329387g) == null) {
            return;
        }
        kotlinx.coroutines.l.d(bVar, null, null, new mm2.j1(str3, this, str2, q12Var, null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:104:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0529  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x05c4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x069f  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0711  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0795  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x07ad  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x07b3  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x060c  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0546  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x056c  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0510 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:356:0x021c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00bc A[LOOP:0: B:33:0x00b6->B:35:0x00bc, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:362:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:369:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:370:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0127 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R6(android.content.Intent r31, dk2.x4 r32) {
        /*
            Method dump skipped, instructions count: 2010
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.s1.R6(android.content.Intent, dk2.x4):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:52:0x000c, B:5:0x001b, B:9:0x0023, B:12:0x002d, B:17:0x003b, B:19:0x0041, B:21:0x0047, B:23:0x004f, B:24:0x0055, B:26:0x0061, B:29:0x008b, B:31:0x009a, B:35:0x00a6, B:37:0x00ba, B:39:0x00c2, B:43:0x00ca), top: B:51:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061 A[Catch: Exception -> 0x0015, TRY_LEAVE, TryCatch #0 {Exception -> 0x0015, blocks: (B:52:0x000c, B:5:0x001b, B:9:0x0023, B:12:0x002d, B:17:0x003b, B:19:0x0041, B:21:0x0047, B:23:0x004f, B:24:0x0055, B:26:0x0061, B:29:0x008b, B:31:0x009a, B:35:0x00a6, B:37:0x00ba, B:39:0x00c2, B:43:0x00ca), top: B:51:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008b A[Catch: Exception -> 0x0015, TRY_ENTER, TryCatch #0 {Exception -> 0x0015, blocks: (B:52:0x000c, B:5:0x001b, B:9:0x0023, B:12:0x002d, B:17:0x003b, B:19:0x0041, B:21:0x0047, B:23:0x004f, B:24:0x0055, B:26:0x0061, B:29:0x008b, B:31:0x009a, B:35:0x00a6, B:37:0x00ba, B:39:0x00c2, B:43:0x00ca), top: B:51:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a6 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:52:0x000c, B:5:0x001b, B:9:0x0023, B:12:0x002d, B:17:0x003b, B:19:0x0041, B:21:0x0047, B:23:0x004f, B:24:0x0055, B:26:0x0061, B:29:0x008b, B:31:0x009a, B:35:0x00a6, B:37:0x00ba, B:39:0x00c2, B:43:0x00ca), top: B:51:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x001b A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:52:0x000c, B:5:0x001b, B:9:0x0023, B:12:0x002d, B:17:0x003b, B:19:0x0041, B:21:0x0047, B:23:0x004f, B:24:0x0055, B:26:0x0061, B:29:0x008b, B:31:0x009a, B:35:0x00a6, B:37:0x00ba, B:39:0x00c2, B:43:0x00ca), top: B:51:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6(r45.q12 r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.s1.S6(r45.q12):void");
    }

    public final void T6() {
        r45.q12 q12Var = new r45.q12();
        q12Var.set(0, 1);
        q12Var.set(1, 1);
        ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).k(q12Var);
        ((mm2.e1) business(mm2.e1.class)).n7(q12Var);
    }

    public final void U6(r45.q12 q12Var) {
        java.lang.Object obj;
        java.util.LinkedList linkedList = (java.util.LinkedList) ((kotlinx.coroutines.flow.h3) this.f329388h).getValue();
        boolean z17 = false;
        if (linkedList != null) {
            java.util.Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.p12) obj).getInteger(0) == q12Var.getInteger(0)) {
                        break;
                    }
                }
            }
            r45.p12 p12Var = (r45.p12) obj;
            if (p12Var != null && (p12Var.getInteger(3) == 0 || pm0.v.z(p12Var.getInteger(3), q12Var.getInteger(1)))) {
                z17 = true;
            }
        }
        if (!z17) {
            T6();
        } else {
            ((kotlinx.coroutines.flow.h3) ((mm2.g1) business(mm2.g1.class)).f329068f).k(q12Var);
            ((mm2.e1) business(mm2.e1.class)).n7(q12Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(r45.n73 r7) {
        /*
            r6 = this;
            java.lang.String r0 = ""
            if (r7 == 0) goto L64
            r1 = 3
            com.tencent.mm.protobuf.f r1 = r7.getCustom(r1)
            r45.s63 r1 = (r45.s63) r1
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L25
            java.lang.String r1 = r1.getString(r4)
            if (r1 == 0) goto L25
            int r5 = r1.length()
            if (r5 <= 0) goto L1e
            r5 = r4
            goto L1f
        L1e:
            r5 = r2
        L1f:
            if (r5 == 0) goto L22
            goto L23
        L22:
            r1 = r3
        L23:
            if (r1 != 0) goto L38
        L25:
            com.tencent.mm.protobuf.f r1 = r7.getCustom(r4)
            r45.z53 r1 = (r45.z53) r1
            if (r1 == 0) goto L34
            r5 = 9
            java.lang.String r1 = r1.getString(r5)
            goto L35
        L34:
            r1 = r3
        L35:
            if (r1 != 0) goto L38
            r1 = r0
        L38:
            km2.g r5 = km2.g.f309100a
            com.tencent.mm.protobuf.f r7 = r7.getCustom(r4)
            r45.z53 r7 = (r45.z53) r7
            if (r7 == 0) goto L48
            java.lang.String r7 = r7.getString(r2)
            if (r7 != 0) goto L49
        L48:
            r7 = r0
        L49:
            km2.e r7 = r5.d(r7)
            if (r7 == 0) goto L55
            java.lang.String r7 = r7.f309090a
            if (r7 != 0) goto L54
            goto L55
        L54:
            r0 = r7
        L55:
            int r7 = r0.length()
            if (r7 <= 0) goto L5c
            r2 = r4
        L5c:
            if (r2 == 0) goto L5f
            r3 = r0
        L5f:
            if (r3 != 0) goto L63
            r0 = r1
            goto L64
        L63:
            r0 = r3
        L64:
            java.lang.Class<mm2.g1> r7 = mm2.g1.class
            androidx.lifecycle.c1 r7 = r6.business(r7)
            mm2.g1 r7 = (mm2.g1) r7
            kotlinx.coroutines.flow.j2 r7 = r7.f329079t
            kotlinx.coroutines.flow.h3 r7 = (kotlinx.coroutines.flow.h3) r7
            r7.k(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.s1.V6(r45.n73):void");
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        yg2.b bVar = this.f329387g;
        if (bVar != null) {
            kotlinx.coroutines.z0.c(bVar, null);
        }
    }
}
