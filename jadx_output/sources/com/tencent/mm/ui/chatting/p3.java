package com.tencent.mm.ui.chatting;

/* loaded from: classes9.dex */
public class p3 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ot0.f3 f202080d;

    public p3(ot0.f3 f3Var) {
        this.f202080d = f3Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        ot0.f3 f3Var = this.f202080d;
        if (f3Var == null || !f3Var.u1()) {
            return;
        }
        a14.g.a().b();
    }
}
