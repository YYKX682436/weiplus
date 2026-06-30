package gk0;

/* loaded from: classes12.dex */
public class l extends g75.f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g75.r pipeline) {
        super(pipeline);
        kotlin.jvm.internal.o.g(pipeline, "pipeline");
    }

    @h75.a
    public j75.b handleConvertDataToBitmap(g75.z state, gk0.e action) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(action, "action");
        m(state, "handleConvertDataToBitmap");
        d75.c cVar = (d75.c) state.i("Common_ImageViewRef");
        android.graphics.Bitmap bitmap = action.f272421c;
        if (bitmap == null) {
            return new g75.v(null, 1, null);
        }
        n11.a b17 = n11.a.b();
        java.lang.String str = action.f272420b;
        b17.o(str, bitmap);
        return new gk0.s(str, bitmap, cVar);
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

    @h75.a
    public j75.b handleShowImageDone(g75.z state, gk0.t action) {
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
        kotlin.jvm.internal.o.g(state, "state");
        com.tencent.mm.vfs.r6 r6Var = (com.tencent.mm.vfs.r6) h().i("Common_TempFolder");
        java.lang.String k17 = h().k("Common_ImageKey");
        gk0.k kVar = (gk0.k) h().i("Common_BitmapOptions");
        d75.c cVar = (d75.c) h().i("Common_ImageViewRef");
        java.lang.Boolean bool = (java.lang.Boolean) h().d("Common_ForceRefresh");
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        java.lang.String o17 = new com.tencent.mm.vfs.r6(r6Var, k17).o();
        kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
        if (booleanValue) {
            n11.a.b().p(k17);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) cVar.get();
        if (imageView2 != null) {
            imageView2.setTag(com.tencent.mm.R.id.h9z, k17);
        }
        android.graphics.Bitmap e17 = n11.a.b().e(k17);
        if (e17 != null) {
            android.widget.ImageView imageView3 = (android.widget.ImageView) cVar.get();
            if (imageView3 != null) {
                imageView3.setImageBitmap(e17);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageLoader.CommonImageLoaderFlowPPC", "onCreateAfter setImageBitmap From Cache ".concat(k17));
            return new g75.a0(null, 1, null);
        }
        if (kVar.f272434e != 0) {
            android.widget.ImageView imageView4 = (android.widget.ImageView) cVar.get();
            if (imageView4 != null) {
                imageView4.setImageResource(kVar.f272434e);
            }
        } else if (kVar.f272435f != null) {
            android.widget.ImageView imageView5 = (android.widget.ImageView) cVar.get();
            if (imageView5 != null) {
                imageView5.setImageBitmap(kVar.f272435f);
            }
        } else if (kVar.f272436g != null && (imageView = (android.widget.ImageView) cVar.get()) != null) {
            imageView.setImageDrawable(kVar.f272436g);
        }
        return new gk0.p(k17, o17);
    }

    public final void m(g75.z state, java.lang.String prefix) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(prefix, "prefix");
        if (state.h("Common_StartTimestamp", 0L) > 0) {
            h().k("Common_ImageKey");
            android.os.SystemClock.elapsedRealtime();
        }
    }
}
