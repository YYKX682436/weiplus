package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class g6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f199080d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.h6 f199081e;

    public g6(com.tencent.mm.ui.chatting.component.h6 h6Var, java.util.Map map) {
        this.f199081e = h6Var;
        this.f199080d = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.Map map = this.f199080d;
        java.util.Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            long longValue = ((java.lang.Long) it.next()).longValue();
            com.tencent.mm.storage.f9 Li = pt0.f0.Li(((r45.k55) map.get(java.lang.Long.valueOf(longValue))).f378385d, longValue);
            if (Li.getMsgId() == longValue) {
                mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
                java.lang.String j17 = Li.j();
                ((lp3.l) jVar).getClass();
                r45.k55 e17 = bm5.d1.e(j17);
                r45.k55 n07 = this.f199081e.n0((r45.k55) map.get(java.lang.Long.valueOf(longValue)), e17);
                java.util.LinkedList linkedList = n07.f378386e;
                try {
                    if (linkedList.size() > 0) {
                        ((r45.l55) linkedList.getLast()).f379159n = 1;
                    }
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChattingPatMsgUpdateComponent", e18, "", new java.lang.Object[0]);
                }
                Li.d1(((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).mj(n07));
                Li.setType(922746929);
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(longValue, Li, true);
            }
        }
        map.clear();
    }
}
