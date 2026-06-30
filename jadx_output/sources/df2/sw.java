package df2;

/* loaded from: classes3.dex */
public final class sw extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231376d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231377e;

    /* renamed from: f, reason: collision with root package name */
    public int f231378f;

    /* renamed from: g, reason: collision with root package name */
    public int f231379g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.xw f231380h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw(df2.xw xwVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f231380h = xwVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new df2.sw(this.f231380h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.sw) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x013b  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.sw.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
