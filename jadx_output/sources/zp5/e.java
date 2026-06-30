package zp5;

/* loaded from: classes5.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f474958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f474959e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zp5.f f474960f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f474961g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f474962h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, zp5.f fVar, android.content.Context context, java.lang.Runnable runnable, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f474959e = str;
        this.f474960f = fVar;
        this.f474961g = context;
        this.f474962h = runnable;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new zp5.e(this.f474959e, this.f474960f, this.f474961g, this.f474962h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((zp5.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0164, code lost:
    
        if (r4 == null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00af  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 818
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zp5.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
