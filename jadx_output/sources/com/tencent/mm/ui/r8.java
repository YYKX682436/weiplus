package com.tencent.mm.ui;

/* loaded from: classes5.dex */
public class r8 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.LauncherUIBottomTabView f209602a;

    public r8(com.tencent.mm.ui.LauncherUIBottomTabView launcherUIBottomTabView) {
        this.f209602a = launcherUIBottomTabView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        this.f209602a.f196845e.onTabClick(0);
    }
}
