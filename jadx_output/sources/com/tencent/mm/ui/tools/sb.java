package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class sb implements com.tencent.mm.plugin.gif.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.gif.MMAnimateView f210740a;

    public sb(com.tencent.mm.ui.tools.ub ubVar, com.tencent.mm.plugin.gif.MMAnimateView mMAnimateView) {
        this.f210740a = mMAnimateView;
    }

    @Override // com.tencent.mm.plugin.gif.x
    public void invalidate() {
        this.f210740a.invalidate();
    }

    @Override // com.tencent.mm.plugin.gif.x
    public void onAnimationEnd() {
    }
}
