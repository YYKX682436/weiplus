package com.tencent.mm.ui.chatting.gallery;

/* loaded from: classes3.dex */
public final class ba extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f200820d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f200821e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.gallery.ja f200822f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk4.d f200823g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(com.tencent.mm.ui.chatting.gallery.ja jaVar, pk4.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f200822f = jaVar;
        this.f200823g = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.ui.chatting.gallery.ba baVar = new com.tencent.mm.ui.chatting.gallery.ba(this.f200822f, this.f200823g, continuation);
        baVar.f200821e = obj;
        return baVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.ui.chatting.gallery.ba) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0049  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0034 -> B:5:0x0037). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 526
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.gallery.ba.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
