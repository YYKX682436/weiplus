package rc5;

/* loaded from: classes5.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rc5.x f394193d;

    public u(rc5.x xVar) {
        this.f394193d = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.chat.ChattingScrollLayout chattingScrollLayout;
        sb5.s0 s0Var;
        rc5.x xVar = this.f394193d;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = null;
        rc5.x.q7(xVar, xVar.getActivity().getWindow(), null, 2, null);
        rc5.t tVar = new rc5.t(xVar);
        xVar.getClass();
        yb5.d dVar = xVar.W6().f198152f;
        if (dVar != null && (s0Var = (sb5.s0) dVar.f460708c.a(sb5.s0.class)) != null) {
            chatFooter = ((com.tencent.mm.ui.chatting.component.jb) s0Var).f199263e;
        }
        if (chatFooter == null || (chattingScrollLayout = chatFooter.f189982f2) == null) {
            return;
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) chattingScrollLayout.f190134s;
        if (linkedList.contains(tVar)) {
            return;
        }
        linkedList.add(tVar);
    }
}
