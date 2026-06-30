package y53;

/* loaded from: classes5.dex */
public final class r implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.HashMap f459497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u53.x f459498b;

    public r(java.util.HashMap hashMap, u53.x xVar) {
        this.f459497a = hashMap;
        this.f459498b = xVar;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        java.util.HashMap hashMap = this.f459497a;
        hashMap.putAll(map);
        this.f459498b.a(hashMap);
    }
}
