package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes10.dex */
public final class hl implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.jl f204135a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204136b;

    public hl(com.tencent.mm.ui.chatting.viewitems.jl jlVar, yb5.d dVar) {
        this.f204135a = jlVar;
        this.f204136b = dVar;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = obj instanceof com.tencent.mm.protocal.protobuf.FinderObject ? (com.tencent.mm.protocal.protobuf.FinderObject) obj : null;
        if (finderObject != null) {
            this.f204135a.e0(this.f204136b, finderObject);
        }
    }
}
