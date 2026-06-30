package eg4;

/* loaded from: classes4.dex */
public final class k0 implements xg3.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252747a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f252748b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f252749c;

    public k0(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI, com.tencent.mm.ui.widget.dialog.u3 u3Var, java.lang.String str) {
        this.f252747a = addFriendVerifyRecordUI;
        this.f252748b = u3Var;
        this.f252749c = str;
    }

    public void a(boolean z17, int i17, java.lang.String errorMsg) {
        kotlin.jvm.internal.o.g(errorMsg, "errorMsg");
        int i18 = com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI.f172162p;
        v65.i.c((com.tencent.mm.sdk.coroutines.SequenceLifecycleScope) ((jz5.n) this.f252747a.f172168i).getValue(), null, new eg4.j0(this.f252748b, z17, this.f252749c, this.f252747a, i17, errorMsg, null), 1, null);
    }
}
