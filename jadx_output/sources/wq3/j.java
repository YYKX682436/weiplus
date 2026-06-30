package wq3;

/* loaded from: classes15.dex */
public class j {

    /* renamed from: b, reason: collision with root package name */
    public wq3.t f448549b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.List f448550c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f448551d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f448552e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f448554g;

    /* renamed from: h, reason: collision with root package name */
    public r45.gm0 f448555h;

    /* renamed from: i, reason: collision with root package name */
    public r45.d5 f448556i;

    /* renamed from: j, reason: collision with root package name */
    public r45.ek5 f448557j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f448558k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f448559l;

    /* renamed from: m, reason: collision with root package name */
    public int f448560m;

    /* renamed from: n, reason: collision with root package name */
    public java.util.Map f448561n;

    /* renamed from: p, reason: collision with root package name */
    public java.util.LinkedList f448563p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.LinkedList f448564q;

    /* renamed from: r, reason: collision with root package name */
    public wq3.l f448565r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.plugin.product.ui.s f448566s;

    /* renamed from: a, reason: collision with root package name */
    public wq3.k f448548a = null;

    /* renamed from: f, reason: collision with root package name */
    public int f448553f = 1;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.Map f448562o = new java.util.HashMap();

    /* renamed from: t, reason: collision with root package name */
    public java.util.Map f448567t = null;

    public static java.lang.String m(java.util.Map map) {
        if (map == null || map.isEmpty()) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(map.entrySet());
        java.util.Collections.sort(arrayList, new wq3.i());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
            sb6.append((java.lang.String) entry.getKey());
            sb6.append(":");
            sb6.append((java.lang.String) entry.getValue());
            sb6.append(";");
        }
        sb6.deleteCharAt(sb6.lastIndexOf(";"));
        return sb6.toString();
    }

    public boolean a() {
        java.util.Map map;
        int i17;
        xq3.c cVar;
        int i18 = this.f448553f;
        if (((i18 <= 0 || this.f448549b == null || i18 > g() || (cVar = this.f448549b.f448599e) == null || cVar.f456072t == null) ? false : true) && (map = this.f448562o) != null) {
            int size = ((java.util.HashMap) map).size();
            int i19 = this.f448560m;
            if (size == i19) {
                if (i19 > 0) {
                    if (this.f448565r != null && (i17 = this.f448553f) > 0 && i17 <= g()) {
                        return true;
                    }
                } else if (i19 == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean b() {
        if (a() && this.f448556i != null) {
            return ((d().f153345b & 1) > 0) || this.f448555h != null;
        }
        return false;
    }

    public void c() {
        this.f448549b = null;
        java.util.List list = this.f448550c;
        if (list != null) {
            list.clear();
            this.f448550c = null;
        }
        this.f448551d = null;
        this.f448552e = null;
        this.f448553f = 1;
        this.f448554g = null;
        this.f448555h = null;
        this.f448557j = null;
        this.f448558k = null;
        this.f448560m = 0;
        this.f448565r = null;
        java.util.Map map = this.f448561n;
        if (map != null) {
            map.clear();
            this.f448561n = null;
        }
        java.util.Map map2 = this.f448562o;
        if (map2 != null) {
            ((java.util.HashMap) map2).clear();
        }
        java.util.LinkedList linkedList = this.f448563p;
        if (linkedList != null) {
            linkedList.clear();
            this.f448563p = null;
        }
        java.util.Map map3 = this.f448567t;
        if (map3 != null) {
            map3.clear();
            this.f448567t = null;
        }
    }

    public com.tencent.mm.plugin.product.ui.s d() {
        if (this.f448566s == null) {
            this.f448566s = new com.tencent.mm.plugin.product.ui.s(0, 0);
        }
        return this.f448566s;
    }

    public java.lang.String e() {
        wq3.l lVar = this.f448565r;
        return (lVar == null || com.tencent.mm.sdk.platformtools.t8.K0(lVar.f456099f)) ? this.f448558k : this.f448565r.f456099f;
    }

    public int f() {
        java.util.Map map = this.f448567t;
        int i17 = 0;
        if (map != null && map.size() > 0) {
            for (java.util.LinkedList linkedList : this.f448567t.values()) {
                if (linkedList != null && linkedList.size() > 0) {
                    java.util.Iterator it = linkedList.iterator();
                    while (it.hasNext()) {
                        i17 += ((r45.we0) it.next()).f389083e;
                    }
                }
            }
        }
        return i17;
    }

    public int g() {
        int i17;
        int i18 = this.f448549b.f448597c;
        wq3.l lVar = this.f448565r;
        return (lVar == null || i18 <= (i17 = lVar.f456101h)) ? i18 : i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r45.ek5 h() {
        /*
            r4 = this;
            r45.ek5 r0 = r4.f448557j
            if (r0 == 0) goto L5
            return r0
        L5:
            wq3.k r0 = r4.f448548a
            if (r0 != 0) goto L13
            vq3.e r0 = vq3.e.wi()
            wq3.k r0 = r0.Bi()
            r4.f448548a = r0
        L13:
            wq3.k r0 = r4.f448548a
            java.util.List r0 = r0.f448568a
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2b
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r0.size()
            if (r3 < r2) goto L2b
            r3 = 0
            java.lang.Object r0 = r0.get(r3)
            java.lang.String r0 = (java.lang.String) r0
            goto L2c
        L2b:
            r0 = r1
        L2c:
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r0)
            if (r3 != 0) goto L3e
            r45.ek5 r1 = new r45.ek5
            r1.<init>()
            r4.f448557j = r1
            r1.f373583e = r0
            r1.f373582d = r2
            return r1
        L3e:
            r45.d5 r0 = r4.f448556i
            if (r0 == 0) goto L57
            java.lang.String r3 = r0.f372122h
            boolean r3 = com.tencent.mm.sdk.platformtools.t8.K0(r3)
            if (r3 != 0) goto L57
            r45.ek5 r1 = new r45.ek5
            r1.<init>()
            r4.f448557j = r1
            java.lang.String r0 = r0.f372122h
            r1.f373583e = r0
            r1.f373582d = r2
        L57:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wq3.j.h():r45.ek5");
    }

    public java.util.LinkedList i() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.ku5 ku5Var = new r45.ku5();
        ku5Var.f378968f = this.f448553f;
        wq3.t tVar = this.f448549b;
        ku5Var.f378966d = tVar.f448595a;
        ku5Var.f378969g = tVar.f448603i;
        ku5Var.f378967e = this.f448554g;
        linkedList.add(ku5Var);
        return linkedList;
    }

    public java.lang.String j() {
        xq3.n nVar = this.f448549b.f448600f;
        if (nVar != null) {
            return nVar.f456108g;
        }
        return null;
    }

    public java.lang.String k() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f448549b.a())) {
            return null;
        }
        return com.tencent.mm.plugin.product.ui.o.m(this.f448549b.a());
    }

    public java.lang.String l() {
        xq3.k kVar;
        wq3.t tVar = this.f448549b;
        xq3.c cVar = tVar.f448599e;
        return (cVar == null || (kVar = cVar.f456076x) == null) ? !com.tencent.mm.sdk.platformtools.t8.K0(tVar.f448603i) ? this.f448549b.f448603i : this.f448552e : kVar.f456096e;
    }

    public r45.a76 n() {
        r45.a76 a76Var = new r45.a76();
        a76Var.f369808m = this.f448551d;
        a76Var.f369802d = 1;
        a76Var.f369803e = new java.util.LinkedList();
        r45.nd5 nd5Var = new r45.nd5();
        nd5Var.f381281f = this.f448553f;
        wq3.t tVar = this.f448549b;
        nd5Var.f381284i = tVar.f448595a;
        xq3.c cVar = tVar.f448599e;
        nd5Var.f381288p = cVar.f456059d;
        wq3.l lVar = this.f448565r;
        if (lVar != null) {
            nd5Var.f381282g = lVar.f448569i;
        } else {
            nd5Var.f381282g = cVar.f456062g;
        }
        nd5Var.f381285m = tVar.f448603i;
        nd5Var.f381286n = this.f448554g;
        nd5Var.f381287o = tVar.f448596b;
        nd5Var.f381279d = this.f448560m;
        nd5Var.f381280e = new java.util.LinkedList();
        java.util.Map map = this.f448562o;
        for (java.lang.String str : ((java.util.HashMap) map).keySet()) {
            java.lang.String str2 = (java.lang.String) ((java.util.HashMap) map).get(str);
            r45.c44 c44Var = new r45.c44();
            c44Var.f371268d = str;
            c44Var.f371269e = str2;
            nd5Var.f381280e.add(c44Var);
        }
        nd5Var.f381294v = new java.util.LinkedList();
        nd5Var.f381293u = 0;
        java.util.Map map2 = this.f448567t;
        if (map2 != null && ((java.util.HashMap) map2).size() > 0) {
            for (java.util.LinkedList linkedList : ((java.util.HashMap) this.f448567t).values()) {
                nd5Var.f381294v.addAll(linkedList);
                nd5Var.f381293u += linkedList.size();
            }
        }
        a76Var.f369803e.add(nd5Var);
        a76Var.f369806h = new java.util.LinkedList();
        a76Var.f369807i = 1;
        r45.ek5 h17 = h();
        this.f448557j = h17;
        if (h17 != null) {
            a76Var.f369806h.add(h17);
        } else {
            r45.ek5 ek5Var = new r45.ek5();
            this.f448557j = ek5Var;
            ek5Var.f373582d = 0;
            a76Var.f369806h.add(ek5Var);
        }
        a76Var.f369805g = this.f448556i;
        a76Var.f369804f = this.f448555h;
        return a76Var;
    }

    public int o() {
        int i17;
        int i18;
        r45.gm0 gm0Var;
        int i19 = 0;
        if (!((d().f153345b & 1) > 0) && (gm0Var = this.f448555h) != null) {
            i19 = 0 + gm0Var.f375362e;
        }
        wq3.l lVar = this.f448565r;
        if (lVar != null) {
            i17 = lVar.f448569i;
            i18 = this.f448553f;
        } else {
            i17 = this.f448549b.f448599e.f456062g;
            i18 = this.f448553f;
        }
        return (i19 + (i17 * i18)) - f();
    }

    public java.lang.String p() {
        ot0.q qVar = new ot0.q();
        qVar.f348654f = this.f448549b.f448599e.f456059d;
        qVar.f348658g = q();
        qVar.f348666i = 13;
        qVar.f348674k = l();
        qVar.f348734z = this.f448549b.a();
        wq3.t tVar = this.f448549b;
        qVar.f348667i0 = tVar.f448596b;
        qVar.f348671j0 = r(tVar);
        return ot0.q.u(qVar, null, null);
    }

    public java.lang.String q() {
        return wq3.h.b(r0.f456063h, this.f448549b.f448599e.f456075w);
    }

    public java.lang.String r(wq3.t tVar) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("<mallProductInfo><type>");
        sb6.append(tVar.f448596b);
        sb6.append("</type><id>");
        sb6.append(tVar.f448595a);
        sb6.append("</id><version>");
        sb6.append(tVar.f448599e.f456073u);
        sb6.append("</version><name>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(tVar.f448599e.f456059d));
        sb6.append("</name><highPrice>");
        sb6.append(tVar.f448599e.f456062g);
        sb6.append("</highPrice><lowPrice>");
        sb6.append(tVar.f448599e.f456063h);
        sb6.append("</lowPrice><originPrice>");
        sb6.append(tVar.f448599e.f456061f);
        sb6.append("</originPrice><sourceUrl>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(this.f448549b.f448603i));
        sb6.append("</sourceUrl>");
        if (tVar.f448599e.f456064i != null) {
            sb6.append("<imgCount>");
            sb6.append(tVar.f448599e.f456064i.size());
            sb6.append("</imgCount><imgList>");
            java.util.Iterator it = tVar.f448599e.f456064i.iterator();
            while (it.hasNext()) {
                java.lang.String str = (java.lang.String) it.next();
                sb6.append("<imgUrl>");
                sb6.append(com.tencent.mm.sdk.platformtools.t8.p(str));
                sb6.append("</imgUrl>");
            }
            sb6.append("</imgList>");
        }
        sb6.append("<shareInfo><shareUrl>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(l()));
        sb6.append("</shareUrl><shareThumbUrl>");
        sb6.append(com.tencent.mm.sdk.platformtools.t8.p(tVar.a()));
        sb6.append("</shareThumbUrl></shareInfo>");
        if (this.f448549b.f448600f != null) {
            sb6.append("<sellerInfo><appID>");
            sb6.append(tVar.f448600f.f456105d);
            sb6.append("</appID><appName>");
            sb6.append(tVar.f448600f.f456106e);
            sb6.append("</appName><usrName>");
            sb6.append(tVar.f448600f.f456108g);
            sb6.append("</usrName></sellerInfo>");
        }
        sb6.append("</mallProductInfo>");
        return sb6.toString();
    }

    public void s(android.content.Intent intent) {
        r45.d5 d5Var = new r45.d5();
        java.lang.String stringExtra = intent.getStringExtra("userName");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (stringExtra == null) {
            stringExtra = "";
        }
        d5Var.f372122h = stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("telNumber");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        d5Var.f372123i = stringExtra2;
        java.lang.String stringExtra3 = intent.getStringExtra("addressPostalCode");
        if (stringExtra3 == null) {
            stringExtra3 = "";
        }
        d5Var.f372124m = stringExtra3;
        java.lang.String stringExtra4 = intent.getStringExtra("proviceFirstStageName");
        if (stringExtra4 == null) {
            stringExtra4 = "";
        }
        d5Var.f372119e = stringExtra4;
        java.lang.String stringExtra5 = intent.getStringExtra("addressCitySecondStageName");
        if (stringExtra5 == null) {
            stringExtra5 = "";
        }
        d5Var.f372120f = stringExtra5;
        java.lang.String stringExtra6 = intent.getStringExtra("addressCountiesThirdStageName");
        if (stringExtra6 == null) {
            stringExtra6 = "";
        }
        d5Var.f372118d = stringExtra6;
        java.lang.String stringExtra7 = intent.getStringExtra("addressDetailInfo");
        d5Var.f372121g = stringExtra7 != null ? stringExtra7 : "";
        if (com.tencent.mm.sdk.platformtools.t8.K0(d5Var.f372122h) || com.tencent.mm.sdk.platformtools.t8.K0(d5Var.f372123i)) {
            return;
        }
        this.f448556i = d5Var;
    }

    public void t(int i17) {
        java.util.LinkedList linkedList = this.f448563p;
        if (linkedList != null && i17 < linkedList.size() && i17 >= 0) {
            this.f448555h = (r45.gm0) this.f448563p.get(i17);
        }
    }

    public void u(wq3.t tVar, java.util.List list) {
        xq3.j jVar;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        c();
        this.f448549b = tVar;
        this.f448550c = list;
        if (com.tencent.mm.sdk.platformtools.t8.K0(tVar.f448603i)) {
            this.f448549b.f448603i = this.f448552e;
        }
        java.util.LinkedList linkedList3 = this.f448549b.f448601g;
        this.f448561n = new java.util.HashMap();
        if (linkedList3 != null && linkedList3.size() > 0) {
            int size = linkedList3.size();
            for (int i17 = 0; i17 < size; i17++) {
                xq3.l lVar = (xq3.l) linkedList3.get(i17);
                java.lang.String[] split = lVar.f456097d.split(";");
                if (split != null && split.length > 0) {
                    int length = split.length;
                    int i18 = (-1) >>> (32 - length);
                    for (int i19 = 1; i19 <= i18; i19++) {
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                        for (int i27 = 0; i27 < length; i27++) {
                            if (((i19 << (31 - i27)) >> 31) == -1) {
                                sb6.append(split[i27]);
                                sb6.append(";");
                            }
                        }
                        sb6.deleteCharAt(sb6.lastIndexOf(";"));
                        wq3.l lVar2 = (wq3.l) ((java.util.HashMap) this.f448561n).get(sb6.toString());
                        if (lVar2 != null) {
                            int i28 = lVar2.f448569i;
                            int i29 = lVar.f456098e;
                            if (i28 < i29) {
                                lVar2.f448569i = i29;
                            }
                            if (lVar2.f448570m > i29) {
                                lVar2.f448570m = i29;
                            }
                            lVar2.f456101h += lVar.f456101h;
                        } else {
                            wq3.l lVar3 = new wq3.l();
                            int i37 = lVar.f456098e;
                            lVar3.f448569i = i37;
                            lVar3.f448570m = i37;
                            lVar3.f456101h = lVar.f456101h;
                            lVar3.f456100g = lVar.f456100g;
                            lVar3.f456099f = lVar.f456099f;
                            ((java.util.HashMap) this.f448561n).put(sb6.toString(), lVar3);
                        }
                    }
                }
            }
            v();
        }
        xq3.c cVar = this.f448549b.f448599e;
        if (cVar != null && (linkedList2 = cVar.f456072t) != null) {
            this.f448560m = linkedList2.size();
        }
        xq3.c cVar2 = this.f448549b.f448599e;
        if (cVar2 != null && (linkedList = cVar2.f456064i) != null && linkedList.size() > 0) {
            this.f448558k = (java.lang.String) this.f448549b.f448599e.f456064i.get(0);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f448549b.a())) {
            y60.f fVar = (y60.f) i95.n0.c(y60.f.class);
            com.tencent.mm.plugin.product.ui.o oVar = new com.tencent.mm.plugin.product.ui.o(this.f448549b.a());
            ((x60.e) fVar).getClass();
            x51.w0.d(oVar);
            k();
        }
        wq3.t tVar2 = this.f448549b;
        xq3.f fVar2 = tVar2.f448602h;
        int i38 = (fVar2 == null || (jVar = fVar2.f456081d) == null) ? 0 : jVar.f456092d;
        xq3.n nVar = tVar2.f448600f;
        this.f448566s = new com.tencent.mm.plugin.product.ui.s(i38, nVar != null ? nVar.f456109h : 0);
    }

    public void v() {
        java.util.Map map = this.f448562o;
        if (map == null) {
            return;
        }
        java.util.Iterator it = this.f448549b.f448599e.f456072t.iterator();
        while (it.hasNext()) {
            xq3.m mVar = (xq3.m) it.next();
            java.util.Iterator it6 = mVar.f456104f.iterator();
            while (it6.hasNext()) {
                xq3.h hVar = (xq3.h) it6.next();
                java.lang.String str = mVar.f456102d;
                java.lang.String str2 = hVar.f456087d;
                boolean z17 = false;
                if (map != null && this.f448561n != null) {
                    java.util.HashMap hashMap = (java.util.HashMap) map;
                    if (hashMap.containsKey(str)) {
                        java.lang.String str3 = (java.lang.String) hashMap.get(str);
                        hashMap.put(str, str2);
                        java.lang.String m17 = m(map);
                        hashMap.put(str, str3);
                        wq3.l lVar = (wq3.l) this.f448561n.get(m17);
                        if (lVar != null) {
                            if (lVar.f456101h <= 0) {
                            }
                            z17 = true;
                        }
                    } else {
                        hashMap.put(str, str2);
                        java.lang.String m18 = m(map);
                        hashMap.remove(str);
                        wq3.l lVar2 = (wq3.l) this.f448561n.get(m18);
                        if (lVar2 != null) {
                            if (lVar2.f456101h <= 0) {
                            }
                            z17 = true;
                        }
                    }
                }
                hVar.f456089f = z17;
            }
        }
    }
}
