package f31;

/* loaded from: classes9.dex */
public final class f extends o31.e implements o31.b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f259272a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f259273b;

    /* renamed from: c, reason: collision with root package name */
    public final int f259274c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f259275d;

    /* renamed from: e, reason: collision with root package name */
    public o31.d f259276e;

    /* renamed from: f, reason: collision with root package name */
    public f31.e f259277f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f259278g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f259279h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData f259280i;

    /* renamed from: j, reason: collision with root package name */
    public int f259281j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f259282k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f259283l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f259284m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f259285n;

    public f(java.lang.String username, java.lang.String appId, int i17) {
        kotlin.jvm.internal.o.g(username, "username");
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f259272a = username;
        this.f259273b = appId;
        this.f259274c = i17;
        this.f259275d = new java.util.ArrayList();
        this.f259279h = "";
        this.f259282k = "";
        this.f259283l = "";
        this.f259284m = new byte[0];
        this.f259285n = new java.util.ArrayList();
    }

    public final int a(o31.a dispatcher) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        int i17 = o31.d.f342671a;
        o31.c cVar = new o31.c(new r45.vh6(), new r45.wh6(), 2920, "/cgi-bin/mmbiz-bin/bizattr/subscribemsg");
        this.f259276e = cVar;
        r45.mr5 mr5Var = cVar.f342667b;
        kotlin.jvm.internal.o.e(mr5Var, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SubscribeMsgReq");
        r45.vh6 vh6Var = (r45.vh6) mr5Var;
        vh6Var.f388266q = this.f259281j;
        vh6Var.f388267r = this.f259282k;
        vh6Var.f388268s = this.f259283l;
        java.util.List list = this.f259275d;
        boolean z17 = this.f259278g;
        int i18 = this.f259274c;
        java.util.LinkedList linkedList = vh6Var.f388258f;
        switch (i18) {
            case 1:
            case 6:
                vh6Var.f388256d = this.f259272a;
                vh6Var.f388259g = this.f259273b;
                vh6Var.f388257e = i18;
                vh6Var.f388260h = 1;
                vh6Var.f388261i = z17 ? 1 : 0;
                linkedList.addAll(list);
                if (i18 == 6) {
                    vh6Var.f388263n = new com.tencent.mm.protobuf.g(this.f259284m);
                    r45.ta5 ta5Var = new r45.ta5();
                    vh6Var.f388264o = ta5Var;
                    com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData subscribeMsgRequestDialogUiData = this.f259280i;
                    if (subscribeMsgRequestDialogUiData != null) {
                        ta5Var.f386237e = subscribeMsgRequestDialogUiData.f71775e;
                        ta5Var.f386236d = subscribeMsgRequestDialogUiData.f71774d;
                        java.util.Iterator it = subscribeMsgRequestDialogUiData.f71776f.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.ItemUiData itemUiData = (com.tencent.mm.msgsubscription.SubscribeMsgRequestDialogUiData.ItemUiData) it.next();
                            java.util.LinkedList linkedList2 = vh6Var.f388264o.f386238f;
                            r45.yh6 yh6Var = new r45.yh6();
                            yh6Var.f391108d = itemUiData.f71777d;
                            yh6Var.f391109e = itemUiData.f71778e;
                            yh6Var.f391110f = itemUiData.f71779f ? 1 : 0;
                            yh6Var.f391111g = itemUiData.f71780g ? 1 : 0;
                            linkedList2.add(yh6Var);
                        }
                        break;
                    }
                }
                break;
            case 2:
            case 3:
            case 5:
                vh6Var.f388256d = this.f259272a;
                vh6Var.f388259g = this.f259273b;
                vh6Var.f388257e = i18;
                linkedList.addAll(list);
                if (this.f259279h.length() > 0) {
                    vh6Var.f388262m = this.f259279h;
                    break;
                }
                break;
            case 7:
                vh6Var.f388257e = i18;
                vh6Var.f388269t.addAll(this.f259285n);
                break;
            case 8:
                vh6Var.f388257e = i18;
                vh6Var.f388270u = z17 ? 1 : 0;
                break;
        }
        o31.d dVar = this.f259276e;
        kotlin.jvm.internal.o.d(dVar);
        return dispatcher.a(dVar, this, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(int i17, int i18, java.lang.String str, o31.e eVar) {
        java.lang.String str2;
        kz5.p0 p0Var;
        java.lang.String str3;
        com.tencent.mm.msgsubscription.ShowInfo showInfo;
        java.util.LinkedList<r45.dx4> linkedList;
        int i19;
        int i27;
        boolean z17;
        f31.f fVar = this;
        java.lang.String str4 = "";
        if (i17 != 0) {
            str2 = "";
            fVar = this;
        } else {
            if (i18 == 0) {
                o31.d dVar = fVar.f259276e;
                kotlin.jvm.internal.o.d(dVar);
                r45.js5 js5Var = ((o31.c) dVar).f342668c;
                kotlin.jvm.internal.o.e(js5Var, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SubscribeMsgResp");
                r45.wh6 wh6Var = (r45.wh6) js5Var;
                f31.e eVar2 = fVar.f259277f;
                if (eVar2 != null) {
                    java.lang.String str5 = str == null ? "" : str;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.LinkedList InfoList = wh6Var.f389169d;
                    kotlin.jvm.internal.o.f(InfoList, "InfoList");
                    java.util.Iterator it = InfoList.iterator();
                    while (it.hasNext()) {
                        r45.th6 th6Var = (r45.th6) it.next();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.LinkedList<r45.s44> KeyWordList = th6Var.f386446h;
                        kotlin.jvm.internal.o.f(KeyWordList, "KeyWordList");
                        for (r45.s44 s44Var : KeyWordList) {
                            arrayList2.add(new jz5.l(s44Var.f385500d, s44Var.f385501e));
                        }
                        java.lang.String str6 = th6Var.f386445g;
                        java.lang.String str7 = str6 == null ? str4 : str6;
                        java.lang.String str8 = th6Var.f386442d;
                        java.lang.String str9 = str8 == null ? str4 : str8;
                        int i28 = th6Var.f386443e;
                        int i29 = th6Var.f386444f;
                        java.lang.String str10 = str4;
                        int i37 = th6Var.f386447i;
                        java.util.Iterator it6 = it;
                        boolean z18 = th6Var.f386449n == 1;
                        java.lang.String str11 = th6Var.f386451p;
                        java.lang.String str12 = str11 == null ? str10 : str11;
                        java.lang.String str13 = th6Var.f386452q;
                        java.lang.String str14 = str13 == null ? str10 : str13;
                        boolean z19 = th6Var.f386450o == 1;
                        int i38 = th6Var.f386453r;
                        boolean z27 = th6Var.f386455t == 1;
                        boolean z28 = th6Var.f386454s == 1;
                        java.lang.String str15 = th6Var.f386456u;
                        java.lang.String str16 = str15 == null ? str10 : str15;
                        boolean z29 = th6Var.f386457v == 1;
                        boolean z37 = th6Var.f386458w == 1;
                        int i39 = th6Var.f386460y;
                        int i47 = th6Var.f386461z;
                        boolean z38 = th6Var.C == 1;
                        boolean z39 = th6Var.A == 1;
                        if (th6Var.B == 1) {
                            z17 = true;
                            i19 = i29;
                            i27 = i39;
                        } else {
                            i19 = i29;
                            i27 = i39;
                            z17 = false;
                        }
                        arrayList.add(new com.tencent.mm.msgsubscription.SubscribeMsgTmpItem(str7, str9, i28, i19, arrayList2, i37, z18, str12, str14, z19, i38, z28, z27, str16, z29, z37, i27, i47, z38, z39, z17));
                        str4 = str10;
                        it = it6;
                    }
                    java.lang.String str17 = str4;
                    r45.uh6 uh6Var = wh6Var.A;
                    boolean z47 = uh6Var != null && uh6Var.f387389d == 1;
                    if (uh6Var == null || (linkedList = uh6Var.f387390e) == null) {
                        p0Var = kz5.p0.f313996d;
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                        for (r45.dx4 dx4Var : linkedList) {
                            java.lang.String str18 = dx4Var.f372826d;
                            if (str18 == null) {
                                str18 = str17;
                            }
                            arrayList3.add(new com.tencent.mm.msgsubscription.NotifySwitchItem(str18, dx4Var.f372827e == 1, dx4Var.f372830h));
                        }
                        p0Var = arrayList3;
                    }
                    boolean z48 = wh6Var.f389174i == 1;
                    java.lang.String str19 = wh6Var.f389172g;
                    java.lang.String str20 = str19 == null ? str17 : str19;
                    java.lang.String str21 = wh6Var.f389171f;
                    if (str21 == null) {
                        str21 = str17;
                    }
                    int i48 = wh6Var.f389175m;
                    boolean z49 = wh6Var.f389173h == 1;
                    boolean z57 = wh6Var.f389186x == 1;
                    r45.zh6 zh6Var = wh6Var.f389170e;
                    java.lang.String str22 = zh6Var != null ? zh6Var.f392065d : null;
                    java.lang.String str23 = str22 == null ? str17 : str22;
                    java.lang.String str24 = zh6Var != null ? zh6Var.f392066e : null;
                    java.lang.String str25 = str24 == null ? str17 : str24;
                    java.lang.String str26 = zh6Var != null ? zh6Var.f392067f : null;
                    java.lang.String str27 = str26 == null ? str17 : str26;
                    java.lang.String str28 = zh6Var != null ? zh6Var.f392068g : null;
                    java.lang.String str29 = str28 == null ? str17 : str28;
                    java.lang.String str30 = zh6Var != null ? zh6Var.f392069h : null;
                    java.lang.String str31 = str30 == null ? str17 : str30;
                    java.lang.String str32 = zh6Var != null ? zh6Var.f392070i : null;
                    java.lang.String str33 = str32 == null ? str17 : str32;
                    java.lang.String str34 = zh6Var != null ? zh6Var.f392071m : null;
                    java.lang.String str35 = str34 == null ? str17 : str34;
                    java.lang.String str36 = zh6Var != null ? zh6Var.f392072n : null;
                    java.lang.String str37 = str36 == null ? str17 : str36;
                    java.lang.String str38 = zh6Var != null ? zh6Var.f392073o : null;
                    java.lang.String str39 = str38 == null ? str17 : str38;
                    java.lang.String str40 = zh6Var != null ? zh6Var.f392074p : null;
                    java.lang.String str41 = str40 == null ? str17 : str40;
                    java.lang.String str42 = zh6Var != null ? zh6Var.f392075q : null;
                    com.tencent.mm.msgsubscription.WordingInfo wordingInfo = new com.tencent.mm.msgsubscription.WordingInfo(str23, str25, str27, str29, str31, str33, str35, str37, str39, str41, str42 == null ? str17 : str42);
                    boolean z58 = wh6Var.f389176n == 1;
                    boolean z59 = wh6Var.f389177o == 1;
                    boolean z66 = wh6Var.f389188z == 1;
                    com.tencent.mm.protobuf.g gVar = wh6Var.f389178p;
                    byte[] g17 = gVar != null ? gVar.g() : null;
                    if (g17 == null) {
                        g17 = new byte[0];
                    }
                    byte[] bArr = g17;
                    int i49 = wh6Var.f389184v;
                    r45.xh6 xh6Var = wh6Var.f389185w;
                    int i57 = xh6Var != null ? xh6Var.f390111d : -1;
                    java.lang.String str43 = xh6Var != null ? xh6Var.f390112e : null;
                    if (str43 == null) {
                        str43 = str17;
                    }
                    java.lang.String str44 = xh6Var != null ? xh6Var.f390113f : null;
                    if (str44 == null) {
                        str44 = str17;
                    }
                    com.tencent.mm.msgsubscription.ShowInfo showInfo2 = new com.tencent.mm.msgsubscription.ShowInfo(i57, str43, str44);
                    java.lang.String str45 = wh6Var.f389182t;
                    java.lang.String str46 = str45 == null ? str17 : str45;
                    java.lang.String str47 = wh6Var.f389183u;
                    java.lang.String str48 = str47 == null ? str17 : str47;
                    int i58 = wh6Var.f389179q;
                    java.lang.String str49 = wh6Var.f389180r;
                    java.lang.String str50 = str49 == null ? str17 : str49;
                    boolean z67 = wh6Var.f389181s;
                    java.lang.String str51 = wh6Var.f389187y;
                    if (str51 == null) {
                        showInfo = showInfo2;
                        str3 = str17;
                    } else {
                        str3 = str51;
                        showInfo = showInfo2;
                    }
                    eVar2.a(i17, i18, str5, new com.tencent.mm.msgsubscription.SubscribeMsgRequestResult(z48, str20, str21, i48, arrayList, z49, z57, wordingInfo, z58, z59, z66, bArr, i49, showInfo, str46, str48, i58, str50, z67, str3, z47, p0Var));
                    return;
                }
                return;
            }
            str2 = "";
        }
        f31.e eVar3 = fVar.f259277f;
        if (eVar3 != null) {
            eVar3.a(i17, i18, str == null ? str2 : str, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String username, int i17) {
        this(username, "", i17);
        kotlin.jvm.internal.o.g(username, "username");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String username, int i17, boolean z17) {
        this(username, i17);
        kotlin.jvm.internal.o.g(username, "username");
        this.f259278g = z17;
    }
}
