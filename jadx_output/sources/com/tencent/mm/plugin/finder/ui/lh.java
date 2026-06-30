package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes2.dex */
public final class lh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI f129481d;

    public lh(com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI finderSettingPersonalizedUI) {
        this.f129481d = finderSettingPersonalizedUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.protocal.protobuf.FinderJumpInfo finderJumpInfo;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI$getBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.ui.FinderSettingPersonalizedUI finderSettingPersonalizedUI = this.f129481d;
        r45.il5 il5Var = finderSettingPersonalizedUI.f128743h;
        if (il5Var != null && (finderJumpInfo = (com.tencent.mm.protocal.protobuf.FinderJumpInfo) il5Var.getCustom(3)) != null) {
            xc2.y2 y2Var = xc2.y2.f453343a;
            androidx.appcompat.app.AppCompatActivity context = finderSettingPersonalizedUI.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            xc2.y2.i(y2Var, context, new xc2.p0(finderJumpInfo), 0, null, 12, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSettingPersonalizedUI$getBottomView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
