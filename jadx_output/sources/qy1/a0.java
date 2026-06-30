package qy1;

/* loaded from: classes13.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f367693d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f367694e;

    /* renamed from: f, reason: collision with root package name */
    public int f367695f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367696g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f367697h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ qy1.b0 f367698i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ ny1.j f367699m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367700n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(long j17, qy1.b0 b0Var, ny1.j jVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367697h = j17;
        this.f367698i = b0Var;
        this.f367699m = jVar;
        this.f367700n = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qy1.a0 a0Var = new qy1.a0(this.f367697h, this.f367698i, this.f367699m, this.f367700n, continuation);
        a0Var.f367696g = obj;
        return a0Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.a0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x030c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c2  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.a0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
