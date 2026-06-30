package dz4;

/* loaded from: classes11.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f245399d;

    /* renamed from: e, reason: collision with root package name */
    public long f245400e;

    /* renamed from: f, reason: collision with root package name */
    public int f245401f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dz4.u2 f245402g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f245403h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.wechat.aff.favorites.d f245404i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(dz4.u2 u2Var, android.app.Activity activity, com.tencent.wechat.aff.favorites.d dVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f245402g = u2Var;
        this.f245403h = activity;
        this.f245404i = dVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dz4.s2(this.f245402g, this.f245403h, this.f245404i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dz4.s2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dz4.s2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
