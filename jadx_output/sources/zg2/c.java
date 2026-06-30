package zg2;

/* loaded from: classes3.dex */
public final class c implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.k0 f472819d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f472820e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zg2.d f472821f;

    public c(zg2.d dVar, androidx.lifecycle.k0 originObserver) {
        kotlin.jvm.internal.o.g(originObserver, "originObserver");
        this.f472821f = dVar;
        this.f472819d = originObserver;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        zg2.d dVar = this.f472821f;
        yz5.p pVar = dVar.f472822d;
        if (pVar != null ? ((java.lang.Boolean) pVar.invoke(this.f472820e, obj)).booleanValue() : kotlin.jvm.internal.o.b(this.f472820e, obj)) {
            dVar.getClass();
        } else {
            this.f472820e = obj;
            this.f472819d.onChanged(obj);
        }
    }
}
