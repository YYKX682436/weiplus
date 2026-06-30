package ih0;

/* loaded from: classes12.dex */
public class m extends com.tencent.mm.sdk.event.n implements o72.h4 {

    /* renamed from: d, reason: collision with root package name */
    public static ih0.m f291481d;

    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        o72.g4 zj6 = ((com.tencent.mm.plugin.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).zj();
        if (f291481d == null) {
            synchronized (s72.r0.class) {
                if (f291481d == null) {
                    f291481d = new ih0.m();
                }
            }
        }
        ih0.m cbs = f291481d;
        kotlin.jvm.internal.o.g(cbs, "cbs");
        ((s72.p0) zj6).f404130p = cbs;
        return true;
    }
}
