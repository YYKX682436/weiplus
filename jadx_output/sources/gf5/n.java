package gf5;

/* loaded from: classes11.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f271408a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f271409b;

    /* renamed from: c, reason: collision with root package name */
    public final gf5.g f271410c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f271411d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f271412e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f271413f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f271414g;

    /* renamed from: h, reason: collision with root package name */
    public final gf5.t f271415h;

    /* renamed from: i, reason: collision with root package name */
    public final char f271416i;

    /* renamed from: j, reason: collision with root package name */
    public final gf5.o f271417j;

    /* renamed from: k, reason: collision with root package name */
    public final jz5.g f271418k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f271419l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f271420m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f271421n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f271422o;

    public n(java.lang.String name, boolean z17, gf5.g identifierConfig, java.util.List rules, java.util.Set extraIdentifierStartChars, java.util.Set extraIdentifierPartChars, java.util.Set lineBreakChars, gf5.t numberRule, char c17, gf5.o detectionProfile) {
        kotlin.jvm.internal.o.g(name, "name");
        kotlin.jvm.internal.o.g(identifierConfig, "identifierConfig");
        kotlin.jvm.internal.o.g(rules, "rules");
        kotlin.jvm.internal.o.g(extraIdentifierStartChars, "extraIdentifierStartChars");
        kotlin.jvm.internal.o.g(extraIdentifierPartChars, "extraIdentifierPartChars");
        kotlin.jvm.internal.o.g(lineBreakChars, "lineBreakChars");
        kotlin.jvm.internal.o.g(numberRule, "numberRule");
        kotlin.jvm.internal.o.g(detectionProfile, "detectionProfile");
        this.f271408a = name;
        this.f271409b = z17;
        this.f271410c = identifierConfig;
        this.f271411d = rules;
        this.f271412e = extraIdentifierStartChars;
        this.f271413f = extraIdentifierPartChars;
        this.f271414g = lineBreakChars;
        this.f271415h = numberRule;
        this.f271416i = c17;
        this.f271417j = detectionProfile;
        jz5.i iVar = jz5.i.f302831f;
        this.f271418k = jz5.h.a(iVar, new gf5.k(this));
        this.f271419l = jz5.h.a(iVar, new gf5.j(this));
        this.f271420m = jz5.h.a(iVar, new gf5.i(this));
        this.f271421n = jz5.h.a(iVar, new gf5.m(this));
        this.f271422o = jz5.h.a(iVar, new gf5.l(this));
    }

    public final java.lang.String a() {
        return this.f271408a;
    }

    public final gf5.t b() {
        return this.f271415h;
    }

    public final java.util.List c() {
        return this.f271411d;
    }

    public final boolean d(char c17) {
        return e(c17) || java.lang.Character.isDigit(c17) || ((java.util.Set) this.f271419l.getValue()).contains(java.lang.Character.valueOf(c17));
    }

    public final boolean e(char c17) {
        return c17 == '_' || java.lang.Character.isLetter(c17) || ((java.util.Set) this.f271418k.getValue()).contains(java.lang.Character.valueOf(c17));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.n)) {
            return false;
        }
        gf5.n nVar = (gf5.n) obj;
        return kotlin.jvm.internal.o.b(this.f271408a, nVar.f271408a) && this.f271409b == nVar.f271409b && kotlin.jvm.internal.o.b(this.f271410c, nVar.f271410c) && kotlin.jvm.internal.o.b(this.f271411d, nVar.f271411d) && kotlin.jvm.internal.o.b(this.f271412e, nVar.f271412e) && kotlin.jvm.internal.o.b(this.f271413f, nVar.f271413f) && kotlin.jvm.internal.o.b(this.f271414g, nVar.f271414g) && kotlin.jvm.internal.o.b(this.f271415h, nVar.f271415h) && this.f271416i == nVar.f271416i && kotlin.jvm.internal.o.b(this.f271417j, nVar.f271417j);
    }

    public final java.lang.String f(java.lang.String word) {
        kotlin.jvm.internal.o.g(word, "word");
        if (this.f271409b) {
            return word;
        }
        java.lang.String lowerCase = word.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.o.f(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public int hashCode() {
        return (((((((((((((((((this.f271408a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f271409b)) * 31) + this.f271410c.hashCode()) * 31) + this.f271411d.hashCode()) * 31) + this.f271412e.hashCode()) * 31) + this.f271413f.hashCode()) * 31) + this.f271414g.hashCode()) * 31) + this.f271415h.hashCode()) * 31) + java.lang.Character.hashCode(this.f271416i)) * 31) + this.f271417j.hashCode();
    }

    public java.lang.String toString() {
        return "LanguageDefinition(name=" + this.f271408a + ", caseSensitive=" + this.f271409b + ", identifierConfig=" + this.f271410c + ", rules=" + this.f271411d + ", extraIdentifierStartChars=" + this.f271412e + ", extraIdentifierPartChars=" + this.f271413f + ", lineBreakChars=" + this.f271414g + ", numberRule=" + this.f271415h + ", escapeChar=" + this.f271416i + ", detectionProfile=" + this.f271417j + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public n(java.lang.String r29, boolean r30, gf5.g r31, java.util.List r32, java.util.Set r33, java.util.Set r34, java.util.Set r35, gf5.t r36, char r37, gf5.o r38, int r39, kotlin.jvm.internal.i r40) {
        /*
            r28 = this;
            r0 = r39
            r1 = r0 & 2
            r2 = 1
            if (r1 == 0) goto L9
            r1 = r2
            goto Lb
        L9:
            r1 = r30
        Lb:
            r3 = r0 & 4
            r4 = 3
            r5 = 0
            if (r3 == 0) goto L17
            gf5.g r3 = new gf5.g
            r3.<init>(r5, r5, r4, r5)
            goto L19
        L17:
            r3 = r31
        L19:
            r6 = r0 & 8
            if (r6 == 0) goto L20
            kz5.p0 r6 = kz5.p0.f313996d
            goto L22
        L20:
            r6 = r32
        L22:
            r7 = r0 & 16
            kz5.r0 r8 = kz5.r0.f314002d
            if (r7 == 0) goto L2a
            r7 = r8
            goto L2c
        L2a:
            r7 = r33
        L2c:
            r9 = r0 & 32
            if (r9 == 0) goto L31
            goto L33
        L31:
            r8 = r34
        L33:
            r9 = r0 & 64
            if (r9 == 0) goto L50
            r9 = 2
            java.lang.Character[] r9 = new java.lang.Character[r9]
            r10 = 10
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            r11 = 0
            r9[r11] = r10
            r10 = 13
            java.lang.Character r10 = java.lang.Character.valueOf(r10)
            r9[r2] = r10
            java.util.Set r2 = kz5.z.D0(r9)
            goto L52
        L50:
            r2 = r35
        L52:
            r9 = r0 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L5c
            gf5.t r9 = new gf5.t
            r9.<init>(r5, r5, r4, r5)
            goto L5e
        L5c:
            r9 = r36
        L5e:
            r4 = r0 & 256(0x100, float:3.59E-43)
            if (r4 == 0) goto L65
            r4 = 92
            goto L67
        L65:
            r4 = r37
        L67:
            r0 = r0 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L87
            gf5.o r0 = new gf5.o
            r10 = r0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r18 = 0
            r20 = 0
            r22 = 0
            r24 = 0
            r25 = 0
            r26 = 511(0x1ff, float:7.16E-43)
            r27 = 0
            r10.<init>(r11, r13, r15, r16, r18, r20, r22, r24, r25, r26, r27)
            goto L89
        L87:
            r0 = r38
        L89:
            r30 = r28
            r31 = r29
            r32 = r1
            r33 = r3
            r34 = r6
            r35 = r7
            r36 = r8
            r37 = r2
            r38 = r9
            r39 = r4
            r40 = r0
            r30.<init>(r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gf5.n.<init>(java.lang.String, boolean, gf5.g, java.util.List, java.util.Set, java.util.Set, java.util.Set, gf5.t, char, gf5.o, int, kotlin.jvm.internal.i):void");
    }
}
