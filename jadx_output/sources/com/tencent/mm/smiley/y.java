package com.tencent.mm.smiley;

/* loaded from: classes12.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f193408d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f193409e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f193410f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f193411g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f193412h;

    /* renamed from: i, reason: collision with root package name */
    public int f193413i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f193414m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f193414m = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.smiley.y(this.f193414m, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.smiley.y) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0074 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x01c8 A[Catch: all -> 0x01d7, TRY_LEAVE, TryCatch #0 {all -> 0x01d7, blocks: (B:7:0x01bd, B:9:0x01c8), top: B:6:0x01bd }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x01b7 -> B:6:0x01bd). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 528
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.smiley.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
