package sm2;

/* loaded from: classes3.dex */
public final class u implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409722d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f409723e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f409724f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.l01 f409725g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f409726h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409727i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f409728m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f409729n;

    public u(sm2.o4 o4Var, boolean z17, int i17, r45.l01 l01Var, boolean z18, java.lang.String str, int i18, java.lang.String str2) {
        this.f409722d = o4Var;
        this.f409723e = z17;
        this.f409724f = i17;
        this.f409725g = l01Var;
        this.f409726h = z18;
        this.f409727i = str;
        this.f409728m = i18;
        this.f409729n = str2;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mars.xlog.Log.i(this.f409722d.f409610f, "isReadyPluginCountDownOk collect: " + booleanValue);
        if (booleanValue) {
            pm0.v.X(new sm2.t(this.f409722d, this.f409723e, this.f409724f, this.f409725g, this.f409726h, this.f409727i, this.f409728m, this.f409729n));
        }
        return jz5.f0.f302826a;
    }
}
