package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.tab.f f154515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f154516e;

    public q(com.tencent.mm.plugin.profile.ui.tab.f fVar, java.util.ArrayList arrayList) {
        this.f154515d = fVar;
        this.f154516e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it;
        r45.l5 l5Var;
        r45.p5 p5Var;
        java.util.LinkedList linkedList;
        java.util.LinkedList linkedList2;
        r45.tj6 tj6Var;
        r45.gl glVar;
        r45.tj6 tj6Var2;
        r45.gl glVar2;
        r45.gl glVar3;
        r45.tj6 tj6Var3;
        r45.gl glVar4;
        r45.tj6 tj6Var4;
        r45.gl glVar5;
        r45.tj6 tj6Var5;
        r45.gl glVar6;
        r45.tj6 tj6Var6;
        r45.gl glVar7;
        r45.gl glVar8;
        r45.gl glVar9;
        java.util.ArrayList messages = this.f154516e;
        kotlin.jvm.internal.o.f(messages, "$messages");
        vr3.t tVar = (vr3.t) this.f154515d;
        tVar.getClass();
        if (messages.isEmpty()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: messages is null or empty");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Received " + messages.size() + " messages");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        com.tencent.mm.plugin.profile.ui.tab.data.BizProfileDataFetcher bizProfileDataFetcher = tVar.f439650a;
        r45.wl c17 = bizProfileDataFetcher.c((r45.wl) bizProfileDataFetcher.f154282m.getValue());
        r45.wl c18 = bizProfileDataFetcher.c((r45.wl) bizProfileDataFetcher.f154283n.getValue());
        r45.wl c19 = bizProfileDataFetcher.c((r45.wl) bizProfileDataFetcher.f154286q.getValue());
        r45.wl c27 = bizProfileDataFetcher.c((r45.wl) bizProfileDataFetcher.f154285p.getValue());
        int i17 = 0;
        for (java.util.Iterator it6 = messages.iterator(); it6.hasNext(); it6 = it) {
            java.lang.Object next = it6.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            r45.s5 s5Var = (r45.s5) next;
            try {
                p5Var = s5Var.f385514i;
                linkedList = p5Var != null ? p5Var.f382754e : null;
            } catch (java.lang.Exception e17) {
                e = e17;
                it = it6;
            }
            if (p5Var != null && linkedList != null && !linkedList.isEmpty()) {
                r45.o5 o5Var = (r45.o5) linkedList.getFirst();
                r45.z5 z5Var = o5Var.R;
                int i19 = z5Var != null ? z5Var.f391718e : 0;
                if (i19 == 0) {
                    r45.l5 l5Var2 = p5Var.f382753d;
                    i19 = l5Var2 != null ? l5Var2.f379138d : 0;
                }
                if (i19 == 0) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileDataFetcher", '[' + i17 + "] appMsgId is 0, skip");
                    it = it6;
                } else {
                    if (c17 == null || (glVar9 = c17.f389235f) == null) {
                        it = it6;
                        linkedList2 = null;
                    } else {
                        linkedList2 = glVar9.f375323d;
                        it = it6;
                    }
                    try {
                        vr3.t.a(linkedList2, o5Var, i19, "profileInitRespData.Msg", arrayList);
                        vr3.t.a((c17 == null || (glVar8 = c17.f389235f) == null) ? null : glVar8.f375327h, o5Var, i19, "profileInitRespData.FeaturedList", arrayList);
                        vr3.t.a((c17 == null || (tj6Var6 = c17.D) == null || (glVar7 = tj6Var6.f386509e) == null) ? null : glVar7.f375323d, o5Var, i19, "profileInitRespData.PicTab", arrayList2);
                        vr3.t.a((c17 == null || (tj6Var5 = c17.D) == null || (glVar6 = tj6Var5.f386509e) == null) ? null : glVar6.f375327h, o5Var, i19, "profileInitRespData.PicTab.FeaturedList", arrayList2);
                        vr3.t.a((c17 == null || (tj6Var4 = c17.C) == null || (glVar5 = tj6Var4.f386509e) == null) ? null : glVar5.f375323d, o5Var, i19, "profileInitRespData.ArticleTab", arrayList3);
                        vr3.t.a((c17 == null || (tj6Var3 = c17.C) == null || (glVar4 = tj6Var3.f386509e) == null) ? null : glVar4.f375327h, o5Var, i19, "profileInitRespData.ArticleTab.FeaturedList", arrayList3);
                        vr3.t.a((c18 == null || (glVar3 = c18.f389235f) == null) ? null : glVar3.f375323d, o5Var, i19, "bizProfileMsgResp.Msg", arrayList);
                        vr3.t.a((c19 == null || (tj6Var2 = c19.D) == null || (glVar2 = tj6Var2.f386509e) == null) ? null : glVar2.f375323d, o5Var, i19, "bizPicProfile.PicTab", arrayList2);
                        vr3.t.a((c27 == null || (tj6Var = c27.C) == null || (glVar = tj6Var.f386509e) == null) ? null : glVar.f375323d, o5Var, i19, "bizPicProfile.ArticleTab", arrayList3);
                    } catch (java.lang.Exception e18) {
                        e = e18;
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Exception processing message[");
                        sb6.append(i17);
                        sb6.append("]: ");
                        sb6.append(e);
                        sb6.append(", updateMsg=");
                        r45.p5 p5Var2 = s5Var.f385514i;
                        sb6.append((p5Var2 == null || (l5Var = p5Var2.f382753d) == null) ? null : java.lang.Integer.valueOf(l5Var.f379138d));
                        com.tencent.mars.xlog.Log.e("MicroMsg.BizProfileDataFetcher", sb6.toString(), e);
                        i17 = i18;
                    }
                }
                i17 = i18;
            }
            it = it6;
            com.tencent.mars.xlog.Log.w("MicroMsg.BizProfileDataFetcher", '[' + i17 + "] updateMsg appMsg or detailInfo is null/empty");
            i17 = i18;
        }
        ik1.h0.b(new vr3.s(arrayList, bizProfileDataFetcher, arrayList3, arrayList2));
        if (c17 != null) {
            try {
                qr3.c0.c(c17);
                com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Saved profileInitRespData to cache");
            } catch (java.io.IOException e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.BizProfileDataFetcher", "onProfileUpdateMessages: Failed to save profileInitRespData: " + e19, e19);
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.BizProfileDataFetcher", "subscribeProfileUpdateMessages: End.");
    }
}
