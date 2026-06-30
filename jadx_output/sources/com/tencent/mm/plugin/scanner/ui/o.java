package com.tencent.mm.plugin.scanner.ui;

/* loaded from: classes4.dex */
public class o implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.ui.HighlightRectSideView f159598d;

    public o(com.tencent.mm.plugin.scanner.ui.HighlightRectSideView highlightRectSideView) {
        this.f159598d = highlightRectSideView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.scanner.ui.HighlightRectSideView highlightRectSideView = this.f159598d;
        highlightRectSideView.f159296m++;
        highlightRectSideView.invalidate();
        return true;
    }
}
