package vm2;

/* loaded from: classes3.dex */
public final class v extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f438120d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f438121e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f438122f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f438123g;

    public v(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        kotlin.jvm.internal.o.g(store, "store");
        this.f438120d = store;
        this.f438121e = jz5.h.b(new vm2.u(this));
        this.f438123g = new java.util.LinkedList();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f438123g.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04f2  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x07f2  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0972  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x0975  */
    /* JADX WARN: Type inference failed for: r25v4, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v30, types: [android.view.ViewGroup] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r38, int r39) {
        /*
            Method dump skipped, instructions count: 2522
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vm2.v.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = com.tencent.mm.ui.id.b(parent.getContext()).inflate(com.tencent.mm.R.layout.dta, parent, false);
        kotlin.jvm.internal.o.f(inflate, "inflate(...)");
        return new vm2.o(inflate);
    }
}
