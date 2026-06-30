package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes.dex */
public final class lb0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f113374d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb0(yz5.l lVar) {
        super(1);
        this.f113374d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        yz5.l lVar = this.f113374d;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(booleanValue));
        }
        return jz5.f0.f302826a;
    }
}
