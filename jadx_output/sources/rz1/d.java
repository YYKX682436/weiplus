package rz1;

/* loaded from: classes.dex */
public final class d implements gy1.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.KotlinSampleUI f401792a;

    public d(com.tencent.mm.plugin.datareport.sample.KotlinSampleUI kotlinSampleUI) {
        this.f401792a = kotlinSampleUI;
    }

    @Override // gy1.d
    public final void a(java.lang.Object info) {
        kotlin.jvm.internal.o.g(info, "info");
        com.tencent.mars.xlog.Log.e(this.f401792a.d, "[obtainContextId] page info : " + info);
    }
}
