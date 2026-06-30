package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public class vm implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f200139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200140e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.xm f200141f;

    public vm(com.tencent.mm.ui.chatting.component.xm xmVar, int i17, com.tencent.mm.storage.f9 f9Var) {
        this.f200141f = xmVar;
        this.f200139d = i17;
        this.f200140e = f9Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.util.Pair pair;
        synchronized (this.f200141f) {
            java.util.Iterator it = com.tencent.mm.ui.chatting.component.xm.f200249t.entrySet().iterator();
            pair = it.hasNext() ? (android.util.Pair) ((java.util.Map.Entry) it.next()).getValue() : null;
        }
        if (pair != null) {
            com.tencent.mm.ui.chatting.component.xm xmVar = this.f200141f;
            if (xmVar.f200254f) {
                xmVar.m0(4);
            }
            this.f200141f.p0((com.tencent.mm.storage.f9) pair.first, false, ((java.lang.Integer) pair.second).intValue(), 0);
            return;
        }
        if (this.f200139d != -1) {
            com.tencent.mm.storage.f9 item = ((com.tencent.mm.ui.chatting.adapter.k) ((sb5.z) this.f200141f.f198580d.f460708c.a(sb5.z.class))).getItem(this.f200139d + 1);
            if (item != null && item.g3() && item.A0() == 0) {
                com.tencent.mm.ui.chatting.component.xm xmVar2 = this.f200141f;
                if (xmVar2.f200256h) {
                    xmVar2.f200256h = false;
                    xmVar2.m0(2);
                    new com.tencent.mm.autogen.events.VoicePlayStopEvent().b(android.os.Looper.getMainLooper());
                    return;
                }
            }
            if (item != null && item.g3() && item.A0() == 0 && !w21.x0.n(item)) {
                com.tencent.mm.ui.chatting.component.xm xmVar3 = this.f200141f;
                if (!xmVar3.f200254f) {
                    ((java.util.ArrayList) xmVar3.f200257i).add(java.lang.Long.valueOf(this.f200140e.getMsgId()));
                }
                com.tencent.mm.ui.chatting.component.xm xmVar4 = this.f200141f;
                xmVar4.f200254f = true;
                ((java.util.ArrayList) xmVar4.f200257i).add(java.lang.Long.valueOf(item.getMsgId()));
                w21.x0.q(item);
                this.f200141f.p0(item, false, this.f200139d + 1, 0);
                return;
            }
            this.f200141f.m0(0);
        }
        new com.tencent.mm.autogen.events.VoicePlayStopEvent().b(android.os.Looper.getMainLooper());
    }
}
