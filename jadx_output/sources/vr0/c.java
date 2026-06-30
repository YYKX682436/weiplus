package vr0;

/* loaded from: classes14.dex */
public final class c extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f439451d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f439452e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f439453f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f439454g;

    /* renamed from: h, reason: collision with root package name */
    public int f439455h;

    /* renamed from: i, reason: collision with root package name */
    public int f439456i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ vr0.z f439457m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f439458n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f439459o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(vr0.z zVar, int i17, boolean z17, kotlin.coroutines.Continuation continuation) {
        super(1, continuation);
        this.f439457m = zVar;
        this.f439458n = i17;
        this.f439459o = z17;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(kotlin.coroutines.Continuation continuation) {
        return new vr0.c(this.f439457m, this.f439458n, this.f439459o, continuation);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        return ((vr0.c) create((kotlin.coroutines.Continuation) obj)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x010a, code lost:
    
        if (r14 != 3) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0298 A[Catch: Exception -> 0x02b9, TryCatch #0 {Exception -> 0x02b9, blocks: (B:12:0x0280, B:14:0x0298, B:16:0x029e, B:18:0x02a4, B:19:0x02a9), top: B:11:0x0280 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0196  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
