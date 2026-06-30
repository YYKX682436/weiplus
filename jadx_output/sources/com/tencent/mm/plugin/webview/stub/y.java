package com.tencent.mm.plugin.webview.stub;

/* loaded from: classes8.dex */
public class y extends com.tencent.mm.sdk.platformtools.d8 {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183582h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(com.tencent.mm.plugin.webview.stub.s sVar, long j17, java.lang.Void r47, java.lang.String str) {
        super(j17, r47);
        this.f183582h = str;
    }

    @Override // com.tencent.mm.sdk.platformtools.d8
    public java.lang.Object b() {
        com.tencent.mm.storage.z3 g07;
        if (gm0.j1.a()) {
            com.tencent.mm.storage.k4 Bi = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
            java.lang.String str = this.f183582h;
            com.tencent.mm.storage.z3 n17 = Bi.n(str, true);
            if ((n17 == null || ((int) n17.E2) <= 0) && ((g07 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().g0(str)) == null || ((int) g07.E2) <= 0)) {
                ((c01.k7) c01.n8.a()).b(str, 17, null);
            }
        }
        return null;
    }
}
