package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class be extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f117863d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f117864e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f117865f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f117866g;

    /* renamed from: h, reason: collision with root package name */
    public int f117867h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.h84 f117868i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.fe f117869m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.ce f117870n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(r45.h84 h84Var, com.tencent.mm.plugin.finder.live.widget.fe feVar, com.tencent.mm.plugin.finder.live.widget.ce ceVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f117868i = h84Var;
        this.f117869m = feVar;
        this.f117870n = ceVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.plugin.finder.live.widget.be(this.f117868i, this.f117869m, this.f117870n, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.plugin.finder.live.widget.be) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f4  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.live.widget.be.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
