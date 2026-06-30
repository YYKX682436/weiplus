package vw2;

/* loaded from: classes2.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw2.f f440860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vw2.n f440861e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(vw2.f fVar, vw2.n nVar) {
        super(0);
        this.f440860d = fVar;
        this.f440861e = nVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        vw2.f fVar = this.f440860d;
        in5.s0 s0Var = fVar.f440839a;
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) s0Var.f293125i;
        int hashCode = s0Var.hashCode();
        vw2.n nVar = this.f440861e;
        boolean z17 = nVar.f440871c;
        vw2.d dVar = nVar.f440870b;
        if (z17 && baseFinderFeed != null) {
            if (((java.util.LinkedHashMap) vw2.n.f440868g).get(java.lang.Integer.valueOf(hashCode)) == null || dVar != vw2.d.f440835d) {
                long itemId = baseFinderFeed.getItemId();
                java.util.LinkedHashMap linkedHashMap = (java.util.LinkedHashMap) vw2.n.f440867f;
                java.lang.Object obj = linkedHashMap.get(java.lang.Long.valueOf(itemId));
                in5.s0 s0Var2 = fVar.f440839a;
                vw2.g gVar = nVar.f440869a;
                if (obj == null || gVar == vw2.g.f440842f) {
                    com.tencent.mars.xlog.Log.i("ToolbarButtonCarouselAnimationHelper", "onIntercept: lastInterceptor[feedId]=" + linkedHashMap.get(java.lang.Long.valueOf(itemId)) + ", playStrategy=" + gVar);
                    java.util.Iterator it = ((java.util.ArrayList) nVar.f440872d).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ww2.b bVar = (ww2.b) it.next();
                        java.util.List a17 = bVar.a(fVar, baseFinderFeed);
                        if (!(a17 == null || a17.isEmpty())) {
                            vw2.n.f440867f.put(java.lang.Long.valueOf(itemId), bVar);
                            vw2.n.a(nVar, bVar, a17, s0Var2);
                            break;
                        }
                    }
                } else if (gVar == vw2.g.f440840d) {
                    com.tencent.mars.xlog.Log.i("ToolbarButtonCarouselAnimationHelper", "onIntercept: playStrategy=OneInterceptorPerVideo. interceptor=" + linkedHashMap.get(java.lang.Long.valueOf(itemId)));
                    ww2.b bVar2 = (ww2.b) linkedHashMap.get(java.lang.Long.valueOf(itemId));
                    if (bVar2 != null) {
                        java.util.List a18 = bVar2.a(fVar, baseFinderFeed);
                        if (!(a18 == null || a18.isEmpty())) {
                            vw2.n.a(nVar, bVar2, a18, s0Var2);
                        }
                    }
                }
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.i("ToolbarButtonCarouselAnimationHelper", "onIntercept: early return. enabled=" + nVar.f440871c + ", baseFinderFeed=" + baseFinderFeed + ", lastAnimator[event.holder]=" + ((java.util.LinkedHashMap) vw2.n.f440868g).get(java.lang.Integer.valueOf(hashCode)) + ", conflictStrategy=" + dVar);
        return jz5.f0.f302826a;
    }
}
