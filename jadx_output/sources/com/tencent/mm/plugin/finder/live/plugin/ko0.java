package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class ko0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f113303d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f113304e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ce2.i f113305f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.d82 f113306g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mo0 f113307h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113308i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f113309m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fo0 f113310n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113311o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fp f113312p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ko0(ce2.i iVar, r45.d82 d82Var, com.tencent.mm.plugin.finder.live.plugin.mo0 mo0Var, java.lang.String str, int i17, com.tencent.mm.plugin.finder.live.plugin.fo0 fo0Var, java.lang.String str2, com.tencent.mm.plugin.finder.live.plugin.fp fpVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f113305f = iVar;
        this.f113306g = d82Var;
        this.f113307h = mo0Var;
        this.f113308i = str;
        this.f113309m = i17;
        this.f113310n = fo0Var;
        this.f113311o = str2;
        this.f113312p = fpVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.ko0 ko0Var = new com.tencent.mm.plugin.finder.live.plugin.ko0(this.f113305f, this.f113306g, this.f113307h, this.f113308i, this.f113309m, this.f113310n, this.f113311o, this.f113312p, continuation);
        ko0Var.f113304e = obj;
        return ko0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.plugin.ko0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00e5  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.ko0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
