package fk1;

/* loaded from: classes8.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI f263289d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f263290e;

    public s(com.tencent.mm.plugin.appbrand.ui.record.WAGameRecordShareUI wAGameRecordShareUI, java.lang.String str) {
        this.f263289d = wAGameRecordShareUI;
        this.f263290e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        db5.t7.g(this.f263289d, this.f263290e);
    }
}
