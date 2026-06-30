package nu0;

/* loaded from: classes5.dex */
public final class q0 extends nu0.e {

    /* renamed from: o, reason: collision with root package name */
    public final oz5.l f340072o;

    /* renamed from: p, reason: collision with root package name */
    public final oz5.l f340073p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.Map f340074q;

    /* renamed from: r, reason: collision with root package name */
    public volatile com.tencent.maas.imagestudio.MJImageSession f340075r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f340076s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f340077t;

    /* renamed from: u, reason: collision with root package name */
    public nu0.v f340078u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
        this.f340072o = ((kotlinx.coroutines.c3) a17).plus(p0Var.J(1));
        this.f340073p = ((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(p0Var.J(1));
        this.f340074q = new java.util.LinkedHashMap();
        this.f340076s = jz5.h.b(nu0.g0.f339940d);
        this.f340077t = new java.util.ArrayList();
    }

    public static final void W6(nu0.q0 q0Var) {
        q0Var.getClass();
        nf.e.f(new nu0.y(q0Var));
    }

    public static /* synthetic */ void Y6(nu0.q0 q0Var, boolean z17, com.tencent.maas.imagestudio.h hVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 2) != 0) {
            hVar = null;
        }
        q0Var.X6(z17, hVar);
    }

    public final void X6(boolean z17, com.tencent.maas.imagestudio.h hVar) {
        com.tencent.maas.imagestudio.MJImageSession mJImageSession;
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes;
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes2;
        com.tencent.maas.imagestudio.MJImageSession mJImageSession2 = this.f340075r;
        if (mJImageSession2 != null) {
            mJImageSession2.b(hVar);
        }
        int a76 = a7();
        if (z17) {
            com.tencent.maas.imagestudio.MJImageSession mJImageSession3 = this.f340075r;
            boolean z18 = false;
            int length = (mJImageSession3 == null || (imageScenes2 = mJImageSession3.getImageScenes()) == null) ? 0 : imageScenes2.length;
            if (a76 >= 0 && a76 < length) {
                z18 = true;
            }
            com.tencent.maas.imagestudio.MJImageScene mJImageScene = (!z18 || (mJImageSession = this.f340075r) == null || (imageScenes = mJImageSession.getImageScenes()) == null) ? null : imageScenes[a76];
            if (mJImageScene != null) {
                g7(a76, mJImageScene, new nu0.p0(a76, this));
            }
        }
        com.tencent.mars.xlog.Log.i("ImageControlUIC", "[commitUpdate] index:" + a76);
    }

    public final com.tencent.maas.imagestudio.MJImageScene Z6() {
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = this.f340075r;
        if (mJImageSession != null) {
            return mJImageSession.c();
        }
        return null;
    }

    public final int a7() {
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes;
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = this.f340075r;
        if (mJImageSession == null || (imageScenes = mJImageSession.getImageScenes()) == null) {
            return 0;
        }
        int length = imageScenes.length;
        for (int i17 = 0; i17 < length; i17++) {
            java.lang.String sceneID = imageScenes[i17].getSceneID();
            com.tencent.maas.imagestudio.MJImageScene Z6 = Z6();
            if (kotlin.jvm.internal.o.b(sceneID, Z6 != null ? Z6.getSceneID() : null)) {
                return i17;
            }
        }
        return -1;
    }

    public final com.tencent.maas.imagestudio.MJImageLayer b7(java.lang.String str) {
        com.tencent.maas.imagestudio.MJImageScene Z6;
        if (str == null || (Z6 = Z6()) == null) {
            return null;
        }
        return Z6.d(str);
    }

    public final com.tencent.maas.base.Vec2 c7() {
        i95.m c17 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        float l27 = com.tencent.mm.plugin.finder.storage.t70.f127590a.l2();
        i95.m c18 = i95.n0.c(m40.k0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        return new com.tencent.maas.base.Vec2(l27, r1.k2());
    }

    public final void clear() {
        ((java.util.LinkedHashMap) this.f340074q).clear();
    }

    public final java.lang.String d7(int i17) {
        com.tencent.maas.imagestudio.MJImageScene mJImageScene;
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = this.f340075r;
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes = mJImageSession != null ? mJImageSession.getImageScenes() : null;
        if (imageScenes != null && i17 >= 0 && i17 < imageScenes.length && (mJImageScene = imageScenes[i17]) != null) {
            return mJImageScene.getSceneID();
        }
        return null;
    }

    public final long e7() {
        com.tencent.maas.imagestudio.MJImageScene Z6 = Z6();
        com.tencent.maas.model.time.MJTime InvalidTime = Z6 != null ? Z6.getCreationTime() : null;
        if (InvalidTime == null) {
            InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
            kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
        }
        if (!InvalidTime.isValid()) {
            com.tencent.maas.imagestudio.MJImageScene Z62 = Z6();
            com.tencent.maas.model.time.MJTime modificationTime = Z62 != null ? Z62.getModificationTime() : null;
            if (modificationTime == null) {
                InvalidTime = com.tencent.maas.model.time.MJTime.InvalidTime;
                kotlin.jvm.internal.o.f(InvalidTime, "InvalidTime");
            } else {
                InvalidTime = modificationTime;
            }
        }
        return !InvalidTime.isValid() ? java.lang.System.currentTimeMillis() : (long) InvalidTime.toMilliseconds();
    }

    public final boolean f7(java.lang.String str) {
        if (str == null || str.length() == 0) {
            return false;
        }
        com.tencent.maas.imagestudio.MJImageScene Z6 = Z6();
        boolean e17 = Z6 != null ? Z6.e(str) : false;
        Y6(this, false, null, 3, null);
        return e17;
    }

    public final void g7(int i17, com.tencent.maas.imagestudio.MJImageScene mJImageScene, yz5.l lVar) {
        com.tencent.mars.xlog.Log.i("ImageControlUIC", "[saveSnapshot] start index:" + i17);
        mJImageScene.f((java.lang.String) ((jz5.n) this.f340076s).getValue(), com.tencent.maas.imagestudio.c.PNG, new nu0.f0(i17, lVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h7(android.view.SurfaceView r7, java.util.List r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof nu0.j0
            if (r0 == 0) goto L13
            r0 = r9
            nu0.j0 r0 = (nu0.j0) r0
            int r1 = r0.f339982i
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f339982i = r1
            goto L18
        L13:
            nu0.j0 r0 = new nu0.j0
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f339980g
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f339982i
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L43
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L6d
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            java.lang.Object r7 = r0.f339979f
            r8 = r7
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r7 = r0.f339978e
            android.view.SurfaceView r7 = (android.view.SurfaceView) r7
            java.lang.Object r2 = r0.f339977d
            nu0.q0 r2 = (nu0.q0) r2
            kotlin.ResultKt.throwOnFailure(r9)
            goto L56
        L43:
            kotlin.ResultKt.throwOnFailure(r9)
            r0.f339977d = r6
            r0.f339978e = r7
            r0.f339979f = r8
            r0.f339982i = r4
            java.lang.Object r9 = r6.O6(r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            r2 = r6
        L56:
            oz5.l r9 = r2.f340072o
            nu0.n0 r4 = new nu0.n0
            r5 = 0
            r4.<init>(r2, r7, r8, r5)
            r0.f339977d = r5
            r0.f339978e = r5
            r0.f339979f = r5
            r0.f339982i = r3
            java.lang.Object r7 = kotlinx.coroutines.l.g(r9, r4, r0)
            if (r7 != r1) goto L6d
            return r1
        L6d:
            jz5.f0 r7 = jz5.f0.f302826a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.q0.h7(android.view.SurfaceView, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.vfs.w6.f((java.lang.String) ((jz5.n) this.f340076s).getValue());
    }
}
