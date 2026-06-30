package com.tencent.mm.zoomimage.subsampling.internal;

/* loaded from: classes11.dex */
public final class k1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f214976d;

    /* renamed from: e, reason: collision with root package name */
    public int f214977e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f214978f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.zoomimage.subsampling.internal.v1 f214979g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yq5.m f214980h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var, yq5.m mVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f214979g = v1Var;
        this.f214980h = mVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.zoomimage.subsampling.internal.k1 k1Var = new com.tencent.mm.zoomimage.subsampling.internal.k1(this.f214979g, this.f214980h, continuation);
        k1Var.f214978f = obj;
        return k1Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.zoomimage.subsampling.internal.k1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        kotlinx.coroutines.y0 y0Var;
        java.lang.Object g17;
        java.lang.String key;
        yq5.p pVar;
        int i17;
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        int i18 = this.f214977e;
        com.tencent.mm.zoomimage.subsampling.internal.v1 v1Var = this.f214979g;
        yq5.m mVar = this.f214980h;
        if (i18 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            y0Var = (kotlinx.coroutines.y0) this.f214978f;
            java.lang.String key2 = "tile_" + ((yq5.e) v1Var.f215124b.f464600a).f464596b + "_rect=" + zq5.f.b(mVar.f464607b) + "_sampleSize=" + mVar.f464608c;
            v1Var.f215126d.getClass();
            kotlin.jvm.internal.o.g(key2, "key");
            mVar.a();
            mVar.f464612g = 1;
            v1Var.d("loadTile:loading");
            com.tencent.mm.zoomimage.subsampling.internal.j1 j1Var = new com.tencent.mm.zoomimage.subsampling.internal.j1(v1Var, mVar, null);
            this.f214978f = y0Var;
            this.f214976d = key2;
            this.f214977e = 2;
            g17 = kotlinx.coroutines.l.g(v1Var.f215133k, j1Var, this);
            if (g17 == aVar) {
                return aVar;
            }
            key = key2;
        } else {
            if (i18 == 1) {
                yq5.p pVar2 = (yq5.p) this.f214978f;
                kotlin.ResultKt.throwOnFailure(obj);
                yq5.p pVar3 = (yq5.p) obj;
                if (pVar3 != null) {
                    pVar2 = pVar3;
                }
                mVar.b(pVar2, 1, true);
                mVar.f464612g = 2;
                v1Var.f215123a.d(new com.tencent.mm.zoomimage.subsampling.internal.g1(mVar, v1Var));
                v1Var.d("loadTile:fromMemory");
                return jz5.f0.f302826a;
            }
            if (i18 != 2) {
                if (i18 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                pVar = (yq5.p) this.f214978f;
                kotlin.ResultKt.throwOnFailure(obj);
                yq5.p pVar4 = (yq5.p) obj;
                if (pVar4 != null) {
                    i17 = 2;
                    z17 = true;
                    mVar.b(pVar4, i17, z17);
                    mVar.f464612g = i17;
                    v1Var.f215123a.d(new com.tencent.mm.zoomimage.subsampling.internal.h1(mVar, v1Var));
                    v1Var.d("loadTile:successful");
                    return jz5.f0.f302826a;
                }
                pVar4 = pVar;
                i17 = 2;
                z17 = true;
                mVar.b(pVar4, i17, z17);
                mVar.f464612g = i17;
                v1Var.f215123a.d(new com.tencent.mm.zoomimage.subsampling.internal.h1(mVar, v1Var));
                v1Var.d("loadTile:successful");
                return jz5.f0.f302826a;
            }
            key = (java.lang.String) this.f214976d;
            y0Var = (kotlinx.coroutines.y0) this.f214978f;
            kotlin.ResultKt.throwOnFailure(obj);
            g17 = obj;
        }
        java.lang.Object value = ((kotlin.Result) g17).getValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) (kotlin.Result.m527isFailureimpl(value) ? null : value);
        if (kotlin.Result.m527isFailureimpl(value)) {
            mVar.a();
            mVar.f464612g = 3;
            zq5.k kVar = v1Var.f215123a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("TileManager. loadTile. failed, ");
            java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(value);
            sb6.append(m524exceptionOrNullimpl != null ? m524exceptionOrNullimpl.getMessage() : null);
            sb6.append(". ");
            sb6.append(mVar);
            sb6.append(". '");
            sb6.append(v1Var.f215124b.a());
            sb6.append('\'');
            java.lang.String msg = sb6.toString();
            kVar.getClass();
            kotlin.jvm.internal.o.g(msg, "msg");
            kVar.b(zq5.i.f475072h, msg);
            v1Var.d("loadTile:failed");
        } else if (bitmap == null) {
            mVar.a();
            mVar.f464612g = 3;
            zq5.k kVar2 = v1Var.f215123a;
            java.lang.String msg2 = "TileManager. loadTile. failed, bitmap null. " + mVar + ". '" + v1Var.f215124b.a() + '\'';
            kVar2.getClass();
            kotlin.jvm.internal.o.g(msg2, "msg");
            kVar2.b(zq5.i.f475072h, msg2);
            v1Var.d("loadTile:failed");
        } else {
            if (mVar.f464608c == 1) {
                zq5.e eVar = mVar.f464607b;
                if (eVar.f475063c - eVar.f475061a != bitmap.getWidth() || eVar.f475064d - eVar.f475062b != bitmap.getHeight()) {
                    mVar.a();
                    mVar.f464612g = 3;
                    zq5.k kVar3 = v1Var.f215123a;
                    java.lang.String msg3 = "TileManager. loadTile. failed, size is different. " + mVar + ". " + bitmap + ". '" + v1Var.f215124b.a() + '\'';
                    kVar3.getClass();
                    kotlin.jvm.internal.o.g(msg3, "msg");
                    kVar3.b(zq5.i.f475072h, msg3);
                    bitmap.recycle();
                    v1Var.d("loadTile:failed");
                }
            }
            if (kotlinx.coroutines.z0.h(y0Var)) {
                yq5.a aVar2 = new yq5.a(bitmap);
                com.tencent.mm.zoomimage.subsampling.internal.w0 w0Var = v1Var.f215126d;
                java.lang.String imageUrl = ((yq5.e) v1Var.f215124b.f464600a).f464596b;
                w0Var.getClass();
                kotlin.jvm.internal.o.g(key, "key");
                kotlin.jvm.internal.o.g(imageUrl, "imageUrl");
                yq5.c imageInfo = v1Var.f215127e;
                kotlin.jvm.internal.o.g(imageInfo, "imageInfo");
                pVar = aVar2;
                pVar4 = pVar;
                i17 = 2;
                z17 = true;
                mVar.b(pVar4, i17, z17);
                mVar.f464612g = i17;
                v1Var.f215123a.d(new com.tencent.mm.zoomimage.subsampling.internal.h1(mVar, v1Var));
                v1Var.d("loadTile:successful");
            } else {
                v1Var.f215123a.a(new com.tencent.mm.zoomimage.subsampling.internal.i1(bitmap, mVar, v1Var));
                mVar.a();
                mVar.f464612g = 3;
                bitmap.recycle();
                v1Var.d("loadTile:canceled");
            }
        }
        return jz5.f0.f302826a;
    }
}
