package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class nq extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public int f135342d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.event.recyclerview.FinderRecyclerView f135343e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f135344f;

    /* renamed from: g, reason: collision with root package name */
    public float f135345g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f135346h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f135346h = new com.tencent.mm.plugin.finder.viewmodel.component.mq(this);
    }

    public final void O6(boolean z17) {
        this.f135344f = z17;
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsScrollUIC", "set interceptEvent " + z17);
    }

    public final void clear() {
        com.tencent.mars.xlog.Log.i("Finder.FinderNpsScrollUIC", "clear");
        O6(false);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f135346h = new com.tencent.mm.plugin.finder.viewmodel.component.mq(this);
    }
}
