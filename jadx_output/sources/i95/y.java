package i95;

/* loaded from: classes3.dex */
public abstract class y {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f289863a = new java.util.concurrent.ConcurrentHashMap(64);

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object[] f289864b = {null};

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Object[] f289865c = {null};

    public final i95.m a(java.lang.Class cls) {
        java.util.Map map = this.f289863a;
        i95.m mVar = (i95.m) ((java.util.concurrent.ConcurrentHashMap) map).get(cls);
        if (mVar != null) {
            return mVar;
        }
        java.lang.Iterable all = ((fs.c) fs.g.f(cls)).all();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((fs.e) all).iterator();
        while (it.hasNext()) {
            arrayList.add((fs.q) it.next());
        }
        if (arrayList.isEmpty()) {
            throw new com.tencent.mm.support.feature_service.ServiceNotFoundException("No FeatureService with api class '" + cls.getName() + "' register on current process.");
        }
        if (arrayList.size() <= 1) {
            i95.m mVar2 = (i95.m) ((fs.q) arrayList.get(0)).get();
            if (mVar2 != null) {
                ((java.util.concurrent.ConcurrentHashMap) map).put(cls, (i95.w) mVar2);
            }
            return mVar2;
        }
        throw new com.tencent.mm.support.feature_service.ServiceNotFoundException("More than one FeatureService implement '" + cls.getName() + "' on current process: " + arrayList);
    }
}
