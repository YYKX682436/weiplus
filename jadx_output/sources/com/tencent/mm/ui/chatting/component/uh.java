package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public class uh implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f200073d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f200074e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.yh f200075f;

    public uh(com.tencent.mm.ui.chatting.component.yh yhVar, com.tencent.mm.storage.f9 f9Var, android.view.View view) {
        this.f200075f = yhVar;
        this.f200073d = f9Var;
        this.f200074e = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.storage.f9 f9Var = this.f200073d;
        com.tencent.mars.xlog.Log.i("MicroMsg.NewXmlSysMsgComponent", "[handleClickInvokeMessageSysText] is over time to delete invokeMsg:%s", java.lang.Long.valueOf(f9Var.getMsgId()));
        com.tencent.mm.modelsimple.d1.J(this.f200075f.f198580d.s().getString(com.tencent.mm.R.string.b5s), "", f9Var, "");
        ((com.tencent.mm.storage.g9) c01.d9.b().u()).bb(f9Var.getMsgId(), f9Var);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.ui.chatting.component.th(this));
    }
}
