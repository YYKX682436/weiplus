package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class ga implements wf0.u1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ x72.b f200526d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f200527e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.la f200528f;

    public ga(com.tencent.mm.ui.chatting.la laVar, x72.b bVar, java.lang.Object obj) {
        this.f200528f = laVar;
        this.f200526d = bVar;
        this.f200527e = obj;
    }

    @Override // wf0.u1
    public void h(wf0.r1 r1Var) {
        x72.b bVar = this.f200526d;
        if (bVar.f452435d.z0().equals(r1Var.f445529a)) {
            ((vf0.y1) ((wf0.x1) i95.n0.c(wf0.x1.class))).getClass();
            java.lang.String str = r1Var.f445529a;
            t21.v2 h17 = t21.d3.h(str);
            com.tencent.mm.storage.f9 f9Var = bVar.f452435d;
            if (h17 == null || !h17.i()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavMsgHandle", "oreh downloadVideoAndFav fialed msgID:%d, fileName:%s", java.lang.Long.valueOf(f9Var.getMsgId()), str);
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FavMsgHandle", "oreh downloadVideoAndFav suc msgID:%d, fileName:%s", java.lang.Long.valueOf(f9Var.getMsgId()), str);
            ((vf0.w1) ((wf0.q1) i95.n0.c(wf0.q1.class))).getClass();
            t21.o2.Ui().A(this);
            new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).post(new com.tencent.mm.ui.chatting.fa(this));
        }
    }
}
