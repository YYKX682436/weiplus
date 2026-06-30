package com.tencent.mm.ui.tools;

/* loaded from: classes3.dex */
public class pb implements db5.d8 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.ShowImageUI f210642a;

    public pb(com.tencent.mm.ui.tools.ShowImageUI showImageUI) {
        this.f210642a = showImageUI;
    }

    @Override // db5.d8
    public void a() {
        com.tencent.mm.ui.tools.ShowImageUI showImageUI = this.f210642a;
        boolean z17 = showImageUI.f210200p;
        if (z17) {
            if (z17) {
                android.view.View findViewById = showImageUI.findViewById(com.tencent.mm.R.id.ght);
                android.view.View findViewById2 = showImageUI.findViewById(com.tencent.mm.R.id.v5i);
                findViewById2.setBackgroundColor(showImageUI.getResources().getColor(com.tencent.mm.R.color.f478712f3));
                android.widget.RelativeLayout relativeLayout = showImageUI.f210202r;
                if (relativeLayout != null) {
                    oa5.b.b(relativeLayout).k(new com.tencent.mm.ui.tools.ra(showImageUI, findViewById)).o(new com.tencent.mm.ui.tools.qa(showImageUI, findViewById, findViewById2)).g(150L).l();
                }
            }
            showImageUI.a7(false);
            return;
        }
        if (!z17) {
            android.view.View findViewById3 = showImageUI.findViewById(com.tencent.mm.R.id.ght);
            showImageUI.setNavigationbarColor(showImageUI.getResources().getColor(com.tencent.mm.R.color.f478491c));
            android.view.View findViewById4 = showImageUI.findViewById(com.tencent.mm.R.id.v5i);
            findViewById4.setBackgroundColor(showImageUI.getResources().getColor(com.tencent.mm.R.color.f478491c));
            android.widget.RelativeLayout relativeLayout2 = showImageUI.f210202r;
            if (relativeLayout2 != null) {
                oa5.b.b(relativeLayout2).k(new com.tencent.mm.ui.tools.ta(showImageUI, findViewById3)).o(new com.tencent.mm.ui.tools.sa(showImageUI, findViewById3, findViewById4)).g(150L).l();
            }
        }
        showImageUI.a7(true);
    }

    @Override // db5.d8
    public void b() {
    }
}
