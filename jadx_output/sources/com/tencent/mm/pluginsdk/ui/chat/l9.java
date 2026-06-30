package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class l9 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.n9 f190466d;

    public l9(com.tencent.mm.pluginsdk.ui.chat.n9 n9Var) {
        this.f190466d = n9Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        db5.d5 d5Var = this.f190466d.f190519h;
        if (d5Var == null) {
            return false;
        }
        d5Var.dismiss();
        return false;
    }
}
