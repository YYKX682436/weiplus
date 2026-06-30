package dl4;

/* loaded from: classes3.dex */
public final class r0 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235461a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ff0.s f235462b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235463c;

    public r0(long j17, java.lang.String str, ff0.s sVar, java.lang.String str2) {
        this.f235461a = str;
        this.f235462b = sVar;
        this.f235463c = str2;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        java.lang.String str = this.f235463c;
        ff0.s sVar = this.f235462b;
        if (!z17) {
            if (sVar != null) {
                ((dl4.n) sVar).a(str, null, false);
            }
        } else {
            byte[] N = com.tencent.mm.vfs.w6.N(this.f235461a, 0, -1);
            if (sVar != null) {
                ((dl4.n) sVar).a(str, N, N != null);
            }
        }
    }
}
