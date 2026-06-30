package zg2;

/* loaded from: classes3.dex */
public final class e implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.k0 f472823d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f472824e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData f472825f;

    public e(com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData, androidx.lifecycle.k0 originObserver) {
        kotlin.jvm.internal.o.g(originObserver, "originObserver");
        this.f472825f = diffMutableLiveData;
        this.f472823d = originObserver;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.live.infrastructure.livedata.DiffMutableLiveData diffMutableLiveData = this.f472825f;
        yz5.p pVar = diffMutableLiveData.f111659e;
        if (pVar != null ? ((java.lang.Boolean) pVar.invoke(this.f472824e, obj)).booleanValue() : kotlin.jvm.internal.o.b(this.f472824e, obj)) {
            diffMutableLiveData.getClass();
        } else {
            this.f472824e = obj;
            this.f472823d.onChanged(obj);
        }
    }
}
