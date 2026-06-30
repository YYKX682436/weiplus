package db5;

/* loaded from: classes3.dex */
public abstract class h extends androidx.viewpager.widget.a {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f228355d;

    /* renamed from: f, reason: collision with root package name */
    public int f228357f = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Queue f228356e = new java.util.LinkedList();

    public h(android.content.Context context) {
        this.f228355d = context;
    }

    public abstract int a();

    public abstract android.view.View b(android.view.View view, android.view.ViewGroup viewGroup, int i17);

    public abstract void c(android.view.View view, int i17);

    @Override // androidx.viewpager.widget.a
    public void destroyItem(android.view.ViewGroup viewGroup, int i17, java.lang.Object obj) {
        android.view.View view = (android.view.View) obj;
        viewGroup.removeView(view);
        java.util.Queue queue = this.f228356e;
        ((java.util.LinkedList) queue).add(view);
        c(view, i17);
        ((java.util.LinkedList) queue).size();
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object obj) {
        int i17 = this.f228357f;
        if (i17 <= 0) {
            return super.getItemPosition(obj);
        }
        this.f228357f = i17 - 1;
        return -2;
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.Object instantiateItem(android.view.ViewGroup viewGroup, int i17) {
        java.lang.System.currentTimeMillis();
        android.view.View b17 = b((android.view.View) ((java.util.LinkedList) this.f228356e).poll(), viewGroup, i17);
        if (b17.getLayoutParams() == null) {
            b17.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -1));
        }
        viewGroup.addView(b17);
        java.lang.System.currentTimeMillis();
        return b17;
    }

    @Override // androidx.viewpager.widget.a
    public boolean isViewFromObject(android.view.View view, java.lang.Object obj) {
        return view.equals(obj);
    }

    @Override // androidx.viewpager.widget.a
    public void notifyDataSetChanged() {
        this.f228357f = a();
        super.notifyDataSetChanged();
    }
}
