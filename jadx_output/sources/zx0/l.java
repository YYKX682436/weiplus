package zx0;

/* loaded from: classes5.dex */
public final class l implements com.tencent.maas.camstudio.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f477025a;

    /* renamed from: b, reason: collision with root package name */
    public final float f477026b;

    /* renamed from: c, reason: collision with root package name */
    public float f477027c;

    public l(java.lang.ref.WeakReference weakReference) {
        kotlin.jvm.internal.o.g(weakReference, "weakReference");
        this.f477025a = weakReference;
        this.f477026b = 0.1f;
        this.f477027c = 1.0f;
    }

    public void a(com.tencent.maas.camstudio.gesture.MJGestureEvent mJGestureEvent) {
        yx0.b8 b8Var;
        if (mJGestureEvent == null || (b8Var = (yx0.b8) this.f477025a.get()) == null) {
            return;
        }
        if (!b8Var.Z()) {
            mx0.e1 e1Var = b8Var.X1;
            if (!(e1Var != null && kz5.z.D0(new mx0.d0[]{mx0.d0.f331902p, mx0.d0.f331903q}).contains(e1Var.f331935b))) {
                com.tencent.maas.camstudio.p pVar = mJGestureEvent.f47942a;
                int i17 = pVar == null ? -1 : zx0.k.f477024b[pVar.ordinal()];
                if (i17 != 1) {
                    if (i17 != 2) {
                        return;
                    }
                    com.tencent.maas.camstudio.gesture.MJTapGestureEvent mJTapGestureEvent = (com.tencent.maas.camstudio.gesture.MJTapGestureEvent) mJGestureEvent;
                    java.util.Objects.toString(mJTapGestureEvent.f47950c);
                    java.util.Objects.toString(mJTapGestureEvent.f47943b);
                    if (mJTapGestureEvent.f47943b == com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase.Ended) {
                        mx0.z zVar = b8Var.f467177d;
                        com.tencent.maas.base.Vec2 vec2 = mJTapGestureEvent.f47950c;
                        kotlin.jvm.internal.o.f(vec2, "getPosition(...)");
                        ((com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar).x0(vec2);
                        return;
                    }
                    return;
                }
                com.tencent.maas.camstudio.gesture.MJPinchGestureEvent mJPinchGestureEvent = (com.tencent.maas.camstudio.gesture.MJPinchGestureEvent) mJGestureEvent;
                java.util.Objects.toString(mJPinchGestureEvent.f47943b);
                com.tencent.maas.camstudio.gesture.MJGestureEvent.MJGesturePhase mJGesturePhase = mJPinchGestureEvent.f47943b;
                int i18 = mJGesturePhase != null ? zx0.k.f477023a[mJGesturePhase.ordinal()] : -1;
                if (i18 == 1) {
                    this.f477027c = mJPinchGestureEvent.f47949c;
                    return;
                }
                if (i18 == 2 && java.lang.Math.abs(mJPinchGestureEvent.f47949c - this.f477027c) >= this.f477026b) {
                    mx0.z zVar2 = b8Var.f467177d;
                    boolean z17 = mJPinchGestureEvent.f47949c > this.f477027c;
                    com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout = (com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout) zVar2;
                    bs0.j jVar = shootComposingPluginLayout.f69552q;
                    if (jVar != null) {
                        jVar.getHorizontalViewAngle();
                    }
                    if (z17) {
                        bs0.j jVar2 = shootComposingPluginLayout.f69552q;
                        if (jVar2 != null) {
                            jVar2.a();
                        }
                    } else {
                        bs0.j jVar3 = shootComposingPluginLayout.f69552q;
                        if (jVar3 != null) {
                            jVar3.b();
                        }
                    }
                    this.f477027c = mJPinchGestureEvent.f47949c;
                    return;
                }
                return;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ShootComposingCorePlugin-GestureEventCallback", "Ignore gesture event when being isImportPreviewState");
    }
}
