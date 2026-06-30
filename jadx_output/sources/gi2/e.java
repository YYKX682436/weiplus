package gi2;

/* loaded from: classes10.dex */
public abstract class e extends gi2.d {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f272269c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f272270d;

    /* renamed from: e, reason: collision with root package name */
    public final lj2.x0 f272271e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f272272f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f272273g;

    public e(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        this.f272269c = context;
        this.f272270d = pluginAbility;
        this.f272271e = service;
        this.f272272f = new java.util.HashMap();
        this.f272273g = new java.util.LinkedList();
        new android.graphics.Rect();
    }

    public final void e(java.util.LinkedList data) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(data, 10));
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(((xh2.a) it.next()).b());
        }
        java.util.HashMap hashMap = this.f272272f;
        java.util.Iterator it6 = hashMap.entrySet().iterator();
        com.tencent.mars.xlog.Log.i("FinderLiveMicBaseVoiceRoomAdapter", "checkRemoveCacheView before: " + hashMap.size());
        while (it6.hasNext()) {
            java.lang.Object key = ((java.util.Map.Entry) it6.next()).getKey();
            kotlin.jvm.internal.o.f(key, "<get-key>(...)");
            java.util.List f07 = r26.n0.f0((java.lang.String) key, new java.lang.String[]{"@"}, false, 0, 6, null);
            java.lang.String str = f07.isEmpty() ^ true ? (java.lang.String) f07.get(0) : "";
            java.lang.String str2 = str != null ? str : "";
            java.util.Iterator it7 = arrayList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it7.next();
                    if (kotlin.jvm.internal.o.b((java.lang.String) obj, str2)) {
                        break;
                    }
                }
            }
            if (obj == null) {
                it6.remove();
            }
        }
        com.tencent.mars.xlog.Log.i("FinderLiveMicBaseVoiceRoomAdapter", "checkRemoveCacheView after: " + hashMap.size());
    }

    public abstract android.view.View f(xh2.a aVar, int i17);

    public xh2.a g(int i17) {
        java.lang.Object obj = this.f272273g.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        return (xh2.a) obj;
    }

    public final int h(xh2.a aVar) {
        km2.q qVar = aVar.f454520a;
        if (kotlin.jvm.internal.o.b(qVar != null ? qVar.f309170a : null, this.f272270d.a0().p())) {
            return 1;
        }
        km2.q qVar2 = aVar.f454520a;
        if (qVar2 == null || aVar.f454521b.f454556h) {
            return (qVar2 == null && aVar.f454521b.f454556h) ? 3 : 0;
        }
        return 2;
    }

    public abstract java.lang.String i();

    public void j(java.util.LinkedList data, android.graphics.Rect viewRect) {
        kotlin.jvm.internal.o.g(data, "data");
        kotlin.jvm.internal.o.g(viewRect, "viewRect");
        com.tencent.mars.xlog.Log.i(i(), "updateData data: " + data);
        e(data);
        java.util.LinkedList linkedList = this.f272273g;
        linkedList.clear();
        linkedList.addAll(data);
        c();
    }
}
