package df2;

/* loaded from: classes3.dex */
public final class d4 extends if2.b implements if2.e {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f229938m;

    /* renamed from: n, reason: collision with root package name */
    public xt2.r5 f229939n;

    /* renamed from: o, reason: collision with root package name */
    public final androidx.lifecycle.j0 f229940o;

    /* renamed from: p, reason: collision with root package name */
    public final androidx.lifecycle.j0 f229941p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f229938m = "FinderLiveShoppingQuestionController";
        this.f229940o = new androidx.lifecycle.j0(null);
        this.f229941p = new androidx.lifecycle.j0(java.lang.Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        if (r0 == 0) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Z6() {
        /*
            r5 = this;
            zl2.r4 r0 = zl2.r4.f473950a
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore r1 = r5.getStore()
            gk2.e r1 = r1.getLiveRoomData()
            boolean r0 = r0.y1(r1)
            r1 = 0
            if (r0 != 0) goto L64
            java.lang.Class<mm2.e0> r0 = mm2.e0.class
            androidx.lifecycle.c1 r0 = r5.business(r0)
            mm2.e0 r0 = (mm2.e0) r0
            androidx.lifecycle.j0 r0 = r0.f328970m
            java.lang.Object r0 = r0.getValue()
            r45.qm1 r0 = (r45.qm1) r0
            java.lang.Class<df2.xw> r2 = df2.xw.class
            r3 = 1
            if (r0 == 0) goto L2e
            int r0 = r0.getInteger(r1)
            int r4 = qs5.v.f366472a
            if (r0 != 0) goto L41
        L2e:
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r5.controller(r2)
            df2.xw r0 = (df2.xw) r0
            if (r0 == 0) goto L3c
            boolean r0 = r0.f231815s
            if (r0 != 0) goto L3c
            r0 = r3
            goto L3d
        L3c:
            r0 = r1
        L3d:
            if (r0 == 0) goto L41
            r0 = r3
            goto L42
        L41:
            r0 = r1
        L42:
            if (r0 == 0) goto L64
            java.lang.Class<mm2.f6> r0 = mm2.f6.class
            androidx.lifecycle.c1 r0 = r5.business(r0)
            mm2.f6 r0 = (mm2.f6) r0
            boolean r0 = r0.f329035i
            if (r0 == 0) goto L64
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController r0 = r5.controller(r2)
            df2.xw r0 = (df2.xw) r0
            if (r0 == 0) goto L60
            boolean r0 = r0.e7()
            if (r0 != r3) goto L60
            r0 = r3
            goto L61
        L60:
            r0 = r1
        L61:
            if (r0 == 0) goto L64
            r1 = r3
        L64:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: df2.d4.Z6():boolean");
    }

    public final android.widget.CheckBox a7() {
        android.view.View c76 = c7();
        if (c76 != null) {
            return (android.widget.CheckBox) c76.findViewById(com.tencent.mm.R.id.btf);
        }
        return null;
    }

    public final android.view.View b7() {
        android.view.View h17 = h();
        if (h17 != null) {
            return h17.findViewById(com.tencent.mm.R.id.rfm);
        }
        return null;
    }

    public final android.view.View c7() {
        android.view.View h17 = h();
        if (h17 != null) {
            return h17.findViewById(com.tencent.mm.R.id.rgd);
        }
        return null;
    }

    public final boolean d7() {
        if (!Z6()) {
            return false;
        }
        android.widget.CheckBox a76 = a7();
        return a76 != null && a76.isChecked();
    }

    public final android.view.View h() {
        com.tencent.mm.plugin.finder.live.plugin.et etVar = (com.tencent.mm.plugin.finder.live.plugin.et) R6(com.tencent.mm.plugin.finder.live.plugin.et.class);
        if (etVar != null) {
            return etVar.f365323d;
        }
        return null;
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        this.f229939n = null;
    }
}
