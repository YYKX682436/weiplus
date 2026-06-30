package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class ah extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.bh f117766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(com.tencent.mm.plugin.finder.live.widget.bh bhVar) {
        super(1);
        this.f117766d = bhVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f it = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int i17 = it.f70615a;
        com.tencent.mm.plugin.finder.live.widget.bh bhVar = this.f117766d;
        if (i17 == 0 && it.f70616b == 0) {
            bhVar.setResp((r45.js1) it.f70618d);
            com.tencent.mm.protobuf.f resp = it.f70618d;
            kotlin.jvm.internal.o.f(resp, "resp");
            com.tencent.mm.plugin.finder.live.widget.bh.e(bhVar, (r45.js1) resp);
        } else {
            java.lang.String str = it.f70617c;
            db5.t7.g(bhVar.getContext(), str == null || str.length() == 0 ? bhVar.getContext().getResources().getString(com.tencent.mm.R.string.f491529de5) : it.f70617c);
        }
        return jz5.f0.f302826a;
    }
}
