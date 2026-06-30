package fk1;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263271d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263272e;

    public f(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI, java.lang.String str) {
        this.f263271d = wAGameRecordShareUI;
        this.f263272e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        db5.t7.g(this.f263271d, this.f263272e);
    }
}
