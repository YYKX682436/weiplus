package mm2;

/* loaded from: classes3.dex */
public final class o4 extends mm2.e {
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData A;
    public final dk2.qf A1;
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData B;
    public boolean B1;
    public int C;
    public int C1;
    public boolean D;
    public long D1;
    public int E;
    public java.lang.String E1;
    public int F;
    public final int[] F1;
    public boolean G;
    public final int[] G1;
    public final kotlinx.coroutines.flow.j2 H;
    public final int[] H1;
    public boolean I;
    public final int[] I1;

    /* renamed from: J, reason: collision with root package name */
    public boolean f329310J;
    public final int[] J1;
    public final java.util.HashMap K;
    public final int[] K1;
    public final kotlinx.coroutines.flow.j2 L;
    public final int[] L1;
    public final kotlinx.coroutines.flow.j2 M;
    public final int[] M1;
    public final kotlinx.coroutines.flow.j2 N;
    public final int[] N1;
    public final int[] O1;
    public final java.util.Set P;
    public final int[] P1;
    public final com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData Q;
    public int R;
    public km2.q S;
    public final java.util.List T;
    public r45.il4 U;
    public long V;
    public km2.c W;
    public boolean X;
    public boolean Y;
    public dk2.u4 Z;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.i2 f329311f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329312g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f329313h;

    /* renamed from: i, reason: collision with root package name */
    public final km2.q f329314i;

    /* renamed from: l1, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f329315l1;

    /* renamed from: m, reason: collision with root package name */
    public long f329316m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f329317n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f329318o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.List f329319p;

    /* renamed from: p0, reason: collision with root package name */
    public int f329320p0;

    /* renamed from: p1, reason: collision with root package name */
    public final kotlinx.coroutines.flow.f3 f329321p1;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f329322q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.util.b0 f329323r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f329324s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f329325t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.Map f329326u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f329327v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f329328w;

    /* renamed from: x, reason: collision with root package name */
    public final java.util.Map f329329x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f329330x0;

    /* renamed from: x1, reason: collision with root package name */
    public int f329331x1;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.List f329332y;

    /* renamed from: y0, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f329333y0;

    /* renamed from: y1, reason: collision with root package name */
    public int f329334y1;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f329335z;

    /* renamed from: z1, reason: collision with root package name */
    public int f329336z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o4(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f329311f = kotlinx.coroutines.flow.r2.b(0, 1, null, 5, null);
        this.f329312g = kotlinx.coroutines.flow.i3.a(new km2.w());
        java.lang.String str = ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n;
        java.lang.String str2 = str == null ? "" : str;
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 b17 = gVar.b(((mm2.c1) business(mm2.c1.class)).f328852o);
        java.lang.String y07 = b17 != null ? b17.y0() : null;
        java.lang.String str3 = ((mm2.c1) business(mm2.c1.class)).f328852o;
        ya2.b2 b18 = gVar.b(((mm2.c1) business(mm2.c1.class)).f328852o);
        java.lang.String w07 = b18 != null ? b18.w0() : null;
        int l86 = ((mm2.c1) business(mm2.c1.class)).l8();
        r45.xn1 xn1Var = new r45.xn1();
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) business(mm2.c1.class)).f328846n;
        xn1Var.set(0, finderObject != null ? finderObject.getContact() : null);
        xn1Var.set(7, 3);
        this.f329314i = new km2.q(str2, y07, str3, w07, 0, null, null, false, l86, null, null, 0, 0, false, null, false, 0L, xn1Var, false, null, ((mm2.c1) business(mm2.c1.class)).w7(), 0, 1, 0L, null, null, 0L, null, 0, 0L, null, null, null, -5374272, 1, null);
        this.f329317n = "";
        this.f329318o = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329319p = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329322q = java.util.Collections.synchronizedList(new java.util.ArrayList());
        com.tencent.mm.plugin.finder.live.util.b0 b0Var = new com.tencent.mm.plugin.finder.live.util.b0();
        this.f329323r = b0Var;
        this.f329324s = java.util.Collections.synchronizedList(b0Var);
        this.f329325t = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329326u = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.f329327v = java.util.Collections.synchronizedList(new com.tencent.mm.plugin.finder.live.util.b0());
        this.f329328w = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.f329329x = java.util.Collections.synchronizedMap(new java.util.HashMap());
        this.f329332y = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.f329335z = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.A = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.B = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.E = -1;
        this.F = -1;
        this.H = kotlinx.coroutines.flow.i3.a(java.lang.Boolean.FALSE);
        this.f329310J = true;
        this.K = new java.util.HashMap();
        this.L = kotlinx.coroutines.flow.i3.a("");
        this.M = kotlinx.coroutines.flow.i3.a(null);
        this.N = kotlinx.coroutines.flow.i3.a(null);
        this.P = java.util.Collections.synchronizedSet(new java.util.HashSet());
        this.Q = new com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData();
        this.T = java.util.Collections.synchronizedList(new java.util.ArrayList());
        this.U = new r45.il4();
        kotlinx.coroutines.flow.j2 a17 = kotlinx.coroutines.flow.i3.a(0L);
        this.f329333y0 = a17;
        this.f329321p1 = kotlinx.coroutines.flow.l.b(a17);
        this.f329331x1 = 1;
        this.A1 = new dk2.qf(null, null, null, 0, false, 0, 0, 0, 0, 0L, 0L, 0L, 0L, false, false, 0L, null, false, false, 0L, null, 0, null, null, null, false, null, 134217727, null);
        this.D1 = -1L;
        this.E1 = "";
        this.F1 = new int[]{20004};
        this.G1 = new int[]{20003};
        this.H1 = new int[]{20005};
        this.I1 = new int[]{20093};
        this.J1 = new int[]{20094};
        this.K1 = new int[]{20095};
        this.L1 = new int[]{20018};
        this.M1 = new int[]{20029};
        this.N1 = new int[]{20026};
        this.O1 = new int[]{20028};
        this.P1 = new int[]{20099};
    }

    public final boolean A7() {
        java.util.LinkedList linkedList;
        if (this.f329324s.size() != 0) {
            return false;
        }
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.LiveMutableData liveMutableData = this.A;
        xh2.c cVar = (xh2.c) liveMutableData.getValue();
        if (((cVar == null || (linkedList = cVar.f454531a) == null) ? 0 : linkedList.size()) < 5) {
            return false;
        }
        xh2.c cVar2 = (xh2.c) liveMutableData.getValue();
        return cVar2 != null && cVar2.f454533c == 0;
    }

    public final boolean B7(r45.kf5 last, r45.kf5 kf5Var) {
        kotlin.jvm.internal.o.g(last, "last");
        kotlin.jvm.internal.o.g(kf5Var, "new");
        return (last.f378656d == kf5Var.f378656d && last.f378658f == kf5Var.f378658f && last.f378659g == kf5Var.f378659g) ? false : true;
    }

    public final boolean C7() {
        km2.q qVar = this.S;
        return pm0.v.z(qVar != null ? qVar.f309191v : 0, 16);
    }

    public final boolean D7() {
        return this.D;
    }

    public final boolean E7() {
        return ((mm2.o4) business(mm2.o4.class)).C == 1 || ((mm2.o4) business(mm2.o4.class)).C == 2 || ((mm2.o4) business(mm2.o4.class)).C == 5;
    }

    public final boolean F7() {
        return ((mm2.o4) business(mm2.o4.class)).C == 6;
    }

    public final boolean G7() {
        return ((mm2.o4) business(mm2.o4.class)).C == 3 || ((mm2.o4) business(mm2.o4.class)).C == 4;
    }

    public final void H7(no0.a aVar) {
        no0.g gVar = no0.k.f338729a;
        if (gVar != null) {
            gVar.onAcceptLiveMic(aVar);
        }
        ((kotlinx.coroutines.flow.h3) this.f329312g).k(new km2.a(aVar));
    }

    public final void I7(r45.im1 info, r45.gd2 templateInfo) {
        kotlin.jvm.internal.o.g(info, "info");
        kotlin.jvm.internal.o.g(templateInfo, "templateInfo");
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "[BattleTemplateInfo] curBattleInfo:" + this.Z + " enableNewAnchorPkMic: " + ((mm2.c1) business(mm2.c1.class)).f328926z3);
        if (((mm2.c1) business(mm2.c1.class)).f328926z3) {
            int integer = info.getInteger(13);
            if (integer != 0) {
                if (integer == 1 || integer == 2) {
                    ((kotlinx.coroutines.flow.h3) this.N).k(new jz5.l(info, templateInfo));
                    return;
                } else if (integer != 3) {
                    return;
                }
            }
            ((kotlinx.coroutines.flow.h3) this.M).k(new jz5.l(info, templateInfo));
            return;
        }
        dk2.u4 u4Var = this.Z;
        if (u4Var == null || u4Var.f234158e == 3 || !com.tencent.mm.sdk.platformtools.t8.D0(u4Var.f234154a, info.getString(0))) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[BattleTemplateInfo] battlin curLeftTime: ");
        dk2.u4 u4Var2 = this.Z;
        sb6.append(u4Var2 != null ? java.lang.Integer.valueOf(u4Var2.f234156c) : null);
        sb6.append(" battleLeft: ");
        sb6.append(info.getInteger(3));
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb6.toString());
        if (u4Var.f234156c - info.getInteger(3) >= 3) {
            u4Var.f234156c = info.getInteger(3);
        }
        u4Var.f234157d = info.getInteger(5);
        java.util.LinkedList list = info.getList(4);
        kotlin.jvm.internal.o.f(list, "getPlayer_info(...)");
        u4Var.m(list);
        u4Var.f234165l = (r45.hm1) info.getCustom(12);
    }

    public final void J7(no0.f fVar) {
        no0.g gVar = no0.k.f338729a;
        if (gVar != null) {
            gVar.onCloseLiveMic(fVar);
        }
        ((kotlinx.coroutines.flow.h3) this.f329312g).k(new km2.h(fVar));
    }

    public final java.lang.String K7(java.util.LinkedList linkedList) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        kotlin.jvm.internal.o.g(linkedList, "<this>");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        for (java.lang.Object obj : linkedList) {
            int i18 = i17 + 1;
            java.lang.String str = null;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.yt4 yt4Var = (r45.yt4) obj;
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[ index: ");
            sb7.append(i17);
            sb7.append(' ');
            kotlin.jvm.internal.o.g(yt4Var, "<this>");
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("pkInfo: sdk_user_id= ");
            sb8.append(yt4Var.getString(1));
            sb8.append(", sdk_live_id= ");
            sb8.append(yt4Var.getInteger(2));
            sb8.append(", session_id= ");
            sb8.append(yt4Var.getString(3));
            sb8.append(" nickName: ");
            r45.xn1 xn1Var = (r45.xn1) yt4Var.getCustom(0);
            if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
                str = finderContact.getNickname();
            }
            sb8.append(str);
            sb8.append(" micPkFlag: ");
            sb8.append(yt4Var.getLong(4));
            sb7.append(sb8.toString());
            sb7.append(" ]");
            sb6.append(sb7.toString());
            i17 = i18;
        }
        java.lang.String sb9 = sb6.toString();
        kotlin.jvm.internal.o.f(sb9, "toString(...)");
        return sb9;
    }

    public final void L7(km2.q qVar) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        if (qVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("safeAddAnchorPkMicuUser sdkUserId: ");
            sb6.append(qVar.f309170a);
            sb6.append(" liveId: ");
            sb6.append(qVar.f309178i);
            sb6.append(" nickName: ");
            r45.xn1 xn1Var = qVar.f309187r;
            sb6.append((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb6.toString());
            java.util.List list = this.f329319p;
            kotlin.jvm.internal.o.d(list);
            pm0.v.G(list, new mm2.j4(qVar));
            java.util.List list2 = this.f329324s;
            kotlin.jvm.internal.o.d(list2);
            pm0.v.G(list2, new mm2.k4(qVar));
            list2.add(qVar);
        }
    }

    public final void M7(km2.q qVar) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        if (qVar != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("safeAddAnchorPkTempMicUser temp sdkUserId: ");
            sb6.append(qVar.f309170a);
            sb6.append(" nickName: ");
            r45.xn1 xn1Var = qVar.f309187r;
            sb6.append((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb6.toString());
            java.util.List list = this.f329325t;
            kotlin.jvm.internal.o.d(list);
            pm0.v.G(list, new mm2.l4(qVar));
            list.add(qVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N6(java.util.LinkedList r8) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.o4.N6(java.util.LinkedList):void");
    }

    public final void N7(km2.q qVar) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        if (qVar != null) {
            java.util.Map map = this.f329328w;
            synchronized (map) {
                map.put(qVar.f309170a, qVar);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("safeAddAudienceTempMicUser temp sdkUserId: ");
            sb6.append(qVar.f309170a);
            sb6.append(" nickName: ");
            r45.xn1 xn1Var = qVar.f309187r;
            sb6.append((xn1Var == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact.getNickname());
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb6.toString());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:210:0x0559  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x056a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x06f6  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void O6(java.util.LinkedList r43) {
        /*
            Method dump skipped, instructions count: 1791
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.o4.O6(java.util.LinkedList):void");
    }

    public final void O7(km2.q qVar) {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "safeAddLinkMicUserInfo linkMicUserInfoList: " + qVar);
        if (qVar != null) {
            java.util.List list = this.f329335z;
            kotlin.jvm.internal.o.d(list);
            pm0.v.G(list, new mm2.m4(qVar));
            list.add(qVar);
        }
    }

    public final void P6() {
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        if (dk2.ef.f233384g) {
            ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
            tn0.w0 w0Var = dk2.ef.f233378d;
            boolean z17 = w0Var instanceof in0.q;
            if (z17) {
                if ((z17 ? (in0.q) w0Var : null) != null) {
                    zn0.x.f474414a.b();
                    return;
                }
                return;
            }
            return;
        }
        java.util.List list = this.f329327v;
        kotlin.jvm.internal.o.d(list);
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) next).f309170a, ((mm2.c1) business(mm2.c1.class)).m8())) {
                    r1 = next;
                    break;
                }
            }
        }
        km2.q qVar = (km2.q) r1;
        if (qVar != null) {
            J7(new no0.f(((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0), qVar.f309172c, qVar.f309175f, qVar.f309170a, qVar.f309174e));
            java.util.List list2 = this.f329335z;
            kotlin.jvm.internal.o.d(list2);
            pm0.v.G(list2, new mm2.a3(this));
            if (com.tencent.mm.sdk.platformtools.t8.D0(qVar.f309170a, ((mm2.c1) business(mm2.c1.class)).m8())) {
                Q7(0);
            }
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "checkCloseMic, [sdkUserId:" + qVar.f309170a + "] , closeUser:" + qVar + ", audienceLinkMicState:" + this.C);
        }
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        dk2.ef efVar = dk2.ef.f233372a;
        efVar.W();
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        efVar.n0();
    }

    public final void P7(java.lang.String value) {
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "set applySessionId: ".concat(value));
        this.f329317n = value;
    }

    public final void Q6(java.util.LinkedList linkedList) {
        boolean z17;
        boolean z18;
        java.lang.Object obj;
        java.lang.Object obj2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        no0.g gVar;
        tn0.w0 w0Var;
        kn0.p pVar;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        java.lang.Object obj3;
        java.lang.String str;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (kz5.z.F(this.H1, ((r45.ch1) next).getInteger(1))) {
                arrayList.add(next);
            }
        }
        linkedList2.addAll(arrayList);
        java.util.ArrayList<r45.ch1> arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj4 : linkedList2) {
            r45.xn1 xn1Var = (r45.xn1) ((r45.ch1) obj4).getCustom(13);
            if (!com.tencent.mm.sdk.platformtools.t8.D0((xn1Var == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact5.getUsername(), c01.z1.r())) {
                arrayList2.add(obj4);
            }
        }
        for (r45.ch1 ch1Var : arrayList2) {
            r45.xh1 xh1Var = new r45.xh1();
            com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    xh1Var.parseFrom(g17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "receive close mic msg, [sdkUserId:" + xh1Var.getString(0) + ", sessionId:" + ch1Var.getString(7) + "], curLiveUser:" + l7() + ", audienceLinkMicUserList:" + this.f329327v + ", applySessionId:" + this.f329317n + " audienceExitLinkMicUserTempMap: " + this.f329329x.get(xh1Var.getString(0)));
            java.lang.String string = ch1Var.getString(7);
            if (string != null) {
                this.K.put(string, 3);
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                if (!dk2.ef.f233384g) {
                    java.util.List list = this.f329327v;
                    kotlin.jvm.internal.o.d(list);
                    synchronized (list) {
                        java.util.Iterator it6 = list.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                obj = it6.next();
                                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj).f309175f, ch1Var.getString(7))) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                    }
                    km2.q qVar = (km2.q) obj;
                    java.util.List list2 = this.f329335z;
                    kotlin.jvm.internal.o.d(list2);
                    synchronized (list2) {
                        java.util.Iterator it7 = list2.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                obj2 = it7.next();
                                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj2).f309175f, ch1Var.getString(7))) {
                                    break;
                                }
                            } else {
                                obj2 = null;
                                break;
                            }
                        }
                    }
                    km2.q qVar2 = (km2.q) obj2;
                    boolean E7 = ((mm2.o4) business(mm2.o4.class)).E7();
                    boolean G7 = ((mm2.o4) business(mm2.o4.class)).G7();
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "receive close mic msg closeUser: " + qVar + " applySessionId: " + this.f329317n + " closeSessionId: " + string + " linkMicWait: " + E7 + " linking: " + G7);
                    if (qVar != null) {
                        long j17 = ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0);
                        r45.xn1 xn1Var2 = (r45.xn1) ch1Var.getCustom(13);
                        J7(new no0.f(j17, (xn1Var2 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact2.getUsername(), ch1Var.getString(7), qVar.f309170a, qVar.f309174e));
                        java.util.List list3 = this.f329335z;
                        kotlin.jvm.internal.o.d(list3);
                        pm0.v.G(list3, new mm2.i3(ch1Var));
                        if (com.tencent.mm.sdk.platformtools.t8.D0(qVar.f309170a, ((mm2.c1) business(mm2.c1.class)).m8())) {
                            ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                            dk2.ef efVar = dk2.ef.f233372a;
                            tn0.w0 w0Var2 = dk2.ef.f233378d;
                            if ((w0Var2 == null || (pVar = w0Var2.D) == null || !pVar.f()) ? false : true) {
                                mm2.c1 c1Var = (mm2.c1) efVar.i(mm2.c1.class);
                                if ((c1Var != null && c1Var.P6() == 1) && (w0Var = dk2.ef.f233378d) != null) {
                                    w0Var.F(new dk2.fd());
                                }
                            }
                            Q7(0);
                        }
                        java.lang.String string2 = xh1Var.getString(0);
                        if (string2 == null) {
                            string2 = "";
                        }
                        Y6(string2);
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "receive close mic msg 11");
                    } else if ((E7 || G7) && com.tencent.mm.sdk.platformtools.t8.D0(((mm2.c1) business(mm2.c1.class)).m8(), xh1Var.getString(0)) && com.tencent.mm.sdk.platformtools.t8.D0(((mm2.o4) business(mm2.o4.class)).f329317n, string)) {
                        int i17 = this.C;
                        z18 = true;
                        int i18 = (i17 == 1 || i17 == 3) ? 1 : 2;
                        Q7(0);
                        long j18 = ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0);
                        r45.xn1 xn1Var3 = (r45.xn1) ch1Var.getCustom(13);
                        J7(new no0.f(j18, (xn1Var3 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact.getUsername(), ch1Var.getString(7), xh1Var.getString(0), i18));
                        java.lang.String string3 = xh1Var.getString(0);
                        if (string3 == null) {
                            string3 = "";
                        }
                        Y6(string3);
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "receive close mic msg 222");
                        if (qVar2 != null && ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) this.H).getValue()).booleanValue() && com.tencent.mm.sdk.platformtools.t8.D0(((mm2.c1) business(mm2.c1.class)).m8(), xh1Var.getString(0))) {
                            pm0.v.X(mm2.x3.f329527d);
                            finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xh1Var.getCustom(2);
                            if (finderJumpInfo != null && (gVar = no0.k.f338729a) != null) {
                                gVar.jumpPayEvaluate(finderJumpInfo);
                            }
                        }
                        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "visitor receive close msg, [sdkUserId:" + xh1Var.getString(0) + "], selfSdkUserId:" + ((mm2.c1) business(mm2.c1.class)).m8() + ", closeUser:" + qVar + ", audienceLinkMicState:" + this.C);
                        z17 = z18;
                    }
                    z18 = true;
                    if (qVar2 != null) {
                        pm0.v.X(mm2.x3.f329527d);
                        finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) xh1Var.getCustom(2);
                        if (finderJumpInfo != null) {
                            gVar.jumpPayEvaluate(finderJumpInfo);
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "visitor receive close msg, [sdkUserId:" + xh1Var.getString(0) + "], selfSdkUserId:" + ((mm2.c1) business(mm2.c1.class)).m8() + ", closeUser:" + qVar + ", audienceLinkMicState:" + this.C);
                    z17 = z18;
                } else if (this.f329329x.get(xh1Var.getString(0)) == null) {
                    java.util.List list4 = this.f329327v;
                    kotlin.jvm.internal.o.d(list4);
                    synchronized (list4) {
                        java.util.Iterator it8 = list4.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                obj3 = it8.next();
                                if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) obj3).f309175f, ch1Var.getString(7))) {
                                    break;
                                }
                            } else {
                                obj3 = null;
                                break;
                            }
                        }
                    }
                    km2.q qVar3 = (km2.q) obj3;
                    if (qVar3 != null) {
                        long j19 = ((mm2.e1) business(mm2.e1.class)).f328988r.getLong(0);
                        r45.xn1 xn1Var4 = (r45.xn1) ch1Var.getCustom(13);
                        J7(new no0.f(j19, (xn1Var4 == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null) ? null : finderContact4.getUsername(), ch1Var.getString(7), qVar3.f309170a, qVar3.f309174e));
                        java.util.List list5 = this.f329327v;
                        kotlin.jvm.internal.o.d(list5);
                        pm0.v.G(list5, new mm2.d3(ch1Var));
                    }
                    com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "anchor receive close msg, [sdkUserId:" + xh1Var.getString(0) + "] closeUser:" + qVar3 + " linkMicUserList: " + this.f329318o);
                    java.util.List list6 = this.f329318o;
                    kotlin.jvm.internal.o.d(list6);
                    kz5.h0.B(list6, new mm2.e3(ch1Var));
                    java.util.Map map = this.f329328w;
                    kotlin.jvm.internal.o.d(map);
                    pm0.v.H(map, new mm2.f3(ch1Var));
                    java.util.List list7 = this.f329322q;
                    kotlin.jvm.internal.o.d(list7);
                    kz5.h0.B(list7, new mm2.g3(ch1Var));
                    java.util.List list8 = this.f329335z;
                    kotlin.jvm.internal.o.d(list8);
                    pm0.v.G(list8, new mm2.h3(ch1Var));
                    java.util.Map map2 = ((mm2.y2) business(mm2.y2.class)).A;
                    r45.xn1 xn1Var5 = (r45.xn1) ch1Var.getCustom(13);
                    if (xn1Var5 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) == null || (str = finderContact3.getUsername()) == null) {
                        str = "";
                    }
                    map2.remove(str);
                }
            }
            z18 = z17;
            z17 = z18;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("closeMicMsgList:");
        sb6.append(arrayList2.size());
        sb6.append(" isAnchor:");
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        sb6.append(dk2.ef.f233384g);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb6.toString());
    }

    public final void Q7(int i17) {
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        if (dk2.ef.f233384g) {
            com.tencent.mars.xlog.Log.e("MMFinder.LiveLinkMicSlice", "set audienceLinkMicState: " + i17 + ", isAnchor: true");
            return;
        }
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "set audienceLinkMicState: " + i17);
        this.C = i17;
        pm0.v.X(new mm2.z2(this, i17));
    }

    public final void R6(java.util.LinkedList linkedList) {
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact5;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact6;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : linkedList) {
            if (kz5.z.F(this.J1, ((r45.ch1) obj).getInteger(1))) {
                arrayList.add(obj);
            }
        }
        linkedList2.addAll(arrayList);
        r45.ch1 ch1Var = (r45.ch1) kz5.n0.Z(linkedList2);
        if (ch1Var != null) {
            r45.hj1 hj1Var = new r45.hj1();
            com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    hj1Var.parseFrom(g17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LinkMicNewAnchorPk] receive accept pk msg, fromNick: ");
            r45.xn1 xn1Var = (r45.xn1) ch1Var.getCustom(13);
            sb6.append((xn1Var == null || (finderContact6 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact6.getNickname());
            sb6.append(" toNick: ");
            r45.xn1 xn1Var2 = (r45.xn1) ch1Var.getCustom(0);
            sb6.append((xn1Var2 == null || (finderContact5 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var2.getCustom(0)) == null) ? null : finderContact5.getNickname());
            sb6.append(" [sessionId:");
            sb6.append(ch1Var.getString(7));
            sb6.append("], acceptSession: ");
            sb6.append(hj1Var.getString(1));
            sb6.append(" vroom_id:");
            sb6.append(hj1Var.getString(2));
            sb6.append(", vroom_id_version:");
            sb6.append(hj1Var.getLong(3));
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb6.toString());
            mm2.l3 l3Var = new mm2.l3(ch1Var);
            ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
            if (dk2.ef.f233384g) {
                java.lang.String string = hj1Var.getString(1);
                if (string == null) {
                    string = "";
                }
                java.lang.String string2 = hj1Var.getString(2);
                if (string2 == null) {
                    string2 = "";
                    str = string2;
                } else {
                    str = "";
                }
                this.W = new km2.c(string, string2, hj1Var.getLong(3));
                this.X = false;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("[LinkMicNewAnchorPk] anchor accept pk, curAnchorMicPkData: ");
                sb7.append(this.W);
                sb7.append(" pkroom_anchors: ");
                java.util.LinkedList list = hj1Var.getList(0);
                kotlin.jvm.internal.o.f(list, "getPkroom_anchors(...)");
                sb7.append(K7(list));
                com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb7.toString());
                java.util.LinkedList list2 = hj1Var.getList(0);
                kotlin.jvm.internal.o.f(list2, "getPkroom_anchors(...)");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                for (java.lang.Object obj2 : list2) {
                    r45.xn1 xn1Var3 = (r45.xn1) ((r45.yt4) obj2).getCustom(0);
                    java.lang.String username = (xn1Var3 == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact4.getUsername();
                    kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "getContext(...)");
                    if (!kotlin.jvm.internal.o.b(username, xy2.c.e(r10))) {
                        arrayList2.add(obj2);
                    }
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("[LinkMicNewAnchorPk] anchorTrtcEnterStateMap: ");
                java.util.Set set = this.P;
                sb8.append(set);
                sb8.append(" pkroom_anchors： ");
                sb8.append(arrayList2);
                com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb8.toString());
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    java.lang.Object next = it.next();
                    if (!set.contains(((r45.yt4) next).getString(1))) {
                        arrayList3.add(next);
                    }
                }
                java.util.Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    r45.yt4 yt4Var = (r45.yt4) it6.next();
                    java.util.List list3 = this.f329325t;
                    kotlin.jvm.internal.o.d(list3);
                    kotlin.jvm.internal.o.d(yt4Var);
                    l3Var.invoke(list3, yt4Var, null);
                }
                java.util.List list4 = this.f329324s;
                int size = list4.size();
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.Iterator it7 = arrayList2.iterator();
                while (it7.hasNext()) {
                    java.lang.Object next2 = it7.next();
                    if (set.contains(((r45.yt4) next2).getString(1))) {
                        arrayList4.add(next2);
                    }
                }
                java.util.Iterator it8 = arrayList4.iterator();
                while (it8.hasNext()) {
                    r45.yt4 yt4Var2 = (r45.yt4) it8.next();
                    java.util.List list5 = this.f329319p;
                    kotlin.jvm.internal.o.d(list5);
                    pm0.v.I(list5, new mm2.j3(yt4Var2));
                    kotlin.jvm.internal.o.d(yt4Var2);
                    l3Var.invoke(list4, yt4Var2, null);
                    c61.ac acVar = (c61.ac) i95.n0.c(c61.ac.class);
                    r45.xn1 xn1Var4 = (r45.xn1) yt4Var2.getCustom(0);
                    if (xn1Var4 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null || (str2 = finderContact3.getUsername()) == null) {
                        str2 = str;
                    }
                    ((b92.g1) acVar).getClass();
                    mk2.h hVar = mk2.h.f327133a;
                    hVar.d(str2);
                    c61.ac acVar2 = (c61.ac) i95.n0.c(c61.ac.class);
                    r45.xn1 xn1Var5 = (r45.xn1) yt4Var2.getCustom(0);
                    if (xn1Var5 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) == null || (str3 = finderContact2.getUsername()) == null) {
                        str3 = str;
                    }
                    ((b92.g1) acVar2).getClass();
                    hVar.b(str3);
                }
                if (size != list4.size()) {
                    android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                    db5.t7.makeText(context, context.getResources().getString(com.tencent.mm.R.string.f491452d46), 0).show();
                }
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                dk2.ef efVar = dk2.ef.f233372a;
                pm0.v.X(dk2.af.f233210d);
                ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
                tn0.w0 w0Var = dk2.ef.f233378d;
                if (w0Var != null) {
                    w0Var.M0(false);
                }
            } else {
                java.util.LinkedList list6 = hj1Var.getList(0);
                kotlin.jvm.internal.o.f(list6, "getPkroom_anchors(...)");
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                for (java.lang.Object obj3 : list6) {
                    r45.xn1 xn1Var6 = (r45.xn1) ((r45.yt4) obj3).getCustom(0);
                    if (!kotlin.jvm.internal.o.b((xn1Var6 == null || (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var6.getCustom(0)) == null) ? null : finderContact.getUsername(), ((mm2.c1) business(mm2.c1.class)).f328852o)) {
                        arrayList5.add(obj3);
                    }
                }
                java.util.Iterator it9 = arrayList5.iterator();
                while (it9.hasNext()) {
                    r45.yt4 yt4Var3 = (r45.yt4) it9.next();
                    java.util.List list7 = this.f329335z;
                    kotlin.jvm.internal.o.d(list7);
                    kotlin.jvm.internal.o.d(yt4Var3);
                    l3Var.invoke(list7, yt4Var3, null);
                }
            }
        }
        java.lang.StringBuilder sb9 = new java.lang.StringBuilder("[LinkMicNewAnchorPk] acceptMicMsgPkList:");
        sb9.append(linkedList2.size());
        sb9.append(" isAnchor:");
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        sb9.append(dk2.ef.f233384g);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb9.toString());
    }

    public final void R7(boolean z17) {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "set isWaitingRandomMatch: " + z17);
        this.D = z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void S6(java.util.LinkedList r19) {
        /*
            Method dump skipped, instructions count: 1071
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.o4.S6(java.util.LinkedList):void");
    }

    public final void S7() {
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "stopRandomMatchConnectingTimer");
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f329315l1;
        if (b4Var != null) {
            b4Var.d();
        }
        this.f329315l1 = null;
        ((kotlinx.coroutines.flow.h3) this.f329333y0).k(0L);
    }

    public final void T6(java.util.LinkedList linkedList) {
        java.lang.Object obj;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            if (kz5.z.F(this.K1, ((r45.ch1) obj2).getInteger(1))) {
                arrayList.add(obj2);
            }
        }
        linkedList2.addAll(arrayList);
        java.util.ArrayList<r45.ch1> arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = linkedList2.iterator();
        while (true) {
            java.lang.String str = null;
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            r45.xn1 xn1Var = (r45.xn1) ((r45.ch1) next).getCustom(13);
            if (xn1Var != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) != null) {
                str = finderContact.getUsername();
            }
            kotlin.jvm.internal.o.f(com.tencent.mm.sdk.platformtools.x2.f193071a, "getContext(...)");
            if (!com.tencent.mm.sdk.platformtools.t8.D0(str, xy2.c.e(r4))) {
                arrayList2.add(next);
            }
        }
        for (r45.ch1 ch1Var : arrayList2) {
            r45.jj1 jj1Var = new r45.jj1();
            com.tencent.mm.protobuf.g byteString = ch1Var.getByteString(4);
            byte[] g17 = byteString != null ? byteString.g() : null;
            if (g17 != null) {
                try {
                    jj1Var.parseFrom(g17);
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "[LinkMicNewAnchorPk]  anchor receive close pk msg, [sdkUserId:" + jj1Var.getString(0) + " msgSessionId: " + ch1Var.getString(7) + " infoSessionId: " + jj1Var.getString(3) + " scene: " + jj1Var.getInteger(1) + " apply_id: " + jj1Var.getString(2) + " newLinkMicUserList: " + this.f329322q);
            java.util.List list = this.f329324s;
            kotlin.jvm.internal.o.d(list);
            synchronized (list) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (it6.hasNext()) {
                        obj = it6.next();
                        if (kotlin.jvm.internal.o.b(((km2.q) obj).f309170a, jj1Var.getString(0))) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
            }
            if (((km2.q) obj) != null) {
                java.util.List list2 = this.f329324s;
                kotlin.jvm.internal.o.d(list2);
                pm0.v.G(list2, new mm2.o3(jj1Var));
                X6();
                com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "[LinkMicNewAnchorPk]  anchor receive close pk msg, [sdkUserId:" + jj1Var.getString(0) + " anchorSize: " + this.f329324s.size());
            }
            java.util.List list3 = this.f329325t;
            kotlin.jvm.internal.o.d(list3);
            kz5.h0.B(list3, new mm2.p3(jj1Var));
            java.util.Map map = this.f329326u;
            kotlin.jvm.internal.o.d(map);
            java.lang.String string = jj1Var.getString(0);
            synchronized (map) {
                map.remove(string);
            }
            java.util.List list4 = this.f329335z;
            kotlin.jvm.internal.o.d(list4);
            kz5.h0.B(list4, new mm2.q3(jj1Var));
            java.util.List list5 = this.f329318o;
            kotlin.jvm.internal.o.d(list5);
            kz5.h0.B(list5, new mm2.r3(jj1Var));
            java.util.List list6 = this.f329322q;
            kotlin.jvm.internal.o.d(list6);
            kz5.h0.B(list6, new mm2.s3(jj1Var));
        }
        no0.g gVar = no0.k.f338729a;
        if (gVar != null) {
            gVar.onCloseLiveMicNotify();
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[LinkMicNewAnchorPk]  checkLinkClosePkMsg:");
        sb6.append(arrayList2.size());
        sb6.append(" isAnchor:");
        ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
        sb6.append(dk2.ef.f233384g);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb6.toString());
    }

    public final java.util.List T7(java.util.List list) {
        if (list == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            r45.uz1 uz1Var = (r45.uz1) it.next();
            r45.oh1 oh1Var = new r45.oh1();
            oh1Var.set(0, (r45.xn1) uz1Var.getCustom(0));
            oh1Var.set(1, java.lang.Integer.valueOf(uz1Var.getInteger(1)));
            oh1Var.set(2, uz1Var.getString(2));
            oh1Var.set(3, uz1Var.getString(3));
            oh1Var.set(4, java.lang.Long.valueOf(uz1Var.getLong(4)));
            arrayList.add(oh1Var);
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void U6(java.util.LinkedList r6) {
        /*
            r5 = this;
            java.lang.Class<c61.ac> r0 = c61.ac.class
            i95.m r0 = i95.n0.c(r0)
            c61.ac r0 = (c61.ac) r0
            b92.g1 r0 = (b92.g1) r0
            r0.getClass()
            boolean r0 = dk2.ef.f233384g
            if (r0 == 0) goto Le8
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r6 = r6.iterator()
        L1f:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r6.next()
            r3 = r2
            r45.ch1 r3 = (r45.ch1) r3
            r4 = 1
            int r3 = r3.getInteger(r4)
            int[] r4 = r5.P1
            boolean r3 = kz5.z.F(r4, r3)
            if (r3 == 0) goto L1f
            r1.add(r2)
            goto L1f
        L3d:
            r0.addAll(r1)
            java.lang.Object r6 = r0.peekFirst()
            r45.ch1 r6 = (r45.ch1) r6
            if (r6 == 0) goto Le8
            r45.kj1 r0 = new r45.kj1
            r0.<init>()
            r1 = 4
            com.tencent.mm.protobuf.g r1 = r6.getByteString(r1)
            r2 = 0
            if (r1 == 0) goto L5a
            byte[] r1 = r1.g()
            goto L5b
        L5a:
            r1 = r2
        L5b:
            if (r1 != 0) goto L5f
        L5d:
            r0 = r2
            goto L70
        L5f:
            r0.parseFrom(r1)     // Catch: java.lang.Exception -> L63
            goto L70
        L63:
            r0 = move-exception
            java.lang.String r1 = ""
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r3 = "safeParser"
            com.tencent.mm.sdk.platformtools.Log.a(r3, r1, r0)
            goto L5d
        L70:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "[random mic] receive randomMicApplyMsg. sessionId:"
            r1.<init>(r3)
            r3 = 7
            java.lang.String r6 = r6.getString(r3)
            r1.append(r6)
            java.lang.String r6 = ", to_contact.username:"
            r1.append(r6)
            r6 = 0
            if (r0 == 0) goto L9c
            com.tencent.mm.protobuf.f r3 = r0.getCustom(r6)
            r45.xn1 r3 = (r45.xn1) r3
            if (r3 == 0) goto L9c
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r6)
            com.tencent.mm.protocal.protobuf.FinderContact r3 = (com.tencent.mm.protocal.protobuf.FinderContact) r3
            if (r3 == 0) goto L9c
            java.lang.String r3 = r3.getUsername()
            goto L9d
        L9c:
            r3 = r2
        L9d:
            r1.append(r3)
            java.lang.String r3 = ", to_contact.nickname:"
            r1.append(r3)
            if (r0 == 0) goto Lbb
            com.tencent.mm.protobuf.f r3 = r0.getCustom(r6)
            r45.xn1 r3 = (r45.xn1) r3
            if (r3 == 0) goto Lbb
            com.tencent.mm.protobuf.f r3 = r3.getCustom(r6)
            com.tencent.mm.protocal.protobuf.FinderContact r3 = (com.tencent.mm.protocal.protobuf.FinderContact) r3
            if (r3 == 0) goto Lbb
            java.lang.String r2 = r3.getNickname()
        Lbb:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MMFinder.LiveLinkMicSlice"
            com.tencent.mars.xlog.Log.i(r2, r1)
            if (r0 == 0) goto Le8
            com.tencent.mm.protobuf.f r6 = r0.getCustom(r6)
            r45.xn1 r6 = (r45.xn1) r6
            if (r6 != 0) goto Ld7
            java.lang.String r6 = "[random mic] info.to_contact is null"
            com.tencent.mars.xlog.Log.w(r2, r6)
            return
        Ld7:
            boolean r6 = r5.D
            if (r6 != 0) goto Le1
            java.lang.String r6 = "[random mic] isWaitingRandomMatch is false"
            com.tencent.mars.xlog.Log.w(r2, r6)
            return
        Le1:
            no0.g r6 = no0.k.f338729a
            if (r6 == 0) goto Le8
            r6.onRandomMicApply(r0)
        Le8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.o4.U6(java.util.LinkedList):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void V6(java.util.List r55, java.lang.String r56, int r57) {
        /*
            Method dump skipped, instructions count: 453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.o4.V6(java.util.List, java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x039f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W6(java.util.LinkedList r62) {
        /*
            Method dump skipped, instructions count: 1945
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mm2.o4.W6(java.util.LinkedList):void");
    }

    public final void X6() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clearOtherRoomAudienceMicUser: before remove,temp: ");
        java.util.Map map = this.f329328w;
        sb6.append(map.size());
        sb6.append(" size:");
        java.util.List list = this.f329327v;
        sb6.append(list.size());
        sb6.append(", audienceLinkMicUserList:");
        sb6.append(list);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", sb6.toString());
        kotlin.jvm.internal.o.d(list);
        pm0.v.G(list, mm2.v3.f329474d);
        kotlin.jvm.internal.o.d(map);
        pm0.v.H(map, mm2.w3.f329512d);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "clearOtherRoomAudienceMicUser: after remove, temp: " + map.size() + ", size:" + list.size() + ", audienceLinkMicUserList:" + list);
    }

    public final void Y6(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.D0(((mm2.c1) business(mm2.c1.class)).m8(), str)) {
            com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "receive close mic msg 333");
            ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
            dk2.ef efVar = dk2.ef.f233372a;
            efVar.W();
            ((b92.g1) ((c61.ac) i95.n0.c(c61.ac.class))).getClass();
            efVar.n0();
            this.S = null;
        }
    }

    public final java.util.List Z6() {
        java.util.List list = this.f329332y;
        list.clear();
        java.util.List list2 = this.f329324s;
        kotlin.jvm.internal.o.d(list2);
        list.addAll(list2);
        java.util.List list3 = this.f329327v;
        kotlin.jvm.internal.o.d(list3);
        list.addAll(list3);
        return list;
    }

    public final km2.q a7() {
        java.lang.String str = ((mm2.e1) business(mm2.e1.class)).f328987q.f380301n;
        if (str == null) {
            str = "";
        }
        km2.q qVar = this.f329314i;
        qVar.f309170a = str;
        ya2.g gVar = ya2.h.f460484a;
        ya2.b2 b17 = gVar.b(((mm2.c1) business(mm2.c1.class)).f328852o);
        qVar.f309171b = b17 != null ? b17.y0() : null;
        qVar.f309172c = ((mm2.c1) business(mm2.c1.class)).f328852o;
        ya2.b2 b18 = gVar.b(((mm2.c1) business(mm2.c1.class)).f328852o);
        qVar.f309173d = b18 != null ? b18.w0() : null;
        qVar.f309178i = ((mm2.c1) business(mm2.c1.class)).l8();
        r45.xn1 xn1Var = qVar.f309187r;
        if (xn1Var != null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = ((mm2.c1) business(mm2.c1.class)).f328846n;
            xn1Var.set(0, finderObject != null ? finderObject.getContact() : null);
            xn1Var.set(7, 3);
        }
        return qVar;
    }

    public final java.util.List b7() {
        return this.f329324s;
    }

    public final java.util.List c7() {
        return this.f329325t;
    }

    public final java.util.Set d7() {
        return this.P;
    }

    public final java.util.Map e7() {
        return this.f329329x;
    }

    public final int f7() {
        return this.C;
    }

    public final java.util.List g7() {
        return this.f329327v;
    }

    public final java.util.Map h7() {
        return this.f329328w;
    }

    public final dk2.u4 i7() {
        return this.Z;
    }

    public final boolean k7() {
        return this.F == 1;
    }

    public final km2.q l7() {
        java.lang.Object Z;
        java.util.List list = this.f329324s;
        kotlin.jvm.internal.o.d(list);
        synchronized (list) {
            Z = kz5.n0.Z(list);
        }
        return (km2.q) Z;
    }

    public final java.util.List m7() {
        return this.f329335z;
    }

    public final java.util.List n7() {
        return this.f329318o;
    }

    public final int o7() {
        java.util.ArrayList arrayList;
        java.util.List list = this.f329318o;
        kotlin.jvm.internal.o.d(list);
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                km2.q qVar = (km2.q) obj;
                if (qVar.m() && !this.f329324s.contains(qVar) && qVar.f309177h) {
                    arrayList.add(obj);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "linkingAndWaitingAnchorSize: linkSize:" + this.f329324s.size() + ", waitSize:" + arrayList.size());
        return this.f329324s.size() + arrayList.size();
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        this.G = false;
        this.f329318o.clear();
        this.f329322q.clear();
        zn0.x.f474414a.i(null);
        Q7(0);
        R7(false);
        this.F = -1;
        this.I = false;
        this.f329310J = true;
        P7("");
        this.f329316m = 0L;
        this.K.clear();
        this.T.clear();
        this.U = new r45.il4();
        this.W = null;
        this.X = false;
        this.Y = false;
        this.Z = null;
        this.V = 0L;
        this.f329324s.clear();
        this.f329325t.clear();
        this.f329328w.clear();
        this.f329329x.clear();
        this.f329326u.clear();
        this.f329320p0 = 0;
        this.f329330x0 = false;
        this.f329335z.clear();
        this.f329327v.clear();
        S7();
        dk2.qf qfVar = this.A1;
        qfVar.f233970d = null;
        qfVar.f233971e = null;
        qfVar.f233972f = null;
        qfVar.f233973g = 0;
        qfVar.f233974h = false;
        qfVar.f233975i = 0;
        qfVar.f233976m = 0;
        qfVar.f233977n = 0;
        qfVar.f233978o = 0;
        qfVar.f233979p = 0L;
        qfVar.f233980q = 0L;
        qfVar.f233981r = 0L;
        qfVar.f233982s = 0L;
        qfVar.f233983t = false;
        qfVar.f233984u = false;
        qfVar.f233985v = 0L;
        qfVar.f233986w = dk2.na.f233806e;
        qfVar.f233987x = false;
        qfVar.f233988y = false;
        qfVar.f233989z = 0L;
        qfVar.A = null;
        qfVar.B = -1;
        qfVar.C = null;
        qfVar.D = null;
        qfVar.E = null;
        qfVar.F = false;
        qfVar.G.clear();
        this.B1 = false;
        this.C1 = 0;
    }

    public final int p7() {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.List list = this.f329327v;
        kotlin.jvm.internal.o.d(list);
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (true ^ kotlin.jvm.internal.o.b(((km2.q) obj).f309189t, java.lang.Boolean.TRUE)) {
                    arrayList.add(obj);
                }
            }
        }
        java.util.List list2 = this.f329335z;
        kotlin.jvm.internal.o.d(list2);
        synchronized (list2) {
            arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj2 : list2) {
                km2.q qVar = (km2.q) obj2;
                if (qVar.m() && !arrayList.contains(qVar)) {
                    arrayList2.add(obj2);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "linkingAndWaitingAudienceSize: linkSize:" + arrayList.size() + ", waitSize:" + arrayList2.size());
        return arrayList.size() + arrayList2.size();
    }

    public final int q7() {
        java.util.ArrayList arrayList;
        java.util.List list = this.f329327v;
        java.util.List list2 = this.f329335z;
        kotlin.jvm.internal.o.d(list2);
        synchronized (list2) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list2) {
                km2.q qVar = (km2.q) obj;
                if (qVar.m() && !list.contains(qVar)) {
                    arrayList.add(obj);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "linkingAndWaitingTotalAudienceSize: linkSize:" + list.size() + ", waitSize:" + arrayList.size());
        return list.size() + arrayList.size();
    }

    public final int r7() {
        boolean z17 = pm0.v.z(((mm2.c1) business(mm2.c1.class)).Q1, 268435456);
        com.tencent.mars.xlog.Log.i("MMFinder.LiveLinkMicSlice", "[isEnableMulitMicWithEightAudience] isEnable = " + z17);
        return z17 ? 8 : 3;
    }

    public final r45.il4 s7() {
        return this.U;
    }

    public final int t7() {
        java.util.ArrayList arrayList;
        java.util.List list = this.f329322q;
        kotlin.jvm.internal.o.d(list);
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (!((km2.q) obj).f309177h) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.size();
    }

    public final int u7() {
        java.util.ArrayList arrayList;
        java.util.List list = this.f329322q;
        kotlin.jvm.internal.o.d(list);
        synchronized (list) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : list) {
                if (((km2.q) obj).f309177h) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList.size();
    }

    public final java.util.List v7() {
        return this.T;
    }

    public final int w7() {
        return this.f329320p0;
    }

    public final java.util.List x7() {
        return this.f329319p;
    }

    public final boolean y7() {
        return this.X;
    }

    public final boolean z7() {
        java.lang.Object obj;
        java.util.List list = this.f329327v;
        kotlin.jvm.internal.o.d(list);
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.String str = ((km2.q) obj).f309170a;
                java.lang.String m86 = ((mm2.c1) business(mm2.c1.class)).m8();
                if (m86 == null) {
                    m86 = "";
                }
                if (com.tencent.mm.sdk.platformtools.t8.D0(str, m86)) {
                    break;
                }
            }
        }
        return ((km2.q) obj) != null;
    }
}
