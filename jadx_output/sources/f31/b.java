package f31;

/* loaded from: classes9.dex */
public final class b implements o31.a {

    /* renamed from: a, reason: collision with root package name */
    public static final f31.b f259269a = new f31.b();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.WeakHashMap f259270b = new java.util.WeakHashMap();

    @Override // o31.a
    public int a(o31.d rr6, o31.b bVar, o31.e scene) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        kotlin.jvm.internal.o.g(scene, "scene");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        o31.c cVar = (o31.c) rr6;
        lVar.f70664a = cVar.f342667b;
        lVar.f70665b = cVar.f342668c;
        lVar.f70666c = cVar.f342670e;
        lVar.f70667d = cVar.f342669d;
        com.tencent.mm.modelbase.m1 b17 = com.tencent.mm.ipcinvoker.wx_extension.h0.b(lVar.a(), null, new f31.a(rr6, bVar, scene), null);
        if (b17 == null) {
            return 0;
        }
        java.util.WeakHashMap weakHashMap = f259270b;
        synchronized (weakHashMap) {
        }
        return 0;
    }

    public final void b(o31.e eVar) {
        com.tencent.mm.modelbase.m1 m1Var;
        if (eVar == null) {
            return;
        }
        java.util.WeakHashMap weakHashMap = f259270b;
        synchronized (weakHashMap) {
            m1Var = (com.tencent.mm.modelbase.m1) weakHashMap.remove(eVar);
        }
        if (m1Var != null) {
            com.tencent.mm.modelbase.z2.b(m1Var);
        }
    }
}
