package px0;

/* loaded from: classes5.dex */
public final class q extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358794d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f358795e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f358796f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f358797g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f358798h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f358799i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f358800m;

    /* renamed from: n, reason: collision with root package name */
    public long f358801n;

    /* renamed from: o, reason: collision with root package name */
    public int f358802o;

    /* renamed from: p, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f358803p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358804q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ yx0.b8 f358805r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f358806s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment, yx0.b8 b8Var, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f358804q = materialImportPreviewFragment;
        this.f358805r = b8Var;
        this.f358806s = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        px0.q qVar = new px0.q(this.f358804q, this.f358805r, this.f358806s, continuation);
        qVar.f358803p = obj;
        return qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((px0.q) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0434  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 1174
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: px0.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
