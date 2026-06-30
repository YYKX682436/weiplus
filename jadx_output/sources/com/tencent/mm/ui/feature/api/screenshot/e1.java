package com.tencent.mm.ui.feature.api.screenshot;

/* loaded from: classes8.dex */
public final class e1 implements q80.x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.feature.api.screenshot.j1 f208471a;

    public e1(com.tencent.mm.ui.feature.api.screenshot.j1 j1Var) {
        this.f208471a = j1Var;
    }

    @Override // q80.x
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f208471a.mmOnActivityResult(i17, i18, intent);
    }
}
