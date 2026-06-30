package zy1;

@j95.b
/* loaded from: classes4.dex */
public final class f extends i95.w implements dy1.s {
    public void Ai(int i17, java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        zy1.e.f477325a.c(i17, key);
    }

    public void Bi(int i17, java.lang.String key, int i18) {
        kotlin.jvm.internal.o.g(key, "key");
        zy1.e.f477325a.b(i17, key, i18);
    }

    public void Di(int i17, java.lang.String key, java.lang.String value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        zy1.e.f477325a.e(i17, key, value);
    }

    public void Ni(int i17, java.lang.String key) {
        kotlin.jvm.internal.o.g(key, "key");
        zy1.e.f477325a.d(i17, key);
    }

    public void Ri(int i17, java.lang.String key, java.lang.Object value) {
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        jx3.a a17 = zy1.e.f477325a.a(i17, true);
        if (a17 != null) {
            a17.j(key, value);
        }
        value.toString();
    }

    public void Ui(int i17, java.lang.String key, java.lang.String value) {
        java.lang.Object obj;
        jx3.a a17;
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(value, "value");
        zy1.e eVar = zy1.e.f477325a;
        java.util.HashSet hashSet = (java.util.HashSet) zy1.e.f477328d.get(i17);
        if (hashSet != null) {
            java.util.Iterator it = hashSet.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (kotlin.jvm.internal.o.b(((zy1.h) obj).f477332a, value)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            zy1.h hVar = (zy1.h) obj;
            if (hVar == null) {
                return;
            }
            java.util.HashSet hashSet2 = hVar.f477333b;
            if (hashSet2.isEmpty() || (a17 = eVar.a(i17, true)) == null) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            int i18 = 0;
            for (java.lang.Object obj2 : hashSet2) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                sb6.append((java.lang.String) obj2);
                if (i18 != hashSet2.size() - 1) {
                    sb6.append("|");
                }
                i18 = i19;
            }
            java.lang.String sb7 = sb6.toString();
            kotlin.jvm.internal.o.f(sb7, "toString(...)");
            a17.j(key, sb7);
        }
    }

    public java.lang.Object wi(int i17, java.lang.String key, java.lang.Object obj) {
        kotlin.jvm.internal.o.g(key, "key");
        jx3.a a17 = zy1.e.f477325a.a(i17, true);
        java.lang.Object f17 = a17 != null ? a17.f(key) : null;
        java.lang.Object obj2 = f17 != null ? f17 : null;
        return obj2 == null ? obj : obj2;
    }
}
