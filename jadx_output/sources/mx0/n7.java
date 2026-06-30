package mx0;

/* loaded from: classes5.dex */
public final class n7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f332170d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout f332171e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f332172f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f332173g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(com.tencent.mm.mj_publisher.finder.shoot_composing.ShootComposingPluginLayout shootComposingPluginLayout, boolean z17, kotlin.jvm.internal.c0 c0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f332171e = shootComposingPluginLayout;
        this.f332172f = z17;
        this.f332173g = c0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new mx0.n7(this.f332171e, this.f332172f, this.f332173g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx0.n7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mx0.n7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
