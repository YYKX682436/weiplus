package d0;

/* loaded from: classes14.dex */
public final class i implements d0.e {

    /* renamed from: a, reason: collision with root package name */
    public final float f225139a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f225140b;

    /* renamed from: c, reason: collision with root package name */
    public final yz5.p f225141c;

    /* renamed from: d, reason: collision with root package name */
    public final float f225142d;

    public i(float f17, boolean z17, yz5.p pVar, kotlin.jvm.internal.i iVar) {
        this.f225139a = f17;
        this.f225140b = z17;
        this.f225141c = pVar;
        this.f225142d = f17;
    }

    @Override // d0.d, d0.l
    public float a() {
        return this.f225142d;
    }

    @Override // d0.l
    public void b(p2.f fVar, int i17, int[] sizes, int[] outPositions) {
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(sizes, "sizes");
        kotlin.jvm.internal.o.g(outPositions, "outPositions");
        c(fVar, i17, sizes, p2.s.Ltr, outPositions);
    }

    @Override // d0.d
    public void c(p2.f fVar, int i17, int[] sizes, p2.s layoutDirection, int[] outPositions) {
        int i18;
        int i19;
        kotlin.jvm.internal.o.g(fVar, "<this>");
        kotlin.jvm.internal.o.g(sizes, "sizes");
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        kotlin.jvm.internal.o.g(outPositions, "outPositions");
        if (sizes.length == 0) {
            return;
        }
        int G = fVar.G(this.f225139a);
        boolean z17 = this.f225140b && layoutDirection == p2.s.Rtl;
        d0.p pVar = d0.p.f225183a;
        if (z17) {
            i18 = 0;
            i19 = 0;
            for (int length = sizes.length - 1; -1 < length; length--) {
                int i27 = sizes[length];
                int min = java.lang.Math.min(i18, i17 - i27);
                outPositions[length] = min;
                i19 = java.lang.Math.min(G, (i17 - min) - i27);
                i18 = outPositions[length] + i27 + i19;
            }
        } else {
            int length2 = sizes.length;
            int i28 = 0;
            i18 = 0;
            i19 = 0;
            int i29 = 0;
            while (i28 < length2) {
                int i37 = sizes[i28];
                int min2 = java.lang.Math.min(i18, i17 - i37);
                outPositions[i29] = min2;
                int min3 = java.lang.Math.min(G, (i17 - min2) - i37);
                int i38 = outPositions[i29] + i37 + min3;
                i28++;
                i29++;
                i19 = min3;
                i18 = i38;
            }
        }
        int i39 = i18 - i19;
        yz5.p pVar2 = this.f225141c;
        if (pVar2 == null || i39 >= i17) {
            return;
        }
        int intValue = ((java.lang.Number) pVar2.invoke(java.lang.Integer.valueOf(i17 - i39), layoutDirection)).intValue();
        int length3 = outPositions.length;
        for (int i47 = 0; i47 < length3; i47++) {
            outPositions[i47] = outPositions[i47] + intValue;
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0.i)) {
            return false;
        }
        d0.i iVar = (d0.i) obj;
        return p2.h.a(this.f225139a, iVar.f225139a) && this.f225140b == iVar.f225140b && kotlin.jvm.internal.o.b(this.f225141c, iVar.f225141c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = java.lang.Float.hashCode(this.f225139a) * 31;
        boolean z17 = this.f225140b;
        int i17 = z17;
        if (z17 != 0) {
            i17 = 1;
        }
        int i18 = (hashCode + i17) * 31;
        yz5.p pVar = this.f225141c;
        return i18 + (pVar == null ? 0 : pVar.hashCode());
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f225140b ? "" : "Absolute");
        sb6.append("Arrangement#spacedAligned(");
        sb6.append((java.lang.Object) p2.h.b(this.f225139a));
        sb6.append(", ");
        sb6.append(this.f225141c);
        sb6.append(')');
        return sb6.toString();
    }
}
