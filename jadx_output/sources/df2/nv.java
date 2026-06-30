package df2;

/* loaded from: classes3.dex */
public final class nv extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f230886m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.Space f230887n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Space f230888o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Space f230889p;

    /* renamed from: q, reason: collision with root package name */
    public int f230890q;

    /* renamed from: r, reason: collision with root package name */
    public int f230891r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.View f230892s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
    }

    public static void Z6(df2.nv nvVar, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            z17 = true;
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        nvVar.getClass();
        pm0.v.X(new df2.mv(nvVar, z18, z17, z19));
    }

    public final boolean a7() {
        java.util.LinkedList linkedList;
        xh2.c cVar = (xh2.c) ((mm2.o4) business(mm2.o4.class)).A.getValue();
        boolean z17 = !(cVar != null && cVar.f454533c == 1);
        xh2.c cVar2 = (xh2.c) ((mm2.o4) business(mm2.o4.class)).A.getValue();
        java.lang.Integer valueOf = cVar2 != null ? java.lang.Integer.valueOf(cVar2.f454533c) : null;
        xh2.c cVar3 = (xh2.c) ((mm2.o4) business(mm2.o4.class)).A.getValue();
        boolean z18 = ((cVar3 == null || (linkedList = cVar3.f454531a) == null) ? 1 : linkedList.size()) > 1;
        boolean O6 = ((mm2.h7) business(mm2.h7.class)).O6();
        if ((!zl2.r4.f473950a.x1() || !z18 || !z17) && !O6) {
            dk2.ef efVar = dk2.ef.f233372a;
            tn0.w0 w0Var = dk2.ef.f233378d;
            if (!(w0Var != null && w0Var.X()) || !z17) {
                tn0.w0 w0Var2 = dk2.ef.f233378d;
                if ((!((w0Var2 == null || w0Var2.X()) ? false : true) || !((mm2.c1) business(mm2.c1.class)).R7()) && (valueOf == null || valueOf.intValue() != 7)) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void b7(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        android.view.ViewGroup.LayoutParams layoutParams2;
        android.view.ViewGroup.LayoutParams layoutParams3;
        xh2.c cVar = (xh2.c) ((mm2.o4) business(mm2.o4.class)).A.getValue();
        java.lang.Integer valueOf = cVar != null ? java.lang.Integer.valueOf(cVar.f454533c) : null;
        android.widget.Space space = this.f230887n;
        if (space != null && (layoutParams3 = space.getLayoutParams()) != null) {
            layoutParams3.height = (valueOf != null && valueOf.intValue() == 7) ? 0 : i17;
        }
        android.widget.Space space2 = this.f230889p;
        if (space2 != null && (layoutParams2 = space2.getLayoutParams()) != null) {
            layoutParams2.height = i17;
        }
        android.widget.Space space3 = this.f230888o;
        if (space3 == null || (layoutParams = space3.getLayoutParams()) == null) {
            return;
        }
        if (valueOf != null && valueOf.intValue() == 7) {
            i17 = 0;
        }
        layoutParams.height = i17;
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveActivate() {
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        android.view.ViewGroup.LayoutParams layoutParams;
        super.onLiveDeactivate();
        android.widget.Space space = this.f230887n;
        if (((space == null || (layoutParams = space.getLayoutParams()) == null) ? 0 : layoutParams.height) > 0) {
            b7(0);
            android.view.View view = this.f230892s;
            if (view != null) {
                view.requestLayout();
            }
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStartFromWindow() {
        b7(this.f230890q);
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f230886m = pluginLayout;
        this.f230887n = (android.widget.Space) pluginLayout.findViewById(com.tencent.mm.R.id.p0d);
        this.f230888o = (android.widget.Space) pluginLayout.findViewById(com.tencent.mm.R.id.qxp);
        this.f230892s = pluginLayout.findViewById(com.tencent.mm.R.id.fh8);
        this.f230889p = (android.widget.Space) pluginLayout.findViewById(com.tencent.mm.R.id.p0c);
        this.f230891r = 0;
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f230886m = null;
        this.f230887n = null;
        this.f230888o = null;
        this.f230892s = null;
        this.f230889p = null;
    }
}
