package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes4.dex */
public class d extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.AbstractVideoView f190778a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView, android.os.Looper looper) {
        super(looper);
        this.f190778a = abstractVideoView;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        int i17 = message.what;
        com.tencent.mm.pluginsdk.ui.AbstractVideoView abstractVideoView = this.f190778a;
        if (i17 == 1) {
            abstractVideoView.N.run();
        } else {
            if (i17 != 2) {
                return;
            }
            abstractVideoView.P.run();
        }
    }
}
