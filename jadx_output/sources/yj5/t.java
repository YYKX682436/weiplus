package yj5;

/* loaded from: classes8.dex */
public final class t extends yj5.a implements q21.c {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.base.TalkRoomPopupNav f462731f;

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = this.f462731f;
        if (talkRoomPopupNav != null) {
            talkRoomPopupNav.i();
        }
    }

    @Override // q21.c
    public void d(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        yb5.d dVar = this.f198580d;
        if (dVar == null || !kotlin.jvm.internal.o.b(str, dVar.x())) {
            return;
        }
        o0();
    }

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f454885g;
        return xj5.a.f454892q;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerInfo, "talkerInfo");
        if (q21.d.a() == null) {
            return null;
        }
        va3.z0 z0Var = (va3.z0) q21.d.a();
        java.lang.String str = talkerInfo.f460742a;
        if (!z0Var.f(str)) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList b17 = ((va3.z0) q21.d.a()).b(str);
        kotlin.jvm.internal.o.f(b17, "getTrackRoomInfo(...)");
        linkedList.add(new xj5.i(b17));
        return linkedList;
    }

    @Override // yj5.a
    public void n0() {
        com.tencent.mm.ui.base.TalkRoomPopupNav talkRoomPopupNav = this.f462731f;
        if (talkRoomPopupNav != null) {
            talkRoomPopupNav.setVisibility(8);
            talkRoomPopupNav.a();
            talkRoomPopupNav.c(-1, 0);
            talkRoomPopupNav.i();
            ((com.tencent.mm.ui.chatting.component.rf) ((sb5.a1) this.f198580d.f460708c.a(sb5.a1.class))).I0(-1, false);
        }
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.y(ui6, tipsBarContext, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        q21.a a17 = q21.d.a();
        if (a17 != null) {
            va3.z0 z0Var = (va3.z0) a17;
            synchronized (z0Var) {
                ((java.util.LinkedList) z0Var.f434399d).add(this);
            }
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        q21.a a17 = q21.d.a();
        if (a17 != null) {
            va3.z0 z0Var = (va3.z0) a17;
            synchronized (z0Var) {
                ((java.util.LinkedList) z0Var.f434399d).remove(this);
            }
        }
    }
}
