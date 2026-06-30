package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes12.dex */
public final class w2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI f191966d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI fileSelectorUI) {
        super(1);
        this.f191966d = fileSelectorUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.net.Uri it = (android.net.Uri) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.pluginsdk.ui.tools.o1 o1Var = com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI.I;
        return this.f191966d.l7(it);
    }
}
