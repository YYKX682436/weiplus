package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class zm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.an f200393d;

    public zm(com.tencent.mm.ui.chatting.component.an anVar) {
        this.f200393d = anVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.ym ymVar = this.f200393d.f198659f;
        java.util.HashMap hashMap = com.tencent.mm.ui.chatting.component.ym.f200332u;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) ymVar.f198580d.f460708c.a(sb5.s0.class))).f199263e;
        if (ymVar.f200338i || chatFooter.K0()) {
            ymVar.x0(ymVar.f200339m, 1, ymVar.w0(ymVar.f200336g));
            return;
        }
        if (ymVar.f200336g < 0) {
            ymVar.x0(ymVar.f200339m, 0, 0);
            return;
        }
        com.tencent.mm.storage.f9 item = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) ymVar.f198580d.f460708c.a(sb5.z.class))).getItem(ymVar.f200336g + 1);
        if (!ymVar.y0(item)) {
            ymVar.f200336g = -1;
            ymVar.x0(ymVar.f200339m, 0, 0);
            return;
        }
        ymVar.p0(item, ymVar.f200336g + 1, false);
        int i17 = ymVar.f200336g;
        if (!ymVar.f200337h || i17 == -1) {
            return;
        }
        yb5.d dVar = ymVar.f198580d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/TranslateComponent", "scrollTo", "(I)V", "Undefined", "scrollToPosition", "(I)V");
        dVar.O(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(dVar, "com/tencent/mm/ui/chatting/component/TranslateComponent", "scrollTo", "(I)V", "Undefined", "scrollToPosition", "(I)V");
    }
}
