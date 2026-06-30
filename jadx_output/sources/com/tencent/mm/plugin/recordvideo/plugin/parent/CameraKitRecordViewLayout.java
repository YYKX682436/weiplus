package com.tencent.mm.plugin.recordvideo.plugin.parent;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\n\u0010\u000eJ\b\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/CameraKitRecordViewLayout;", "Landroid/widget/FrameLayout;", "Lnr0/c;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/o;", "getLifecycle", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class CameraKitRecordViewLayout extends android.widget.FrameLayout implements nr0.c, androidx.lifecycle.y {

    /* renamed from: d, reason: collision with root package name */
    public final androidx.lifecycle.b0 f155805d;

    /* renamed from: e, reason: collision with root package name */
    public final lu3.m f155806e;

    /* renamed from: f, reason: collision with root package name */
    public final bs0.j f155807f;

    /* renamed from: g, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f155808g;

    /* renamed from: h, reason: collision with root package name */
    public ju3.y f155809h;

    /* renamed from: i, reason: collision with root package name */
    public ju3.x f155810i;

    /* renamed from: m, reason: collision with root package name */
    public int f155811m;

    /* renamed from: n, reason: collision with root package name */
    public int f155812n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f155813o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f155814p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraKitRecordViewLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f155805d = new androidx.lifecycle.b0(this, true);
        lu3.m mVar = new lu3.m(false, 1, null);
        this.f155806e = mVar;
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f155808g = a17;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dma, (android.view.ViewGroup) this, true);
        android.view.KeyEvent.Callback findViewById = findViewById(com.tencent.mm.R.id.b5a);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        bs0.j jVar = (bs0.j) findViewById;
        this.f155807f = jVar;
        jVar.l0(this);
        jVar.setCustomRender(this);
        kotlinx.coroutines.l.d(a17, null, null, new ju3.v(this, null), 3, null);
        mVar.h(true);
    }

    @Override // nr0.c
    public java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        java.lang.Object a17 = this.f155806e.a(continuation);
        return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
    }

    public final void b(ju3.x openCallback, ju3.y previewCallback, java.lang.String recordResultPath, int i17, int i18, int i19, int i27, int i28) {
        kotlin.jvm.internal.o.g(openCallback, "openCallback");
        kotlin.jvm.internal.o.g(previewCallback, "previewCallback");
        kotlin.jvm.internal.o.g(recordResultPath, "recordResultPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", hashCode() + " initCamera " + recordResultPath);
        this.f155810i = openCallback;
        this.f155809h = previewCallback;
        this.f155811m = i19;
        this.f155812n = 0;
        this.f155814p = false;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = new com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider();
        recordConfigProvider.A = com.tencent.mm.vfs.w6.i(recordResultPath, true);
        com.tencent.mm.modelcontrol.VideoTransPara videoTransPara = new com.tencent.mm.plugin.mmsight.SightParams(1, 1).f148819f;
        recordConfigProvider.f155676n = videoTransPara;
        videoTransPara.f71191d = i17;
        videoTransPara.f71192e = i18;
        videoTransPara.f71194g = i27;
        recordConfigProvider.M.putInt("key_record_bitrate_ratio", i28);
        st3.t tVar = st3.t.f412597a;
        com.tencent.mm.modelcontrol.VideoTransPara videoParam = recordConfigProvider.f155676n;
        kotlin.jvm.internal.o.f(videoParam, "videoParam");
        tVar.c(videoParam, 1, true);
        lu3.m mVar = this.f155806e;
        mVar.getClass();
        mVar.f321420p = recordConfigProvider;
        mVar.f321427w = mVar.c(true, new lu3.g(false, mVar, null));
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", "initCamera " + recordConfigProvider);
    }

    public final void c() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", "onCreate");
        try {
            this.f155805d.f(androidx.lifecycle.m.ON_CREATE);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraKitRecordViewLayout", "onCreate error " + e17.getMessage());
        }
    }

    @Override // nr0.c
    public java.lang.Object d(is0.c cVar, kotlin.coroutines.Continuation continuation) {
        byte[] array;
        ju3.y yVar;
        java.lang.System.currentTimeMillis();
        int i17 = this.f155812n;
        int i18 = this.f155811m;
        boolean z17 = this.f155814p;
        if (i17 % i18 == 0 && z17) {
            rs0.g gVar = rs0.i.f399296a;
            if (cVar == null) {
                array = null;
            } else {
                int i19 = cVar.f294395e;
                int i27 = cVar.f294400m;
                int i28 = cVar.f294401n;
                int[] iArr = new int[1];
                android.opengl.GLES20.glGenFramebuffers(1, iArr, 0);
                android.opengl.GLES20.glBindFramebuffer(36160, iArr[0]);
                android.opengl.GLES20.glFramebufferTexture2D(36160, 36064, 3553, i19, 0);
                java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i27 * i28 * 4);
                android.opengl.GLES20.glReadPixels(0, 0, i27, i28, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLFormat.GL_RGBA, com.github.henryye.nativeiv.bitmap.NativeBitmapStruct.GLType.GL_UNSIGNED_BYTE, allocate);
                array = allocate.array();
                android.opengl.GLES20.glBindFramebuffer(36160, 0);
                android.opengl.GLES20.glDeleteFramebuffers(1, iArr, 0);
            }
            if (array != null && (yVar = this.f155809h) != null) {
                yVar.a(array);
            }
        }
        this.f155812n++;
        return this.f155806e.d(cVar, continuation);
    }

    public final void e() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", hashCode() + " onDestroy");
        try {
            this.f155805d.f(androidx.lifecycle.m.ON_DESTROY);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraKitRecordViewLayout", "onDestroy error " + e17.getMessage());
        }
        kotlinx.coroutines.z0.e(this.f155808g, null, 1, null);
    }

    public final void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", "onPause");
        this.f155814p = false;
        if (this.f155813o) {
            return;
        }
        try {
            this.f155813o = true;
            this.f155805d.f(androidx.lifecycle.m.ON_PAUSE);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraKitRecordViewLayout", "onPause error " + e17.getMessage());
        }
    }

    @Override // nr0.c
    public java.lang.Object g(kotlin.coroutines.Continuation continuation) {
        java.lang.Object g17 = this.f155806e.g(continuation);
        return g17 == pz5.a.f359186d ? g17 : jz5.f0.f302826a;
    }

    @Override // androidx.lifecycle.y
    /* renamed from: getLifecycle */
    public androidx.lifecycle.o mo133getLifecycle() {
        return this.f155805d;
    }

    public final void h() {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", "onResume");
        this.f155813o = false;
        try {
            this.f155805d.f(androidx.lifecycle.m.ON_RESUME);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.CameraKitRecordViewLayout", "onResume error " + e17.getMessage());
        }
    }

    public final void i(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CameraKitRecordViewLayout", "startPreview " + i17);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        this.f155807f.f0(context, new xr0.h(null, new xr0.c(0, 0, i17, null, null, true, 27, null), new xr0.g(-1, -1), new xr0.b(false, false, false, false, false, 7, null), 1, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ju3.w
            if (r0 == 0) goto L13
            r0 = r6
            ju3.w r0 = (ju3.w) r0
            int r1 = r0.f302031f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f302031f = r1
            goto L18
        L13:
            ju3.w r0 = new ju3.w
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f302029d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f302031f
            java.lang.String r3 = "MicroMsg.CameraKitRecordViewLayout"
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            kotlin.ResultKt.throwOnFailure(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L31:
            kotlin.ResultKt.throwOnFailure(r6)
            java.lang.String r6 = "stopRecord"
            com.tencent.mars.xlog.Log.i(r3, r6)
            r0.f302031f = r4
            lu3.m r6 = r5.f155806e
            java.lang.Object r6 = r6.j(r4, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            jz5.l r6 = (jz5.l) r6
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "stop result >> "
            r0.<init>(r1)
            java.lang.Object r1 = r6.f302833d
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.i(r3, r0)
            jz5.l r0 = new jz5.l
            java.lang.Object r1 = r6.f302834e
            ct0.b r1 = (ct0.b) r1
            if (r1 == 0) goto L6c
            java.lang.String r1 = r1.f222204a
            goto L6d
        L6c:
            r1 = 0
        L6d:
            java.lang.Object r6 = r6.f302833d
            r0.<init>(r6, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.recordvideo.plugin.parent.CameraKitRecordViewLayout.j(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CameraKitRecordViewLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f155805d = new androidx.lifecycle.b0(this, true);
        lu3.m mVar = new lu3.m(false, 1, null);
        this.f155806e = mVar;
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) kotlinx.coroutines.t3.a(null, 1, null)).plus(kotlinx.coroutines.q1.f310570c));
        this.f155808g = a17;
        android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.dma, (android.view.ViewGroup) this, true);
        android.view.KeyEvent.Callback findViewById = findViewById(com.tencent.mm.R.id.b5a);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        bs0.j jVar = (bs0.j) findViewById;
        this.f155807f = jVar;
        jVar.l0(this);
        jVar.setCustomRender(this);
        kotlinx.coroutines.l.d(a17, null, null, new ju3.v(this, null), 3, null);
        mVar.h(true);
    }
}
