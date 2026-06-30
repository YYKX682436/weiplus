package com.tencent.mm.ui.chatting.component;

/* loaded from: classes12.dex */
public class a4 implements j41.w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.c4 f198605a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f198606b;

    public a4(com.tencent.mm.ui.chatting.component.x3 x3Var, com.tencent.mm.ui.chatting.component.c4 c4Var, java.lang.String str) {
        this.f198605a = c4Var;
        this.f198606b = str;
    }

    @Override // j41.w
    public void a(j41.i0 i0Var) {
        j41.u uVar;
        com.tencent.mm.ui.chatting.component.c4 c4Var = this.f198605a;
        if (i0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingFooterToolbarComponent", "fetchToolbarDslForOpenIMKeFu, fetchContact error, result is null.");
            if (c4Var != null) {
                ((com.tencent.mm.ui.chatting.component.z3) c4Var).a(null);
                return;
            }
            return;
        }
        if (i0Var.f297641b == 0 && i0Var.f297642c == null && (uVar = i0Var.f297643d) != null) {
            java.lang.String str = ((k41.g0) uVar).field_kefuToolsInfo;
            com.tencent.mars.xlog.Log.i("MicroMsg.ChattingFooterToolbarComponent", "fetchToolbarDslForOpenIMKeFu, fetchContact finished, username: " + this.f198606b + ", DSL: " + str);
            if (c4Var != null) {
                j41.u uVar2 = i0Var.f297643d;
                ((com.tencent.mm.ui.chatting.component.z3) c4Var).a(new com.tencent.mm.ui.chatting.component.d4(uVar2 instanceof k41.g0 ? (k41.g0) uVar2 : null, str));
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.ChattingFooterToolbarComponent", "fetchToolbarDslForOpenIMKeFu, fetchContact error, errorCode: " + i0Var.f297641b + ", errorType: " + i0Var.f297640a + ", errorMsg: " + i0Var.f297642c + ", contact: " + i0Var.f297643d);
        if (c4Var != null) {
            ((com.tencent.mm.ui.chatting.component.z3) c4Var).a(null);
        }
    }

    @Override // j41.w
    public void b(java.lang.String str) {
    }
}
