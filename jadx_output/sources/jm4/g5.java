package jm4;

/* loaded from: classes9.dex */
public final class g5 implements hf0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f300385a;

    public g5(yz5.l lVar) {
        this.f300385a = lVar;
    }

    public void a(int i17, boolean z17, java.lang.String fileUrl, dn.h hVar) {
        kotlin.jvm.internal.o.g(fileUrl, "fileUrl");
        yz5.l lVar = this.f300385a;
        if (!z17) {
            if (lVar != null) {
                bw5.xo0 xo0Var = new bw5.xo0();
                xo0Var.f35212d = 99992;
                boolean[] zArr = xo0Var.f35215g;
                zArr[1] = true;
                xo0Var.f35213e = java.lang.String.valueOf(i17);
                zArr[2] = true;
                byte[] byteArray = xo0Var.toByteArray();
                kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
                lVar.invoke(byteArray);
                return;
            }
            return;
        }
        if (fileUrl.length() == 0) {
            if (lVar != null) {
                bw5.xo0 xo0Var2 = new bw5.xo0();
                xo0Var2.f35212d = 99993;
                xo0Var2.f35215g[1] = true;
                byte[] byteArray2 = xo0Var2.toByteArray();
                kotlin.jvm.internal.o.f(byteArray2, "toByteArray(...)");
                lVar.invoke(byteArray2);
                return;
            }
            return;
        }
        if (lVar != null) {
            bw5.xo0 xo0Var3 = new bw5.xo0();
            xo0Var3.f35212d = 0;
            boolean[] zArr2 = xo0Var3.f35215g;
            zArr2[1] = true;
            xo0Var3.f35214f = fileUrl;
            zArr2[3] = true;
            byte[] byteArray3 = xo0Var3.toByteArray();
            kotlin.jvm.internal.o.f(byteArray3, "toByteArray(...)");
            lVar.invoke(byteArray3);
        }
    }
}
