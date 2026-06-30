package si0;

/* loaded from: classes13.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f408140d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ si0.v f408141e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f408142f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f408143g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f408144h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f408145i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(si0.v vVar, kotlin.jvm.internal.h0 h0Var, kotlin.jvm.internal.h0 h0Var2, kotlin.jvm.internal.h0 h0Var3, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f408141e = vVar;
        this.f408142f = h0Var;
        this.f408143g = h0Var2;
        this.f408144h = h0Var3;
        this.f408145i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new si0.o(this.f408141e, this.f408142f, this.f408143g, this.f408144h, this.f408145i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((si0.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        com.tencent.mm.rfx.RfxPagLayer[] layersByName;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f408140d;
        si0.v vVar = this.f408141e;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.r2 r2Var = vVar.f408199v;
            if (r2Var != null) {
                this.f408140d = 1;
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
        io.flutter.Log.i(vVar.f408181d, vVar + ", flush");
        java.util.Iterator it = ((java.lang.Iterable) this.f408142f.f310123d).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            com.tencent.mm.rfx.RfxPagFile rfxPagFile = vVar.f408184g;
            if (rfxPagFile != null && (layersByName = rfxPagFile.getLayersByName((java.lang.String) lVar.f302833d)) != null) {
                for (com.tencent.mm.rfx.RfxPagLayer rfxPagLayer : layersByName) {
                    if (rfxPagLayer instanceof com.tencent.mm.rfx.RfxPagSolidLayer) {
                        ((com.tencent.mm.rfx.RfxPagSolidLayer) rfxPagLayer).setSolidColor(((java.lang.Number) lVar.f302834e).intValue());
                    }
                }
            }
        }
        for (jz5.l lVar2 : (java.lang.Iterable) this.f408143g.f310123d) {
            com.tencent.mm.rfx.RfxPagFile rfxPagFile2 = vVar.f408184g;
            if (rfxPagFile2 != null) {
                int intValue = ((java.lang.Number) lVar2.f302833d).intValue();
                java.lang.String filePath = (java.lang.String) lVar2.f302834e;
                kotlin.jvm.internal.o.g(filePath, "filePath");
                android.util.LruCache lruCache = vVar.f408182e;
                android.graphics.Bitmap bitmap = (android.graphics.Bitmap) lruCache.get(filePath);
                if (bitmap == null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(filePath);
                    java.lang.Object obj2 = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/flutter/plugin/FlutterPAGViewController", "getBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    bitmap = android.graphics.BitmapFactory.decodeFile((java.lang.String) arrayList.get(0));
                    yj0.a.e(obj2, bitmap, "com/tencent/mm/flutter/plugin/FlutterPAGViewController", "getBitmap", "(Ljava/lang/String;)Landroid/graphics/Bitmap;", "android/graphics/BitmapFactory_EXEC_", "decodeFile", "(Ljava/lang/String;)Landroid/graphics/Bitmap;");
                    if (bitmap != null) {
                        lruCache.put(filePath, bitmap);
                    }
                }
                rfxPagFile2.replaceImage(intValue, com.tencent.mm.rfx.RfxPagImage.FromBitmap(bitmap));
            }
        }
        for (jz5.l lVar3 : (java.lang.Iterable) this.f408144h.f310123d) {
            com.tencent.mm.rfx.RfxPagFile rfxPagFile3 = vVar.f408184g;
            com.tencent.mm.rfx.RfxPagText textData = rfxPagFile3 != null ? rfxPagFile3.getTextData(((java.lang.Number) lVar3.f302833d).intValue()) : null;
            if (textData != null) {
                textData.text = ((com.tencent.pigeon.flutter_pag.FlutterPAGText) lVar3.f302834e).getText();
                com.tencent.mm.rfx.RfxPagFile rfxPagFile4 = vVar.f408184g;
                if (rfxPagFile4 != null) {
                    rfxPagFile4.replaceText(((java.lang.Number) lVar3.f302833d).intValue(), textData);
                }
            }
        }
        if (!vVar.f408192o.isRunning()) {
            com.tencent.mm.rfx.RfxPagPlayer rfxPagPlayer = vVar.f408183f;
            if (rfxPagPlayer != null) {
                rfxPagPlayer.setProgress(vVar.f408190m);
            }
            com.tencent.mm.rfx.RfxPagPlayer rfxPagPlayer2 = vVar.f408183f;
            if (rfxPagPlayer2 != null) {
                rfxPagPlayer2.flush();
            }
        }
        io.flutter.view.TextureRegistry.SurfaceProducer surfaceProducer = vVar.f408187j;
        this.f408145i.invoke(new java.lang.Long(surfaceProducer != null ? surfaceProducer.id() : 0L));
        io.flutter.Log.i(vVar.f408181d, vVar + ", flush end");
        return jz5.f0.f302826a;
    }
}
