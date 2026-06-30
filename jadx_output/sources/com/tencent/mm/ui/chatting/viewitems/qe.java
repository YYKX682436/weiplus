package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public final class qe implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f205349a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f205350b;

    public qe(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        this.f205349a = f9Var;
        this.f205350b = a0Var;
    }

    @Override // j45.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2000 && i18 == -1) {
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(intent != null ? intent.getStringArrayListExtra("SendMsgUsernames") : null, "");
            zy2.oc ocVar = zy2.oc.f477525a;
            this.f205350b.getClass();
            com.tencent.mm.storage.f9 f9Var = this.f205349a;
            boolean z17 = f9Var.getType() == 1040187441;
            kotlin.jvm.internal.o.d(c17);
            ocVar.a(f9Var, false, z17, c17);
        }
    }
}
