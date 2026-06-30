package im2;

/* loaded from: classes3.dex */
public final class f6 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f292318d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f292319e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f292320f;

    /* renamed from: g, reason: collision with root package name */
    public int f292321g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f292322h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.f1 f292323i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f292324m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(kotlinx.coroutines.f1 f1Var, im2.h6 h6Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f292323i = f1Var;
        this.f292324m = h6Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        im2.f6 f6Var = new im2.f6(this.f292323i, this.f292324m, continuation);
        f6Var.f292322h = obj;
        return f6Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((im2.f6) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0094 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x041f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0158  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instructions count: 1265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.f6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
