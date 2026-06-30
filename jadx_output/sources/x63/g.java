package x63;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final kk.j f452235a = new jt0.j(32);

    public static y63.a A(y63.a aVar, y63.a aVar2, java.lang.String str, int i17) {
        if (aVar != null && aVar2 != null) {
            if (i17 == 1) {
                if (!com.tencent.mm.sdk.platformtools.t8.D0(str, aVar2.field_creator) || aVar.N.size() > 1) {
                    return aVar2;
                }
            } else if (i17 != 2 && (i17 != 3 || !aVar.M)) {
                return aVar2;
            }
            y63.c Bi = ((t63.e) i95.n0.c(t63.e.class)).Bi();
            Bi.getClass();
            boolean delete = Bi.delete(aVar2.systemRowid);
            com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireStorage", "deleteSolitatire ret:%s deleteRet:%s", java.lang.Boolean.valueOf(delete), java.lang.Integer.valueOf(Bi.f459662d.delete("GroupSolitatire", "username=? and key=?", new java.lang.String[]{aVar2.field_username, aVar2.field_key})));
            if (delete) {
                ((t63.e) i95.n0.c(t63.e.class)).wi().b(aVar2.field_username, aVar2.field_key);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "handleSolitatireLossEfficacy key:%s result:%s", aVar2.field_key, java.lang.Boolean.valueOf(delete));
            return null;
        }
        return aVar2;
    }

    public static boolean B(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || context == null) {
            return false;
        }
        java.lang.String trim = str.trim();
        return com.tencent.mm.sdk.platformtools.t8.D0(trim, context.getString(com.tencent.mm.R.string.fsk)) || com.tencent.mm.sdk.platformtools.t8.D0(trim, context.getString(com.tencent.mm.R.string.fsl));
    }

    public static boolean C(y63.a aVar) {
        if (aVar == null) {
            return false;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (aVar.L == 1) {
            sb6.append(aVar.H);
        }
        sb6.append(aVar.I);
        sb6.append(aVar.f459651J);
        return java.util.regex.Pattern.compile(((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Zi(e42.d0.clicfg_android_solitaire_keyword_regex, "(接龙|报名|参加|参与|活动|组织|投票|回复|统计)", true)).matcher(sb6.toString()).find();
    }

    public static boolean D(android.content.Context context, java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || context == null) {
            return false;
        }
        java.lang.String trim = str.trim();
        return trim.startsWith(context.getString(com.tencent.mm.R.string.fsk)) || trim.startsWith(context.getString(com.tencent.mm.R.string.fsl));
    }

    public static boolean E(java.lang.String str) {
        return y(str) > v() * 2;
    }

    public static boolean F(java.lang.String str) {
        return y(str) > u() * 2;
    }

    public static boolean G(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            return false;
        }
        java.lang.String Q0 = f9Var.Q0();
        java.lang.String W1 = f9Var.W1();
        if (!((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).Ai(Q0)) {
            return false;
        }
        y63.a f17 = ((t63.e) i95.n0.c(t63.e.class)).wi().f(Q0, W1);
        x63.a c17 = ((t63.e) i95.n0.c(t63.e.class)).wi().c(Q0);
        return f17 != null && c17 != null && f17.field_active == 1 && f17.field_lastActiveTime >= c17.f452230b && f17.N.size() < w() && f9Var.getMsgId() >= f17.field_firstMsgId;
    }

    public static boolean H(y63.a aVar, y63.a aVar2, long j17, boolean z17, java.lang.String str, boolean z18, boolean z19, long j18, java.lang.String str2) {
        y63.a I = I(aVar, aVar2, str, z18, z19);
        if (I != null && I.field_firstMsgId == 0) {
            I.field_firstMsgId = j17;
        }
        I.field_lastActiveTime = j18;
        boolean K = K(I, aVar2 != null, z17);
        if (j17 != 0 && K) {
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(str2, j17);
            Li.r3(aVar.field_key);
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(j17, Li, true);
            if (z17 && aVar2 != null && aVar2.field_active == 0 && I.N.size() > 1) {
                ((t63.e) i95.n0.c(t63.e.class)).Ai().b(I, str, str2);
            }
            if (aVar2 == null) {
                y63.a L0 = ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(I.field_username, I.field_key, true);
                if (L0.field_msgSvrId == 0) {
                    L0.field_msgSvrId = Li.I0();
                    ((t63.e) i95.n0.c(t63.e.class)).Bi().W0(L0, true);
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "mergeAndSaveGroupSolitatire() key:%s msgId:%s ret:%s", I.field_key, java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(K));
        return K;
    }

    public static y63.a I(y63.a aVar, y63.a aVar2, java.lang.String str, boolean z17, boolean z18) {
        if (aVar == null && aVar2 == null) {
            return null;
        }
        if (aVar == null && aVar2 != null) {
            return aVar2;
        }
        if ((aVar != null && aVar2 == null) || !com.tencent.mm.sdk.platformtools.t8.D0(aVar.field_key, aVar2.field_key)) {
            return aVar;
        }
        y63.a clone = aVar2.clone();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        if (z18) {
            for (int i17 = 1; i17 <= aVar.N.size(); i17++) {
                y63.b bVar = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
                if (!linkedHashSet.contains(bVar)) {
                    linkedHashSet.add(bVar);
                }
            }
        } else {
            java.util.HashSet hashSet = new java.util.HashSet();
            java.util.HashMap hashMap = new java.util.HashMap();
            for (int i18 = 1; i18 <= aVar2.N.size(); i18++) {
                y63.b bVar2 = (y63.b) aVar2.N.get(java.lang.Integer.valueOf(i18));
                if (com.tencent.mm.sdk.platformtools.t8.D0(bVar2.f459652a, str)) {
                    hashSet.add(bVar2);
                    hashMap.put(bVar2.f459656e, bVar2);
                } else {
                    linkedHashSet.add(bVar2);
                }
            }
            for (int i19 = 1; i19 <= aVar.N.size(); i19++) {
                y63.b bVar3 = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i19));
                if (!linkedHashSet.contains(bVar3) && com.tencent.mm.sdk.platformtools.t8.D0(bVar3.f459652a, str)) {
                    if (z17) {
                        linkedHashSet.add(bVar3);
                    } else {
                        y63.b bVar4 = (y63.b) hashMap.get(bVar3.f459656e);
                        if (bVar4 == null) {
                            linkedHashSet.add(bVar3);
                        } else {
                            linkedHashSet.add(bVar4);
                        }
                    }
                }
            }
        }
        clone.N.clear();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            arrayList.add((y63.b) it.next());
        }
        java.util.Collections.sort(arrayList, new x63.d());
        java.util.Iterator it6 = arrayList.iterator();
        int i27 = 0;
        while (it6.hasNext()) {
            i27++;
            clone.N.put(java.lang.Integer.valueOf(i27), (y63.b) it6.next());
        }
        clone.Q = aVar.Q;
        return clone;
    }

    public static y63.a J(y63.a aVar, y63.a aVar2, y63.a aVar3) {
        int i17;
        y63.b bVar;
        if (aVar == null && aVar3 == null) {
            return null;
        }
        if (aVar == null && aVar3 != null) {
            return aVar3;
        }
        if ((aVar != null && aVar3 == null) || !com.tencent.mm.sdk.platformtools.t8.D0(aVar.field_key, aVar3.field_key)) {
            return aVar;
        }
        y63.a clone = aVar3.clone();
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        java.util.LinkedHashSet<y63.b> linkedHashSet3 = new java.util.LinkedHashSet();
        java.util.LinkedHashSet linkedHashSet4 = new java.util.LinkedHashSet();
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 1; i18 <= aVar3.N.size(); i18++) {
            y63.b clone2 = ((y63.b) aVar3.N.get(java.lang.Integer.valueOf(i18))).clone();
            if (com.tencent.mm.sdk.platformtools.t8.D0(clone2.f459652a, c01.z1.r())) {
                linkedHashSet2.add(clone2);
                hashMap.put(clone2.f459656e, clone2);
                arrayList.add(clone2);
            } else {
                linkedHashSet.add(clone2);
            }
        }
        if (aVar2 != null) {
            for (int i19 = 1; i19 <= aVar2.N.size(); i19++) {
                linkedHashSet4.add(((y63.b) aVar2.N.get(java.lang.Integer.valueOf(i19))).clone());
            }
        }
        for (int i27 = 1; i27 <= aVar.N.size(); i27++) {
            y63.b bVar2 = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i27));
            if (!linkedHashSet.contains(bVar2) && (!linkedHashSet4.contains(bVar2) || linkedHashSet2.contains(bVar2))) {
                linkedHashSet3.add(bVar2);
            }
        }
        for (y63.b bVar3 : linkedHashSet3) {
            if (linkedHashSet2.contains(bVar3)) {
                arrayList.remove(bVar3);
            }
        }
        java.util.Iterator it = linkedHashSet3.iterator();
        while (true) {
            i17 = 0;
            if (!it.hasNext()) {
                break;
            }
            y63.b bVar4 = (y63.b) it.next();
            if (linkedHashSet2.contains(bVar4)) {
                y63.b bVar5 = (y63.b) hashMap.get(bVar4.f459656e);
                if (bVar5 == null) {
                    linkedHashSet.add(bVar4);
                } else {
                    linkedHashSet.add(bVar5);
                }
            } else {
                java.util.Iterator it6 = arrayList.iterator();
                while (true) {
                    if (!it6.hasNext()) {
                        bVar = null;
                        break;
                    }
                    bVar = (y63.b) it6.next();
                    if (bVar.f459657f == bVar4.f459657f) {
                        break;
                    }
                }
                if (bVar == null) {
                    linkedHashSet.add(bVar4);
                } else {
                    arrayList.remove(bVar);
                    bVar.f459656e = bVar4.f459656e;
                    linkedHashSet.add(bVar);
                }
            }
        }
        clone.N.clear();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it7 = linkedHashSet.iterator();
        while (it7.hasNext()) {
            arrayList2.add((y63.b) it7.next());
        }
        java.util.Collections.sort(arrayList2, new x63.c());
        java.util.Iterator it8 = arrayList2.iterator();
        while (it8.hasNext()) {
            i17++;
            clone.N.put(java.lang.Integer.valueOf(i17), (y63.b) it8.next());
        }
        clone.Q = aVar.Q;
        return clone;
    }

    public static boolean K(y63.a aVar, boolean z17, boolean z18) {
        boolean insert;
        if (aVar == null) {
            return false;
        }
        if (!((u63.e) ((vg3.v3) i95.n0.c(vg3.v3.class))).Ai(aVar.field_username)) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "saveGroupSolitatire key:%s exist:%s supportOnlyOne:%s num:%s", aVar.field_key, java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18), java.lang.Integer.valueOf(aVar.N.size()));
        if (z17) {
            if (aVar.N.size() <= w()) {
                insert = ((t63.e) i95.n0.c(t63.e.class)).Bi().W0(aVar, false);
            }
            insert = false;
        } else {
            if (!z18 || aVar.N.size() <= 1) {
                insert = ((t63.e) i95.n0.c(t63.e.class)).Bi().insert(aVar);
            }
            insert = false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "saveGroupSolitatire() ret:%s", java.lang.Boolean.valueOf(insert));
        if (insert) {
            x63.j wi6 = ((t63.e) i95.n0.c(t63.e.class)).wi();
            java.lang.String str = aVar.field_username;
            wi6.getClass();
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                x63.a aVar2 = new x63.a();
                aVar2.f452233e = c01.id.e();
                java.util.List D0 = ((t63.e) i95.n0.c(t63.e.class)).Bi().D0(str, 0);
                java.util.List D02 = ((t63.e) i95.n0.c(t63.e.class)).Bi().D0(str, 1);
                java.util.ArrayList arrayList = (java.util.ArrayList) D0;
                if (arrayList.size() > s()) {
                    aVar2.f452231c = false;
                    aVar2.f452232d = ((y63.a) arrayList.get(s() - 1)).field_lastActiveTime;
                } else {
                    aVar2.f452231c = true;
                    aVar2.f452232d = c01.id.e() - (p() * y63.c.f459659f.longValue());
                }
                java.util.ArrayList arrayList2 = (java.util.ArrayList) D02;
                if (arrayList2.size() > r()) {
                    aVar2.f452229a = false;
                    aVar2.f452230b = ((y63.a) arrayList2.get(r() - 1)).field_lastActiveTime;
                } else {
                    aVar2.f452229a = true;
                    aVar2.f452230b = c01.id.e() - (5 * y63.c.f459658e.longValue());
                }
                wi6.f452244e.put(str, aVar2);
            }
            ((t63.e) i95.n0.c(t63.e.class)).wi().b(aVar.field_username, aVar.field_key);
            c(aVar.field_username);
        }
        return insert;
    }

    public static void L(long j17, java.lang.String str, y63.a aVar, java.lang.String str2) {
        java.lang.String str3;
        java.lang.String str4;
        java.util.LinkedList linkedList;
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "setLocalSolitaireFoldInfoFromMsg: groupSolitatire is null");
            return;
        }
        if (j17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "setLocalSolitaireFoldInfoFromMsg msgId == 0");
            return;
        }
        com.tencent.mm.storage.f9 Li = pt0.f0.Li(str2, j17);
        y63.a L0 = ((t63.e) i95.n0.c(t63.e.class)).Bi().L0(aVar.field_username, aVar.field_key, false);
        r45.ad4 ad4Var = new r45.ad4();
        if (Li.b3()) {
            str3 = Li.j();
        } else if (Li.H2()) {
            ot0.q v17 = ot0.q.v(Li.j());
            if (v17 == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "setLocalSolitaireFoldInfoFromMsg: amc is null");
                return;
            }
            str3 = v17.f348654f;
        } else {
            str3 = "";
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "setLocalSolitaireFoldInfoFromMsg: content is null");
            return;
        }
        if (L0 != null) {
            str4 = L0.K;
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            for (int i17 = 1; i17 <= L0.N.size(); i17++) {
                y63.b bVar = (y63.b) L0.N.get(java.lang.Integer.valueOf(i17));
                if (bVar != null && com.tencent.mm.sdk.platformtools.t8.D0(bVar.f459652a, str)) {
                    linkedHashSet.add(bVar);
                }
            }
            for (int i18 = 1; i18 <= aVar.N.size(); i18++) {
                y63.b bVar2 = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i18));
                if (bVar2 != null) {
                    if (linkedHashSet.contains(bVar2)) {
                        bVar2.f459652a = str;
                    } else {
                        bVar2.f459652a = "";
                    }
                }
            }
        } else {
            str4 = aVar.K;
        }
        int i19 = aVar.L == 0 ? 2 : 1;
        while (true) {
            int size = aVar.N.size();
            linkedList = ad4Var.f369943e;
            if (i19 > size) {
                break;
            }
            y63.b bVar3 = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i19));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar3.f459656e) && !com.tencent.mm.sdk.platformtools.t8.K0(bVar3.f459656e.trim())) {
                bVar3.f459656e = bVar3.f459656e.trim();
                if (com.tencent.mm.sdk.platformtools.t8.D0(bVar3.f459652a, str)) {
                    linkedList.add(q(str3, str4, bVar3, i19));
                }
            }
            i19++;
        }
        if (linkedList.size() <= 0) {
            java.util.HashMap hashMap = aVar.N;
            linkedList.add(q(str3, str4, (y63.b) hashMap.get(java.lang.Integer.valueOf(hashMap.size())), aVar.N.size()));
        }
        if ((aVar.L == 0 ? (aVar.N.size() - linkedList.size()) - 1 : aVar.N.size() - linkedList.size()) < 2) {
            return;
        }
        ad4Var.f369945g = aVar.L;
        ad4Var.f369946h = aVar.N.size() - linkedList.size();
        ad4Var.f369947i = aVar.field_msgSvrId;
        ad4Var.f369948m = aVar.field_key;
        int i27 = aVar.L;
        java.util.LinkedList linkedList2 = ad4Var.f369942d;
        if (i27 == 0) {
            linkedList2.add(q(str3, str4, (y63.b) aVar.N.get(1), 1));
        } else {
            java.lang.String str5 = aVar.H;
            if (str5 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str5.trim())) {
                r45.bd4 bd4Var = new r45.bd4();
                d(bd4Var, str3, aVar.H.trim());
                linkedList2.add(bd4Var);
            }
            java.lang.String str6 = aVar.I;
            if (str6 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str6.trim())) {
                android.util.Pair x17 = x(str3, aVar.I.trim());
                r45.bd4 bd4Var2 = new r45.bd4();
                if (x17 == null) {
                    bd4Var2.f370677e = 0;
                    bd4Var2.f370678f = 0;
                } else {
                    if (linkedList2.size() > 0) {
                        bd4Var2.f370676d = "\n";
                    }
                    bd4Var2.f370677e = ((java.lang.Integer) x17.first).intValue();
                    bd4Var2.f370678f = ((java.lang.Integer) x17.first).intValue() + ((java.lang.Integer) x17.second).intValue();
                }
                linkedList2.add(bd4Var2);
            }
        }
        java.lang.String str7 = aVar.f459651J;
        if (str7 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str7.trim())) {
            r45.bd4 bd4Var3 = new r45.bd4();
            d(bd4Var3, str3, aVar.f459651J.trim());
            ad4Var.f369944f = bd4Var3;
        }
        if (pt0.f0.f358209b1.g()) {
            com.tencent.mm.storage.i9 a17 = tg3.p1.f419206a.a(Li);
            a17.f195029g = ad4Var;
            tg3.q1.a(a17, Li);
        }
        Li.q1(ad4Var);
        try {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(Li.getMsgId(), Li, true);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "%s %s", e17.getClass().getSimpleName(), e17.getMessage());
        }
    }

    public static java.lang.String a(java.lang.String str, y63.a aVar, boolean z17) {
        if (aVar == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<solitaire><tt>");
        sb6.append(i(str, aVar.H));
        sb6.append("</tt><ex>");
        sb6.append(i(str, aVar.I));
        sb6.append("</ex><tl>");
        sb6.append(i(str, aVar.f459651J));
        sb6.append("</tl><s>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(aVar.K));
        sb6.append("</s><au>");
        sb6.append(aVar.field_creator);
        sb6.append("</au><hrt>");
        sb6.append(aVar.L + "");
        sb6.append("</hrt><loss>");
        sb6.append(z17 ? 1 : 0);
        sb6.append("</loss><content><s>");
        sb6.append(aVar.N.size());
        sb6.append("</s>");
        for (int i17 = 1; i17 <= aVar.N.size(); i17++) {
            y63.b bVar = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
            if (bVar != null) {
                sb6.append("<i><u>");
                sb6.append(bVar.f459652a);
                sb6.append("</u><h>");
                sb6.append(bVar.f459653b);
                sb6.append("</h><s>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(bVar.f459654c));
                sb6.append("</s><t>");
                sb6.append(bVar.f459655d);
                sb6.append("</t>");
                android.util.Pair x17 = x(str, bVar.f459656e);
                if (x17 == null) {
                    sb6.append("<c>");
                    sb6.append(com.tencent.mm.sdk.platformtools.t8.p(bVar.f459656e));
                    sb6.append("</c>");
                } else {
                    sb6.append("<r>");
                    sb6.append(x17.first + "-" + x17.second);
                    sb6.append("</r>");
                }
                sb6.append("</i>");
            }
        }
        sb6.append("</content></solitaire>");
        return sb6.toString();
    }

    public static java.lang.String b(y63.a aVar) {
        if (aVar == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<solitaire><tt>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(aVar.H));
        sb6.append("</tt><ex>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(aVar.I));
        sb6.append("</ex><tl>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(aVar.f459651J));
        sb6.append("</tl><s>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(aVar.K));
        sb6.append("</s><au>");
        sb6.append(aVar.field_creator);
        sb6.append("</au><hrt>");
        sb6.append(aVar.L + "");
        sb6.append("</hrt><content><s>");
        sb6.append(aVar.N.size());
        sb6.append("</s>");
        for (int i17 = 1; i17 <= aVar.N.size(); i17++) {
            y63.b bVar = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
            if (bVar != null) {
                sb6.append("<i><u>");
                sb6.append(bVar.f459652a);
                sb6.append("</u><h>");
                sb6.append(bVar.f459653b);
                sb6.append("</h><s>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(bVar.f459654c));
                sb6.append("</s><t>");
                sb6.append(bVar.f459655d);
                sb6.append("</t><c>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(bVar.f459656e));
                sb6.append("</c><o>");
                sb6.append(bVar.f459657f);
                sb6.append("</o></i>");
            }
        }
        sb6.append("</content></solitaire>");
        return sb6.toString();
    }

    public static void c(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "deleteExpireGroupSolitatire() batch delete expire data!! (%s)", str);
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || !com.tencent.mm.storage.z3.R4(str)) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).l(new x63.b(str), 1000L, "deleteExpireGroupSolitatire");
    }

    public static void d(r45.bd4 bd4Var, java.lang.String str, java.lang.String str2) {
        android.util.Pair x17 = x(str, str2);
        if (x17 == null) {
            bd4Var.f370677e = 0;
            bd4Var.f370678f = 0;
        } else {
            bd4Var.f370677e = ((java.lang.Integer) x17.first).intValue();
            bd4Var.f370678f = ((java.lang.Integer) x17.first).intValue() + ((java.lang.Integer) x17.second).intValue();
        }
    }

    public static void e(java.lang.String str, y63.a aVar) {
        if (aVar == null) {
            return;
        }
        java.lang.String r17 = c01.z1.r();
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_creator)) {
            aVar.field_creator = r17;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_username)) {
            aVar.field_username = str;
        }
        for (int i17 = 1; i17 <= aVar.N.size(); i17++) {
            y63.b bVar = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
            if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f459652a)) {
                bVar.f459652a = r17;
            }
        }
    }

    public static void f(java.lang.String str, java.lang.String str2, y63.a aVar, long j17, boolean z17) {
        if (aVar == null) {
            return;
        }
        aVar.field_key = o(aVar);
        aVar.field_lastActiveTime = j17;
        if (z17) {
            aVar.field_active = 1;
        } else {
            aVar.field_active = 0;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_username)) {
            aVar.field_username = str;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.field_creator)) {
            aVar.field_creator = str2;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashSet hashSet = new java.util.HashSet();
        aVar.P = false;
        aVar.H = aVar.H.trim();
        aVar.I = aVar.I.trim();
        aVar.f459651J = aVar.f459651J.trim();
        for (int i17 = 1; i17 <= aVar.N.size(); i17++) {
            y63.b bVar = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(bVar.f459656e) && !com.tencent.mm.sdk.platformtools.t8.K0(bVar.f459656e.trim())) {
                bVar.f459656e = bVar.f459656e.trim();
                if (hashSet.contains(((h12.b) ((k12.r) i95.n0.c(k12.r.class))).wi(bVar.f459656e))) {
                    aVar.P = true;
                }
                hashSet.add(((h12.b) ((k12.r) i95.n0.c(k12.r.class))).wi(bVar.f459656e));
                hashMap.put(java.lang.Integer.valueOf(hashMap.size() + 1), bVar);
                if (bVar.f459655d == com.tencent.wcdb.core.Database.DictDefaultMatchValue) {
                    bVar.f459655d = j17;
                }
                if (com.tencent.mm.sdk.platformtools.t8.K0(bVar.f459652a)) {
                    bVar.f459652a = str2;
                }
            }
        }
        aVar.N = hashMap;
    }

    public static void g(java.lang.String str, java.lang.String str2, y63.a aVar, long j17, boolean z17, java.lang.String str3) {
        long e17 = c01.id.e();
        if (j17 != 0) {
            e17 = pt0.f0.Li(str3, j17).getCreateTime() / 1000;
        }
        f(str, str2, aVar, e17, z17);
    }

    public static void h(y63.a aVar, java.lang.String str) {
        if (aVar == null || aVar.field_msgSvrId != 0) {
            return;
        }
        aVar.field_msgSvrId = pt0.f0.Li(str, aVar.field_firstMsgId).I0();
        com.tencent.mars.xlog.Log.i("MicroMsg.groupsolitaire.GroupSolitatireHelp", "fixMsgSvrId ret:%s", java.lang.Boolean.valueOf(((t63.e) i95.n0.c(t63.e.class)).Bi().W0(aVar, true)));
    }

    public static java.lang.String i(java.lang.String str, java.lang.String str2) {
        android.util.Pair x17 = x(str, str2);
        if (x17 == null) {
            return str2;
        }
        return x17.first + "-" + x17.second;
    }

    public static java.lang.String j(y63.a aVar) {
        if (aVar == null) {
            return "";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String str = aVar.H;
        if (str != null && !com.tencent.mm.sdk.platformtools.t8.K0(str.trim()) && aVar.L == 1) {
            java.lang.String trim = aVar.H.trim();
            aVar.H = trim;
            sb6.append(trim);
            sb6.append("\n");
        }
        java.lang.String str2 = aVar.I;
        if (str2 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str2.trim())) {
            java.lang.String trim2 = aVar.I.trim();
            aVar.I = trim2;
            sb6.append(trim2);
            sb6.append("\n");
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(sb6.toString())) {
            sb6.append("\n");
        }
        if (aVar.N.size() > 0) {
            for (int i17 = 1; i17 <= aVar.N.size(); i17++) {
                y63.b bVar = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
                sb6.append(i17);
                sb6.append(aVar.K);
                sb6.append(" ");
                sb6.append(bVar.f459656e);
                if (i17 < aVar.N.size()) {
                    sb6.append("\n");
                }
            }
        }
        java.lang.String str3 = aVar.f459651J;
        if (str3 != null && !com.tencent.mm.sdk.platformtools.t8.K0(str3.trim())) {
            aVar.f459651J = aVar.f459651J.trim();
            sb6.append("\n\n");
            sb6.append(aVar.f459651J);
        }
        return sb6.toString();
    }

    public static java.lang.String k(java.lang.String str, java.lang.String str2) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str) || com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            return "";
        }
        java.lang.String[] split = str2.split("-");
        if (split != null && split.length == 2) {
            int P = com.tencent.mm.sdk.platformtools.t8.P(split[0], 0);
            int P2 = com.tencent.mm.sdk.platformtools.t8.P(split[1], 0) + P;
            if (P >= 0 && P2 <= str.length()) {
                return str.substring(P, P2);
            }
        }
        return str2;
    }

    public static int l(java.lang.String str, int i17) {
        int length = str.length();
        int i18 = 0;
        while (i18 <= length) {
            int i19 = (i18 + length) / 2;
            int y17 = y(str.substring(0, i19));
            if (y17 == i17) {
                return i19;
            }
            if (y17 > i17) {
                length = i19 - 1;
            }
            if (y17 < i17) {
                i18 = i19 + 1;
            }
        }
        return length;
    }

    public static y63.a m(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String str4;
        java.lang.String str5;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str3)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "xml is null");
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(str3);
        sb6.append(str2 == null ? "" : str2);
        int hashCode = sb6.toString().hashCode();
        kk.j jVar = f452235a;
        y63.a aVar = (y63.a) ((lt0.f) jVar).get(java.lang.Integer.valueOf(hashCode));
        if (aVar != null) {
            return aVar;
        }
        if (!str3.trim().contains("<solitaire>")) {
            return null;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str3, "solitaire", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "newValues is null: %s", str3);
            return null;
        }
        y63.a aVar2 = new y63.a();
        aVar2.H = k(str2, (java.lang.String) d17.get(".solitaire.tt"));
        aVar2.I = k(str2, (java.lang.String) d17.get(".solitaire.ex"));
        aVar2.f459651J = k(str2, (java.lang.String) d17.get(".solitaire.tl"));
        aVar2.K = (java.lang.String) d17.get(".solitaire.s");
        aVar2.field_creator = (java.lang.String) d17.get(".solitaire.au");
        aVar2.field_username = str;
        aVar2.L = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.hrt"), 1);
        aVar2.M = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.loss"), 0) == 1;
        if (d17.containsKey(".solitaire.content.s")) {
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.content.s"), 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < P; i17++) {
                y63.b bVar = new y63.b();
                if (i17 == 0) {
                    bVar.f459652a = (java.lang.String) d17.get(".solitaire.content.i.u");
                    bVar.f459653b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.content.i.h"), 0);
                    bVar.f459654c = (java.lang.String) d17.get(".solitaire.content.i.s");
                    bVar.f459655d = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".solitaire.content.i.t"), 0L);
                    str4 = (java.lang.String) d17.get(".solitaire.content.i.c");
                    str5 = (java.lang.String) d17.get(".solitaire.content.i.r");
                } else {
                    bVar.f459652a = (java.lang.String) d17.get(".solitaire.content.i" + i17 + ".u");
                    bVar.f459653b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.content.i" + i17 + ".h"), 0);
                    bVar.f459654c = (java.lang.String) d17.get(".solitaire.content.i" + i17 + ".s");
                    bVar.f459655d = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".solitaire.content.i" + i17 + ".t"), 0L);
                    str4 = (java.lang.String) d17.get(".solitaire.content.i" + i17 + ".c");
                    str5 = (java.lang.String) d17.get(".solitaire.content.i" + i17 + ".r");
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(str4)) {
                    bVar.f459656e = str4;
                } else if (!com.tencent.mm.sdk.platformtools.t8.K0(str5)) {
                    bVar.f459656e = k(str2, str5);
                }
                arrayList.add(bVar);
            }
            java.util.Collections.sort(arrayList, new x63.f());
            for (int i18 = 0; i18 < P; i18++) {
                java.util.HashMap hashMap = aVar2.N;
                hashMap.put(java.lang.Integer.valueOf(hashMap.size() + 1), (y63.b) arrayList.get(i18));
            }
        }
        aVar2.field_key = o(aVar2);
        ((lt0.f) jVar).put(java.lang.Integer.valueOf(hashCode), aVar2);
        return aVar2;
    }

    public static void n(y63.a aVar) {
        if (aVar == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "groupSolitatire is null");
            return;
        }
        java.lang.String str = aVar.field_content;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "xml is null");
            return;
        }
        if (!str.trim().contains("<solitaire>")) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "<solitaire> no contains");
            return;
        }
        java.util.Map d17 = com.tencent.mm.sdk.platformtools.aa.d(str, "solitaire", null);
        if (d17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.groupsolitaire.GroupSolitatireHelp", "newValues is null: %s", str);
            return;
        }
        aVar.H = (java.lang.String) d17.get(".solitaire.tt");
        aVar.I = (java.lang.String) d17.get(".solitaire.ex");
        aVar.f459651J = (java.lang.String) d17.get(".solitaire.tl");
        aVar.K = (java.lang.String) d17.get(".solitaire.s");
        aVar.field_creator = (java.lang.String) d17.get(".solitaire.au");
        aVar.L = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.hrt"), 1);
        if (d17.containsKey(".solitaire.content.s")) {
            int P = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.content.s"), 0);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i17 = 0; i17 < P; i17++) {
                y63.b bVar = new y63.b();
                if (i17 == 0) {
                    bVar.f459652a = (java.lang.String) d17.get(".solitaire.content.i.u");
                    bVar.f459653b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.content.i.h"), 0);
                    bVar.f459654c = (java.lang.String) d17.get(".solitaire.content.i.s");
                    bVar.f459655d = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".solitaire.content.i.t"), 0L);
                    bVar.f459656e = (java.lang.String) d17.get(".solitaire.content.i.c");
                    bVar.f459657f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.content.i.o"), 0);
                } else {
                    bVar.f459652a = (java.lang.String) d17.get(".solitaire.content.i" + i17 + ".u");
                    bVar.f459653b = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.content.i" + i17 + ".h"), 0);
                    bVar.f459654c = (java.lang.String) d17.get(".solitaire.content.i" + i17 + ".s");
                    bVar.f459655d = com.tencent.mm.sdk.platformtools.t8.V((java.lang.String) d17.get(".solitaire.content.i" + i17 + ".t"), 0L);
                    bVar.f459656e = (java.lang.String) d17.get(".solitaire.content.i" + i17 + ".c");
                    bVar.f459657f = com.tencent.mm.sdk.platformtools.t8.P((java.lang.String) d17.get(".solitaire.content.i" + i17 + ".o"), 0);
                }
                arrayList.add(bVar);
            }
            java.util.Collections.sort(arrayList, new x63.e());
            for (int i18 = 0; i18 < P; i18++) {
                java.util.HashMap hashMap = aVar.N;
                hashMap.put(java.lang.Integer.valueOf(hashMap.size() + 1), (y63.b) arrayList.get(i18));
            }
        }
    }

    public static java.lang.String o(y63.a aVar) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(aVar.H) && com.tencent.mm.sdk.platformtools.t8.K0(aVar.I) && com.tencent.mm.sdk.platformtools.t8.K0(aVar.f459651J) && aVar.L == 1) {
            aVar.L = 0;
            if (aVar.N.size() >= 1) {
                aVar.H = ((y63.b) aVar.N.get(1)).f459656e;
                ((y63.b) aVar.N.get(1)).f459653b = 1;
            }
        }
        return kk.k.g(com.tencent.mm.sdk.platformtools.x2.f193071a.getString(com.tencent.mm.R.string.fsq, aVar.H.trim(), aVar.L + "", aVar.I.trim(), aVar.f459651J.trim()).getBytes());
    }

    public static int p() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_solitaire_match_duration, 24);
    }

    public static r45.bd4 q(java.lang.String str, java.lang.String str2, y63.b bVar, int i17) {
        r45.bd4 bd4Var = new r45.bd4();
        bd4Var.f370676d = i17 + str2 + " ";
        d(bd4Var, str, bVar.f459656e);
        return bd4Var;
    }

    public static int r() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_solitaire_active_max_count, 20);
    }

    public static int s() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_solitaire_match_max_count, 10);
    }

    public static int t() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_solitaire_end_word_maxcount, 500);
    }

    public static int u() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_solitaire_header_word_maxcount, 500);
    }

    public static int v() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_solitaire_body_item_word_maxcount, 150);
    }

    public static int w() {
        return ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_solitaire_content_max_count, 500);
    }

    public static android.util.Pair x(java.lang.String str, java.lang.String str2) {
        int indexOf;
        if ((((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_solitaire_xml_use_c_tag_sw, 0) == 1) || com.tencent.mm.sdk.platformtools.t8.K0(str) || (indexOf = str.indexOf(str2)) <= -1) {
            return null;
        }
        return new android.util.Pair(java.lang.Integer.valueOf(indexOf), java.lang.Integer.valueOf(str2.length()));
    }

    public static int y(java.lang.String str) {
        if (str == null) {
            return 0;
        }
        try {
            return str.getBytes("GBK").length;
        } catch (java.lang.Exception e17) {
            e17.getMessage();
            return str.getBytes().length;
        }
    }

    public static void z(y63.a aVar) {
        if (aVar == null || !aVar.P) {
            return;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashSet hashSet = new java.util.HashSet();
        aVar.P = false;
        for (int i17 = 1; i17 <= aVar.N.size(); i17++) {
            y63.b bVar = (y63.b) aVar.N.get(java.lang.Integer.valueOf(i17));
            if (!hashSet.contains(bVar.f459656e)) {
                hashSet.add(bVar.f459656e);
                hashMap.put(java.lang.Integer.valueOf(hashMap.size() + 1), bVar);
            }
        }
        aVar.N = hashMap;
    }
}
