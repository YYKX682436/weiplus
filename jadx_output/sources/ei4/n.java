package ei4;

/* loaded from: classes9.dex */
public final class n extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f253230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.s f253231e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l75.w0 w0Var, ei4.s sVar) {
        super(0);
        this.f253230d = w0Var;
        this.f253231e = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        l75.w0 w0Var = this.f253230d;
        java.lang.Object obj = w0Var.f316976d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.model.storage.TextStatusStrangerContact");
        mj4.w wVar = (mj4.w) obj;
        int i17 = w0Var.f316974b;
        if (i17 == 2 || i17 == 3) {
            ei4.s sVar = this.f253231e;
            java.util.LinkedList linkedList = sVar.f253239e;
            kotlin.jvm.internal.o.g(linkedList, "<this>");
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            int i18 = 0;
            for (java.lang.Object obj2 : linkedList) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                if (kotlin.jvm.internal.o.b(((hi4.e) obj2).field_session_id, wVar.field_sessionId)) {
                    linkedList2.add(java.lang.Integer.valueOf(i18));
                }
                i18 = i19;
            }
            java.util.Iterator it = linkedList2.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (intValue >= 0 && intValue < linkedList.size()) {
                    sVar.notifyItemChanged(intValue);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
