package wt1;

/* loaded from: classes15.dex */
public class c0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f449259d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f449260e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.ArrayList f449261f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f449262g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f449263h;

    public c0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f449260e = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f449261f = arrayList2;
        this.f449262g = new com.tencent.mm.sdk.platformtools.n3();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        this.f449263h = linkedHashMap;
        gm0.j1.n().f273288b.a(1078, this);
        arrayList.clear();
        arrayList2.clear();
        linkedHashMap.clear();
    }

    public final void a(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "cancelUnmark()");
        java.util.ArrayList arrayList = this.f449261f;
        if (arrayList.contains(str)) {
            arrayList.remove(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is " + str);
        }
        java.util.HashMap hashMap = this.f449263h;
        if (hashMap.containsKey(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is " + str);
            java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(str);
            hashMap.remove(str);
            this.f449262g.removeCallbacks(runnable);
        }
    }

    public void b(java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "doMarkCode()");
        a(str);
        java.util.ArrayList arrayList = this.f449260e;
        if (!arrayList.contains(str)) {
            arrayList.add(str);
        }
        c(str, i17, i18, i19);
    }

    public final void c(java.lang.String str, int i17, int i18, int i19) {
        if (android.text.TextUtils.isEmpty(str)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "card_id is empty, don't call NetSceneMarkShareCard cgi");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "doMarkNetscene()");
        gm0.j1.n().f273288b.g(new fu1.d(str, i17, i18, i19));
    }

    public void d(java.lang.String str, int i17, int i18, int i19) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "doUnmarkCode()");
        a(str);
        this.f449261f.add(str);
        wt1.z zVar = new wt1.z(this, str, i17, i18, i19);
        this.f449262g.postDelayed(zVar, com.tencent.mm.sdk.platformtools.t8.P(((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).a().b(1, "ShareCard", "UnMarkDelay"), 0) * 1000);
        this.f449263h.put(str, zVar);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "add unmark card mask id in mId2Runner. card is " + str + " system.time:" + java.lang.System.currentTimeMillis());
    }

    public final void e(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "removeId()");
        java.util.ArrayList arrayList = this.f449260e;
        boolean contains = arrayList.contains(str);
        java.util.ArrayList arrayList2 = this.f449261f;
        if (contains && !arrayList2.contains(str)) {
            arrayList.remove(str);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "remove mark card id in mMarkList. card is " + str);
        }
        if (arrayList.contains(str) || !arrayList2.contains(str)) {
            return;
        }
        arrayList2.remove(str);
        java.util.HashMap hashMap = this.f449263h;
        java.lang.Runnable runnable = (java.lang.Runnable) hashMap.get(str);
        hashMap.remove(str);
        this.f449262g.removeCallbacks(runnable);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "remove unmark card id in mUnMarkList. card is " + str);
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "remove unmark card mask id in mId2Runner. card is " + str);
    }

    public void f(wt1.a0 a0Var) {
        wt1.a0 a0Var2;
        if (this.f449259d == null || a0Var == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f449259d.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f449259d.get(i17);
            if (weakReference != null && (a0Var2 = (wt1.a0) weakReference.get()) != null && a0Var2.equals(a0Var)) {
                this.f449259d.remove(weakReference);
                return;
            }
        }
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        wt1.a0 a0Var;
        wt1.a0 a0Var2;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, errType = " + i17 + " errCode = " + i18);
        int i19 = 0;
        java.util.ArrayList arrayList = this.f449261f;
        java.util.ArrayList arrayList2 = this.f449260e;
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof fu1.d) {
                fu1.d dVar = (fu1.d) m1Var;
                com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "onSceneEnd, markFail original_card_id = " + dVar.f266832n);
                com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "onMarkFail()");
                java.util.List list = this.f449259d;
                java.lang.String str2 = dVar.f266832n;
                if (list != null) {
                    if (!arrayList2.contains(str2) || arrayList.contains(str2)) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "markSuccess the card is not in mark list");
                    } else {
                        while (i19 < ((java.util.ArrayList) this.f449259d).size()) {
                            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449259d).get(i19);
                            if (weakReference != null && (a0Var = (wt1.a0) weakReference.get()) != null) {
                                a0Var.A1(str2, null, str);
                            }
                            i19++;
                        }
                    }
                }
                e(str2);
                return;
            }
            return;
        }
        if (m1Var instanceof fu1.d) {
            fu1.d dVar2 = (fu1.d) m1Var;
            wt1.b0 b0Var = new wt1.b0();
            b0Var.f449249a = dVar2.f266827f;
            b0Var.f449250b = dVar2.f266828g;
            b0Var.f449251c = dVar2.f266829h;
            b0Var.f449252d = dVar2.f266830i;
            b0Var.f449253e = dVar2.f266831m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSceneEnd, markSuccess original_card_id = ");
            java.lang.String str3 = dVar2.f266832n;
            sb6.append(str3);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", sb6.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "mark_user:" + b0Var.f449249a + " mark_succ:" + b0Var.f449250b + " mark_card_id:" + b0Var.f449251c + " expire_time:" + b0Var.f449252d + " pay_qrcode_wording:" + b0Var.f449253e);
            com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "markSuccess()");
            if (this.f449259d != null) {
                if (arrayList2.contains(str3) || arrayList.contains(str3)) {
                    while (i19 < ((java.util.ArrayList) this.f449259d).size()) {
                        java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449259d).get(i19);
                        if (weakReference2 != null && (a0Var2 = (wt1.a0) weakReference2.get()) != null) {
                            if (arrayList2.contains(str3)) {
                                a0Var2.C5(str3, b0Var);
                            } else if (arrayList.contains(str3)) {
                                a0Var2.p4(str3, b0Var);
                            }
                        }
                        i19++;
                    }
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.CardMarkCodeMgr", "markSuccess the card id is not in mark list and un mark list.");
                }
            }
            e(str3);
        }
    }
}
