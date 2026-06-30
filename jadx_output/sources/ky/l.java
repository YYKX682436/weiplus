package ky;

/* loaded from: classes13.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f313382d;

    /* renamed from: e, reason: collision with root package name */
    public int f313383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f313384f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z.e f313385g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z.e f313386h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f313387i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ long f313388m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f313389n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f313390o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(boolean z17, z.e eVar, z.e eVar2, kotlinx.coroutines.y0 y0Var, long j17, int i17, int i18, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f313384f = z17;
        this.f313385g = eVar;
        this.f313386h = eVar2;
        this.f313387i = y0Var;
        this.f313388m = j17;
        this.f313389n = i17;
        this.f313390o = i18;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ky.l(this.f313384f, this.f313385g, this.f313386h, this.f313387i, this.f313388m, this.f313389n, this.f313390o, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ky.l) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00f1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fe A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x008d A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x010a -> B:8:0x0090). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ky.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
