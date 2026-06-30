package n3;

/* loaded from: classes15.dex */
public final class i1 implements android.view.OnReceiveContentListener {

    /* renamed from: a, reason: collision with root package name */
    public final n3.l0 f334342a;

    public i1(n3.l0 l0Var) {
        this.f334342a = l0Var;
    }

    @Override // android.view.OnReceiveContentListener
    public android.view.ContentInfo onReceiveContent(android.view.View view, android.view.ContentInfo contentInfo) {
        n3.i iVar;
        n3.g gVar = new n3.g(contentInfo);
        n3.i iVar2 = new n3.i(gVar);
        ih5.b bVar = (ih5.b) this.f334342a;
        bVar.getClass();
        kotlin.jvm.internal.o.g(view, "view");
        android.content.ClipData clip = gVar.f334336a.getClip();
        kotlin.jvm.internal.o.f(clip, "getClip(...)");
        ih5.a aVar = bVar.f291602a;
        boolean z17 = false;
        if (aVar != null) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.pluginsdk.ui.chat.ChatFooter$$e) aVar).f190114a;
            if (chatFooter.H1) {
                java.util.List a17 = t35.b.f415435a.a(clip);
                java.util.ArrayList arrayList = (java.util.ArrayList) a17;
                if (arrayList.size() > 1 || (arrayList.size() == 1 && ((t35.a) arrayList.get(0)).f415434c != null)) {
                    ((com.tencent.mm.ui.chatting.component.xi) ((sb5.l1) chatFooter.f189955a3.a().f460708c.a(sb5.l1.class))).m0(a17);
                    z17 = true;
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "not support paste content!!");
            }
        }
        if (z17) {
            iVar = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.AllMediaContentReceiver", "process fail");
            iVar = iVar2;
        }
        if (iVar == null) {
            return null;
        }
        if (iVar == iVar2) {
            return contentInfo;
        }
        android.view.ContentInfo contentInfo2 = ((n3.g) iVar.f334341a).f334336a;
        java.util.Objects.requireNonNull(contentInfo2);
        return contentInfo2;
    }
}
