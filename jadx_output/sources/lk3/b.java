package lk3;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Llk3/b;", "Lcom/tencent/mm/sdk/storage/mvvm/MvvmStorage;", "Lcom/tencent/mm/plugin/multitask/model/MultiTaskInfo;", "Ln75/b;", "dbProvider", "<init>", "(Ln75/b;)V", "plugin-multitask_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class b extends com.tencent.mm.sdk.storage.mvvm.MvvmStorage<com.tencent.mm.plugin.multitask.model.MultiTaskInfo> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(n75.b dbProvider) {
        super(dbProvider);
        kotlin.jvm.internal.o.g(dbProvider, "dbProvider");
    }

    @Override // l75.c1
    public o75.e N6() {
        return new o75.e();
    }

    public final boolean X6(com.tencent.mm.plugin.multitask.model.MultiTaskInfo item) {
        kotlin.jvm.internal.o.g(item, "item");
        if (!gm0.j1.a()) {
            return false;
        }
        if (a7(item.field_type)) {
            return true;
        }
        if (!(com.tencent.mm.sdk.storage.mvvm.MvvmStorage.S6(this, item, false, false, 4, null) > 0)) {
            return com.tencent.mm.sdk.storage.mvvm.MvvmStorage.U6(this, item, false, false, false, 14, null);
        }
        boolean U6 = com.tencent.mm.sdk.storage.mvvm.MvvmStorage.U6(this, item, false, false, false, 12, null);
        if (!U6) {
            return U6;
        }
        lk3.c cVar = lk3.c.f319013g;
        lk3.c cVar2 = lk3.c.f319013g;
        java.lang.String field_id = item.field_id;
        kotlin.jvm.internal.o.f(field_id, "field_id");
        o75.c cVar3 = new o75.c(cVar2, field_id, "MicroMsg.MultiTask.MultiTaskLiveStorage");
        cVar3.f343590d = item;
        P6().notify(cVar3);
        return U6;
    }

    public final com.tencent.mm.plugin.multitask.model.MultiTaskInfo Y6(java.lang.String id6, int i17) {
        kotlin.jvm.internal.o.g(id6, "id");
        if (!gm0.j1.a()) {
            return null;
        }
        p75.n0 n0Var = dm.h8.f237405m;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m c17 = dm.h8.f237406n.j(id6).c(dm.h8.f237407o.i(java.lang.Integer.valueOf(i17)));
        p75.i0 g17 = dm.h8.f237405m.g(linkedList);
        g17.f352657d = c17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        return (com.tencent.mm.plugin.multitask.model.MultiTaskInfo) g17.a().o(this.f193147g.Q4(), com.tencent.mm.plugin.multitask.model.MultiTaskInfo.class);
    }

    public final java.util.List Z6(kk3.b bVar) {
        android.database.Cursor B;
        if (!gm0.j1.a()) {
            java.util.List list = kz5.p0.f313996d;
            if (bVar != null) {
                bVar.a(list);
            }
            return list;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        l75.k0 Q4 = this.f193147g.Q4();
        if (Q4 != null && (B = Q4.B("SELECT * FROM MultiTaskInfo ORDER BY createTime DESC;", null)) != null) {
            while (B.moveToNext()) {
                try {
                    com.tencent.mm.plugin.multitask.model.MultiTaskInfo multiTaskInfo = new com.tencent.mm.plugin.multitask.model.MultiTaskInfo();
                    multiTaskInfo.convertFrom(B);
                    arrayList.add(multiTaskInfo);
                } finally {
                }
            }
            vz5.b.a(B, null);
        }
        if (bVar != null) {
            bVar.a(arrayList);
        }
        return arrayList;
    }

    public final boolean a7(int i17) {
        return i17 == 24 || i17 == 23 || i17 == 25 || i17 == 27;
    }
}
