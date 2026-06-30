package sd5;

/* loaded from: classes9.dex */
public final class c implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd5.d f406703d;

    public c(sd5.d dVar) {
        this.f406703d = dVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sd5.d dVar = this.f406703d;
        dVar.getClass();
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(dVar.f406705o);
        yb5.d dVar2 = dVar.f406704n;
        if (((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) dVar2.f460708c.a(sb5.p.class))).t0()) {
            long r07 = ((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) dVar2.f460708c.a(sb5.p.class))).r0();
            if (r07 > 0) {
                long c17 = c01.id.c() - r07;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingNormalDataPresenterV2", "[ChattingNormalDataSource] caseTime:%d, createTime:%d, createTimeLimit:%d", java.lang.Long.valueOf(c17), java.lang.Long.valueOf(m07), java.lang.Long.valueOf(r07));
                if (c17 > m07) {
                    m07 = c17;
                }
            }
        }
        return java.lang.Long.valueOf(m07);
    }
}
