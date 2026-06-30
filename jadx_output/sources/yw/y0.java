package yw;

/* loaded from: classes11.dex */
public final class y0 extends com.tencent.mm.sdk.event.n {
    public y0() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.ExptChangeEvent event = (com.tencent.mm.autogen.events.ExptChangeEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_biz_timeline_ad_tools, 0) == 1) {
            com.tencent.wechat.mm.biz.g0 c17 = yw.q3.f466437a.c();
            if (c17 != null) {
                c17.o(1);
            }
        } else {
            com.tencent.wechat.mm.biz.g0 c18 = yw.q3.f466437a.c();
            if (c18 != null) {
                c18.o(0);
            }
        }
        return false;
    }
}
