package y70;

/* loaded from: classes12.dex */
public final class m extends g75.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @h75.a
    public j75.b handleConvertDataToBitmap(g75.z state, m70.b action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        m(state, "handleConvertDataToBitmap");
        android.graphics.Bitmap bitmap = action.f324466c;
        if (bitmap == null) {
            return new g75.v(null, 1, null);
        }
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        ((jt0.i) m11.b1.Di().f322738e).put(action.f324465b, bitmap);
        g75.z zVar = new g75.z();
        zVar.l("Common_Bitmap", zVar);
        return new g75.a0(zVar);
    }

    @h75.a
    public j75.b handleDataFromFile(g75.z state, m70.d action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        m(state, "handleDataFromFile");
        java.lang.String str = action.f324468b;
        byte[] bArr = action.f324470d;
        if (bArr != null) {
            return new m70.a(str, bArr, action.f324469c);
        }
        return !((((oi3.f) state.i("key_msg_info")).j() & 1) > 0) ? new y01.d(str) : new g75.v(null, 1, null);
    }

    @h75.a
    public j75.b handleDataFromRemote(g75.z state, y01.e action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        m(state, "handleDataFromRemote");
        byte[] bArr = action.f458591c;
        if (bArr == null) {
            return new g75.v(null, 1, null);
        }
        return new m70.a(action.f458590b, bArr, m70.h.f324477f);
    }

    @Override // g75.f
    public java.lang.String i() {
        return h().k("Common_ImageKey");
    }

    @Override // g75.f
    public j75.b l(g75.z state) {
        kotlin.jvm.internal.o.g(state, "state");
        java.lang.String k17 = h().k("Common_ImageKey");
        java.lang.Boolean bool = (java.lang.Boolean) h().d("Common_ForceRefresh");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        kk.j jVar = m11.b1.Di().f322738e;
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageLoader.MsgImgLoadThumbFlowPPC", "onCreateAfter " + k17 + " forceRefresh:" + booleanValue);
        if (booleanValue) {
            ((jt0.i) jVar).remove(k17);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).i(k17);
        if (bitmap == null) {
            return new m70.c(k17);
        }
        g75.z zVar = new g75.z();
        zVar.l("Common_Bitmap", bitmap);
        return new g75.a0(zVar);
    }

    public final void m(g75.z zVar, java.lang.String str) {
        if (zVar.h("Common_StartTimestamp", 0L) > 0) {
            h().k("Common_ImageKey");
            android.os.SystemClock.elapsedRealtime();
        }
    }
}
