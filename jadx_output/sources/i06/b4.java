package i06;

/* loaded from: classes16.dex */
public abstract class b4 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentMap f286609a = new java.util.concurrent.ConcurrentHashMap();

    public static final t06.k a(java.lang.Class cls) {
        e26.u uVar;
        java.lang.Throwable th6;
        q06.b bVar;
        q06.f fVar;
        kotlin.jvm.internal.o.g(cls, "<this>");
        java.lang.ClassLoader d17 = u06.i.d(cls);
        i06.p4 p4Var = new i06.p4(d17);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) f286609a;
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) concurrentHashMap.get(p4Var);
        if (weakReference != null) {
            t06.k kVar = (t06.k) weakReference.get();
            if (kVar != null) {
                return kVar;
            }
            concurrentHashMap.remove(p4Var, weakReference);
        }
        t06.h hVar = new t06.h(d17);
        java.lang.ClassLoader classLoader = jz5.f0.class.getClassLoader();
        kotlin.jvm.internal.o.f(classLoader, "getClassLoader(...)");
        t06.h hVar2 = new t06.h(classLoader);
        t06.d dVar = new t06.d(d17);
        java.lang.String moduleName = "runtime module for " + d17;
        t06.j jVar = t06.j.f414541b;
        t06.m mVar = t06.m.f414545a;
        kotlin.jvm.internal.o.g(moduleName, "moduleName");
        e26.u uVar2 = new e26.u("DeserializationComponentsForJava.ModuleData");
        n06.o oVar = new n06.o(uVar2, n06.j.f333988d);
        r06.x0 x0Var = new r06.x0(n16.g.m("<" + moduleName + '>'), uVar2, oVar, null, null, null, 56, null);
        e26.z zVar = uVar2.f247038a;
        zVar.lock();
        try {
            if (oVar.f314889a != null) {
                uVar = uVar2;
                th6 = null;
                try {
                    throw new java.lang.AssertionError("Built-ins module is already set: " + oVar.f314889a + " (attempting to reset to " + x0Var + ")");
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    try {
                        ((e26.j) uVar.f247039b).a(th);
                        throw th6;
                    } catch (java.lang.Throwable th8) {
                        zVar.unlock();
                        throw th8;
                    }
                }
            }
            oVar.f314889a = x0Var;
            zVar.unlock();
            oVar.f333998f = new n06.n(x0Var, true);
            g16.x xVar = new g16.x();
            a16.p pVar = new a16.p();
            o06.c1 c1Var = new o06.c1(uVar2, x0Var);
            g16.x0 x0Var2 = g16.x0.f267674a;
            y06.u uVar3 = y06.u.f458691a;
            i06.p4 p4Var2 = p4Var;
            y06.n nVar = y06.n.f458684a;
            java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
            y06.k kVar2 = y06.k.f458683a;
            kz5.p0 p0Var = kz5.p0.f313996d;
            x16.b bVar2 = new x16.b(uVar2, p0Var);
            o06.b2 b2Var = o06.b2.f341928a;
            w06.b bVar3 = w06.b.f441945a;
            l06.v vVar = new l06.v(x0Var, c1Var);
            x06.k0 k0Var = x06.k0.f451270d;
            x06.e eVar = new x06.e(k0Var);
            a16.e eVar2 = a16.e.f639a;
            f16.y0 y0Var = new f16.y0(new f16.j(eVar2));
            x06.x xVar2 = x06.x.f451335a;
            g26.u.f268014b.getClass();
            g26.v vVar2 = g26.t.f268013b;
            a16.k kVar3 = new a16.k(new a16.d(uVar2, dVar, hVar, xVar, uVar3, jVar, nVar, kVar2, bVar2, mVar, pVar, x0Var2, b2Var, bVar3, x0Var, vVar, eVar, y0Var, xVar2, eVar2, vVar2, k0Var, new g16.v(), null, 8388608, null));
            m16.g jvmMetadataVersion = m16.g.f322892g;
            kotlin.jvm.internal.o.g(jvmMetadataVersion, "jvmMetadataVersion");
            g16.y yVar = new g16.y(hVar, xVar);
            g16.t tVar = new g16.t(x0Var, c1Var, uVar2, hVar);
            tVar.f267665g = jvmMetadataVersion;
            b26.r rVar = b26.r.f17506a;
            b26.p pVar2 = b26.o.f17475a;
            java.util.List c17 = kz5.b0.c(f26.t.f259216a);
            l06.o oVar2 = x0Var.f368549g;
            n06.o oVar3 = oVar2 instanceof n06.o ? (n06.o) oVar2 : null;
            b26.i0 i0Var = b26.i0.f17447a;
            g16.z zVar2 = g16.z.f267677a;
            if (oVar3 == null || (bVar = oVar3.M()) == null) {
                bVar = q06.a.f359477a;
            }
            q06.b bVar4 = bVar;
            if (oVar3 == null || (fVar = oVar3.M()) == null) {
                fVar = q06.e.f359479a;
            }
            b26.q qVar = new b26.q(uVar2, x0Var, rVar, yVar, tVar, kVar3, i0Var, jVar, bVar3, zVar2, p0Var, c1Var, pVar2, bVar4, fVar, m16.j.f322900b, vVar2, new x16.b(uVar2, p0Var), c17, b26.g0.f17440a);
            xVar.f267673a = qVar;
            w16.c cVar = new w16.c(kVar3, nVar);
            pVar.f660a = cVar;
            n06.d0 d0Var = new n06.d0(uVar2, hVar2, x0Var, c1Var, oVar.M(), oVar.M(), rVar, vVar2, new x16.b(uVar2, p0Var));
            java.util.List z07 = kz5.z.z0(new r06.x0[]{x0Var});
            kz5.r0 r0Var = kz5.r0.f314002d;
            x0Var.f368552m = new r06.u0(z07, r0Var, p0Var, r0Var);
            x0Var.f368553n = new r06.u(kz5.c0.i(cVar.f442251a, d0Var), "CompositeProvider@RuntimeModuleData for " + x0Var);
            t06.k kVar4 = new t06.k(qVar, new t06.a(xVar, hVar), null);
            while (true) {
                i06.p4 p4Var3 = p4Var2;
                java.util.concurrent.ConcurrentHashMap concurrentHashMap3 = concurrentHashMap2;
                java.lang.ref.WeakReference weakReference2 = (java.lang.ref.WeakReference) concurrentHashMap3.putIfAbsent(p4Var3, new java.lang.ref.WeakReference(kVar4));
                if (weakReference2 == null) {
                    return kVar4;
                }
                t06.k kVar5 = (t06.k) weakReference2.get();
                if (kVar5 != null) {
                    return kVar5;
                }
                concurrentHashMap3.remove(p4Var3, weakReference2);
                p4Var2 = p4Var3;
                concurrentHashMap2 = concurrentHashMap3;
            }
        } catch (java.lang.Throwable th9) {
            th = th9;
            uVar = uVar2;
            th6 = null;
        }
    }
}
