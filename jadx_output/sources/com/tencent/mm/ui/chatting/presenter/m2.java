package com.tencent.mm.ui.chatting.presenter;

/* loaded from: classes12.dex */
public class m2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.presenter.n3 f202342d;

    public m2(com.tencent.mm.ui.chatting.presenter.n3 n3Var) {
        this.f202342d = n3Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f202342d.f202358f;
        dp.a.makeText(context, context.getString(com.tencent.mm.R.string.i88), 1).show();
    }
}
