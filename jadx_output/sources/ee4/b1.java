package ee4;

/* loaded from: classes4.dex */
public final class b1 extends ee4.t {
    public java.lang.String A;
    public com.tencent.mm.opensdk.modelmsg.WXMediaMessage B;
    public int C;
    public m21.w D;
    public int E;
    public java.lang.String F;
    public boolean G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public kotlinx.coroutines.r2 f251677J;

    /* renamed from: n, reason: collision with root package name */
    public final fe4.b f251678n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.HashMap f251679o;

    /* renamed from: p, reason: collision with root package name */
    public int f251680p;

    /* renamed from: q, reason: collision with root package name */
    public r45.ed4 f251681q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f251682r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f251683s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f251684t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f251685u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f251686v;

    /* renamed from: w, reason: collision with root package name */
    public com.tencent.mm.modelscan.ScanCodeInfo f251687w;

    /* renamed from: x, reason: collision with root package name */
    public r45.h96 f251688x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.HashMap f251689y;

    /* renamed from: z, reason: collision with root package name */
    public java.util.HashMap f251690z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(ce4.b pcContext) {
        super(pcContext);
        kotlin.jvm.internal.o.g(pcContext, "pcContext");
        this.f251678n = new fe4.b();
        this.f251679o = new java.util.HashMap();
        this.f251682r = "";
        this.f251683s = "";
        this.f251684t = "";
        this.A = "";
        this.E = 1;
        this.F = "";
        this.I = "";
    }

    public static /* synthetic */ boolean q(ee4.b1 b1Var, java.util.ArrayList arrayList, int i17, boolean z17, boolean z18, boolean z19, int i18, java.lang.Object obj) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPreviewImageList$default", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        b1Var.p(arrayList, i17, z17, (i18 & 8) != 0 ? false : z18, (i18 & 16) != 0 ? false : z19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreviewImageList$default", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        return true;
    }

    @Override // ce4.a
    public java.util.ArrayList b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dependComponents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(l());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dependComponents", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        return arrayList;
    }

    @Override // ce4.a
    public java.lang.String d() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getTag", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        return "SnsPublish.PicModelPc";
    }

    /* JADX WARN: Removed duplicated region for block: B:70:0x04cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x04d2  */
    @Override // ce4.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 1318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ee4.b1.h(android.os.Bundle):boolean");
    }

    @Override // ce4.a
    public void i() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        super.i();
        this.f251679o.clear();
        kotlinx.coroutines.r2 r2Var = this.f251677J;
        if (r2Var != null) {
            kotlinx.coroutines.p2.a(r2Var, null, 1, null);
        }
        this.f251677J = null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onDestroy", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
    }

    public final boolean p(java.util.ArrayList paths, int i17, boolean z17, boolean z18, boolean z19) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPreviewImageList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        kotlin.jvm.internal.o.g(paths, "paths");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = paths.iterator();
        while (it.hasNext()) {
            arrayList.add(this.f251678n.c((java.lang.String) it.next(), i17, z17));
        }
        r(arrayList, z17, z18, z19);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreviewImageList", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        return true;
    }

    public final boolean r(java.util.List list, boolean z17, boolean z18, boolean z19) {
        r45.h96 h96Var;
        java.lang.String str;
        fp.n nVar;
        java.lang.String str2 = "addPreviewPublishPicItem";
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPreviewPublishPicItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        char c17 = 1;
        if (list == null || list.isEmpty()) {
            f("no image selected");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreviewPublishPicItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
            return true;
        }
        fe4.b bVar = this.f251678n;
        if (bVar.f() >= 9) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreviewPublishPicItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
            return true;
        }
        com.tencent.mm.ui.MMActivity c18 = c();
        java.util.Iterator it = list.iterator();
        boolean z27 = z17;
        while (it.hasNext()) {
            com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishBaseMultiPicItem = (com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) it.next();
            java.lang.String b17 = snsPublishBaseMultiPicItem.b();
            kotlin.jvm.internal.o.d(b17);
            if (com.tencent.mm.vfs.w6.j(b17)) {
                if (com.tencent.mm.plugin.sns.ui.ws.a() && com.tencent.mm.plugin.sns.statistics.j0.f164861a.j(b17)) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setPicSource", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem");
                    snsPublishBaseMultiPicItem.f171207e = c17 == true ? 1 : 0;
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setPicSource", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem");
                    z27 = c17 == true ? 1 : 0;
                }
                com.tencent.mm.modelscan.ScanCodeInfo scanCodeInfo = z18 ? this.f251687w : null;
                if (z19) {
                    java.util.HashMap hashMap = this.f251690z;
                    h96Var = hashMap != null ? (r45.h96) hashMap.get(b17) : this.f251688x;
                } else {
                    h96Var = null;
                }
                java.util.HashMap hashMap2 = this.f251689y;
                r45.vb1 vb1Var = hashMap2 != null ? (r45.vb1) hashMap2.get(b17) : null;
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addMedia", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
                java.lang.String b18 = snsPublishBaseMultiPicItem.b();
                kotlin.jvm.internal.o.d(b18);
                java.util.List list2 = bVar.f261563b;
                java.util.Iterator it6 = it;
                java.lang.String b19 = snsPublishBaseMultiPicItem.b();
                kotlin.jvm.internal.o.d(b19);
                ((java.util.ArrayList) list2).add(b19);
                bVar.f261562a.add(snsPublishBaseMultiPicItem);
                if (scanCodeInfo != null) {
                    str = str2;
                    com.tencent.mars.xlog.Log.i("SnsPublish.MultiPicItem", "addMedia scanCodeInfo: %s, path: %s", scanCodeInfo, b18);
                    bVar.f261565d.put(b18, scanCodeInfo);
                } else {
                    str = str2;
                }
                if (h96Var != null) {
                    com.tencent.mars.xlog.Log.i("SnsPublish.MultiPicItem", "addMedia snsMediaEcsInfo:path: %s", b18);
                    bVar.f261566e.put(b18, h96Var);
                }
                if (vb1Var != null) {
                    com.tencent.mars.xlog.Log.i("SnsPublish.MultiPicItem", "addMedia finderInfo:path: %s", b18);
                    bVar.f261567f.put(b18, vb1Var);
                }
                bVar.f261564c.put(b18, java.lang.Boolean.valueOf(snsPublishBaseMultiPicItem.c() == 1));
                com.tencent.mars.xlog.Log.i("addMedia: path:%s, filter:%b, isFromTakePicture:%b", b18, java.lang.Integer.valueOf(snsPublishBaseMultiPicItem.a()), java.lang.Integer.valueOf(snsPublishBaseMultiPicItem.c()));
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addMedia", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
                k().p(snsPublishBaseMultiPicItem);
                l().q(snsPublishBaseMultiPicItem);
                java.lang.String b27 = snsPublishBaseMultiPicItem.b();
                kotlin.jvm.internal.o.d(b27);
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("changeLatLongPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                java.util.HashMap hashMap3 = this.f251679o;
                if (hashMap3.containsKey(b17) && (nVar = (fp.n) hashMap3.get(b17)) != null) {
                }
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("changeLatLongPath", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getPreviewViewPc", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicBasePc");
                ee4.e1 e1Var = (ee4.e1) ((jz5.n) this.f251749i).getValue();
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getPreviewViewPc", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicBasePc");
                e1Var.p();
                if (c18 instanceof com.tencent.mm.plugin.sns.ui.SnsUploadUI) {
                    ((com.tencent.mm.plugin.sns.ui.SnsUploadUI) c18).q7();
                }
                n().p(snsPublishBaseMultiPicItem, z27);
                com.tencent.mm.plugin.sns.model.g6 g6Var = com.tencent.mm.plugin.sns.model.g6.f164210a;
                java.lang.String b28 = snsPublishBaseMultiPicItem.b();
                kotlin.jvm.internal.o.d(b28);
                g6Var.d(b17, b28);
                it = it6;
                str2 = str;
                c17 = 1;
            }
        }
        java.lang.String str3 = str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it7 = bVar.e().iterator();
        while (it7.hasNext()) {
            arrayList.add(((com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) it7.next()).f171209g);
        }
        nu3.e.f340198a.f(arrayList);
        f("[addPreviewPublishPicItem] add new photo");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(str3, "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        return true;
    }

    public final boolean s(java.util.List items, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPreviewPublishPicItems", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        if (items == null || items.isEmpty()) {
            e("addItemList is empty");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreviewPublishPicItems", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
            return false;
        }
        ee4.l0 k17 = k();
        k17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPublishItems", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        kotlin.jvm.internal.o.g(items, "items");
        java.util.Iterator it = items.iterator();
        while (it.hasNext()) {
            k17.p((com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) it.next());
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it6 = items.iterator();
        while (it6.hasNext()) {
            arrayList.add(((com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) it6.next()).f171209g);
        }
        nu3.e.f340198a.f(arrayList);
        k17.f("[addPublishItems] load photo from album or draft");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPublishItems", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicFileManagerPc");
        this.f251678n.a(items);
        ee4.r0 l17 = l();
        l17.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("addPublishItems", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        java.util.Iterator it7 = items.iterator();
        while (it7.hasNext()) {
            l17.q((com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem) it7.next());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPublishItems", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicLivePhotoWorkPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("addPreviewPublishPicItems", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        return true;
    }

    public final void t(java.lang.String str, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("dealOnePathLogic", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        if (i17 == -1) {
            i17 = 0;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(str);
        p(arrayList, i17, this.H, true, true);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("dealOnePathLogic", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
    }

    public final com.tencent.mm.opensdk.modelmsg.WXMediaMessage u() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMsg", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage = this.B;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMsg", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        return wXMediaMessage;
    }

    public final fe4.b v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMultiPicWrapper", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMultiPicWrapper", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        return this.f251678n;
    }

    public final void w(com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublishBaseMultiPicItem snsPublishBaseMultiPicItem, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeItem type: ");
        sb6.append(snsPublishBaseMultiPicItem.d());
        sb6.append(" imgPath: ");
        java.lang.String b17 = snsPublishBaseMultiPicItem.b();
        kotlin.jvm.internal.o.d(b17);
        sb6.append(b17);
        f(sb6.toString());
        fe4.b bVar = this.f251678n;
        bVar.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        com.tencent.mars.xlog.Log.i("SnsPublish.MultiPicItem", "removeItem >> " + snsPublishBaseMultiPicItem.b());
        bVar.f261562a.remove(snsPublishBaseMultiPicItem);
        java.util.List list = bVar.f261563b;
        java.lang.String b18 = snsPublishBaseMultiPicItem.b();
        kotlin.jvm.internal.o.d(b18);
        ((java.util.ArrayList) list).remove(b18);
        java.util.HashMap hashMap = bVar.f261565d;
        java.lang.String b19 = snsPublishBaseMultiPicItem.b();
        kotlin.jvm.internal.o.d(b19);
        hashMap.remove(b19);
        java.util.HashMap hashMap2 = bVar.f261564c;
        java.lang.String b27 = snsPublishBaseMultiPicItem.b();
        kotlin.jvm.internal.o.d(b27);
        hashMap2.remove(b27);
        java.util.HashMap hashMap3 = bVar.f261566e;
        java.lang.String b28 = snsPublishBaseMultiPicItem.b();
        kotlin.jvm.internal.o.d(b28);
        hashMap3.remove(b28);
        java.util.HashMap hashMap4 = bVar.f261567f;
        java.lang.String b29 = snsPublishBaseMultiPicItem.b();
        kotlin.jvm.internal.o.d(b29);
        hashMap4.remove(b29);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.data.SnsPublicMultiPicWrapperItem");
        if (snsPublishBaseMultiPicItem.d() == 6) {
            l().r(snsPublishBaseMultiPicItem);
        } else {
            k().q(snsPublishBaseMultiPicItem);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("removeItem", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
    }

    public final boolean x(android.os.Bundle bundle) {
        java.util.Collection collection;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        if (bundle == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
            return false;
        }
        java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("sns_media_latlong_list");
        if (stringArrayList == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
            return false;
        }
        java.util.Iterator<java.lang.String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            kotlin.jvm.internal.o.d(next);
            java.util.List g17 = new r26.t("\n").g(next, 0);
            if (!g17.isEmpty()) {
                java.util.ListIterator listIterator = g17.listIterator(g17.size());
                while (listIterator.hasPrevious()) {
                    if (!(((java.lang.String) listIterator.previous()).length() == 0)) {
                        collection = kz5.n0.K0(g17, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = kz5.p0.f313996d;
            java.lang.String[] strArr = (java.lang.String[]) collection.toArray(new java.lang.String[0]);
            if (3 != strArr.length) {
                e("invalid params");
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
                return true;
            }
            try {
                java.util.HashMap hashMap = this.f251679o;
                java.lang.String str = strArr[0];
                int length = str.length() - 1;
                int i17 = 0;
                boolean z17 = false;
                while (i17 <= length) {
                    boolean z18 = kotlin.jvm.internal.o.i(str.charAt(!z17 ? i17 : length), 32) <= 0;
                    if (z17) {
                        if (!z18) {
                            break;
                        }
                        length--;
                    } else if (z18) {
                        i17++;
                    } else {
                        z17 = true;
                    }
                }
                hashMap.put(str.subSequence(i17, length + 1).toString(), new fp.n(com.tencent.mm.sdk.platformtools.t8.F(strArr[1], 0.0d), com.tencent.mm.sdk.platformtools.t8.F(strArr[2], 0.0d), 0.0d));
            } catch (java.lang.NumberFormatException e17) {
                e(e17.toString());
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("tryGetLatLongListFromExtra", "com.tencent.mm.plugin.sns.ui.widget.multi_image.component.MultiPicModelPc");
        return true;
    }
}
