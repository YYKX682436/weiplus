package com.tencent.mm.storage;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/storage/h3;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lcom/tencent/mm/storage/g3;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "compose-image-query_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class h3 extends com.tencent.mm.sdk.storage.mvvm.MvvmStorage<com.tencent.mm.storage.g3> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(n75.b dbProvider) {
        super(dbProvider);
        kotlin.jvm.internal.o.g(dbProvider, "dbProvider");
    }

    @Override // com.tencent.mm.sdk.storage.mvvm.MvvmStorage, l75.c1
    /* renamed from: O6 */
    public java.lang.String getF368356h() {
        return "MicroMsg.ClsLabelInfoStorage";
    }

    public final void X6(java.lang.String roomId) {
        kotlin.jvm.internal.o.g(roomId, "roomId");
        com.tencent.mars.xlog.Log.i("MicroMsg.ClsLabelInfoStorage", "deleteClsByRoomId >> roomId: ".concat(roomId));
        p75.p pVar = p75.p.f352680e;
        p75.n0 n0Var = dm.d2.f236309p;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        int f17 = new p75.i(n0Var.b(), "chat_room_id " + pVar + " ?", new java.lang.String[]{roomId}).f(this.f193147g.Q4());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteClsByRoomId >> result: ");
        sb6.append(f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClsLabelInfoStorage", sb6.toString());
    }

    public final java.util.List Y6(java.lang.String roomId, java.lang.String isRes, int i17, int i18) {
        kotlin.jvm.internal.o.g(roomId, "roomId");
        kotlin.jvm.internal.o.g(isRes, "isRes");
        p75.m c17 = new p75.r0("chat_room_id", roomId).c(new p75.r0("is_recognize", isRes));
        p75.i0 i19 = dm.d2.f236309p.i();
        i19.f352656c = "MicroMsg.ClsLabelInfoStorage";
        i19.f352657d = c17;
        i19.f352659f = kz5.b0.c(dm.d2.f236310q.u());
        i19.c(i18, i17);
        java.util.List k17 = i19.a().k(this.f193147g.Q4(), com.tencent.mm.storage.g3.class);
        com.tencent.mars.xlog.Log.i("MicroMsg.ClsLabelInfoStorage", "getClsImageListByIsRec select result: " + ((java.util.ArrayList) k17).size());
        return k17;
    }
}
