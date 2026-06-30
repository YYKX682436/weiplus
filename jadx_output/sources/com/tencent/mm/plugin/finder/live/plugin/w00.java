package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class w00 extends com.tencent.mm.plugin.finder.live.plugin.l {
    public final int A;
    public final int B;
    public final int C;
    public final int D;
    public final com.tencent.mm.plugin.finder.live.widget.hp E;
    public com.tencent.mm.plugin.finder.live.widget.lo F;
    public com.tencent.mm.ui.widget.dialog.k0 G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f114841J;
    public boolean K;
    public boolean L;
    public boolean M;
    public boolean N;
    public int P;
    public r45.xn1 Q;
    public boolean R;
    public final dk2.v4 S;

    /* renamed from: p, reason: collision with root package name */
    public final qo0.c f114842p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f114843q;

    /* renamed from: r, reason: collision with root package name */
    public final int f114844r;

    /* renamed from: s, reason: collision with root package name */
    public final int f114845s;

    /* renamed from: t, reason: collision with root package name */
    public final int f114846t;

    /* renamed from: u, reason: collision with root package name */
    public final int f114847u;

    /* renamed from: v, reason: collision with root package name */
    public final int f114848v;

    /* renamed from: w, reason: collision with root package name */
    public final int f114849w;

    /* renamed from: x, reason: collision with root package name */
    public final int f114850x;

    /* renamed from: y, reason: collision with root package name */
    public final int f114851y;

    /* renamed from: z, reason: collision with root package name */
    public final int f114852z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w00(android.view.ViewGroup root, qo0.c statusMonitor, r45.qt2 qt2Var) {
        super(root, statusMonitor, qt2Var);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(statusMonitor, "statusMonitor");
        this.f114842p = statusMonitor;
        this.f114843q = "FinderLiveNewMemberProfilePlugin";
        this.f114844r = 1;
        this.f114845s = 10;
        this.f114846t = 11;
        this.f114847u = 12;
        this.f114848v = 13;
        this.f114849w = 14;
        this.f114850x = 15;
        this.f114851y = 16;
        this.f114852z = 17;
        this.A = 18;
        this.B = 19;
        this.C = 20;
        this.D = 21;
        android.content.Context context = root.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = new com.tencent.mm.plugin.finder.live.widget.hp(context, this, null, 4, null);
        this.E = hpVar;
        this.I = "";
        android.content.Context context2 = root.getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        this.S = new dk2.v4(context2, S0());
        hpVar.K = new com.tencent.mm.plugin.finder.live.plugin.a00(this);
        hpVar.f118579J = com.tencent.mm.plugin.finder.live.plugin.b00.f111958d;
        hpVar.L = new com.tencent.mm.plugin.finder.live.plugin.c00(this);
        hpVar.M = new com.tencent.mm.plugin.finder.live.plugin.e00(this);
        hpVar.N = new com.tencent.mm.plugin.finder.live.plugin.f00(this);
    }

    public static void y1(com.tencent.mm.plugin.finder.live.plugin.w00 w00Var, int i17, java.lang.String str, java.lang.String str2, long j17, yz5.l lVar, int i18, java.lang.Object obj) {
        java.lang.String str3 = (i18 & 2) != 0 ? null : str;
        java.lang.String str4 = (i18 & 4) != 0 ? null : str2;
        long j18 = (i18 & 8) != 0 ? 0L : j17;
        java.lang.String str5 = w00Var.H;
        if (str5 == null || str5.length() == 0) {
            lVar.invoke(null);
            return;
        }
        dk2.xf W0 = w00Var.W0();
        if (W0 != null) {
            java.lang.String str6 = w00Var.H;
            r45.xn1 xn1Var = w00Var.Q;
            com.tencent.mm.protobuf.g byteString = xn1Var != null ? xn1Var.getByteString(9) : null;
            r45.yn1 yn1Var = new r45.yn1();
            yn1Var.set(0, str3);
            yn1Var.set(1, str4);
            yn1Var.set(2, java.lang.Long.valueOf(j18));
            ((dk2.r4) W0).z(str6, i17, byteString, true, 1000L, yn1Var, new com.tencent.mm.plugin.finder.live.plugin.v00(w00Var, lVar));
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l
    public void B(android.os.Bundle bundle, java.lang.Object obj, long j17) {
        java.lang.String string = bundle != null ? bundle.getString("ACTION_POST_PORTRAIT", "") : null;
        if (kotlin.jvm.internal.o.b(string != null ? string : "", "PORTRAIT_ACTION_GOTO_PROFILE_NEW_MEMBER_PROFILE")) {
            com.tencent.mm.plugin.finder.live.plugin.n00 n00Var = new com.tencent.mm.plugin.finder.live.plugin.n00(this, bundle, obj, j17);
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            com.tencent.mm.sdk.platformtools.u3.i(n00Var, j17);
        }
    }

    @Override // qo0.a
    public boolean B0() {
        if (w0() != 0) {
            return false;
        }
        this.E.l0();
        return true;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean G() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v102 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v133 */
    /* JADX WARN: Type inference failed for: r14v134 */
    /* JADX WARN: Type inference failed for: r14v142 */
    /* JADX WARN: Type inference failed for: r14v144 */
    /* JADX WARN: Type inference failed for: r14v145 */
    /* JADX WARN: Type inference failed for: r14v154 */
    /* JADX WARN: Type inference failed for: r14v168 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v26 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v6 */
    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void M0(qo0.b status, android.os.Bundle bundle) {
        java.lang.String str;
        java.lang.Object obj;
        int i17;
        int i18;
        byte[] byteArray;
        java.lang.Object obj2;
        byte[] byteArray2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        byte[] byteArray3;
        byte[] byteArray4;
        java.util.List list;
        java.lang.Object obj3;
        km2.q qVar;
        java.util.List Z6;
        java.lang.Object obj4;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        r45.xn1 xn1Var = null;
        r45.xn1 xn1Var2 = null;
        r2 = null;
        jz5.f0 f0Var = null;
        r45.xn1 xn1Var3 = null;
        r2 = null;
        jz5.f0 f0Var2 = null;
        r2 = null;
        java.lang.String str2 = null;
        r2 = null;
        jz5.f0 f0Var3 = null;
        r2 = null;
        jz5.f0 f0Var4 = null;
        if (ordinal != 48) {
            if (ordinal != 123) {
                return;
            }
            com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.E;
            if (hpVar.P() && hpVar.m0() && hpVar.X1) {
                com.tencent.mm.plugin.finder.live.plugin.l lVar = hpVar.H;
                if (lVar == null || (Z6 = ((mm2.o4) lVar.P0(mm2.o4.class)).Z6()) == null) {
                    qVar = null;
                } else {
                    synchronized (Z6) {
                        java.util.Iterator it = Z6.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj4 = null;
                                break;
                            }
                            obj4 = it.next();
                            java.lang.String str3 = ((km2.q) obj4).f309172c;
                            r45.xn1 xn1Var4 = hpVar.P;
                            if (kotlin.jvm.internal.o.b(str3, (xn1Var4 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null) ? null : finderContact2.getUsername())) {
                                break;
                            }
                        }
                    }
                    qVar = (km2.q) obj4;
                }
                if ((qVar != null) == true) {
                    return;
                }
                com.tencent.mm.plugin.finder.live.widget.e0.t(hpVar, false, 1, null);
                android.widget.ProgressBar progressBar = hpVar.R1;
                if (progressBar != null) {
                    progressBar.setVisibility(8);
                }
                android.widget.TextView textView = hpVar.S1;
                if (textView == null) {
                    return;
                }
                textView.setVisibility(0);
                return;
            }
            return;
        }
        this.M = bundle != null ? bundle.getBoolean("PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE") : false;
        this.P = bundle != null ? bundle.getInt("PARAM_MEMBERS_PROFILE_SOURCE_TYPE") : 0;
        this.H = bundle != null ? bundle.getString("PARAM_MEMBERS_PROFILE_USERNAME") : null;
        java.lang.String string = bundle != null ? bundle.getString("PARAM_MEMBERS_PROFILE_USER_MIC_ID") : null;
        if (string == null) {
            string = "";
        }
        this.I = string;
        if ((string.length() == 0) != false && (list = ((mm2.o4) P0(mm2.o4.class)).f329327v) != null) {
            synchronized (list) {
                java.util.Iterator it6 = list.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        obj3 = null;
                        break;
                    } else {
                        obj3 = it6.next();
                        if (kotlin.jvm.internal.o.b(((km2.q) obj3).f309172c, this.H)) {
                            break;
                        }
                    }
                }
            }
            km2.q qVar2 = (km2.q) obj3;
            if (qVar2 != null) {
                java.lang.String str4 = qVar2.f309170a;
                if (str4 == null) {
                    str4 = "";
                }
                this.I = str4;
            }
        }
        this.R = bundle != null ? bundle.getBoolean("PARAM_MEMBERS_PROFILE_REPLAY_GIFT") : false;
        this.f114841J = bundle != null ? bundle.getBoolean("PARAM_MEMBERS_PROFILE_IS_OTHER_ROOM_USER", false) : false;
        this.E.U = bundle != null ? bundle.getInt("PARAM_MEMBERS_PROFILE_SORT_TYPE", 0) : 0;
        switch (this.P) {
            case 1:
                if (!zl2.r4.f473950a.w1() && !((mm2.c1) P0(mm2.c1.class)).T) {
                    if ((((mm2.n0) P0(mm2.n0.class)).f329273r) == false) {
                        com.tencent.mars.xlog.Log.i(this.f114843q, "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:" + this.P + ", not anchor!");
                        return;
                    }
                }
                java.lang.String str5 = this.H;
                if ((str5 == null || str5.length() == 0) != true) {
                    java.util.Iterator it7 = ((mm2.f5) P0(mm2.f5.class)).f329024f.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            ?? next = it7.next();
                            com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) ((r45.xn1) next).getCustom(0);
                            if (kotlin.jvm.internal.o.b(finderContact3 != null ? finderContact3.getUsername() : null, this.H)) {
                                xn1Var = next;
                            }
                        }
                    }
                    r45.xn1 xn1Var5 = xn1Var;
                    this.Q = xn1Var5;
                    this.K = pm0.v.z(xn1Var5 != null ? xn1Var5.getInteger(2) : 0, 1);
                    r45.xn1 xn1Var6 = this.Q;
                    this.L = pm0.v.z(xn1Var6 != null ? xn1Var6.getInteger(2) : 0, 2);
                    y1(this, 6, null, null, 0L, new com.tencent.mm.plugin.finder.live.plugin.s00(this), 14, null);
                    break;
                } else {
                    com.tencent.mars.xlog.Log.i(this.f114843q, "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:" + this.P + ", username:" + this.H + " is empty!");
                    return;
                }
                break;
            case 2:
                java.lang.String str6 = this.H;
                if ((str6 == null || str6.length() == 0) != true) {
                    if (bundle == null || (str = bundle.getString("PARAM_MEMBERS_PROFILE_MESSAGE_ID")) == null) {
                        str = "";
                    }
                    java.lang.String str7 = str;
                    long j17 = bundle != null ? bundle.getLong("PARAM_MEMBERS_PROFILE_MESSAGE_SEQ") : 0L;
                    java.util.List list2 = ((mm2.x4) P0(mm2.x4.class)).f329528f;
                    kotlin.jvm.internal.o.f(list2, "<get-msgList>(...)");
                    synchronized (list2) {
                        java.util.Iterator it8 = list2.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                obj = it8.next();
                                dk2.zf zfVar = (dk2.zf) obj;
                                if ((str7.length() > 0) != false ? kotlin.jvm.internal.o.b(zfVar.v(), str7) : kotlin.jvm.internal.o.b(zfVar.a(), this.H)) {
                                }
                            } else {
                                obj = null;
                            }
                        }
                    }
                    dk2.zf zfVar2 = (dk2.zf) obj;
                    this.Q = zfVar2 != null ? zfVar2.r() : null;
                    java.lang.Boolean bool = (java.lang.Boolean) ((mm2.c1) P0(mm2.c1.class)).f328780b2.get(this.H);
                    if (bool == null) {
                        com.tencent.mars.xlog.Log.i(this.f114843q, "LIVE_STATUS_OPEN_MEMBER_PROFILE SOURCE_TYPE_COMMENT disableCommentCacheMap:" + this.H + " is empty!");
                        r45.xn1 xn1Var7 = this.Q;
                        bool = java.lang.Boolean.valueOf(pm0.v.z(xn1Var7 != null ? xn1Var7.getInteger(2) : 0, 1));
                    } else {
                        r45.xn1 xn1Var8 = this.Q;
                        if (xn1Var8 != null) {
                            if (bool.booleanValue()) {
                                r45.xn1 xn1Var9 = this.Q;
                                int integer = xn1Var9 != null ? xn1Var9.getInteger(2) : 0;
                                java.util.regex.Pattern pattern = pm0.v.f356802a;
                                i17 = integer | 1;
                            } else {
                                r45.xn1 xn1Var10 = this.Q;
                                int integer2 = xn1Var10 != null ? xn1Var10.getInteger(2) : 0;
                                java.util.regex.Pattern pattern2 = pm0.v.f356802a;
                                i17 = integer2 & (-2);
                            }
                            xn1Var8.set(2, java.lang.Integer.valueOf(i17));
                        }
                    }
                    this.K = bool.booleanValue();
                    java.lang.Boolean bool2 = (java.lang.Boolean) ((mm2.c1) P0(mm2.c1.class)).f328785c2.get(this.H);
                    if (bool2 == null) {
                        r45.xn1 xn1Var11 = this.Q;
                        bool2 = java.lang.Boolean.valueOf(pm0.v.z(xn1Var11 != null ? xn1Var11.getInteger(2) : 0, 2));
                    } else {
                        r45.xn1 xn1Var12 = this.Q;
                        if (xn1Var12 != null) {
                            if (bool2.booleanValue()) {
                                r45.xn1 xn1Var13 = this.Q;
                                int integer3 = xn1Var13 != null ? xn1Var13.getInteger(2) : 0;
                                java.util.regex.Pattern pattern3 = pm0.v.f356802a;
                                i18 = integer3 | 2;
                            } else {
                                r45.xn1 xn1Var14 = this.Q;
                                int integer4 = xn1Var14 != null ? xn1Var14.getInteger(2) : 0;
                                java.util.regex.Pattern pattern4 = pm0.v.f356802a;
                                i18 = integer4 & (-3);
                            }
                            xn1Var12.set(2, java.lang.Integer.valueOf(i18));
                        }
                    }
                    this.L = bool2.booleanValue();
                    y1(this, 5, null, str7, j17, new com.tencent.mm.plugin.finder.live.plugin.q00(this), 2, null);
                    break;
                } else {
                    com.tencent.mars.xlog.Log.i(this.f114843q, "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:" + this.P + ", username:" + this.H + " is empty!");
                    return;
                }
                break;
            case 3:
            case 8:
            case 9:
                if (bundle != null && (byteArray = bundle.getByteArray("PARAM_MEMBERS_PROFILE_CONTACT")) != null) {
                    r45.xn1 xn1Var15 = new r45.xn1();
                    try {
                        xn1Var15.parseFrom(byteArray);
                    } catch (java.lang.Exception e17) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                        xn1Var15 = null;
                    }
                    this.Q = xn1Var15;
                    java.util.List Z62 = ((mm2.o4) P0(mm2.o4.class)).Z6();
                    kotlin.jvm.internal.o.f(Z62, "<get-allLinkMicUserList>(...)");
                    synchronized (Z62) {
                        java.util.Iterator it9 = Z62.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                obj2 = it9.next();
                                if (kotlin.jvm.internal.o.b(((km2.q) obj2).f309170a, this.I)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                    }
                    km2.q qVar3 = (km2.q) obj2;
                    y1(this, 4, qVar3 != null ? qVar3.f309175f : null, null, 0L, new com.tencent.mm.plugin.finder.live.plugin.t00(this), 12, null);
                    f0Var4 = jz5.f0.f302826a;
                }
                if (f0Var4 == null) {
                    com.tencent.mars.xlog.Log.i(this.f114843q, "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:" + this.P + ", contact is empty!");
                    return;
                }
                break;
            case 4:
                if (bundle != null && (byteArray2 = bundle.getByteArray("PARAM_MEMBERS_PROFILE_CONTACT")) != null) {
                    r45.xn1 xn1Var16 = new r45.xn1();
                    try {
                        xn1Var16.parseFrom(byteArray2);
                    } catch (java.lang.Exception e18) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e18);
                        xn1Var16 = null;
                    }
                    this.Q = xn1Var16;
                    if (!zl2.r4.f473950a.w1() && ((mm2.c1) P0(mm2.c1.class)).R6()) {
                        java.lang.String str8 = ((mm2.c1) P0(mm2.c1.class)).f328852o;
                        r45.xn1 xn1Var17 = this.Q;
                        if (xn1Var17 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var17.getCustom(0)) != null) {
                            str2 = finderContact.getUsername();
                        }
                        if (!kotlin.jvm.internal.o.b(str8, str2)) {
                            com.tencent.mars.xlog.Log.i(this.f114843q, "ur visitor and anonymous mode now. don't check others.");
                            db5.t7.g(this.f365323d.getContext(), this.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.d5x));
                            return;
                        }
                    }
                    x1(this.Q, this.f114841J);
                    f0Var3 = jz5.f0.f302826a;
                }
                if (f0Var3 == null) {
                    com.tencent.mars.xlog.Log.i(this.f114843q, "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:" + this.P + ", contact is empty!");
                    return;
                }
                break;
            case 6:
                y1(this, 0, null, null, 0L, new com.tencent.mm.plugin.finder.live.plugin.p00(this), 14, null);
                break;
            case 7:
                java.lang.String str9 = this.H;
                if ((str9 == null || str9.length() == 0) == true) {
                    com.tencent.mars.xlog.Log.i(this.f114843q, "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:" + this.P + ", username:" + this.H + " is empty!");
                    return;
                }
                if (bundle != null && (byteArray3 = bundle.getByteArray("PARAM_MEMBERS_PROFILE_CONTACT")) != null) {
                    r45.xn1 xn1Var18 = new r45.xn1();
                    try {
                        xn1Var18.parseFrom(byteArray3);
                        xn1Var3 = xn1Var18;
                    } catch (java.lang.Exception e19) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e19);
                    }
                    this.Q = xn1Var3;
                    y1(this, 6, null, null, 0L, new com.tencent.mm.plugin.finder.live.plugin.r00(this), 14, null);
                    f0Var2 = jz5.f0.f302826a;
                }
                if (f0Var2 == null) {
                    com.tencent.mars.xlog.Log.i(this.f114843q, "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:" + this.P + ", contact is empty!");
                    return;
                }
                break;
            case 10:
            case 11:
                java.lang.String str10 = this.H;
                if ((str10 == null || str10.length() == 0) == true) {
                    com.tencent.mars.xlog.Log.i(this.f114843q, "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:" + this.P + ", username:" + this.H + " is empty!");
                    return;
                }
                if (bundle != null && (byteArray4 = bundle.getByteArray("PARAM_MEMBERS_PROFILE_CONTACT")) != null) {
                    r45.xn1 xn1Var19 = new r45.xn1();
                    try {
                        xn1Var19.parseFrom(byteArray4);
                        xn1Var2 = xn1Var19;
                    } catch (java.lang.Exception e27) {
                        com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e27);
                    }
                    this.Q = xn1Var2;
                    x1(xn1Var2, this.f114841J);
                    f0Var = jz5.f0.f302826a;
                }
                if (f0Var == null) {
                    com.tencent.mars.xlog.Log.i(this.f114843q, "LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:" + this.P + ", contact is empty!");
                    return;
                }
                break;
        }
        java.lang.String str11 = this.f114843q;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LIVE_STATUS_OPEN_MEMBER_PROFILE sourceType:");
        sb6.append(this.P);
        sb6.append(",disableComment:");
        sb6.append(this.K);
        sb6.append(",liveCustomerContact is empty:");
        sb6.append(this.Q == null);
        sb6.append('!');
        com.tencent.mars.xlog.Log.i(str11, sb6.toString());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void O0() {
        super.O0();
        this.E.g0();
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean k() {
        return ((mm2.c1) P0(mm2.c1.class)).f328801f2 != 1;
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.po0
    public boolean r() {
        return false;
    }

    public final void t1(java.util.ArrayList arrayList, r45.xn1 xn1Var) {
        if (km2.o.a(xn1Var)) {
            return;
        }
        int i17 = this.f114852z;
        java.lang.String string = this.f365323d.getContext().getResources().getString(com.tencent.mm.R.string.f491696dy2);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        arrayList.add(new vm2.b0(i17, string, com.tencent.mm.R.raw.icons_outlined_chats, false, false, 24, null));
    }

    public final void u1() {
        if (this.M) {
            qo0.b bVar = qo0.b.f365339d2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_MEMBER_SKIP_LOADING", true);
            this.f114842p.statusChange(bVar, bundle);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0073 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void v1() {
        /*
            Method dump skipped, instructions count: 1389
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.w00.v1():void");
    }

    public final void w1() {
        java.lang.Object obj;
        boolean z17;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact;
        java.lang.String username;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact2;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact3;
        com.tencent.mm.protocal.protobuf.FinderContact finderContact4;
        java.util.List list = ((mm2.o4) P0(mm2.o4.class)).f329327v;
        kotlin.jvm.internal.o.f(list, "<get-audienceLinkMicUserList>(...)");
        synchronized (list) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.String str = ((km2.q) obj).f309172c;
                r45.xn1 xn1Var = this.Q;
                if (kotlin.jvm.internal.o.b(str, (xn1Var == null || (finderContact4 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0)) == null) ? null : finderContact4.getUsername())) {
                    break;
                }
            }
        }
        boolean z18 = obj != null;
        r45.xn1 xn1Var2 = this.Q;
        java.lang.Integer valueOf = xn1Var2 != null ? java.lang.Integer.valueOf(xn1Var2.getInteger(7)) : null;
        zl2.r4 r4Var = zl2.r4.f473950a;
        int g07 = r4Var.g0();
        com.tencent.mars.xlog.Log.i(this.f114843q, "setMoreActionState isMicAudienceContact: " + z18 + " roleType: " + valueOf + " selfRoleType: " + g07);
        if (this.P == 7 && !r4Var.w1() && z18 && (g07 == 3 || (valueOf != null && valueOf.intValue() == 3))) {
            tn0.w0 w0Var = dk2.ef.f233378d;
            if (w0Var != null && w0Var.X()) {
                v1();
                com.tencent.mm.plugin.finder.live.widget.lo loVar = this.F;
                if (loVar != null) {
                    loVar.a(0);
                    return;
                }
                return;
            }
        }
        boolean z19 = ((mm2.n0) P0(mm2.n0.class)).f329273r;
        if (!r4Var.w1() && ((!((mm2.c1) P0(mm2.c1.class)).T || !((mm2.c1) P0(mm2.c1.class)).c8()) && !z19)) {
            com.tencent.mm.plugin.finder.live.widget.lo loVar2 = this.F;
            if (loVar2 != null) {
                loVar2.a(4);
                return;
            }
            return;
        }
        com.tencent.mm.plugin.finder.live.widget.hp hpVar = this.E;
        java.lang.String str2 = hpVar.f118580a2;
        if (str2 == null) {
            str2 = xy2.c.e(hpVar.f118183e);
        }
        r45.xn1 xn1Var3 = this.Q;
        if (!kotlin.jvm.internal.o.b((xn1Var3 == null || (finderContact3 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var3.getCustom(0)) == null) ? null : finderContact3.getUsername(), str2)) {
            r45.xn1 xn1Var4 = this.Q;
            if (!kotlin.jvm.internal.o.b((xn1Var4 == null || (finderContact2 = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var4.getCustom(0)) == null) ? null : finderContact2.getUsername(), c01.z1.r())) {
                boolean z27 = ((mm2.c1) P0(mm2.c1.class)).T || ((mm2.c1) P0(mm2.c1.class)).c8();
                if (!r4Var.w1() && z27 && r4Var.C1(this.Q)) {
                    com.tencent.mm.plugin.finder.live.widget.lo loVar3 = this.F;
                    if (loVar3 != null) {
                        loVar3.a(4);
                        return;
                    }
                    return;
                }
                if (!r4Var.w1() && z19) {
                    r45.xn1 xn1Var5 = this.Q;
                    if (xn1Var5 != null && (finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var5.getCustom(0)) != null && (username = finderContact.getUsername()) != null) {
                        if (!(username.length() == 0)) {
                            r45.a84 a84Var = (r45.a84) ((kotlinx.coroutines.flow.l2) ((mm2.n0) P0(mm2.n0.class)).f329271p).getValue();
                            java.util.LinkedList<com.tencent.mm.protocal.protobuf.FinderContact> list2 = a84Var != null ? a84Var.getList(1) : null;
                            if (list2 != null && !list2.isEmpty()) {
                                for (com.tencent.mm.protocal.protobuf.FinderContact finderContact5 : list2) {
                                    if (kotlin.jvm.internal.o.b(finderContact5 != null ? finderContact5.getUsername() : null, username)) {
                                        z17 = true;
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    z17 = false;
                    if (z17) {
                        com.tencent.mm.plugin.finder.live.widget.lo loVar4 = this.F;
                        if (loVar4 != null) {
                            loVar4.a(4);
                            return;
                        }
                        return;
                    }
                }
                int i17 = this.P;
                if (i17 != 1 && i17 != 2 && i17 != 3 && i17 != 8 && i17 != 6 && i17 != 9 && i17 != 7 && i17 != 10 && i17 != 11) {
                    com.tencent.mm.plugin.finder.live.widget.lo loVar5 = this.F;
                    if (loVar5 != null) {
                        loVar5.a(4);
                        return;
                    }
                    return;
                }
                v1();
                com.tencent.mm.plugin.finder.live.widget.lo loVar6 = this.F;
                if (loVar6 != null) {
                    loVar6.a(0);
                    return;
                }
                return;
            }
        }
        com.tencent.mm.plugin.finder.live.widget.lo loVar7 = this.F;
        if (loVar7 != null) {
            loVar7.a(4);
        }
    }

    public final void x1(r45.xn1 xn1Var, boolean z17) {
        java.lang.String str;
        if (xn1Var == null) {
            com.tencent.mars.xlog.Log.i(this.f114843q, "show profile fail,contact is null!");
            return;
        }
        K0(0);
        this.E.x0(xn1Var, pm0.v.u(((mm2.e1) P0(mm2.e1.class)).f328983m), this.P, this.f113326h, z17, this.I);
        w1();
        if (this.f114842p.getLiveRole() != 1) {
            ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
            ml2.l2[] l2VarArr = ml2.l2.f327693d;
            int i17 = this.P;
            int integer = xn1Var.getInteger(7);
            java.lang.String str2 = this.H;
            r0Var.Pk(1, i17, integer, str2 != null ? str2 : "");
            return;
        }
        ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
        ml2.j0.f327583i.W = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        ml2.b3[] b3VarArr = ml2.b3.f327214d;
        java.lang.String valueOf = java.lang.String.valueOf(1);
        com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) xn1Var.getCustom(0);
        if (finderContact == null || (str = finderContact.getUsername()) == null) {
            str = "";
        }
        jSONObject.put(valueOf, str);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb.y6((zy2.zb) c17, ml2.z4.f328364n, jSONObject.toString(), null, 4, null);
        ml2.j0 j0Var = (ml2.j0) i95.n0.c(ml2.j0.class);
        ml2.h2[] h2VarArr = ml2.h2.f327521d;
        int i18 = this.P;
        int integer2 = xn1Var.getInteger(7);
        java.lang.String str3 = this.H;
        j0Var.Uj(1, i18, integer2, str3 != null ? str3 : "");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.l, qo0.a
    public void z0() {
        super.z0();
        this.E.f0();
    }
}
