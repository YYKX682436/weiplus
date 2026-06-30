package gn3;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgn3/b;", "Lfn3/a;", "Lr45/qu4;", "Lr45/ru4;", "", "cmdId", "", "taskId", "<init>", "(Ljava/lang/String;I)V", "plugin-newlife_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class b extends fn3.a<r45.qu4, r45.ru4> {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f273586e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(java.lang.String cmdId, int i17) {
        super(cmdId, i17);
        kotlin.jvm.internal.o.g(cmdId, "cmdId");
        this.f273586e = "MicroMsg.NewLife.NewLifeGetImageTagListHandler";
    }

    @Override // fn3.a
    public void a(com.tencent.mm.protobuf.f fVar, fn3.d asyncCallback) {
        java.util.LinkedList list;
        r45.qu4 qu4Var = (r45.qu4) fVar;
        kotlin.jvm.internal.o.g(asyncCallback, "asyncCallback");
        if (qu4Var != null && (list = qu4Var.getList(0)) != null) {
            java.util.LinkedList linkedList = list.isEmpty() ^ true ? list : null;
            if (linkedList != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.addAll(linkedList);
                com.tencent.mm.sdk.coroutines.LifecycleScope Bi = ((en3.l0) i95.n0.c(en3.l0.class)).Bi();
                if (Bi == null || v65.i.b(Bi, null, new gn3.a(arrayList, asyncCallback, this, linkedList, null), 1, null) == null) {
                    asyncCallback.a(null, -1, "host or scope not found");
                    return;
                }
                return;
            }
        }
        asyncCallback.a(null, -2, "request image path list is empty");
    }
}
