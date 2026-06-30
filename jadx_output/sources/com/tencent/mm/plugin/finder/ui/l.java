package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes3.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderActivityDescUI f129449d;

    public l(com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI) {
        this.f129449d = finderActivityDescUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderActivityDescUI finderActivityDescUI = this.f129449d;
        r45.e21 e21Var = finderActivityDescUI.L;
        finderActivityDescUI.getClass();
        if (e21Var != null) {
            com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) e21Var.getCustom(15);
            if (finderJumpInfo != null) {
                finderActivityDescUI.f7(e21Var, finderJumpInfo);
            } else {
                finderJumpInfo = null;
            }
            if (finderJumpInfo == null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) e21Var.getCustom(1);
                if (finderContact == null || (str = finderContact.getUsername()) == null) {
                    str = "";
                }
                sb6.append(str);
                sb6.append(':');
                sb6.append(com.tencent.mm.sdk.platformtools.t8.s0());
                java.lang.String sb7 = sb6.toString();
                com.tencent.mm.plugin.finder.assist.i0 i0Var = (com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                androidx.appcompat.app.AppCompatActivity context = finderActivityDescUI.getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                java.lang.String string = e21Var.getString(9);
                java.lang.String str2 = string == null ? "" : string;
                java.lang.String string2 = e21Var.getString(10);
                i0Var.ll(context, str2, string2 == null ? "" : string2, com.tencent.mm.plugin.appbrand.jsapi.profile.n.CTRL_INDEX, sb7);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderActivityDescUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
