package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class ig implements r35.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.qf f204181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.zf f204182c;

    public ig(com.tencent.mm.ui.chatting.viewitems.zf zfVar, int i17, com.tencent.mm.ui.chatting.viewitems.qf qfVar) {
        this.f204182c = zfVar;
        this.f204180a = i17;
        this.f204181b = qfVar;
    }

    @Override // r35.q3
    public void onFinish() {
        int i17 = this.f204180a;
        com.tencent.mm.ui.chatting.viewitems.qf qfVar = this.f204181b;
        if (i17 > 1) {
            qfVar.f205352c.f205683g.setTextColor(this.f204182c.f206134s.g().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
            qfVar.f205352c.f205683g.setBackgroundResource(com.tencent.mm.R.drawable.f480982gv);
        }
        qfVar.f205352c.f205687k.setVisibility(0);
    }

    @Override // r35.q3
    public void onStart() {
    }
}
