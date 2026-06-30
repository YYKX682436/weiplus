package sd5;

/* loaded from: classes9.dex */
public final class e extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd5.f f406707d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(sd5.f fVar) {
        super(0);
        this.f406707d = fVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        sd5.f fVar = this.f406707d;
        fVar.getClass();
        long m07 = ((com.tencent.mm.storage.x4) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Ni()).m0(fVar.f406709o);
        com.tencent.mm.ui.chatting.component.y2 y2Var = (com.tencent.mm.ui.chatting.component.y2) ((sb5.p) fVar.f406708n.f460708c.a(sb5.p.class));
        if (y2Var.t0()) {
            long r07 = y2Var.r0();
            if (r07 > 0) {
                long c17 = c01.id.c() - r07;
                com.tencent.mars.xlog.Log.i("MicroMsg.ChattingSearchDataPresenterV2", "[ChattingSearchDataSource] caseTime:%d, createTime:%d, createTimeLimit:%d", java.lang.Long.valueOf(c17), java.lang.Long.valueOf(m07), java.lang.Long.valueOf(r07));
                if (c17 > m07) {
                    m07 = c17;
                }
            }
        }
        return java.lang.Long.valueOf(m07);
    }
}
