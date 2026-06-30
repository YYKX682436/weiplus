package si0;

/* loaded from: classes13.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f408060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.l0 f408061e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f408062f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f408063g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f408064h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f408065i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(si0.l0 l0Var, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408061e = l0Var;
        this.f408062f = h0Var;
        this.f408063g = h0Var2;
        this.f408064h = h0Var3;
        this.f408065i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.e0(this.f408061e, this.f408062f, this.f408063g, this.f408064h, this.f408065i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.e0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        org.libpag.PAGLayer[] layersByName;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f408060d;
        si0.l0 l0Var = this.f408061e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = l0Var.f408119v;
            if (r2Var != null) {
                this.f408060d = 1;
                if (((kotlinx.coroutines.c3) r2Var).C(this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        io.flutter.Log.i(l0Var.f408101d, l0Var + ", flush");
        java.util.Iterator it = ((java.lang.Iterable) this.f408062f.f310123d).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            org.libpag.PAGFile pAGFile = l0Var.f408104g;
            if (pAGFile != null && (layersByName = pAGFile.getLayersByName((java.lang.String) lVar.f302833d)) != null) {
                for (org.libpag.PAGLayer pAGLayer : layersByName) {
                    if (pAGLayer instanceof org.libpag.PAGSolidLayer) {
                        ((org.libpag.PAGSolidLayer) pAGLayer).setSolidColor(((java.lang.Number) lVar.f302834e).intValue());
                    }
                }
            }
        }
        for (jz5.l lVar2 : (java.lang.Iterable) this.f408063g.f310123d) {
            org.libpag.PAGFile pAGFile2 = l0Var.f408104g;
            if (pAGFile2 != null) {
                int intValue = ((java.lang.Number) lVar2.f302833d).intValue();
                java.lang.String filePath = (java.lang.String) lVar2.f302834e;
                kotlin.jvm.internal.o.g(filePath, "filePath");
                android.util.LruCache lruCache = l0Var.f408102e;
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) lruCache.get(filePath);
                if (bitmap == null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(filePath);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/flutter/plugin/FlutterPAGViewControllerOrigin", "getBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                    yj0.a.e(obj2, bitmap, "com/tencent/mm/flutter/plugin/FlutterPAGViewControllerOrigin", "getBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    if (bitmap != null) {
                        lruCache.put(filePath, bitmap);
                    }
                }
                pAGFile2.replaceImage(intValue, org.libpag.PAGImage.FromBitmap(bitmap));
            }
        }
        for (jz5.l lVar3 : (java.lang.Iterable) this.f408064h.f310123d) {
            org.libpag.PAGFile pAGFile3 = l0Var.f408104g;
            org.libpag.PAGText textData = pAGFile3 != null ? pAGFile3.getTextData(((java.lang.Number) lVar3.f302833d).intValue()) : null;
            if (textData != null) {
                textData.text = ((com.tencent.pigeon.flutter_pag.FlutterPAGText) lVar3.f302834e).getText();
                org.libpag.PAGFile pAGFile4 = l0Var.f408104g;
                if (pAGFile4 != null) {
                    pAGFile4.replaceText(((java.lang.Number) lVar3.f302833d).intValue(), textData);
                }
            }
        }
        if (!l0Var.f408112o.isRunning()) {
            org.libpag.PAGPlayer pAGPlayer = l0Var.f408103f;
            if (pAGPlayer != null) {
                pAGPlayer.setProgress(l0Var.f408110m);
            }
            org.libpag.PAGPlayer pAGPlayer2 = l0Var.f408103f;
            if (pAGPlayer2 != null) {
                pAGPlayer2.flush();
            }
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = l0Var.f408107j;
        this.f408065i.invoke(new java.lang.Long(surfaceProducer != null ? surfaceProducer.id() : 0L));
        io.flutter.Log.i(l0Var.f408101d, l0Var + ", flush end");
        return jz5.f0.f302826a;
    }
}
