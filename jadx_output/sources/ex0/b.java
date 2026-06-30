package ex0;

/* loaded from: classes5.dex */
public final class b extends ex0.f {

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.CaptionSegment f257117p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment) {
        super(captionSegment);
        kotlin.jvm.internal.o.g(captionSegment, "captionSegment");
        this.f257117p = captionSegment;
    }

    public final com.tencent.maas.moviecomposing.segments.CaptionItem A(java.lang.String language, com.tencent.maas.model.time.MJTime time) {
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(language, "language");
        kotlin.jvm.internal.o.g(time, "time");
        java.util.Iterator it = B(language).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((com.tencent.maas.moviecomposing.segments.CaptionItem) obj).getTimeRange().containsTime(time.sub(k()))) {
                break;
            }
        }
        return (com.tencent.maas.moviecomposing.segments.CaptionItem) obj;
    }

    public final java.util.List B(java.lang.String str) {
        com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = this.f257117p;
        captionSegment.getClass();
        com.tencent.maas.moviecomposing.segments.CaptionItem[] captionItemArr = new com.tencent.maas.moviecomposing.segments.CaptionItem[0];
        com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
        if (D != null) {
            captionItemArr = com.tencent.maas.moviecomposing.segments.CaptionSegment.D0(captionSegment, str, D);
        }
        return kz5.z.z0(captionItemArr);
    }

    public final java.lang.String C(java.lang.String str) {
        if (str == null) {
            return null;
        }
        java.util.List B = B(str);
        if (B.isEmpty()) {
            return null;
        }
        return kz5.n0.g0(B, "", null, null, 0, null, ex0.a.f257090d, 30, null);
    }

    public final java.lang.String D() {
        com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = this.f257117p;
        captionSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
        java.lang.String F0 = D != null ? com.tencent.maas.moviecomposing.segments.CaptionSegment.F0(captionSegment, D) : "";
        kotlin.jvm.internal.o.f(F0, "getMainCaptionLanguage(...)");
        return F0;
    }

    public final java.lang.String E() {
        com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = this.f257117p;
        captionSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
        if (D != null) {
            return com.tencent.maas.moviecomposing.segments.CaptionSegment.B0(captionSegment, D);
        }
        return null;
    }

    public final boolean F(java.util.LinkedList sentences, java.lang.String language, boolean z17) {
        kotlin.jvm.internal.o.g(sentences, "sentences");
        kotlin.jvm.internal.o.g(language, "language");
        com.tencent.mars.xlog.Log.i("CaptionSegmentViewModel", "initLanguage, segmentID: " + this.f257168b + ", language: " + language + ", isMainLanguage: " + z17);
        if (language.length() == 0) {
            com.tencent.mars.xlog.Log.e("CaptionSegmentViewModel", "init language, empty language");
            return false;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(sentences, 10));
        java.util.Iterator it = sentences.iterator();
        while (it.hasNext()) {
            r45.le4 le4Var = (r45.le4) it.next();
            com.tencent.maas.model.time.MJTime fromMilliseconds = com.tencent.maas.model.time.MJTime.fromMilliseconds(le4Var.f379377d);
            kotlin.jvm.internal.o.f(fromMilliseconds, "fromMilliseconds(...)");
            com.tencent.maas.model.time.MJTime fromMilliseconds2 = com.tencent.maas.model.time.MJTime.fromMilliseconds(le4Var.f379378e);
            kotlin.jvm.internal.o.f(fromMilliseconds2, "fromMilliseconds(...)");
            com.tencent.mars.xlog.Log.i("CaptionSegmentViewModel", "initLanguage, text: " + le4Var.f379379f + ", timeRange: " + fromMilliseconds.toSeconds() + ", " + fromMilliseconds2.toSeconds());
            arrayList.add(new com.tencent.maas.moviecomposing.segments.CaptionItem(le4Var.f379379f, new com.tencent.maas.model.time.MJTimeRange(fromMilliseconds, fromMilliseconds2)));
        }
        com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = this.f257117p;
        if (z17) {
            captionSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
            if (D != null) {
                com.tencent.maas.moviecomposing.segments.CaptionSegment.y0(captionSegment, language, D);
            }
        } else {
            captionSegment.getClass();
            com.tencent.maas.moviecomposing.Timeline D2 = captionSegment.D();
            if (D2 != null) {
                com.tencent.maas.moviecomposing.segments.CaptionSegment.H0(captionSegment, language, D2);
            }
        }
        captionSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D3 = captionSegment.D();
        if (D3 != null) {
            bool = com.tencent.maas.moviecomposing.segments.CaptionSegment.G0(captionSegment, arrayList, language, D3);
        }
        return bool.booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        if (r0.k().equalsTo(l().getEndTime()) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0060, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if (r0.l().getEndTime().bigThan(l().getStartTime()) != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:0: B:8:0x0015->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G(ex0.a0 r6) {
        /*
            r5 = this;
            ex0.v r6 = r6.f257097g
            java.util.List r6 = r6.f257180h
            boolean r0 = r6 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L11
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L11
            goto La5
        L11:
            java.util.Iterator r6 = r6.iterator()
        L15:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r0 = r6.next()
            ex0.b r0 = (ex0.b) r0
            com.tencent.maas.base.MJID r2 = r0.f257168b
            com.tencent.maas.base.MJID r3 = r5.f257168b
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
            r3 = 1
            if (r2 == 0) goto L2f
        L2c:
            r0 = r1
            goto La2
        L2f:
            ax0.a r2 = r5.f257134j
            int r2 = r2.ordinal()
            if (r2 == 0) goto L75
            if (r2 == r3) goto L68
            r4 = 2
            if (r2 != r4) goto L62
            com.tencent.maas.model.time.MJTimeRange r2 = r0.l()
            com.tencent.maas.model.time.MJTimeRange r4 = r5.l()
            com.tencent.maas.model.time.MJTime r4 = r4.getEndTime()
            boolean r2 = r2.containsTime(r4)
            if (r2 == 0) goto L2c
            com.tencent.maas.model.time.MJTime r0 = r0.k()
            com.tencent.maas.model.time.MJTimeRange r2 = r5.l()
            com.tencent.maas.model.time.MJTime r2 = r2.getEndTime()
            boolean r0 = r0.equalsTo(r2)
            if (r0 == 0) goto L2c
        L60:
            r0 = r3
            goto La2
        L62:
            jz5.j r6 = new jz5.j
            r6.<init>()
            throw r6
        L68:
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r2 = r5.k()
            boolean r0 = r0.containsTime(r2)
            goto La2
        L75:
            com.tencent.maas.model.time.MJTimeRange r2 = r0.l()
            com.tencent.maas.model.time.MJTime r2 = r2.getStartTime()
            com.tencent.maas.model.time.MJTimeRange r4 = r5.l()
            com.tencent.maas.model.time.MJTime r4 = r4.getEndTime()
            boolean r2 = r2.smallThan(r4)
            if (r2 == 0) goto L2c
            com.tencent.maas.model.time.MJTimeRange r0 = r0.l()
            com.tencent.maas.model.time.MJTime r0 = r0.getEndTime()
            com.tencent.maas.model.time.MJTimeRange r2 = r5.l()
            com.tencent.maas.model.time.MJTime r2 = r2.getStartTime()
            boolean r0 = r0.bigThan(r2)
            if (r0 == 0) goto L2c
            goto L60
        La2:
            if (r0 == 0) goto L15
            r1 = r3
        La5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.b.G(ex0.a0):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (r0.right >= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0059, code lost:
    
        if (r0.right <= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x006a, code lost:
    
        if (r0.right >= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0072, code lost:
    
        if (r0.right <= r8.right) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007e, code lost:
    
        if (r0.right >= r3) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0086, code lost:
    
        if (r0.right >= r5) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x008c, code lost:
    
        if (r0.right <= r5) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[LOOP:0: B:8:0x001a->B:18:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(android.graphics.Rect r8, ex0.a0 r9, bx0.h r10) {
        /*
            r7 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            ex0.v r9 = r9.f257097g
            java.util.List r9 = r9.f257180h
            boolean r1 = r9 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto L16
            boolean r1 = r9.isEmpty()
            if (r1 == 0) goto L16
            goto L92
        L16:
            java.util.Iterator r9 = r9.iterator()
        L1a:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L92
            java.lang.Object r1 = r9.next()
            ex0.b r1 = (ex0.b) r1
            com.tencent.maas.base.MJID r3 = r1.f257168b
            com.tencent.maas.base.MJID r4 = r7.f257168b
            boolean r3 = kotlin.jvm.internal.o.b(r3, r4)
            r4 = 1
            if (r3 == 0) goto L33
        L31:
            r1 = r2
            goto L8f
        L33:
            com.tencent.maas.base.MJID r1 = r1.f257168b
            android.graphics.Rect r1 = r10.b(r1, r2)
            r0.set(r1)
            ax0.a r1 = r7.f257134j
            int r1 = r1.ordinal()
            if (r1 == 0) goto L76
            if (r1 == r4) goto L62
            r3 = 2
            if (r1 != r3) goto L5c
            int r1 = r0.left
            int r3 = r8.right
            if (r1 > r3) goto L53
            int r5 = r0.right
            if (r5 >= r3) goto L74
        L53:
            int r5 = r8.left
            if (r1 < r5) goto L31
            int r1 = r0.right
            if (r1 > r3) goto L31
            goto L74
        L5c:
            jz5.j r8 = new jz5.j
            r8.<init>()
            throw r8
        L62:
            int r1 = r0.left
            int r3 = r8.left
            if (r1 > r3) goto L6c
            int r5 = r0.right
            if (r5 >= r3) goto L74
        L6c:
            if (r1 < r3) goto L31
            int r1 = r0.right
            int r3 = r8.right
            if (r1 > r3) goto L31
        L74:
            r1 = r4
            goto L8f
        L76:
            int r1 = r0.left
            int r3 = r8.left
            if (r1 > r3) goto L80
            int r5 = r0.right
            if (r5 >= r3) goto L74
        L80:
            int r5 = r8.right
            if (r1 > r5) goto L88
            int r6 = r0.right
            if (r6 >= r5) goto L74
        L88:
            if (r1 < r3) goto L31
            int r1 = r0.right
            if (r1 > r5) goto L31
            goto L74
        L8f:
            if (r1 == 0) goto L1a
            r2 = r4
        L92:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ex0.b.H(android.graphics.Rect, ex0.a0, bx0.h):boolean");
    }

    public final boolean I(java.lang.String colorStyleID) {
        kotlin.jvm.internal.o.g(colorStyleID, "colorStyleID");
        com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = this.f257117p;
        captionSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.CaptionSegment.C0(captionSegment, colorStyleID, D);
        }
        return bool.booleanValue();
    }

    public final boolean J(java.lang.String fontName) {
        kotlin.jvm.internal.o.g(fontName, "fontName");
        com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = this.f257117p;
        captionSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.CaptionSegment.w0(captionSegment, fontName, D);
        }
        return bool.booleanValue();
    }

    public final boolean K(java.lang.String materialID) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = this.f257117p;
        captionSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
        java.lang.String M0 = D != null ? com.tencent.maas.moviecomposing.segments.CaptionSegment.M0(captionSegment, D) : "";
        captionSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D2 = captionSegment.D();
        java.lang.String L0 = D2 != null ? com.tencent.maas.moviecomposing.segments.CaptionSegment.L0(captionSegment, D2) : "";
        captionSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D3 = captionSegment.D();
        boolean booleanValue = (D3 != null ? com.tencent.maas.moviecomposing.segments.CaptionSegment.z0(captionSegment, materialID, D3) : bool).booleanValue();
        boolean I = I(M0);
        captionSegment.getClass();
        com.tencent.maas.moviecomposing.Timeline D4 = captionSegment.D();
        if (D4 != null) {
            bool = com.tencent.maas.moviecomposing.segments.CaptionSegment.I0(captionSegment, L0, D4);
        }
        return booleanValue && I && bool.booleanValue();
    }

    public final boolean L(java.lang.String text, java.lang.String language, com.tencent.maas.model.time.MJTime time) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(language, "language");
        kotlin.jvm.internal.o.g(time, "time");
        java.util.List V0 = kz5.n0.V0(B(language));
        com.tencent.maas.moviecomposing.segments.CaptionItem A = A(language, time);
        int i17 = 0;
        if (A == null) {
            return false;
        }
        com.tencent.maas.moviecomposing.segments.CaptionItem captionItem = new com.tencent.maas.moviecomposing.segments.CaptionItem(text, A.getTimeRange());
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            if (((com.tencent.maas.moviecomposing.segments.CaptionItem) it.next()).getTimeRange().containsTime(time)) {
                break;
            }
            i17++;
        }
        if (i17 != -1) {
            arrayList.remove(i17);
        }
        arrayList.add(captionItem);
        com.tencent.maas.moviecomposing.segments.CaptionSegment captionSegment = this.f257117p;
        captionSegment.getClass();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        com.tencent.maas.moviecomposing.Timeline D = captionSegment.D();
        if (D != null) {
            bool = com.tencent.maas.moviecomposing.segments.CaptionSegment.G0(captionSegment, V0, language, D);
        }
        return bool.booleanValue();
    }

    @Override // ex0.f
    public android.graphics.PointF v() {
        return new android.graphics.PointF(0.5f, 0.76f);
    }

    @Override // ex0.f
    public android.graphics.PointF w() {
        return new android.graphics.PointF(0.5f, 0.75f);
    }
}
