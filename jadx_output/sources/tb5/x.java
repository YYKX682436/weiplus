package tb5;

/* loaded from: classes12.dex */
public final class x implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tb5.y f417102d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f417103e;

    public x(tb5.y yVar, java.lang.String str) {
        this.f417102d = yVar;
        this.f417103e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        tb5.v vVar = this.f417102d.f417105f;
        java.lang.String talker = this.f417103e;
        kotlin.jvm.internal.o.f(talker, "$talker");
        vVar.getClass();
        tb5.j jVar = vVar.f417092i;
        jVar.getClass();
        java.util.ArrayList arrayList = jVar.f417056a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList);
        java.util.ArrayList arrayList3 = jVar.f417057b;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(arrayList3);
        java.util.ArrayList arrayList5 = jVar.f417058c;
        tb5.j jVar2 = new tb5.j(arrayList2, arrayList4, new java.util.ArrayList(arrayList5));
        tb5.d a17 = tb5.d.a(vVar.f417090g, 0.0f, 0.0f, 0.0f, 0L, 15, null);
        tb5.d a18 = tb5.d.a(vVar.f417091h, 0.0f, 0.0f, 0.0f, 0L, 15, null);
        java.util.HashMap hashMap = vVar.f417093j;
        java.util.HashMap hashMap2 = new java.util.HashMap(hashMap);
        java.util.HashMap hashMap3 = vVar.f417094k;
        java.util.HashMap hashMap4 = new java.util.HashMap(hashMap3);
        java.util.HashMap hashMap5 = vVar.f417095l;
        java.util.HashMap hashMap6 = new java.util.HashMap(hashMap5);
        java.util.HashMap hashMap7 = vVar.f417096m;
        java.util.HashMap hashMap8 = new java.util.HashMap(hashMap7);
        java.util.ArrayList arrayList6 = vVar.f417097n;
        java.util.ArrayList arrayList7 = new java.util.ArrayList(arrayList6);
        tb5.f fVar = vVar.f417099p;
        pm0.v.K(null, new tb5.t(hashMap2, hashMap4, hashMap6, hashMap8, arrayList7, jVar2, a17, a18, new tb5.f(fVar.f417049a), talker, vVar));
        tb5.d dVar = vVar.f417090g;
        dVar.f417038a = 0.0f;
        dVar.f417039b = 0.0f;
        dVar.f417041d = 0L;
        dVar.f417040c = 0.0f;
        tb5.d dVar2 = vVar.f417091h;
        dVar2.f417038a = 0.0f;
        dVar2.f417039b = 0.0f;
        dVar2.f417041d = 0L;
        dVar2.f417040c = 0.0f;
        arrayList.clear();
        arrayList3.clear();
        arrayList5.clear();
        hashMap.clear();
        hashMap3.clear();
        hashMap5.clear();
        hashMap7.clear();
        arrayList6.clear();
        fVar.f417049a = new java.util.LinkedHashMap();
    }
}
