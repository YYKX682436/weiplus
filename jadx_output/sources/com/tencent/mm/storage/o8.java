package com.tencent.mm.storage;

/* loaded from: classes4.dex */
public final class o8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f195205d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f195206e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o8(long j17, java.lang.String str, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f195205d = j17;
        this.f195206e = str;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.storage.o8(this.f195205d, this.f195206e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.storage.o8 o8Var = (com.tencent.mm.storage.o8) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        o8Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        jm0.i iVar = jm0.k.f300269h;
        com.tencent.mm.storage.h3 h3Var = (com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) iVar.a(com.tencent.mm.storage.n8.class)).P6(com.tencent.mm.storage.h3.class);
        java.lang.String roomId = this.f195206e;
        kotlin.jvm.internal.o.g(roomId, "roomId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteImageByMsgIdAndRoomId >> msgId: ");
        long j17 = this.f195205d;
        sb6.append(j17);
        sb6.append(", roomId: ");
        sb6.append(roomId);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClsLabelInfoStorage", sb6.toString());
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", roomId);
        contentValues.put("msg_id", java.lang.Long.valueOf(j17));
        com.tencent.mm.storage.g3 g3Var = (com.tencent.mm.storage.g3) h3Var.T6(contentValues, kotlin.jvm.internal.i0.a(com.tencent.mm.storage.g3.class));
        if (g3Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ClsLabelInfoStorage", "deleteImageByMsgIdAndRoomId, find to delete >> msgId: " + j17 + ", scanImage path: " + g3Var.field_origin_image_path);
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage.S6(h3Var, g3Var, false, false, 4, null);
            str = g3Var.field_origin_image_path;
        } else {
            str = null;
        }
        if (str != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "deleteImage find it>> msgId: " + j17 + ", scanImagePath: " + str);
            com.tencent.mm.storage.k9 k9Var = (com.tencent.mm.storage.k9) ((com.tencent.mm.storage.n8) iVar.a(com.tencent.mm.storage.n8.class)).P6(com.tencent.mm.storage.k9.class);
            android.content.ContentValues contentValues2 = new android.content.ContentValues();
            contentValues2.put("chat_room_id", roomId);
            com.tencent.mm.storage.j9 j9Var = (com.tencent.mm.storage.j9) k9Var.T6(contentValues2, kotlin.jvm.internal.i0.a(com.tencent.mm.storage.j9.class));
            if (j9Var != null && kotlin.jvm.internal.o.b(j9Var.field_last_image_path, str)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryStorage", "delete image is the last image");
                java.util.ArrayList arrayList = (java.util.ArrayList) ((com.tencent.mm.storage.h3) ((com.tencent.mm.storage.n8) iVar.a(com.tencent.mm.storage.n8.class)).P6(com.tencent.mm.storage.h3.class)).Y6(roomId, "1", 0, 1);
                if (!arrayList.isEmpty()) {
                    com.tencent.mm.storage.k9 k9Var2 = (com.tencent.mm.storage.k9) ((com.tencent.mm.storage.n8) iVar.a(com.tencent.mm.storage.n8.class)).P6(com.tencent.mm.storage.k9.class);
                    java.lang.String field_origin_image_path = ((com.tencent.mm.storage.g3) arrayList.get(0)).field_origin_image_path;
                    kotlin.jvm.internal.o.f(field_origin_image_path, "field_origin_image_path");
                    android.content.ContentValues contentValues3 = new android.content.ContentValues();
                    contentValues3.put("chat_room_id", roomId);
                    com.tencent.mm.storage.j9 j9Var2 = (com.tencent.mm.storage.j9) k9Var2.T6(contentValues3, kotlin.jvm.internal.i0.a(com.tencent.mm.storage.j9.class));
                    if (j9Var2 != null) {
                        j9Var2.field_last_image_path = field_origin_image_path;
                        com.tencent.mm.sdk.storage.mvvm.MvvmStorage.W6(k9Var2, j9Var2, false, false, 6, null);
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
