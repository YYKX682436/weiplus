package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class bo extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ap f112061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f112062e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo(com.tencent.mm.plugin.finder.live.plugin.ap apVar, android.view.ViewGroup viewGroup) {
        super(2);
        this.f112061d = apVar;
        this.f112062e = viewGroup;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).floatValue();
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        com.tencent.mm.plugin.finder.live.plugin.tn tnVar = (com.tencent.mm.plugin.finder.live.plugin.tn) this.f112061d.A.get(this.f112062e);
        if (tnVar != null) {
            tnVar.d(booleanValue);
        }
        return jz5.f0.f302826a;
    }
}
