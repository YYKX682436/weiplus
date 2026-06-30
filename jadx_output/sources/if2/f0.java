package if2;

/* loaded from: classes3.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f291114d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f291115e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f291116f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore, boolean z17, float f17) {
        super(0);
        this.f291114d = liveRoomControllerStore;
        this.f291115e = z17;
        this.f291116f = f17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        if2.l0 l0Var;
        java.util.List<if2.d0> b17;
        for (com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController : this.f291114d.getControllers()) {
            if2.b bVar = liveRoomController instanceof if2.b ? (if2.b) liveRoomController : null;
            if (bVar != null && (l0Var = bVar.f291103i) != null && (b17 = l0Var.b()) != null) {
                for (if2.d0 d0Var : b17) {
                    if (this.f291115e) {
                        if ((d0Var.f291105a.getAlpha() == 1.0f) && d0Var.f291105a.getVisibility() == 0) {
                        }
                    }
                    android.view.View view = d0Var.f291105a;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                    arrayList.add(java.lang.Float.valueOf(this.f291116f));
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/base/VisibleEventExtension$dispatchValueAnimator$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                    view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/base/VisibleEventExtension$dispatchValueAnimator$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
