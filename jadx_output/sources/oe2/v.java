package oe2;

/* loaded from: classes8.dex */
public final class v implements s40.t0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dm.s4 f344784a;

    public v(dm.s4 s4Var) {
        this.f344784a = s4Var;
    }

    @Override // s40.t0
    public void onLiveStatusCallback(long j17, int i17, java.lang.Object obj) {
        rl2.v b17;
        oe2.x xVar = oe2.x.f344786a;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarDataEventReceiver", "checkAndInsert callback, " + pm0.v.u(j17) + ", status:" + i17 + ", sourceType:" + this.f344784a.field_sourceType);
        if (i17 != 1 || (b17 = oe2.x.b(oe2.x.f344786a)) == null) {
            return;
        }
        dm.s4 item = this.f344784a;
        kotlin.jvm.internal.o.g(item, "item");
        boolean insert = b17.insert(item);
        if (insert) {
            java.util.Vector vector = rl2.v.f397214g;
            synchronized (vector) {
                pm0.v.c0(vector, new rl2.s(item));
                vector.add(item);
            }
        }
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveTipsBarStorage", "insertLiveTipsBar " + item.field_hostRoomId + ", " + pm0.v.u(item.field_liveId) + " result:" + insert);
        fs.g.b(ps5.f.class, new rl2.t(item));
        java.lang.String field_hostRoomId = item.field_hostRoomId;
        kotlin.jvm.internal.o.f(field_hostRoomId, "field_hostRoomId");
        b17.J0(field_hostRoomId);
    }
}
