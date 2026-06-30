package com.tencent.mm.plugin.finder.profile.uic;

/* loaded from: classes2.dex */
public final class jj implements com.google.android.material.appbar.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.uic.f4 f123865a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.RecyclerView f123866b;

    public jj(com.tencent.mm.plugin.finder.profile.uic.f4 f4Var, androidx.recyclerview.widget.RecyclerView recyclerView) {
        this.f123865a = f4Var;
        this.f123866b = recyclerView;
    }

    @Override // com.google.android.material.appbar.e
    public final void a(com.google.android.material.appbar.AppBarLayout appBarLayout, int i17) {
        if (java.lang.Math.min(1.0f, (java.lang.Math.abs(i17) * 1.0f) / appBarLayout.getTotalScrollRange()) < 1.0d) {
            this.f123865a.T6(this.f123866b, false, 10);
        }
    }
}
