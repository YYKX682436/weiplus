package com.tencent.mm.ui.chatting.view;

/* loaded from: classes3.dex */
public final class y2 implements u3.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f203156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f203157b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f203158c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f203159d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f203160e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.a f203161f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.z2 f203162g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f203163h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroupOverlay f203164i;

    public y2(int i17, kotlin.jvm.internal.f0 f0Var, int i18, kotlin.jvm.internal.c0 c0Var, kotlin.jvm.internal.h0 h0Var, java.util.List list, yz5.a aVar, com.tencent.mm.ui.chatting.view.z2 z2Var, java.lang.String str, android.view.ViewGroupOverlay viewGroupOverlay) {
        this.f203156a = f0Var;
        this.f203157b = i18;
        this.f203158c = c0Var;
        this.f203159d = h0Var;
        this.f203160e = list;
        this.f203161f = aVar;
        this.f203162g = z2Var;
        this.f203163h = str;
        this.f203164i = viewGroupOverlay;
    }

    @Override // u3.p
    public final void a(u3.s sVar, boolean z17, float f17, float f18) {
        kotlin.jvm.internal.f0 f0Var = this.f203156a;
        int i17 = f0Var.f310116d + 1;
        f0Var.f310116d = i17;
        if (i17 >= this.f203157b) {
            kotlin.jvm.internal.c0 c0Var = this.f203158c;
            if (c0Var.f310112d) {
                return;
            }
            c0Var.f310112d = true;
            com.tencent.mm.ui.chatting.view.u2 u2Var = (com.tencent.mm.ui.chatting.view.u2) this.f203159d.f310123d;
            if (u2Var != null) {
                this.f203162g.f203170a.remove(this.f203163h, u2Var);
            }
            java.util.Iterator it = this.f203160e.iterator();
            while (it.hasNext()) {
                this.f203164i.remove((com.tencent.mm.ui.chatting.view.v2) it.next());
            }
            yz5.a aVar = this.f203161f;
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }
}
