package hw;

/* loaded from: classes7.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hw.o0 f285405d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f285407f;

    public n0(hw.o0 o0Var, java.lang.String str, java.lang.String str2) {
        this.f285405d = o0Var;
        this.f285406e = str;
        this.f285407f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        hw.c0 c0Var = this.f285405d.f285409e;
        if (c0Var != null) {
            cl0.g gVar = new cl0.g();
            java.lang.String frameSetName = this.f285406e;
            gVar.h("frameSetName", frameSetName);
            gVar.o("preLayoutScene", 3);
            java.lang.String gVar2 = gVar.toString();
            kotlin.jvm.internal.o.g(frameSetName, "frameSetName");
            java.lang.String data = this.f285407f;
            kotlin.jvm.internal.o.g(data, "data");
            pm0.v.X(new hw.a0(3, c0Var, frameSetName, data, gVar2));
        }
    }
}
