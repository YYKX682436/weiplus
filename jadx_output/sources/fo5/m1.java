package fo5;

/* loaded from: classes14.dex */
public final class m1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f265025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f265026e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f265027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(boolean z17, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f265026e = z17;
        this.f265027f = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new fo5.m1(this.f265026e, this.f265027f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.m1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
    
        if (r3.isFinishing() != false) goto L16;
     */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fo5.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
