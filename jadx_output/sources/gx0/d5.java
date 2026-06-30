package gx0;

/* loaded from: classes5.dex */
public final class d5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276316d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276317e;

    /* renamed from: f, reason: collision with root package name */
    public int f276318f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276319g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f276319g = w8Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new gx0.d5(this.f276319g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.d5) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000a. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x015b A[Catch: all -> 0x017f, Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:17:0x0028, B:21:0x002d, B:22:0x0151, B:24:0x015b, B:25:0x0162, B:28:0x0032, B:29:0x00f2, B:31:0x00fa, B:32:0x0108, B:35:0x0037, B:36:0x00d2, B:38:0x00e8, B:42:0x0044, B:43:0x00b4, B:58:0x009f), top: B:2:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0174 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa A[Catch: all -> 0x017f, Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:17:0x0028, B:21:0x002d, B:22:0x0151, B:24:0x015b, B:25:0x0162, B:28:0x0032, B:29:0x00f2, B:31:0x00fa, B:32:0x0108, B:35:0x0037, B:36:0x00d2, B:38:0x00e8, B:42:0x0044, B:43:0x00b4, B:58:0x009f), top: B:2:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0150 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e8 A[Catch: all -> 0x017f, Exception -> 0x0181, TryCatch #0 {Exception -> 0x0181, blocks: (B:17:0x0028, B:21:0x002d, B:22:0x0151, B:24:0x015b, B:25:0x0162, B:28:0x0032, B:29:0x00f2, B:31:0x00fa, B:32:0x0108, B:35:0x0037, B:36:0x00d2, B:38:0x00e8, B:42:0x0044, B:43:0x00b4, B:58:0x009f), top: B:2:0x000a, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x007f A[LOOP:0: B:49:0x0079->B:51:0x007f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0095 A[LOOP:1: B:54:0x008f->B:56:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3 A[RETURN] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 488
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gx0.d5.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
