package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes15.dex */
public class c3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f139056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f139057e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.d3 f139058f;

    public c3(com.tencent.mm.plugin.game.chatroom.view.d3 d3Var, int i17, int i18) {
        this.f139058f = d3Var;
        this.f139056d = i17;
        this.f139057e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f139058f.f139071a.f139176r.f138960f2.notifyItemRangeChanged(this.f139056d, this.f139057e + 10, null);
    }
}
