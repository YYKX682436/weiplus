package xf0;

/* loaded from: classes12.dex */
public final class w extends jm0.g implements xf0.e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(jm0.o service) {
        super(service);
        kotlin.jvm.internal.o.g(service, "service");
    }

    @Override // xf0.e
    public void L0(xf0.g event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (event.f454167b == xf0.h.f454171f) {
            dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
            xf0.i iVar = event.f454166a;
            java.lang.String str = iVar.f454183k;
            java.util.Map map = iVar.f454184l;
            ((cy1.a) rVar).Ej(str, map, 37131);
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoReceive.VideoReceiveReportFSC", "report " + iVar.f454183k + ' ' + map);
        }
    }
}
