package com.tencent.mm.plugin.finder.report;

/* loaded from: classes10.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.report.j0 f125083a = new com.tencent.mm.plugin.finder.report.j0();

    /* renamed from: b, reason: collision with root package name */
    public static final android.util.ArrayMap f125084b = new android.util.ArrayMap();

    /* renamed from: c, reason: collision with root package name */
    public static long f125085c;

    public final com.tencent.mm.plugin.finder.view.FinderRefreshLayout a(android.view.View view) {
        if (view instanceof com.tencent.mm.plugin.finder.view.FinderRefreshLayout) {
            return (com.tencent.mm.plugin.finder.view.FinderRefreshLayout) view;
        }
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout finderRefreshLayout = null;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                com.tencent.mm.plugin.finder.report.j0 j0Var = f125083a;
                android.view.View childAt = viewGroup.getChildAt(i17);
                kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                finderRefreshLayout = j0Var.a(childAt);
                if (finderRefreshLayout != null) {
                    break;
                }
            }
        }
        return finderRefreshLayout;
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout b(android.view.View view) {
        if (view instanceof com.tencent.mm.view.RefreshLoadMoreLayout) {
            return (com.tencent.mm.view.RefreshLoadMoreLayout) view;
        }
        com.tencent.mm.view.RefreshLoadMoreLayout refreshLoadMoreLayout = null;
        android.view.ViewGroup viewGroup = view instanceof android.view.ViewGroup ? (android.view.ViewGroup) view : null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                com.tencent.mm.plugin.finder.report.j0 j0Var = f125083a;
                android.view.View childAt = viewGroup.getChildAt(i17);
                kotlin.jvm.internal.o.f(childAt, "getChildAt(...)");
                refreshLoadMoreLayout = j0Var.b(childAt);
                if (refreshLoadMoreLayout != null) {
                    break;
                }
            }
        }
        return refreshLoadMoreLayout;
    }

    public final com.tencent.mm.plugin.finder.report.g0 c(int i17, boolean z17) {
        android.util.ArrayMap arrayMap = f125084b;
        if (!z17) {
            return (com.tencent.mm.plugin.finder.report.g0) arrayMap.get(java.lang.Integer.valueOf(i17));
        }
        com.tencent.mm.plugin.finder.report.g0 g0Var = new com.tencent.mm.plugin.finder.report.g0();
        arrayMap.put(java.lang.Integer.valueOf(i17), g0Var);
        return g0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r21, android.app.Activity r22) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.j0.d(int, android.app.Activity):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        if ((r7.f125039e == 0 || r7.f125040f == 0) != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r7) {
        /*
            r6 = this;
            r0 = 0
            com.tencent.mm.plugin.finder.report.g0 r7 = r6.c(r7, r0)
            r1 = 0
            if (r7 == 0) goto L1a
            long r2 = r7.f125039e
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L16
            long r2 = r7.f125040f
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L17
        L16:
            r0 = 1
        L17:
            if (r0 == 0) goto L1a
            goto L1b
        L1a:
            r7 = r1
        L1b:
            if (r7 != 0) goto L1e
            goto L24
        L1e:
            long r0 = c01.id.c()
            r7.f125040f = r0
        L24:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.report.j0.e(int):void");
    }

    public final void f(int i17) {
        com.tencent.mm.plugin.finder.report.g0 c17 = c(i17, false);
        if (c17 != null) {
            if (!(c17.f125039e == 0)) {
                c17 = null;
            }
            if (c17 != null) {
                c17.f125039e = c01.id.c();
                c17.f125040f = 0L;
            }
        }
    }

    public final void g(android.view.View parentView, android.app.Activity activity) {
        kotlin.jvm.internal.o.g(parentView, "parentView");
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.view.RefreshLoadMoreLayout b17 = b(parentView);
        if (b17 != null) {
            b17.setReportCallback(new com.tencent.mm.plugin.finder.report.i0(activity));
        }
        com.tencent.mm.plugin.finder.view.FinderRefreshLayout a17 = a(parentView);
        if (a17 != null) {
            a17.setReportAction(new com.tencent.mm.plugin.finder.report.h0(activity));
        }
    }
}
