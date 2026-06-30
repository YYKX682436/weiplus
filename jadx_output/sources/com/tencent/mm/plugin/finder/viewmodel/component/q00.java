package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class q00 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.MMActivity f135643d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.model.BaseFinderFeed f135644e;

    public q00(com.tencent.mm.ui.MMActivity mMActivity, com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed) {
        this.f135643d = mMActivity;
        this.f135644e = baseFinderFeed;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.finder.assist.y4.f102714a.J(this.f135643d, this.f135644e.getFeedObject(), true);
    }
}
