package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes3.dex */
public class e2 implements android.view.ViewStub.OnInflateListener {
    public e2(com.tencent.mm.plugin.location.ui.impl.y1 y1Var) {
    }

    @Override // android.view.ViewStub.OnInflateListener
    public void onInflate(android.view.ViewStub viewStub, android.view.View view) {
        view.findViewById(com.tencent.mm.R.id.in_).setOnTouchListener(new com.tencent.mm.plugin.location.ui.impl.d2(this));
    }
}
