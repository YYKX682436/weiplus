package tf3;

/* loaded from: classes12.dex */
public abstract class b extends lf3.n implements sf3.f {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f418946d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f418947e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f418948f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f418946d = new java.util.LinkedHashMap();
        this.f418947e = new java.util.LinkedHashMap();
        this.f418948f = new com.tencent.mm.sdk.coroutines.LifecycleScope("ScopeImageStateManager", activity, 1);
    }

    @Override // sf3.f
    public sf3.k Q3(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        sf3.k kVar = (sf3.k) ((java.util.LinkedHashMap) this.f418946d).get(mediaInfo.getId());
        return kVar == null ? sf3.k.f407400h : kVar;
    }

    public abstract void V6();

    public void W4(mf3.k mediaInfo, sf3.l listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f418947e.put(mediaInfo.getId(), new java.lang.ref.WeakReference(listener));
    }

    public final void W6(mf3.k kVar, sf3.k state, sf3.g param) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(param, "param");
        java.lang.String id6 = kVar.getId();
        this.f418946d.put(id6, state);
        com.tencent.mars.xlog.Log.e("MediaGallery.ScopeImageStateManager", "update stateMap: id: " + id6 + ", state: " + state.name());
        java.util.Map map = this.f418947e;
        if (!map.containsKey(id6)) {
            com.tencent.mars.xlog.Log.e("MediaGallery.ScopeImageStateManager", "notify listener error, cannot find with id: " + id6 + " , state: " + state.name());
            return;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) map).get(id6);
        sf3.l lVar = weakReference != null ? (sf3.l) weakReference.get() : null;
        if (lVar != null) {
            v65.i.c(this.f418948f, null, new tf3.a(id6, state, lVar, param, kVar, null), 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.e("MediaGallery.ScopeImageStateManager", "notify listener error, weak ref is invalid: " + id6 + " , state: " + state.name());
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((java.util.LinkedHashMap) this.f418947e).clear();
        V6();
    }
}
