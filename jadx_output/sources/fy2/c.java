package fy2;

/* loaded from: classes10.dex */
public final class c extends dk2.cb {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.p f267238b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yz5.p pVar, java.lang.Class cls) {
        super(cls);
        this.f267238b = pVar;
    }

    @Override // dk2.cb
    public void b(com.tencent.mm.protobuf.f fVar) {
        r45.g84 g84Var;
        java.lang.Object obj;
        r45.py2 result = (r45.py2) fVar;
        kotlin.jvm.internal.o.g(result, "result");
        java.util.LinkedList list = result.getList(0);
        java.lang.Object obj2 = null;
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.g84) obj).getInteger(0) == 1) {
                        break;
                    }
                }
            }
            g84Var = (r45.g84) obj;
        } else {
            g84Var = null;
        }
        java.util.LinkedList list2 = result.getList(1);
        if (list2 != null) {
            java.util.Iterator it6 = list2.iterator();
            while (true) {
                if (!it6.hasNext()) {
                    break;
                }
                java.lang.Object next = it6.next();
                if (((r45.g84) next).getInteger(0) == 1) {
                    obj2 = next;
                    break;
                }
            }
            obj2 = (r45.g84) obj2;
        }
        yz5.p pVar = this.f267238b;
        if (pVar != null) {
            pVar.invoke(g84Var, obj2);
        }
    }
}
