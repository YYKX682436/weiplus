package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f158417d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f158418e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f158419f;

    /* renamed from: g, reason: collision with root package name */
    public int f158420g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.k1 f158421h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(com.tencent.mm.plugin.ringtone.uic.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158421h = k1Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.ringtone.uic.h1(this.f158421h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.h1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0103  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ringtone.uic.h1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
