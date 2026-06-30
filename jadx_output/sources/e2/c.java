package e2;

/* loaded from: classes13.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int[] f246461a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object[] f246462b;

    /* renamed from: c, reason: collision with root package name */
    public int f246463c;

    public c(int i17, int i18, kotlin.jvm.internal.i iVar) {
        i17 = (i18 & 1) != 0 ? 0 : i17;
        if (i17 == 0) {
            this.f246461a = e2.a.f246453a;
            this.f246462b = e2.a.f246454b;
        } else {
            this.f246461a = new int[i17];
            this.f246462b = new java.lang.Object[i17 << 1];
        }
        this.f246463c = 0;
    }

    public final int a(java.lang.Object key, int i17) {
        kotlin.jvm.internal.o.g(key, "key");
        int i18 = this.f246463c;
        if (i18 == 0) {
            return -1;
        }
        int a17 = e2.a.a(this.f246461a, i18, i17);
        if (a17 < 0 || kotlin.jvm.internal.o.b(key, this.f246462b[a17 << 1])) {
            return a17;
        }
        int i19 = a17 + 1;
        while (i19 < i18 && this.f246461a[i19] == i17) {
            if (kotlin.jvm.internal.o.b(key, this.f246462b[i19 << 1])) {
                return i19;
            }
            i19++;
        }
        for (int i27 = a17 - 1; i27 >= 0 && this.f246461a[i27] == i17; i27--) {
            if (kotlin.jvm.internal.o.b(key, this.f246462b[i27 << 1])) {
                return i27;
            }
        }
        return ~i19;
    }

    public final int b() {
        int i17 = this.f246463c;
        if (i17 == 0) {
            return -1;
        }
        int a17 = e2.a.a(this.f246461a, i17, 0);
        if (a17 < 0 || this.f246462b[a17 << 1] == null) {
            return a17;
        }
        int i18 = a17 + 1;
        while (i18 < i17 && this.f246461a[i18] == 0) {
            if (this.f246462b[i18 << 1] == null) {
                return i18;
            }
            i18++;
        }
        for (int i19 = a17 - 1; i19 >= 0 && this.f246461a[i19] == 0; i19--) {
            if (this.f246462b[i19 << 1] == null) {
                return i19;
            }
        }
        return ~i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        try {
            if (!(obj instanceof e2.c)) {
                if (!(obj instanceof java.util.Map) || this.f246463c != ((java.util.Map) obj).size()) {
                    return false;
                }
                int i17 = this.f246463c;
                for (int i18 = 0; i18 < i17; i18++) {
                    java.lang.Object[] objArr = this.f246462b;
                    int i19 = i18 << 1;
                    java.lang.Object obj2 = objArr[i19];
                    java.lang.Object obj3 = objArr[i19 + 1];
                    java.lang.Object obj4 = ((java.util.Map) obj).get(obj2);
                    if (obj3 == null) {
                        if (obj4 != null || !((java.util.Map) obj).containsKey(obj2)) {
                            return false;
                        }
                    } else if (!kotlin.jvm.internal.o.b(obj3, obj4)) {
                        return false;
                    }
                }
                return true;
            }
            e2.c cVar = (e2.c) obj;
            int i27 = this.f246463c;
            if (i27 != cVar.f246463c) {
                return false;
            }
            for (int i28 = 0; i28 < i27; i28++) {
                java.lang.Object[] objArr2 = this.f246462b;
                int i29 = i28 << 1;
                java.lang.Object obj5 = objArr2[i29];
                java.lang.Object obj6 = objArr2[i29 + 1];
                int b17 = obj5 == null ? cVar.b() : cVar.a(obj5, obj5.hashCode());
                java.lang.Object obj7 = b17 >= 0 ? cVar.f246462b[(b17 << 1) + 1] : null;
                if (obj6 == null) {
                    if (obj7 == null) {
                        if (!((obj5 == null ? cVar.b() : cVar.a(obj5, obj5.hashCode())) >= 0)) {
                        }
                    }
                    return false;
                }
                if (!kotlin.jvm.internal.o.b(obj6, obj7)) {
                    return false;
                }
            }
            return true;
        } catch (java.lang.ClassCastException | java.lang.NullPointerException unused) {
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f246461a;
        java.lang.Object[] objArr = this.f246462b;
        int i17 = this.f246463c;
        int i18 = 1;
        int i19 = 0;
        int i27 = 0;
        while (i19 < i17) {
            java.lang.Object obj = objArr[i18];
            i27 += (obj != null ? obj.hashCode() : 0) ^ iArr[i19];
            i19++;
            i18 += 2;
        }
        return i27;
    }

    public java.lang.String toString() {
        int i17 = this.f246463c;
        if (i17 <= 0) {
            return "{}";
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(i17 * 28);
        sb6.append('{');
        int i18 = this.f246463c;
        for (int i19 = 0; i19 < i18; i19++) {
            if (i19 > 0) {
                sb6.append(", ");
            }
            int i27 = i19 << 1;
            java.lang.Object obj = this.f246462b[i27];
            if (obj != this) {
                sb6.append(obj);
            } else {
                sb6.append("(this Map)");
            }
            sb6.append('=');
            java.lang.Object obj2 = this.f246462b[i27 + 1];
            if (obj2 != this) {
                sb6.append(obj2);
            } else {
                sb6.append("(this Map)");
            }
        }
        sb6.append('}');
        java.lang.String sb7 = sb6.toString();
        kotlin.jvm.internal.o.f(sb7, "buffer.toString()");
        return sb7;
    }
}
