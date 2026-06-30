package com.tencent.mm.plugin.finder.view;

/* loaded from: classes10.dex */
public final class m7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderCommentFooter f132632d;

    public m7(com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter) {
        this.f132632d = finderCommentFooter;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderCommentFooter finderCommentFooter = this.f132632d;
        if (finderCommentFooter.getSwitchSceneTip().getHeight() > 0) {
            finderCommentFooter.setSwitchSceneTipHeight(finderCommentFooter.getSwitchSceneTip().getHeight());
        }
        finderCommentFooter.f();
    }
}
