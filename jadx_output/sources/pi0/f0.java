package pi0;

/* loaded from: classes11.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354561d;

    /* renamed from: e, reason: collision with root package name */
    public int f354562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi0.g0 f354563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f354564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f354565h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(pi0.g0 g0Var, android.content.Context context, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f354563f = g0Var;
        this.f354564g = context;
        this.f354565h = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new pi0.f0(this.f354563f, this.f354564g, this.f354565h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((pi0.f0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0347  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x02f7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02d0  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 888
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pi0.f0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
