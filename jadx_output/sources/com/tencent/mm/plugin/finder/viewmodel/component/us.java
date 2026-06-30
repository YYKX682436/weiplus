package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class us implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f136170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.pt f136171e;

    public us(android.content.res.Configuration configuration, com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar) {
        this.f136170d = configuration;
        this.f136171e = ptVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.content.res.Configuration configuration = this.f136170d;
        int i17 = configuration.orientation;
        com.tencent.mm.plugin.finder.viewmodel.component.pt ptVar = this.f136171e;
        if (i17 == 2) {
            ptVar.T6(configuration);
        }
        com.tencent.mm.plugin.finder.video.FinderVideoLayout finderVideoLayout = ptVar.Q;
        if (finderVideoLayout != null) {
            finderVideoLayout.Y(null, true);
        }
        ptVar.Q = null;
        com.tencent.mm.plugin.finder.viewmodel.component.pt.b7(this.f136171e, null, null, null, 7, null);
    }
}
