package k16;

/* loaded from: classes16.dex */
public class d extends k16.e {

    /* renamed from: c, reason: collision with root package name */
    public final p16.w[] f303429c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public d(int r5, p16.w[] r6) {
        /*
            r4 = this;
            if (r6 == 0) goto L34
            int r0 = r6.length
            r1 = 1
            int r0 = r0 - r1
            if (r0 != 0) goto L8
            goto L12
        L8:
            r2 = 31
        La:
            if (r2 < 0) goto L1c
            int r3 = r1 << r2
            r3 = r3 & r0
            if (r3 == 0) goto L19
            int r1 = r1 + r2
        L12:
            r0 = 0
            r4.<init>(r5, r1, r0)
            r4.f303429c = r6
            return
        L19:
            int r2 = r2 + (-1)
            goto La
        L1c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Empty enum: "
            r0.<init>(r1)
            java.lang.Class r6 = r6.getClass()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.String r5 = "enumEntries"
            java.lang.String r6 = "kotlin/reflect/jvm/internal/impl/metadata/deserialization/Flags$EnumLiteFlagField"
            java.lang.String r0 = "bitWidth"
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r0}
            java.lang.String r6 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            java.lang.String r5 = java.lang.String.format(r6, r5)
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k16.d.<init>(int, p16.w[]):void");
    }

    @Override // k16.e
    public java.lang.Object c(int i17) {
        int i18 = (1 << this.f303431b) - 1;
        int i19 = this.f303430a;
        int i27 = (i17 & (i18 << i19)) >> i19;
        for (p16.w wVar : this.f303429c) {
            if (wVar.getNumber() == i27) {
                return wVar;
            }
        }
        return null;
    }
}
