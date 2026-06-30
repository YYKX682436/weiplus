package com.tencent.mm.ui.chatting;

/* loaded from: classes12.dex */
public class m4 implements com.tencent.mm.modelbase.e1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.h4 f201945a;

    public m4(com.tencent.mm.ui.chatting.h4 h4Var) {
        this.f201945a = h4Var;
    }

    @Override // com.tencent.mm.modelbase.e1
    public void a() {
        com.tencent.mm.ui.chatting.h4 h4Var = this.f201945a;
        ((com.tencent.mm.modelbase.g1) h4Var.f201637b.b()).reset();
        h4Var.f201653r.d();
        h4Var.f201656u.d();
        com.tencent.mm.sdk.platformtools.c3.b("keep_app_silent");
        h4Var.f201636a.d1(com.tencent.mm.pluginsdk.ui.chat.f5.Error);
        sb5.q2 q2Var = (sb5.q2) h4Var.f201645j.f460708c.a(sb5.q2.class);
        if (q2Var != null) {
            com.tencent.mm.ui.chatting.component.ro roVar = (com.tencent.mm.ui.chatting.component.ro) q2Var;
            if (roVar.o0() != null) {
                roVar.p0().l();
            }
        }
        h4Var.f201645j.f460717l.enableOptionMenu(true);
        h4Var.f201645j.f460717l.enableBackMenu(true);
        dp.a.makeText(h4Var.f201645j.g(), h4Var.f201645j.g().getString(com.tencent.mm.R.string.b5c), 0).show();
    }
}
