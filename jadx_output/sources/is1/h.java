package is1;

/* loaded from: classes7.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294414d;

    /* renamed from: e, reason: collision with root package name */
    public int f294415e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.vm6 f294416f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f294417g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f294418h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(r45.vm6 vm6Var, int i17, yz5.a aVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f294416f = vm6Var;
        this.f294417g = i17;
        this.f294418h = aVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new is1.h(this.f294416f, this.f294417g, this.f294418h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((is1.h) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x068b  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0698  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x069b  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0681  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0701  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x00f9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0486  */
    /* JADX WARN: Type inference failed for: r3v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v32 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int, boolean] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r34) {
        /*
            Method dump skipped, instructions count: 1821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: is1.h.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
