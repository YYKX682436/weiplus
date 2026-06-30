package com.tencent.mm.plugin.magicbrush.view;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u0016\u0010\n\u001a\u00020\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b¨\u0006\u0011"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/view/MBSurfaceStub;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "", "Landroid/graphics/RectF;", "rectList", "Ljz5/f0;", "setTouchableRectList", "Lkotlin/Function0;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setSurfaceUpdateListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mb-commons_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class MBSurfaceStub extends android.widget.FrameLayout implements android.view.TextureView.SurfaceTextureListener {

    /* renamed from: d, reason: collision with root package name */
    public android.view.TextureView f148184d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.SurfaceTexture f148185e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.Surface f148186f;

    /* renamed from: g, reason: collision with root package name */
    public int f148187g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f148188h;

    /* renamed from: i, reason: collision with root package name */
    public jc3.o f148189i;

    /* renamed from: m, reason: collision with root package name */
    public yz5.a f148190m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MBSurfaceStub(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(android.graphics.SurfaceTexture texture, int i17, int i18) {
        kotlin.jvm.internal.o.g(texture, "texture");
        com.tencent.mars.xlog.Log.i("MBSurfaceStub", "onSurfaceTextureAvailable: " + i17 + ' ' + i18 + ' ' + this.f148187g);
        this.f148185e = texture;
        android.view.Surface surface = new android.view.Surface(texture);
        this.f148186f = surface;
        jc3.o oVar = this.f148189i;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("canvasEventConsumer");
            throw null;
        }
        ((rc3.w0) oVar).pg(this.f148187g, surface, i17, i18);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MBSurfaceStub", "onSurfaceTextureDestroyed " + this.f148187g);
        jc3.o oVar = this.f148189i;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("canvasEventConsumer");
            throw null;
        }
        rc3.w0 w0Var = (rc3.w0) oVar;
        w0Var.M(new rc3.k0(w0Var, this.f148187g));
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(android.graphics.SurfaceTexture surface, int i17, int i18) {
        kotlin.jvm.internal.o.g(surface, "surface");
        com.tencent.mars.xlog.Log.i("MBSurfaceStub", "onSurfaceTextureSizeChanged: " + i17 + ' ' + i18 + ' ' + this.f148187g);
        jc3.o oVar = this.f148189i;
        if (oVar == null) {
            kotlin.jvm.internal.o.o("canvasEventConsumer");
            throw null;
        }
        rc3.w0 w0Var = (rc3.w0) oVar;
        w0Var.M(new rc3.l0(w0Var, this.f148187g, i17, i18));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(android.graphics.SurfaceTexture surface) {
        kotlin.jvm.internal.o.g(surface, "surface");
        yz5.a aVar = this.f148190m;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r13) {
        /*
            r12 = this;
            java.lang.String r0 = "event"
            kotlin.jvm.internal.o.g(r13, r0)
            android.view.TextureView r0 = r12.f148184d
            r1 = 0
            if (r0 != 0) goto Lb
            return r1
        Lb:
            int r0 = r13.getAction()
            r2 = 1
            if (r0 != 0) goto L40
            java.util.List r0 = r12.f148188h
            if (r0 == 0) goto L3c
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L1e
        L1c:
            r0 = r1
            goto L3d
        L1e:
            java.util.Iterator r0 = r0.iterator()
        L22:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1c
            java.lang.Object r3 = r0.next()
            android.graphics.RectF r3 = (android.graphics.RectF) r3
            float r4 = r13.getX()
            float r5 = r13.getY()
            boolean r3 = r3.contains(r4, r5)
            if (r3 == 0) goto L22
        L3c:
            r0 = r2
        L3d:
            if (r0 != 0) goto L40
            return r1
        L40:
            int r0 = r13.getPointerCount()
            int[] r9 = new int[r0]
            int r0 = r13.getPointerCount()
            float[] r10 = new float[r0]
            int r0 = r13.getPointerCount()
            float[] r11 = new float[r0]
            int r0 = r13.getPointerCount()
        L56:
            if (r1 >= r0) goto L6d
            int r3 = r13.getPointerId(r1)
            r9[r1] = r3
            float r3 = r13.getX(r1)
            r10[r1] = r3
            float r3 = r13.getY(r1)
            r11[r1] = r3
            int r1 = r1 + 1
            goto L56
        L6d:
            jc3.o r0 = r12.f148189i
            if (r0 == 0) goto L86
            int r4 = r12.f148187g
            int r5 = r13.getActionMasked()
            int r6 = r13.getActionIndex()
            long r7 = r13.getEventTime()
            r3 = r0
            rc3.w0 r3 = (rc3.w0) r3
            r3.p(r4, r5, r6, r7, r9, r10, r11)
            return r2
        L86:
            java.lang.String r13 = "canvasEventConsumer"
            kotlin.jvm.internal.o.o(r13)
            r13 = 0
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.magicbrush.view.MBSurfaceStub.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setSurfaceUpdateListener(yz5.a aVar) {
        this.f148190m = aVar;
    }

    public final void setTouchableRectList(java.util.List<? extends android.graphics.RectF> rectList) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(rectList, "rectList");
        if (!rectList.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(rectList, 10));
            java.util.Iterator<T> it = rectList.iterator();
            while (it.hasNext()) {
                arrayList.add(((android.graphics.RectF) it.next()).toString());
            }
            java.util.Iterator it6 = arrayList.iterator();
            if (!it6.hasNext()) {
                throw new java.lang.UnsupportedOperationException("Empty collection can't be reduced.");
            }
            java.lang.Object next = it6.next();
            while (it6.hasNext()) {
                next = ((java.lang.String) next) + ';' + ((java.lang.String) it6.next());
            }
            str = (java.lang.String) next;
        } else {
            str = "";
        }
        kotlin.jvm.internal.o.d(str);
        this.f148188h = rectList;
    }
}
