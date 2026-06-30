package eg4;

/* loaded from: classes4.dex */
public final class a1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f252669d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI f252670e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f252670e = addFriendVerifyRecordUI;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new eg4.a1(this.f252670e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((eg4.a1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f252669d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            int i18 = com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI.f172162p;
            com.tencent.mm.plugin.subapp.ui.friend.AddFriendVerifyRecordUI addFriendVerifyRecordUI = this.f252670e;
            com.tencent.mm.storage.jb V6 = addFriendVerifyRecordUI.V6();
            long j17 = com.tencent.wcdb.core.Database.DictDefaultMatchValue;
            if (V6 != null && V6.f195062d != null) {
                android.database.Cursor rawQuery = V6.rawQuery("SELECT MIN(version) FROM VerifyRecordMsgInfo", new java.lang.String[0]);
                try {
                    if (rawQuery.moveToFirst()) {
                        j17 = rawQuery.getLong(0);
                        vz5.b.a(rawQuery, null);
                    } else {
                        vz5.b.a(rawQuery, null);
                    }
                } finally {
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.AddFriendVerifyRecordUI", "syncVerifyRecordHistory, minVersion: " + j17);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.g3 g3Var = kotlinx.coroutines.internal.b0.f310484a;
            eg4.z0 z0Var = new eg4.z0(j17, addFriendVerifyRecordUI, null);
            this.f252669d = 1;
            if (kotlinx.coroutines.l.g(g3Var, z0Var, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        return jz5.f0.f302826a;
    }
}
