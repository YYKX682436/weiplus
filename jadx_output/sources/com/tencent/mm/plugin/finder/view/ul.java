package com.tencent.mm.plugin.finder.view;

/* loaded from: classes2.dex */
public final class ul implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.FinderTagView f133205d;

    public ul(com.tencent.mm.plugin.finder.view.FinderTagView finderTagView) {
        this.f133205d = finderTagView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.finder.view.FinderTagView finderTagView = this.f133205d;
        if (finderTagView.isFolded) {
            return;
        }
        int size = ((java.util.ArrayList) finderTagView.getTagLayout().f131488d).size();
        finderTagView.getFoldedView().clear();
        for (int i17 = 1; i17 < size; i17++) {
            java.lang.Object obj = ((java.util.ArrayList) finderTagView.getTagLayout().f131488d).get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            java.util.Iterator it = ((java.lang.Iterable) obj).iterator();
            while (it.hasNext()) {
                finderTagView.getFoldedView().add((android.view.View) it.next());
            }
        }
        java.util.Iterator<T> it6 = finderTagView.getFoldedView().iterator();
        while (it6.hasNext()) {
            finderTagView.getTagLayout().removeView((android.view.View) it6.next());
        }
        finderTagView.setFolded(true);
        finderTagView.b();
        yz5.a onFlodListener = finderTagView.getOnFlodListener();
        if (onFlodListener != null) {
            onFlodListener.invoke();
        }
    }
}
