package gu0;

/* loaded from: classes5.dex */
public final class f1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f275671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gu0.k2 f275672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f275673f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(gu0.k2 k2Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f275672e = k2Var;
        this.f275673f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gu0.f1(this.f275672e, this.f275673f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gu0.f1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0095 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006a A[Catch: Exception -> 0x00b5, TryCatch #0 {Exception -> 0x00b5, blocks: (B:9:0x0021, B:10:0x009f, B:15:0x002e, B:16:0x0096, B:19:0x0032, B:20:0x008d, B:23:0x0036, B:24:0x0084, B:27:0x003a, B:28:0x004a, B:30:0x0052, B:32:0x0058, B:34:0x005e, B:39:0x006a, B:42:0x00b7, B:43:0x00be, B:46:0x0041), top: B:2:0x0015 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b7 A[Catch: Exception -> 0x00b5, TryCatch #0 {Exception -> 0x00b5, blocks: (B:9:0x0021, B:10:0x009f, B:15:0x002e, B:16:0x0096, B:19:0x0032, B:20:0x008d, B:23:0x0036, B:24:0x0084, B:27:0x003a, B:28:0x004a, B:30:0x0052, B:32:0x0058, B:34:0x005e, B:39:0x006a, B:42:0x00b7, B:43:0x00be, B:46:0x0041), top: B:2:0x0015 }] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gu0.f1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
