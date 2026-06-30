package com.tencent.mm.ui.chatting;

/* loaded from: classes5.dex */
public class d7 implements com.tencent.mm.pluginsdk.ui.tools.u6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.f7 f200420a;

    public d7(com.tencent.mm.ui.chatting.f7 f7Var) {
        this.f200420a = f7Var;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u6
    public void a() {
        this.f200420a.f200494g.setText(com.tencent.mm.R.string.azq);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.u6
    public void onSuccess(int i17) {
        com.tencent.mm.ui.chatting.f7 f7Var = this.f200420a;
        f7Var.f200497j = i17;
        f7Var.c();
    }
}
