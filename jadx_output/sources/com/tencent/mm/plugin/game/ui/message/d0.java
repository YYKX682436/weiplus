package com.tencent.mm.plugin.game.ui.message;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f141542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.message.f0 f141543e;

    public d0(com.tencent.mm.plugin.game.ui.message.f0 f0Var, java.util.List list) {
        this.f141543e = f0Var;
        this.f141542d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.message.f0 f0Var = this.f141543e;
        ((java.util.LinkedList) f0Var.f141549e).clear();
        ((java.util.LinkedList) f0Var.f141549e).addAll(this.f141542d);
        f0Var.notifyDataSetChanged();
    }
}
