package ef4;

/* loaded from: classes4.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final ef4.h f252444d = new ef4.h();

    @Override // java.lang.Runnable
    public final void run() {
        if (ef4.i.f252448c) {
            return;
        }
        ef4.i.f252448c = true;
        if (ef4.i.f252447b != 0) {
            ef4.i.f252447b = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List<java.lang.ref.WeakReference> list = ef4.i.f252446a;
        kotlin.jvm.internal.o.f(list, "access$getMListeners$p(...)");
        synchronized (list) {
            for (java.lang.ref.WeakReference weakReference : list) {
                if (((ze4.e) weakReference.get()) == null) {
                    arrayList.add(weakReference);
                } else {
                    ze4.e eVar = (ze4.e) weakReference.get();
                    if (eVar != null) {
                        int i17 = ef4.i.f252447b;
                        com.tencent.mm.ui.contact.CategoryTipView categoryTipView = (com.tencent.mm.ui.contact.CategoryTipView) eVar;
                        if (categoryTipView.getVisibility() == 0 && categoryTipView.c() && categoryTipView.f206335e != i17) {
                            categoryTipView.post(new com.tencent.mm.ui.contact.n0(categoryTipView, i17));
                        }
                    }
                }
            }
        }
        ef4.i.f252446a.removeAll(arrayList);
        ef4.i.f252448c = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.FavourUserChecker", "checkStoryStatus:%s nowState:%s", java.lang.Integer.valueOf(ef4.i.f252447b), 0);
    }
}
