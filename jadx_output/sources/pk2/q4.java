package pk2;

/* loaded from: classes3.dex */
public final class q4 extends qk2.h {

    /* renamed from: h, reason: collision with root package name */
    public final int f356190h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f356191i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q4(pk2.o9 helper, int i17) {
        super(helper, i17);
        kotlin.jvm.internal.o.g(helper, "helper");
        this.f356190h = helper.J0;
        this.f356191i = "";
    }

    @Override // qk2.h
    public void B(pk2.o9 o9Var) {
        df2.cy cyVar;
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        com.tencent.mars.xlog.Log.i(o9Var.f356072a, "onItemClicked: 触发中度违规mock (BottomSheet)");
        dk2.ef efVar = dk2.ef.f233372a;
        com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
        if (liveRoomControllerStore == null || (cyVar = (df2.cy) liveRoomControllerStore.controller(df2.cy.class)) == null) {
            return;
        }
        cyVar.b7();
    }

    @Override // qk2.f
    public java.lang.String i() {
        return this.f356191i;
    }

    @Override // qk2.f
    public boolean o() {
        return true;
    }

    @Override // qk2.h
    public void v(pk2.o9 o9Var, db5.g4 menu) {
        kotlin.jvm.internal.o.g(o9Var, "<this>");
        kotlin.jvm.internal.o.g(menu, "menu");
        s(menu, this.f356190h, "中度违规-半屏弹窗(内部)", com.tencent.mm.R.raw.icons_outlined_tv);
    }

    @Override // qk2.h
    public int y() {
        return this.f356190h;
    }
}
