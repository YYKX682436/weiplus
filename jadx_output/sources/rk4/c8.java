package rk4;

/* loaded from: classes11.dex */
public final class c8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f396599d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f396600e;

    /* renamed from: f, reason: collision with root package name */
    public int f396601f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rk4.k8 f396602g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396603h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f396604i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8(rk4.k8 k8Var, java.lang.String str, android.content.Context context, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f396602g = k8Var;
        this.f396603h = str;
        this.f396604i = context;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new rk4.c8(this.f396602g, this.f396603h, this.f396604i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((rk4.c8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00d3 A[Catch: all -> 0x0019, TryCatch #0 {all -> 0x0019, blocks: (B:7:0x0014, B:13:0x002c, B:14:0x00cd, B:16:0x00d3, B:17:0x00dc, B:20:0x00e4, B:27:0x005e, B:29:0x006a, B:30:0x0070, B:32:0x0076, B:33:0x007c, B:35:0x0087, B:36:0x008b, B:38:0x0091, B:41:0x009d, B:46:0x00a4), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0108 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0113 A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rk4.c8.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
