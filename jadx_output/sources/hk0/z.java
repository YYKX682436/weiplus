package hk0;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: i, reason: collision with root package name */
    public int f281857i;

    /* renamed from: j, reason: collision with root package name */
    public int f281858j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f281859k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f281860l;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f281849a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f281850b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f281851c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f281852d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f281853e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f281854f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashMap f281855g = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.LinkedList f281856h = new java.util.LinkedList();

    /* renamed from: m, reason: collision with root package name */
    public int f281861m = (int) com.tencent.mm.sdk.platformtools.x2.f193075e.getDimension(com.tencent.mm.R.dimen.afi);

    public final java.lang.String a(hk0.h brushType, xk0.d doodleItem) {
        kotlin.jvm.internal.o.g(brushType, "brushType");
        kotlin.jvm.internal.o.g(doodleItem, "doodleItem");
        java.lang.String str = "BRUSH_" + java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addBrushData >> type: " + brushType + ", editId: " + str);
        java.util.LinkedList linkedList = this.f281849a;
        hk0.l lVar = hk0.l.f281763d;
        linkedList.add(new hk0.k(lVar, str));
        this.f281852d.put(str, new hk0.c(lVar, brushType, doodleItem, null, 8, null));
        return str;
    }

    public final java.lang.String b(hk0.z0 mosaicType, xk0.k mosaicItem) {
        kotlin.jvm.internal.o.g(mosaicType, "mosaicType");
        kotlin.jvm.internal.o.g(mosaicItem, "mosaicItem");
        java.lang.String str = "MOSAIC_" + java.lang.System.currentTimeMillis();
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "addMosaicData >> type: " + mosaicType + ", mosaicItem: " + mosaicItem);
        java.util.LinkedList linkedList = this.f281849a;
        hk0.l lVar = hk0.l.f281764e;
        linkedList.add(new hk0.k(lVar, str));
        this.f281853e.put(str, new hk0.w0(lVar, mosaicType, mosaicItem, null, 8, null));
        return str;
    }

    public final hk0.c c(java.lang.String editId) {
        kotlin.jvm.internal.o.g(editId, "editId");
        return (hk0.c) this.f281852d.get(editId);
    }

    public final hk0.m d(java.lang.String editId) {
        kotlin.jvm.internal.o.g(editId, "editId");
        return (hk0.m) this.f281855g.get(editId);
    }

    public final hk0.w0 e(java.lang.String editId) {
        kotlin.jvm.internal.o.g(editId, "editId");
        return (hk0.w0) this.f281853e.get(editId);
    }

    public final hk0.a1 f(java.lang.String editId) {
        kotlin.jvm.internal.o.g(editId, "editId");
        return (hk0.a1) this.f281854f.get(editId);
    }

    public final hk0.n g(java.lang.String editId) {
        kotlin.jvm.internal.o.g(editId, "editId");
        if (r26.n0.B(editId, "EMOJI", false)) {
            return d(editId);
        }
        if (r26.n0.B(editId, "TEXT", false)) {
            return f(editId);
        }
        return null;
    }

    public final java.lang.String h(hk0.p handleType, xk0.p textItem, java.lang.String str) {
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(handleType, "handleType");
        kotlin.jvm.internal.o.g(textItem, "textItem");
        java.lang.String str2 = ((hk0.k) this.f281849a.getLast()).f281758b;
        hk0.a1 a1Var = (hk0.a1) this.f281854f.get(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "updateLastTextData " + handleType + ' ' + str2);
        if (a1Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImproveEditPhotoDataModel", "updateLastTextData " + str2);
            a1Var.f281693c = handleType;
            a1Var.f281698h = textItem;
            textItem.f454966x = str2;
            a1Var.f281699i = str;
            f0Var = jz5.f0.f302826a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ImproveEditPhotoDataModel", "when artist ready to update but state data is error " + str2);
        }
        return str2;
    }
}
