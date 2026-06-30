package hf5;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f281241a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f281242b;

    public f(java.util.List languages, int i17, int i18, kotlin.jvm.internal.i iVar) {
        languages = (i18 & 1) != 0 ? kz5.p0.f313996d : languages;
        i17 = (i18 & 2) != 0 ? 4096 : i17;
        kotlin.jvm.internal.o.g(languages, "languages");
        this.f281241a = i17;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(languages, 10));
        java.util.Iterator it = languages.iterator();
        while (it.hasNext()) {
            arrayList.add(new hf5.l((gf5.n) it.next()));
        }
        this.f281242b = arrayList;
    }

    public final boolean a(gf5.b bVar, java.lang.String str) {
        if (bVar.f271377b.isEmpty()) {
            return false;
        }
        int ordinal = bVar.f271376a.ordinal();
        boolean z17 = bVar.f271379d;
        java.util.List list = bVar.f271377b;
        if (ordinal == 0) {
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return false;
            }
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (r26.n0.B(str, (java.lang.String) it.next(), z17)) {
                }
            }
            return false;
        }
        if (ordinal != 1) {
            if (ordinal != 2) {
                throw new jz5.j();
            }
            java.lang.String obj = r26.n0.w0(str).toString();
            if ((list instanceof java.util.Collection) && list.isEmpty()) {
                return false;
            }
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                if (r26.i0.y(obj, (java.lang.String) it6.next(), z17)) {
                }
            }
            return false;
        }
        if (!(list instanceof java.util.Collection) || !list.isEmpty()) {
            java.util.Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                if (!r26.n0.B(str, (java.lang.String) it7.next(), z17)) {
                    return false;
                }
            }
        }
        return true;
    }
}
