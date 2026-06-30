package mi1;

/* loaded from: classes7.dex */
public final class j implements com.tencent.mm.plugin.appbrand.jsapi.w {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi1.v f326583d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mi1.l f326584e;

    public j(mi1.v vVar, mi1.l lVar) {
        this.f326583d = vVar;
        this.f326584e = lVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.w
    public final void onDestroy() {
        com.tencent.mm.plugin.appbrand.page.v5 page = this.f326584e.f326604d;
        mi1.v vVar = this.f326583d;
        mi1.l lVar = null;
        if (kotlin.jvm.internal.o.b(page, vVar.f326713l)) {
            vVar.f326713l = null;
        }
        mi1.m mVar = vVar.f326712k;
        mVar.getClass();
        kotlin.jvm.internal.o.g(page, "page");
        android.util.SparseArray sparseArray = mVar.f326616a;
        int indexOfKey = sparseArray.indexOfKey(page.hashCode());
        if (indexOfKey >= 0) {
            lVar = (mi1.l) sparseArray.valueAt(indexOfKey);
            sparseArray.removeAt(indexOfKey);
        }
        if (lVar != null) {
            lVar.r();
        }
    }
}
