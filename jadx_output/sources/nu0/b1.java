package nu0;

/* loaded from: classes5.dex */
public final class b1 extends du0.o {

    /* renamed from: y, reason: collision with root package name */
    public boolean f339870y;

    /* renamed from: z, reason: collision with root package name */
    public final jz5.g f339871z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f339871z = jz5.h.b(new nu0.x0(this));
    }

    @Override // dv0.a
    public void F5(au0.b boxItem) {
        com.tencent.maas.imagestudio.MJImageSession mJImageSession;
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes;
        com.tencent.maas.imagestudio.MJImageScene[] imageScenes2;
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
        if (this.f339870y) {
            com.tencent.mars.xlog.Log.i("ImageHandleBoxUIC", "[onEnd] updateCurrentSnapshot");
            nu0.q0 q76 = q7();
            int a76 = q76.a7();
            com.tencent.maas.imagestudio.MJImageSession mJImageSession2 = q76.f340075r;
            com.tencent.maas.imagestudio.MJImageScene mJImageScene = (!(a76 >= 0 && a76 < ((mJImageSession2 == null || (imageScenes2 = mJImageSession2.getImageScenes()) == null) ? 0 : imageScenes2.length)) || (mJImageSession = q76.f340075r) == null || (imageScenes = mJImageSession.getImageScenes()) == null) ? null : imageScenes[a76];
            if (mJImageScene != null) {
                q76.g7(a76, mJImageScene, new nu0.p0(a76, q76));
            }
            this.f339870y = false;
        }
    }

    @Override // dv0.a
    public boolean H4(au0.b selectedBoxItem, com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner corner) {
        kotlin.jvm.internal.o.g(selectedBoxItem, "selectedBoxItem");
        kotlin.jvm.internal.o.g(corner, "corner");
        cv0.m a17 = cv0.h.a(selectedBoxItem.b(), corner);
        if (a17 == cv0.m.f222543e) {
            return false;
        }
        W6().H7(selectedBoxItem.c(), selectedBoxItem.b(), a17, zw0.b.f476552f);
        return true;
    }

    @Override // dv0.a
    public com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner M5(android.graphics.PointF location, com.tencent.maas.base.Rect2 rect) {
        kotlin.jvm.internal.o.g(location, "location");
        kotlin.jvm.internal.o.g(rect, "rect");
        nu0.q0 q76 = q7();
        q76.getClass();
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = q76.f340075r;
        com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner f17 = mJImageSession != null ? mJImageSession.f(new com.tencent.maas.base.Vec2(location.x, location.y), rect) : null;
        return f17 == null ? com.tencent.maas.handlebox.model.MJHandleBoxItem.MJRectCorner.MJRectCornerInvalid : f17;
    }

    @Override // dv0.a
    public boolean P4(au0.b boxItem) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
        return true;
    }

    @Override // du0.o
    public cv0.c V6() {
        return new lu0.b(new cv0.d(), this);
    }

    @Override // dv0.a
    public com.tencent.maas.base.MJID W0(android.graphics.PointF pointF) {
        kotlin.jvm.internal.o.g(pointF, "pointF");
        com.tencent.maas.base.Vec2 vec2 = new com.tencent.maas.base.Vec2(pointF.x, pointF.y);
        nu0.q0 q76 = q7();
        q76.getClass();
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = q76.f340075r;
        java.lang.String h17 = mJImageSession != null ? mJImageSession.h(vec2) : null;
        if (h17 == null || h17.length() == 0) {
            return null;
        }
        return com.tencent.maas.base.MJID.of(h17);
    }

    @Override // dv0.a
    public void a4(au0.b boxItem, float f17, float f18, com.tencent.maas.base.Rect2 renderViewRect2) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
        kotlin.jvm.internal.o.g(renderViewRect2, "renderViewRect2");
        java.lang.Object obj = boxItem.f14053a;
        com.tencent.maas.base.Vec2 layerPosition = ((com.tencent.maas.imagestudio.MJImageLayer) obj).getLayerPosition();
        kotlin.jvm.internal.o.f(layerPosition, "getLayerPosition(...)");
        ((com.tencent.maas.imagestudio.MJImageLayer) obj).a(new com.tencent.maas.base.Vec2(layerPosition.f47799x + f17, layerPosition.f47800y - f18));
        nu0.q0.Y6(q7(), false, null, 2, null);
        this.f339870y = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // dv0.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d5(boolean r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof nu0.y0
            if (r0 == 0) goto L13
            r0 = r6
            nu0.y0 r0 = (nu0.y0) r0
            int r1 = r0.f340147f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f340147f = r1
            goto L18
        L13:
            nu0.y0 r0 = new nu0.y0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.f340145d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f340147f
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            kotlin.ResultKt.throwOnFailure(r6)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            kotlin.ResultKt.throwOnFailure(r6)
            r0.f340147f = r3
            java.lang.Object r5 = r4.r7(r5, r0)
            if (r5 != r1) goto L3b
            return r1
        L3b:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b1.d5(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // du0.o
    public hw0.n g7() {
        return (hw0.n) T6(nu0.p.class);
    }

    @Override // du0.o
    public ow0.a0 h7() {
        return (ow0.a0) T6(nu0.s.class);
    }

    @Override // du0.o
    public gx0.w i7() {
        return (gx0.w) T6(nu0.u0.class);
    }

    @Override // du0.o
    public yt0.c k7() {
        return (yt0.c) T6(nu0.b4.class);
    }

    @Override // dv0.a
    public boolean l0(android.graphics.PointF location, com.tencent.maas.base.Rect2 rect) {
        kotlin.jvm.internal.o.g(location, "location");
        kotlin.jvm.internal.o.g(rect, "rect");
        nu0.q0 q76 = q7();
        q76.getClass();
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = q76.f340075r;
        if (mJImageSession != null) {
            return mJImageSession.g(new com.tencent.maas.base.Vec2(location.x, location.y), rect);
        }
        return false;
    }

    @Override // du0.o
    public void m7(au0.b boxItem, boolean z17) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
        if (boxItem.isEnable()) {
            kotlinx.coroutines.l.d(getMainScope(), null, null, new nu0.z0(boxItem, this, null), 3, null);
        }
    }

    @Override // dv0.a
    public au0.b o6(com.tencent.maas.base.MJID mjID) {
        kotlin.jvm.internal.o.g(mjID, "mjID");
        com.tencent.maas.imagestudio.MJImageLayer b76 = q7().b7(mjID.value());
        if (b76 == null) {
            return null;
        }
        return new lu0.a(b76);
    }

    @Override // dv0.a
    public boolean q() {
        nu0.q0 q76 = q7();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[isHandleBoxEnabled] ");
        com.tencent.maas.imagestudio.MJImageSession mJImageSession = q76.f340075r;
        sb6.append(mJImageSession != null ? java.lang.Boolean.valueOf(mJImageSession.isHandleBoxEnabled()) : null);
        com.tencent.mars.xlog.Log.i("ImageControlUIC", sb6.toString());
        com.tencent.maas.imagestudio.MJImageSession mJImageSession2 = q76.f340075r;
        if (mJImageSession2 != null) {
            return mJImageSession2.isHandleBoxEnabled();
        }
        return false;
    }

    public final nu0.q0 q7() {
        return (nu0.q0) ((jz5.n) this.f339871z).getValue();
    }

    @Override // dv0.a
    public void r2(au0.b boxItem, float f17, float f18, boolean z17) {
        kotlin.jvm.internal.o.g(boxItem, "boxItem");
        java.lang.String value = boxItem.c().value();
        kotlin.jvm.internal.o.f(value, "value(...)");
        float layerScale = ((com.tencent.maas.imagestudio.MJImageLayer) boxItem.f14053a).getLayerScale();
        yw0.k Y6 = Y6();
        float a17 = ou0.c0.a(layerScale * f17, 1.0f, f17, 0.1f, Y6.f466565g, new yw0.j(Y6));
        if (!(layerScale == a17)) {
            float f19 = a17 * layerScale;
            if (f19 < 0.3f) {
                f19 = 0.3f;
            }
            if (f19 > 5.0f) {
                f19 = 5.0f;
            }
            nu0.q0 q76 = q7();
            q76.getClass();
            com.tencent.maas.imagestudio.MJImageLayer b76 = q76.b7(value);
            if (b76 != null) {
                b76.c(f19);
                nu0.q0.Y6(q76, false, null, 2, null);
            }
            this.f339870y = true;
        }
        float d17 = boxItem.d();
        float h17 = Y6().h(boxItem, f18);
        if (d17 == h17) {
            return;
        }
        nu0.q0 q77 = q7();
        q77.getClass();
        com.tencent.maas.imagestudio.MJImageLayer b77 = q77.b7(value);
        if (b77 != null) {
            b77.b(h17);
            nu0.q0.Y6(q77, false, null, 2, null);
        }
        this.f339870y = true;
    }

    @Override // dv0.a
    public void r6(com.tencent.maas.moviecomposing.x onChange) {
        kotlin.jvm.internal.o.g(onChange, "onChange");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r7(boolean r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r5 = r6 instanceof nu0.a1
            if (r5 == 0) goto L13
            r5 = r6
            nu0.a1 r5 = (nu0.a1) r5
            int r0 = r5.f339863g
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r5.f339863g = r0
            goto L18
        L13:
            nu0.a1 r5 = new nu0.a1
            r5.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r5.f339861e
            pz5.a r0 = pz5.a.f359186d
            int r1 = r5.f339863g
            jz5.f0 r2 = jz5.f0.f302826a
            r3 = 1
            if (r1 == 0) goto L35
            if (r1 != r3) goto L2d
            java.lang.Object r5 = r5.f339860d
            nu0.b1 r5 = (nu0.b1) r5
            kotlin.ResultKt.throwOnFailure(r6)
            goto L47
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.ResultKt.throwOnFailure(r6)
            r5.f339860d = r4
            r5.f339863g = r3
            yw0.k r5 = r4.Y6()
            r5.e()
            if (r2 != r0) goto L46
            return r0
        L46:
            r5 = r4
        L47:
            nu0.q0 r5 = r5.q7()
            com.tencent.maas.imagestudio.MJImageSession r6 = r5.f340075r
            if (r6 == 0) goto L52
            r6.k()
        L52:
            com.tencent.maas.imagestudio.MJImageSession r6 = r5.f340075r
            if (r6 == 0) goto L59
            r6.d()
        L59:
            java.lang.String r6 = "ImageControlUIC"
            java.lang.String r0 = "[removeBoxItem] disableHandleBox"
            com.tencent.mars.xlog.Log.i(r6, r0)
            r6 = 2
            r0 = 0
            r1 = 0
            nu0.q0.Y6(r5, r1, r0, r6, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nu0.b1.r7(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
