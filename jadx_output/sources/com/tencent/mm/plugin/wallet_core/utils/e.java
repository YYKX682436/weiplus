package com.tencent.mm.plugin.wallet_core.utils;

/* loaded from: classes9.dex */
public class e implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f180868d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.wallet_core.utils.m f180869e;

    public e(com.tencent.mm.plugin.wallet_core.utils.m mVar, android.content.Context context) {
        this.f180869e = mVar;
        this.f180868d = context;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        gm0.j1.i();
        gm0.j1.n().f273288b.q(1650, this);
        com.tencent.mm.plugin.wallet_core.utils.m mVar = this.f180869e;
        mVar.f180927d = null;
        java.util.LinkedList linkedList = mVar.f180928e;
        if (linkedList != null) {
            mVar.c(this.f180868d, linkedList);
            mVar.f180928e = null;
        }
    }
}
