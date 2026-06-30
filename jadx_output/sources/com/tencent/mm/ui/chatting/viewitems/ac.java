package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes5.dex */
public class ac implements j45.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203341a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.qq f203342b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203343c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f203344d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203345e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.msgquote.model.MsgQuoteItem f203346f;

    public ac(yb5.d dVar, com.tencent.mm.ui.chatting.viewitems.qq qqVar, com.tencent.mm.storage.f9 f9Var, android.view.View view, com.tencent.mm.storage.f9 f9Var2, com.tencent.mm.plugin.msgquote.model.MsgQuoteItem msgQuoteItem) {
        this.f203341a = dVar;
        this.f203342b = qqVar;
        this.f203343c = f9Var;
        this.f203344d = view;
        this.f203345e = f9Var2;
        this.f203346f = msgQuoteItem;
    }

    @Override // j45.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1010) {
            yb5.d dVar = this.f203341a;
            com.tencent.mm.storage.f9 f9Var = this.f203345e;
            if (i18 == 100) {
                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).f199263e.setNeedShowVKBWhenResume(false);
                com.tencent.mm.ui.chatting.viewitems.dc.e(this.f203341a, this.f203342b.f205388a, this.f203343c, this.f203344d, f9Var.getMsgId(), f9Var.Q0(), this.f203346f, ty.q0.f422750e);
            } else if (i18 == 101) {
                java.lang.Object a17 = ok5.d.a(intent, "kPartialQuoteContent");
                ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) dVar.f460708c.a(sb5.s0.class))).o0(f9Var, a17 instanceof r15.g ? (r15.g) a17 : null);
            }
        }
    }
}
