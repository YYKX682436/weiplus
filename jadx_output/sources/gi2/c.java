package gi2;

/* loaded from: classes10.dex */
public abstract class c implements gi2.g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f272266a = d();

    public abstract void b(java.util.ArrayList arrayList, gi2.d dVar, com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView liveCustomRoomLayoutView);

    public void c(java.util.ArrayList viewList) {
        kotlin.jvm.internal.o.g(viewList, "viewList");
        java.util.Iterator it = viewList.iterator();
        while (it.hasNext()) {
            android.view.View view = (android.view.View) it.next();
            if (view.getId() == -1) {
                view.setId(android.view.View.generateViewId());
            }
        }
    }

    public abstract java.lang.String d();

    @Override // gi2.g
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void a(com.tencent.mm.plugin.finder.live.mic.custom.LiveCustomRoomLayoutView parent) {
        kotlin.jvm.internal.o.g(parent, "parent");
        gi2.b bVar = new gi2.b(parent, this);
        if (parent.getWidth() == 0 || parent.getHeight() == 0) {
            parent.getViewTreeObserver().addOnPreDrawListener(new gi2.a(parent, bVar));
        } else {
            bVar.invoke();
        }
    }

    public final void f(android.view.View view, gi2.d adapter, int i17) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(adapter, "adapter");
        if (view.getParent() != null) {
            android.view.ViewParent parent = view.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
        adapter.d(i17, view);
    }
}
