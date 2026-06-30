package g75;

/* loaded from: classes10.dex */
public final class d extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g75.f f269358d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(g75.f fVar) {
        super(1);
        this.f269358d = fVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof g75.w)) {
            java.lang.System.currentTimeMillis();
            g75.f fVar = this.f269358d;
            java.lang.reflect.Method[] declaredMethods = fVar.getClass().getDeclaredMethods();
            kotlin.jvm.internal.o.f(declaredMethods, "getDeclaredMethods(...)");
            int length = declaredMethods.length;
            int i17 = 0;
            while (true) {
                jz5.g gVar = fVar.f269363b;
                if (i17 < length) {
                    java.lang.reflect.Method method = declaredMethods[i17];
                    if (method.isAnnotationPresent(h75.a.class) && method.getParameterTypes().length == 2) {
                        java.lang.Class<?> cls = method.getParameterTypes()[0];
                        java.lang.Class<?> cls2 = method.getParameterTypes()[1];
                        java.lang.Class<?> returnType = method.getReturnType();
                        if (!g75.z.class.isAssignableFrom(cls) || kotlin.jvm.internal.o.b(j75.b.class, cls2) || !j75.b.class.isAssignableFrom(cls2) || !j75.b.class.isAssignableFrom(returnType)) {
                            break;
                        }
                        ((java.util.HashMap) ((jz5.n) gVar).getValue()).put(cls2.getName(), method);
                    }
                    i17++;
                } else {
                    java.lang.System.currentTimeMillis();
                    java.util.HashMap hashMap = (java.util.HashMap) ((jz5.n) gVar).getValue();
                    java.util.ArrayList arrayList = new java.util.ArrayList(hashMap.size());
                    java.util.Iterator it = hashMap.entrySet().iterator();
                    while (it.hasNext()) {
                        arrayList.add(((java.lang.reflect.Method) ((java.util.Map.Entry) it.next()).getValue()).getName());
                    }
                    arrayList.toString();
                }
            }
            throw new java.lang.RuntimeException("Invalid Flow Method Define, Must like public BaseStateAction flowMethod(DemoAction demoAction)");
        }
        return jz5.f0.f302826a;
    }
}
