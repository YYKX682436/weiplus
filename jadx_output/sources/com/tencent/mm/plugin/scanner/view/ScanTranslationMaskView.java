package com.tencent.mm.plugin.scanner.view;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rB#\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\u000fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/scanner/view/ScanTranslationMaskView;", "Lcom/tencent/mm/plugin/scanner/view/BaseScanMaskView;", "Lcom/tencent/mm/plugin/scanner/api/BaseScanRequest;", "Landroid/hardware/Camera$PreviewCallback;", "", "bottomHeight", "Ljz5/f0;", "setBottomExtraHeight", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scan-translation_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public final class ScanTranslationMaskView extends com.tencent.mm.plugin.scanner.view.BaseScanMaskView<com.tencent.mm.plugin.scanner.api.BaseScanRequest> implements android.hardware.Camera.PreviewCallback {
    public long A;
    public com.tencent.mm.plugin.scanner.model.l2 B;

    /* renamed from: x, reason: collision with root package name */
    public android.view.View f159917x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f159918y;

    /* renamed from: z, reason: collision with root package name */
    public final long[] f159919z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ScanTranslationMaskView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView, com.tencent.mm.plugin.scanner.view.b
    public void g(android.animation.Animator.AnimatorListener animatorListener) {
        synchronized (java.lang.Boolean.valueOf(this.f159918y)) {
            this.f159918y = true;
        }
        e04.i3.a(this, 1.0f, 0.0f, 200L, animatorListener);
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    public void k(int i17) {
        super.k(i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationMaskView", "onNetworkChange state: %d, currentNetworkAvailable: %b", java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(getCurrentNetworkAvailable()));
        v();
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    public void m(boolean z17) {
        super.m(z17);
        android.view.View view = this.f159917x;
        if (view == null) {
            kotlin.jvm.internal.o.o("captureBtn");
            throw null;
        }
        view.setEnabled(true);
        this.f159919z[0] = java.lang.System.currentTimeMillis();
        setVisibility(0);
        if (getCurrentNetworkAvailable()) {
            e04.i3.a(this, 0.0f, 1.0f, 200L, null);
        }
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    public void n() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationMaskView", "onResume");
        this.f159919z[0] = java.lang.System.currentTimeMillis();
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, android.hardware.Camera camera) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = bArr != null ? java.lang.Integer.valueOf(bArr.length) : null;
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanTranslationMaskView", "onPreviewFrame data size: %d", objArr);
        if (bArr == null) {
            return;
        }
        if (!(true ^ (bArr.length == 0)) || getScanCamera() == null) {
            return;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("key_translate_yuv_byte_array", bArr);
        xy3.a scanCamera = getScanCamera();
        kotlin.jvm.internal.o.d(scanCamera);
        bundle.putParcelable("key_translate_camera_resolution", scanCamera.f366662g);
        xy3.a scanCamera2 = getScanCamera();
        kotlin.jvm.internal.o.d(scanCamera2);
        bundle.putInt("key_translate_camera_rotation", scanCamera2.f366667l);
        bundle.putLong("key_translate_capture_time", this.A);
        com.tencent.mm.plugin.scanner.model.l2 l2Var = this.B;
        if (l2Var != null) {
            l2Var.b(java.lang.System.currentTimeMillis(), bundle);
        }
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    public void s() {
        super.s();
        synchronized (java.lang.Boolean.valueOf(this.f159918y)) {
            this.f159918y = false;
        }
        v();
    }

    @Override // com.tencent.mm.plugin.scanner.view.BaseScanMaskView
    public void setBottomExtraHeight(int i17) {
        super.setBottomExtraHeight(i17);
        android.view.View view = this.f159917x;
        if (view == null) {
            kotlin.jvm.internal.o.o("captureBtn");
            throw null;
        }
        if (view == null) {
            kotlin.jvm.internal.o.o("captureBtn");
            throw null;
        }
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i65.a.b(getContext(), 24) + getMBottomExtraHeight();
        }
        view.setLayoutParams(layoutParams);
    }

    public final void v() {
        if (getCurrentNetworkAvailable()) {
            android.view.View view = this.f159917x;
            if (view == null) {
                kotlin.jvm.internal.o.o("captureBtn");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = this.f159917x;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("captureBtn");
            throw null;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/scanner/view/ScanTranslationMaskView", "updateViewByNetwork", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanTranslationMaskView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f159919z = new long[2];
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.boz, this);
        kotlin.jvm.internal.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.m_b);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f159917x = findViewById;
        findViewById.setEnabled(false);
        android.view.View view = this.f159917x;
        if (view != null) {
            view.setOnClickListener(new com.tencent.mm.plugin.scanner.view.x0(this));
            this.B = new com.tencent.mm.plugin.scanner.model.l2(context);
        } else {
            kotlin.jvm.internal.o.o("captureBtn");
            throw null;
        }
    }
}
