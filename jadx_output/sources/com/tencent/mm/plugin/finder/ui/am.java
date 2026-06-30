package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes.dex */
public final class am extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f128871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f128872e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(java.lang.ref.WeakReference weakReference, int i17) {
        super(0);
        this.f128871d = weakReference;
        this.f128872e = i17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17;
        androidx.recyclerview.widget.f2 f2Var = (androidx.recyclerview.widget.f2) this.f128871d.get();
        if (f2Var != null && (i17 = this.f128872e) != -1) {
            f2Var.notifyItemChanged(i17);
        }
        return jz5.f0.f302826a;
    }
}
