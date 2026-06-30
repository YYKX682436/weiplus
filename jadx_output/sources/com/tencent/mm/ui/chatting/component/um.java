package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class um implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f200091d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.xm f200092e;

    public um(com.tencent.mm.ui.chatting.component.xm xmVar, int i17) {
        this.f200092e = xmVar;
        this.f200091d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.ui.chatting.component.xm xmVar = this.f200092e;
        com.tencent.mm.ui.chatting.adapter.k kVar = (com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) xmVar.f198580d.f460708c.a(sb5.z.class));
        int i17 = this.f200091d;
        com.tencent.mm.storage.f9 item = kVar.getItem(i17);
        if (item != null) {
            if (((com.tencent.mm.ui.chatting.component.xm) ((sb5.k2) xmVar.f198580d.f460708c.a(sb5.k2.class))).o0(item.getMsgId())) {
                yb5.d dVar = xmVar.f198580d;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(java.lang.Integer.valueOf(i17));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(dVar, arrayList.toArray(), "com/tencent/mm/ui/chatting/component/TransformComponent$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
                dVar.O(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(dVar, "com/tencent/mm/ui/chatting/component/TransformComponent$3", "run", "()V", "Undefined", "scrollToPosition", "(I)V");
            }
            xmVar.f200260o = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) xmVar.f198580d.f460708c.a(sb5.z.class))).P0(i17);
        }
    }
}
