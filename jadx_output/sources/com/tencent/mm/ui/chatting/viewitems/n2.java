package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class n2 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f204897a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f204898b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ot0.q f204899c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f204900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f204901e;

    public n2(com.tencent.mm.ui.chatting.viewitems.c2 c2Var, com.tencent.mm.pluginsdk.model.app.m mVar, yb5.d dVar, ot0.q qVar, java.lang.String str, com.tencent.mm.storage.f9 f9Var) {
        this.f204897a = mVar;
        this.f204898b = dVar;
        this.f204899c = qVar;
        this.f204900d = str;
        this.f204901e = f9Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        com.tencent.mm.pluginsdk.model.app.m mVar = this.f204897a;
        if (mVar != null) {
            yb5.d dVar = this.f204898b;
            com.tencent.mm.storage.f9 f9Var = this.f204901e;
            if (z17) {
                com.tencent.mm.ui.chatting.w5.d(this.f204898b, this.f204899c, this.f204900d, mVar, f9Var.I0(), 3, dVar.x());
            } else {
                com.tencent.mm.ui.chatting.w5.d(this.f204898b, this.f204899c, this.f204900d, mVar, f9Var.I0(), 7, dVar.x());
            }
        }
    }
}
