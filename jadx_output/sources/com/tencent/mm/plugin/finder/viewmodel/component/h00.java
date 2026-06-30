package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class h00 extends com.tencent.mm.ui.component.UIComponent implements xw2.u {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f134566d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.viewmodel.component.oz f134567e;

    /* renamed from: f, reason: collision with root package name */
    public final kotlinx.coroutines.flow.j2 f134568f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.assist.i0 f134569g;

    /* renamed from: h, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f134570h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h00(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        this.f134566d = uuid;
        this.f134568f = kotlinx.coroutines.flow.i3.a(new xw2.t(0, -1, 4));
        this.f134569g = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        kotlinx.coroutines.y0 a17 = kotlinx.coroutines.z0.a(((t26.a) kotlinx.coroutines.internal.b0.f310484a).f415347h.plus(kotlinx.coroutines.t3.a(null, 1, null)));
        this.f134570h = a17;
        androidx.lifecycle.c1 a18 = pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        kotlin.jvm.internal.o.f(a18, "get(...)");
        kotlinx.coroutines.l.d(a17, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.kz(this, null), 3, null);
    }

    public static final java.util.Map O6(com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var, com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar, int i17, int i18) {
        int i19 = (i17 * ((xw2.t) ((kotlinx.coroutines.flow.h3) h00Var.f134568f).getValue()).f457726c) + i18;
        com.tencent.mm.plugin.finder.report.u3 u3Var = com.tencent.mm.plugin.finder.report.u3.f125383a;
        androidx.appcompat.app.AppCompatActivity activity = h00Var.getActivity();
        java.lang.String str = lzVar.f135100d;
        com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127646ch).getValue()).r()).booleanValue();
        kotlin.jvm.internal.o.g(activity, "activity");
        java.lang.String uuid = h00Var.f134566d;
        kotlin.jvm.internal.o.g(uuid, "uuid");
        r45.qt2 b17 = u3Var.b(activity);
        com.tencent.mm.plugin.finder.viewmodel.component.nz.f135400e.getClass();
        com.tencent.mm.plugin.finder.viewmodel.component.nz nzVar = booleanValue ? com.tencent.mm.plugin.finder.viewmodel.component.nz.f135402g : com.tencent.mm.plugin.finder.viewmodel.component.nz.f135401f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FollowFreqReport] bind_avatar_personal_center follow_frequently_viewed_module=");
        int i27 = nzVar.f135404d;
        sb6.append(i27);
        sb6.append(" view_id=person_center_frequently_read comment_scene=95 avatar_finder_username=");
        sb6.append(str);
        sb6.append(" avatar_index=");
        sb6.append(i19);
        sb6.append(" if_have_greendot=");
        boolean z17 = lzVar.f135099c;
        sb6.append(z17 ? "1" : "0");
        sb6.append(" ref_commentscene=");
        sb6.append(b17 != null ? java.lang.Integer.valueOf(b17.getInteger(7)) : null);
        sb6.append(" finder_context_id=");
        sb6.append(b17 != null ? b17.getString(1) : null);
        sb6.append(" finder_tab_context_id=");
        sb6.append(b17 != null ? b17.getString(2) : null);
        com.tencent.mars.xlog.Log.i("Finder.SelfReporter", sb6.toString());
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("avatar_finder_username", str);
        lVarArr[1] = new jz5.l("if_have_greendot", z17 ? "1" : "0");
        lVarArr[2] = new jz5.l("avatar_uuid", uuid);
        lVarArr[3] = new jz5.l("avatar_index", java.lang.Integer.valueOf(i19));
        lVarArr[4] = new jz5.l("comment_scene", 95);
        lVarArr[5] = new jz5.l("follow_frequently_viewed_module", java.lang.Integer.valueOf(i27));
        java.util.Map l17 = kz5.c1.l(lVarArr);
        l17.putAll(u3Var.a(b17));
        return l17;
    }

    public static final void P6(com.tencent.mm.plugin.finder.viewmodel.component.h00 h00Var, com.tencent.mm.plugin.finder.viewmodel.component.lz lzVar, int i17, int i18) {
        h00Var.getClass();
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) h00Var.getActivity(), 1, true);
        k0Var.f211872n = com.tencent.mm.plugin.finder.viewmodel.component.yz.f136621d;
        com.tencent.mm.plugin.finder.viewmodel.component.b00 b00Var = new com.tencent.mm.plugin.finder.viewmodel.component.b00(h00Var, lzVar, i17, i18);
        android.view.View view = k0Var.S;
        if (view == null) {
            view = k0Var.Q1;
        }
        android.view.View view2 = view;
        k0Var.f211881s = new com.tencent.mm.plugin.finder.viewmodel.component.a00(view2, "person_center_remove_frequently_read", h00Var, lzVar, i17, i18);
        kotlin.jvm.internal.o.d(view2);
        hc2.v0.d(view2, "person_center_remove_frequently_read", "view_exp", false, null, b00Var, 12, null);
        k0Var.v();
    }

    public final java.lang.String Q6() {
        java.lang.String name;
        com.tencent.mm.plugin.finder.viewmodel.component.oz ozVar = this.f134567e;
        return (ozVar == null || (name = ozVar.name()) == null) ? "uninitialized" : name;
    }

    public final void R6(com.tencent.mm.plugin.finder.viewmodel.component.oz pageType) {
        kotlin.jvm.internal.o.g(pageType, "pageType");
        com.tencent.mm.plugin.finder.viewmodel.component.oz ozVar = this.f134567e;
        if (ozVar != null && ozVar != pageType) {
            com.tencent.mars.xlog.Log.w("Finder.SelfOftenReadAuthorUIC", "initOftenReadAuthor[" + Q6() + "] pageType override: " + this.f134567e + " -> " + pageType);
        }
        this.f134567e = pageType;
        com.tencent.mars.xlog.Log.i("Finder.SelfOftenReadAuthorUIC", "initOftenReadAuthor[" + Q6() + "] start");
        com.tencent.mm.plugin.finder.viewmodel.component.bh.f133877a.e(getActivity(), false);
    }

    public void S6(kotlinx.coroutines.flow.j flow, yz5.p transform, kotlinx.coroutines.flow.k collector) {
        kotlin.jvm.internal.o.g(flow, "flow");
        kotlin.jvm.internal.o.g(transform, "transform");
        kotlin.jvm.internal.o.g(collector, "collector");
        kotlinx.coroutines.l.d(this.f134570h, null, null, new com.tencent.mm.plugin.finder.viewmodel.component.uz(flow, transform, collector, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0049  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void T6(android.view.View r9, com.tencent.mm.plugin.finder.viewmodel.component.lz r10, int r11, int r12) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.viewmodel.component.h00.T6(android.view.View, com.tencent.mm.plugin.finder.viewmodel.component.lz, int, int):void");
    }

    public void U6(android.view.View view, com.tencent.mm.plugin.finder.viewmodel.component.lz item, int i17, int i18) {
        kotlin.jvm.internal.o.g(view, "view");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("Finder.SelfOftenReadAuthorUIC", "onItemLongClicked[" + Q6() + "]: item=" + item);
        if (this.f134567e == com.tencent.mm.plugin.finder.viewmodel.component.oz.f135491e) {
            androidx.appcompat.app.AppCompatActivity activity = getActivity();
            java.lang.String string = getActivity().getString(com.tencent.mm.R.string.oyk);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            qd2.k.a(activity, view, string, new com.tencent.mm.plugin.finder.viewmodel.component.d00(view, "person_center_remove_frequently_read", this, item, i17, i18));
            hc2.v0.d(view, "person_center_remove_frequently_read", "view_exp", false, null, new com.tencent.mm.plugin.finder.viewmodel.component.e00(this, item, i17, i18), 12, null);
            return;
        }
        rl5.r rVar = new rl5.r(view.getContext(), view);
        rVar.C = true;
        rVar.f397355y = new com.tencent.mm.plugin.finder.viewmodel.component.f00(view);
        rVar.f397354x = new com.tencent.mm.plugin.finder.viewmodel.component.g00(this, item, i17, i18);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        rVar.n(iArr[0] + (view.getWidth() / 2), iArr[1]);
    }

    @Override // pf5.o, pf5.e, androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        kotlinx.coroutines.z0.e(this.f134570h, null, 1, null);
    }
}
