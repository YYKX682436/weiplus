package com.tencent.mm.plugin.scanner.view;

/* loaded from: classes13.dex */
public class e extends qt5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.scanner.view.ScanCardRectView f159926a;

    public e(com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView) {
        this.f159926a = scanCardRectView;
    }

    @Override // qt5.f
    public void a() {
        this.f159926a.i(new com.tencent.mm.plugin.scanner.view.f(this));
        if (((qt5.c) this.f159926a.f215302e).f366657b) {
            uo.n.f429522a.f(this.f159926a.getContext());
            return;
        }
        uo.n nVar = uo.n.f429522a;
        nVar.a(this.f159926a.getContext(), qt5.c.class);
        nVar.g(3, true, new yz5.a() { // from class: com.tencent.mm.plugin.scanner.view.e$$a
            @Override // yz5.a
            public final java.lang.Object invoke() {
                boolean z17;
                com.tencent.mm.plugin.scanner.view.e eVar = com.tencent.mm.plugin.scanner.view.e.this;
                if ((eVar.f159926a.getContext() instanceof android.app.Activity) && !((android.app.Activity) eVar.f159926a.getContext()).isFinishing()) {
                    com.tencent.mm.plugin.scanner.view.ScanCardRectView scanCardRectView = eVar.f159926a;
                    int i17 = com.tencent.mm.plugin.scanner.view.ScanCardRectView.A;
                    if (!((qt5.c) scanCardRectView.f215302e).f366657b) {
                        z17 = false;
                        return java.lang.Boolean.valueOf(z17);
                    }
                }
                z17 = true;
                return java.lang.Boolean.valueOf(z17);
            }
        }, new yz5.p() { // from class: com.tencent.mm.plugin.scanner.view.e$$b
            @Override // yz5.p
            public final java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
                com.tencent.mm.plugin.scanner.view.e eVar = com.tencent.mm.plugin.scanner.view.e.this;
                eVar.getClass();
                eVar.f159926a.g(new com.tencent.mm.plugin.scanner.view.g(eVar, (java.lang.Integer) obj, (yz5.l) obj2));
                return null;
            }
        });
    }
}
