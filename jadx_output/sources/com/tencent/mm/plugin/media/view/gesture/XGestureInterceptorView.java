package com.tencent.mm.plugin.media.view.gesture;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000e"}, d2 = {"Lcom/tencent/mm/plugin/media/view/gesture/XGestureInterceptorView;", "Landroid/widget/FrameLayout;", "Lmg3/m;", "coordinator", "Ljz5/f0;", "setupCoordinator", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-gallery_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class XGestureInterceptorView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public mg3.b f148596d;

    /* renamed from: e, reason: collision with root package name */
    public mg3.e f148597e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f148598f;

    /* renamed from: g, reason: collision with root package name */
    public mg3.m f148599g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public XGestureInterceptorView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void a() {
        mg3.m mVar = new mg3.m();
        this.f148599g = mVar;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        mVar.a(new ng3.n(context));
        mg3.m mVar2 = this.f148599g;
        android.content.Context context2 = getContext();
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        mVar2.a(new ng3.k(context2));
        mg3.m mVar3 = this.f148599g;
        android.content.Context context3 = getContext();
        kotlin.jvm.internal.o.f(context3, "getContext(...)");
        mVar3.a(new ng3.r(context3));
        this.f148599g.a(new ng3.b());
        mg3.m mVar4 = this.f148599g;
        mg3.b bVar = this.f148596d;
        mg3.e eVar = this.f148597e;
        mVar4.f326249c = bVar;
        mVar4.f326250d = eVar;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        mg3.e eVar;
        mg3.e eVar2;
        kotlin.jvm.internal.o.g(event, "event");
        mg3.p.a(event);
        event.getPointerCount();
        mg3.e eVar3 = this.f148597e;
        if ((eVar3 != null && eVar3.f(event)) && event.getAction() == 0) {
            mg3.p.a(event);
            this.f148598f = true;
        }
        if (this.f148598f && event.getAction() == 1) {
            mg3.p.a(event);
            mg3.e eVar4 = this.f148597e;
            if (eVar4 != null) {
                eVar4.g(event);
            }
            this.f148598f = false;
            return true;
        }
        if (this.f148598f) {
            mg3.p.a(event);
            mg3.e eVar5 = this.f148597e;
            if (eVar5 != null) {
                eVar5.g(event);
            }
            return true;
        }
        mg3.m mVar = this.f148599g;
        mVar.getClass();
        mg3.p.a(event);
        event.getPointerCount();
        mg3.b bVar = mVar.f326249c;
        if (bVar == null || (eVar = mVar.f326250d) == null) {
            return false;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.Iterator it = ((java.util.ArrayList) mVar.f326247a).iterator();
        while (it.hasNext()) {
            ng3.e eVar6 = (ng3.e) it.next();
            eVar6.b(event);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.addAll(eVar6.f337005b);
            mg3.p.b(arrayList);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                ng3.h hVar = (ng3.h) it6.next();
                if (hashMap.containsKey(hVar.a())) {
                    java.util.Objects.toString(hVar.a());
                } else {
                    hashMap.put(hVar.a(), hVar);
                }
            }
        }
        java.util.Objects.toString(mVar.f326248b);
        mg3.p.b(kz5.n0.S0(hashMap.values()));
        mg3.a aVar = new mg3.a(hashMap, bVar, eVar);
        mg3.b bVar2 = mVar.f326249c;
        if (bVar2 != null && (eVar2 = mVar.f326250d) != null) {
            ng3.t tVar = ng3.t.f337048s;
            java.util.Map map = aVar.f326228a;
            if (map.containsKey(tVar)) {
                mg3.n.a(aVar, tVar);
                if (bVar2.getCurrentScaleRatio() > 1.0f) {
                    mVar.f326248b = ng3.s.f337028d;
                } else {
                    mVar.f326248b = ng3.s.f337030f;
                }
            }
            ng3.t tVar2 = ng3.t.f337046q;
            if (map.containsKey(tVar2)) {
                mg3.n.a(aVar, tVar2);
            }
            int ordinal = mVar.f326248b.ordinal();
            int i17 = mVar.f326251e;
            switch (ordinal) {
                case 0:
                    if (!eVar2.i()) {
                        ng3.t tVar3 = ng3.t.f337036d;
                        if (!map.containsKey(tVar3)) {
                            if (((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) bVar2).N()) {
                                ng3.t tVar4 = ng3.t.f337049t;
                                if (map.containsKey(tVar4)) {
                                    mg3.n.a(aVar, tVar4);
                                    mVar.f326248b = ng3.s.f337034m;
                                    break;
                                }
                            }
                            ng3.t tVar5 = ng3.t.f337042m;
                            if (!map.containsKey(tVar5)) {
                                eVar2.g(event);
                                break;
                            } else {
                                mg3.n.a(aVar, tVar5);
                                mVar.f326248b = ng3.s.f337029e;
                                break;
                            }
                        } else {
                            mg3.n.a(aVar, tVar3);
                            mVar.f326248b = ng3.s.f337031g;
                            break;
                        }
                    } else {
                        eVar2.g(event);
                        break;
                    }
                case 1:
                    if (!((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) bVar2).N() || !map.containsKey(ng3.t.f337049t)) {
                        ng3.t tVar6 = ng3.t.f337045p;
                        if (!map.containsKey(tVar6)) {
                            ng3.t tVar7 = ng3.t.f337041i;
                            if (map.containsKey(tVar7) || map.containsKey(ng3.t.f337043n)) {
                                mg3.n.a(aVar, tVar7, ng3.t.f337043n);
                                mVar.f326248b = ng3.s.f337029e;
                                break;
                            }
                        } else {
                            mg3.n.a(aVar, tVar6, ng3.t.f337044o);
                            mVar.f326248b = ng3.s.f337028d;
                            break;
                        }
                    } else {
                        mg3.n.a(aVar, ng3.t.f337050u);
                        mVar.f326248b = ng3.s.f337034m;
                        break;
                    }
                    break;
                case 2:
                    boolean N = ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) bVar2).N();
                    ng3.t tVar8 = ng3.t.f337036d;
                    if (!map.containsKey(tVar8)) {
                        if (N) {
                            ng3.t tVar9 = ng3.t.f337049t;
                            if (map.containsKey(tVar9)) {
                                mg3.n.a(aVar, tVar9);
                                mVar.f326248b = ng3.s.f337034m;
                                break;
                            }
                        }
                        ng3.t tVar10 = ng3.t.f337041i;
                        if (map.containsKey(tVar10) || map.containsKey(ng3.t.f337043n)) {
                            mg3.n.a(aVar, tVar10, ng3.t.f337043n);
                            mVar.f326248b = ng3.s.f337033i;
                            break;
                        }
                    } else {
                        mg3.n.a(aVar, tVar8);
                        mVar.f326248b = ng3.s.f337031g;
                        break;
                    }
                    break;
                case 3:
                    mg3.n.a(aVar, ng3.t.f337037e);
                    if (!map.containsKey(ng3.t.f337039g)) {
                        ng3.t tVar11 = ng3.t.f337038f;
                        if (map.containsKey(tVar11)) {
                            mg3.n.a(aVar, tVar11);
                            mVar.f326248b = ng3.s.f337032h;
                            break;
                        }
                    } else {
                        float f17 = 100;
                        if (java.lang.Math.abs(((int) (bVar2.getCurrentScaleRatio() * f17)) - ((int) (bVar2.getMinScaleRatio() * f17))) > i17) {
                            mVar.f326248b = ng3.s.f337030f;
                            break;
                        } else {
                            mVar.f326248b = ng3.s.f337028d;
                            break;
                        }
                    }
                    break;
                case 4:
                    float currentScaleRatio = bVar2.getCurrentScaleRatio();
                    float minScaleRatio = bVar2.getMinScaleRatio();
                    float f18 = 100;
                    int i18 = (int) (currentScaleRatio * f18);
                    int i19 = (int) (f18 * minScaleRatio);
                    com.tencent.mars.xlog.Log.i("MediaGallery.XGesture.Coordinator", "[into]SCALE_END curScale:" + currentScaleRatio + '(' + i18 + "%) minScale:" + minScaleRatio + '(' + i19 + "%) threshold:" + i17);
                    if (!map.containsKey(ng3.t.f337039g)) {
                        mVar.f326248b = ng3.s.f337031g;
                        break;
                    } else if (java.lang.Math.abs(i18 - i19) > i17) {
                        mVar.f326248b = ng3.s.f337030f;
                        break;
                    } else {
                        mVar.f326248b = ng3.s.f337028d;
                        break;
                    }
                case 5:
                    boolean N2 = ((com.tencent.mm.plugin.media.view.gesture.PreviewGestureContainer) bVar2).N();
                    if (!map.containsKey(ng3.t.f337036d)) {
                        if (!N2 || !map.containsKey(ng3.t.f337049t)) {
                            ng3.t tVar12 = ng3.t.f337045p;
                            if (!map.containsKey(tVar12)) {
                                ng3.t tVar13 = ng3.t.f337041i;
                                if (map.containsKey(tVar13) || map.containsKey(ng3.t.f337043n)) {
                                    mg3.n.a(aVar, tVar13, ng3.t.f337043n);
                                    mVar.f326248b = ng3.s.f337033i;
                                    break;
                                }
                            } else {
                                mg3.n.a(aVar, tVar12, ng3.t.f337044o);
                                mVar.f326248b = ng3.s.f337030f;
                                break;
                            }
                        } else {
                            mg3.n.a(aVar, ng3.t.f337050u);
                            mVar.f326248b = ng3.s.f337034m;
                            break;
                        }
                    } else {
                        mVar.f326248b = ng3.s.f337031g;
                        break;
                    }
                    break;
                case 6:
                    ng3.t tVar14 = ng3.t.f337050u;
                    if (!map.containsKey(tVar14)) {
                        ng3.t tVar15 = ng3.t.f337051v;
                        if (map.containsKey(tVar15)) {
                            mg3.n.a(aVar, tVar15);
                            float f19 = 100;
                            if (java.lang.Math.abs(((int) (bVar2.getCurrentScaleRatio() * f19)) - ((int) (bVar2.getMinScaleRatio() * f19))) > i17) {
                                mVar.f326248b = ng3.s.f337030f;
                                break;
                            } else {
                                mVar.f326248b = ng3.s.f337028d;
                                break;
                            }
                        }
                    } else {
                        mg3.n.a(aVar, tVar14);
                        break;
                    }
                    break;
            }
        }
        return true;
    }

    public final void setupCoordinator(mg3.m coordinator) {
        kotlin.jvm.internal.o.g(coordinator, "coordinator");
        this.f148599g = coordinator;
        mg3.b bVar = this.f148596d;
        mg3.e eVar = this.f148597e;
        coordinator.f326249c = bVar;
        coordinator.f326250d = eVar;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XGestureInterceptorView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        this.f148599g = new mg3.m();
    }
}
