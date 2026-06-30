package lx;

/* loaded from: classes7.dex */
public final class b2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f321695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qc0.m1 f321696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lx.i2 f321697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321698g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(qc0.m1 m1Var, lx.i2 i2Var, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f321696e = m1Var;
        this.f321697f = i2Var;
        this.f321698g = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new lx.b2(this.f321696e, this.f321697f, this.f321698g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((lx.b2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f321695d;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (i17 != 0) {
            if (i17 == 1) {
                kotlin.ResultKt.throwOnFailure(obj);
            }
            if (i17 == 2) {
                kotlin.ResultKt.throwOnFailure(obj);
            }
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.ResultKt.throwOnFailure(obj);
        java.util.List list = this.f321696e.f361413d;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            for (java.lang.Object obj2 : list) {
                qc0.l1 l1Var = (qc0.l1) obj2;
                if (!com.tencent.mm.sdk.platformtools.t8.K0(l1Var.f361396b) && com.tencent.mm.vfs.w6.j(l1Var.f361396b)) {
                    arrayList.add(obj2);
                }
            }
        } else {
            arrayList = null;
        }
        boolean z17 = arrayList == null || arrayList.isEmpty();
        yz5.l lVar = this.f321698g;
        lx.i2 i2Var = this.f321697f;
        if (z17) {
            lx.i2.a(i2Var);
            com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "chooseMediaFromCamera: user cancelled or no result");
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            lx.z1 z1Var = new lx.z1(lVar, null);
            this.f321695d = 1;
            return kotlinx.coroutines.l.g(g3Var, z1Var, this) == aVar ? aVar : f0Var;
        }
        java.lang.String str = ((qc0.l1) arrayList.get(0)).f361396b;
        kotlin.jvm.internal.o.d(str);
        java.lang.String str2 = zw.a.f476486b;
        if (!com.tencent.mm.vfs.w6.j(str2)) {
            com.tencent.mm.vfs.w6.u(str2);
        }
        zw.v vVar = zw.v.f476543a;
        java.lang.String b17 = vVar.b(str);
        java.lang.String c17 = vVar.c(b17);
        java.lang.String str3 = zw.v.f476546d + c17;
        vVar.a(str, c17);
        if (!com.tencent.mm.vfs.w6.j(str3)) {
            str3 = str;
        }
        i2Var.getClass();
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.tencent.mm.graphics.e.d(str3, options);
        android.graphics.Point point = new android.graphics.Point(options.outWidth, options.outHeight);
        java.lang.String b18 = q75.g.b(s46.c.c(r26.n0.u0(str3).toString()));
        com.tencent.mm.compatible.util.Exif fromFile = com.tencent.mm.compatible.util.Exif.fromFile(str);
        com.tencent.pigeon.biz.BizSelectPhotoInfo bizSelectPhotoInfo = new com.tencent.pigeon.biz.BizSelectPhotoInfo(b17.concat("_camera"), new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.z7.a(str3)).o(), null, new java.lang.Long(point.x), new java.lang.Long(point.y), new com.tencent.pigeon.biz.BizPhotoExtInfo(fromFile != null ? new java.lang.Double(fromFile.latitude) : null, fromFile != null ? new java.lang.Double(fromFile.longitude) : null, null, null, null, null, null, null, null, null, null, 2044, null), b18, 4, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.FlutterBizMediaPlugin", "chooseMediaFromCamera success: path=" + bizSelectPhotoInfo.getPath());
        kotlinx.coroutines.p0 p0Var2 = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.g3 g3Var2 = kotlinx.coroutines.internal.b0.f310484a;
        lx.a2 a2Var = new lx.a2(lVar, bizSelectPhotoInfo, null);
        this.f321695d = 2;
        return kotlinx.coroutines.l.g(g3Var2, a2Var, this) == aVar ? aVar : f0Var;
    }
}
