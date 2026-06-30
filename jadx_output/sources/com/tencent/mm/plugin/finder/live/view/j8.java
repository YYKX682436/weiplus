package com.tencent.mm.plugin.finder.live.view;

/* loaded from: classes.dex */
public final class j8 implements com.tencent.mm.ipcinvoker.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.view.s8 f116416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f116417e;

    public j8(com.tencent.mm.plugin.finder.live.view.s8 s8Var, android.view.View view) {
        this.f116416d = s8Var;
        this.f116417e = view;
    }

    @Override // com.tencent.mm.ipcinvoker.r
    public void a(java.lang.Object obj) {
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) obj;
        if (iPCString == null || com.tencent.mm.sdk.platformtools.t8.K0(iPCString.f68406d)) {
            com.tencent.mars.xlog.Log.e("FinderLiveProductRecordPlayWidget", "FetchDataTask result is null or empty");
        }
        android.view.View rootLayout = this.f116417e;
        kotlin.jvm.internal.o.f(rootLayout, "$rootLayout");
        this.f116416d.e(rootLayout, iPCString != null ? iPCString.f68406d : null);
    }
}
