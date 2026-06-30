package yo4;

/* loaded from: classes10.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f464181d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f464182e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout f464183f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z23.f f464184g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f464185h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel f464186i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(kotlin.jvm.internal.h0 h0Var, int i17, com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout, z23.f fVar, java.lang.String[] strArr, com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel) {
        super(3);
        this.f464181d = h0Var;
        this.f464182e = i17;
        this.f464183f = multiVideoPluginLayout;
        this.f464184g = fVar;
        this.f464185h = strArr;
        this.f464186i = captureDataManager$CaptureVideoNormalModel;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean z17;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String str = (java.lang.String) obj2;
        boolean booleanValue2 = ((java.lang.Boolean) obj3).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("photoEditItemContainer source:");
        kotlin.jvm.internal.h0 h0Var = this.f464181d;
        sb6.append((java.lang.String) h0Var.f310123d);
        sb6.append(" ret:");
        sb6.append(booleanValue);
        sb6.append(" result:");
        sb6.append(str);
        sb6.append(" index:");
        int i17 = this.f464182e;
        sb6.append(i17);
        sb6.append(' ');
        com.tencent.mars.xlog.Log.i("MicroMsg.MultiVideoPluginLayout", sb6.toString());
        java.lang.String[] strArr = this.f464185h;
        com.tencent.mm.plugin.vlog.ui.MultiVideoPluginLayout multiVideoPluginLayout = this.f464183f;
        if (!booleanValue || str == null) {
            z17 = false;
        } else {
            bp4.k0 multiPreviewPlugin = multiVideoPluginLayout.getMultiPreviewPlugin();
            com.tencent.mm.plugin.vlog.model.u0 u0Var = multiVideoPluginLayout.G;
            java.lang.Object obj4 = u0Var.f175730d.get(i17);
            kotlin.jvm.internal.o.f(obj4, "get(...)");
            com.tencent.mm.plugin.vlog.model.y D = multiPreviewPlugin.D((java.lang.String) obj4);
            e60.h1 a17 = this.f464184g.a(str, 1, new android.graphics.Matrix(D.f175784a), new android.graphics.Rect(D.f175785b), new android.graphics.Rect(D.f175787d), new android.graphics.Rect(D.f175786c));
            android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0(a17.f249708b);
            java.lang.Object obj5 = u0Var.f175730d.get(i17);
            kotlin.jvm.internal.o.f(obj5, "get(...)");
            android.graphics.Bitmap G = multiVideoPluginLayout.f175875r.G((java.lang.String) obj5, i65.a.B(multiVideoPluginLayout.getContext()));
            if (G != null) {
                i07 = com.tencent.mm.sdk.platformtools.x.e(i07, G, multiVideoPluginLayout.getMultiPreviewPlugin().f23211g.getVisibilityRect());
            }
            android.graphics.Bitmap bitmap = i07;
            dq4.c cVar = dq4.c.f242369a;
            int i18 = multiVideoPluginLayout.f175871p;
            kotlin.jvm.internal.o.d(bitmap);
            cVar.e(0L, i18, bitmap, a17.f249708b);
            cVar.d(str, a17.f249708b);
            z17 = false;
            strArr[i17] = com.tencent.mm.vfs.w6.i(a17.f249708b, false);
            if (booleanValue2 || G != null) {
                dw3.c0.f244182a.r(a17.f249708b);
            }
        }
        int size = multiVideoPluginLayout.G.f175730d.size() - 1;
        com.tencent.mm.plugin.recordvideo.jumper.CaptureDataManager$CaptureVideoNormalModel captureDataManager$CaptureVideoNormalModel = this.f464186i;
        if (i17 >= size) {
            ct0.b bVar = multiVideoPluginLayout.F;
            if ((bVar == null || !bVar.f222206c) ? z17 : true) {
                dw3.c0.f244182a.j(bVar != null ? bVar.f222213j : null);
            }
            captureDataManager$CaptureVideoNormalModel.f155666m.addAll(kz5.z.z0(strArr));
            ut3.f.f431176c.a(multiVideoPluginLayout.getContext(), captureDataManager$CaptureVideoNormalModel);
        } else {
            com.tencent.mm.cache.ArtistCacheManager.a().g((java.lang.String) h0Var.f310123d);
            multiVideoPluginLayout.z(this.f464184g, strArr, captureDataManager$CaptureVideoNormalModel, i17 + 1);
        }
        return jz5.f0.f302826a;
    }
}
