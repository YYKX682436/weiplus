package p1;

/* loaded from: classes14.dex */
public final class j extends p1.k {

    /* renamed from: b, reason: collision with root package name */
    public final p1.y f350832b;

    /* renamed from: c, reason: collision with root package name */
    public final o0.i f350833c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f350834d;

    /* renamed from: e, reason: collision with root package name */
    public s1.z f350835e;

    /* renamed from: f, reason: collision with root package name */
    public p1.l f350836f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f350837g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f350838h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f350839i;

    public j(p1.y pointerInputFilter) {
        kotlin.jvm.internal.o.g(pointerInputFilter, "pointerInputFilter");
        this.f350832b = pointerInputFilter;
        this.f350833c = new o0.i(new p1.r[16], 0);
        this.f350834d = new java.util.LinkedHashMap();
        this.f350838h = true;
        this.f350839i = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x01a8, code lost:
    
        if ((r11 == 5 ? r6 : false) != false) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01b4  */
    @Override // p1.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.util.Map r35, s1.z r36, p1.g r37, boolean r38) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.j.a(java.util.Map, s1.z, p1.g, boolean):boolean");
    }

    @Override // p1.k
    public void b(p1.g internalPointerEvent) {
        kotlin.jvm.internal.o.g(internalPointerEvent, "internalPointerEvent");
        super.b(internalPointerEvent);
        p1.l lVar = this.f350836f;
        if (lVar == null) {
            return;
        }
        this.f350837g = this.f350838h;
        java.util.List list = lVar.f350842a;
        int size = list.size();
        int i17 = 0;
        while (true) {
            boolean z17 = true;
            if (i17 >= size) {
                break;
            }
            p1.s sVar = (p1.s) list.get(i17);
            boolean z18 = sVar.f350882d;
            long j17 = sVar.f350879a;
            if (z18 || (internalPointerEvent.a(j17) && this.f350838h)) {
                z17 = false;
            }
            if (z17) {
                this.f350833c.k(new p1.r(j17));
            }
            i17++;
        }
        this.f350838h = false;
        this.f350839i = lVar.f350844c == 5;
    }

    public void d() {
        o0.i iVar = this.f350840a;
        int i17 = iVar.f341852f;
        if (i17 > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            int i18 = 0;
            do {
                ((p1.j) objArr[i18]).d();
                i18++;
            } while (i18 < i17);
        }
        this.f350832b.b();
    }

    public boolean e(p1.g internalPointerEvent) {
        o0.i iVar;
        int i17;
        kotlin.jvm.internal.o.g(internalPointerEvent, "internalPointerEvent");
        java.util.Map map = this.f350834d;
        boolean z17 = false;
        int i18 = 0;
        z17 = false;
        if (!map.isEmpty()) {
            p1.y yVar = this.f350832b;
            if (yVar.f350926e) {
                p1.l lVar = this.f350836f;
                kotlin.jvm.internal.o.d(lVar);
                s1.z zVar = this.f350835e;
                kotlin.jvm.internal.o.d(zVar);
                yVar.c(lVar, p1.n.Final, ((u1.c1) zVar).f402052f);
                if (yVar.f350926e && (i17 = (iVar = this.f350840a).f341852f) > 0) {
                    java.lang.Object[] objArr = iVar.f341850d;
                    do {
                        ((p1.j) objArr[i18]).e(internalPointerEvent);
                        i18++;
                    } while (i18 < i17);
                }
                z17 = true;
            }
        }
        b(internalPointerEvent);
        ((java.util.LinkedHashMap) map).clear();
        this.f350835e = null;
        return z17;
    }

    public boolean f(java.util.Map changes, s1.z parentCoordinates, p1.g internalPointerEvent, boolean z17) {
        o0.i iVar;
        int i17;
        kotlin.jvm.internal.o.g(changes, "changes");
        kotlin.jvm.internal.o.g(parentCoordinates, "parentCoordinates");
        kotlin.jvm.internal.o.g(internalPointerEvent, "internalPointerEvent");
        java.util.Map map = this.f350834d;
        int i18 = 0;
        if (map.isEmpty()) {
            return false;
        }
        p1.y yVar = this.f350832b;
        if (!yVar.f350926e) {
            return false;
        }
        p1.l lVar = this.f350836f;
        kotlin.jvm.internal.o.d(lVar);
        s1.z zVar = this.f350835e;
        kotlin.jvm.internal.o.d(zVar);
        long j17 = ((u1.c1) zVar).f402052f;
        yVar.c(lVar, p1.n.Initial, j17);
        if (yVar.f350926e && (i17 = (iVar = this.f350840a).f341852f) > 0) {
            java.lang.Object[] objArr = iVar.f341850d;
            do {
                p1.j jVar = (p1.j) objArr[i18];
                s1.z zVar2 = this.f350835e;
                kotlin.jvm.internal.o.d(zVar2);
                jVar.f(map, zVar2, internalPointerEvent, z17);
                i18++;
            } while (i18 < i17);
        }
        if (yVar.f350926e) {
            yVar.c(lVar, p1.n.Main, j17);
        }
        return true;
    }

    public java.lang.String toString() {
        return "Node(pointerInputFilter=" + this.f350832b + ", children=" + this.f350840a + ", pointerIds=" + this.f350833c + ')';
    }
}
