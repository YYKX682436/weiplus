package com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J\u0010\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006J\b\u0010\t\u001a\u0004\u0018\u00010\u0006¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/sns/ui/item/fullcard/business/breakFrameCard/AdGestureFrameLayout;", "Landroid/widget/FrameLayout;", "Ld94/b;", "iTouchEventProxy", "Ljz5/f0;", "setTouchEventProxy", "Lcom/tencent/mm/plugin/sns/ui/widget/w2;", "onGestureListener", "setOnGestureListener", "getGestureListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-sns_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class AdGestureFrameLayout extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public d94.b f169329d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f169330e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.sns.ui.widget.w2 f169331f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdGestureFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("clearGesture", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        ((java.util.ArrayList) this.f169330e).clear();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("clearGesture", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
    }

    public final java.util.List b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("copyPath", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((java.util.ArrayList) this.f169330e).iterator();
        while (it.hasNext()) {
            android.graphics.PointF pointF = (android.graphics.PointF) it.next();
            arrayList.add(new android.graphics.PointF(pointF.x, pointF.y));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("copyPath", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        return arrayList;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        d94.b bVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        boolean z17 = false;
        if (motionEvent != null && motionEvent.getAction() == 0) {
            z17 = true;
        }
        if (z17 && (bVar = this.f169329d) != null) {
            ((d94.g) bVar).a(motionEvent);
        }
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dispatchTouchEvent", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        return dispatchTouchEvent;
    }

    public final com.tencent.mm.plugin.sns.ui.widget.w2 getGestureListener() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getGestureListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        com.tencent.mm.plugin.sns.ui.widget.w2 w2Var = this.f169331f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getGestureListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        return w2Var;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        getParent().requestDisallowInterceptTouchEvent(true);
        boolean z17 = motionEvent != null && motionEvent.getAction() == 0;
        java.util.List list = this.f169330e;
        if (z17) {
            com.tencent.mm.plugin.sns.ui.widget.w2 w2Var = this.f169331f;
            if (w2Var != null) {
                w2Var.c();
            }
            a();
            ((java.util.ArrayList) list).add(new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
        } else {
            if (motionEvent != null && motionEvent.getAction() == 2) {
                ((java.util.ArrayList) list).add(new android.graphics.PointF(motionEvent.getX(), motionEvent.getY()));
                d94.b bVar = this.f169329d;
                if (bVar != null) {
                    ((d94.g) bVar).a(motionEvent);
                }
            } else {
                if (motionEvent != null && motionEvent.getAction() == 1) {
                    com.tencent.mars.xlog.Log.i("AdGestureFrameLayout", "point count %d", java.lang.Integer.valueOf(((java.util.ArrayList) list).size()));
                    if (((java.util.ArrayList) list).size() < 6) {
                        a();
                        com.tencent.mm.plugin.sns.ui.widget.w2 w2Var2 = this.f169331f;
                        if (w2Var2 != null) {
                            w2Var2.a();
                        }
                    } else {
                        d94.b bVar2 = this.f169329d;
                        if (bVar2 != null) {
                            ((d94.g) bVar2).a(motionEvent);
                        }
                        com.tencent.mm.plugin.sns.ui.widget.w2 w2Var3 = this.f169331f;
                        if (w2Var3 != null) {
                            w2Var3.b(b());
                        }
                    }
                    getParent().requestDisallowInterceptTouchEvent(false);
                } else {
                    com.tencent.mm.plugin.sns.ui.widget.w2 w2Var4 = this.f169331f;
                    if (w2Var4 != null) {
                        w2Var4.b(b());
                    }
                }
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTouchEvent", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        return true;
    }

    public final void setOnGestureListener(com.tencent.mm.plugin.sns.ui.widget.w2 w2Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnGestureListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        this.f169331f = w2Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnGestureListener", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
    }

    public final void setTouchEventProxy(d94.b bVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setTouchEventProxy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
        this.f169329d = bVar;
        com.tencent.mars.xlog.Log.i("AdGestureFrameLayout", "setTouchEventProxy: " + bVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setTouchEventProxy", "com.tencent.mm.plugin.sns.ui.item.fullcard.business.breakFrameCard.AdGestureFrameLayout");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdGestureFrameLayout(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f169330e = new java.util.ArrayList();
    }
}
