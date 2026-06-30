package jm;

@j95.b
/* loaded from: classes12.dex */
public final class y extends jm0.o implements qi3.y {

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f300258m = jz5.h.b(new jm.q(this));

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f300259n = jz5.h.b(jm.w.f300256d);

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f300260o = jz5.h.b(jm.x.f300257d);

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        set.add(hm.j.class);
        set.add(hm.f.class);
        set.add(hm.m.class);
    }

    public void Zi(qi3.a0 taskListener) {
        kotlin.jvm.internal.o.g(taskListener, "taskListener");
        v65.i.b(bj(), null, new jm.r(this, taskListener, null), 1, null);
    }

    public final java.util.HashMap aj() {
        return (java.util.HashMap) ((jz5.n) this.f300260o).getValue();
    }

    public final com.tencent.mm.sdk.coroutines.LifecycleScope bj() {
        return (com.tencent.mm.sdk.coroutines.LifecycleScope) ((jz5.n) this.f300258m).getValue();
    }

    public void cj(long j17, long j18, int i17, java.lang.String str, java.lang.Throwable th6) {
        com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct msgRefactorReportStruct = new com.tencent.mm.autogen.mmdata.rpt.MsgRefactorReportStruct();
        msgRefactorReportStruct.p("wcdb_lazy_cursor_leak");
        msgRefactorReportStruct.r("lazyId=" + j17 + "_ageMs=" + j18 + "_status=" + i17);
        msgRefactorReportStruct.s(str);
        msgRefactorReportStruct.f59285n = (int) j18;
        msgRefactorReportStruct.f59286o = i17;
        msgRefactorReportStruct.q(com.tencent.mm.sdk.platformtools.z.f193109e);
        msgRefactorReportStruct.k();
    }

    public void fj(qi3.a0 taskListener) {
        kotlin.jvm.internal.o.g(taskListener, "taskListener");
        v65.i.b(bj(), null, new jm.v(this, taskListener, null), 1, null);
    }
}
