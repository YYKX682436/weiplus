package com.tencent.mm.plugin.game.luggage.page;

/* loaded from: classes8.dex */
public class i implements com.tencent.mm.plugin.game.luggage.page.w0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f139904a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.x0 f139905b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.luggage.page.l f139906c;

    public i(com.tencent.mm.plugin.game.luggage.page.l lVar, java.lang.String str, com.tencent.mm.plugin.game.luggage.page.x0 x0Var) {
        this.f139906c = lVar;
        this.f139904a = str;
        this.f139905b = x0Var;
    }

    @Override // com.tencent.mm.plugin.game.luggage.page.w0
    public void a() {
        this.f139906c.M.postUI(new com.tencent.mm.plugin.game.luggage.page.h(this));
    }
}
