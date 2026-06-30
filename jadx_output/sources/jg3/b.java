package jg3;

/* loaded from: classes12.dex */
public abstract class b extends lf3.n implements gg3.b {

    /* renamed from: d */
    public final java.util.Map f299653d;

    /* renamed from: e */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f299654e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f299653d = new java.util.LinkedHashMap();
        this.f299654e = new com.tencent.mm.sdk.coroutines.LifecycleScope("ScopeVideoStateManager", activity, 1);
    }

    public static /* synthetic */ void X6(jg3.b bVar, mf3.k kVar, gg3.d dVar, gg3.c cVar, gg3.e eVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyState");
        }
        if ((i17 & 4) != 0) {
            eVar = new gg3.e(null, 0, 0.0f, 7, null);
        }
        bVar.W6(kVar, dVar, cVar, eVar);
    }

    public abstract void V6();

    public final void W6(mf3.k kVar, gg3.d state, gg3.c param, gg3.e info) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(param, "param");
        kotlin.jvm.internal.o.g(info, "info");
        java.lang.String id6 = kVar.getId();
        java.util.Map map = this.f299653d;
        if (!map.containsKey(id6)) {
            com.tencent.mars.xlog.Log.e("MediaGallery.ScopeVideoStateManager", "notify listener error, cannot find with id: " + id6 + " , state: " + state.name());
            return;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) map).get(id6);
        gg3.f fVar = weakReference != null ? (gg3.f) weakReference.get() : null;
        if (fVar != null) {
            v65.i.c(this.f299654e, null, new jg3.a(id6, state, fVar, param, info, null), 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.e("MediaGallery.ScopeVideoStateManager", "notify listener error, weak ref is invalid: " + id6 + " , state: " + state.name());
    }

    public void a5(mf3.k mediaInfo, gg3.f listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f299653d.put(mediaInfo.getId(), new java.lang.ref.WeakReference(listener));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((java.util.LinkedHashMap) this.f299653d).clear();
        V6();
    }
}
