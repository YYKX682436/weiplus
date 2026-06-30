package com.tencent.mm.ui.chatting.component;

/* loaded from: classes8.dex */
public class d9 implements q80.f0 {
    public d9(com.tencent.mm.ui.chatting.component.b9 b9Var) {
    }

    @Override // q80.f0
    public void fail() {
        com.tencent.mars.xlog.Log.e("ChattingW1wComponent", "Security notification liteapp failed to open");
    }

    @Override // q80.f0
    public void success() {
        com.tencent.mars.xlog.Log.i("ChattingW1wComponent", "Security notification liteapp opened successfully");
    }
}
