package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes15.dex */
public class j1 implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.l1 f184850d;

    public j1(com.tencent.mm.plugin.webview.ui.tools.l1 l1Var, com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI sDKOAuthAppDataUI) {
        this.f184850d = l1Var;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.webview.ui.tools.l1 l1Var = this.f184850d;
        java.util.LinkedList linkedList = l1Var.f185623d;
        com.tencent.mm.plugin.webview.ui.tools.SDKOAuthAppDataUI sDKOAuthAppDataUI = l1Var.f185626g;
        r45.h04 h04Var = (r45.h04) linkedList.get(sDKOAuthAppDataUI.f183663u.f184122i);
        r45.f14 f14Var = (r45.f14) h04Var.f375713h.get(((java.lang.Integer) obj).intValue());
        r45.c36 c36Var = l1Var.f185625f;
        r45.yv6 yv6Var = (r45.yv6) c36Var.f371255d.get(sDKOAuthAppDataUI.f183663u.f184122i);
        yv6Var.f391428d = h04Var.f375709d;
        yv6Var.f391429e = f14Var.f373926d;
        l1Var.f185624e = new java.util.LinkedList();
        java.util.Iterator it = l1Var.f185623d.iterator();
        while (it.hasNext()) {
            r45.h04 h04Var2 = (r45.h04) it.next();
            java.util.LinkedList linkedList2 = h04Var2.f375712g;
            java.util.Iterator it6 = c36Var.f371255d.iterator();
            boolean z17 = false;
            int i17 = 0;
            while (it6.hasNext()) {
                r45.yv6 yv6Var2 = (r45.yv6) it6.next();
                java.util.Iterator it7 = linkedList2.iterator();
                while (it7.hasNext()) {
                    r45.b14 b14Var = (r45.b14) it7.next();
                    if (yv6Var2.f391428d == b14Var.f370427d && yv6Var2.f391429e == b14Var.f370428e) {
                        i17++;
                    }
                }
            }
            if (i17 == linkedList2.size() && i17 > 0) {
                z17 = true;
            }
            if (!z17) {
                l1Var.f185624e.add(h04Var2);
            }
        }
        l1Var.notifyDataSetChanged();
        sDKOAuthAppDataUI.U6();
    }
}
