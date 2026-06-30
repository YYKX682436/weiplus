package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes10.dex */
public final class yo extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public final int f136596d;

    /* renamed from: e, reason: collision with root package name */
    public int f136597e;

    /* renamed from: f, reason: collision with root package name */
    public int f136598f;

    /* renamed from: g, reason: collision with root package name */
    public db2.g4 f136599g;

    /* renamed from: h, reason: collision with root package name */
    public db2.n4 f136600h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f136601i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f136596d = 1;
        this.f136597e = 1;
    }

    public static final void O6(com.tencent.mm.plugin.finder.viewmodel.component.yo yoVar, int i17) {
        switch (i17) {
            case -8003:
                db5.e1.i(yoVar.getActivity(), com.tencent.mm.R.string.f492069f45, 0);
                return;
            case -8002:
                db5.e1.i(yoVar.getActivity(), com.tencent.mm.R.string.cwu, 0);
                return;
            case -8001:
                db5.e1.i(yoVar.getActivity(), com.tencent.mm.R.string.cv_, 0);
                return;
            default:
                yoVar.getClass();
                return;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:349:0x07b0  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x0877  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void P6(com.tencent.mm.plugin.finder.viewmodel.component.yo r24, boolean r25, com.tencent.mm.protocal.protobuf.FinderObject r26, long r27) {
        /*
            Method dump skipped, instructions count: 2179
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.yo.P6(com.tencent.mm.plugin.finder.viewmodel.component.yo, boolean, com.tencent.mm.protocal.protobuf.FinderObject, long):void");
    }

    public final void Q6(dm.pd pdVar) {
        int i17 = this.f136596d == 1 ? 7 : 5;
        if (com.tencent.mm.plugin.finder.presenter.contract.FinderNotifyContract.f123002a.b(pdVar, getContext())) {
            return;
        }
        long j17 = pdVar.field_objectId;
        java.lang.String str = pdVar.field_objectNonceId;
        int i18 = this.f136596d;
        android.app.Activity context = getContext();
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = context instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class) : null;
        db2.g4 g4Var = new db2.g4(j17, str, i17, i18, "", true, null, null, 0L, null, false, false, null, nyVar != null ? nyVar.V6() : null, 0, null, false, null, null, null, null, null, 0, 0, null, null, false, null, null, 536862656, null);
        this.f136599g = g4Var;
        g4Var.l().h(new com.tencent.mm.plugin.finder.viewmodel.component.xo(this, pdVar, i17));
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String e17;
        java.lang.String str = "";
        if (this.f136596d == 1 && (e17 = xy2.c.e(getContext())) != null) {
            str = e17;
        }
        this.f136601i = str;
    }
}
