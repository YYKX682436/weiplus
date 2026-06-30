package ke5;

/* loaded from: classes9.dex */
public final class g implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ke5.i f307086d;

    public g(ke5.i iVar) {
        this.f307086d = iVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ke5.i iVar = this.f307086d;
        iVar.getClass();
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(iVar.f307089j);
        yb5.d dVar = iVar.f307088i;
        if (((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) dVar.f460708c.a(sb5.p.class))).t0()) {
            long r07 = ((com.tencent.mm.ui.chatting.component.y2) ((sb5.p) dVar.f460708c.a(sb5.p.class))).r0();
            if (r07 > 0) {
                long c17 = c01.id.c() - r07;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingBizContactDataPresenter", "[ChattingNormalDataSource] caseTime:%d, createTime:%d, createTimeLimit:%d", java.lang.Long.valueOf(c17), java.lang.Long.valueOf(m07), java.lang.Long.valueOf(r07));
                if (c17 > m07) {
                    m07 = c17;
                }
            }
        }
        return java.lang.Long.valueOf(m07);
    }
}
