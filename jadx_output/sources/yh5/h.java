package yh5;

/* loaded from: classes12.dex */
public final class h implements mf3.k, zh5.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final bw1.l f462436a;

    public h(bw1.l analyseItem) {
        kotlin.jvm.internal.o.g(analyseItem, "analyseItem");
        this.f462436a = analyseItem;
    }

    @Override // mf3.k
    public gg3.c a() {
        java.lang.String id6 = getId();
        bw1.l lVar = this.f462436a;
        java.lang.String str = lVar.f24811c;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = lVar.f24812d;
        java.lang.String str3 = str2 != null ? str2 : "";
        int i17 = lVar.f24819k;
        return new gg3.c(id6, str, str3, null, i17 < 0 ? 0L : i17 * 1000, false, 40, null);
    }

    @Override // zh5.j0
    public java.lang.String b() {
        return null;
    }

    @Override // mf3.k
    public eg3.i c() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if ((r0.length() > 0) != false) goto L13;
     */
    @Override // mf3.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sf3.g e() {
        /*
            r11 = this;
            bw1.l r0 = r11.f462436a
            int r1 = r0.f24810b
            r2 = 3
            if (r1 != r2) goto L3c
            java.lang.String r0 = r0.f24811c
            r1 = 0
            if (r0 == 0) goto L18
            int r2 = r0.length()
            if (r2 <= 0) goto L14
            r2 = 1
            goto L15
        L14:
            r2 = 0
        L15:
            if (r2 == 0) goto L18
            goto L19
        L18:
            r0 = r1
        L19:
            if (r0 != 0) goto L1c
            return r1
        L1c:
            java.lang.String r4 = r11.getId()
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            sf3.m r1 = sf3.m.f407406h
            r3.put(r1, r0)
            sf3.g r0 = new sf3.g
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 60
            r10 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            sf3.g r0 = r0.a(r1)
            return r0
        L3c:
            java.lang.String r3 = r11.getId()
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            sf3.m r10 = sf3.m.f407404f
            java.lang.String r0 = r0.f24812d
            java.lang.String r1 = "filePath"
            kotlin.jvm.internal.o.f(r0, r1)
            r2.put(r10, r0)
            sf3.g r0 = new sf3.g
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 60
            r9 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            sf3.g r0 = r0.a(r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yh5.h.e():sf3.g");
    }

    @Override // mf3.k
    public java.lang.String g() {
        java.lang.String filePath = this.f462436a.f24812d;
        kotlin.jvm.internal.o.f(filePath, "filePath");
        return filePath;
    }

    @Override // mf3.k
    public java.lang.String getId() {
        java.lang.String filePath = this.f462436a.f24812d;
        kotlin.jvm.internal.o.f(filePath, "filePath");
        return filePath;
    }

    @Override // mf3.k
    public mf3.u getType() {
        int i17 = this.f462436a.f24810b;
        return i17 == 3 ? mf3.u.f326124f : i17 == 1 ? mf3.u.f326123e : mf3.u.f326122d;
    }
}
