package ju1;

/* loaded from: classes9.dex */
public final class n0 extends ju1.k {

    /* renamed from: n, reason: collision with root package name */
    public int f301770n;

    /* renamed from: o, reason: collision with root package name */
    public r45.qd3 f301771o;

    /* renamed from: i, reason: collision with root package name */
    public final int f301768i = 10;

    /* renamed from: m, reason: collision with root package name */
    public final int f301769m = 5;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f301772p = new java.util.ArrayList();

    public n0() {
        this.f301752g.postValue(ju1.o0.f301775e);
    }

    @Override // ju1.k
    public void N6(im5.b keeper) {
        kotlin.jvm.internal.o.g(keeper, "keeper");
        androidx.lifecycle.j0 j0Var = this.f301752g;
        ju1.o0 o0Var = (ju1.o0) j0Var.getValue();
        ju1.o0 o0Var2 = ju1.o0.f301776f;
        if (o0Var == o0Var2 || o0Var == ju1.o0.f301777g) {
            return;
        }
        j0Var.postValue(o0Var2);
        int i17 = this.f301770n;
        java.util.ArrayList arrayList = this.f301772p;
        if (i17 <= 0) {
            i17 = arrayList.size() > 0 ? arrayList.size() + 0 : 0;
        }
        int i18 = this.f301768i;
        if (i17 < i18) {
            i17 = i18;
        }
        int i19 = i17 + this.f301769m;
        arrayList.clear();
        cu1.b bVar = new cu1.b(0L, i19, 1);
        bVar.f70649i = true;
        pq5.g l17 = bVar.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        pm0.v.T(l17, new ju1.k0(this)).f(keeper);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    @Override // ju1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O6() {
        /*
            r5 = this;
            gm0.b0 r0 = gm0.j1.u()
            com.tencent.mm.storage.n3 r0 = r0.c()
            com.tencent.mm.storage.u3 r1 = com.tencent.mm.storage.u3.USERINFO_CARD_COUPON_HISTORY_LIST_STRING_SYNC
            java.lang.String r2 = ""
            java.lang.Object r0 = r0.m(r1, r2)
            java.lang.String r0 = (java.lang.String) r0
            r1 = 0
            if (r0 == 0) goto L1e
            int r3 = r0.length()
            if (r3 != 0) goto L1c
            goto L1e
        L1c:
            r3 = r1
            goto L1f
        L1e:
            r3 = 1
        L1f:
            if (r3 == 0) goto L22
            goto L41
        L22:
            r45.qd3 r3 = new r45.qd3
            r3.<init>()
            java.nio.charset.Charset r4 = r26.c.f368867c
            byte[] r0 = r0.getBytes(r4)
            java.lang.String r4 = "getBytes(...)"
            kotlin.jvm.internal.o.f(r0, r4)
            r3.parseFrom(r0)     // Catch: java.lang.Exception -> L36
            goto L42
        L36:
            r0 = move-exception
            java.lang.String r3 = "safeParser"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            com.tencent.mm.sdk.platformtools.Log.a(r3, r2, r0)
        L41:
            r3 = 0
        L42:
            if (r3 == 0) goto L63
            androidx.lifecycle.j0 r0 = r5.f301749d
            java.util.LinkedList r2 = r3.f383855i
            r0.postValue(r2)
            r45.k90 r0 = r3.f383856m
            java.lang.String r2 = "items_list"
            kotlin.jvm.internal.o.f(r0, r2)
            java.util.ArrayList r0 = r5.S6(r0, r1)
            if (r0 == 0) goto L5c
            int r1 = r0.size()
        L5c:
            r5.f301770n = r1
            androidx.lifecycle.j0 r1 = r5.f301751f
            r1.postValue(r0)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ju1.n0.O6():void");
    }

    @Override // ju1.k
    public void P6(ju1.a cardDataModel) {
        ju1.o0 o0Var;
        kotlin.jvm.internal.o.g(cardDataModel, "cardDataModel");
        r45.tt ttVar = cardDataModel.f301690c;
        if (ttVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.HistoryCardListViewModel", "do delete card: %s", ttVar.f386765d);
            androidx.lifecycle.j0 j0Var = this.f301752g;
            ju1.o0 o0Var2 = (ju1.o0) j0Var.getValue();
            if (o0Var2 == ju1.o0.f301776f || o0Var2 == (o0Var = ju1.o0.f301777g)) {
                return;
            }
            this.f301753h.postValue(java.lang.Boolean.TRUE);
            j0Var.postValue(o0Var);
            java.lang.String user_card_id = ttVar.f386765d;
            kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
            new cu1.e(user_card_id).l().h(new ju1.l0(this, o0Var2, cardDataModel));
        }
    }

    @Override // ju1.k
    public void Q6(im5.b keeper) {
        kotlin.jvm.internal.o.g(keeper, "keeper");
        androidx.lifecycle.j0 j0Var = this.f301752g;
        ju1.o0 o0Var = (ju1.o0) j0Var.getValue();
        ju1.o0 o0Var2 = ju1.o0.f301776f;
        if (o0Var == o0Var2 || o0Var == ju1.o0.f301777g || o0Var == ju1.o0.f301779i) {
            return;
        }
        j0Var.postValue(o0Var2);
        int i17 = this.f301770n;
        long j17 = 0;
        int i18 = this.f301768i;
        if (i17 > 0) {
            if (i17 >= i18) {
                i18 = i17;
            }
            i18 += i17;
        } else {
            r45.qd3 qd3Var = this.f301771o;
            if (qd3Var != null) {
                j17 = qd3Var.f383853g;
            }
        }
        cu1.b bVar = new cu1.b(j17, i18, 1);
        bVar.f70649i = true;
        pq5.g l17 = bVar.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        pm0.v.T(l17, new ju1.m0(this)).f(keeper);
    }

    @Override // ju1.k
    public void R6() {
        r45.qd3 qd3Var = this.f301771o;
        if (qd3Var != null) {
            r45.k90 k90Var = new r45.k90();
            java.util.ArrayList arrayList = this.f301772p;
            if (!arrayList.isEmpty()) {
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r45.tt ttVar = ((ju1.a) it.next()).f301690c;
                    if (ttVar != null) {
                        k90Var.f378510e.add(ttVar);
                    }
                }
            }
            qd3Var.f383856m = k90Var;
            pm0.v.K(null, new au1.c(qd3Var));
        }
    }

    public final java.util.ArrayList S6(r45.k90 k90Var, boolean z17) {
        if (k90Var == null) {
            return null;
        }
        java.util.ArrayList arrayList = !z17 ? new java.util.ArrayList() : this.f301772p;
        java.util.Iterator it = k90Var.f378510e.iterator();
        while (it.hasNext()) {
            r45.tt ttVar = (r45.tt) it.next();
            ju1.a aVar = new ju1.a();
            aVar.f301690c = ttVar;
            if (ttVar.f386772n == 1) {
                aVar.f301688a = 5;
            } else {
                aVar.f301688a = 3;
            }
            arrayList.add(aVar);
        }
        return arrayList;
    }
}
