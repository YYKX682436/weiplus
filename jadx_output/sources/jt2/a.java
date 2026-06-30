package jt2;

/* loaded from: classes3.dex */
public final class a extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "notifyAnimationStatus";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        java.util.HashSet Q0;
        kotlin.jvm.internal.o.g(data, "data");
        int optInt = data.optInt("status", 0);
        java.lang.String optString = data.optString("viewId", "");
        if (optInt != 0) {
            kotlin.jvm.internal.o.d(optString);
            if (!(optString.length() == 0)) {
                lc3.e eVar = this.f317890a;
                kotlin.jvm.internal.o.d(eVar);
                it2.x xVar = ((it2.k) eVar).f294511d;
                xVar.getClass();
                com.tencent.mars.xlog.Log.i("MagicRewardFeatureService", "notify status changed: " + optInt + " for view " + optString);
                java.lang.Object obj = ((java.util.concurrent.ConcurrentMap) ((jz5.n) xVar.f294534h).getValue()).get(optString);
                com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView = obj instanceof com.tencent.mm.plugin.finder.reward.view.MagicRewardView ? (com.tencent.mm.plugin.finder.reward.view.MagicRewardView) obj : null;
                if (magicRewardView != null) {
                    synchronized (magicRewardView.f125500m) {
                        Q0 = kz5.n0.Q0(magicRewardView.f125500m);
                    }
                    if (optInt == 1) {
                        java.util.Iterator it = Q0.iterator();
                        while (it.hasNext()) {
                            com.tencent.mm.plugin.finder.live.widget.pk pkVar = (com.tencent.mm.plugin.finder.live.widget.pk) ((kt2.a) it.next());
                            pkVar.getClass();
                            com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayMagicRewardWidget", "onAnimationStart");
                            d75.b.g(new com.tencent.mm.plugin.finder.live.widget.ok(pkVar.f119389b));
                        }
                    } else if (optInt == 2) {
                        java.util.Iterator it6 = Q0.iterator();
                        while (it6.hasNext()) {
                            com.tencent.mm.plugin.finder.live.widget.pk pkVar2 = (com.tencent.mm.plugin.finder.live.widget.pk) ((kt2.a) it6.next());
                            pkVar2.getClass();
                            com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayMagicRewardWidget", "onAnimationEnd");
                            if (!pkVar2.f119388a) {
                                pkVar2.f119388a = true;
                                com.tencent.mm.plugin.finder.live.widget.rk rkVar = pkVar2.f119389b;
                                rkVar.f119655c = false;
                                com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView2 = rkVar.f119654b;
                                if (magicRewardView2 != null) {
                                    magicRewardView2.setVisibility(8);
                                }
                                com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView3 = rkVar.f119654b;
                                if (magicRewardView3 != null) {
                                    magicRewardView3.g(pkVar2);
                                }
                                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                                ((kotlinx.coroutines.r) pkVar2.f119390c).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                            }
                        }
                    } else if (optInt == 3) {
                        java.util.Iterator it7 = Q0.iterator();
                        while (it7.hasNext()) {
                            com.tencent.mm.plugin.finder.live.widget.pk pkVar3 = (com.tencent.mm.plugin.finder.live.widget.pk) ((kt2.a) it7.next());
                            pkVar3.getClass();
                            com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayMagicRewardWidget", "onAnimationCancel");
                            if (!pkVar3.f119388a) {
                                pkVar3.f119388a = true;
                                com.tencent.mm.plugin.finder.live.widget.rk rkVar2 = pkVar3.f119389b;
                                rkVar2.f119655c = false;
                                com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView4 = rkVar2.f119654b;
                                if (magicRewardView4 != null) {
                                    magicRewardView4.setVisibility(8);
                                }
                                com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView5 = rkVar2.f119654b;
                                if (magicRewardView5 != null) {
                                    magicRewardView5.g(pkVar3);
                                }
                                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                                ((kotlinx.coroutines.r) pkVar3.f119390c).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
                            }
                        }
                    } else if (optInt == 4) {
                        java.util.Iterator it8 = Q0.iterator();
                        while (it8.hasNext()) {
                            ((com.tencent.mm.plugin.finder.live.widget.pk) ((kt2.a) it8.next())).getClass();
                            com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayMagicRewardWidget", "onAnimationRepeat");
                        }
                    } else if (optInt != 5) {
                        com.tencent.mars.xlog.Log.e("MagicRewardView", "unknown event: " + optInt);
                    } else {
                        java.util.Iterator it9 = Q0.iterator();
                        while (it9.hasNext()) {
                            com.tencent.mm.plugin.finder.live.widget.pk pkVar4 = (com.tencent.mm.plugin.finder.live.widget.pk) ((kt2.a) it9.next());
                            pkVar4.getClass();
                            com.tencent.mars.xlog.Log.i("FinderLiveGiftPlayMagicRewardWidget", "onAnimationTimeout");
                            if (!pkVar4.f119388a) {
                                pkVar4.f119388a = true;
                                com.tencent.mm.plugin.finder.live.widget.rk rkVar3 = pkVar4.f119389b;
                                rkVar3.f119655c = false;
                                com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView6 = rkVar3.f119654b;
                                if (magicRewardView6 != null) {
                                    magicRewardView6.setVisibility(8);
                                }
                                com.tencent.mm.plugin.finder.reward.view.MagicRewardView magicRewardView7 = rkVar3.f119654b;
                                if (magicRewardView7 != null) {
                                    magicRewardView7.g(pkVar4);
                                }
                                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                                ((kotlinx.coroutines.r) pkVar4.f119390c).resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.FALSE));
                            }
                        }
                    }
                }
                s().invoke(k());
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MRJsApiNotifyAnimationStatus", "notifyAnimationStatus with " + data);
        s().invoke(i(lc3.x.f317937d));
    }
}
