package yb5;

/* loaded from: classes9.dex */
public class c extends wa5.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f460705b;

    public c(yb5.d dVar) {
        this.f460705b = dVar;
    }

    @Override // wa5.a
    public void a(java.util.List list, java.util.Map map) {
        java.util.List<android.util.Pair> a17;
        if (list == null || list.size() <= 0) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = new java.util.HashMap();
        yb5.d dVar = this.f460705b;
        int lastVisiblePosition = dVar.p().getLastVisiblePosition();
        for (int firstVisiblePosition = dVar.p().getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
            android.view.View C = dVar.p().C(firstVisiblePosition, 0);
            if (C != null && (a17 = wa5.e.a(C)) != null) {
                for (android.util.Pair pair : a17) {
                    if (list.contains(pair.second)) {
                        arrayList.add((java.lang.String) pair.second);
                        if (map != null) {
                            map.containsKey(pair.second);
                            java.lang.Object obj = pair.second;
                            hashMap.put((java.lang.String) obj, (android.view.View) map.get(obj));
                        }
                    }
                }
            }
        }
        list.clear();
        list.addAll(arrayList);
        map.clear();
        map.putAll(hashMap);
    }

    @Override // wa5.a, android.app.SharedElementCallback
    public void onMapSharedElements(java.util.List list, java.util.Map map) {
        java.util.List<android.util.Pair> a17;
        if (list != null && list.size() > 0 && map != null) {
            map.clear();
            yb5.d dVar = this.f460705b;
            int lastVisiblePosition = dVar.p().getLastVisiblePosition();
            for (int firstVisiblePosition = dVar.p().getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
                android.view.View C = dVar.p().C(firstVisiblePosition, 0);
                if (C != null && (a17 = wa5.e.a(C)) != null) {
                    for (android.util.Pair pair : a17) {
                        if (list.contains(pair.second)) {
                            map.put((java.lang.String) pair.second, (android.view.View) pair.first);
                        }
                    }
                }
            }
        }
        super.onMapSharedElements(list, map);
    }

    @Override // wa5.a, android.app.SharedElementCallback
    public void onSharedElementsArrived(java.util.List list, java.util.List list2, android.app.SharedElementCallback.OnSharedElementsReadyListener onSharedElementsReadyListener) {
        super.onSharedElementsArrived(list, list2, onSharedElementsReadyListener);
    }
}
