package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191542d;

    public c3(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        this.f191542d = fileSelectorUI;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.tools.a2 a2Var = this.f191542d.f191374n;
        if (a2Var == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        if (a2Var != null) {
            a2Var.n("");
        } else {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
    }
}
