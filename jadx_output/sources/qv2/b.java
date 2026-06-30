package qv2;

/* loaded from: classes10.dex */
public abstract class b extends ov2.e {

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.storage.FinderItem f366935h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f366936i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.plugin.finder.storage.FinderItem finderObj, java.lang.String taskId) {
        super(taskId);
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
        kotlin.jvm.internal.o.g(taskId, "taskId");
        this.f366935h = finderObj;
    }

    @Override // pv2.g
    public int a() {
        return 2;
    }

    @Override // pv2.m
    public void d(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        m().a().d(this.f366935h.isLongVideo());
    }

    @Override // pv2.m
    public void e(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
    }

    @Override // pv2.m
    public void f(pv2.g nextStage) {
        kotlin.jvm.internal.o.g(nextStage, "nextStage");
        m().a().d(this.f366935h.isLongVideo());
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x03a3, code lost:
    
        if (r2.f375904n.f374940f == false) goto L98;
     */
    @Override // ov2.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public pv2.g j() {
        /*
            Method dump skipped, instructions count: 1819
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qv2.b.j():pv2.g");
    }

    public void k(com.tencent.mm.plugin.vlog.model.z result, com.tencent.mm.plugin.finder.storage.FinderItem finderObj) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(finderObj, "finderObj");
    }

    public abstract com.tencent.mm.sdk.event.IListener l();

    public abstract com.tencent.mm.plugin.finder.report.k5 m();

    public long n() {
        return this.f366935h.getLocalId();
    }

    public abstract pv2.g o(boolean z17, boolean z18);

    public abstract java.lang.String p();

    public final java.lang.String q() {
        java.lang.String a17;
        r45.mb4 mb4Var = (r45.mb4) kz5.n0.Z(this.f366935h.getMediaList());
        return (mb4Var == null || (a17 = hc2.l0.a(mb4Var)) == null) ? "" : a17;
    }

    public void r() {
        ov2.e.i(this, "andr_Video_Compress_Begin", this.f366935h, 0, null, 12, null);
    }

    public void s() {
        ov2.e.i(this, "andr_Video_Compress_Suc", this.f366935h, 0, null, 12, null);
    }

    public abstract void t();

    public abstract void u();

    public void v(float f17) {
        if (f17 > 1.0f) {
            f17 = 1.0f;
        }
        int i17 = (int) (45 * f17);
        com.tencent.mars.xlog.Log.i(p(), "feed " + n() + " updateProgress  " + f17 + ", " + i17);
        com.tencent.mm.plugin.finder.storage.FinderItem finderItem = this.f366935h;
        if (finderItem.getPostInfo().getInteger(4) < i17) {
            finderItem.getPostInfo().set(4, java.lang.Integer.valueOf(i17));
            t();
        }
        com.tencent.mm.autogen.events.FeedPostProgressEvent feedPostProgressEvent = new com.tencent.mm.autogen.events.FeedPostProgressEvent();
        long n17 = n();
        am.ga gaVar = feedPostProgressEvent.f54250g;
        gaVar.f6749a = n17;
        gaVar.f6750b = finderItem.getPostInfo().getInteger(4);
        feedPostProgressEvent.e();
    }
}
