package com.tencent.mm.plugin.ringtone.uic;

/* loaded from: classes10.dex */
public final class e2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f158395d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f158396e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f158397f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f158398g;

    /* renamed from: h, reason: collision with root package name */
    public int f158399h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f158400i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ringtone.uic.g2 f158401m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ boolean f158402n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ vx3.i f158403o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2(com.tencent.mm.plugin.ringtone.uic.g2 g2Var, boolean z17, vx3.i iVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f158401m = g2Var;
        this.f158402n = z17;
        this.f158403o = iVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.ringtone.uic.e2 e2Var = new com.tencent.mm.plugin.ringtone.uic.e2(this.f158401m, this.f158402n, this.f158403o, continuation);
        e2Var.f158400i = obj;
        return e2Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.ringtone.uic.e2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01ae A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0131  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.ringtone.uic.e2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
