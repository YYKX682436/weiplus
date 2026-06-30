package zd1;

/* loaded from: classes7.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f471586d;

    /* renamed from: e, reason: collision with root package name */
    public int f471587e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zd1.a0 f471588f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f471589g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f471590h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(zd1.a0 a0Var, long j17, int i17, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f471588f = a0Var;
        this.f471589g = j17;
        this.f471590h = i17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zd1.z(this.f471588f, this.f471589g, this.f471590h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zd1.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:38|(3:39|40|41)|17|18|(4:22|(2:24|(1:26))|34|35)|27|7|(3:11|12|(1:14)(7:16|17|18|(3:20|22|(0))|27|7|(4:9|11|12|(0)(0))))|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0077, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0078, code lost:
    
        r11 = r5;
        r5 = r13;
        r13 = r0;
        r0 = r1;
        r1 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00cf -> B:7:0x002d). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zd1.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
