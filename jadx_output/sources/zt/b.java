package zt;

/* loaded from: classes12.dex */
public final class b extends g75.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(g75.r pipeline) {
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
        jt0.i iVar = (jt0.i) m11.b1.Di().f322738e;
        java.lang.String str = action.f324465b;
        iVar.put(str, bitmap);
        return new m70.e(str, bitmap);
    }

    @h75.a
    public j75.b handleDataFromFile(g75.z state, m70.d action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        m(state, "handleDataFromFile");
        java.lang.String str = action.f324468b;
        byte[] bArr = action.f324470d;
        return bArr != null ? new m70.a(str, bArr, action.f324469c) : new y01.d(str);
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

    @h75.a
    public j75.b handleShowImageDone(g75.z state, m70.g action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        m(state, "handleShowImageDone");
        return new g75.a0(null, 1, null);
    }

    @Override // g75.f
    public java.lang.String i() {
        return h().k("Common_ImageKey");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g75.f
    public j75.b l(g75.z state) {
        android.widget.ImageView imageView;
        android.widget.ImageView imageView2;
        kotlin.jvm.internal.o.g(state, "state");
        java.lang.String k17 = h().k("Common_ImageKey");
        java.lang.Boolean bool = (java.lang.Boolean) h().d("Common_ForceRefresh");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        d75.c cVar = (d75.c) h().d("Common_ImageViewRef");
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        kk.j jVar = m11.b1.Di().f322738e;
        if (booleanValue) {
            ((jt0.i) jVar).remove(k17);
        }
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) ((jt0.i) jVar).i(k17);
        zt.k kVar = (zt.k) state.i("key_record_params");
        zt.n nVar = zt.n.f475552a;
        s15.h hVar = kVar.f475545b;
        if (bitmap != null) {
            if (cVar != null && (imageView2 = (android.widget.ImageView) cVar.get()) != null) {
                nVar.a(hVar, bitmap, imageView2);
                imageView2.setImageBitmap(bitmap);
                imageView2.setBackgroundDrawable(null);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgImageLoaderFlowPPC", "onCreateAfter setImageBitmap From Cache " + k17);
            return new g75.a0(null, 1, null);
        }
        if (cVar != null && (imageView = (android.widget.ImageView) cVar.get()) != null) {
            nVar.a(hVar, null, imageView);
            imageView.setImageDrawable(null);
            imageView.setBackgroundResource(com.tencent.mm.R.drawable.f481147lw);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImgDownload.MsgImgImageLoaderFlowPPC", "onCreateAfter setImageBitmap From File " + k17 + " forceRefresh:" + booleanValue);
        return new m70.c(k17);
    }

    public final void m(g75.z zVar, java.lang.String str) {
        if (zVar.h("Common_StartTimestamp", 0L) > 0) {
            h().k("Common_ImageKey");
            android.os.SystemClock.elapsedRealtime();
        }
    }
}
