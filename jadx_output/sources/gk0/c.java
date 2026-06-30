package gk0;

/* loaded from: classes12.dex */
public class c extends g75.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @h75.a
    public j75.b handleConvertDataToBitmap(g75.z state, gk0.e action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        m(state, "handleConvertDataToBitmap");
        android.graphics.Bitmap bitmap = action.f272421c;
        if (bitmap == null) {
            return new g75.v(null, 1, null);
        }
        n11.a b17 = n11.a.b();
        java.lang.String str = action.f272420b;
        b17.o(str, bitmap);
        g75.a0 a0Var = new g75.a0(null, 1, null);
        g75.z zVar = a0Var.f269347b;
        zVar.l("Common_ImageKey", str);
        zVar.l("Common_Bitmap", bitmap);
        return a0Var;
    }

    @h75.a
    public j75.b handleDataFromFile(g75.z state, gk0.q action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        m(state, "handleDataFromFile");
        gk0.k kVar = (gk0.k) state.i("Common_BitmapOptions");
        java.lang.String str = action.f272448b;
        byte[] bArr = action.f272450d;
        return bArr != null ? new gk0.d(str, bArr, kVar) : new y01.b(str, action.f272449c);
    }

    @h75.a
    public j75.b handleDataFromRemote(g75.z state, y01.c action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        m(state, "handleDataFromRemote");
        gk0.k kVar = (gk0.k) state.i("Common_BitmapOptions");
        byte[] bArr = action.f458588d;
        return bArr != null ? new gk0.d(action.f458586b, bArr, kVar) : new g75.v(null, 1, null);
    }

    @Override // g75.f
    public java.lang.String i() {
        return h().k("Common_ImageKey");
    }

    @Override // g75.f
    public j75.b l(g75.z state) {
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) h().i("Common_TempFolder");
        java.lang.String k17 = h().k("Common_ImageKey");
        java.lang.Boolean bool = (java.lang.Boolean) h().d("Common_ForceRefresh");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var, k17).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        if (booleanValue) {
            n11.a.b().p(k17);
        }
        android.graphics.Bitmap e17 = n11.a.b().e(k17);
        if (e17 == null) {
            return new gk0.p(k17, o17);
        }
        g75.a0 a0Var = new g75.a0(null, 1, null);
        g75.z zVar = a0Var.f269347b;
        zVar.l("Common_ImageKey", k17);
        zVar.l("Common_Bitmap", e17);
        return a0Var;
    }

    public final void m(g75.z zVar, java.lang.String str) {
        if (zVar.h("Common_StartTimestamp", 0L) > 0) {
            h().k("Common_ImageKey");
            android.os.SystemClock.elapsedRealtime();
        }
    }
}
