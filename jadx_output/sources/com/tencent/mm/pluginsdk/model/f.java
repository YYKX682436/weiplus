package com.tencent.mm.pluginsdk.model;

/* loaded from: classes8.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.h f189292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.pluginsdk.model.h hVar) {
        super(3);
        this.f189292d = hVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj3).booleanValue();
        if (com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) obj2)) {
            com.tencent.mm.pluginsdk.model.h hVar = this.f189292d;
            hVar.b();
            if (booleanValue) {
                int i17 = hVar.f189325a;
                if (i17 == 4) {
                    com.tencent.mm.pluginsdk.model.b0.f189197a.v(13L);
                } else if (i17 == 8) {
                    com.tencent.mm.pluginsdk.model.b0.f189197a.v(14L);
                } else if (i17 == 9) {
                    com.tencent.mm.pluginsdk.model.b0.f189197a.v(15L);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
