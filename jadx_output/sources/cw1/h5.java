package cw1;

/* loaded from: classes11.dex */
public final class h5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.vas.VASCommonFragment f222966d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingTabsUI f222967e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(com.tencent.mm.ui.vas.VASCommonFragment vASCommonFragment, com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingTabsUI cleanChattingTabsUI) {
        super(1);
        this.f222966d = vASCommonFragment;
        this.f222967e = cleanChattingTabsUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.ui.vas.VASActivity vASActivity = this.f222966d.f211121p;
        kotlin.jvm.internal.o.e(vASActivity, "null cannot be cast to non-null type com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI");
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = (com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI) vASActivity;
        cleanChattingBaseUI.F = new cw1.g5(cleanChattingBaseUI, this.f222967e);
        return jz5.f0.f302826a;
    }
}
