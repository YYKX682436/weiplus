package com.tencent.mm.plugin.scanner.ui.widget;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u00012\u00020\u0002:\u0003\u001c\u001d\u001eB\u001d\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019B%\b\u0016\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u001bJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016R\"\u0010\u0013\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/tencent/mm/plugin/scanner/ui/widget/ScanProductMaskDecorView;", "Landroid/widget/FrameLayout;", "Ld04/j;", "Ld04/h;", "callBack", "Ljz5/f0;", "setScanProductCallBack", "Ld04/i;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setScanProductOnItemClickListener", "", "getTotalProductCount", "getUploadingTrackId", "m", "I", "getLastId", "()I", "setLastId", "(I)V", "lastId", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "d04/s1", "d04/w1", "d04/x1", "plugin-scan_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class ScanProductMaskDecorView extends android.widget.FrameLayout implements d04.j {

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f159759n = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f159760d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout f159761e;

    /* renamed from: f, reason: collision with root package name */
    public d04.w1 f159762f;

    /* renamed from: g, reason: collision with root package name */
    public float f159763g;

    /* renamed from: h, reason: collision with root package name */
    public d04.h f159764h;

    /* renamed from: i, reason: collision with root package name */
    public int f159765i;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    public int lastId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanProductMaskDecorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.d(context);
        this.lastId = -1;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b7, code lost:
    
        if (r18 == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b9, code lost:
    
        if (r4 == null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bb, code lost:
    
        r7 = r9.f414133d;
        r8 = r9.f414144o;
        r11 = r9.f414141l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c1, code lost:
    
        if (r11 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c7, code lost:
    
        if (r11.isEmpty() != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c9, code lost:
    
        if (r8 != 0) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00cb, code lost:
    
        r8 = 100000;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d8, code lost:
    
        r4.b(r7, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cf, code lost:
    
        if (r8 <= 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d1, code lost:
    
        r8 = 99999;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d5, code lost:
    
        r8 = 99998;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00db, code lost:
    
        r8 = true;
     */
    @Override // d04.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int a(java.util.List r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.scanner.ui.widget.ScanProductMaskDecorView.a(java.util.List, boolean):int");
    }

    @Override // d04.j
    public void b(sz3.c1 c1Var, d04.g addCallback) {
        d04.h hVar;
        java.util.Iterator it;
        sz3.a1 a1Var;
        boolean z17;
        boolean z18;
        kotlin.jvm.internal.o.g(addCallback, "addCallback");
        if (c1Var == null) {
            return;
        }
        java.util.ArrayList arrayList = c1Var.f413981h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        int totalProductCount = getTotalProductCount();
        java.util.Iterator it6 = arrayList.iterator();
        boolean z19 = false;
        sz3.a1 a1Var2 = null;
        while (it6.hasNext()) {
            sz3.a1 a1Var3 = (sz3.a1) it6.next();
            if (a1Var3 != null) {
                if (a1Var3.f413959a.getId() > this.lastId && a1Var3.f413959a.getShouldShow()) {
                    this.lastId = a1Var3.f413959a.getId();
                    a1Var2 = a1Var3;
                }
                android.graphics.Rect rect = new android.graphics.Rect();
                float width = getWidth();
                float height = getHeight();
                rect.set((int) (a1Var3.f413959a.getX1() * width), (int) (a1Var3.f413959a.getY1() * height), (int) (width * a1Var3.f413959a.getX2()), (int) (height * a1Var3.f413959a.getY2()));
                if (a1Var2 != null) {
                    if (z19) {
                        it = it6;
                        a1Var = a1Var2;
                    } else {
                        com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo = new com.tencent.mm.plugin.scanner.model.ScanProductInfo();
                        com.tencent.mm.plugin.scanner.model.ScanProductInfo scanProductInfo2 = a1Var2.f413959a;
                        scanProductInfo.setShouldShow(scanProductInfo2.getShouldShow());
                        scanProductInfo.setProb(scanProductInfo2.getProb());
                        scanProductInfo.setId(scanProductInfo2.getId());
                        scanProductInfo.setAge(scanProductInfo2.getAge());
                        scanProductInfo.setClassId(scanProductInfo2.getClassId());
                        scanProductInfo.setHit(scanProductInfo2.getHit());
                        scanProductInfo.setX1(scanProductInfo2.getX1());
                        scanProductInfo.setY1(scanProductInfo2.getY1());
                        scanProductInfo.setX2(scanProductInfo2.getX2());
                        scanProductInfo.setY2(scanProductInfo2.getY2());
                        sz3.a1 a1Var4 = new sz3.a1(scanProductInfo);
                        a1Var4.f413961c = a1Var2.f413961c;
                        if (this.f159765i == 0) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductMaskDecorView", "addNewProduct:" + a1Var4.f413959a.getId());
                            com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView scanProductDetectRectView = new com.tencent.mm.plugin.scanner.view.ScanProductDetectRectView(getContext());
                            scanProductDetectRectView.setRect(rect);
                            scanProductDetectRectView.setPivotX(rect.exactCenterX());
                            scanProductDetectRectView.setPivotY(rect.exactCenterY());
                            addView(scanProductDetectRectView);
                            float width2 = this.f159763g / rect.width();
                            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.setDuration(1000L);
                            d04.w1 w1Var = this.f159762f;
                            if (w1Var != null) {
                                int id6 = a1Var4.f413959a.getId();
                                synchronized (w1Var.f225540m) {
                                    java.util.HashMap hashMap = w1Var.f225540m;
                                    java.lang.Integer valueOf = java.lang.Integer.valueOf(id6);
                                    it = it6;
                                    sz3.w0 w0Var = new sz3.w0();
                                    a1Var = a1Var2;
                                    w0Var.f414138i = a1Var4.f413959a.getId();
                                    sz3.b1 b1Var = a1Var4.f413961c;
                                    w0Var.f414135f = b1Var != null ? b1Var.a() : null;
                                    sz3.b1 b1Var2 = a1Var4.f413961c;
                                    w0Var.f414136g = b1Var2 != null ? b1Var2.f413968c : -1;
                                    w0Var.f414137h = 1;
                                    hashMap.put(valueOf, w0Var);
                                }
                            } else {
                                it = it6;
                                a1Var = a1Var2;
                            }
                            ofFloat.addListener(new d04.y1(addCallback, this, scanProductDetectRectView, a1Var4));
                            ofFloat.addUpdateListener(new d04.z1(scanProductDetectRectView, width2));
                            ofFloat.start();
                            z18 = true;
                        } else {
                            it = it6;
                            a1Var = a1Var2;
                            com.tencent.mars.xlog.Log.w("MicroMsg.ScanProductMaskDecorView", "addNewProduct fail, scanProductListState:" + this.f159765i);
                            z18 = false;
                        }
                        if (!z18) {
                            z17 = false;
                            z19 = z17;
                        }
                    }
                    z17 = true;
                    z19 = z17;
                } else {
                    it = it6;
                    a1Var = a1Var2;
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductMaskDecorView", "updateProductInfo  info:" + a1Var3 + "   ");
                arrayList2.add(rect);
                a1Var2 = a1Var;
            } else {
                it = it6;
            }
            it6 = it;
        }
        if (!z19 || (hVar = this.f159764h) == null) {
            return;
        }
        hVar.c(c1Var.f413977d, c1Var.f413975b, totalProductCount + 1, a1Var2);
    }

    @Override // d04.j
    public void c(int i17) {
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout scanProductListLayout = this.f159761e;
        if (scanProductListLayout == null) {
            return;
        }
        kotlin.jvm.internal.o.d(scanProductListLayout);
        android.view.ViewGroup.LayoutParams layoutParams = scanProductListLayout.getLayoutParams();
        kotlin.jvm.internal.o.e(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        android.widget.RelativeLayout.LayoutParams layoutParams2 = (android.widget.RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.height = getHeight() / 2;
        layoutParams2.setMargins(0, 0, 0, i17);
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout scanProductListLayout2 = this.f159761e;
        kotlin.jvm.internal.o.d(scanProductListLayout2);
        scanProductListLayout2.setLayoutParams(layoutParams2);
    }

    public final void d() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanProductMaskDecorView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.boy, this);
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout scanProductListLayout = (com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout) inflate.findViewById(com.tencent.mm.R.id.m_u);
        this.f159761e = scanProductListLayout;
        if (scanProductListLayout != null) {
            scanProductListLayout.setProductListCallBack(new d04.a2(this));
        }
        this.f159760d = (androidx.recyclerview.widget.RecyclerView) inflate.findViewById(com.tencent.mm.R.id.f486725m95);
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f159760d;
        kotlin.jvm.internal.o.d(recyclerView);
        d04.w1 w1Var = new d04.w1(context, recyclerView);
        this.f159762f = w1Var;
        androidx.recyclerview.widget.RecyclerView recyclerView2 = this.f159760d;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(w1Var);
        }
        androidx.recyclerview.widget.RecyclerView recyclerView3 = this.f159760d;
        if (recyclerView3 != null) {
            recyclerView3.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext(), 1, false));
        }
        addView(new com.tencent.mm.plugin.scanner.view.MultiRectView(getContext()), new android.widget.FrameLayout.LayoutParams(-1, -1));
        setWillNotDraw(false);
        this.f159763g = i65.a.b(getContext(), 16);
        d04.w1 w1Var2 = this.f159762f;
        if (w1Var2 != null) {
            w1Var2.notifyDataSetChanged();
        }
    }

    public final int getLastId() {
        return this.lastId;
    }

    @Override // d04.j
    /* renamed from: getTotalProductCount */
    public int getF159785y() {
        java.util.ArrayList arrayList;
        d04.w1 w1Var = this.f159762f;
        if (w1Var == null || (arrayList = w1Var.f225539i) == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // d04.j
    public int getUploadingTrackId() {
        return -1;
    }

    @Override // d04.j
    public boolean onBackPressed() {
        com.tencent.mm.plugin.scanner.ui.widget.ScanProductListLayout scanProductListLayout = this.f159761e;
        if (scanProductListLayout == null || !scanProductListLayout.f159750r) {
            return false;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = scanProductListLayout.f159741f;
        if (recyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(recyclerView, arrayList.toArray(), "com/tencent/mm/plugin/scanner/ui/widget/ScanProductListLayout", "onBackPressed", "()Z", "Undefined", "scrollToPosition", "(I)V");
            recyclerView.a1(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(recyclerView, "com/tencent/mm/plugin/scanner/ui/widget/ScanProductListLayout", "onBackPressed", "()Z", "Undefined", "scrollToPosition", "(I)V");
        }
        scanProductListLayout.i();
        scanProductListLayout.f159750r = false;
        return true;
    }

    @Override // d04.j
    public void onDestroy() {
        for (java.util.Map.Entry entry : f159759n.entrySet()) {
            if (!((android.graphics.Bitmap) entry.getValue()).isRecycled()) {
                ((android.graphics.Bitmap) entry.getValue()).recycle();
            }
        }
    }

    public final void setLastId(int i17) {
        this.lastId = i17;
    }

    @Override // d04.j
    public void setScanProductCallBack(d04.h callBack) {
        kotlin.jvm.internal.o.g(callBack, "callBack");
        this.f159764h = callBack;
    }

    @Override // d04.j
    public void setScanProductOnItemClickListener(d04.i listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        d04.w1 w1Var = this.f159762f;
        if (w1Var != null) {
            w1Var.f225541n = listener;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScanProductMaskDecorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.d(context);
        this.lastId = -1;
        d();
    }
}
