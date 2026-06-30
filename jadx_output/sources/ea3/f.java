package ea3;

/* loaded from: classes10.dex */
public class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ea3.n f250610d;

    public f(ea3.n nVar) {
        this.f250610d = nVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.lang.String str;
        int i17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.lang.Object tag = view.getTag(com.tencent.mm.R.id.f485388hj1);
        int intValue = tag instanceof java.lang.Integer ? ((java.lang.Integer) tag).intValue() : -1;
        java.lang.Object tag2 = view.getTag(com.tencent.mm.R.id.hju);
        int intValue2 = tag2 instanceof java.lang.Integer ? ((java.lang.Integer) tag2).intValue() : -1;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.valueOf(intValue);
        objArr[1] = java.lang.Integer.valueOf(intValue2);
        ea3.n nVar = this.f250610d;
        objArr[2] = java.lang.Boolean.valueOf(nVar.f250642v != null);
        com.tencent.mars.xlog.Log.i("LiteAppAlbumAdapter", "onClick! postion:%d type:%d mlisten:%b", objArr);
        if (intValue != -1 && intValue2 != -1 && nVar.f250642v != null) {
            nVar.notifyItemChanged(intValue);
            ea3.p pVar = ((ea3.p$$c) nVar.f250642v).f250670a;
            pVar.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onItemClick position:%d type:%d", java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
            android.app.Activity activity = pVar.f250650f;
            if (intValue2 == 1) {
                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem z17 = pVar.f250662u.z(intValue);
                if (z17 == null || com.tencent.mm.sdk.platformtools.t8.K0(z17.f138430e)) {
                    java.lang.Object[] objArr2 = new java.lang.Object[1];
                    objArr2[0] = java.lang.Boolean.valueOf(z17 == null);
                    com.tencent.mars.xlog.Log.w("MicroMsg.LiteAppAlbumViewImpl", "item is null %s, item original path is null", objArr2);
                } else {
                    ea3.n nVar2 = pVar.f250662u;
                    if (!nVar2.f250636p || (!((i17 = pVar.B) == 2 || i17 == 3) || nVar2.B() <= 0 || ((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) pVar.f250662u.f250630g.get(0)).getType() == z17.getType() || !(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) pVar.f250662u.f250630g.get(0)).getType() == 2 || z17.getType() == 2))) {
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onMediaClick, item %s type:%d.", z17, java.lang.Integer.valueOf(z17.getType()));
                        if ("enable".equals(pVar.f250666y) && z17.getType() != 2) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "jumpAlbumPreviewUI");
                            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
                            t23.p0.k().f415297f = 44;
                            android.content.Intent intent = new android.content.Intent();
                            intent.setClassName(pVar.getContext(), "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI");
                            ea3.n nVar3 = pVar.f250662u;
                            int type = z17.getType();
                            nVar3.getClass();
                            java.util.ArrayList arrayList2 = new java.util.ArrayList();
                            java.util.Iterator it = nVar3.f250629f.iterator();
                            while (it.hasNext()) {
                                com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem galleryItem$MediaItem = (com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it.next();
                                if (type == 2) {
                                    if (galleryItem$MediaItem.getType() == type) {
                                        arrayList2.add(galleryItem$MediaItem);
                                    }
                                } else if (galleryItem$MediaItem.r()) {
                                    arrayList2.add(galleryItem$MediaItem);
                                }
                            }
                            intent.putExtra("preview_all", true);
                            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
                            t23.p0.p(arrayList2);
                            intent.putExtra("preview_position", arrayList2.indexOf(z17));
                            ea3.n nVar4 = pVar.f250662u;
                            nVar4.getClass();
                            java.util.ArrayList<java.lang.String> arrayList3 = new java.util.ArrayList<>();
                            java.util.Iterator it6 = nVar4.f250630g.iterator();
                            while (it6.hasNext()) {
                                arrayList3.add(((com.tencent.mm.plugin.gallery.model.GalleryItem$MediaItem) it6.next()).f138430e);
                            }
                            intent.putStringArrayListExtra("preview_image_list", arrayList3);
                            intent.putParcelableArrayListExtra("preview_media_item_list", pVar.f250662u.f250630g);
                            intent.putExtra("max_select_count", (z17.getType() == 2 && pVar.f250662u.f250637q) ? 1 : pVar.f250664w);
                            intent.putExtra("send_raw_img", false);
                            if (activity instanceof q80.z) {
                                ((q80.z) activity).R1(new ea3.w(pVar));
                            }
                            j45.l.n(activity, "gallery", ".ui.ImagePreviewUI", intent, 56055);
                        }
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("type", ea3.p.f(z17.getType()));
                        if (z17.getType() == 2) {
                            zg0.r3 r3Var = (zg0.r3) i95.n0.c(zg0.r3.class);
                            java.lang.String str2 = z17.f138430e;
                            ((yg0.u4) r3Var).getClass();
                            com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem b17 = com.tencent.mm.plugin.webview.model.m4.b(str2);
                            com.tencent.mm.plugin.webview.modeltools.z.Zi().a(b17);
                            str = b17.f182736e;
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId video:%s", str);
                        } else {
                            str = ((yg0.u4) ((zg0.r3) i95.n0.c(zg0.r3.class))).Ai(z17.f138430e).f182736e;
                            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "get webView localId image:%s", str);
                        }
                        hashMap.put("info", pVar.h(z17));
                        hashMap.put(dm.i4.COL_LOCALID, str);
                        java.util.HashMap hashMap2 = new java.util.HashMap();
                        hashMap2.put("targetItem", hashMap);
                        com.tencent.mm.plugin.lite.media.album.LiteAppAlbumView liteAppAlbumView = (com.tencent.mm.plugin.lite.media.album.LiteAppAlbumView) pVar.F;
                        liteAppAlbumView.getClass();
                        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onClickedItem" + hashMap2);
                        io.flutter.plugin.common.MethodChannel methodChannel = liteAppAlbumView.f144121e;
                        if (methodChannel != null) {
                            methodChannel.invokeMethod("onItemTapped", hashMap2);
                        }
                    } else {
                        db5.e1.T(pVar.getContext(), i65.a.r(pVar.getContext(), com.tencent.mm.R.string.fiq));
                    }
                }
            } else if (intValue2 == 2) {
                int i18 = pVar.B;
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "requestShowSystemSelectMediaUI: $queryType, $activity");
                java.lang.String[] strArr = i18 != 1 ? i18 != 2 ? (java.lang.String[]) new java.util.ArrayList(java.util.Arrays.asList("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO")).toArray(new java.lang.String[0]) : (java.lang.String[]) new java.util.ArrayList(java.util.Arrays.asList("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_VIDEO")).toArray(new java.lang.String[0]) : (java.lang.String[]) new java.util.ArrayList(java.util.Arrays.asList("android.permission.READ_MEDIA_VISUAL_USER_SELECTED", "android.permission.READ_MEDIA_IMAGES")).toArray(new java.lang.String[0]);
                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                j35.u.l(activity, strArr, 145);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/lite/media/album/LiteAppAlbumAdapter$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
