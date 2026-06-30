package vf3;

/* loaded from: classes12.dex */
public abstract class i extends lf3.n implements vf3.a {

    /* renamed from: d */
    public final java.util.Map f436399d;

    /* renamed from: e */
    public final java.util.Map f436400e;

    /* renamed from: f */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f436401f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f436399d = new java.util.LinkedHashMap();
        this.f436400e = new java.util.LinkedHashMap();
        this.f436401f = new com.tencent.mm.sdk.coroutines.LifecycleScope("ScopeLiveStateManager", activity, 1);
    }

    public static /* synthetic */ void Z6(vf3.i iVar, mf3.k kVar, vf3.e eVar, vf3.f fVar, gg3.c cVar, sf3.g gVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: notifyState");
        }
        iVar.Y6(kVar, eVar, (i17 & 2) != 0 ? new vf3.f(eVar, null, 0, 0.0f, 14, null) : fVar, (i17 & 4) != 0 ? null : cVar, (i17 & 8) != 0 ? null : gVar);
    }

    public abstract void V6();

    public final java.lang.String W6(mf3.k kVar) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        return kVar.getId() + '@' + kVar.getLevel().name();
    }

    public vf3.f X6(mf3.k mediaInfo) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        return (vf3.f) ((java.util.LinkedHashMap) this.f436400e).get(W6(mediaInfo));
    }

    public final void Y6(mf3.k kVar, vf3.e state, vf3.f info, gg3.c cVar, sf3.g gVar) {
        kotlin.jvm.internal.o.g(kVar, "<this>");
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(info, "info");
        if (cVar == null) {
            cVar = kVar.a();
        }
        gg3.c cVar2 = cVar;
        if (gVar == null) {
            gVar = kVar.e();
        }
        sf3.g gVar2 = gVar;
        if (cVar2 == null || gVar2 == null) {
            throw new java.lang.RuntimeException("live load param is null");
        }
        java.lang.String id6 = kVar.getId();
        info.f436389a = state;
        this.f436400e.put(W6(kVar), info);
        java.util.Map map = this.f436399d;
        if (!map.containsKey(id6)) {
            com.tencent.mars.xlog.Log.e("MediaGallery.ScopeLiveStateManager", "notify listener error, cannot find with id: " + id6 + " , state: " + state.name());
            return;
        }
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) ((java.util.LinkedHashMap) map).get(id6);
        vf3.g gVar3 = weakReference != null ? (vf3.g) weakReference.get() : null;
        if (gVar3 != null) {
            v65.i.c(this.f436401f, null, new vf3.h(id6, state, gVar3, cVar2, gVar2, info, null), 1, null);
            return;
        }
        com.tencent.mars.xlog.Log.e("MediaGallery.ScopeLiveStateManager", "notify listener error, weak ref is invalid: " + id6 + " , state: " + state.name());
    }

    public final void a7(mf3.k mediaInfo, vf3.g listener) {
        kotlin.jvm.internal.o.g(mediaInfo, "mediaInfo");
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f436399d.put(mediaInfo.getId(), new java.lang.ref.WeakReference(listener));
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((java.util.LinkedHashMap) this.f436399d).clear();
        V6();
    }
}
