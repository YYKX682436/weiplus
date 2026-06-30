package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public final class s8 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.storage.s8 f195314a = new com.tencent.mm.storage.s8();

    public final void a() {
        androidx.lifecycle.c1 a17;
        com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
        com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_IMAGE_QUERY_DATA_DB_VERSION_INT;
        java.lang.Object m17 = c17.m(u3Var, 0);
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) m17).intValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(gm0.j1.u().h() + "mediaOpt/imageQuery/dbFolder/");
        sb6.append("image_query_table.db");
        java.lang.String sb7 = sb6.toString();
        f65.p.f259942i = (long) intValue;
        if (intValue != 2) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "diff sql version， delete sql file, " + intValue + ", 2");
            com.tencent.mm.vfs.w6.f(gm0.j1.u().h() + "mediaOpt/imageQuery/dbFolder/");
            f65.p.f259943j = (long) 1;
        } else {
            f65.p.f259943j = 2;
        }
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        if (((com.tencent.mm.storage.n8) a17).O6(sb7)) {
            gm0.j1.u().c().x(u3Var, 2);
        }
    }

    public final void b(java.lang.String scanPath) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(scanPath, "scanPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "deleteImageByScanPath >> ".concat(scanPath));
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        com.tencent.mm.storage.h3 h3Var = (com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClsLabelInfoStorage", "deleteClsByScanImagePath >> ".concat(scanPath));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("hd_image_path", scanPath);
        com.tencent.mm.storage.g3 g3Var = (com.tencent.mm.storage.g3) h3Var.T6(contentValues, kotlin.jvm.internal.i0.a(com.tencent.mm.storage.g3.class));
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "deleteImageByScanPath >> " + (g3Var != null ? com.tencent.mm.sdk.storage.mvvm.MvvmStorage.S6(h3Var, g3Var, false, false, 4, null) : 0));
    }

    public final boolean c(com.tencent.mm.api.QueryImageData imageData, java.lang.String chatRoomId) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(imageData, "imageData");
        kotlin.jvm.internal.o.g(chatRoomId, "chatRoomId");
        com.tencent.mm.storage.g3 g3Var = new com.tencent.mm.storage.g3();
        g3Var.field_chat_room_id = chatRoomId;
        g3Var.field_hd_image_path = imageData.f53205f;
        g3Var.field_timestamp = imageData.f53204e;
        g3Var.field_origin_image_path = imageData.f53206g;
        java.lang.String str = imageData.f53207h;
        g3Var.field_crop_label_id = str;
        g3Var.field_ocr_result = imageData.f53209m;
        g3Var.field_is_recognize = "0";
        g3Var.field_label_id = str;
        g3Var.field_msg_id = imageData.f53203d;
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        boolean U6 = com.tencent.mm.sdk.storage.mvvm.MvvmStorage.U6(((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class), g3Var, false, false, false, 14, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "insertCustomClsInfo >> " + imageData.f53206g + " result: " + U6);
        return U6;
    }

    public final java.util.ArrayList d(java.lang.String roomId, java.lang.String isRes) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(roomId, "roomId");
        kotlin.jvm.internal.o.g(isRes, "isRes");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        com.tencent.mm.storage.h3 h3Var = (com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class);
        p75.m c17 = new p75.r0("chat_room_id", roomId).c(new p75.r0("is_recognize", isRes));
        p75.i0 i17 = dm.d2.f236309p.i();
        i17.f352656c = "MicroMsg.ClsLabelInfoStorage";
        i17.f352657d = c17;
        i17.f352659f = kz5.b0.c(dm.d2.f236310q.u());
        java.util.List<com.tencent.mm.storage.g3> k17 = i17.a().k(h3Var.f193147g.Q4(), com.tencent.mm.storage.g3.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClsLabelInfoStorage", "getClsImageListByIsRec select result: " + ((java.util.ArrayList) k17).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "selectAllOldNoRecData >> " + roomId + ' ' + ((java.util.ArrayList) k17).size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.storage.g3 g3Var : k17) {
            arrayList.add(new com.tencent.mm.api.QueryImageData(g3Var.field_timestamp, g3Var.field_msg_id, g3Var.field_chat_room_id, g3Var.field_hd_image_path, g3Var.field_origin_image_path, g3Var.field_label_id, g3Var.field_crop_label_id, g3Var.field_ocr_result));
        }
        return arrayList;
    }

    public final java.util.List e(java.lang.String labelId, java.lang.String chatRoomId) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(labelId, "labelId");
        kotlin.jvm.internal.o.g(chatRoomId, "chatRoomId");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        com.tencent.mm.storage.h3 h3Var = (com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class);
        java.lang.String labelId2 = "'%#" + labelId + "#%'";
        kotlin.jvm.internal.o.g(labelId2, "labelId");
        p75.m c17 = new p75.r0("chat_room_id", chatRoomId).c(new p75.v0("label_id", labelId2));
        p75.i0 i17 = dm.d2.f236309p.i();
        i17.f352656c = "MicroMsg.ClsLabelInfoStorage";
        i17.f352657d = c17;
        java.util.List k17 = i17.a().k(h3Var.f193147g.Q4(), com.tencent.mm.storage.g3.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClsLabelInfoStorage", "select result: " + ((java.util.ArrayList) k17).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "result >> size: " + ((java.util.ArrayList) k17).size());
        return k17;
    }

    public final java.util.ArrayList f(java.lang.String roomId, int i17, int i18) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(roomId, "roomId");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        com.tencent.mm.storage.h3 h3Var = (com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class);
        p75.m c17 = new p75.r0("chat_room_id", roomId).c(new p75.w0("ocr_result", ""));
        p75.i0 i19 = dm.d2.f236309p.i();
        i19.f352656c = "MicroMsg.ClsLabelInfoStorage";
        i19.f352657d = c17;
        i19.f352659f = kz5.b0.c(dm.d2.f236310q.u());
        java.util.List<com.tencent.mm.storage.g3> k17 = i19.a().k(h3Var.f193147g.Q4(), com.tencent.mm.storage.g3.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClsLabelInfoStorage", "getClsImageListHaveOcrResult select result: " + ((java.util.ArrayList) k17).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "selectClsImageListHaveOcrResult >> " + roomId + ' ' + ((java.util.ArrayList) k17).size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.storage.g3 g3Var : k17) {
            arrayList.add(new com.tencent.mm.api.QueryImageData(g3Var.field_timestamp, g3Var.field_msg_id, g3Var.field_chat_room_id, g3Var.field_hd_image_path, g3Var.field_origin_image_path, g3Var.field_label_id, g3Var.field_crop_label_id, g3Var.field_ocr_result));
        }
        return arrayList;
    }

    public final java.util.ArrayList g(java.lang.String roomId, int i17, int i18) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(roomId, "roomId");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        java.util.List<com.tencent.mm.storage.g3> Y6 = ((com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class)).Y6(roomId, "1", i18, i17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "selectClsImageListIsRe >> " + roomId + ' ' + ((java.util.ArrayList) Y6).size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.storage.g3 g3Var : Y6) {
            arrayList.add(new com.tencent.mm.api.QueryImageData(g3Var.field_timestamp, g3Var.field_msg_id, g3Var.field_chat_room_id, g3Var.field_hd_image_path, g3Var.field_origin_image_path, g3Var.field_label_id, g3Var.field_crop_label_id, g3Var.field_ocr_result));
        }
        return arrayList;
    }

    public final java.util.ArrayList h(java.lang.String roomId) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(roomId, "roomId");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        com.tencent.mm.storage.u4 u4Var = (com.tencent.mm.storage.u4) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.u4.class);
        p75.r0 r0Var = new p75.r0("chat_room_id", roomId);
        p75.i0 i17 = dm.j2.f237743h.i();
        i17.f352657d = r0Var;
        java.util.List<com.tencent.mm.storage.t4> k17 = i17.a().k(u4Var.f193147g.Q4(), com.tencent.mm.storage.t4.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.CropCenterStorage", "getCropImagePathByRoomId >> " + roomId + " : " + ((java.util.ArrayList) k17).size());
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "selectCropCenterImage >> " + roomId + ' ' + ((java.util.ArrayList) k17).size());
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.tencent.mm.storage.t4 t4Var : k17) {
            java.lang.String field_label_id = t4Var.field_label_id;
            kotlin.jvm.internal.o.f(field_label_id, "field_label_id");
            java.lang.String field_crop_image_path = t4Var.field_crop_image_path;
            kotlin.jvm.internal.o.f(field_crop_image_path, "field_crop_image_path");
            arrayList.add(new aq.a(field_label_id, field_crop_image_path));
        }
        return arrayList;
    }

    public final com.tencent.mm.storage.j9 i(java.lang.String roomId) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(roomId, "roomId");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        com.tencent.mm.storage.k9 k9Var = (com.tencent.mm.storage.k9) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.k9.class);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", roomId);
        com.tencent.mm.storage.j9 j9Var = (com.tencent.mm.storage.j9) k9Var.T6(contentValues, kotlin.jvm.internal.i0.a(com.tencent.mm.storage.j9.class));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("history result >> json: ");
        sb6.append(j9Var != null ? j9Var.field_cluster_history_data : null);
        sb6.append(" , lastImage: ");
        sb6.append(j9Var != null ? j9Var.field_last_image_path : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", sb6.toString());
        return j9Var;
    }

    public final void j(java.lang.String chatRoomId, java.lang.String labelId, java.lang.String cropImagePath, java.lang.String originPath) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(chatRoomId, "chatRoomId");
        kotlin.jvm.internal.o.g(labelId, "labelId");
        kotlin.jvm.internal.o.g(cropImagePath, "cropImagePath");
        kotlin.jvm.internal.o.g(originPath, "originPath");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "updateCropCenterImageInfo: " + cropImagePath + " >> label id: " + labelId);
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        com.tencent.mm.storage.u4 u4Var = (com.tencent.mm.storage.u4) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.u4.class);
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", chatRoomId);
        contentValues.put("label_id", labelId);
        com.tencent.mm.storage.t4 t4Var = (com.tencent.mm.storage.t4) u4Var.T6(contentValues, kotlin.jvm.internal.i0.a(com.tencent.mm.storage.t4.class));
        if (t4Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CropCenterStorage", "update crop center label >>  room:" + chatRoomId + ", label: " + labelId);
            t4Var.field_crop_image_path = cropImagePath;
            t4Var.field_origin_image_path = originPath;
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage.W6(u4Var, t4Var, false, false, 6, null);
            return;
        }
        com.tencent.mm.storage.t4 t4Var2 = new com.tencent.mm.storage.t4();
        com.tencent.mars.xlog.Log.i("MicroMsg.CropCenterStorage", "add crop center label >>  room:" + chatRoomId + ", label: " + labelId);
        t4Var2.field_chat_room_id = chatRoomId;
        t4Var2.field_crop_image_path = cropImagePath;
        t4Var2.field_label_id = labelId;
        t4Var2.field_origin_image_path = originPath;
        com.tencent.mm.sdk.storage.mvvm.MvvmStorage.U6(u4Var, t4Var2, false, false, false, 14, null);
    }

    public final void k(com.tencent.mm.api.QueryImageData imageData, java.lang.String chatRoomId) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(imageData, "imageData");
        kotlin.jvm.internal.o.g(chatRoomId, "chatRoomId");
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "updateImageClusterLabel: " + imageData.f53206g + " >> label id: " + imageData.f53208i);
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        com.tencent.mm.storage.h3 h3Var = (com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class);
        java.lang.String str = imageData.f53206g;
        kotlin.jvm.internal.o.f(str, "getScanImagePath(...)");
        java.lang.String str2 = imageData.f53208i;
        kotlin.jvm.internal.o.f(str2, "getCropLabelId(...)");
        java.lang.String str3 = imageData.f53207h;
        kotlin.jvm.internal.o.f(str3, "getLabelId(...)");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", chatRoomId);
        contentValues.put("origin_image_path", str);
        com.tencent.mm.storage.g3 g3Var = (com.tencent.mm.storage.g3) h3Var.T6(contentValues, kotlin.jvm.internal.i0.a(com.tencent.mm.storage.g3.class));
        if (g3Var != null) {
            g3Var.field_crop_label_id = str2;
            g3Var.field_is_recognize = "1";
            g3Var.field_label_id = str3;
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage.W6(h3Var, g3Var, false, false, 6, null);
        }
    }

    public final void l(com.tencent.mm.api.QueryImageData imageData, java.lang.String chatRoomId) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(imageData, "imageData");
        kotlin.jvm.internal.o.g(chatRoomId, "chatRoomId");
        java.lang.Thread.currentThread().getName();
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(com.tencent.mm.storage.n8.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(com.tencent.mm.storage.n8.class);
        }
        com.tencent.mm.storage.h3 h3Var = (com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) a17).P6(com.tencent.mm.storage.h3.class);
        java.lang.String str = imageData.f53206g;
        kotlin.jvm.internal.o.f(str, "getScanImagePath(...)");
        java.lang.String str2 = imageData.f53207h;
        kotlin.jvm.internal.o.f(str2, "getLabelId(...)");
        java.lang.String str3 = imageData.f53209m;
        kotlin.jvm.internal.o.f(str3, "getOcrResult(...)");
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", chatRoomId);
        contentValues.put("origin_image_path", str);
        com.tencent.mm.storage.g3 g3Var = (com.tencent.mm.storage.g3) h3Var.T6(contentValues, kotlin.jvm.internal.i0.a(com.tencent.mm.storage.g3.class));
        if (g3Var != null) {
            g3Var.field_label_id = str2;
            g3Var.field_ocr_result = str3;
            g3Var.field_is_recognize = "1";
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage.W6(h3Var, g3Var, false, false, 6, null);
        }
    }
}
