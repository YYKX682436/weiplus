package i81;

/* loaded from: classes7.dex */
public class t implements com.tencent.mm.plugin.appbrand.pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289618a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289619b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f289620c;

    public t(i81.r rVar, java.lang.String str, java.lang.String str2, int i17) {
        this.f289618a = str;
        this.f289619b = str2;
        this.f289620c = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.pc
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
        if (c0Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.jf.a(c0Var, this.f289618a, this.f289619b, this.f289620c, 0);
    }
}
