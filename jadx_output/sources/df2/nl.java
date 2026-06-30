package df2;

/* loaded from: classes3.dex */
public final class nl implements com.tencent.mm.ui.tools.c5 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.pl f230864d;

    public nl(df2.pl plVar) {
        this.f230864d = plVar;
    }

    @Override // com.tencent.mm.ui.tools.c5
    public final void w2(int i17, boolean z17) {
        df2.pl plVar = this.f230864d;
        com.tencent.mars.xlog.Log.i(plVar.f231087m, "onKeyboardHeightChanged, height:" + i17 + ", isResized:" + z17);
        com.tencent.mm.ui.widget.LiveBottomSheetPanel liveBottomSheetPanel = plVar.f231090p;
        if (liveBottomSheetPanel != null) {
            liveBottomSheetPanel.setPadding(0, 0, 0, (i17 < 0 ? 0 : i17) + plVar.O6().getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479688cn));
        }
        plVar.G = i17 > 0;
    }
}
