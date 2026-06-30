package gq2;

/* loaded from: classes2.dex */
public final class c implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gq2.d f274549d;

    public c(gq2.d dVar) {
        this.f274549d = dVar;
    }

    @Override // oa.c
    public void h0(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
    }

    @Override // oa.c
    public void l4(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        boolean z17 = obj instanceof gq2.a;
        gq2.d dVar = this.f274549d;
        if (z17) {
            gq2.a aVar = (gq2.a) obj;
            dVar.getClass();
            android.widget.TextView textView = aVar.f274546d;
            if (textView != null) {
                android.view.View view = aVar.f274544b.f343783f;
                kotlin.jvm.internal.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_5_Night_Mode));
            }
            aVar.a(false);
        }
        com.google.android.material.tabs.TabLayout tabLayout = dVar.f274553d;
        if (tabLayout != null) {
            tabLayout.announceForAccessibility(dVar.f274550a.getString(com.tencent.mm.R.string.ech, java.lang.String.valueOf(t17.f343780c)));
        }
    }

    @Override // oa.c
    public void u1(oa.i t17) {
        kotlin.jvm.internal.o.g(t17, "t");
        java.lang.Object obj = t17.f343778a;
        if (obj instanceof gq2.a) {
            gq2.a aVar = (gq2.a) obj;
            gq2.d dVar = this.f274549d;
            dVar.getClass();
            android.widget.TextView textView = aVar.f274546d;
            if (textView != null) {
                android.view.View view = aVar.f274544b.f343783f;
                kotlin.jvm.internal.o.d(view);
                textView.setTextColor(view.getContext().getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_9_Night_Mode));
            }
            aVar.a(true);
            dVar.f274552c.invoke(java.lang.Integer.valueOf(t17.f343782e));
            com.tencent.mars.xlog.Log.i("Finder.LiveTabListConvert", "onTabSelected position = " + t17.f343782e);
        }
    }
}
