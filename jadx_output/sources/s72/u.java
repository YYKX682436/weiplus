package s72;

/* loaded from: classes4.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f404157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404158e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(java.util.LinkedList linkedList, s72.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f404157d = linkedList;
        this.f404158e = j0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new s72.u(this.f404157d, this.f404158e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        s72.u uVar = (s72.u) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        uVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        byte[] d17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        while (true) {
            java.util.LinkedList linkedList = this.f404157d;
            if (linkedList.isEmpty()) {
                return jz5.f0.f302826a;
            }
            r45.b50 b50Var = (r45.b50) linkedList.getFirst();
            linkedList.removeFirst();
            if (b50Var.f370530d == 229 && (d17 = x51.j1.d(b50Var.f370531e)) != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FavSyncService", "[handleCmdListToDBForTags] cmd id = " + b50Var.f370530d + ", buffer size = " + d17.length);
                com.tencent.mm.protobuf.f parseFrom = new r45.nq0().parseFrom(d17);
                kotlin.jvm.internal.o.e(parseFrom, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FavTag");
                s72.j0.T6(this.f404158e, (r45.nq0) parseFrom);
            }
        }
    }
}
