package com.tencent.mm.xcompat.recyclerview.widget;

/* loaded from: classes15.dex */
public class f0 extends com.tencent.mm.xcompat.recyclerview.widget.t1 {

    /* renamed from: j, reason: collision with root package name */
    public android.graphics.PointF f214512j;

    /* renamed from: k, reason: collision with root package name */
    public final android.util.DisplayMetrics f214513k;

    /* renamed from: m, reason: collision with root package name */
    public float f214515m;

    /* renamed from: h, reason: collision with root package name */
    public final android.view.animation.LinearInterpolator f214510h = new android.view.animation.LinearInterpolator();

    /* renamed from: i, reason: collision with root package name */
    public final android.view.animation.DecelerateInterpolator f214511i = new android.view.animation.DecelerateInterpolator();

    /* renamed from: l, reason: collision with root package name */
    public boolean f214514l = false;

    /* renamed from: n, reason: collision with root package name */
    public int f214516n = 0;

    /* renamed from: o, reason: collision with root package name */
    public int f214517o = 0;

    public f0(android.content.Context context) {
        this.f214513k = context.getResources().getDisplayMetrics();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.xcompat.recyclerview.widget.t1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(android.view.View r11, com.tencent.mm.xcompat.recyclerview.widget.u1 r12, com.tencent.mm.xcompat.recyclerview.widget.r1 r13) {
        /*
            r10 = this;
            android.graphics.PointF r12 = r10.f214512j
            r0 = 1
            r1 = -1
            r2 = 0
            r3 = 0
            if (r12 == 0) goto L15
            float r12 = r12.x
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 != 0) goto Lf
            goto L15
        Lf:
            if (r12 <= 0) goto L13
            r9 = r0
            goto L16
        L13:
            r9 = r1
            goto L16
        L15:
            r9 = r3
        L16:
            com.tencent.mm.xcompat.recyclerview.widget.g1 r12 = r10.f214638c
            if (r12 == 0) goto L51
            boolean r4 = r12.b()
            if (r4 != 0) goto L21
            goto L51
        L21:
            android.view.ViewGroup$LayoutParams r4 = r11.getLayoutParams()
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView$LayoutParams r4 = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) r4
            int r5 = r11.getLeft()
            int r6 = r12.j(r11)
            int r5 = r5 - r6
            int r6 = r4.leftMargin
            int r5 = r5 - r6
            int r6 = r11.getRight()
            int r7 = r12.p(r11)
            int r6 = r6 + r7
            int r4 = r4.rightMargin
            int r6 = r6 + r4
            int r7 = r12.l()
            int r4 = r12.f214532l
            int r12 = r12.m()
            int r8 = r4 - r12
            r4 = r10
            int r12 = r4.d(r5, r6, r7, r8, r9)
            goto L52
        L51:
            r12 = r3
        L52:
            android.graphics.PointF r4 = r10.f214512j
            if (r4 == 0) goto L63
            float r4 = r4.y
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L5d
            goto L63
        L5d:
            if (r2 <= 0) goto L61
            r9 = r0
            goto L64
        L61:
            r9 = r1
            goto L64
        L63:
            r9 = r3
        L64:
            com.tencent.mm.xcompat.recyclerview.widget.g1 r1 = r10.f214638c
            if (r1 == 0) goto La0
            boolean r2 = r1.c()
            if (r2 != 0) goto L6f
            goto La0
        L6f:
            android.view.ViewGroup$LayoutParams r2 = r11.getLayoutParams()
            com.tencent.mm.xcompat.recyclerview.widget.RecyclerView$LayoutParams r2 = (com.tencent.mm.xcompat.recyclerview.widget.RecyclerView.LayoutParams) r2
            int r3 = r11.getTop()
            int r4 = r1.q(r11)
            int r3 = r3 - r4
            int r4 = r2.topMargin
            int r5 = r3 - r4
            int r3 = r11.getBottom()
            int r11 = r1.f(r11)
            int r3 = r3 + r11
            int r11 = r2.bottomMargin
            int r6 = r3 + r11
            int r7 = r1.n()
            int r11 = r1.f214533m
            int r1 = r1.k()
            int r8 = r11 - r1
            r4 = r10
            int r3 = r4.d(r5, r6, r7, r8, r9)
        La0:
            int r11 = r12 * r12
            int r1 = r3 * r3
            int r11 = r11 + r1
            double r1 = (double) r11
            double r1 = java.lang.Math.sqrt(r1)
            int r11 = (int) r1
            int r11 = r10.f(r11)
            double r1 = (double) r11
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r11 = (int) r1
            if (r11 <= 0) goto Lcb
            int r12 = -r12
            int r1 = -r3
            android.view.animation.DecelerateInterpolator r2 = r10.f214511i
            r13.f214624a = r12
            r13.f214625b = r1
            r13.f214626c = r11
            r13.f214628e = r2
            r13.f214629f = r0
        Lcb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.xcompat.recyclerview.widget.f0.b(android.view.View, com.tencent.mm.xcompat.recyclerview.widget.u1, com.tencent.mm.xcompat.recyclerview.widget.r1):void");
    }

    public int d(int i17, int i18, int i19, int i27, int i28) {
        if (i28 == -1) {
            return i19 - i17;
        }
        if (i28 != 0) {
            if (i28 == 1) {
                return i27 - i18;
            }
            throw new java.lang.IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i29 = i19 - i17;
        if (i29 > 0) {
            return i29;
        }
        int i37 = i27 - i18;
        if (i37 < 0) {
            return i37;
        }
        return 0;
    }

    public float e(android.util.DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    public int f(int i17) {
        float abs = java.lang.Math.abs(i17);
        if (!this.f214514l) {
            this.f214515m = e(this.f214513k);
            this.f214514l = true;
        }
        return (int) java.lang.Math.ceil(abs * this.f214515m);
    }
}
