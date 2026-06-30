package ti5;

/* loaded from: classes.dex */
public final class b implements si5.c {

    /* renamed from: a, reason: collision with root package name */
    public final p13.y f419655a;

    /* renamed from: b, reason: collision with root package name */
    public final p13.r f419656b;

    /* renamed from: c, reason: collision with root package name */
    public final int f419657c;

    /* renamed from: d, reason: collision with root package name */
    public final int f419658d;

    /* renamed from: e, reason: collision with root package name */
    public final int f419659e;

    /* renamed from: f, reason: collision with root package name */
    public final int f419660f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f419661g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f419662h;

    public b(p13.y yVar, p13.r rVar, int i17, int i18, int i19, int i27, java.lang.String compareContent, boolean z17, int i28, kotlin.jvm.internal.i iVar) {
        yVar = (i28 & 1) != 0 ? null : yVar;
        rVar = (i28 & 2) != 0 ? null : rVar;
        i17 = (i28 & 4) != 0 ? 0 : i17;
        i18 = (i28 & 8) != 0 ? 0 : i18;
        i19 = (i28 & 16) != 0 ? 0 : i19;
        i27 = (i28 & 32) != 0 ? 0 : i27;
        compareContent = (i28 & 64) != 0 ? "" : compareContent;
        z17 = (i28 & 128) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(compareContent, "compareContent");
        this.f419655a = yVar;
        this.f419656b = rVar;
        this.f419657c = i17;
        this.f419658d = i18;
        this.f419659e = i19;
        this.f419660f = i27;
        this.f419661g = compareContent;
        this.f419662h = z17;
    }

    @Override // si5.c
    public int a() {
        return this.f419660f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        if (r2 != false) goto L22;
     */
    @Override // si5.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b(ri5.j r5, ri5.j r6, si5.c r7) {
        /*
            r4 = this;
            java.lang.String r0 = "thisItem"
            kotlin.jvm.internal.o.g(r5, r0)
            java.lang.String r0 = "otherItem"
            kotlin.jvm.internal.o.g(r6, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.o.g(r7, r0)
            boolean r0 = r7 instanceof ti5.b
            r1 = 0
            if (r0 == 0) goto L83
            int r0 = ri5.j.X
            int r5 = r5.f396110e
            r2 = 1
            if (r5 != r0) goto L1c
            goto L20
        L1c:
            int r3 = ri5.j.W
            if (r5 != r3) goto L22
        L20:
            r3 = r2
            goto L23
        L22:
            r3 = r1
        L23:
            int r6 = r6.f396110e
            if (r3 == 0) goto L33
            if (r6 != r0) goto L2a
            goto L30
        L2a:
            int r3 = ri5.j.W
            if (r6 != r3) goto L2f
            goto L30
        L2f:
            r2 = r1
        L30:
            if (r2 == 0) goto L33
            goto L37
        L33:
            int r1 = kotlin.jvm.internal.o.i(r5, r6)
        L37:
            if (r1 == 0) goto L3a
            return r1
        L3a:
            ri5.h r6 = ri5.j.I
            if (r5 == r0) goto L6d
            int r6 = ri5.j.W
            if (r5 != r6) goto L43
            goto L6d
        L43:
            int r6 = ri5.j.P
            if (r5 == r6) goto L62
            int r6 = ri5.j.Q
            if (r5 != r6) goto L4c
            goto L62
        L4c:
            ti5.b r7 = (ti5.b) r7
            int r5 = r7.f419660f
            int r6 = r4.f419660f
            int r5 = kotlin.jvm.internal.o.i(r6, r5)
            if (r5 == 0) goto L59
            return r5
        L59:
            java.lang.String r5 = r4.f419661g
            java.lang.String r6 = r7.f419661g
            int r5 = r5.compareTo(r6)
            return r5
        L62:
            ti5.b r7 = (ti5.b) r7
            int r5 = r7.f419659e
            int r6 = r4.f419659e
            int r5 = kotlin.jvm.internal.o.i(r6, r5)
            return r5
        L6d:
            ti5.b r7 = (ti5.b) r7
            int r5 = r7.f419657c
            int r6 = r4.f419657c
            int r5 = kotlin.jvm.internal.o.i(r6, r5)
            if (r5 == 0) goto L7a
            return r5
        L7a:
            int r5 = r4.f419658d
            int r6 = r7.f419658d
            int r5 = kotlin.jvm.internal.o.i(r5, r6)
            return r5
        L83:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ti5.b.b(ri5.j, ri5.j, si5.c):int");
    }

    @Override // si5.c
    public void c(em.o2 uiBinding, in5.s0 holder, ri5.j item, int i17, int i18, boolean z17, java.util.List list) {
        kotlin.jvm.internal.o.g(uiBinding, "uiBinding");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.c(uiBinding, holder, item, i17, i18, z17, list);
        com.tencent.mm.ui.widget.imageview.WeImageView e17 = uiBinding.e();
        if (e17.getVisibility() == 0) {
            e17.setOnClickListener(new ti5.a(this, holder, item));
        }
    }

    @Override // si5.c
    public boolean d(ri5.j item) {
        kotlin.jvm.internal.o.g(item, "item");
        ri5.h hVar = ri5.j.I;
        if (item.f396110e == ri5.j.W) {
            si5.c cVar = item.f396113h;
            kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.ui.mvvm.item.extension.addressbook.LabelListItemExtension");
            if (!((ti5.b) cVar).f419662h) {
                return true;
            }
        }
        return false;
    }

    @Override // si5.c
    public boolean e(si5.c other) {
        kotlin.jvm.internal.o.g(other, "other");
        if (!(other instanceof ti5.b)) {
            return false;
        }
        ti5.b bVar = (ti5.b) other;
        return kotlin.jvm.internal.o.b(this.f419655a, bVar.f419655a) && kotlin.jvm.internal.o.b(this.f419656b, bVar.f419656b) && this.f419657c == bVar.f419657c && this.f419658d == bVar.f419658d && this.f419659e == bVar.f419659e && this.f419660f == bVar.f419660f && kotlin.jvm.internal.o.b(this.f419661g, bVar.f419661g) && this.f419662h == bVar.f419662h;
    }
}
