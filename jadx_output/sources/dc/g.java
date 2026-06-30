package dc;

/* loaded from: classes16.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f228616a = new java.util.HashSet(java.util.Arrays.asList(java.lang.Boolean.class.getName(), java.lang.Character.class.getName(), java.lang.Float.class.getName(), java.lang.Double.class.getName(), java.lang.Byte.class.getName(), java.lang.Short.class.getName(), java.lang.Integer.class.getName(), java.lang.Long.class.getName()));

    public static java.lang.String a(java.lang.Object obj) {
        dc.j jVar = (dc.j) obj;
        java.util.List m17 = ((dc.c) jVar).m();
        java.lang.Integer num = (java.lang.Integer) b(m17, "count");
        vi.b.a(num, "count");
        if (num.intValue() == 0) {
            return "";
        }
        java.lang.Object b17 = b(m17, "value");
        vi.b.a(b17, "value");
        boolean z17 = b17 instanceof dc.a;
        boolean z18 = true;
        if (!(z17 && ((dc.a) b17).f228599h == dc.q.CHAR)) {
            if (!(z17 && ((dc.a) b17).f228599h == dc.q.BYTE)) {
                throw new java.lang.UnsupportedOperationException("Could not find char array in " + jVar);
            }
            dc.a aVar = (dc.a) b17;
            try {
                java.lang.Class cls = java.lang.Integer.TYPE;
                java.lang.reflect.Method declaredMethod = dc.a.class.getDeclaredMethod("m", cls, cls);
                declaredMethod.setAccessible(true);
                return new java.lang.String((byte[]) declaredMethod.invoke(aVar, 0, num), java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c));
            } catch (java.lang.IllegalAccessException e17) {
                throw new java.lang.RuntimeException(e17);
            } catch (java.lang.NoSuchMethodException e18) {
                throw new java.lang.RuntimeException(e18);
            } catch (java.lang.reflect.InvocationTargetException e19) {
                throw new java.lang.RuntimeException(e19);
            }
        }
        dc.a aVar2 = (dc.a) b17;
        java.lang.Integer num2 = 0;
        java.util.Iterator it = ((java.util.ArrayList) m17).iterator();
        while (true) {
            if (!it.hasNext()) {
                z18 = false;
                break;
            }
            if (((dc.b) it.next()).f228602a.f228615b.equals("offset")) {
                break;
            }
        }
        if (z18) {
            num2 = (java.lang.Integer) b(m17, "offset");
            vi.b.a(num2, "offset");
        }
        int intValue = num2.intValue();
        int intValue2 = num.intValue();
        java.nio.CharBuffer asCharBuffer = java.nio.ByteBuffer.wrap(aVar2.m(intValue, intValue2)).order(ec.a.f250925a).asCharBuffer();
        char[] cArr = new char[intValue2];
        asCharBuffer.get(cArr);
        return new java.lang.String(cArr);
    }

    public static java.lang.Object b(java.util.List list, java.lang.String str) {
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            dc.b bVar = (dc.b) it.next();
            if (bVar.f228602a.f228615b.equals(str)) {
                return bVar.f228603b;
            }
        }
        throw new java.lang.IllegalArgumentException("Field " + str + " does not exists");
    }
}
