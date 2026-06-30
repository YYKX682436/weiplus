package yj5;

/* loaded from: classes5.dex */
public final class v extends yj5.a {

    /* renamed from: f, reason: collision with root package name */
    public final e01.g f462733f = new yj5.u(this);

    @Override // yj5.l
    public int h() {
        int i17 = xj5.a.f454885g;
        return xj5.a.f454894s;
    }

    @Override // yj5.l
    public java.util.List m(yb5.d context, yb5.q talkerInfo) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(talkerInfo, "talkerInfo");
        android.app.Activity g17 = this.f198580d.g();
        com.tencent.mm.ui.conversation.banner.i iVar = com.tencent.mm.ui.conversation.banner.i.CHATTING_SECURITY_BANNER_V2;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = talkerInfo.f460742a;
        java.lang.String str = talkerInfo.f460743b;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        objArr[2] = java.lang.Boolean.valueOf(talkerInfo.f460745d);
        s35.a a17 = com.tencent.mm.ui.conversation.banner.j.a(g17, iVar, objArr);
        java.util.Objects.toString(a17);
        if (a17 == null || ((s35.b) a17).f402843h == null) {
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(new xj5.j(a17));
        return linkedList;
    }

    @Override // yj5.l
    public wj5.c r(int i17, yb5.d ui6, com.tencent.mm.ui.tipsbar.d tipsBarContext) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(tipsBarContext, "tipsBarContext");
        return new wj5.z(ui6, tipsBarContext, this);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void x() {
        c01.d9.b().o().a(this.f462733f);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void y() {
        if (gm0.j1.b().m()) {
            e01.f o17 = c01.d9.b().o();
            ((java.util.ArrayList) o17.f245838a).remove(this.f462733f);
        }
    }
}
