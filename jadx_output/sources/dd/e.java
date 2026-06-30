package dd;

/* loaded from: classes9.dex */
public final class e implements com.tencent.mm.wallet_core.model.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dd.h f228873a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f228874b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.p f228875c;

    public e(dd.h hVar, yz5.p pVar, yz5.p pVar2) {
        this.f228873a = hVar;
        this.f228874b = pVar;
        this.f228875c = pVar2;
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onCancel() {
        dd.h hVar = this.f228873a;
        com.tencent.mm.wallet_core.model.p0 p0Var = hVar.f228878a;
        boolean z17 = false;
        if (p0Var != null && p0Var.b()) {
            z17 = true;
        }
        if (z17) {
            this.f228874b.invoke(java.lang.Boolean.FALSE, null);
        } else {
            this.f228875c.invoke(java.lang.Boolean.FALSE, null);
        }
        com.tencent.liteapp.framework.dynamic_module.impl.JumpRemindImpl$LiteAppOnCloseListener jumpRemindImpl$LiteAppOnCloseListener = hVar.f228879b;
        if (jumpRemindImpl$LiteAppOnCloseListener != null) {
            jumpRemindImpl$LiteAppOnCloseListener.dead();
        }
        com.tencent.mm.wallet_core.model.p0 p0Var2 = hVar.f228878a;
        if (p0Var2 != null) {
            p0Var2.f();
        }
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onEnter() {
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onUrlCancel() {
        dd.h hVar = this.f228873a;
        com.tencent.mm.wallet_core.model.p0 p0Var = hVar.f228878a;
        boolean z17 = false;
        if (p0Var != null && p0Var.b()) {
            z17 = true;
        }
        if (z17) {
            this.f228874b.invoke(java.lang.Boolean.FALSE, null);
        } else {
            this.f228875c.invoke(java.lang.Boolean.FALSE, null);
        }
        com.tencent.liteapp.framework.dynamic_module.impl.JumpRemindImpl$LiteAppOnCloseListener jumpRemindImpl$LiteAppOnCloseListener = hVar.f228879b;
        if (jumpRemindImpl$LiteAppOnCloseListener != null) {
            jumpRemindImpl$LiteAppOnCloseListener.dead();
        }
        com.tencent.mm.wallet_core.model.p0 p0Var2 = hVar.f228878a;
        if (p0Var2 != null) {
            p0Var2.f();
        }
    }

    @Override // com.tencent.mm.wallet_core.model.r
    public void onUrlOk() {
        dd.h hVar = this.f228873a;
        com.tencent.mm.wallet_core.model.p0 p0Var = hVar.f228878a;
        boolean z17 = false;
        if (p0Var != null && p0Var.b()) {
            z17 = true;
        }
        if (z17) {
            this.f228874b.invoke(java.lang.Boolean.TRUE, null);
        } else {
            this.f228875c.invoke(java.lang.Boolean.TRUE, null);
        }
        com.tencent.liteapp.framework.dynamic_module.impl.JumpRemindImpl$LiteAppOnCloseListener jumpRemindImpl$LiteAppOnCloseListener = hVar.f228879b;
        if (jumpRemindImpl$LiteAppOnCloseListener != null) {
            jumpRemindImpl$LiteAppOnCloseListener.dead();
        }
        com.tencent.mm.wallet_core.model.p0 p0Var2 = hVar.f228878a;
        if (p0Var2 != null) {
            p0Var2.f();
        }
    }
}
