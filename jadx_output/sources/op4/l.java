package op4;

/* loaded from: classes10.dex */
public final class l extends yt3.a implements ju3.d0 {

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Intent f347292f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f347293g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ju3.d0 status, android.content.Intent intent) {
        super(status, null);
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f347292f = intent;
        this.f347293g = new java.util.HashMap();
    }

    public final op4.k A(java.lang.String reportId) {
        kotlin.jvm.internal.o.g(reportId, "reportId");
        java.util.HashMap hashMap = this.f347293g;
        if (hashMap.get(reportId) == null) {
            return null;
        }
        java.lang.Object obj = hashMap.get(reportId);
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type T of com.tencent.mm.plugin.vlog.ui.timelineeditor.report.TimelineEditorReportPlugin.getReportInfo");
        return (op4.k) obj;
    }

    @Override // yt3.r2
    public void onPause() {
        java.util.Iterator it = this.f347293g.entrySet().iterator();
        while (it.hasNext()) {
            ((op4.k) ((java.util.Map.Entry) it.next()).getValue()).b();
        }
    }

    @Override // yt3.r2
    public void onResume() {
        java.util.Iterator it = this.f347293g.entrySet().iterator();
        while (it.hasNext()) {
            ((op4.k) ((java.util.Map.Entry) it.next()).getValue()).c();
        }
    }

    @Override // yt3.r2
    public void release() {
        this.f347293g.clear();
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(status, "status");
        java.util.Iterator it = this.f347293g.entrySet().iterator();
        while (it.hasNext()) {
            ((op4.k) ((java.util.Map.Entry) it.next()).getValue()).w(status, bundle);
        }
    }

    public final void z(op4.k info) {
        kotlin.jvm.internal.o.g(info, "info");
        this.f347293g.put(info.g(), info);
        info.a(this.f347292f);
    }
}
