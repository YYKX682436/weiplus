package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class hw extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.nw f118600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f118601e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(com.tencent.mm.plugin.finder.live.widget.nw nwVar, java.util.List list) {
        super(1);
        this.f118600d = nwVar;
        this.f118601e = list;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        mm2.o4 o4Var;
        java.util.List list;
        int intValue = ((java.lang.Number) obj).intValue();
        com.tencent.mm.plugin.finder.live.widget.nw nwVar = this.f118600d;
        java.util.List list2 = this.f118601e;
        java.lang.Object obj2 = null;
        az2.f a17 = az2.c.a(az2.f.f16125d, nwVar.f118381d, null, 0L, null, 14, null);
        a17.a();
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = dk2.ef.f233380e;
        if (k0Var != null && (o4Var = (mm2.o4) k0Var.business(mm2.o4.class)) != null && (list = o4Var.f329327v) != null) {
            synchronized (list) {
                java.util.Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    if (com.tencent.mm.sdk.platformtools.t8.D0(((km2.q) next).f309170a, ((mm2.c1) k0Var.business(mm2.c1.class)).m8())) {
                        obj2 = next;
                        break;
                    }
                }
            }
            obj2 = (km2.q) obj2;
        }
        if ((obj2 != null) && (nwVar.f118381d instanceof android.app.Activity)) {
            a17.b();
            if (k0Var != null) {
                android.content.Context context = nwVar.f118381d;
                kotlin.jvm.internal.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                k0Var.showAlertDialog((android.app.Activity) context, "", nwVar.f118381d.getResources().getString(com.tencent.mm.R.string.eij), "");
            }
        } else {
            new ke2.m0(xy2.c.e(nwVar.f118381d), intValue, null, null, new com.tencent.mm.plugin.finder.live.widget.mw(a17, intValue, list2, nwVar), 12, null).l();
        }
        return jz5.f0.f302826a;
    }
}
