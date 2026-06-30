package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public class b3 implements com.tencent.mm.pluginsdk.model.app.a5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.model.app.m f203450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yb5.d f203451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ot0.q f203452c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.storage.f9 f203453d;

    public b3(com.tencent.mm.ui.chatting.viewitems.o2 o2Var, com.tencent.mm.pluginsdk.model.app.m mVar, yb5.d dVar, ot0.q qVar, com.tencent.mm.storage.f9 f9Var) {
        this.f203450a = mVar;
        this.f203451b = dVar;
        this.f203452c = qVar;
        this.f203453d = f9Var;
    }

    @Override // com.tencent.mm.pluginsdk.model.app.a5
    public void a(boolean z17, boolean z18) {
        if (this.f203450a != null) {
            yb5.d dVar = this.f203451b;
            com.tencent.mm.storage.f9 f9Var = this.f203453d;
            if (z17) {
                com.tencent.mm.ui.chatting.w5.d(this.f203451b, this.f203452c, c01.z1.r(), this.f203450a, f9Var.I0(), 3, dVar.x());
            } else {
                com.tencent.mm.ui.chatting.w5.d(this.f203451b, this.f203452c, c01.z1.r(), this.f203450a, f9Var.I0(), 7, dVar.x());
            }
        }
    }
}
