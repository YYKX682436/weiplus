package db5;

/* loaded from: classes4.dex */
public abstract class p8 extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Queue f228469d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f228470e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final android.util.SparseArray f228471f = new android.util.SparseArray();

    public boolean a() {
        return true;
    }

    public int b() {
        return -1;
    }

    public abstract com.tencent.mm.ui.base.MultiTouchImageView c(int i17, boolean z17);

    public abstract java.lang.Object d(int i17, android.view.View view, android.view.ViewGroup viewGroup);

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMViewPagerAdapter", "destroyItem object %s", java.lang.Integer.valueOf(obj.hashCode()));
        ((java.util.LinkedList) this.f228469d).add((android.view.View) obj);
        this.f228470e.remove(obj);
        this.f228471f.remove(i17);
    }

    public android.view.View e(int i17) {
        java.lang.Object obj = this.f228471f.get(i17);
        if (obj != null) {
            return (android.view.View) obj;
        }
        return null;
    }

    public abstract com.tencent.mm.ui.base.WxImageView f(int i17, boolean z17);

    public int g() {
        return -1;
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        java.util.HashMap hashMap = this.f228470e;
        if (hashMap.containsKey(obj)) {
            return ((java.lang.Integer) hashMap.get(obj)).intValue();
        }
        return -2;
    }

    public void h() {
        ((java.util.LinkedList) this.f228469d).clear();
        this.f228470e.clear();
        this.f228471f.clear();
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Queue queue = this.f228469d;
        java.lang.Object d17 = d(i17, ((java.util.LinkedList) queue).size() > 0 ? (android.view.View) ((java.util.LinkedList) queue).poll() : null, viewGroup);
        android.view.View view = (android.view.View) d17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMViewPagerAdapter", "instantiateItem object %s, parent %s, position: %s.", java.lang.Integer.valueOf(d17.hashCode()), view.getParent(), java.lang.Integer.valueOf(i17));
        this.f228470e.put(d17, java.lang.Integer.valueOf(i17));
        this.f228471f.put(i17, d17);
        if (view.getParent() == null) {
            viewGroup.addView(view);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMViewPagerAdapter", "instantiateItem spent : %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
        return d17;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view == obj;
    }
}
