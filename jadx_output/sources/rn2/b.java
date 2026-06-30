package rn2;

/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f397644a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f397645b;

    /* renamed from: c, reason: collision with root package name */
    public final int f397646c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f397647d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f397648e;

    /* renamed from: f, reason: collision with root package name */
    public final int f397649f;

    /* renamed from: g, reason: collision with root package name */
    public int f397650g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f397651h;

    public b(java.lang.String title, java.lang.String desc, int i17, boolean z17, boolean z18, int i18, int i19, java.lang.String unableDesc) {
        kotlin.jvm.internal.o.g(title, "title");
        kotlin.jvm.internal.o.g(desc, "desc");
        kotlin.jvm.internal.o.g(unableDesc, "unableDesc");
        this.f397644a = title;
        this.f397645b = desc;
        this.f397646c = i17;
        this.f397647d = z17;
        this.f397648e = z18;
        this.f397649f = i18;
        this.f397650g = i19;
        this.f397651h = unableDesc;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rn2.b)) {
            return false;
        }
        rn2.b bVar = (rn2.b) obj;
        return kotlin.jvm.internal.o.b(this.f397644a, bVar.f397644a) && kotlin.jvm.internal.o.b(this.f397645b, bVar.f397645b) && this.f397646c == bVar.f397646c && this.f397647d == bVar.f397647d && this.f397648e == bVar.f397648e && this.f397649f == bVar.f397649f && this.f397650g == bVar.f397650g && kotlin.jvm.internal.o.b(this.f397651h, bVar.f397651h);
    }

    public int hashCode() {
        return (((((((((((((this.f397644a.hashCode() * 31) + this.f397645b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f397646c)) * 31) + java.lang.Boolean.hashCode(this.f397647d)) * 31) + java.lang.Boolean.hashCode(this.f397648e)) * 31) + java.lang.Integer.hashCode(this.f397649f)) * 31) + java.lang.Integer.hashCode(this.f397650g)) * 31) + this.f397651h.hashCode();
    }

    public java.lang.String toString() {
        return "title:" + this.f397644a + "-:desc:" + this.f397645b + "-type:" + this.f397646c + "-state:" + this.f397647d + "-choose:" + this.f397648e + "-timeLimit:" + this.f397649f;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(java.lang.String r10, java.lang.String r11, int r12, boolean r13, boolean r14, int r15, int r16, java.lang.String r17, int r18, kotlin.jvm.internal.i r19) {
        /*
            r9 = this;
            r0 = r18
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r10
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r11
        L12:
            r4 = r0 & 4
            r5 = 0
            if (r4 == 0) goto L19
            r4 = r5
            goto L1a
        L19:
            r4 = r12
        L1a:
            r6 = r0 & 8
            if (r6 == 0) goto L20
            r6 = r5
            goto L21
        L20:
            r6 = r13
        L21:
            r7 = r0 & 16
            if (r7 == 0) goto L26
            goto L27
        L26:
            r5 = r14
        L27:
            r7 = r0 & 32
            if (r7 == 0) goto L33
            rn2.a r7 = rn2.e.f397695r
            r7.getClass()
            int r7 = rn2.e.f397696s
            goto L34
        L33:
            r7 = r15
        L34:
            r8 = r0 & 64
            if (r8 == 0) goto L3b
            r8 = 180(0xb4, float:2.52E-43)
            goto L3d
        L3b:
            r8 = r16
        L3d:
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L42
            goto L44
        L42:
            r2 = r17
        L44:
            r10 = r9
            r11 = r1
            r12 = r3
            r13 = r4
            r14 = r6
            r15 = r5
            r16 = r7
            r17 = r8
            r18 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rn2.b.<init>(java.lang.String, java.lang.String, int, boolean, boolean, int, int, java.lang.String, int, kotlin.jvm.internal.i):void");
    }
}
