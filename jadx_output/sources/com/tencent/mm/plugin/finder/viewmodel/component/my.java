package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class my extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.ny f135220a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my(com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar, java.lang.String str) {
        super(str);
        this.f135220a = nyVar;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message != null) {
            int i17 = message.what;
            com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = this.f135220a;
            if (i17 == 1) {
                com.tencent.mm.plugin.finder.viewmodel.component.ny.O6(nyVar);
                sendEmptyMessageDelayed(1, 60000L);
            } else if (i17 == 2) {
                com.tencent.mm.plugin.finder.viewmodel.component.ny.O6(nyVar);
                removeCallbacksAndMessages(null);
            }
        }
    }
}
