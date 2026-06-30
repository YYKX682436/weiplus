package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class tg implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.LoadableTextView f199998d;

    public tg(com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView) {
        this.f199998d = loadableTextView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = this.f199998d;
        int dotCounter = loadableTextView.getDotCounter() % 3;
        loadableTextView.setDotCounter(loadableTextView.getDotCounter() + 1);
        if (dotCounter == 0) {
            loadableTextView.setDotStr("·");
        } else if (dotCounter == 1) {
            loadableTextView.setDotStr("··");
        } else if (dotCounter == 2) {
            loadableTextView.setDotStr("···");
        }
        if (loadableTextView.isLoading) {
            loadableTextView.setText(loadableTextView.f198559n + loadableTextView.dotStr);
        } else {
            loadableTextView.setText(loadableTextView.f198559n);
        }
        return true;
    }
}
