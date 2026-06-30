package lo0;

/* loaded from: classes14.dex */
public final class v extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f320085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f320086f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f320087g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(java.lang.String str, java.util.Map map, java.util.HashMap hashMap, java.util.HashMap hashMap2) {
        super(1);
        this.f320084d = str;
        this.f320085e = map;
        this.f320086f = hashMap;
        this.f320087g = hashMap2;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        org.json.JSONObject itemObj = (org.json.JSONObject) obj;
        kotlin.jvm.internal.o.g(itemObj, "itemObj");
        try {
            lo0.k kVar = new lo0.k(itemObj, this.f320084d, this.f320085e);
            java.lang.String str = kVar.f320033p;
            java.util.HashMap hashMap = this.f320086f;
            java.util.List list = (java.util.List) hashMap.get(str);
            if (list == null) {
                list = new java.util.ArrayList();
                hashMap.put(str, list);
            }
            list.add(kVar);
            this.f320087g.put(kVar.f320018a, kVar);
        } catch (lo0.u unused) {
        }
        return jz5.f0.f302826a;
    }
}
