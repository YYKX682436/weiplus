package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class jg implements r35.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.qf f204255a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f204256b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.viewitems.zf f204257c;

    public jg(com.tencent.mm.ui.chatting.viewitems.zf zfVar, com.tencent.mm.ui.chatting.viewitems.qf qfVar, int i17) {
        this.f204257c = zfVar;
        this.f204255a = qfVar;
        this.f204256b = i17;
    }

    @Override // r35.q3
    public void onFinish() {
        com.tencent.mm.ui.chatting.viewitems.qf qfVar = this.f204255a;
        qfVar.f205355f.f205265c.setVisibility(0);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = qfVar.f205355f.f205983d;
        com.tencent.mm.ui.chatting.viewitems.zf zfVar = this.f204257c;
        mMNeat7extView.setTextColor(zfVar.f206134s.g().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        qfVar.f205355f.f205984e.setTextColor(zfVar.f206134s.g().getResources().getColor(com.tencent.mm.R.color.f479549ab0));
        qfVar.f205355f.f205265c.setBackgroundResource(this.f204256b > 1 ? com.tencent.mm.R.drawable.f481009i8 : com.tencent.mm.R.drawable.f481010i9);
    }

    @Override // r35.q3
    public void onStart() {
    }
}
