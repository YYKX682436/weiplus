package com.tencent.mm.sns_compose.page;

/* loaded from: classes5.dex */
public final class l0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f193523d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f193524e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e0.f1 f193525f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f193526g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n85.t f193527h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(int i17, int i18, e0.f1 f1Var, androidx.paging.compose.e eVar, n85.t tVar) {
        super(0);
        this.f193523d = i17;
        this.f193524e = i18;
        this.f193525f = f1Var;
        this.f193526g = eVar;
        this.f193527h = tVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        n85.t tVar;
        e0.f1 listState = this.f193525f;
        kotlin.jvm.internal.o.g(listState, "listState");
        androidx.paging.compose.e items = this.f193526g;
        kotlin.jvm.internal.o.g(items, "items");
        n85.t tVar2 = null;
        if (!listState.a()) {
            e0.h0 f17 = listState.f();
            java.util.Iterator it = f17.b().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e0.q0 q0Var = (e0.q0) ((e0.n) it.next());
                int i17 = q0Var.f245679b;
                if (i17 <= 0 || i17 >= items.c()) {
                    tVar = null;
                } else {
                    tVar = (n85.t) ((g4.u0) ((n0.q4) items.f11717b).getValue()).get(i17 - 1);
                }
                if (tVar != null && (tVar instanceof n85.s)) {
                    int f18 = f17.f();
                    int i18 = q0Var.f245678a;
                    if (f18 - i18 < this.f193524e) {
                        break;
                    }
                    if (i18 > (-this.f193523d)) {
                        tVar2 = tVar;
                        break;
                    }
                }
            }
        }
        return java.lang.Boolean.valueOf(kotlin.jvm.internal.o.b(tVar2, this.f193527h));
    }
}
