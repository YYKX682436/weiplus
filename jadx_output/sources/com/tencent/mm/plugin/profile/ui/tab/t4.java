package com.tencent.mm.plugin.profile.ui.tab;

/* loaded from: classes11.dex */
public final class t4 extends androidx.fragment.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f154598i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(java.util.List fragments, androidx.fragment.app.FragmentManager fm6) {
        super(fm6, 0);
        kotlin.jvm.internal.o.g(fragments, "fragments");
        kotlin.jvm.internal.o.g(fm6, "fm");
        this.f154598i = fragments;
    }

    @Override // androidx.fragment.app.y1
    public long a(int i17) {
        return java.lang.System.identityHashCode(this.f154598i.get(i17));
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return this.f154598i.size();
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        return (androidx.fragment.app.Fragment) this.f154598i.get(i17);
    }

    @Override // androidx.viewpager.widget.a
    public int getItemPosition(java.lang.Object item) {
        kotlin.jvm.internal.o.g(item, "item");
        int c07 = kz5.n0.c0(this.f154598i, item);
        if (c07 == -1) {
            return -2;
        }
        return c07;
    }
}
