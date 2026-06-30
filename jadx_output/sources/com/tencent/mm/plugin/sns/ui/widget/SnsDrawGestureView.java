package com.tencent.mm.plugin.sns.ui.widget;

/* loaded from: classes4.dex */
public class SnsDrawGestureView extends android.widget.ImageView {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f170877d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.w2 f170878e;

    /* renamed from: f, reason: collision with root package name */
    public int f170879f;

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Paint f170880g;

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Paint f170881h;

    /* renamed from: i, reason: collision with root package name */
    public final s34.k0 f170882i;

    public SnsDrawGestureView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, -1);
    }

    public void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearGesture", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        ((java.util.ArrayList) this.f170877d).clear();
        postInvalidate();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearGesture", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    public final java.util.List b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("copyPath", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f170877d).iterator();
        while (it.hasNext()) {
            android.graphics.PointF pointF = (android.graphics.PointF) it.next();
            arrayList.add(new android.graphics.PointF(pointF.x, pointF.y));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("copyPath", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        return arrayList;
    }

    public com.tencent.mm.plugin.sns.ui.widget.w2 getOnGestureListener() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        com.tencent.mm.plugin.sns.ui.widget.w2 w2Var = this.f170878e;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        return w2Var;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(android.graphics.Canvas canvas) {
        java.util.List<android.graphics.PointF> list;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        super.onDraw(canvas);
        s34.k0 k0Var = this.f170882i;
        if (k0Var != null && !a84.b0.b(k0Var.f402688a) && bm5.o1.f22719a.h(new com.tencent.mm.repairer.config.ad.RepairerConfigAdGestureShowSamplePoints()) == 1) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("debugDrawSamplePoints", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
            android.graphics.Paint paint = new android.graphics.Paint();
            paint.setColor(-16711936);
            paint.setStyle(android.graphics.Paint.Style.FILL);
            android.graphics.Paint paint2 = new android.graphics.Paint();
            paint2.setColor(-16711936);
            paint2.setStyle(android.graphics.Paint.Style.STROKE);
            if (k0Var != null && (list = k0Var.f402688a) != null) {
                for (android.graphics.PointF pointF : list) {
                    canvas.drawCircle(pointF.x, pointF.y, 10.0f, paint);
                    canvas.drawCircle(pointF.x, pointF.y, k0Var.f402689b, paint2);
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("debugDrawSamplePoints", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        }
        java.util.List list2 = this.f170877d;
        if (((java.util.ArrayList) list2).size() > 0) {
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(((android.graphics.PointF) ((java.util.ArrayList) list2).get(0)).x, ((android.graphics.PointF) ((java.util.ArrayList) list2).get(0)).y);
            android.graphics.Paint paint3 = this.f170881h;
            canvas.drawCircle(((android.graphics.PointF) ((java.util.ArrayList) list2).get(0)).x, ((android.graphics.PointF) ((java.util.ArrayList) list2).get(0)).y, i65.a.b(getContext(), 8) / 2.0f, paint3);
            for (int i17 = 1; i17 < ((java.util.ArrayList) list2).size(); i17++) {
                path.lineTo(((android.graphics.PointF) ((java.util.ArrayList) list2).get(i17)).x, ((android.graphics.PointF) ((java.util.ArrayList) list2).get(i17)).y);
            }
            canvas.drawPath(path, this.f170880g);
            canvas.drawCircle(((android.graphics.PointF) ((java.util.ArrayList) list2).get(((java.util.ArrayList) list2).size() - 1)).x, ((android.graphics.PointF) ((java.util.ArrayList) list2).get(((java.util.ArrayList) list2).size() - 1)).y, i65.a.b(getContext(), 8) / 2.0f, paint3);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDraw", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        getParent().requestDisallowInterceptTouchEvent(true);
        int actionMasked = motionEvent.getActionMasked();
        java.util.List list = this.f170877d;
        if (actionMasked == 0) {
            com.tencent.mm.plugin.sns.ui.widget.w2 w2Var = this.f170878e;
            if (w2Var != null) {
                w2Var.c();
            }
            ((java.util.ArrayList) list).clear();
            ((java.util.ArrayList) list).add(new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
        } else if (motionEvent.getActionMasked() == 2) {
            ((java.util.ArrayList) list).add(new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
            postInvalidate();
        } else if (motionEvent.getActionMasked() == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SnsDrawGestureViewView", "point count %d", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
            if (((java.util.ArrayList) list).size() < 6) {
                ((java.util.ArrayList) list).clear();
                com.tencent.mm.plugin.sns.ui.widget.w2 w2Var2 = this.f170878e;
                if (w2Var2 != null) {
                    w2Var2.a();
                }
            } else {
                com.tencent.mm.plugin.sns.ui.widget.w2 w2Var3 = this.f170878e;
                if (w2Var3 != null) {
                    w2Var3.b(b());
                }
            }
            getParent().requestDisallowInterceptTouchEvent(false);
        } else {
            com.tencent.mm.plugin.sns.ui.widget.w2 w2Var4 = this.f170878e;
            if (w2Var4 != null) {
                w2Var4.b(b());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        return true;
    }

    public void setOnGestureListener(com.tencent.mm.plugin.sns.ui.widget.w2 w2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        this.f170878e = w2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnGestureListener", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    public void setPaintColor(int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        this.f170879f = i17;
        this.f170880g.setColor(i17);
        this.f170881h.setColor(this.f170879f);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPaintColor", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }

    public SnsDrawGestureView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f170877d = new java.util.ArrayList();
        this.f170879f = -1;
        android.graphics.Paint paint = new android.graphics.Paint();
        this.f170880g = paint;
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.f170881h = paint2;
        this.f170882i = new s34.k0();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
        paint.setColor(this.f170879f);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(i65.a.b(getContext(), 8));
        paint.setPathEffect(new android.graphics.CornerPathEffect(i65.a.b(getContext(), 4)));
        paint.setAntiAlias(true);
        paint2.setColor(this.f170879f);
        paint2.setStyle(android.graphics.Paint.Style.FILL);
        paint2.setAntiAlias(true);
        if (fp.h.a(21)) {
            setLayerType(1, null);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initView", "com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView");
    }
}
