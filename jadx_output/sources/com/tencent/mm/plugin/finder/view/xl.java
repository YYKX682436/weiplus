package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class xl implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderTagView f133339d;

    public xl(com.tencent.mm.plugin.finder.view.FinderTagView finderTagView) {
        this.f133339d = finderTagView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderTagView finderTagView = this.f133339d;
        if (((java.util.ArrayList) finderTagView.getTagLayout().f131488d).size() <= 1 && finderTagView.getFoldedView().isEmpty()) {
            finderTagView.d(false);
            return;
        }
        if (finderTagView.isFolded) {
            finderTagView.d(true);
            finderTagView.getOpBtn().setRotation(90.0f);
            finderTagView.getOpBtn().setOnClickListener(finderTagView.getExpandListener());
        } else {
            finderTagView.getConfig().getClass();
            finderTagView.getOpBtn().setRotation(-90.0f);
            finderTagView.getOpBtn().setOnClickListener(finderTagView.getFlodListener());
            finderTagView.d(true);
        }
    }
}
