package db5;

/* loaded from: classes4.dex */
public class x5 implements db5.c6 {
    @Override // db5.c6
    public boolean a() {
        return ((java.util.HashSet) db5.c6.f228307a).size() > 0;
    }

    @Override // db5.c6
    public void b() {
        java.util.Set set = db5.c6.f228307a;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.base.MMSlideDelView mMSlideDelView = (com.tencent.mm.ui.base.MMSlideDelView) it.next();
            if (mMSlideDelView != null) {
                mMSlideDelView.c();
            }
        }
        ((java.util.HashSet) set).clear();
    }

    @Override // db5.c6
    public void c() {
        java.util.Set set = db5.c6.f228307a;
        java.util.Iterator it = ((java.util.HashSet) set).iterator();
        while (it.hasNext()) {
            com.tencent.mm.ui.base.MMSlideDelView mMSlideDelView = (com.tencent.mm.ui.base.MMSlideDelView) it.next();
            if (mMSlideDelView != null) {
                mMSlideDelView.d();
            }
        }
        ((java.util.HashSet) set).clear();
    }

    @Override // db5.c6
    public void d(com.tencent.mm.ui.base.MMSlideDelView mMSlideDelView, boolean z17) {
        java.util.Set set = db5.c6.f228307a;
        if (z17) {
            ((java.util.HashSet) set).add(mMSlideDelView);
        } else {
            ((java.util.HashSet) set).remove(mMSlideDelView);
        }
    }
}
