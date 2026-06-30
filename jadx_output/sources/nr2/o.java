package nr2;

/* loaded from: classes2.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nr2.p f339272d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(nr2.p pVar) {
        super(0);
        this.f339272d = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0040, code lost:
    
        if (((com.google.android.material.appbar.AppBarLayout.Behavior) r0).y() != 0) goto L22;
     */
    @Override // yz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object invoke() {
        /*
            r3 = this;
            nr2.p r0 = r3.f339272d
            com.tencent.mm.ui.vas.VASCommonFragment r0 = r0.f339283e
            r1 = 0
            if (r0 == 0) goto La
            com.tencent.mm.ui.vas.VASActivity r0 = r0.f211121p
            goto Lb
        La:
            r0 = r1
        Lb:
            boolean r2 = r0 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderPaidCollectionUI
            if (r2 == 0) goto L12
            com.tencent.mm.plugin.finder.feed.ui.FinderPaidCollectionUI r0 = (com.tencent.mm.plugin.finder.feed.ui.FinderPaidCollectionUI) r0
            goto L13
        L12:
            r0 = r1
        L13:
            if (r0 == 0) goto L4b
            pf5.z r2 = pf5.z.f353948a
            pf5.v r0 = r2.a(r0)
            java.lang.Class<nr2.j0> r2 = nr2.j0.class
            pf5.b0 r0 = r0.e(r2)
            nr2.j0 r0 = (nr2.j0) r0
            if (r0 == 0) goto L49
            com.google.android.material.appbar.AppBarLayout r0 = r0.f339232s
            if (r0 == 0) goto L43
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"
            kotlin.jvm.internal.o.e(r0, r1)
            androidx.coordinatorlayout.widget.c r0 = (androidx.coordinatorlayout.widget.c) r0
            androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior r0 = r0.f11006a
            boolean r1 = r0 instanceof com.google.android.material.appbar.AppBarLayout.Behavior
            if (r1 == 0) goto L4b
            com.google.android.material.appbar.AppBarLayout$Behavior r0 = (com.google.android.material.appbar.AppBarLayout.Behavior) r0
            int r0 = r0.y()
            if (r0 != 0) goto L49
            goto L4b
        L43:
            java.lang.String r0 = "appBarLayout"
            kotlin.jvm.internal.o.o(r0)
            throw r1
        L49:
            r0 = 0
            goto L4c
        L4b:
            r0 = 1
        L4c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: nr2.o.invoke():java.lang.Object");
    }
}
