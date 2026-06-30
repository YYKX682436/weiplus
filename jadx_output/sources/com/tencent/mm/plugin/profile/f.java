package com.tencent.mm.plugin.profile;

/* loaded from: classes11.dex */
public final class f implements com.tencent.mm.plugin.profile.t1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.o f153461a;

    public f(com.tencent.mm.plugin.profile.o oVar) {
        this.f153461a = oVar;
    }

    @Override // com.tencent.mm.plugin.profile.t1
    public void a() {
        com.tencent.mars.xlog.Log.e("BizProfileMenuController", "MENU_ID_BLOCK onFailure");
    }

    @Override // com.tencent.mm.plugin.profile.t1
    public void onSuccess(int i17) {
        this.f153461a.f153554n = i17;
    }
}
