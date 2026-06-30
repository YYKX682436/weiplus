package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes9.dex */
public class z9 implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q80.d0 f190776a;

    public z9(com.tencent.mm.pluginsdk.ui.chat.x9 x9Var, q80.d0 d0Var) {
        this.f190776a = d0Var;
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SourceClickListener", "openLiteApp fail %s.", this.f190776a.f360649a);
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SourceClickListener", "openLiteApp success %s.", this.f190776a.f360649a);
    }
}
