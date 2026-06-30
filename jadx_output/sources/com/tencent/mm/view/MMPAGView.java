package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0004789:B\u001b\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104B#\b\u0016\u0012\u0006\u00100\u001a\u00020/\u0012\b\u00102\u001a\u0004\u0018\u000101\u0012\u0006\u00105\u001a\u00020\u0002¢\u0006\u0004\b3\u00106J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\n\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0011\u001a\u0004\u0018\u00010\rR*\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010 \u001a\u00020\u001b2\u0006\u0010\u0013\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010&\u001a\u00020!2\u0006\u0010\u0013\u001a\u00020!8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0013\u0010.\u001a\u0004\u0018\u00010+8F¢\u0006\u0006\u001a\u0004\b,\u0010-¨\u0006;"}, d2 = {"Lcom/tencent/mm/view/MMPAGView;", "Landroid/widget/FrameLayout;", "", "mode", "Ljz5/f0;", "setScaleMode", "count", "setRepeatCount", "", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "setComposition", "Lorg/libpag/PAGFile;", "pagFile", "Lcom/tencent/mm/rfx/RfxPagFile;", "rfxPagFile", "Lorg/libpag/PAGComposition;", "getComposition", "getRfxComposition", "", "value", "g", "Z", "getUseRfx", "()Z", "setUseRfx", "(Z)V", "useRfx", "Landroid/graphics/Matrix;", "getPagMatrix", "()Landroid/graphics/Matrix;", "setPagMatrix", "(Landroid/graphics/Matrix;)V", "pagMatrix", "", "getProgress", "()D", "setProgress", "(D)V", "progress", "getPath", "()Ljava/lang/String;", "setPath", "(Ljava/lang/String;)V", "Landroid/graphics/Bitmap;", "getBitmap", "()Landroid/graphics/Bitmap;", "bitmap", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ym5/v1", "ym5/w1", "ym5/x1", "ym5/y1", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes13.dex */
public class MMPAGView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f213327d;

    /* renamed from: e, reason: collision with root package name */
    public final org.libpag.PAGView f213328e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.rfx.RfxPagView f213329f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean useRfx;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f213331h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f213332i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f213333m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f213334n;

    /* renamed from: o, reason: collision with root package name */
    public final ym5.x1 f213335o;

    /* renamed from: p, reason: collision with root package name */
    public final ym5.y1 f213336p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f213337q;

    /* renamed from: r, reason: collision with root package name */
    public int f213338r;

    /* renamed from: s, reason: collision with root package name */
    public double f213339s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f213340t;

    /* renamed from: u, reason: collision with root package name */
    public int f213341u;

    /* renamed from: v, reason: collision with root package name */
    public double f213342v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMPAGView(android.content.Context context) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213327d = "MMPAGView@" + hashCode();
        this.f213328e = new org.libpag.PAGView(getContext());
        this.f213329f = new com.tencent.mm.rfx.RfxPagView(getContext());
        this.f213331h = new java.util.concurrent.ConcurrentHashMap();
        this.f213332i = new java.util.concurrent.ConcurrentHashMap();
        this.f213333m = new java.util.concurrent.ConcurrentHashMap();
        this.f213334n = new java.util.concurrent.ConcurrentHashMap();
        this.f213335o = new ym5.x1();
        this.f213336p = new ym5.y1();
        e();
    }

    private final void setUseRfx(boolean z17) {
        this.useRfx = z17;
        pm0.v.X(new ym5.g2(this, z17));
    }

    public final void a(ym5.w1 w1Var) {
        java.lang.Object putIfAbsent;
        java.lang.Object putIfAbsent2;
        com.tencent.mars.xlog.Log.i(this.f213327d, "addListener useRfx:" + this.useRfx + ", listener:" + w1Var);
        if (w1Var == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f213331h;
        java.lang.Object obj = concurrentHashMap.get(w1Var);
        if (obj == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(w1Var, (obj = new ym5.z1(w1Var, this)))) != null) {
            obj = putIfAbsent2;
        }
        this.f213328e.addListener((org.libpag.PAGView.PAGViewListener) obj);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f213332i;
        java.lang.Object obj2 = concurrentHashMap2.get(w1Var);
        if (obj2 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(w1Var, (obj2 = new ym5.a2(w1Var, this)))) != null) {
            obj2 = putIfAbsent;
        }
        this.f213329f.addListener((com.tencent.mm.rfx.i) obj2);
    }

    public final void b(ym5.v1 v1Var) {
        java.lang.Object putIfAbsent;
        java.lang.Object putIfAbsent2;
        com.tencent.mars.xlog.Log.i(this.f213327d, "addPAGFlushListener useRfx:" + this.useRfx + ", listener:" + v1Var);
        if (v1Var == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f213333m;
        java.lang.Object obj = concurrentHashMap.get(v1Var);
        if (obj == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(v1Var, (obj = new ym5.b2(v1Var)))) != null) {
            obj = putIfAbsent2;
        }
        this.f213328e.addPAGFlushListener((org.libpag.PAGView.PAGFlushListener) obj);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f213334n;
        java.lang.Object obj2 = concurrentHashMap2.get(v1Var);
        if (obj2 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(v1Var, (obj2 = new ym5.c2(v1Var)))) != null) {
            obj2 = putIfAbsent;
        }
        this.f213329f.addPagFlushListener((com.tencent.mm.rfx.h) obj2);
    }

    public final long c() {
        com.tencent.mars.xlog.Log.i(this.f213327d, "get duration useRfx:" + this.useRfx);
        return this.useRfx ? this.f213329f.duration() : this.f213328e.duration();
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i(this.f213327d, "flush useRfx:" + this.useRfx);
        this.f213329f.flush();
        this.f213328e.flush();
    }

    public final void e() {
        android.view.ViewGroup.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -1);
        org.libpag.PAGView pAGView = this.f213328e;
        addView(pAGView, layoutParams);
        android.view.ViewGroup.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -1);
        com.tencent.mm.rfx.RfxPagView rfxPagView = this.f213329f;
        addView(rfxPagView, layoutParams2);
        pAGView.setVisibility(this.useRfx ? 8 : 0);
        rfxPagView.setVisibility(this.useRfx ? 0 : 8);
        pAGView.setFrameUpdateListener(new ym5.d2(this));
        pAGView.addListener(new ym5.e2(this));
        rfxPagView.addListener(new ym5.f2(this));
        com.tencent.mars.xlog.Log.i(this.f213327d, "init useRfx:" + this.useRfx);
    }

    public boolean f() {
        return this.useRfx ? this.f213329f.isPlaying() : this.f213328e.isPlaying();
    }

    public void g() {
        com.tencent.mars.xlog.Log.i(this.f213327d, "play, useRfx:" + this.useRfx);
        if (this.useRfx) {
            this.f213329f.play();
        } else {
            this.f213328e.play();
        }
    }

    public final android.graphics.Bitmap getBitmap() {
        com.tencent.mars.xlog.Log.i(this.f213327d, "get bitmap useRfx:" + this.useRfx);
        return this.useRfx ? this.f213329f.getBitmap() : this.f213328e.getBitmap();
    }

    public org.libpag.PAGComposition getComposition() {
        com.tencent.mars.xlog.Log.i(this.f213327d, "getComposition useRfx:" + this.useRfx);
        return this.f213328e.getComposition();
    }

    public final android.graphics.Matrix getPagMatrix() {
        if (this.useRfx) {
            android.graphics.Matrix matrix = this.f213329f.matrix();
            kotlin.jvm.internal.o.d(matrix);
            return matrix;
        }
        android.graphics.Matrix matrix2 = this.f213328e.matrix();
        kotlin.jvm.internal.o.d(matrix2);
        return matrix2;
    }

    public final java.lang.String getPath() {
        com.tencent.mars.xlog.Log.i(this.f213327d, "get path useRfx:" + this.useRfx);
        return this.useRfx ? this.f213329f.getPath() : this.f213328e.getPath();
    }

    public final double getProgress() {
        com.tencent.mars.xlog.Log.i(this.f213327d, "get progress useRfx:" + this.useRfx);
        return this.useRfx ? this.f213329f.getProgress() : this.f213328e.getProgress();
    }

    public final com.tencent.mm.rfx.RfxPagFile getRfxComposition() {
        com.tencent.mars.xlog.Log.i(this.f213327d, "getRfxComposition useRfx:" + this.useRfx);
        return this.f213329f.getComposition();
    }

    public final boolean getUseRfx() {
        return this.useRfx;
    }

    public final void h() {
        com.tencent.mars.xlog.Log.i(this.f213327d, "release useRfx:" + this.useRfx);
        this.f213328e.release();
        this.f213329f.release();
    }

    public final void i(ym5.w1 w1Var) {
        com.tencent.mars.xlog.Log.i(this.f213327d, "removeListener useRfx:" + this.useRfx + ", listener:" + w1Var);
        if (w1Var == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f213331h;
        this.f213328e.removeListener((org.libpag.PAGView.PAGViewListener) concurrentHashMap.get(w1Var));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f213332i;
        this.f213329f.removeListener((com.tencent.mm.rfx.i) concurrentHashMap2.get(w1Var));
        concurrentHashMap.remove(w1Var);
        concurrentHashMap2.remove(w1Var);
    }

    public final void j(ym5.v1 v1Var) {
        com.tencent.mars.xlog.Log.i(this.f213327d, "removePAGFlushListener useRfx:" + this.useRfx + ", listener:" + v1Var);
        if (v1Var == null) {
            return;
        }
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f213333m;
        this.f213328e.removePAGFlushListener((org.libpag.PAGView.PAGFlushListener) concurrentHashMap.get(v1Var));
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = this.f213334n;
        this.f213329f.removePagFlushListener((com.tencent.mm.rfx.h) concurrentHashMap2.get(v1Var));
        concurrentHashMap.remove(v1Var);
        concurrentHashMap2.remove(v1Var);
    }

    public void k(android.content.res.AssetManager assetManager, java.lang.String path) {
        kotlin.jvm.internal.o.g(assetManager, "assetManager");
        kotlin.jvm.internal.o.g(path, "path");
        com.tencent.mars.xlog.Log.i(this.f213327d, "setComposition asset useRfx:" + this.useRfx + ", path:" + path);
        ym5.u1.f463546a.a(path);
        if (this.useRfx) {
            this.f213329f.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(assetManager, path));
        } else {
            this.f213328e.setComposition(org.libpag.PAGFile.Load(assetManager, path));
        }
    }

    public final void l(java.lang.String layerName, java.lang.String customText) {
        kotlin.jvm.internal.o.g(layerName, "layerName");
        kotlin.jvm.internal.o.g(customText, "customText");
        com.tencent.mars.xlog.Log.i(this.f213327d, "setCustomText useRfx:" + this.useRfx + ", layerName:" + layerName + ", customText:" + customText);
        if (this.useRfx) {
            com.tencent.mm.rfx.RfxPagFile composition = this.f213329f.getComposition();
            if (composition != null) {
                composition.setTextforAllTextLayersWithName(layerName, customText);
                return;
            }
            return;
        }
        org.libpag.PAGComposition composition2 = this.f213328e.getComposition();
        org.libpag.PAGLayer[] layersByName = composition2 != null ? composition2.getLayersByName(layerName) : null;
        if (layersByName != null) {
            for (org.libpag.PAGLayer pAGLayer : layersByName) {
                if (pAGLayer.layerType() == 3 && (pAGLayer instanceof org.libpag.PAGTextLayer)) {
                    ((org.libpag.PAGTextLayer) pAGLayer).setText(customText);
                }
            }
        }
    }

    public final boolean m(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f213327d, "set path useRfx:" + this.useRfx + ", value:" + str);
        if (str == null || str.length() == 0) {
            return false;
        }
        return this.useRfx ? this.f213329f.setPath(str) : this.f213328e.setPath(str);
    }

    public void n() {
        com.tencent.mars.xlog.Log.i(this.f213327d, "stop useRfx:" + this.useRfx);
        this.f213329f.stop();
        this.f213328e.stop();
    }

    public final void o(boolean z17) {
        java.lang.String str = this.f213327d;
        com.tencent.mars.xlog.Log.i(str, "switch, useRfx:" + z17);
        int i17 = com.tencent.mm.sdk.platformtools.o4.M(com.tencent.mm.sdk.platformtools.x2.e()).getInt("FINDER_LIVE_SWTICH_PAG_MODE", 0);
        if (i17 != 0) {
            setUseRfx(i17 != 1);
            com.tencent.mars.xlog.Log.i(str, hashCode() + " ignore switch setting, mode:" + i17 + ", useRfx:" + this.useRfx);
            return;
        }
        boolean z18 = j62.e.g().i("clicfg_mmpagview_rfx_switch", 0, false, false) == 1;
        if (z18) {
            com.tencent.mars.xlog.Log.i(str, "switch final:" + z17);
            setUseRfx(z17);
            return;
        }
        com.tencent.mars.xlog.Log.i(str, hashCode() + " ignore switch setting, exptOn:" + z18 + ", useRfx:" + this.useRfx);
    }

    public void setComposition(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f213327d, "setComposition useRfx:" + this.useRfx + ", path:" + str);
        if (str == null) {
            return;
        }
        if (this.useRfx) {
            this.f213329f.setComposition(com.tencent.mm.rfx.RfxPagFile.Load(str));
        } else {
            this.f213328e.setComposition(org.libpag.PAGFile.Load(str));
        }
    }

    public final void setPagMatrix(android.graphics.Matrix value) {
        kotlin.jvm.internal.o.g(value, "value");
        this.f213328e.setMatrix(value);
        this.f213329f.setMatrix(value);
    }

    public final void setPath(java.lang.String str) {
        com.tencent.mars.xlog.Log.i(this.f213327d, "set path useRfx:" + this.useRfx + ", value:" + str);
        if (this.useRfx) {
            this.f213329f.setPath(str);
        } else {
            this.f213328e.setPath(str);
        }
    }

    public final void setProgress(double d17) {
        com.tencent.mars.xlog.Log.i(this.f213327d, "set progress useRfx:" + this.useRfx + ", value:" + d17);
        this.f213328e.setProgress(d17);
        this.f213329f.setProgress(d17);
    }

    public final void setRepeatCount(int i17) {
        com.tencent.mars.xlog.Log.i(this.f213327d, "setRepeatCount useRfx:" + this.useRfx + ", count:" + i17);
        this.f213328e.setRepeatCount(i17);
        this.f213329f.setRepeatCount(i17);
    }

    public final void setScaleMode(int i17) {
        com.tencent.mars.xlog.Log.i(this.f213327d, "setScaleMode useRfx:" + this.useRfx + ", mode:" + i17);
        this.f213328e.setScaleMode(i17);
        this.f213329f.setScaleMode(i17);
    }

    public void setComposition(org.libpag.PAGFile pAGFile) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setComposition pagFile match?");
        sb6.append(!this.useRfx);
        sb6.append(", useRfx:");
        sb6.append(this.useRfx);
        sb6.append(", path:");
        sb6.append(pAGFile != null ? pAGFile.path() : null);
        sb6.append(", pagFile:");
        sb6.append(pAGFile);
        com.tencent.mars.xlog.Log.i(this.f213327d, sb6.toString());
        ym5.u1.f463546a.a(pAGFile != null ? pAGFile.path() : null);
        if (this.useRfx) {
            setComposition(pAGFile != null ? pAGFile.path() : null);
        } else {
            this.f213328e.setComposition(pAGFile);
        }
    }

    public void setComposition(com.tencent.mm.rfx.RfxPagFile rfxPagFile) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setComposition rfxPagFile match?");
        sb6.append(this.useRfx);
        sb6.append(" useRfx:");
        sb6.append(this.useRfx);
        sb6.append(", path:");
        sb6.append(rfxPagFile != null ? rfxPagFile.path() : null);
        sb6.append(" rfxPagFile:");
        sb6.append(rfxPagFile);
        com.tencent.mars.xlog.Log.i(this.f213327d, sb6.toString());
        ym5.u1.f463546a.a(rfxPagFile != null ? rfxPagFile.path() : null);
        if (this.useRfx) {
            this.f213329f.setComposition(rfxPagFile);
        } else {
            setComposition(rfxPagFile != null ? rfxPagFile.path() : null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMPAGView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213327d = "MMPAGView@" + hashCode();
        this.f213328e = new org.libpag.PAGView(getContext());
        this.f213329f = new com.tencent.mm.rfx.RfxPagView(getContext());
        this.f213331h = new java.util.concurrent.ConcurrentHashMap();
        this.f213332i = new java.util.concurrent.ConcurrentHashMap();
        this.f213333m = new java.util.concurrent.ConcurrentHashMap();
        this.f213334n = new java.util.concurrent.ConcurrentHashMap();
        this.f213335o = new ym5.x1();
        this.f213336p = new ym5.y1();
        e();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MMPAGView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f213327d = "MMPAGView@" + hashCode();
        this.f213328e = new org.libpag.PAGView(getContext());
        this.f213329f = new com.tencent.mm.rfx.RfxPagView(getContext());
        this.f213331h = new java.util.concurrent.ConcurrentHashMap();
        this.f213332i = new java.util.concurrent.ConcurrentHashMap();
        this.f213333m = new java.util.concurrent.ConcurrentHashMap();
        this.f213334n = new java.util.concurrent.ConcurrentHashMap();
        this.f213335o = new ym5.x1();
        this.f213336p = new ym5.y1();
        e();
    }
}
