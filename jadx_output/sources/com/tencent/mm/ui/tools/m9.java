package com.tencent.mm.ui.tools;

/* loaded from: classes11.dex */
public class m9 implements com.tencent.mm.ui.tools.z9 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShareImgUI f210581a;

    public m9(com.tencent.mm.ui.tools.ShareImgUI shareImgUI) {
        this.f210581a = shareImgUI;
    }

    public void a(boolean z17) {
        com.tencent.mm.ui.tools.ShareImgUI shareImgUI = this.f210581a;
        com.tencent.mm.sdk.platformtools.n3 n3Var = shareImgUI.f210165t;
        n3Var.sendMessage(n3Var.obtainMessage(z17 ? shareImgUI.f210164s : shareImgUI.f210163r));
    }
}
