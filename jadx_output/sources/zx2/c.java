package zx2;

/* loaded from: classes2.dex */
public abstract class c extends zx2.k {

    /* renamed from: k, reason: collision with root package name */
    public android.view.View f477030k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.lang.CharSequence title) {
        super(title);
        kotlin.jvm.internal.o.g(title, "title");
    }

    @Override // zx2.k, zx2.i
    public void c(android.view.ViewGroup viewGroup) {
        super.c(viewGroup);
        if (viewGroup != null) {
            java.lang.Object parent = viewGroup.getParent();
            kotlin.jvm.internal.o.e(parent, "null cannot be cast to non-null type android.view.View");
            this.f477030k = (android.view.View) parent;
            viewGroup.setTag(this);
        }
    }

    public android.view.View l() {
        return null;
    }

    public android.view.View m() {
        return this.f477052j;
    }

    public int[] n() {
        return new int[]{0, 0};
    }

    public android.view.View o() {
        return this.f477052j;
    }
}
