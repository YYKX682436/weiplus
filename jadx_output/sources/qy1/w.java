package qy1;

/* loaded from: classes13.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f367763d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f367764e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f367765f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qy1.b0 f367766g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ny1.j f367767h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367768i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(long j17, qy1.b0 b0Var, ny1.j jVar, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f367765f = j17;
        this.f367766g = b0Var;
        this.f367767h = jVar;
        this.f367768i = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        qy1.w wVar = new qy1.w(this.f367765f, this.f367766g, this.f367767h, this.f367768i, continuation);
        wVar.f367764e = obj;
        return wVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((qy1.w) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ea A[RETURN] */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 537
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qy1.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
