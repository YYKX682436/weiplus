package wt1;

/* loaded from: classes15.dex */
public class i implements com.tencent.mm.modelbase.u0, wt1.e0, tt1.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.ref.WeakReference f449287d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f449288e = new java.util.ArrayList();

    /* renamed from: f, reason: collision with root package name */
    public java.util.HashMap f449289f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f449290g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.HashMap f449291h = new java.util.HashMap();

    /* renamed from: i, reason: collision with root package name */
    public tt1.j f449292i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f449293m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f449294n;

    @Override // wt1.e0
    public void L1(xt1.k kVar) {
        java.lang.String str;
        java.lang.String str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "onChange()");
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "card msg card id is " + kVar.field_card_id);
        if (this.f449292i == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumedMgr", "onChange(), do nothing, mCardInfo == null");
            a();
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "card msg card id is " + kVar.field_card_id);
        if (this.f449292i.B() && (str2 = kVar.field_card_id) != null && str2.equals(this.f449292i.g()) && kVar.H1 == 3) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "it is card type, don't do NetSceneGetShareCardConsumedInfo! finish UI");
            a();
            return;
        }
        if (!this.f449292i.i()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "it is not card type, don't update share card data!");
            a();
            return;
        }
        if (kVar.H1 == 3 || !((str = kVar.field_card_id) == null || !str.equals(this.f449292i.g()) || android.text.TextUtils.isEmpty(kVar.field_consumed_box_id))) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "consumed share card msg,  update share card data!");
            java.lang.String str3 = kVar.field_card_id;
            if (str3 != null && str3.equals(this.f449292i.g())) {
                com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo y07 = xt1.t0.nj().y0(this.f449292i.g());
                if (y07 != null && y07.i0() != null) {
                    int i17 = this.f449292i.i0().f385181d;
                    int i18 = y07.i0().f385181d;
                    int i19 = ((com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) this.f449292i).field_status;
                    if (y07.i0().f385181d != i17) {
                        c();
                    } else if (i17 != 1) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "share card oldState status is " + i17);
                        r45.rt i07 = this.f449292i.i0();
                        i07.f385181d = 1;
                        tt1.j jVar = this.f449292i;
                        ((com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo) jVar).field_status = 1;
                        jVar.G(i07);
                        lu1.a0.M(this.f449292i);
                    }
                }
            } else if (kVar.field_card_id != null) {
                com.tencent.mm.plugin.card.sharecard.model.ShareCardInfo y08 = xt1.t0.nj().y0(kVar.field_card_id);
                if (y08 == null || y08.i0() == null) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.CardConsumedMgr", "tempCard is null");
                } else {
                    int i27 = y08.i0().f385181d;
                    if (y08.i0().f385181d != 1) {
                        r45.rt i08 = y08.i0();
                        i08.f385181d = 1;
                        y08.field_status = 1;
                        y08.G(i08);
                        lu1.a0.M(y08);
                    }
                }
            }
            b(this.f449292i);
            java.util.HashMap hashMap = this.f449290g;
            java.lang.Boolean bool = (java.lang.Boolean) hashMap.get(this.f449292i.g());
            if (bool == null || !bool.booleanValue()) {
                android.content.Context context = (android.content.Context) this.f449287d.get();
                com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "consume share card, card id is " + this.f449292i.g());
                eu1.f.p(context, this.f449292i);
                hashMap.put(this.f449292i.g(), java.lang.Boolean.TRUE);
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                com.tencent.mars.smc.IDKey iDKey = new com.tencent.mars.smc.IDKey();
                iDKey.SetID(281);
                iDKey.SetKey(30);
                iDKey.SetValue(1L);
                com.tencent.mars.smc.IDKey iDKey2 = new com.tencent.mars.smc.IDKey();
                iDKey2.SetID(281);
                iDKey2.SetKey(31);
                iDKey2.SetValue((int) (currentTimeMillis2 - currentTimeMillis));
                arrayList.add(iDKey);
                arrayList.add(iDKey2);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.j(arrayList, true, false);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "consumed:" + bool.booleanValue());
            }
            d();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0084  */
    @Override // tt1.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void W0() {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wt1.i.W0():void");
    }

    public final void a() {
        wt1.h hVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "doFinishUI()");
        if (this.f449288e == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f449288e).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449288e).get(i17);
            if (weakReference != null && (hVar = (wt1.h) weakReference.get()) != null) {
                hVar.x4();
            }
        }
    }

    public final void b(tt1.j jVar) {
        wt1.h hVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "doUpdateCardInfo()");
        if (this.f449288e == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f449288e).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449288e).get(i17);
            if (weakReference != null && (hVar = (wt1.h) weakReference.get()) != null) {
                hVar.y2(jVar);
            }
        }
    }

    public final void c() {
        wt1.h hVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "doVibrate()");
        if (this.f449288e == null) {
            return;
        }
        for (int i17 = 0; i17 < ((java.util.ArrayList) this.f449288e).size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449288e).get(i17);
            if (weakReference != null && (hVar = (wt1.h) weakReference.get()) != null) {
                hVar.x3();
            }
        }
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "needDoConsumedInfo(), need to do NetSceneGetShareCardConsumedInfo. ");
        synchronized (this) {
            if (this.f449293m) {
                com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "isDoingConsumedInfo is true, is doing NetSceneGetShareCardConsumedInfo. return");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "isDoingConsumedInfo is false, do NetSceneGetShareCardConsumedInfo. ");
            this.f449293m = true;
            gm0.j1.n().f273288b.g(new fu1.c(this.f449292i.g(), 20, "", ""));
        }
    }

    public void e(wt1.h hVar, boolean z17) {
        if (this.f449289f == null) {
            this.f449289f = new java.util.HashMap();
        }
        this.f449289f.put(hVar, java.lang.Boolean.valueOf(z17));
    }

    public void f(wt1.h hVar) {
        wt1.h hVar2;
        if (this.f449288e == null || hVar == null) {
            return;
        }
        for (int i17 = 0; i17 < this.f449288e.size(); i17++) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f449288e.get(i17);
            if (weakReference != null && (hVar2 = (wt1.h) weakReference.get()) != null && hVar2.equals(hVar)) {
                this.f449288e.remove(weakReference);
                return;
            }
        }
    }

    @Override // wt1.e0
    public void onChange() {
        c();
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "onSceneEnd, errType = " + i17 + " errCode = " + i18);
        if (i17 != 0 || i18 != 0) {
            if (m1Var instanceof fu1.c) {
                this.f449293m = false;
                com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumedMgr", "do NetSceneGetShareCardConsumedInfo failed! finish UI!");
                a();
                return;
            }
            return;
        }
        if (m1Var instanceof fu1.c) {
            fu1.c cVar = (fu1.c) m1Var;
            if (android.text.TextUtils.isEmpty(cVar.f266823f)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumedMgr", "consumed return json is empty!");
            } else {
                java.lang.String str2 = cVar.f266823f;
                com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "startConsumedSuccUI()");
                if (this.f449288e != null) {
                    boolean z17 = false;
                    for (int i19 = 0; i19 < ((java.util.ArrayList) this.f449288e).size(); i19++) {
                        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.ArrayList) this.f449288e).get(i19);
                        if (weakReference != null) {
                            wt1.h hVar = (wt1.h) weakReference.get();
                            java.lang.Boolean bool = (java.lang.Boolean) this.f449289f.get(hVar);
                            if (hVar != null && bool != null && bool.booleanValue()) {
                                hVar.t5(str2);
                                z17 = true;
                            }
                        }
                    }
                    java.lang.Boolean bool2 = (java.lang.Boolean) this.f449290g.get(this.f449292i.g());
                    if (z17) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "onStartConsumedSuccUI is handled!");
                        this.f449294n = "";
                    } else if (bool2 != null && bool2.booleanValue()) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.CardConsumedMgr", "add to launch pending list!");
                        this.f449294n = str2;
                        this.f449291h.put(this.f449292i.g(), java.lang.Boolean.TRUE);
                    }
                }
            }
            this.f449293m = false;
            com.tencent.mars.xlog.Log.e("MicroMsg.CardConsumedMgr", "do NetSceneGetShareCardConsumedInfo ok! finish UI!");
            a();
        }
    }
}
