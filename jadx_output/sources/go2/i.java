package go2;

/* loaded from: classes2.dex */
public final class i implements zy2.hc {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.profile.widget.s4 f273984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ go2.z f273985b;

    public i(com.tencent.mm.plugin.finder.profile.widget.s4 s4Var, go2.z zVar) {
        this.f273984a = s4Var;
        this.f273985b = zVar;
    }

    @Override // zy2.hc
    public void a(java.util.List noticeList, int i17, r45.c32 c32Var, boolean z17) {
        java.lang.String str;
        r45.j32 j32Var;
        r45.h32 h32Var;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var;
        kotlin.jvm.internal.o.g(noticeList, "noticeList");
        com.tencent.mm.plugin.finder.profile.widget.s4 s4Var = this.f273984a;
        kk.l lVar = s4Var.f124754h;
        go2.z zVar = this.f273985b;
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var2 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar.get(zVar.D);
        kk.l lVar2 = s4Var.f124754h;
        if (l2Var2 != null && (h32Var = l2Var2.f123916e) != null) {
            java.util.Iterator it = noticeList.iterator();
            while (it.hasNext()) {
                r45.h32 h32Var2 = (r45.h32) it.next();
                if (kotlin.jvm.internal.o.b(h32Var.getString(4), h32Var2.getString(4)) && (l2Var = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar2.get(zVar.D)) != null) {
                    l2Var.f123916e = h32Var2;
                }
            }
        }
        r45.tr0 tr0Var = (r45.tr0) zVar.f452719d;
        boolean z18 = tr0Var != null && tr0Var.f386726g == 2;
        com.tencent.mm.plugin.finder.profile.widget.s1 s1Var = zVar.B;
        if (s1Var == null) {
            kotlin.jvm.internal.o.o("headerLiveWidget");
            throw null;
        }
        java.lang.String str2 = zVar.D;
        ya2.b2 b17 = ya2.h.f460484a.b(str2);
        com.tencent.mm.plugin.finder.profile.uic.l2 l2Var3 = (com.tencent.mm.plugin.finder.profile.uic.l2) lVar2.get(zVar.D);
        if (l2Var3 == null || (j32Var = l2Var3.f123923l) == null || (str = j32Var.getString(5)) == null) {
            androidx.appcompat.app.AppCompatActivity activity = zVar.getActivity();
            kotlin.jvm.internal.o.g(activity, "activity");
            str = ((go2.c0) pf5.z.f353948a.a(activity).a(go2.c0.class)).f273959z;
        }
        java.lang.String str3 = str;
        kotlin.jvm.internal.o.d(str3);
        s1Var.a("moreLiveListWidget-onDismiss", str2, false, z18, z18, b17, str3);
        android.view.View view = zVar.f274099v;
        if (view == null) {
            kotlin.jvm.internal.o.o("curLiveLayout");
            throw null;
        }
        if (view.getVisibility() == 0) {
            com.tencent.mm.plugin.finder.profile.widget.s1 s1Var2 = zVar.B;
            if (s1Var2 != null) {
                s1Var2.j(zVar.D);
            } else {
                kotlin.jvm.internal.o.o("headerLiveWidget");
                throw null;
            }
        }
    }
}
