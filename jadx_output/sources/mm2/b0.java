package mm2;

/* loaded from: classes3.dex */
public final class b0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm2.c f328752d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.tp2 f328753e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ mm2.e0 f328754f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(lm2.c cVar, r45.tp2 tp2Var, mm2.e0 e0Var) {
        super(0);
        this.f328752d = cVar;
        this.f328753e = tp2Var;
        this.f328754f = e0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        lm2.j0 d17;
        java.util.LinkedList linkedList;
        lm2.c cVar = this.f328752d;
        cVar.f319372e.set(12, java.lang.Long.valueOf(this.f328753e.getLong(2)));
        lm2.h0 h0Var = this.f328754f.f328976s;
        if (h0Var != null) {
            r45.qm1 qm1Var = (r45.qm1) cVar.f319372e.getCustom(8);
            java.lang.Object obj = null;
            java.lang.String string = qm1Var != null ? qm1Var.getString(1) : null;
            boolean z17 = false;
            if (!(string == null || string.length() == 0) && (d17 = h0Var.d(string)) != null) {
                lm2.o oVar = (lm2.o) h0Var.f319397d.get(string);
                int indexOf = d17.f319409b.indexOf(cVar);
                java.lang.String string2 = cVar.f319372e.getString(2);
                if (string2 != null) {
                    if (string2.length() > 0) {
                        z17 = true;
                    }
                }
                if (z17 && (linkedList = d17.f319411d.f384104g) != null) {
                    java.util.Iterator it = linkedList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        java.lang.Object next = it.next();
                        java.lang.String string3 = cVar.f319372e.getString(2);
                        r45.ch1 ch1Var = ((r45.wn) next).f389302d;
                        if (kotlin.jvm.internal.o.b(string3, ch1Var != null ? ch1Var.getString(2) : null)) {
                            obj = next;
                            break;
                        }
                    }
                    r45.wn wnVar = (r45.wn) obj;
                    if (wnVar != null) {
                        r45.ch1 ch1Var2 = wnVar.f389302d;
                        if (ch1Var2 != null) {
                            ch1Var2.set(12, java.lang.Long.valueOf(cVar.f319372e.getLong(12)));
                        }
                        java.lang.String str = "updateLocalSeq " + cVar.f319372e.getLong(12) + ", " + cVar.f319372e.getString(2);
                        kotlin.jvm.internal.o.g(str, "str");
                        com.tencent.mars.xlog.Log.i("Finder.BoxDataStore", "memDataLog ".concat(str));
                    }
                }
                if (indexOf >= 0) {
                    h0Var.b("notifier update index:" + indexOf + ", msg:" + cVar.g());
                    if (oVar != null) {
                        ((se2.a0) oVar).f(new lm2.t(string, indexOf, 1, 102));
                    }
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
