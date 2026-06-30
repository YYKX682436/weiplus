package ze5;

/* loaded from: classes9.dex */
public final class k9 implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f472052a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.a0 f472053b;

    public k9(com.tencent.mm.storage.f9 f9Var, com.tencent.mm.ui.chatting.viewitems.a0 a0Var) {
        this.f472052a = f9Var;
        this.f472053b = a0Var;
    }

    @Override // j45.g
    public final void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 2000 && i18 == -1) {
            java.lang.String c17 = com.tencent.mm.sdk.platformtools.t8.c1(intent.getStringArrayListExtra("SendMsgUsernames"), ";");
            zy2.oc ocVar = zy2.oc.f477525a;
            this.f472053b.getClass();
            kotlin.jvm.internal.o.d(c17);
            ocVar.a(this.f472052a, false, true, c17);
        }
    }
}
