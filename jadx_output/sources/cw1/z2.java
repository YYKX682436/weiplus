package cw1;

/* loaded from: classes12.dex */
public class z2 extends com.tencent.mm.ui.widget.dialog.n2 {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI f223533e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z2(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI, java.lang.String[] strArr, int i17) {
        super(strArr, i17);
        this.f223533e = cleanChattingBaseUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p2
    public boolean d(int i17) {
        com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingBaseUI cleanChattingBaseUI = this.f223533e;
        cleanChattingBaseUI.C = true;
        cleanChattingBaseUI.f95714v = i17;
        cleanChattingBaseUI.W6(2, i17);
        super.d(i17);
        return true;
    }
}
