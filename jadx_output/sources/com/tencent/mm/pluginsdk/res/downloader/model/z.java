package com.tencent.mm.pluginsdk.res.downloader.model;

/* loaded from: classes7.dex */
public class z implements java.util.Comparator {
    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.lang.Runnable runnable = (java.lang.Runnable) obj;
        java.lang.Runnable runnable2 = (java.lang.Runnable) obj2;
        if ((runnable instanceof com.tencent.mm.pluginsdk.res.downloader.model.l) && (runnable2 instanceof com.tencent.mm.pluginsdk.res.downloader.model.l)) {
            com.tencent.mm.pluginsdk.res.downloader.model.k kVar = ((com.tencent.mm.pluginsdk.res.downloader.model.l) runnable).f189681d;
            if (kVar instanceof com.tencent.mm.pluginsdk.res.downloader.model.u) {
                com.tencent.mm.pluginsdk.res.downloader.model.k kVar2 = ((com.tencent.mm.pluginsdk.res.downloader.model.l) runnable2).f189681d;
                if (kVar2 instanceof com.tencent.mm.pluginsdk.res.downloader.model.u) {
                    com.tencent.mm.pluginsdk.res.downloader.model.u uVar = (com.tencent.mm.pluginsdk.res.downloader.model.u) kVar;
                    com.tencent.mm.pluginsdk.res.downloader.model.u uVar2 = (com.tencent.mm.pluginsdk.res.downloader.model.u) kVar2;
                    i17 = uVar.f189716e - uVar2.f189716e;
                    if ((uVar instanceof com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) && (uVar2 instanceof com.tencent.mm.pluginsdk.res.downloader.checkresupdate.t) && i17 == 0) {
                        i17 = ((int) (java.lang.Math.random() * 50.0d)) - 25;
                    }
                    return 0 - i17;
                }
            }
        }
        i17 = 0;
        return 0 - i17;
    }
}
