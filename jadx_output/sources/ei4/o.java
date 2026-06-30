package ei4;

/* loaded from: classes9.dex */
public final class o extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l75.w0 f253232d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ei4.s f253233e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(l75.w0 w0Var, ei4.s sVar) {
        super(0);
        this.f253232d = w0Var;
        this.f253233e = sVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object obj = this.f253232d.f316976d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.conversation.data.TextStatusConversation");
        hi4.a aVar = (hi4.a) obj;
        ei4.s sVar = this.f253233e;
        java.util.LinkedList linkedList = sVar.f253239e;
        kotlin.jvm.internal.o.g(linkedList, "<this>");
        java.util.Iterator it = linkedList.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            }
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (kotlin.jvm.internal.o.b(((hi4.e) next).field_session_id, aVar.field_sessionId)) {
                break;
            }
            i17 = i18;
        }
        if (i17 >= 0 && i17 < linkedList.size()) {
            sVar.notifyItemChanged(i17);
        }
        return jz5.f0.f302826a;
    }
}
