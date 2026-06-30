package ru;

/* loaded from: classes12.dex */
public final class g extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ru.j f399569d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qi3.k0 f399570e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ru.j jVar, qi3.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f399569d = jVar;
        this.f399570e = k0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new ru.g(this.f399569d, this.f399570e, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((ru.g) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0132  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
