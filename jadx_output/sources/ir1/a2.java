package ir1;

/* loaded from: classes4.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI f293933d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(com.tencent.mm.plugin.brandservice.conversation.ui.BizFansSettingUI bizFansSettingUI) {
        super(0);
        this.f293933d = bizFansSettingUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String c17;
        r45.s26 s26Var = new r45.s26();
        if (this.f293933d.f93958d == 5) {
            rm.d0 d0Var = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr = tk.s.f419870d;
            c17 = ((ox.r) d0Var).Bi(2).c();
        } else {
            rm.d0 d0Var2 = (rm.d0) i95.n0.c(rm.d0.class);
            tk.s[] sVarArr2 = tk.s.f419870d;
            c17 = ((ox.r) d0Var2).Bi(1).c();
        }
        s26Var.f385447d = c17;
        return s26Var;
    }
}
