package i06;

/* loaded from: classes15.dex */
public class g4 extends kotlin.jvm.internal.j0 {
    public static i06.u1 j(kotlin.jvm.internal.e eVar) {
        f06.f owner = eVar.getOwner();
        return owner instanceof i06.u1 ? (i06.u1) owner : i06.k.f286672e;
    }

    @Override // kotlin.jvm.internal.j0
    public f06.g a(kotlin.jvm.internal.l lVar) {
        i06.u1 container = j(lVar);
        java.lang.String name = lVar.getName();
        java.lang.String signature = lVar.getSignature();
        java.lang.Object boundReceiver = lVar.getBoundReceiver();
        kotlin.jvm.internal.o.g(container, "container");
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(signature, "signature");
        return new i06.y1(container, name, signature, null, boundReceiver);
    }

    @Override // kotlin.jvm.internal.j0
    public f06.d b(java.lang.Class cls) {
        return i06.h.a(cls);
    }

    @Override // kotlin.jvm.internal.j0
    public f06.f c(java.lang.Class jClass, java.lang.String str) {
        java.lang.Object putIfAbsent;
        i06.a aVar = i06.h.f286652a;
        kotlin.jvm.internal.o.g(jClass, "jClass");
        i06.i iVar = (i06.i) i06.h.f286653b;
        iVar.getClass();
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = iVar.f286658b;
        java.lang.Object obj = concurrentHashMap.get(jClass);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(jClass, (obj = iVar.f286657a.invoke(jClass)))) != null) {
            obj = putIfAbsent;
        }
        return (f06.f) obj;
    }

    @Override // kotlin.jvm.internal.j0
    public f06.j d(kotlin.jvm.internal.r rVar) {
        return new i06.b2(j(rVar), rVar.getName(), rVar.getSignature(), rVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.j0
    public f06.l e(kotlin.jvm.internal.t tVar) {
        return new i06.e2(j(tVar), tVar.getName(), tVar.getSignature(), tVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.j0
    public f06.s f(kotlin.jvm.internal.x xVar) {
        return new i06.y2(j(xVar), xVar.getName(), xVar.getSignature(), xVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.j0
    public f06.u g(kotlin.jvm.internal.z zVar) {
        return new i06.c3(j(zVar), zVar.getName(), zVar.getSignature(), zVar.getBoundReceiver());
    }

    @Override // kotlin.jvm.internal.j0
    public java.lang.String h(kotlin.jvm.internal.k kVar) {
        i06.y1 b17;
        kotlin.jvm.internal.o.g(kVar, "<this>");
        kotlin.Metadata metadata = (kotlin.Metadata) kVar.getClass().getAnnotation(kotlin.Metadata.class);
        i06.y1 y1Var = null;
        if (metadata != null) {
            java.lang.String[] d17 = metadata.d1();
            if (d17.length == 0) {
                d17 = null;
            }
            if (d17 != null) {
                java.lang.String[] strings = metadata.d2();
                m16.j jVar = m16.j.f322899a;
                kotlin.jvm.internal.o.g(strings, "strings");
                java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(m16.a.b(d17));
                m16.h g17 = m16.j.f322899a.g(byteArrayInputStream, strings);
                p16.d dVar = (p16.d) i16.j0.B;
                p16.l lVar = m16.j.f322900b;
                dVar.getClass();
                p16.h hVar = new p16.h(byteArrayInputStream);
                p16.h0 h0Var = (p16.h0) dVar.a(hVar, lVar);
                try {
                    hVar.a(0);
                    dVar.b(h0Var);
                    i16.j0 j0Var = (i16.j0) h0Var;
                    m16.g gVar = new m16.g(metadata.mv(), (metadata.xi() & 8) != 0);
                    java.lang.Class<?> cls = kVar.getClass();
                    i16.v1 v1Var = j0Var.f287539v;
                    kotlin.jvm.internal.o.f(v1Var, "getTypeTable(...)");
                    y1Var = new i06.y1(i06.k.f286672e, (o06.v1) i06.o4.f(cls, j0Var, g17, new k16.k(v1Var), gVar, h06.d.f277940d));
                } catch (p16.z e17) {
                    e17.f351371d = h0Var;
                    throw e17;
                }
            }
        }
        if (y1Var == null || (b17 = i06.o4.b(y1Var)) == null) {
            return super.h(kVar);
        }
        i06.j4 j4Var = i06.j4.f286670a;
        o06.n0 l17 = b17.l();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        j4Var.a(sb6, l17);
        java.util.List W = l17.W();
        kotlin.jvm.internal.o.f(W, "getValueParameters(...)");
        kz5.n0.f0(W, sb6, ", ", "(", ")", 0, null, i06.i4.f286663d, 48, null);
        sb6.append(" -> ");
        f26.o0 returnType = l17.getReturnType();
        kotlin.jvm.internal.o.d(returnType);
        sb6.append(j4Var.d(returnType));
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "toString(...)");
        return sb7;
    }

    @Override // kotlin.jvm.internal.j0
    public java.lang.String i(kotlin.jvm.internal.q qVar) {
        return h(qVar);
    }
}
