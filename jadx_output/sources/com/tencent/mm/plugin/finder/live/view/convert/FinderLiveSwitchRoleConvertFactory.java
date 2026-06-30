package com.tencent.mm.plugin.finder.live.view.convert;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B/\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e¢\u0006\u0004\b\u0015\u0010\u0016J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR(\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/view/convert/FinderLiveSwitchRoleConvertFactory;", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "Lkotlin/Function1;", "Ljz5/f0;", "onSwitchRole", "Lyz5/l;", "getOnSwitchRole", "()Lyz5/l;", "setOnSwitchRole", "(Lyz5/l;)V", "Lkotlin/Function0;", "onAddRole", "Lyz5/a;", "getOnAddRole", "()Lyz5/a;", "setOnAddRole", "(Lyz5/a;)V", "<init>", "(Lyz5/l;Lyz5/a;)V", "Companion", "cm2/j", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class FinderLiveSwitchRoleConvertFactory implements in5.s {
    public static final int ADD_ROLE = 2;
    public static final cm2.j Companion = new cm2.j(null);
    public static final int SWITCH_ROLE = 1;
    private yz5.a onAddRole;
    private yz5.l onSwitchRole;

    /* JADX WARN: Multi-variable type inference failed */
    public FinderLiveSwitchRoleConvertFactory() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        return type != 1 ? type != 2 ? new com.tencent.mm.plugin.finder.convert.z2() : new cm2.c(this.onAddRole) : new cm2.h(this.onSwitchRole);
    }

    public final yz5.a getOnAddRole() {
        return this.onAddRole;
    }

    public final yz5.l getOnSwitchRole() {
        return this.onSwitchRole;
    }

    public final void setOnAddRole(yz5.a aVar) {
        kotlin.jvm.internal.o.g(aVar, "<set-?>");
        this.onAddRole = aVar;
    }

    public final void setOnSwitchRole(yz5.l lVar) {
        this.onSwitchRole = lVar;
    }

    public FinderLiveSwitchRoleConvertFactory(yz5.l lVar, yz5.a onAddRole) {
        kotlin.jvm.internal.o.g(onAddRole, "onAddRole");
        this.onSwitchRole = lVar;
        this.onAddRole = onAddRole;
    }

    public /* synthetic */ FinderLiveSwitchRoleConvertFactory(yz5.l lVar, yz5.a aVar, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : lVar, (i17 & 2) != 0 ? cm2.i.f43353d : aVar);
    }
}
