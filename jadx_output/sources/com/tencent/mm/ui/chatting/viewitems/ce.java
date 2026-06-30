package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ce implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203718a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f203719b;

    public ce(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        this.f203718a = f9Var;
        this.f203719b = a0Var;
    }

    @Override // j45.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2000 && i18 == -1) {
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(intent.getStringArrayListExtra("SendMsgUsernames"), ";");
            zy2.oc ocVar = zy2.oc.f477525a;
            this.f203719b.getClass();
            ocVar.a(this.f203718a, false, true, c17);
        }
    }
}
