package h93;

/* loaded from: classes11.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h93.k f279700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f279701e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h93.k kVar, kotlin.jvm.internal.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f279700d = kVar;
        this.f279701e = h0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new h93.g(this.f279700d, this.f279701e, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        h93.g gVar = (h93.g) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        gVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        jz5.l lVar;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        h93.k kVar = this.f279700d;
        kVar.f279711g.clear();
        no.a aVar2 = kVar.f279710f;
        aVar2.f338698a.clear();
        aVar2.f338699b.clear();
        kotlin.jvm.internal.h0 h0Var = this.f279701e;
        java.util.List<com.tencent.mm.storage.d4> list = (java.util.List) h0Var.f310123d;
        if (list != null) {
            for (com.tencent.mm.storage.d4 d4Var : list) {
                java.lang.String field_labelName = d4Var.field_labelName;
                kotlin.jvm.internal.o.f(field_labelName, "field_labelName");
                java.lang.Integer num = new java.lang.Integer(d4Var.field_labelID);
                aVar2.getClass();
                java.util.LinkedHashMap linkedHashMap = aVar2.f338698a;
                if (linkedHashMap.containsKey(field_labelName)) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.BiMap", "try to rebind key(exist)-value! exist bind: " + ((java.lang.Object) field_labelName) + '-' + linkedHashMap.get(field_labelName) + ", but want to rebind with: " + ((java.lang.Object) field_labelName) + '-' + num);
                } else {
                    java.util.LinkedHashMap linkedHashMap2 = aVar2.f338699b;
                    if (linkedHashMap2.containsKey(num)) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.BiMap", "try to rebind key-value(exist)! exist bind: " + linkedHashMap2.get(num) + '-' + num + ", but want to rebind with: " + ((java.lang.Object) field_labelName) + '-' + num);
                    } else {
                        linkedHashMap.put(field_labelName, num);
                        linkedHashMap2.put(num, field_labelName);
                    }
                }
                if (d4Var.field_isTemporary) {
                    kVar.f279711g.add(d4Var);
                }
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("load allContactLabels: ");
        java.util.List list2 = (java.util.List) h0Var.f310123d;
        sb6.append(list2 != null ? new java.lang.Integer(list2.size()) : null);
        com.tencent.mars.xlog.Log.i("MicroMsg.LabelStateUIC", sb6.toString());
        java.util.Set keySet = aVar2.f338699b.keySet();
        kotlin.jvm.internal.o.f(keySet, "<get-keys>(...)");
        java.util.ArrayList arrayList = kVar.f279709e;
        if (!arrayList.isEmpty()) {
            h93.f fVar = new h93.f(keySet);
            kotlin.jvm.internal.o.g(arrayList, "<this>");
            kz5.h0.z(arrayList, fVar, false);
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.String str = (java.lang.String) aVar2.f338699b.get(new java.lang.Integer(((java.lang.Number) it.next()).intValue()));
            if (str == null) {
                lVar = null;
            } else {
                java.lang.Integer num2 = (java.lang.Integer) kVar.f279708d.get(str);
                if (num2 == null) {
                    num2 = new java.lang.Integer(0);
                }
                lVar = new jz5.l(str, new java.lang.Integer(num2.intValue()));
            }
            if (lVar != null) {
                arrayList2.add(lVar);
            }
        }
        jz5.l[] lVarArr = (jz5.l[]) arrayList2.toArray(new jz5.l[0]);
        kVar.f279708d = kz5.c1.i((jz5.l[]) java.util.Arrays.copyOf(lVarArr, lVarArr.length));
        java.util.ArrayList O6 = kVar.O6();
        for (java.lang.Class cls : h93.k.f279707q) {
            androidx.appcompat.app.AppCompatActivity activity = kVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            ((h93.c) pf5.z.f353948a.a(activity).a(cls)).T6(O6);
        }
        kVar.f279712h.invoke();
        return jz5.f0.f302826a;
    }
}
