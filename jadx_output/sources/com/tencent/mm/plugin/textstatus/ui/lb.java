package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class lb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174055d;

    public lb(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174055d = textStatusEditActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        pj4.k2 k2Var;
        java.util.ArrayList<java.lang.String> arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(view);
        java.lang.Object[] array = arrayList2.toArray();
        arrayList2.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$visibilityClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174055d;
        android.content.Intent className = textStatusEditActivity.C7() ? new android.content.Intent().setClassName(textStatusEditActivity, "com.tencent.mm.plugin.textstatus.ui.TextStatusNewLabelUI") : new android.content.Intent().setClassName(textStatusEditActivity, "com.tencent.mm.plugin.sns.ui.SnsLabelUI");
        kotlin.jvm.internal.o.d(className);
        if (textStatusEditActivity.C7() && (arrayList = textStatusEditActivity.f173573c2) != null) {
            className.putStringArrayListExtra("label_id", arrayList);
        }
        className.putExtra("KLabel_range_index", textStatusEditActivity.Y1);
        className.putExtra("Klabel_name_list", textStatusEditActivity.Z1);
        className.putExtra("Kother_user_name_list", textStatusEditActivity.f173571a2);
        className.putExtra("Kchat_room_name_list", textStatusEditActivity.f173572b2);
        className.putExtra("k_show_private", false);
        className.putExtra("k_show_include", false);
        textStatusEditActivity.getClass();
        className.putExtra("k_sns_label_ui_style", 0);
        if (textStatusEditActivity.Y1 == 0 && (k2Var = (pj4.k2) ((jz5.n) textStatusEditActivity.f173581g2).getValue()) != null) {
            className.putExtra("k_last_range_visible_state", k2Var.f355159d);
            className.putExtra("k_last_range_label_list", k2Var.f355161f);
            className.putExtra("k_last_range_user_list", k2Var.f355160e);
        }
        textStatusEditActivity.startActivityForResult(className, 4);
        nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
        androidx.appcompat.app.AppCompatActivity context = textStatusEditActivity.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(context, 8, pj4.h2.class);
        if (h2Var != null) {
            h2Var.I++;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/TextStatusEditActivity$visibilityClickListener$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
