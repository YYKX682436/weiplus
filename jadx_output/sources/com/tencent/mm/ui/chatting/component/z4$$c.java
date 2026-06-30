package com.tencent.mm.ui.chatting.component;

/* loaded from: classes9.dex */
public final /* synthetic */ class z4$$c implements java.util.function.Function {
    @Override // java.util.function.Function
    public final java.lang.Object apply(java.lang.Object obj) {
        com.tencent.mm.storage.f9 f9Var = (com.tencent.mm.storage.f9) obj;
        return f9Var.J2() ? "image" : f9Var.isVideo() ? "video" : f9Var.Y2() ? "shortVideo" : com.tencent.mm.ui.chatting.n3.x(f9Var) ? "file" : com.eclipsesource.mmv8.Platform.UNKNOWN;
    }
}
