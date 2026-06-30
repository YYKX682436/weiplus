package gx0;

/* loaded from: classes5.dex */
public final class ba extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276236d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276237e;

    /* renamed from: f, reason: collision with root package name */
    public int f276238f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.ac f276239g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f276240h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ba(gx0.ac acVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276239g = acVar;
        this.f276240h = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.ba(this.f276239g, this.f276240h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.ba) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0219 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0204 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x021a A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.ba.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
