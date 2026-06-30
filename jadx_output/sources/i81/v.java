package i81;

/* loaded from: classes7.dex */
public class v implements com.tencent.mm.plugin.appbrand.pc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289623a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f289624b;

    public v(i81.r rVar, java.lang.String str, java.lang.String str2) {
        this.f289623a = str;
        this.f289624b = str2;
    }

    @Override // com.tencent.mm.plugin.appbrand.pc
    public void a(com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var, jz5.l lVar, java.lang.String str) {
        if (c0Var == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.jf.a(c0Var, this.f289623a, this.f289624b, 0, 0);
    }
}
