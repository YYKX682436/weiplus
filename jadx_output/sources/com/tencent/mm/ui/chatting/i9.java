package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class i9 implements c01.v8 {

    /* renamed from: a, reason: collision with root package name */
    public final yb5.d f201842a;

    public i9(yb5.d dVar) {
        this.f201842a = dVar;
    }

    @Override // c01.v8
    public void a(com.tencent.mm.storage.f9 f9Var) {
        mm.w.e("notifyFirstChat");
        yb5.d dVar = this.f201842a;
        if (dVar.f460708c.a(sb5.z0.class) == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.ChattingUIKeywordChecker", "chatting ui maybe has exit!");
        } else {
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) dVar.f460708c.a(sb5.z0.class))).C();
            ((com.tencent.mm.ui.chatting.component.pe) ((sb5.z0) dVar.f460708c.a(sb5.z0.class))).M0();
        }
    }

    @Override // c01.v8
    public void b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, android.os.Bundle bundle) {
    }

    @Override // c01.v8
    public void c(java.util.List list) {
    }

    @Override // c01.v8
    public android.os.Looper getLooper() {
        return android.os.Looper.getMainLooper();
    }
}
