package com.tencent.mm.plugin.lite.media.album;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005BE\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0018\u0010\r\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0018\u00010\n\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/tencent/mm/plugin/lite/media/album/LiteAppAlbumView;", "Lio/flutter/plugin/platform/PlatformView;", "Lio/flutter/plugin/common/MethodChannel$MethodCallHandler;", "Lio/flutter/plugin/common/PluginRegistry$RequestPermissionsResultListener;", "Landroidx/lifecycle/f;", "Lea3/z;", "Landroid/content/Context;", "context", "", dm.i4.COL_ID, "", "", "", "creationParams", "Lio/flutter/plugin/common/MethodChannel;", "channel", "Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;", "binding", "<init>", "(Landroid/content/Context;ILjava/util/Map;Lio/flutter/plugin/common/MethodChannel;Lio/flutter/embedding/engine/plugins/activity/ActivityPluginBinding;)V", "luggage-lite-app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class LiteAppAlbumView implements io.flutter.plugin.platform.PlatformView, io.flutter.plugin.common.MethodChannel.MethodCallHandler, io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener, androidx.lifecycle.f, ea3.z {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f144120d;

    /* renamed from: e, reason: collision with root package name */
    public final io.flutter.plugin.common.MethodChannel f144121e;

    /* renamed from: f, reason: collision with root package name */
    public ea3.p f144122f;

    /* renamed from: g, reason: collision with root package name */
    public final io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding f144123g;

    /* renamed from: h, reason: collision with root package name */
    public final android.app.Activity f144124h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f144125i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f144126m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f144127n;

    /* renamed from: o, reason: collision with root package name */
    public int f144128o;

    /* renamed from: p, reason: collision with root package name */
    public int f144129p;

    /* renamed from: q, reason: collision with root package name */
    public int f144130q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f144131r;

    /* renamed from: s, reason: collision with root package name */
    public int f144132s;

    /* JADX WARN: Removed duplicated region for block: B:47:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public LiteAppAlbumView(android.content.Context r3, int r4, java.util.Map<java.lang.String, ? extends java.lang.Object> r5, io.flutter.plugin.common.MethodChannel r6, io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding r7) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.lite.media.album.LiteAppAlbumView.<init>(android.content.Context, int, java.util.Map, io.flutter.plugin.common.MethodChannel, io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding):void");
    }

    public final int a(java.lang.String str) {
        if (kotlin.jvm.internal.o.b(str, "image")) {
            return 1;
        }
        return kotlin.jvm.internal.o.b(str, "video") ? 2 : 3;
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void dispose() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "dispose");
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.S);
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public android.view.View getView() {
        return this.f144120d;
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onCreate(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onCreate");
        ea3.p pVar = this.f144122f;
        if (pVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onCreate, %s.", pVar.f250650f);
        }
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onDestroy(androidx.lifecycle.y owner) {
        u23.n nVar;
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onDestroy");
        ea3.p pVar = this.f144122f;
        if (pVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onDestroy, %s.", pVar.f250650f);
            e60.z0 z0Var = pVar.D;
            if (z0Var != null && (nVar = ((t23.d) z0Var).f415132h) != null) {
                nVar.a();
            }
            ((wb0.e) ((xb0.e) i95.n0.c(xb0.e.class))).getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MMPhotoEditorImpl", "cleanAllCache: ");
            com.tencent.mm.cache.ArtistCacheManager.a().b();
            ((t23.r0) ((t23.i1) i95.n0.c(t23.i1.class))).getClass();
            java.util.HashSet i17 = t23.p0.i();
            kotlin.jvm.internal.o.f(i17, "getEditedMediaItemSet(...)");
            i17.clear();
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewAttached(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onFlutterViewAttached");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onFlutterViewDetached() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onFlutterViewDetached");
        this.f144122f = null;
        io.flutter.plugin.common.MethodChannel methodChannel = this.f144121e;
        if (methodChannel != null) {
            methodChannel.setMethodCallHandler(null);
        }
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onInputConnectionLocked() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onInputConnectionLocked");
    }

    @Override // io.flutter.plugin.platform.PlatformView
    public void onInputConnectionUnlocked() {
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onInputConnectionUnlocked");
    }

    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel.Result result) {
        java.util.ArrayList<java.lang.String> arrayList;
        java.lang.String str;
        kotlin.jvm.internal.o.g(methodCall, "methodCall");
        kotlin.jvm.internal.o.g(result, "result");
        java.lang.String str2 = methodCall.method;
        java.util.Map map = (java.util.Map) methodCall.arguments;
        if (kotlin.jvm.internal.o.b(str2, "updatePhotoAlbum")) {
            java.lang.Object obj = map != null ? map.get("albumId") : null;
            java.lang.String str3 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
            if (str3 == null) {
                str3 = "";
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "updatePhotoAlbum albumId:%s", str3);
            ea3.p pVar = this.f144122f;
            if (pVar != null) {
                java.lang.String str4 = new java.lang.String(android.util.Base64.decode(str3, 0));
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "decode String:%s", str4);
                com.tencent.mm.plugin.gallery.model.GalleryItem$AlbumItem galleryItem$AlbumItem = pVar.E;
                if (galleryItem$AlbumItem.f138418g != null) {
                    str = pVar.E.f138415d + "|" + pVar.E.f138418g;
                } else {
                    str = galleryItem$AlbumItem.f138415d;
                }
                if (str4.equals(str)) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "selectAlbum string:%s == %s", str4, pVar.E.f138415d + "|" + pVar.E.f138418g);
                    return;
                }
                java.lang.String[] split = str4.split("\\|", 2);
                java.lang.String str5 = split[0];
                java.lang.String str6 = split.length > 1 ? split[1] : "";
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "encodedID:%s selectAlbum:%s albumName:%s bucketId:%s", str3, str4, str5, str6);
                ((t23.d) pVar.D).c(str5, java.lang.Boolean.TRUE, str6);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(str2, "updateCountLimit")) {
            java.lang.Object obj2 = map != null ? map.get("countLimit") : null;
            java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
            int intValue = num != null ? num.intValue() : 9;
            this.f144132s = intValue;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "updateCountLimit countLimit:%s", java.lang.Integer.valueOf(intValue));
            ea3.p pVar2 = this.f144122f;
            if (pVar2 != null) {
                pVar2.setSelectLimitCount(this.f144132s);
                return;
            }
            return;
        }
        boolean b17 = kotlin.jvm.internal.o.b(str2, "updateType");
        java.lang.String str7 = com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_ALL;
        if (b17) {
            java.lang.Object obj3 = map != null ? map.get("type") : null;
            java.lang.String str8 = obj3 instanceof java.lang.String ? (java.lang.String) obj3 : null;
            if (str8 != null) {
                str7 = str8;
            }
            int a17 = a(str7);
            this.f144129p = a17;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "updateType type:%s", java.lang.Integer.valueOf(a17));
            ea3.p pVar3 = this.f144122f;
            if (pVar3 != null) {
                pVar3.setQueryType(this.f144129p);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(str2, "updateShowType")) {
            java.lang.Object obj4 = map != null ? map.get("showType") : null;
            java.lang.String str9 = obj4 instanceof java.lang.String ? (java.lang.String) obj4 : null;
            if (str9 != null) {
                str7 = str9;
            }
            int a18 = a(str7);
            this.f144130q = a18;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "updateShowType showType:%s", java.lang.Integer.valueOf(a18));
            ea3.p pVar4 = this.f144122f;
            if (pVar4 != null) {
                pVar4.setShowType(this.f144130q);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(str2, "updateMode")) {
            java.lang.Object obj5 = map != null ? map.get("mode") : null;
            java.lang.String str10 = obj5 instanceof java.lang.String ? (java.lang.String) obj5 : null;
            if (str10 == null) {
                str10 = "single";
            }
            this.f144125i = str10;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "updateMode mode:%s", str10);
            ea3.p pVar5 = this.f144122f;
            if (pVar5 != null) {
                pVar5.setQueryMode(this.f144125i);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(str2, "updateSelectedIds")) {
            if ((map != null ? map.get("selectedIds") : null) instanceof java.util.ArrayList) {
                java.lang.Object obj6 = map.get("selectedIds");
                arrayList = obj6 instanceof java.util.ArrayList ? (java.util.ArrayList) obj6 : null;
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList<>();
                }
            } else {
                arrayList = new java.util.ArrayList<>();
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "updateSelectedIds selectedIds:%s", arrayList);
            ea3.p pVar6 = this.f144122f;
            if (pVar6 != null) {
                pVar6.setSelectedIds(arrayList);
                return;
            }
            return;
        }
        if (kotlin.jvm.internal.o.b(str2, "updateLivePhoto")) {
            java.lang.Object obj7 = map != null ? map.get("livePhoto") : null;
            java.lang.Boolean bool = obj7 instanceof java.lang.Boolean ? (java.lang.Boolean) obj7 : null;
            boolean booleanValue = bool != null ? bool.booleanValue() : false;
            this.f144126m = booleanValue;
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "updateLivePhoto livePhoto:%b", java.lang.Boolean.valueOf(booleanValue));
            ea3.p pVar7 = this.f144122f;
            if (pVar7 != null) {
                pVar7.setLivePhoto(this.f144126m);
            }
        }
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onPause(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onPause");
        ea3.p pVar = this.f144122f;
        if (pVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "on onPause, %s.", pVar.f250650f);
        }
    }

    @Override // io.flutter.plugin.common.PluginRegistry.RequestPermissionsResultListener
    public boolean onRequestPermissionsResult(int i17, java.lang.String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.o.g(permissions, "permissions");
        kotlin.jvm.internal.o.g(grantResults, "grantResults");
        if (this.f144122f == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "liteAppAlbumViewImpl is null");
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "liteAppAlbumViewImpl onRequestPermissionsResult!");
        ea3.p pVar = this.f144122f;
        kotlin.jvm.internal.o.d(pVar);
        if (grantResults.length <= 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onRequestPermissionsResult grantResults length 0. requestCode[%d], tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
            return true;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(grantResults[0]), java.lang.Long.valueOf(java.lang.Thread.currentThread().getId()));
        if (i17 != 145) {
            return true;
        }
        if (grantResults[0] == 0) {
            pVar.e();
        } else {
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = pVar.getContext();
            ((sb0.f) jVar).getClass();
            if (zo.e.b(context)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onRequestPermissionsResult: still show part");
            } else {
                pVar.p(java.lang.Boolean.TRUE);
            }
        }
        pVar.b();
        return true;
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onResume(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onResume");
        ea3.p pVar = this.f144122f;
        if (pVar != null) {
            java.lang.Object[] objArr = new java.lang.Object[4];
            objArr[0] = pVar.f250650f;
            objArr[1] = java.lang.Boolean.valueOf(pVar.f250651g);
            tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context = pVar.getContext();
            ((sb0.f) jVar).getClass();
            objArr[2] = java.lang.Boolean.valueOf(zo.e.b(context));
            objArr[3] = java.lang.Boolean.valueOf(pVar.f250658q.getVisibility() == 0);
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onResume, %s. %b %b %b", objArr);
            tb0.j jVar2 = (tb0.j) i95.n0.c(tb0.j.class);
            android.content.Context context2 = pVar.getContext();
            ((sb0.f) jVar2).getClass();
            if (!zo.e.b(context2) && pVar.f250651g) {
                pVar.e();
                pVar.f250651g = false;
            } else if (pVar.f250658q.getVisibility() == 0) {
                pVar.e();
            }
        }
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onStart(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onStart");
        ea3.p pVar = this.f144122f;
        if (pVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onStart, %s.", pVar.f250650f);
        }
    }

    @Override // androidx.lifecycle.f, androidx.lifecycle.h
    public void onStop(androidx.lifecycle.y owner) {
        kotlin.jvm.internal.o.g(owner, "owner");
        com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumView", "onStop");
        ea3.p pVar = this.f144122f;
        if (pVar != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.LiteAppAlbumViewImpl", "onStop, %s.", pVar.f250650f);
        }
    }
}
