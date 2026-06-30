package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jf implements androidx.lifecycle.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mg f113088d;

    public jf(com.tencent.mm.plugin.finder.live.plugin.mg mgVar) {
        this.f113088d = mgVar;
    }

    @Override // androidx.lifecycle.k0
    public void onChanged(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin", "enableCommentUserAvatarImg change to: " + ((java.lang.Boolean) obj));
        this.f113088d.D.notifyDataSetChanged();
    }
}
