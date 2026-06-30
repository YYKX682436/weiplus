package cw1;

/* loaded from: classes12.dex */
public class u4 extends androidx.recyclerview.widget.t0 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI f223354c;

    public u4(com.tencent.mm.plugin.clean.ui.fileindexui.CleanChattingDetailUI cleanChattingDetailUI) {
        this.f223354c = cleanChattingDetailUI;
    }

    @Override // androidx.recyclerview.widget.t0
    public int c(int i17) {
        return this.f223354c.W.getItemViewType(i17) == 1 ? 4 : 1;
    }
}
