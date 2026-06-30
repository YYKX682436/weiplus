package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class p extends androidx.fragment.app.y1 {

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f141614i;

    public p(androidx.fragment.app.FragmentManager fragmentManager) {
        super(fragmentManager, 0);
        this.f141614i = new java.util.ArrayList();
    }

    @Override // androidx.viewpager.widget.a
    public int getCount() {
        return ((java.util.ArrayList) this.f141614i).size();
    }

    @Override // androidx.fragment.app.y1
    public androidx.fragment.app.Fragment getItem(int i17) {
        java.util.List list = this.f141614i;
        return (androidx.fragment.app.Fragment) ((java.util.ArrayList) list).get(i17 % ((java.util.ArrayList) list).size());
    }
}
