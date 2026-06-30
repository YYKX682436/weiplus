package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes4.dex */
public final class c8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f143536d;

    /* renamed from: e, reason: collision with root package name */
    public long f143537e;

    /* renamed from: f, reason: collision with root package name */
    public int f143538f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.lite.jsapi.comms.b8 f143539g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143540h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f143541i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(com.tencent.mm.plugin.lite.jsapi.comms.b8 b8Var, java.lang.String str, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f143539g = b8Var;
        this.f143540h = str;
        this.f143541i = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.lite.jsapi.comms.c8(this.f143539g, this.f143540h, this.f143541i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.lite.jsapi.comms.c8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x005e A[Catch: all -> 0x0104, TryCatch #0 {all -> 0x0104, blocks: (B:6:0x0019, B:26:0x002d, B:30:0x0049, B:32:0x0052, B:37:0x005e, B:39:0x006f), top: B:2:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f A[Catch: all -> 0x0104, TRY_LEAVE, TryCatch #0 {all -> 0x0104, blocks: (B:6:0x0019, B:26:0x002d, B:30:0x0049, B:32:0x0052, B:37:0x005e, B:39:0x006f), top: B:2:0x000f }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.jsapi.comms.c8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
