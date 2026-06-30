package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes10.dex */
public final class l8 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity f174051d;

    public l8(com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity) {
        this.f174051d = textStatusEditActivity;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        java.lang.CharSequence text;
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity textStatusEditActivity = this.f174051d;
        if (itemId == com.tencent.mm.R.id.jgs) {
            nd0.e eVar = (nd0.e) i95.n0.c(nd0.e.class);
            androidx.appcompat.app.AppCompatActivity context = textStatusEditActivity.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            pj4.h2 h2Var = (pj4.h2) ((md0.e) eVar).Ui(context, 8, pj4.h2.class);
            if (h2Var != null) {
                h2Var.U++;
            }
            com.tencent.mm.plugin.textstatus.ui.d8 d8Var = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
            textStatusEditActivity.r7();
            return;
        }
        if (itemId == com.tencent.mm.R.id.jgx) {
            nd0.e eVar2 = (nd0.e) i95.n0.c(nd0.e.class);
            androidx.appcompat.app.AppCompatActivity context2 = textStatusEditActivity.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pj4.h2 h2Var2 = (pj4.h2) ((md0.e) eVar2).Ui(context2, 8, pj4.h2.class);
            if (h2Var2 != null) {
                h2Var2.V++;
            }
            com.tencent.mm.plugin.textstatus.ui.d8 d8Var2 = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
            android.content.Intent intent = new android.content.Intent();
            ((qc0.k1) i95.n0.c(qc0.k1.class)).getClass();
            intent.putExtra("key_edit_video_max_time_length", ((tt3.a) tt3.b.f422037b.a()).f422036i);
            intent.putExtra("key_edit_text_color", "#0E9CE6");
            intent.putExtra("album_is_from_text_status", true);
            intent.putExtra("edt_video_layout_from_text_status", "com.tencent.mm.plugin.textstatus.ui.TextStatusEditVideoPluginLayout");
            intent.putExtra("is_hide_album_footer", true);
            vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
            androidx.appcompat.app.AppCompatActivity context3 = textStatusEditActivity.getContext();
            kotlin.jvm.internal.o.e(context3, "null cannot be cast to non-null type android.app.Activity");
            ((ub0.r) oVar).getClass();
            com.tencent.mm.pluginsdk.ui.tools.l7.c(context3, 6, 1, 22, 3, false, intent);
            return;
        }
        if (itemId != com.tencent.mm.R.id.jgw) {
            if (itemId == com.tencent.mm.R.id.jgv) {
                nd0.e eVar3 = (nd0.e) i95.n0.c(nd0.e.class);
                androidx.appcompat.app.AppCompatActivity context4 = textStatusEditActivity.getContext();
                kotlin.jvm.internal.o.f(context4, "getContext(...)");
                pj4.h2 h2Var3 = (pj4.h2) ((md0.e) eVar3).Ui(context4, 8, pj4.h2.class);
                if (h2Var3 != null) {
                    h2Var3.E1++;
                }
                com.tencent.mm.plugin.textstatus.ui.d8 d8Var3 = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
                textStatusEditActivity.V6();
                return;
            }
            return;
        }
        com.tencent.mm.plugin.textstatus.ui.d8 d8Var4 = com.tencent.mm.plugin.textstatus.ui.TextStatusEditActivity.f173566u2;
        android.text.Editable text2 = textStatusEditActivity.i7().getText();
        pj4.y yVar = new pj4.y();
        pj4.o0 o0Var = textStatusEditActivity.e7().f354975g;
        yVar.f355337d = o0Var != null ? o0Var.f355214e : null;
        java.util.regex.Matcher matcher = bk4.e1.f21461b.matcher(text2.toString());
        while (matcher.find()) {
            yVar.f355340g.add(matcher.group(1));
        }
        android.widget.TextView textView = textStatusEditActivity.f173578f;
        if (textView == null || (text = textView.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        yVar.f355338e = str;
        yVar.f355339f = text2.toString();
        android.content.Intent intent2 = new android.content.Intent();
        intent2.putExtra("BIZ_SCENE", 1);
        intent2.putExtra("EXT_BUFF", yVar.toByteArray());
        java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(1);
        arrayList.add(5);
        arrayList.add(3);
        intent2.putIntegerArrayListExtra("TAB_LIST", arrayList);
        textStatusEditActivity.overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477728p);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).yj(textStatusEditActivity, intent2, 8);
    }
}
