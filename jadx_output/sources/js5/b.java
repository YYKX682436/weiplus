package js5;

/* loaded from: classes15.dex */
public abstract class b implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public java.util.LinkedList f301568d;

    /* renamed from: e, reason: collision with root package name */
    public final int f301569e;

    /* renamed from: f, reason: collision with root package name */
    public final int f301570f;

    /* renamed from: g, reason: collision with root package name */
    public final android.text.style.CharacterStyle f301571g;

    public b(int i17, int i18, android.text.style.CharacterStyle characterStyle) {
        this.f301569e = i17;
        this.f301570f = i18;
        this.f301571g = characterStyle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r2 >= r3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r2 < r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        r5.f301568d.add(r0.d(r1, r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.util.List r6) {
        /*
            r5 = this;
            java.util.LinkedList r0 = r5.f301568d
            if (r0 != 0) goto L5f
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r5.f301568d = r0
            java.util.Iterator r6 = r6.iterator()
        Lf:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L5f
            java.lang.Object r0 = r6.next()
            ks5.d r0 = (ks5.d) r0
            int r1 = r0.f311834f
            int r2 = r5.f301570f
            int r3 = r0.f311835g
            int r4 = r5.f301569e
            if (r1 > r4) goto L31
            if (r2 >= r3) goto L31
            java.util.LinkedList r6 = r5.f301568d
            android.graphics.RectF r0 = r0.d(r4, r2)
            r6.add(r0)
            goto L5f
        L31:
            if (r1 > r4) goto L41
            if (r4 >= r3) goto L41
            if (r3 > r2) goto L41
            java.util.LinkedList r1 = r5.f301568d
            android.graphics.RectF r0 = r0.d(r4, r3)
            r1.add(r0)
            goto Lf
        L41:
            if (r4 >= r1) goto L51
            if (r2 >= r3) goto L51
            if (r2 < r1) goto L51
            java.util.LinkedList r6 = r5.f301568d
            android.graphics.RectF r0 = r0.d(r1, r2)
            r6.add(r0)
            goto L5f
        L51:
            if (r4 >= r1) goto Lf
            if (r2 < r3) goto Lf
            java.util.LinkedList r2 = r5.f301568d
            android.graphics.RectF r0 = r0.d(r1, r3)
            r2.add(r0)
            goto Lf
        L5f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: js5.b.a(java.util.List):void");
    }

    public abstract void b(android.graphics.Canvas canvas, android.text.TextPaint textPaint, java.util.List list);

    public boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof js5.b)) {
            js5.b bVar = (js5.b) obj;
            if (bVar.f301569e == this.f301569e && bVar.f301570f == this.f301570f) {
                for (int i17 = 0; i17 < this.f301568d.size(); i17++) {
                    if (!((android.graphics.RectF) this.f301568d.get(i17)).equals((android.graphics.RectF) bVar.f301568d.get(i17))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i17 = 0;
        for (int i18 = 0; i18 < this.f301568d.size(); i18++) {
            i17 += ((android.graphics.RectF) this.f301568d.get(i18)).hashCode();
        }
        return this.f301569e + this.f301570f + i17;
    }

    public java.lang.String toString() {
        return "CharacterBgStyle{mRectFList=" + this.f301568d + ", mStart=" + this.f301569e + ", mEnd=" + this.f301570f + '}';
    }
}
