package ju1;

/* loaded from: classes9.dex */
public final class j0 extends ju1.k {

    /* renamed from: n, reason: collision with root package name */
    public int f301744n;

    /* renamed from: o, reason: collision with root package name */
    public r45.sd3 f301745o;

    /* renamed from: i, reason: collision with root package name */
    public final int f301742i = 10;

    /* renamed from: m, reason: collision with root package name */
    public final int f301743m = 5;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f301746p = new java.util.ArrayList();

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f301747q = new java.util.ArrayList();

    public j0() {
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
        int i17 = this.f301744n;
        java.util.ArrayList arrayList = this.f301747q;
        java.util.ArrayList arrayList2 = this.f301746p;
        if (i17 <= 0) {
            i17 = arrayList2.size() > 0 ? arrayList2.size() + 0 : 0;
            if (arrayList.size() > 0) {
                i17 += arrayList.size();
            }
        }
        int i18 = this.f301742i;
        if (i17 < i18) {
            i17 = i18;
        }
        int i19 = i17 + this.f301743m;
        arrayList2.clear();
        arrayList.clear();
        cu1.c cVar = new cu1.c(0L, i19, 1);
        cVar.f70649i = true;
        pq5.g l17 = cVar.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        pm0.v.T(l17, new ju1.g0(this)).f(keeper);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
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
            com.tencent.mm.storage.u3 r1 = com.tencent.mm.storage.u3.USERINFO_CARD_COUPON_GIFT_LIST_STRING_SYNC
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
            r45.sd3 r3 = new r45.sd3
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
            if (r3 != 0) goto L45
            return
        L45:
            androidx.lifecycle.j0 r0 = r5.f301749d
            java.util.LinkedList r2 = r3.f385640i
            r0.postValue(r2)
            java.util.ArrayList r0 = r5.S6(r3, r1)
            if (r0 == 0) goto L56
            int r1 = r0.size()
        L56:
            r5.f301744n = r1
            androidx.lifecycle.j0 r1 = r5.f301751f
            r1.postValue(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ju1.j0.O6():void");
    }

    @Override // ju1.k
    public void P6(ju1.a cardDataModel) {
        ju1.o0 o0Var;
        kotlin.jvm.internal.o.g(cardDataModel, "cardDataModel");
        r45.tt ttVar = cardDataModel.f301690c;
        if (ttVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CouponAndGiftCardViewModel", "do delete card: %s", ttVar.f386765d);
            androidx.lifecycle.j0 j0Var = this.f301752g;
            ju1.o0 o0Var2 = (ju1.o0) j0Var.getValue();
            if (o0Var2 == ju1.o0.f301776f || o0Var2 == (o0Var = ju1.o0.f301777g)) {
                return;
            }
            this.f301753h.postValue(java.lang.Boolean.TRUE);
            j0Var.postValue(o0Var);
            java.lang.String user_card_id = ttVar.f386765d;
            kotlin.jvm.internal.o.f(user_card_id, "user_card_id");
            new cu1.a(user_card_id).l().h(new ju1.h0(this, o0Var2, cardDataModel));
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(19747, 3, 4);
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
        int i17 = this.f301744n;
        long j17 = 0;
        int i18 = this.f301742i;
        if (i17 > 0) {
            if (i17 >= i18) {
                i18 = i17;
            }
            i18 += i17;
        } else {
            r45.sd3 sd3Var = this.f301745o;
            if (sd3Var != null) {
                j17 = sd3Var.f385638g;
            }
        }
        cu1.c cVar = new cu1.c(j17, i18, 1);
        cVar.f70649i = true;
        pq5.g l17 = cVar.l();
        kotlin.jvm.internal.o.f(l17, "run(...)");
        pm0.v.T(l17, new ju1.i0(this)).f(keeper);
    }

    @Override // ju1.k
    public void R6() {
        r45.sd3 sd3Var = this.f301745o;
        if (sd3Var != null) {
            r45.k90 k90Var = new r45.k90();
            java.util.ArrayList arrayList = this.f301746p;
            if (!arrayList.isEmpty()) {
                java.lang.Object remove = arrayList.remove(0);
                kotlin.jvm.internal.o.f(remove, "removeAt(...)");
                java.lang.String str = ((ju1.a) remove).f301689b;
                if (str == null) {
                    str = "";
                }
                k90Var.f378509d = str;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r45.tt ttVar = ((ju1.a) it.next()).f301690c;
                    if (ttVar != null) {
                        k90Var.f378510e.add(ttVar);
                    }
                }
            }
            sd3Var.f385641m = k90Var;
            r45.k90 k90Var2 = new r45.k90();
            java.util.ArrayList arrayList2 = this.f301747q;
            if (!arrayList2.isEmpty()) {
                java.lang.Object remove2 = arrayList2.remove(0);
                kotlin.jvm.internal.o.f(remove2, "removeAt(...)");
                java.lang.String str2 = ((ju1.a) remove2).f301689b;
                k90Var2.f378509d = str2 != null ? str2 : "";
                java.util.Iterator it6 = arrayList2.iterator();
                while (it6.hasNext()) {
                    r45.tt ttVar2 = ((ju1.a) it6.next()).f301690c;
                    if (ttVar2 != null) {
                        k90Var2.f378510e.add(ttVar2);
                    }
                }
            }
            sd3Var.f385642n = k90Var2;
            pm0.v.K(null, new au1.a(sd3Var));
        }
    }

    public final java.util.ArrayList S6(r45.sd3 sd3Var, boolean z17) {
        if (sd3Var == null) {
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = !z17 ? new java.util.ArrayList() : this.f301746p;
        java.util.ArrayList arrayList3 = !z17 ? new java.util.ArrayList() : this.f301747q;
        r45.k90 k90Var = sd3Var.f385641m;
        if (k90Var != null) {
            java.util.LinkedList items = k90Var.f378510e;
            kotlin.jvm.internal.o.f(items, "items");
            if (!items.isEmpty()) {
                if (arrayList2.isEmpty()) {
                    ju1.a aVar = new ju1.a();
                    aVar.f301688a = 0;
                    aVar.f301689b = k90Var.f378509d;
                    arrayList2.add(aVar);
                }
                java.util.Iterator it = items.iterator();
                while (it.hasNext()) {
                    r45.tt ttVar = (r45.tt) it.next();
                    ju1.a aVar2 = new ju1.a();
                    aVar2.f301690c = ttVar;
                    aVar2.f301688a = 2;
                    arrayList2.add(aVar2);
                }
            }
        }
        arrayList.addAll(arrayList2);
        r45.k90 k90Var2 = sd3Var.f385642n;
        if (k90Var2 != null) {
            java.util.LinkedList items2 = k90Var2.f378510e;
            kotlin.jvm.internal.o.f(items2, "items");
            if (!items2.isEmpty()) {
                if (arrayList3.isEmpty()) {
                    ju1.a aVar3 = new ju1.a();
                    aVar3.f301688a = 0;
                    aVar3.f301689b = k90Var2.f378509d;
                    arrayList3.add(aVar3);
                }
                java.util.Iterator it6 = items2.iterator();
                while (it6.hasNext()) {
                    r45.tt ttVar2 = (r45.tt) it6.next();
                    ju1.a aVar4 = new ju1.a();
                    aVar4.f301690c = ttVar2;
                    aVar4.f301688a = 1;
                    arrayList3.add(aVar4);
                }
            }
        }
        arrayList.addAll(arrayList3);
        return arrayList;
    }
}
