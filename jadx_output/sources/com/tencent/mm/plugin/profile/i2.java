package com.tencent.mm.plugin.profile;

/* loaded from: classes5.dex */
public final class i2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f153493d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f153494e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f153495f;

    /* renamed from: g, reason: collision with root package name */
    public int f153496g;

    /* renamed from: h, reason: collision with root package name */
    public int f153497h;

    /* renamed from: i, reason: collision with root package name */
    public long f153498i;

    /* renamed from: m, reason: collision with root package name */
    public int f153499m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f153500n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.p7 f153501o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ boolean f153502p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(java.lang.String str, com.tencent.mm.storage.p7 p7Var, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f153500n = str;
        this.f153501o = p7Var;
        this.f153502p = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.profile.i2(this.f153500n, this.f153501o, this.f153502p, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.profile.i2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x022f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x014f -> B:6:0x021b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x01ef -> B:5:0x01f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x021d -> B:7:0x022a). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 733
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.profile.i2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
