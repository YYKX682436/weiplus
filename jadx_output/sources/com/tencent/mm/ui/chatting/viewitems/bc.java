package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class bc implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f203473a;

    public bc(q80.d0 d0Var) {
        this.f203473a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "openLiteApp fail %s.", this.f203473a.f360649a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.msgquote.QuoteMsgSourceClickLogic", "openLiteApp success %s.", this.f203473a.f360649a);
    }
}
