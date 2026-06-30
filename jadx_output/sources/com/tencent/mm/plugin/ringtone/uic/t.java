package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.v f158487d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f158488e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(com.tencent.mm.plugin.ringtone.uic.v vVar, int i17) {
        super(2);
        this.f158487d = vVar;
        this.f158488e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Boolean) obj).booleanValue();
        ((java.lang.Number) obj2).intValue();
        com.tencent.mm.view.recyclerview.WxRecyclerAdapter wxRecyclerAdapter = this.f158487d.f158503i;
        if (wxRecyclerAdapter != null) {
            wxRecyclerAdapter.notifyItemChanged(this.f158488e, java.lang.Boolean.TRUE);
        }
        return jz5.f0.f302826a;
    }
}
