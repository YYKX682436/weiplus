package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class no extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f113665d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f113666e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.util.l1 f113667f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no(com.tencent.mm.plugin.finder.live.plugin.ap apVar, android.view.ViewGroup viewGroup, com.tencent.mm.plugin.finder.live.util.l1 l1Var) {
        super(0);
        this.f113665d = apVar;
        this.f113666e = viewGroup;
        this.f113667f = l1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.animation.ValueAnimator valueAnimator;
        r45.kv1 kv1Var;
        java.util.LinkedList list;
        java.util.LinkedList list2;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "relaunchBulletInAnimation, BulletShowingInfo=" + this.f113665d.A.get(this.f113666e) + ", giftShowInfo=" + this.f113667f);
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) this.f113665d.A.get(this.f113666e);
        if (tnVar != null) {
            com.tencent.mm.plugin.finder.live.plugin.ap apVar = this.f113665d;
            com.tencent.mm.plugin.finder.live.util.l1 l1Var = this.f113667f;
            android.view.ViewGroup viewGroup = this.f113666e;
            df2.wy wyVar = (df2.wy) apVar.U0(df2.wy.class);
            if (wyVar != null) {
                wyVar.g7(l1Var);
            }
            tf2.k kVar = (tf2.k) apVar.U0(tf2.k.class);
            if (kVar != null) {
                kVar.a7(l1Var);
            }
            java.lang.String str = "bulletInfoMap " + viewGroup + " giftShowInfo:" + l1Var.f115594i + " reward:" + l1Var.f115595m + " comboSumCount:" + tnVar.f114442i;
            if (l1Var.f115594i > tnVar.f114442i) {
                tnVar.f114442i = l1Var.f115594i;
            } else {
                tnVar.f114442i += l1Var.f115595m;
            }
            tnVar.e(tnVar.f114442i, l1Var.f115599q, l1Var);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "loginfo " + str + " result " + tnVar.f114442i);
            java.lang.Object obj = null;
            if (tnVar.f114439f.get()) {
                if (tnVar.f114450q == 0 && tnVar.f114451r == 0) {
                    apVar.I.removeCallbacksAndMessages(viewGroup);
                    apVar.f111914J = false;
                    apVar.Q1(l1Var, true);
                    tnVar.f114451r = c01.id.c();
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", "relaunchBulletInAnimation: restart precious gift, startShowingTime = " + tnVar.f114451r);
                } else {
                    r45.cj1 cj1Var = l1Var.f115592g;
                    java.lang.String string = cj1Var != null ? cj1Var.getString(0) : null;
                    r45.xv1 xv1Var = l1Var.f115603u;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("appendFullScreenPreciousGift giftId:");
                    sb6.append(string);
                    sb6.append(" targetUsername:");
                    sb6.append(l1Var.f115601s);
                    sb6.append(" curPkUser:");
                    km2.q l76 = ((mm2.o4) apVar.P0(mm2.o4.class)).l7();
                    sb6.append(l76 != null ? l76.f309172c : null);
                    sb6.append(" randomItem:");
                    sb6.append((xv1Var == null || (list2 = xv1Var.getList(1)) == null) ? null : java.lang.Integer.valueOf(list2.size()));
                    com.tencent.mars.xlog.Log.i("Finder.FinderLiveGiftQueuePlugin", sb6.toString());
                    android.os.Bundle bundle = new android.os.Bundle();
                    if ((xv1Var == null || (list = xv1Var.getList(1)) == null || !(list.isEmpty() ^ true)) ? false : true) {
                        bundle.putString("PARAM_LIVE_GIFT_INFO_Id", string);
                        bundle.putByteArray("PARAM_LIVE_GIFT_RANDOM_ITEM", xv1Var.toByteArray());
                        r45.cj1 cj1Var2 = l1Var.f115592g;
                        if (cj1Var2 != null && (kv1Var = (r45.kv1) cj1Var2.getCustom(3)) != null) {
                            bundle.putByteArray("PARAM_LIVE_GIFT_INFO", kv1Var.toByteArray());
                        }
                        apVar.f111915p.statusChange(qo0.b.W1, bundle);
                    }
                }
                java.lang.String str2 = l1Var.f115600r;
                if (str2 == null) {
                    str2 = "";
                }
                apVar.W1(str2, tnVar, l1Var.f115595m, l1Var);
            }
            if (!tnVar.C) {
                android.animation.ValueAnimator valueAnimator2 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) apVar.C).get(viewGroup);
                if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                    valueAnimator2.cancel();
                }
                if (tnVar.f114438e && (valueAnimator = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) apVar.B).get(viewGroup)) != null) {
                    valueAnimator.start();
                }
                viewGroup.setAlpha(1.0f);
                viewGroup.setVisibility(0);
                if (!tnVar.f114439f.get()) {
                    android.animation.ValueAnimator valueAnimator3 = (android.animation.ValueAnimator) ((java.util.concurrent.ConcurrentHashMap) apVar.B).get(viewGroup);
                    if (valueAnimator3 != null) {
                        valueAnimator3.setCurrentPlayTime(550L);
                    }
                } else if (apVar.H.e()) {
                    java.util.Iterator it = ((kz5.k0) kz5.n0.J(apVar.A.entrySet())).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        if (kotlin.jvm.internal.o.b(((java.util.Map.Entry) next).getKey(), viewGroup)) {
                            obj = next;
                            break;
                        }
                    }
                    apVar.w1((java.util.Map.Entry) obj);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
