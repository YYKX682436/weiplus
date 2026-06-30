package y53;

/* loaded from: classes5.dex */
public final class t implements u53.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f459502a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u53.x f459503b;

    public t(java.util.List list, u53.x xVar) {
        this.f459502a = list;
        this.f459503b = xVar;
    }

    @Override // u53.x
    public final void a(java.util.Map map) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getContact] usernameList=");
        sb6.append(this.f459502a);
        sb6.append(" result=");
        kotlin.jvm.internal.o.d(map);
        java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
        for (java.util.Map.Entry entry : map.entrySet()) {
            arrayList.add(((java.lang.String) entry.getKey()) + '=' + ((y53.m) ((u53.u) entry.getValue())).field_nickname);
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("GameLife.ContactService", sb6.toString());
        this.f459503b.a(map);
    }
}
