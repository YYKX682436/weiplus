package yj5;

/* loaded from: classes5.dex */
public final class d extends yj5.a {

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct f462710f;

    /* renamed from: g, reason: collision with root package name */
    public final l75.q0 f462711g = new yj5.c(this);

    /* renamed from: h, reason: collision with root package name */
    public boolean f462712h;

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void J() {
        xj5.c cVar;
        java.lang.ref.WeakReference weakReference = vb5.l.f434855q;
        vb5.l lVar = weakReference != null ? (vb5.l) weakReference.get() : null;
        if (lVar != null) {
            java.util.Iterator it = lVar.f434863o.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                xj5.a aVar = (xj5.a) it.next();
                if (aVar instanceof xj5.c) {
                    cVar = (xj5.c) aVar;
                    break;
                }
            }
            if (cVar != null) {
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("group_msg_set_top_detach", null, kz5.c1.m(kz5.b1.e(new jz5.l("group_bar_close_scene", 5)), cVar.b()), 26356);
            }
        }
        if (this.f198580d.D()) {
            java.util.List list = this.f462703e;
            if ((list != null ? list.size() : 0) > 0 && this.f462712h) {
                c01.v1.F(this.f198580d.u().d1());
            }
        }
        com.tencent.mm.autogen.mmdata.rpt.ViewRoomDescTipsStruct viewRoomDescTipsStruct = this.f462710f;
        if (viewRoomDescTipsStruct != null) {
            viewRoomDescTipsStruct.k();
        }
        this.f462710f = null;
    }

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f454885g;
        return xj5.a.f454888m;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerInfo, "talkerInfo");
        com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(talkerInfo.f460742a);
        if (context.f460717l.hasDestory || z07 == null) {
            return null;
        }
        boolean z17 = true;
        if (z07.field_chatroomNoticeNew != 1) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.String str = z07.field_chatroomnotice;
        if (str != null && !r26.n0.N(str)) {
            z17 = false;
        }
        if (!z17) {
            linkedList.add(new xj5.c(z07));
        }
        return linkedList;
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.i(ui6, tipsBarContext, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        c01.d9.b().l().add(this.f462711g);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        if (gm0.j1.b().m()) {
            c01.d9.b().l().remove(this.f462711g);
        }
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
        this.f462712h = false;
    }
}
