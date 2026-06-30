package z71;

@j95.b
/* loaded from: classes8.dex */
public class i extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f470526d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public z71.b0 f470527e;

    public final void wi(java.lang.String str, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.AiSessionData", "handleSessionEvent sessionId[%s]", str);
        int[] wi6 = z71.f.Bi().wi();
        z71.b0 b0Var = new z71.b0();
        b0Var.f470511a = str;
        b0Var.f470512b = j17;
        this.f470527e = b0Var;
        java.util.LinkedList linkedList = this.f470526d;
        linkedList.add(b0Var);
        int size = linkedList.size();
        if (size < 1) {
            return;
        }
        z71.b0 b0Var2 = (z71.b0) linkedList.get(size - 1);
        z71.b0 b0Var3 = size >= 2 ? (z71.b0) linkedList.get(size - 2) : null;
        z71.b0 b0Var4 = size >= 3 ? (z71.b0) linkedList.get(size - 3) : null;
        if (linkedList.size() > 5) {
            linkedList.removeFirst();
        }
        if (b0Var3 != null && "2".equals(b0Var3.f470511a)) {
            com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent quitFindMoreFriendsUIEvent = new com.tencent.mm.autogen.events.QuitFindMoreFriendsUIEvent();
            java.lang.String str2 = b0Var4 != null ? b0Var4.f470511a : "unknow";
            am.hp hpVar = quitFindMoreFriendsUIEvent.f54640g;
            hpVar.f6857a = str2;
            hpVar.f6858b = b0Var2 != null ? b0Var2.f470511a : "unknow";
            hpVar.f6859c = b0Var3.f470512b;
            hpVar.f6860d = b0Var2 != null ? b0Var2.f470512b : 0L;
            hpVar.f6861e = wi6;
            quitFindMoreFriendsUIEvent.e();
            com.tencent.mars.xlog.Log.i("MicroMsg.AiSessionData", "quit find more friends ui fromSid[%s] toSid[%s]", hpVar.f6857a, hpVar.f6858b);
        }
        if (b0Var2 == null || !"2".equals(b0Var2.f470511a)) {
            return;
        }
        com.tencent.mm.autogen.events.EnterFindMoreFriendsUIEvent enterFindMoreFriendsUIEvent = new com.tencent.mm.autogen.events.EnterFindMoreFriendsUIEvent();
        am.v4 v4Var = enterFindMoreFriendsUIEvent.f54109g;
        v4Var.getClass();
        v4Var.f8170a = b0Var3 != null ? b0Var3.f470511a : "unknow";
        enterFindMoreFriendsUIEvent.e();
        com.tencent.mars.xlog.Log.i("MicroMsg.AiSessionData", "enter find more friends ui fromSid[%s]", v4Var.f8170a);
    }
}
