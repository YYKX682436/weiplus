package com.tencent.mm.plugin.finder.live.multistream.panel.preview;

@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u000fB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/multistream/panel/preview/MultiStreamPreviewView;", "Landroid/widget/FrameLayout;", "Ljava/util/LinkedList;", "Lr45/qa4;", "h", "Ljz5/g;", "getEnterLiveStep", "()Ljava/util/LinkedList;", "enterLiveStep", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "wk2/k", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class MultiStreamPreviewView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public mn0.b0 f111756d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.rtmp.ui.TXCloudVideoView f111757e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f111758f;

    /* renamed from: g, reason: collision with root package name */
    public uk2.a f111759g;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public final jz5.g enterLiveStep;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiStreamPreviewView(android.content.Context context) {
        super(context.getApplicationContext());
        kotlin.jvm.internal.o.g(context, "context");
        this.enterLiveStep = jz5.h.b(wk2.l.f446956d);
        b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.util.LinkedList<r45.qa4> getEnterLiveStep() {
        return (java.util.LinkedList) this.enterLiveStep.getValue();
    }

    public final void b(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f111757e = new com.tencent.rtmp.ui.TXCloudVideoView(context);
        android.widget.ImageView imageView = new android.widget.ImageView(context);
        imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        imageView.setVisibility(8);
        this.f111758f = imageView;
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        android.view.View view = this.f111758f;
        if (view == null) {
            kotlin.jvm.internal.o.o("bgView");
            throw null;
        }
        addView(view, layoutParams);
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        android.view.View view2 = this.f111757e;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        addView(view2, layoutParams2);
        mn0.z zVar = new mn0.z(context);
        this.f111756d = zVar;
        zVar.f(true);
        mn0.b0 b0Var = this.f111756d;
        if (b0Var != null) {
            ((mn0.y) b0Var).J(new wk2.k(this));
        }
        mn0.b0 b0Var2 = this.f111756d;
        if (b0Var2 != null) {
            ((mn0.y) b0Var2).G(true);
        }
    }

    public final void c(uk2.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        getEnterLiveStep().clear();
        java.util.LinkedList<r45.qa4> enterLiveStep = getEnterLiveStep();
        r45.qa4 qa4Var = new r45.qa4();
        qa4Var.set(0, "startPlay");
        qa4Var.set(1, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
        enterLiveStep.add(qa4Var);
        this.f111759g = data;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlay: ");
        sb6.append(this.f111756d);
        sb6.append(" hashCode: ");
        mn0.b0 b0Var = this.f111756d;
        sb6.append(b0Var != null ? b0Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MultiStreamPreviewView", sb6.toString());
        android.widget.ImageView imageView = this.f111758f;
        if (imageView == null) {
            kotlin.jvm.internal.o.o("bgView");
            throw null;
        }
        imageView.setVisibility(8);
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView = this.f111757e;
        if (tXCloudVideoView == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        tXCloudVideoView.removeVideoView();
        com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView2 = this.f111757e;
        if (tXCloudVideoView2 == null) {
            kotlin.jvm.internal.o.o("videoView");
            throw null;
        }
        tXCloudVideoView2.addVideoView(new android.view.TextureView(getContext()));
        mn0.b0 b0Var2 = this.f111756d;
        if (b0Var2 != null) {
            ((mn0.y) b0Var2).F(com.tencent.mm.plugin.finder.live.util.n2.b(com.tencent.mm.plugin.finder.live.util.n2.f115640a, "MultiStreamPreviewView", true, null, data.f428520f, 0, 0, 52, null));
        }
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("start player: ");
        sb7.append(this.f111756d);
        sb7.append(" hashCode: ");
        mn0.b0 b0Var3 = this.f111756d;
        sb7.append(b0Var3 != null ? b0Var3.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MultiStreamPreviewView", sb7.toString());
        r45.ka4 ka4Var = data.f428520f;
        if (ka4Var != null && ka4Var.V >= ka4Var.W) {
            mn0.b0 b0Var4 = this.f111756d;
            if (b0Var4 != null) {
                ((mn0.y) b0Var4).Q(1);
            }
        } else {
            mn0.b0 b0Var5 = this.f111756d;
            if (b0Var5 != null) {
                ((mn0.y) b0Var5).Q(0);
            }
        }
        mn0.b0 b0Var6 = this.f111756d;
        if (b0Var6 != null) {
            com.tencent.rtmp.ui.TXCloudVideoView tXCloudVideoView3 = this.f111757e;
            if (tXCloudVideoView3 == null) {
                kotlin.jvm.internal.o.o("videoView");
                throw null;
            }
            mn0.b0.B(b0Var6, tXCloudVideoView3, null, 2, null);
        }
        mn0.b0 b0Var7 = this.f111756d;
        if (b0Var7 != null) {
            ((mn0.y) b0Var7).J(new wk2.k(this));
        }
        mn0.b0 b0Var8 = this.f111756d;
        if (b0Var8 != null) {
            java.lang.String str = data.f428519e;
            r45.ka4 ka4Var2 = data.f428520f;
            je2.z zVar = (je2.z) dk2.ef.f233372a.i(je2.z.class);
            mn0.b0.D(b0Var8, str, 1, ka4Var2, zVar != null ? zVar.P6() : null, false, false, 48, null);
        }
        mn2.g1 g1Var = mn2.g1.f329975a;
        vo0.d c17 = g1Var.c();
        mn2.e0 e0Var = new mn2.e0(data.f428518d, com.tencent.mm.plugin.finder.storage.y90.f128356f);
        android.widget.ImageView imageView2 = this.f111758f;
        if (imageView2 != null) {
            c17.c(e0Var, imageView2, g1Var.h(mn2.f1.f329957h));
        } else {
            kotlin.jvm.internal.o.o("bgView");
            throw null;
        }
    }

    public final void d() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPlay: ");
        sb6.append(this.f111756d);
        sb6.append(" hashCode: ");
        mn0.b0 b0Var = this.f111756d;
        sb6.append(b0Var != null ? b0Var.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("MultiStreamPreviewView", sb6.toString());
        mn0.b0 b0Var2 = this.f111756d;
        if (b0Var2 != null) {
            mn0.b0.C(b0Var2, true, false, false, 6, null);
        }
        android.widget.ImageView imageView = this.f111758f;
        if (imageView != null) {
            imageView.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("bgView");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiStreamPreviewView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context.getApplicationContext(), attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.enterLiveStep = jz5.h.b(wk2.l.f446956d);
        b(context);
    }
}
