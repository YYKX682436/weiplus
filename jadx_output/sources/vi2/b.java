package vi2;

/* loaded from: classes8.dex */
public final class b extends vi2.e {

    /* renamed from: e, reason: collision with root package name */
    public final int f437535e;

    /* renamed from: f, reason: collision with root package name */
    public final km2.q f437536f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f437537g;

    /* renamed from: h, reason: collision with root package name */
    public final int f437538h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.bh1 f437539i;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f437540m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f437541n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f437542o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(int r3, km2.q r4, boolean r5, int r6, r45.bh1 r7, boolean r8, boolean r9, boolean r10, int r11, kotlin.jvm.internal.i r12) {
        /*
            r2 = this;
            r12 = r11 & 2
            r0 = 0
            if (r12 == 0) goto L6
            r4 = r0
        L6:
            r12 = r11 & 4
            r1 = 0
            if (r12 == 0) goto Lc
            r5 = r1
        Lc:
            r12 = r11 & 8
            if (r12 == 0) goto L11
            r6 = r1
        L11:
            r12 = r11 & 16
            if (r12 == 0) goto L16
            r7 = r0
        L16:
            r12 = r11 & 32
            if (r12 == 0) goto L1b
            r8 = r1
        L1b:
            r12 = r11 & 64
            if (r12 == 0) goto L20
            r9 = r1
        L20:
            r11 = r11 & 128(0x80, float:1.8E-43)
            if (r11 == 0) goto L25
            r10 = r1
        L25:
            if (r4 == 0) goto L29
            r45.xn1 r0 = r4.f309187r
        L29:
            r2.<init>(r0)
            r2.f437535e = r3
            r2.f437536f = r4
            r2.f437537g = r5
            r2.f437538h = r6
            r2.f437539i = r7
            r2.f437540m = r8
            r2.f437541n = r9
            r2.f437542o = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: vi2.b.<init>(int, km2.q, boolean, int, r45.bh1, boolean, boolean, boolean, int, kotlin.jvm.internal.i):void");
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(vi2.b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.mic.pk.data.FinderLiveMicAnchorWidgetConvertData");
        vi2.b bVar = (vi2.b) obj;
        return this.f437535e == bVar.f437535e && this.f437537g == bVar.f437537g && this.f437538h == bVar.f437538h && kotlin.jvm.internal.o.b(this.f437539i, bVar.f437539i) && this.f437540m == bVar.f437540m && this.f437541n == bVar.f437541n && this.f437542o == bVar.f437542o;
    }

    @Override // vi2.e, in5.c
    public long getItemId() {
        return this.f437544d != null ? r0.hashCode() : hashCode();
    }

    @Override // vi2.e, in5.c
    public int h() {
        return this.f437535e;
    }

    public int hashCode() {
        return vi2.b.class.hashCode();
    }
}
