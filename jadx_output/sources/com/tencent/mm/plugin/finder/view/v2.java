package com.tencent.mm.plugin.finder.view;

/* loaded from: classes8.dex */
public final class v2 implements java.util.function.Consumer {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.view.w2 f133224a;

    public v2(com.tencent.mm.plugin.finder.view.w2 w2Var) {
        this.f133224a = w2Var;
    }

    @Override // java.util.function.Consumer
    public void accept(java.lang.Object obj) {
        this.f133224a.e(((java.lang.Boolean) obj).booleanValue());
    }
}
