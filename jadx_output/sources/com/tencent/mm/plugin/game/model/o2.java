package com.tencent.mm.plugin.game.model;

/* loaded from: classes8.dex */
public class o2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f140393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f140394e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f140395f;

    public o2(com.tencent.mm.plugin.game.model.r2 r2Var, android.content.Context context, java.lang.String str, int i17) {
        this.f140393d = context;
        this.f140394e = str;
        this.f140395f = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.content.Context context = this.f140393d;
        ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).f140986e.setTitleText(this.f140394e);
        ((com.tencent.mm.plugin.game.ui.LiteAppGameTabUI) context).f140986e.setTitleColor(this.f140395f);
    }
}
