package yx;

/* loaded from: classes3.dex */
public final class i implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f467032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f467033e;

    public i(android.view.ViewGroup viewGroup, android.widget.TextView textView) {
        this.f467032d = viewGroup;
        this.f467033e = textView;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        android.view.ViewGroup onlineInfoLayout = this.f467032d;
        kotlin.jvm.internal.o.f(onlineInfoLayout, "$onlineInfoLayout");
        ly.g.c(onlineInfoLayout, 350L, null, null, null, null, null, new yx.h(this.f467033e, (java.lang.String) obj), 62, null);
    }
}
