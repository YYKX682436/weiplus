package pk2;

/* loaded from: classes3.dex */
public final class e4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.f4 f355705d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f355706e;

    public e4(pk2.f4 f4Var, pk2.o9 o9Var) {
        this.f355705d = f4Var;
        this.f355706e = o9Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        pk2.g8 g8Var;
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        dk2.ef efVar = dk2.ef.f233372a;
        gk2.e eVar = dk2.ef.I;
        if (eVar != null) {
            java.lang.Integer valueOf = menuItem != null ? java.lang.Integer.valueOf(menuItem.getItemId()) : null;
            pk2.f4 f4Var = this.f355705d;
            int i18 = f4Var.f355732j;
            pk2.o9 o9Var2 = this.f355706e;
            if (valueOf != null && valueOf.intValue() == i18) {
                pk2.f4.E(f4Var);
                if (efVar.k(eVar) != null) {
                    com.tencent.mm.ui.MMActivity context = o9Var2.f356078d;
                    kotlin.jvm.internal.o.g(context, "context");
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("key_media_type", 2);
                    intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
                    j45.l.v(context, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent, 3);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var = f4Var.f355736n;
                if (k0Var != null) {
                    k0Var.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == 0) {
                pk2.f4.E(f4Var);
                if (efVar.k(eVar) != null) {
                    com.tencent.mm.ui.MMActivity context2 = o9Var2.f356078d;
                    kotlin.jvm.internal.o.g(context2, "context");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.putExtra("key_media_type", 2);
                    intent2.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 4);
                    j45.l.v(context2, "com.tencent.mm.pluginsdk.ui.tools.FileSelectorUI", intent2, 1);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var2 = f4Var.f355736n;
                if (k0Var2 != null) {
                    k0Var2.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == f4Var.f355733k) {
                pk2.f4.E(f4Var);
                dk2.xf k17 = efVar.k(eVar);
                if (k17 != null) {
                    ((dk2.r4) k17).X(o9Var2.f356078d, 4);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var3 = f4Var.f355736n;
                if (k0Var3 != null) {
                    k0Var3.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == f4Var.f355730h) {
                pk2.f4.E(f4Var);
                dk2.xf k18 = efVar.k(eVar);
                if (k18 != null) {
                    ((dk2.r4) k18).X(o9Var2.f356078d, 2);
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var4 = f4Var.f355736n;
                if (k0Var4 != null) {
                    k0Var4.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == f4Var.f355731i) {
                pk2.d9 d9Var = o9Var2.f356082f;
                if (d9Var != null && (g8Var = d9Var.f355658a) != null && (o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) ((pk2.k9) g8Var).f355924a.R6(com.tencent.mm.plugin.finder.live.plugin.o9.class)) != null) {
                    o9Var.E1();
                }
                com.tencent.mm.ui.widget.dialog.k0 k0Var5 = f4Var.f355736n;
                if (k0Var5 != null) {
                    k0Var5.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == f4Var.f355734l) {
                pk2.f4.D(f4Var);
                android.content.Intent intent3 = new android.content.Intent(o9Var2.f356078d, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI.class);
                com.tencent.mm.ui.MMActivity mMActivity = o9Var2.f356078d;
                kotlin.jvm.internal.o.e(mMActivity, "null cannot be cast to non-null type android.app.Activity");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(5);
                arrayList.add(intent3);
                java.util.Collections.reverse(arrayList);
                yj0.a.k(mMActivity, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorScreenShareOption$menuItemClickListener$1", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                com.tencent.mm.ui.widget.dialog.k0 k0Var6 = f4Var.f355736n;
                if (k0Var6 != null) {
                    k0Var6.u();
                    return;
                }
                return;
            }
            if (valueOf != null && valueOf.intValue() == f4Var.f355735m) {
                pk2.f4.D(f4Var);
                android.content.Intent intent4 = new android.content.Intent(o9Var2.f356078d, (java.lang.Class<?>) com.tencent.mm.plugin.finder.feed.ui.FinderLiveBizListUI.class);
                com.tencent.mm.ui.MMActivity mMActivity2 = o9Var2.f356078d;
                kotlin.jvm.internal.o.e(mMActivity2, "null cannot be cast to non-null type android.app.Activity");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(5);
                arrayList2.add(intent4);
                java.util.Collections.reverse(arrayList2);
                yj0.a.k(mMActivity2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorScreenShareOption$menuItemClickListener$1", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
                com.tencent.mm.ui.widget.dialog.k0 k0Var7 = f4Var.f355736n;
                if (k0Var7 != null) {
                    k0Var7.u();
                }
            }
        }
    }
}
