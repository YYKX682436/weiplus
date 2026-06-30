package com.tencent.mm.plugin.sns.model;

/* loaded from: classes4.dex */
public class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.model.i7 f164128d;

    public c7(com.tencent.mm.plugin.sns.model.i7 i7Var) {
        this.f164128d = i7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo;
        dn.o oVar;
        java.util.List list;
        boolean z19;
        boolean z27;
        boolean z28;
        java.lang.String str;
        dn.o oVar2;
        java.util.List list2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
        if (this.f164128d.f164308a != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
            return;
        }
        if (!com.tencent.mm.plugin.sns.model.i7.c(this.f164128d).isEmpty()) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
            return;
        }
        boolean d17 = n74.l0.d();
        com.tencent.mm.pointers.PBool pBool = new com.tencent.mm.pointers.PBool();
        com.tencent.mm.pointers.PBool pBool2 = new com.tencent.mm.pointers.PBool();
        boolean e17 = com.tencent.mm.plugin.sns.model.i7.e(this.f164128d, pBool, pBool2);
        if (d17) {
            e17 = false;
        }
        synchronized (com.tencent.mm.plugin.sns.model.i7.b(this.f164128d)) {
            try {
                int size = com.tencent.mm.plugin.sns.model.i7.b(this.f164128d).size();
                com.tencent.mm.plugin.sns.model.i7 i7Var = this.f164128d;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$300", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                int i17 = i7Var.f164313f;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$300", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                if (size >= i17) {
                    com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload: currentPreloadList isUpperLimit, hasSlideFullCardAd=" + e17 + ", hasLookbookAd=" + pBool.value + ", hasFlipCardAd=" + pBool2.value + ", size=" + com.tencent.mm.plugin.sns.model.i7.b(this.f164128d).size());
                    if (!e17 && !pBool.value && !pBool2.value) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD working with max count ,try later again . [fail to preload]");
                        return;
                    }
                    z17 = true;
                } else {
                    z17 = false;
                }
                com.tencent.mm.plugin.sns.model.i7 i7Var2 = this.f164128d;
                if (i7Var2.f164315h || (i7Var2.f164316i && !ma4.a.a())) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD isInChatting:%b, x-config enable preload:%b . [fail to preload]", java.lang.Boolean.valueOf(this.f164128d.f164315h), java.lang.Boolean.valueOf(ma4.a.a()));
                    z18 = true;
                } else {
                    z18 = false;
                }
                com.tencent.mm.pointers.PBool pBool3 = new com.tencent.mm.pointers.PBool();
                com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
                com.tencent.mm.pointers.PString pString = new com.tencent.mm.pointers.PString();
                java.lang.String str2 = "";
                synchronized (com.tencent.mm.plugin.sns.model.i7.f(this.f164128d)) {
                    try {
                        java.util.Iterator it = com.tencent.mm.plugin.sns.model.i7.f(this.f164128d).iterator();
                        snsInfo = null;
                        oVar = null;
                        list = null;
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            snsInfo = (com.tencent.mm.plugin.sns.storage.SnsInfo) it.next();
                            str2 = snsInfo.getLocalid();
                            if (snsInfo.isAd() || !z18) {
                                boolean f17 = q74.t0.f(snsInfo);
                                if ((!f17 || d17) && !snsInfo.isLookbookCardAd() && !snsInfo.isFlipCardAd() && z17) {
                                    com.tencent.mars.xlog.Log.i("SlideFullCard.MicroMsg.SnsVideoService", "tryPreload: current snsInfo is not slideFullCard or lookbook ad and isUpperLimit is true!");
                                } else {
                                    com.tencent.mm.plugin.sns.model.i7 i7Var3 = this.f164128d;
                                    boolean g17 = i7Var3.f164316i ? com.tencent.mm.plugin.sns.model.i7.g(i7Var3, snsInfo, pBool3, pInt, pString) : com.tencent.mm.plugin.sns.model.i7.h(i7Var3, snsInfo, pBool3, pInt, pString);
                                    if (snsInfo.isAd()) {
                                        com.tencent.mm.plugin.sns.storage.ADInfo adInfo = snsInfo.getAdInfo();
                                        q34.b adPreloadConfig = adInfo == null ? null : adInfo.getAdPreloadConfig();
                                        if (adPreloadConfig != null) {
                                            z19 = z17;
                                            boolean z29 = adPreloadConfig.f359966a;
                                            int i18 = adPreloadConfig.f359967b;
                                            z27 = z18;
                                            z28 = g17;
                                            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                                            str = str2;
                                            sb6.append("adVideoPreload timeline online, snsId=");
                                            oVar2 = oVar;
                                            list2 = list;
                                            sb6.append(ca4.z0.t0(snsInfo.field_snsId));
                                            sb6.append(", cfg.forbidPreload=");
                                            sb6.append(z29);
                                            sb6.append(", cfg.ratio=");
                                            sb6.append(i18);
                                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", sb6.toString());
                                            if (z29) {
                                                pBool3.value = true;
                                                z28 = false;
                                            }
                                        } else {
                                            z19 = z17;
                                            z27 = z18;
                                            z28 = g17;
                                            str = str2;
                                            oVar2 = oVar;
                                            list2 = list;
                                            ca4.z0.t0(snsInfo.field_snsId);
                                        }
                                    } else {
                                        z19 = z17;
                                        z27 = z18;
                                        z28 = g17;
                                        str = str2;
                                        oVar2 = oVar;
                                        list2 = list;
                                    }
                                    boolean z37 = z28;
                                    if (pBool3.value) {
                                        it.remove();
                                    }
                                    if (!z37) {
                                        oVar = oVar2;
                                        list = list2;
                                        snsInfo = null;
                                    } else if (!d17 && f17) {
                                        list = n74.m0.d(snsInfo, pInt, pString.value, this.f164128d.f164316i);
                                        if (!a84.b0.b(list)) {
                                            break;
                                        }
                                        it.remove();
                                        oVar = oVar2;
                                    } else if (snsInfo.isLookbookCardAd()) {
                                        list = n74.m0.b(snsInfo, pInt, pString.value, this.f164128d.f164316i);
                                        if (!a84.b0.b(list)) {
                                            break;
                                        }
                                        it.remove();
                                        oVar = oVar2;
                                    } else if (snsInfo.isFlipCardAd()) {
                                        list = n74.m0.a(snsInfo, pInt, pString.value, this.f164128d.f164316i);
                                        if (!a84.b0.b(list)) {
                                            break;
                                        }
                                        it.remove();
                                        oVar = oVar2;
                                    } else {
                                        oVar = com.tencent.mm.plugin.sns.model.i7.i(this.f164128d, snsInfo, pInt, pString.value);
                                        if (oVar != null) {
                                            str2 = str;
                                            list = list2;
                                            break;
                                        } else {
                                            it.remove();
                                            list = list2;
                                        }
                                    }
                                    z17 = z19;
                                    z18 = z27;
                                    str2 = str;
                                }
                            } else {
                                com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD: the sns info is not ad and preload is disable!");
                            }
                            snsInfo = null;
                        }
                        str2 = str;
                        oVar = oVar2;
                    } finally {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                    }
                }
                if (snsInfo == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD current preload list null");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                    return;
                }
                if (oVar == null && a84.b0.b(list)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD sns:[%s] null task . [fail to preload]", str2);
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                    return;
                }
                try {
                    if (a84.b0.b(list)) {
                        java.lang.String localid = snsInfo.getLocalid();
                        t21.v0 v0Var = new t21.v0(oVar, localid);
                        com.tencent.mm.plugin.sns.model.i7 i7Var4 = this.f164128d;
                        v0Var.f414991o = i7Var4.f164316i;
                        if (v0Var.b(i7Var4) < 0) {
                            com.tencent.mars.xlog.Log.w("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD curr preload task do scene error. hash:[%d ]", java.lang.Integer.valueOf(this.f164128d.hashCode()));
                        } else {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD sns:[%s] start to preload , pPreloadPercent:%d  [success to preload]", localid, java.lang.Integer.valueOf(pInt.value));
                            v0Var.f414990n = java.lang.System.currentTimeMillis();
                            synchronized (com.tencent.mm.plugin.sns.model.i7.b(this.f164128d)) {
                                try {
                                    com.tencent.mm.plugin.sns.model.i7.b(this.f164128d).add(0, v0Var);
                                } finally {
                                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                                }
                            }
                        }
                    } else {
                        com.tencent.mm.plugin.sns.model.i7.j(this.f164128d, str2, list, pInt);
                    }
                    synchronized (com.tencent.mm.plugin.sns.model.i7.f(this.f164128d)) {
                        try {
                            java.util.Iterator it6 = com.tencent.mm.plugin.sns.model.i7.f(this.f164128d).iterator();
                            while (it6.hasNext()) {
                                com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo2 = (com.tencent.mm.plugin.sns.storage.SnsInfo) it6.next();
                                if (snsInfo2 != null && com.tencent.mm.sdk.platformtools.t8.D0(snsInfo2.getLocalid(), snsInfo.getLocalid())) {
                                    com.tencent.mars.xlog.Log.i("MicroMsg.SnsVideoService", "SNS_PRELOAD_LOAD find sns info[%s], remove now. hash:[%d ]", snsInfo.getLocalid(), java.lang.Integer.valueOf(this.f164128d.hashCode()));
                                    it6.remove();
                                }
                            }
                        } finally {
                        }
                    }
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SnsVideoService", e18, "", new java.lang.Object[0]);
                    com.tencent.mm.plugin.sns.model.i7 i7Var5 = this.f164128d;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$900", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    i7Var5.v();
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$900", "com.tencent.mm.plugin.sns.model.SnsVideoService");
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
                }
            } finally {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.model.SnsVideoService$4");
            }
        }
    }
}
