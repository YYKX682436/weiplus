package cw1;

/* loaded from: classes12.dex */
public class x2 extends com.tencent.mm.ui.widget.dialog.n2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI f223486e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI, java.lang.String[] strArr, int i17) {
        super(strArr, i17);
        this.f223486e = cleanChattingBaseUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public boolean d(int i17) {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = this.f223486e;
        cleanChattingBaseUI.E = true;
        cleanChattingBaseUI.f95717y = i17;
        cleanChattingBaseUI.W6(0, i17);
        super.d(i17);
        return true;
    }
}
