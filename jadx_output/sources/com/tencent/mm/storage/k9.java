package com.tencent.mm.storage;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/mm/storage/k9;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lcom/tencent/mm/storage/j9;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "compose-image-query_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class k9 extends com.tencent.mm.sdk.storage.mvvm.MvvmStorage<com.tencent.mm.storage.j9> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k9(n75.b dbProvider) {
        super(dbProvider);
        kotlin.jvm.internal.o.g(dbProvider, "dbProvider");
    }

    @Override // com.tencent.mm.sdk.storage.mvvm.MvvmStorage, l75.c1
    /* renamed from: O6 */
    public java.lang.String getF368356h() {
        return "MicroMsg.MsgQueryHistoryInfoStorage";
    }

    public final void X6(java.lang.String roomId) {
        kotlin.jvm.internal.o.g(roomId, "roomId");
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgQueryHistoryInfoStorage", "deleteHistoryByRoomId >> roomId: ".concat(roomId));
        p75.p pVar = p75.p.f352680e;
        p75.n0 n0Var = dm.d8.f236399h;
        n0Var.getClass();
        if (n0Var instanceof p75.z) {
            throw new java.lang.IllegalArgumentException("Not support multi table delete");
        }
        int f17 = new p75.i(n0Var.b(), "chat_room_id " + pVar + " ?", new java.lang.String[]{roomId}).f(this.f193147g.Q4());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("deleteHistoryByRoomId >> roomId: ");
        sb6.append(roomId);
        sb6.append(" , result: ");
        sb6.append(f17);
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgQueryHistoryInfoStorage", sb6.toString());
    }
}
