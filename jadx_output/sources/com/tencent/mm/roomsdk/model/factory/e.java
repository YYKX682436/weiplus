package com.tencent.mm.roomsdk.model.factory;

/* loaded from: classes11.dex */
public class e implements xg3.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final o65.b f192255a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.dialog.u3 f192256b;

    public e(o65.b bVar, com.tencent.mm.ui.widget.dialog.u3 u3Var) {
        this.f192255a = bVar;
        this.f192256b = u3Var;
    }

    @Override // xg3.n0
    public void a(final int i17, final java.lang.String str, final java.lang.String str2) {
        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: com.tencent.mm.roomsdk.model.factory.e$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.roomsdk.model.factory.e eVar = com.tencent.mm.roomsdk.model.factory.e.this;
                o65.b bVar = eVar.f192255a;
                if (bVar != null) {
                    boolean z17 = bVar instanceof o65.f;
                    int i18 = i17;
                    if (z17) {
                        o65.f fVar = (o65.f) bVar;
                        fVar.f343223a = i18;
                        fVar.f343224b = str;
                        fVar.f343225c = str2;
                    }
                    bVar.a(0, i18, "", bVar);
                }
                com.tencent.mm.ui.widget.dialog.u3 u3Var = eVar.f192256b;
                if (u3Var != null) {
                    u3Var.dismiss();
                }
            }
        });
    }
}
