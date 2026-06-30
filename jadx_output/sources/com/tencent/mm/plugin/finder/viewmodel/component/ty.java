package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes8.dex */
public final class ty extends com.tencent.mm.ui.component.UIComponent implements zy2.ua {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f136067d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f136068e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.viewmodel.component.py f136069f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f136070g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f136067d = jz5.h.b(com.tencent.mm.plugin.finder.viewmodel.component.oy.f135489d);
        this.f136069f = new com.tencent.mm.plugin.finder.viewmodel.component.py(this);
        this.f136070g = jz5.h.b(new com.tencent.mm.plugin.finder.viewmodel.component.sy(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p15.n O6(com.tencent.mm.plugin.finder.viewmodel.component.ty r7, int r8) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.ty.O6(com.tencent.mm.plugin.finder.viewmodel.component.ty, int):p15.n");
    }

    public final java.lang.String P6() {
        java.lang.String str;
        if (getActivity() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) {
            java.lang.String stringExtra = getIntent().getStringExtra("finder_username");
            return stringExtra == null ? "" : stringExtra;
        }
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC finderProfileDrawerUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class);
        return (finderProfileDrawerUIC == null || (str = finderProfileDrawerUIC.f133624i) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Q6() {
        /*
            r7 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r7.getActivity()
            androidx.appcompat.app.AppCompatActivity r1 = r7.getActivity()
            java.lang.String r2 = "activity"
            kotlin.jvm.internal.o.g(r1, r2)
            pf5.z r3 = pf5.z.f353948a
            pf5.v r1 = r3.a(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC> r4 = com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC.class
            pf5.b0 r1 = r1.e(r4)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC r1 = (com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC) r1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L25
            boolean r1 = r1.f133626n
            if (r1 != r4) goto L25
            r1 = r4
            goto L26
        L25:
            r1 = r5
        L26:
            androidx.appcompat.app.AppCompatActivity r6 = r7.getActivity()
            kotlin.jvm.internal.o.g(r6, r2)
            pf5.v r2 = r3.a(r6)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.s4> r6 = com.tencent.mm.plugin.finder.viewmodel.component.s4.class
            pf5.b0 r2 = r2.e(r6)
            com.tencent.mm.plugin.finder.viewmodel.component.s4 r2 = (com.tencent.mm.plugin.finder.viewmodel.component.s4) r2
            if (r2 == 0) goto L43
            boolean r2 = r2.P6()
            if (r2 != r4) goto L43
            r2 = r4
            goto L44
        L43:
            r2 = r5
        L44:
            boolean r6 = r0 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI
            if (r6 == 0) goto L52
            com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI r0 = (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) r0
            boolean r0 = r0.isFragmentMode()
            if (r0 != 0) goto L52
            r4 = 4
            goto La0
        L52:
            if (r1 != 0) goto L9f
            if (r2 == 0) goto L57
            goto L9f
        L57:
            android.app.Activity r0 = r7.getContext()
            java.lang.String r1 = "context"
            kotlin.jvm.internal.o.g(r0, r1)
            boolean r1 = r0 instanceof androidx.appcompat.app.AppCompatActivity
            if (r1 == 0) goto L93
            androidx.appcompat.app.AppCompatActivity r0 = (androidx.appcompat.app.AppCompatActivity) r0
            pf5.v r0 = r3.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.u6> r1 = com.tencent.mm.plugin.finder.viewmodel.component.u6.class
            pf5.b0 r0 = r0.e(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.u6 r0 = (com.tencent.mm.plugin.finder.viewmodel.component.u6) r0
            if (r0 == 0) goto L87
            com.tencent.mm.plugin.finder.view.f5 r0 = r0.O6()
            if (r0 == 0) goto L82
            boolean r0 = r0.b()
            if (r0 != r4) goto L82
            r0 = r4
            goto L83
        L82:
            r0 = r5
        L83:
            if (r0 != r4) goto L87
            r0 = r4
            goto L88
        L87:
            r0 = r5
        L88:
            if (r0 == 0) goto L8c
            r4 = 2
            goto La0
        L8c:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r7.f136068e
            if (r0 == 0) goto L91
            goto La0
        L91:
            r4 = r5
            goto La0
        L93:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9f:
            r4 = 3
        La0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.ty.Q6():int");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        if (getActivity() instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) {
            return;
        }
        boolean z17 = getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeUI;
        com.tencent.mm.plugin.finder.viewmodel.component.py pyVar = this.f136069f;
        if (!z17) {
            android.app.Activity context = getContext();
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
            kotlin.jvm.internal.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.a(pyVar);
                return;
            }
            return;
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        for (com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment finderHomeTabFragment : ((com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.FinderHomeUIC.class)).getFragments()) {
            android.app.Activity context2 = getContext();
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            fc2.c Y6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).Y6(finderHomeTabFragment.f129265p);
            if (Y6 != null) {
                Y6.a(pyVar);
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        if (((java.lang.Boolean) ((jz5.n) this.f136067d).getValue()).booleanValue()) {
            i95.m c17 = i95.n0.c(ct.e3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) c17)).Ni(null);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        if (((java.lang.Boolean) ((jz5.n) this.f136067d).getValue()).booleanValue()) {
            i95.m c17 = i95.n0.c(ct.e3.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ((com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) c17)).Ni(new com.tencent.mm.plugin.finder.viewmodel.component.qy(this));
            i95.m c18 = i95.n0.c(ct.e3.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            com.tencent.mm.plugin.finder.viewmodel.component.ry ryVar = (com.tencent.mm.plugin.finder.viewmodel.component.ry) ((jz5.n) this.f136070g).getValue();
            com.tencent.mm.ui.feature.api.screenshot.j1 j1Var = (com.tencent.mm.ui.feature.api.screenshot.j1) ((ct.e3) c18);
            com.tencent.mars.xlog.Log.i("MicroMsg.ScreenShotShareService", "serScreenShotShareReporter");
            j1Var.f208508q = ryVar != null ? new java.lang.ref.WeakReference(ryVar) : null;
        }
    }
}
