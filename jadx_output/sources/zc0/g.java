package zc0;

/* loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f471385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ byte[] f471386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f471387f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, byte[] bArr, boolean z17) {
        super(0);
        this.f471385d = str;
        this.f471386e = bArr;
        this.f471387f = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str = this.f471385d;
        if (com.tencent.mm.vfs.w6.j(str)) {
            com.tencent.mm.vfs.w6.h(str);
        }
        int R = com.tencent.mm.vfs.w6.R(str, this.f471386e);
        if (R == 0) {
            if (this.f471387f) {
                ex3.c cVar = ex3.c.f257206a;
                android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                cVar.a(context, str);
            }
            pm0.v.X(zc0.e.f471383d);
        } else {
            pm0.v.X(new zc0.f(R));
        }
        return jz5.f0.f302826a;
    }
}
