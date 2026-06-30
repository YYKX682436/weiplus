package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class vc implements com.tencent.mm.ui.tools.n4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowVideoUI f210853a;

    public vc(com.tencent.mm.ui.tools.ShowVideoUI showVideoUI) {
        this.f210853a = showVideoUI;
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void a() {
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationEnd() {
        new com.tencent.mm.sdk.platformtools.n3().post(new com.tencent.mm.ui.tools.uc(this));
    }

    @Override // com.tencent.mm.ui.tools.n4
    public void onAnimationStart() {
    }
}
