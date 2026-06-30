package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class yc implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f206072a;

    public yc(yb5.d dVar) {
        this.f206072a = dVar;
    }

    @Override // j45.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 != 221 || intent == null) {
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("result_msg");
        if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
            return;
        }
        db5.e1.F(this.f206072a.g(), stringExtra, "", false);
    }
}
