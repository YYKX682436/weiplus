package com.tencent.mm.plugin.finder.search;

/* loaded from: classes2.dex */
public final class u0 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.search.FinderFeedSearchUI f125873g;

    public u0(com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI) {
        this.f125873g = finderFeedSearchUI;
    }

    @Override // fc2.d
    public void G0(fc2.a event) {
        int i17;
        int i18;
        kotlin.jvm.internal.o.g(event, "event");
        if (!(event instanceof fc2.t)) {
            return;
        }
        fc2.t tVar = (fc2.t) event;
        int i19 = tVar.f260985d;
        if ((i19 != 5 && i19 != 0 && i19 != 1) || (i17 = tVar.f260987f) > (i18 = tVar.f260989h)) {
            return;
        }
        while (true) {
            com.tencent.mm.plugin.finder.search.FinderFeedSearchUI finderFeedSearchUI = this.f125873g;
            if (i17 < finderFeedSearchUI.C.size() && i17 >= 0) {
                finderFeedSearchUI.d7(((so2.j5) finderFeedSearchUI.C.get(i17)).getItemId(), i17, 2);
            }
            if (i17 == i18) {
                return;
            } else {
                i17++;
            }
        }
    }
}
