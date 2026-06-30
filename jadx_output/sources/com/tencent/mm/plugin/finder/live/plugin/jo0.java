package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class jo0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f113145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f113146e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.mo0 f113147f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.d82 f113148g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113149h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f113150i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fo0 f113151m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f113152n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.fp f113153o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jo0(xg2.h hVar, kotlin.coroutines.Continuation continuation, kotlinx.coroutines.y0 y0Var, com.tencent.mm.plugin.finder.live.plugin.mo0 mo0Var, r45.d82 d82Var, java.lang.String str, int i17, com.tencent.mm.plugin.finder.live.plugin.fo0 fo0Var, java.lang.String str2, com.tencent.mm.plugin.finder.live.plugin.fp fpVar) {
        super(2, continuation);
        this.f113145d = hVar;
        this.f113146e = y0Var;
        this.f113147f = mo0Var;
        this.f113148g = d82Var;
        this.f113149h = str;
        this.f113150i = i17;
        this.f113151m = fo0Var;
        this.f113152n = str2;
        this.f113153o = fpVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.plugin.jo0(this.f113145d, continuation, this.f113146e, this.f113147f, this.f113148g, this.f113149h, this.f113150i, this.f113151m, this.f113152n, this.f113153o);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.finder.live.plugin.jo0 jo0Var = (com.tencent.mm.plugin.finder.live.plugin.jo0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        jo0Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00aa  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 446
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.plugin.jo0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
