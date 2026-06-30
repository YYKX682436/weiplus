package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public final class c extends androidx.fragment.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f141243i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.List f141244m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.content.Context context, androidx.fragment.app.FragmentManager fm6) {
        super(fm6, 0);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(fm6, "fm");
        this.f141243i = context;
        this.f141244m = new java.util.ArrayList();
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return ((java.util.ArrayList) this.f141244m).size();
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        return (androidx.fragment.app.Fragment) ((java.util.ArrayList) this.f141244m).get(i17);
    }

    @Override // androidx.viewpager.widget.a
    public java.lang.CharSequence getPageTitle(int i17) {
        return this.f141243i.getResources().getString(com.tencent.mm.plugin.game.ui.chat_tab.d.f141252a[i17].intValue());
    }
}
