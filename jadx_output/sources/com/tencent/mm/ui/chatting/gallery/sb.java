package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class sb extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ub f201372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f201373e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sb(com.tencent.mm.ui.chatting.gallery.ub ubVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f201372d = ubVar;
        this.f201373e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.ui.chatting.gallery.sb(this.f201372d, this.f201373e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.sb) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.String str = this.f201373e;
        this.f201372d.getClass();
        com.tencent.mm.pointers.PInt pInt = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt2 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt3 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt4 = new com.tencent.mm.pointers.PInt();
        com.tencent.mm.pointers.PInt pInt5 = new com.tencent.mm.pointers.PInt();
        ((be0.e) ((com.tencent.mm.feature.sight.api.o) i95.n0.c(com.tencent.mm.feature.sight.api.o.class))).getClass();
        java.lang.String f17 = com.tencent.mm.plugin.sight.base.e.f(str, pInt, pInt2, pInt3, pInt4, pInt5);
        boolean z17 = true;
        if (!(f17 != null && r26.n0.B(f17, "hevc", true))) {
            if (!(f17 != null && r26.n0.B(f17, "H.265", true))) {
                if (!(f17 != null && r26.n0.B(f17, "h265", true))) {
                    z17 = false;
                }
            }
        }
        java.lang.String str2 = z17 ? "H.265" : "H.264";
        int i17 = pInt5.value;
        int i18 = pInt4.value;
        int i19 = pInt2.value;
        int i27 = pInt3.value;
        int i28 = pInt.value;
        return new com.tencent.mm.ui.chatting.gallery.ob(str2, i17, i18, i19, i27, i28 > 0 ? i28 / 1000 : 0);
    }
}
