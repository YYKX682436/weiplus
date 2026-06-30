package com.tencent.mm.pluginsdk.forward;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f188709d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.l lVar) {
        super(1);
        this.f188709d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        kotlin.jvm.internal.o.g(it, "it");
        yz5.l lVar = this.f188709d;
        if (lVar != null) {
            lVar.invoke(it);
        }
        return jz5.f0.f302826a;
    }
}
