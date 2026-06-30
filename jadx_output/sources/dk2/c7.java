package dk2;

/* loaded from: classes3.dex */
public final class c7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f233281d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233282e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f233283f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f233284g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233285h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(java.lang.String str, boolean z17, boolean z18, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f233282e = str;
        this.f233283f = z17;
        this.f233284g = z18;
        this.f233285h = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new dk2.c7(this.f233282e, this.f233283f, this.f233284g, this.f233285h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((dk2.c7) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00ea  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dk2.c7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
