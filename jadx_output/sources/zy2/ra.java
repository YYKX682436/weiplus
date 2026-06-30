package zy2;

/* loaded from: classes2.dex */
public interface ra extends pf5.c {
    static ec2.d e2(zy2.ra raVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeedEventSubscriber");
        }
        if ((i18 & 1) != 0) {
            i17 = -1;
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) raVar;
        return nyVar.n7() ? i17 == -1 ? nyVar.c7(nyVar.f135372d) : nyVar.c7(i17) : nyVar.H;
    }

    static /* synthetic */ fc2.c n1(zy2.ra raVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFeedEventDispatcher");
        }
        if ((i18 & 1) != 0) {
            i17 = -1;
        }
        return ((com.tencent.mm.plugin.finder.viewmodel.component.ny) raVar).Y6(i17);
    }
}
