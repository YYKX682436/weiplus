package md;

/* loaded from: classes14.dex */
public class h implements md.l {

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f325693e;

    /* renamed from: a, reason: collision with root package name */
    public final int[] f325689a = new int[2];

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Rect f325690b = new android.graphics.Rect();

    /* renamed from: c, reason: collision with root package name */
    public boolean f325691c = false;

    /* renamed from: d, reason: collision with root package name */
    public int f325692d = 0;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedHashSet f325694f = new java.util.LinkedHashSet();

    public void a(md.g gVar) {
        if (gVar != null) {
            java.util.LinkedHashSet linkedHashSet = this.f325694f;
            if (linkedHashSet.contains(gVar)) {
                return;
            }
            linkedHashSet.add(gVar);
        }
    }

    public final android.content.Context b() {
        android.view.View view = this.f325693e;
        if (view != null) {
            return view.getContext();
        }
        android.content.Context context = zc.c.f471339b;
        if (context != null) {
            return context;
        }
        kotlin.jvm.internal.o.o("appContext");
        throw null;
    }

    public final int c() {
        android.view.View view = this.f325693e;
        if ((view == null ? null : view.getRootView()) == null) {
            return 0;
        }
        android.view.View view2 = this.f325693e;
        android.graphics.Rect rect = this.f325690b;
        if (view2 != null) {
            view2.getWindowVisibleDisplayFrame(rect);
            android.view.View view3 = this.f325693e;
            int[] iArr = this.f325689a;
            view3.getLocationInWindow(iArr);
            rect.top = iArr[1];
        }
        android.view.View view4 = this.f325693e;
        java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
        return (n3.x0.c(view4) ? this.f325693e.getMeasuredHeight() : b().getResources().getDisplayMetrics().heightPixels) - rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0057, code lost:
    
        if ((c() - md.n.b(b(), -1)) > r2) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0061, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        if (c() > r2) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.view.View r2, boolean r3, int r4, int r5, int r6, int r7) {
        /*
            r1 = this;
            r1.f325693e = r2
            r3 = 1
            android.graphics.Rect r4 = r1.f325690b
            if (r2 == 0) goto L15
            r2.getWindowVisibleDisplayFrame(r4)
            android.view.View r2 = r1.f325693e
            int[] r5 = r1.f325689a
            r2.getLocationInWindow(r5)
            r2 = r5[r3]
            r4.top = r2
        L15:
            int r2 = r4.height()
            r4 = -1
            r5 = 0
            if (r7 <= 0) goto L1f
            r6 = r7
            goto L3d
        L1f:
            android.content.Context r6 = r1.b()
            boolean r6 = md.n.c(r6)
            if (r6 != 0) goto L32
            android.content.Context r6 = r1.b()
            int r6 = md.n.b(r6, r4)
            goto L33
        L32:
            r6 = r5
        L33:
            int r0 = r1.c()
            int r0 = r0 - r2
            int r0 = r0 - r6
            int r6 = java.lang.Math.max(r0, r5)
        L3d:
            if (r7 <= 0) goto L40
            goto L62
        L40:
            android.content.Context r7 = r1.b()
            boolean r7 = md.n.c(r7)
            if (r7 == 0) goto L5a
            android.content.Context r7 = r1.b()
            int r4 = md.n.b(r7, r4)
            int r7 = r1.c()
            int r7 = r7 - r4
            if (r7 <= r2) goto L61
            goto L62
        L5a:
            int r4 = r1.c()
            if (r4 <= r2) goto L61
            goto L62
        L61:
            r3 = r5
        L62:
            boolean r2 = r1.f325691c
            if (r2 != r3) goto L6a
            int r2 = r1.f325692d
            if (r2 == r6) goto L86
        L6a:
            java.util.LinkedHashSet r2 = r1.f325694f
            java.lang.Object r2 = r2.clone()
            java.util.LinkedHashSet r2 = (java.util.LinkedHashSet) r2
            java.util.Iterator r2 = r2.iterator()
        L76:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L86
            java.lang.Object r4 = r2.next()
            md.g r4 = (md.g) r4
            r4.a(r3, r6)
            goto L76
        L86:
            r1.f325691c = r3
            r1.f325692d = r6
            r2 = 0
            r1.f325693e = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: md.h.d(android.view.View, boolean, int, int, int, int):void");
    }
}
