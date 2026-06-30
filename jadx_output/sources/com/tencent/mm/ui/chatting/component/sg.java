package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class sg implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.LoadableTextView f199939d;

    public sg(com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView) {
        this.f199939d = loadableTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.chatting.component.LoadableTextView loadableTextView = this.f199939d;
        if (loadableTextView.getF130846i() != null) {
            java.lang.CharSequence f130846i = loadableTextView.getF130846i();
            kotlin.jvm.internal.o.f(f130846i, "getText(...)");
            if (!(f130846i.length() == 0)) {
                int lineCount = (loadableTextView.getLineCount() * loadableTextView.getLineHeight()) - ((loadableTextView.getHeight() - loadableTextView.getPaddingTop()) - loadableTextView.getPaddingBottom());
                if (lineCount > 0) {
                    loadableTextView.scrollBy(0, lineCount - loadableTextView.getScrollY());
                    return;
                } else {
                    loadableTextView.scrollTo(loadableTextView.getScrollX(), 0);
                    return;
                }
            }
        }
        loadableTextView.scrollTo(0, 0);
    }
}
