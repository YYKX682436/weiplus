package pr3;

/* loaded from: classes8.dex */
public final class c extends pr3.e {

    /* renamed from: d, reason: collision with root package name */
    public final int f357953d;

    /* renamed from: e, reason: collision with root package name */
    public final int f357954e;

    /* renamed from: f, reason: collision with root package name */
    public int f357955f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.CharSequence f357956g;

    /* renamed from: h, reason: collision with root package name */
    public int f357957h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f357958i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.Integer f357959m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Integer f357960n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Integer f357961o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f357962p;

    /* renamed from: q, reason: collision with root package name */
    public pr3.f f357963q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.List f357964r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.p f357965s;

    /* renamed from: t, reason: collision with root package name */
    public yz5.a f357966t;

    public /* synthetic */ c(int i17, int i18, int i19, java.lang.CharSequence charSequence, int i27, boolean z17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str, pr3.f fVar, java.util.List list, yz5.p pVar, yz5.a aVar, int i28, kotlin.jvm.internal.i iVar) {
        this(i17, i18, (i28 & 4) != 0 ? i18 : i19, (i28 & 8) != 0 ? null : charSequence, (i28 & 16) != 0 ? Integer.MAX_VALUE : i27, (i28 & 32) != 0 ? false : z17, (i28 & 64) != 0 ? null : num, (i28 & 128) != 0 ? null : num2, (i28 & 256) != 0 ? null : num3, (i28 & 512) != 0 ? null : str, (i28 & 1024) != 0 ? pr3.f.f357972e : fVar, (i28 & 2048) != 0 ? kz5.p0.f313996d : list, (i28 & 4096) != 0 ? null : pVar, (i28 & 8192) != 0 ? pr3.b.f357952d : aVar);
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        if (other instanceof pr3.c) {
            if (this.f357953d == other.i()) {
                pr3.c cVar = (pr3.c) other;
                if (this.f357954e == cVar.f357954e && this.f357955f == cVar.f357955f && kotlin.jvm.internal.o.b(this.f357956g, cVar.f357956g) && this.f357957h == cVar.f357957h && this.f357958i == cVar.f357958i && kotlin.jvm.internal.o.b(this.f357959m, cVar.f357959m) && kotlin.jvm.internal.o.b(this.f357960n, cVar.f357960n) && kotlin.jvm.internal.o.b(this.f357961o, cVar.f357961o) && this.f357963q == cVar.f357963q && kotlin.jvm.internal.o.b(this.f357964r, cVar.f357964r) && kotlin.jvm.internal.o.b(this.f357965s, cVar.f357965s) && kotlin.jvm.internal.o.b(this.f357966t, cVar.f357966t) && kotlin.jvm.internal.o.b(this.f357962p, cVar.f357962p)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return kotlin.jvm.internal.o.i(this.f357953d, other.i());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr3.c)) {
            return false;
        }
        pr3.c cVar = (pr3.c) obj;
        return this.f357953d == cVar.f357953d && this.f357954e == cVar.f357954e && this.f357955f == cVar.f357955f && kotlin.jvm.internal.o.b(this.f357956g, cVar.f357956g) && this.f357957h == cVar.f357957h && this.f357958i == cVar.f357958i && kotlin.jvm.internal.o.b(this.f357959m, cVar.f357959m) && kotlin.jvm.internal.o.b(this.f357960n, cVar.f357960n) && kotlin.jvm.internal.o.b(this.f357961o, cVar.f357961o) && kotlin.jvm.internal.o.b(this.f357962p, cVar.f357962p) && this.f357963q == cVar.f357963q && kotlin.jvm.internal.o.b(this.f357964r, cVar.f357964r) && kotlin.jvm.internal.o.b(this.f357965s, cVar.f357965s) && kotlin.jvm.internal.o.b(this.f357966t, cVar.f357966t);
    }

    @Override // in5.c
    public long getItemId() {
        return this.f357954e;
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Integer.hashCode(this.f357953d) * 31) + java.lang.Integer.hashCode(this.f357954e)) * 31) + java.lang.Integer.hashCode(this.f357955f)) * 31;
        java.lang.CharSequence charSequence = this.f357956g;
        int hashCode2 = (((((hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31) + java.lang.Integer.hashCode(this.f357957h)) * 31) + java.lang.Boolean.hashCode(this.f357958i)) * 31;
        java.lang.Integer num = this.f357959m;
        int hashCode3 = (hashCode2 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.Integer num2 = this.f357960n;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        java.lang.Integer num3 = this.f357961o;
        int hashCode5 = (hashCode4 + (num3 == null ? 0 : num3.hashCode())) * 31;
        java.lang.String str = this.f357962p;
        int hashCode6 = (((((hashCode5 + (str == null ? 0 : str.hashCode())) * 31) + this.f357963q.hashCode()) * 31) + this.f357964r.hashCode()) * 31;
        yz5.p pVar = this.f357965s;
        return ((hashCode6 + (pVar != null ? pVar.hashCode() : 0)) * 31) + this.f357966t.hashCode();
    }

    @Override // pr3.e
    public int i() {
        return this.f357953d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((!r4.f357964r.isEmpty()) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j() {
        /*
            r4 = this;
            pr3.f r0 = r4.f357963q
            pr3.f r1 = pr3.f.f357972e
            r2 = 0
            r3 = 1
            if (r0 != r1) goto L21
            java.lang.CharSequence r0 = r4.f357956g
            if (r0 == 0) goto L15
            boolean r0 = r26.n0.N(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r3
        L16:
            if (r0 == 0) goto L27
            java.util.List r0 = r4.f357964r
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ r3
            if (r0 != 0) goto L27
        L21:
            pr3.f r0 = r4.f357963q
            pr3.f r1 = pr3.f.f357971d
            if (r0 != r1) goto L28
        L27:
            r2 = r3
        L28:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: pr3.c.j():boolean");
    }

    @Override // xm3.d
    public boolean s0(java.lang.Object obj) {
        pr3.e other = (pr3.e) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return (other instanceof pr3.c) && this.f357955f == ((pr3.c) other).f357955f;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.x2.g(this.f357955f));
        sb6.append('\t');
        sb6.append((java.lang.Object) this.f357956g);
        sb6.append(" (max: ");
        sb6.append(this.f357957h);
        sb6.append(") ");
        sb6.append(this.f357958i ? ">" : "");
        sb6.append(", margin_bottom: ");
        sb6.append(this.f357959m);
        sb6.append(", displayPolicy: ");
        sb6.append(this.f357963q);
        sb6.append(" images: ");
        sb6.append(this.f357964r);
        return sb6.toString();
    }

    @Override // xm3.d
    public java.lang.String v() {
        return java.lang.String.valueOf(this.f357954e);
    }

    @Override // xm3.d
    public java.lang.Object y0() {
        int i17 = this.f357953d;
        int i18 = this.f357954e;
        int i19 = this.f357955f;
        java.lang.CharSequence charSequence = this.f357956g;
        int i27 = this.f357957h;
        boolean z17 = this.f357958i;
        java.lang.Integer num = this.f357959m;
        java.lang.Integer num2 = this.f357960n;
        java.lang.Integer num3 = this.f357961o;
        java.lang.String str = this.f357962p;
        pr3.f displayPolicy = this.f357963q;
        java.util.List images = this.f357964r;
        yz5.p pVar = this.f357965s;
        yz5.a onClick = this.f357966t;
        kotlin.jvm.internal.o.g(displayPolicy, "displayPolicy");
        kotlin.jvm.internal.o.g(images, "images");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        return new pr3.c(i17, i18, i19, charSequence, i27, z17, num, num2, num3, str, displayPolicy, images, pVar, onClick);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, int i18, int i19, java.lang.CharSequence charSequence, int i27, boolean z17, java.lang.Integer num, java.lang.Integer num2, java.lang.Integer num3, java.lang.String str, pr3.f displayPolicy, java.util.List images, yz5.p pVar, yz5.a onClick) {
        super(i17, null);
        kotlin.jvm.internal.o.g(displayPolicy, "displayPolicy");
        kotlin.jvm.internal.o.g(images, "images");
        kotlin.jvm.internal.o.g(onClick, "onClick");
        this.f357953d = i17;
        this.f357954e = i18;
        this.f357955f = i19;
        this.f357956g = charSequence;
        this.f357957h = i27;
        this.f357958i = z17;
        this.f357959m = num;
        this.f357960n = num2;
        this.f357961o = num3;
        this.f357962p = str;
        this.f357963q = displayPolicy;
        this.f357964r = images;
        this.f357965s = pVar;
        this.f357966t = onClick;
    }
}
