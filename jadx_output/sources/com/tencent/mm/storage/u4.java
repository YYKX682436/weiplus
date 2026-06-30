package com.tencent.mm.storage;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/storage/u4;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lcom/tencent/mm/storage/t4;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "compose-image-query_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class u4 extends com.tencent.mm.sdk.storage.mvvm.MvvmStorage<com.tencent.mm.storage.t4> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(n75.b dbProvider) {
        super(dbProvider);
        kotlin.jvm.internal.o.g(dbProvider, "dbProvider");
    }

    @Override // com.tencent.mm.sdk.storage.mvvm.MvvmStorage, l75.c1
    /* renamed from: O6 */
    public java.lang.String getF368356h() {
        return "MicroMsg.CropCenterStorage";
    }

    public final void X6(java.lang.String roomId) {
        kotlin.jvm.internal.o.g(roomId, "roomId");
        com.tencent.mars.xlog.Log.i("MicroMsg.CropCenterStorage", "deleteImageByRoomId >> roomId: ".concat(roomId));
        android.content.ContentValues contentValues = new android.content.ContentValues();
        contentValues.put("chat_room_id", roomId);
        com.tencent.mm.storage.t4 t4Var = (com.tencent.mm.storage.t4) T6(contentValues, kotlin.jvm.internal.i0.a(com.tencent.mm.storage.t4.class));
        if (t4Var != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.CropCenterStorage", "deleteImageByRoomId >> roomId: " + roomId + ", cropImage: " + t4Var.field_crop_image_path);
            com.tencent.mm.sdk.storage.mvvm.MvvmStorage.S6(this, t4Var, false, false, 6, null);
        }
    }
}
