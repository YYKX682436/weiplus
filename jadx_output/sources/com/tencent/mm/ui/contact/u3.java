package com.tencent.mm.ui.contact;

/* loaded from: classes11.dex */
public class u3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.contact.a4 f207205d;

    public u3(com.tencent.mm.ui.contact.a4 a4Var) {
        this.f207205d = a4Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.ui.contact.a4 a4Var = this.f207205d;
        a4Var.c();
        a4Var.a();
        return false;
    }
}
