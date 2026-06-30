package dj5;

/* loaded from: classes.dex */
public final class w extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dj5.b0 f233098d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(dj5.b0 b0Var) {
        super(1);
        this.f233098d = b0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.Object obj2;
        wi5.n0 state = (wi5.n0) obj;
        kotlin.jvm.internal.o.g(state, "state");
        j75.d dVar = state.f298066d;
        if (dVar != null && (dVar instanceof wi5.h0)) {
            state.f446320p.add(c01.z1.r());
            java.lang.String stringExtra = this.f233098d.getIntent().getStringExtra("chatroommemberlist");
            if (stringExtra != null) {
                if (!(!r26.n0.N(stringExtra))) {
                    stringExtra = null;
                }
                java.lang.String str = stringExtra;
                if (str != null) {
                    obj2 = r26.n0.f0(str, new java.lang.String[]{","}, false, 0, 6, null);
                    java.util.List list = state.D;
                    ((java.util.ArrayList) list).addAll(obj2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactChooseChatRoomMemberUIC", "showMemberList:%s, chatroomMemberList:%s", list, obj2.toString());
                }
            }
            obj2 = kz5.p0.f313996d;
            java.util.List list2 = state.D;
            ((java.util.ArrayList) list2).addAll(obj2);
            com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactChooseChatRoomMemberUIC", "showMemberList:%s, chatroomMemberList:%s", list2, obj2.toString());
        }
        return jz5.f0.f302826a;
    }
}
