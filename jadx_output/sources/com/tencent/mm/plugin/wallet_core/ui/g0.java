package com.tencent.mm.plugin.wallet_core.ui;

/* loaded from: classes9.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final vr4.j0 f180279a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f180280b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map f180281c;

    public g0(vr4.j0 j0Var) {
        java.util.LinkedList linkedList;
        this.f180279a = null;
        this.f180280b = null;
        this.f180281c = null;
        iz5.a.d(null, j0Var);
        this.f180279a = j0Var;
        this.f180280b = new java.util.HashMap();
        java.util.LinkedList linkedList2 = j0Var.f439757h;
        if (linkedList2 != null) {
            for (int i17 = 0; i17 < linkedList2.size(); i17++) {
                vr4.i1 i1Var = (vr4.i1) linkedList2.get(i17);
                this.f180280b.put(i1Var.f439738h + "", i1Var);
            }
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavorLogicHelper", "func[initData] favorList null");
        }
        this.f180281c = new java.util.HashMap();
        vr4.k0 k0Var = j0Var.f439758i;
        if (k0Var == null || (linkedList = k0Var.f439770d) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavorLogicHelper", "func[initData] favorComposeList null");
            return;
        }
        for (int i18 = 0; i18 < linkedList.size(); i18++) {
            vr4.l0 l0Var = (vr4.l0) linkedList.get(i18);
            this.f180281c.put(l0Var.f439773d, l0Var);
        }
    }

    public static java.util.List h(int i17, java.lang.String str) {
        java.util.ArrayList a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        if (!(i17 != 0)) {
            return a17;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i18 = 0; i18 < a17.size(); i18++) {
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str) ? !((com.tencent.mm.plugin.wallet_core.model.Bankcard) a17.get(i18)).field_bankcardType.equals(str) : ((com.tencent.mm.plugin.wallet_core.model.Bankcard) a17.get(i18)).field_bankcardType.equals("CFT")) {
                arrayList.add((com.tencent.mm.plugin.wallet_core.model.Bankcard) a17.get(i18));
            }
        }
        return arrayList;
    }

    public static boolean j(com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo, com.tencent.mm.plugin.wallet_core.model.Bankcard bankcard) {
        java.lang.String str;
        java.util.List list;
        if (bankcard == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavorLogicHelper", "curBankcard null");
            return true;
        }
        if (favorPayInfo != null && !com.tencent.mm.sdk.platformtools.t8.K0(favorPayInfo.f179667d)) {
            if ((favorPayInfo.f179668e != 0) && !com.tencent.mm.sdk.platformtools.t8.K0(favorPayInfo.f179669f) && (list = favorPayInfo.f179672i) != null && list.contains(bankcard.field_bindSerial)) {
                return false;
            }
        }
        return (favorPayInfo.f179668e != 0) && (!(com.tencent.mm.sdk.platformtools.t8.K0(favorPayInfo.f179669f) || (str = bankcard.field_bankcardType) == null || str.equals(favorPayInfo.f179669f)) || (com.tencent.mm.sdk.platformtools.t8.K0(favorPayInfo.f179669f) && bankcard.field_bankcardType.equals("CFT")));
    }

    public static java.lang.String[] k(java.lang.String str) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return null;
        }
        return str.split("-");
    }

    public java.lang.String a(java.lang.String str) {
        java.util.ArrayList a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i17 = 0; i17 < a17.size(); i17++) {
            hashMap.put(((com.tencent.mm.plugin.wallet_core.model.Bankcard) a17.get(i17)).field_bankcardType, 0);
        }
        java.lang.String[] k17 = k(str);
        if (k17 != null) {
            for (java.lang.String str2 : k17) {
                vr4.i1 i1Var = (vr4.i1) ((java.util.HashMap) this.f180280b).get(str2);
                if (i1Var != null) {
                    if (i1Var.f439745r != 0) {
                        if (hashMap.containsKey(i1Var.f439746s) || com.tencent.mm.sdk.platformtools.t8.K0(i1Var.f439746s)) {
                            arrayList.add(str2);
                        }
                    }
                }
                arrayList.add(str2);
            }
        }
        if (arrayList.size() == 0) {
            return "0";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i18 = 0; i18 < arrayList.size(); i18++) {
            sb6.append(((java.lang.String) arrayList.get(i18)) + "");
            if (i18 < arrayList.size() - 1) {
                sb6.append("-");
            }
        }
        return sb6.toString();
    }

    public java.util.Map b(java.lang.String str, boolean z17) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.wallet_core.ui.f0 f0Var;
        java.util.HashMap hashMap = new java.util.HashMap();
        vr4.k0 k0Var = this.f180279a.f439758i;
        if (k0Var == null || (linkedList = k0Var.f439770d) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
        } else {
            double d17 = ((java.util.HashMap) this.f180281c).containsKey(str) ? ((vr4.l0) ((java.util.HashMap) this.f180281c).get(str)).f439774e : 0.0d;
            for (int i17 = 0; i17 < linkedList.size(); i17++) {
                vr4.l0 l0Var = (vr4.l0) linkedList.get(i17);
                java.lang.String[] k17 = k((!str.equals("0") || l0Var.equals("0")) ? (!l0Var.f439773d.startsWith(str) || str.equals(l0Var.f439773d)) ? null : l0Var.f439773d.replace(str.concat("-"), "") : l0Var.f439773d);
                if (k17 != null && k17.length > 0) {
                    vr4.i1 i1Var = (vr4.i1) ((java.util.HashMap) this.f180280b).get(k17[0]);
                    if (i1Var != null) {
                        if ((i1Var.f439745r != 0) && !com.tencent.mm.sdk.platformtools.t8.K0(i1Var.f439746s) && i1Var.f439749v.size() <= 0 && ((z17 || !i1Var.f439746s.equalsIgnoreCase("CFT")) && ((f0Var = (com.tencent.mm.plugin.wallet_core.ui.f0) hashMap.get(i1Var.f439746s)) == null || l0Var.f439774e > f0Var.f180259a.f439774e))) {
                            com.tencent.mm.plugin.wallet_core.ui.f0 f0Var2 = new com.tencent.mm.plugin.wallet_core.ui.f0();
                            f0Var2.f180259a = l0Var;
                            f0Var2.f180260b = i1Var.f439747t;
                            f0Var2.f180261c = l0Var.f439774e - d17;
                            java.lang.String str2 = i1Var.f439746s;
                            f0Var2.f180262d = str2;
                            hashMap.put(str2, f0Var2);
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    public java.lang.String c(java.lang.String str, boolean z17) {
        java.lang.String[] k17 = k(str);
        if (k17 == null) {
            return "0";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        while (true) {
            if (i17 >= k17.length) {
                break;
            }
            vr4.i1 i1Var = (vr4.i1) this.f180280b.get(k17[i17] + "");
            if (i1Var != null) {
                if (!(i1Var.f439745r != 0) || (com.tencent.mm.sdk.platformtools.t8.K0(i1Var.f439746s) && !z17)) {
                    sb6.append(k17[i17]);
                    sb6.append("-");
                }
            }
            i17++;
        }
        return sb6.length() == 0 ? "0" : sb6.delete(sb6.length() - 1, sb6.length()).toString();
    }

    public java.util.Map d(java.lang.String str, boolean z17) {
        java.util.LinkedList linkedList;
        int i17;
        java.util.HashMap hashMap = new java.util.HashMap();
        vr4.k0 k0Var = this.f180279a.f439758i;
        if (k0Var == null || (linkedList = k0Var.f439770d) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.FavorLogicHelper", "favorComposeList null or favorComposeList.favorComposeInfo null");
        } else {
            double d17 = ((java.util.HashMap) this.f180281c).containsKey(str) ? ((vr4.l0) ((java.util.HashMap) this.f180281c).get(str)).f439774e : 0.0d;
            char c17 = 0;
            int i18 = 0;
            while (i18 < linkedList.size()) {
                vr4.l0 l0Var = (vr4.l0) linkedList.get(i18);
                java.lang.String[] k17 = k((!str.equals("0") || l0Var.equals("0")) ? (!l0Var.f439773d.startsWith(str) || str.equals(l0Var.f439773d)) ? null : l0Var.f439773d.replace(str.concat("-"), "") : l0Var.f439773d);
                if (k17 != null && k17.length > 0) {
                    vr4.i1 i1Var = (vr4.i1) ((java.util.HashMap) this.f180280b).get(k17[c17]);
                    if (i1Var != null) {
                        if ((i1Var.f439745r != 0 ? (char) 1 : c17) != 0) {
                            java.util.LinkedList linkedList2 = i1Var.f439749v;
                            if (linkedList2.size() > 0 && (z17 || !i1Var.f439746s.equalsIgnoreCase("CFT"))) {
                                java.util.Iterator it = linkedList2.iterator();
                                while (it.hasNext()) {
                                    java.lang.String b17 = x51.j1.b((com.tencent.mm.protobuf.g) it.next());
                                    com.tencent.mm.plugin.wallet_core.ui.f0 f0Var = (com.tencent.mm.plugin.wallet_core.ui.f0) hashMap.get(b17);
                                    if (f0Var != null) {
                                        i17 = i18;
                                        if (l0Var.f439774e <= f0Var.f180259a.f439774e) {
                                            i18 = i17;
                                        }
                                    } else {
                                        i17 = i18;
                                    }
                                    com.tencent.mm.plugin.wallet_core.ui.f0 f0Var2 = new com.tencent.mm.plugin.wallet_core.ui.f0();
                                    f0Var2.f180259a = l0Var;
                                    f0Var2.f180260b = i1Var.f439747t;
                                    f0Var2.f180261c = l0Var.f439774e - d17;
                                    f0Var2.f180262d = i1Var.f439746s;
                                    hashMap.put(b17, f0Var2);
                                    i18 = i17;
                                }
                            }
                        }
                    }
                }
                i18++;
                c17 = 0;
            }
        }
        return hashMap;
    }

    public vr4.l0 e(java.lang.String str, boolean z17) {
        if (!"0".equals(str) && this.f180281c.containsKey(str)) {
            return (vr4.l0) this.f180281c.get(str);
        }
        java.util.Iterator it = this.f180281c.keySet().iterator();
        while (it.hasNext()) {
            vr4.l0 l0Var = (vr4.l0) this.f180281c.get((java.lang.String) it.next());
            java.util.LinkedList linkedList = l0Var.f439776g;
            if (linkedList != null && linkedList.size() != 0) {
                java.util.LinkedList linkedList2 = l0Var.f439776g;
                int size = linkedList2.size();
                java.util.Iterator it6 = linkedList2.iterator();
                int i17 = 0;
                while (it6.hasNext()) {
                    vr4.j jVar = (vr4.j) it6.next();
                    if (!this.f180280b.containsKey(jVar.f439750d)) {
                        break;
                    }
                    vr4.i1 i1Var = (vr4.i1) this.f180280b.get(jVar.f439750d);
                    if (i1Var.f439746s.equals("") && i1Var.f439749v.size() == 0 && (!z17 || i1Var.f439745r == 0)) {
                        i17++;
                    }
                }
                if (i17 > 0 && i17 == size) {
                    return l0Var;
                }
            }
        }
        return null;
    }

    public vr4.l0 f(java.lang.String str) {
        return (vr4.l0) this.f180281c.get(str);
    }

    public com.tencent.mm.plugin.wallet_core.model.FavorPayInfo g(java.lang.String str) {
        com.tencent.mm.plugin.wallet_core.model.FavorPayInfo favorPayInfo = new com.tencent.mm.plugin.wallet_core.model.FavorPayInfo();
        java.lang.Object obj = ((java.util.HashMap) this.f180281c).get(str);
        vr4.j0 j0Var = this.f180279a;
        if (obj == null) {
            favorPayInfo.f179667d = "0";
            if (j0Var != null) {
                favorPayInfo.f179670g = j0Var.f439756g;
            }
            favorPayInfo.f179668e = 0;
            return favorPayInfo;
        }
        favorPayInfo.f179667d = str;
        if (j0Var != null) {
            favorPayInfo.f179670g = j0Var.f439756g;
        }
        favorPayInfo.f179668e = 0;
        java.lang.String[] k17 = k(str);
        if (k17 == null) {
            return favorPayInfo;
        }
        int length = k17.length - 1;
        while (true) {
            if (length < 0) {
                break;
            }
            vr4.i1 i1Var = (vr4.i1) ((java.util.HashMap) this.f180280b).get(k17[length]);
            if (i1Var != null) {
                if (!(i1Var.f439745r != 0)) {
                    break;
                }
                favorPayInfo.f179668e = 1;
                java.util.LinkedList linkedList = i1Var.f439749v;
                if (linkedList != null && linkedList.size() > 0) {
                    favorPayInfo.f179672i = new java.util.LinkedList();
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        favorPayInfo.f179672i.add(x51.j1.b((com.tencent.mm.protobuf.g) it.next()));
                    }
                }
                if (!com.tencent.mm.sdk.platformtools.t8.K0(i1Var.f439746s)) {
                    favorPayInfo.f179669f = i1Var.f439746s;
                    break;
                }
            }
            length--;
        }
        return favorPayInfo;
    }

    public java.util.List i() {
        java.util.ArrayList a17 = ((pg0.a3) i95.n0.c(pg0.a3.class)).fj().a(true);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (int i17 = 0; i17 < a17.size(); i17++) {
            hashMap.put(((com.tencent.mm.plugin.wallet_core.model.Bankcard) a17.get(i17)).field_bankcardType, 0);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = this.f180279a.f439757h;
        if (linkedList2 != null) {
            for (int i18 = 0; i18 < linkedList2.size(); i18++) {
                vr4.i1 i1Var = (vr4.i1) linkedList2.get(i18);
                if (i1Var != null) {
                    if (i1Var.f439745r != 0) {
                        if (hashMap.containsKey(i1Var.f439746s) || com.tencent.mm.sdk.platformtools.t8.K0(i1Var.f439746s)) {
                            linkedList.add(i1Var);
                        }
                    }
                }
                linkedList.add(i1Var);
            }
        }
        return linkedList;
    }
}
