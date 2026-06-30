package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class q9 implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f124149a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.ob f124150b;

    public q9(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, com.tencent.mm.plugin.finder.profile.uic.ob obVar) {
        this.f124149a = s4Var;
        this.f124150b = obVar;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var;
        kotlin.jvm.internal.o.g(noticeList, "noticeList");
        int size = noticeList.size();
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f124149a;
        com.tencent.mm.plugin.finder.profile.uic.ob obVar = this.f124150b;
        if (size <= 0 || !z17) {
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = (com.tencent.mm.plugin.finder.profile.uic.l2) s4Var.f124754h.get(obVar.getUsername());
            if (l2Var2 != null && (h32Var = l2Var2.f123916e) != null) {
                java.util.Iterator it = noticeList.iterator();
                while (it.hasNext()) {
                    r45.h32 h32Var2 = (r45.h32) it.next();
                    if (kotlin.jvm.internal.o.b(h32Var.getString(4), h32Var2.getString(4)) && (l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) s4Var.f124754h.get(obVar.getUsername())) != null) {
                        l2Var.f123916e = h32Var2;
                    }
                }
            }
        } else {
            com.tencent.mm.plugin.finder.profile.uic.l2 l2Var3 = (com.tencent.mm.plugin.finder.profile.uic.l2) s4Var.f124754h.get(obVar.getUsername());
            if (l2Var3 != null) {
                l2Var3.f123916e = (r45.h32) kz5.n0.X(noticeList);
            }
        }
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var4 = (com.tencent.mm.plugin.finder.profile.uic.l2) s4Var.f124754h.get(obVar.getUsername());
        if (l2Var4 != null) {
            l2Var4.B = c32Var;
        }
        com.tencent.mm.plugin.finder.profile.uic.ob.G7(obVar, "moreLiveListWidget-onDismiss", null, 2, null);
    }
}
