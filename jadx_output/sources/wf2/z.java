package wf2;

/* loaded from: classes10.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f445630d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445631e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wf2.a0 f445632f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f445633g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f445634h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f445635i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(wf2.a0 a0Var, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2, android.graphics.Bitmap bitmap3, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f445632f = a0Var;
        this.f445633g = bitmap;
        this.f445634h = bitmap2;
        this.f445635i = bitmap3;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        wf2.z zVar = new wf2.z(this.f445632f, this.f445633g, this.f445634h, this.f445635i, continuation);
        zVar.f445631e = obj;
        return zVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((wf2.z) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0101  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wf2.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
