package fn4;

/* loaded from: classes15.dex */
public abstract class e extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final x.o f264489d = new x.o();

    /* renamed from: e, reason: collision with root package name */
    public final x.o f264490e = new x.o();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f264491f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final fn4.b f264492g;

    public e(fn4.b bVar) {
        this.f264492g = bVar;
    }

    public abstract int B(int i17);

    public fn4.m E(r45.xn6 xn6Var) {
        r45.xn6 xn6Var2;
        if (xn6Var == null) {
            return null;
        }
        java.util.Map map = this.f264491f;
        if (!((java.util.HashMap) map).containsKey(xn6Var.f390259h)) {
            return null;
        }
        if (((java.util.HashMap) map).get(xn6Var.f390259h) == null) {
            return null;
        }
        fn4.m mVar = (fn4.m) ((java.lang.ref.WeakReference) ((java.util.HashMap) map).get(xn6Var.f390259h)).get();
        if (mVar != null && (xn6Var2 = mVar.f264584e) != null && xn6Var2 == xn6Var) {
            return mVar;
        }
        ((java.util.HashMap) map).remove(xn6Var.f390259h);
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoAdapter", "getViewHolderByVideoInfo not match");
        return null;
    }

    public boolean I(int i17) {
        return i17 >= z() + this.f264492g.s4().e();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f264492g.s4().e() + z() + y();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        if (i17 < z()) {
            return this.f264489d.f(i17);
        }
        if (I(i17)) {
            return this.f264490e.f((i17 - z()) - this.f264492g.s4().e());
        }
        return B(i17);
    }

    public void x(java.util.List list, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TopStory.TopStoryBaseVideoAdapter", "callbackToSuccess %d %b", java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z17));
    }

    public int y() {
        return this.f264490e.h();
    }

    public int z() {
        return this.f264489d.h();
    }
}
