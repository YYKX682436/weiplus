package ru;

/* loaded from: classes12.dex */
public final class p extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f399615d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ru.u f399616e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qi3.d0 f399617f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(ru.u uVar, qi3.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f399616e = uVar;
        this.f399617f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new ru.p(this.f399616e, this.f399617f, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((ru.p) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01c3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
