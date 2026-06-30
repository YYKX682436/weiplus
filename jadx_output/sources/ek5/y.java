package ek5;

/* loaded from: classes9.dex */
public final class y extends ek5.c {
    @Override // ek5.b
    public co.a d(android.content.Intent intent, n50.i param) {
        kotlin.jvm.internal.o.g(intent, "intent");
        kotlin.jvm.internal.o.g(param, "param");
        ld5.a aVar = new ld5.a();
        boolean z17 = true;
        aVar.set(aVar.f43702d + 1, (java.lang.String) ((jz5.n) param.f335107e).getValue());
        java.io.Serializable serializableExtra = intent.getSerializableExtra("Retr_Msg_Id_List");
        java.util.List list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        aVar.l(list != null ? new java.util.LinkedList(list) : null);
        java.util.LinkedList j17 = aVar.j();
        if (j17 != null && !j17.isEmpty()) {
            z17 = false;
        }
        if (z17) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.add(java.lang.Long.valueOf(param.b()));
            aVar.l(linkedList);
        }
        return aVar;
    }

    @Override // ek5.b
    public java.lang.Class e() {
        return gk5.y.class;
    }

    @Override // ek5.b
    public java.lang.Class f() {
        return r50.k0.class;
    }

    @Override // ek5.b
    public int g() {
        return 49;
    }

    @Override // ek5.b
    public java.lang.Class h() {
        return ld5.a.class;
    }

    @Override // ek5.b
    public java.util.List j() {
        return kz5.b0.c(13);
    }
}
