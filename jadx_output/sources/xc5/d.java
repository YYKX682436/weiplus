package xc5;

/* loaded from: classes12.dex */
public final class d extends lf3.n implements xc5.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    public mf3.k V6() {
        try {
            com.tencent.mm.xcompat.viewpager2.widget.ViewPager2 viewPager2 = (com.tencent.mm.xcompat.viewpager2.widget.ViewPager2) getActivity().findViewById(com.tencent.mm.R.id.tzq);
            if (viewPager2 == null) {
                return null;
            }
            int currentItem = viewPager2.getCurrentItem();
            com.tencent.mm.xcompat.recyclerview.widget.u0 adapter = viewPager2.getAdapter();
            mf3.t tVar = adapter instanceof mf3.t ? (mf3.t) adapter : null;
            if (tVar == null) {
                return null;
            }
            return (mf3.k) ((mf3.f) tVar.f326120c).get(currentItem);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.GalleryCurrentMediaProvider", "getCurrentMediaInfo failed: " + e17.getMessage());
            return null;
        }
    }
}
