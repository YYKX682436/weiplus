package or1;

/* loaded from: classes9.dex */
public class k0 implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView f347522d;

    public k0(com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView) {
        this.f347522d = enterpriseBizContactListView;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView = this.f347522d;
        if (enterpriseBizContactListView.f94019x == null) {
            enterpriseBizContactListView.f94019x = new or1.s0(enterpriseBizContactListView);
        }
        or1.s0 s0Var = enterpriseBizContactListView.f94019x;
        int i18 = enterpriseBizContactListView.f94020y;
        int i19 = enterpriseBizContactListView.f94021z;
        if (s0Var.f347568e == null) {
            com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView enterpriseBizContactListView2 = (com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListView) s0Var.f347570g.get();
            if (enterpriseBizContactListView2 == null) {
                return false;
            }
            s0Var.f347568e = new al5.y1(enterpriseBizContactListView2.getContext());
        }
        java.lang.Object tag = view.getTag();
        if (tag == null || !(tag instanceof or1.u0)) {
            return false;
        }
        java.lang.String str = ((or1.u0) tag).f347578a;
        s0Var.f347567d = str;
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return false;
        }
        rv.u2 u2Var = (rv.u2) i95.n0.c(rv.u2.class);
        java.lang.String str2 = s0Var.f347567d;
        ((qv.o) u2Var).getClass();
        if (r01.z.g(str2)) {
            return false;
        }
        al5.y1 y1Var = s0Var.f347568e;
        y1Var.f397350t = view;
        y1Var.g(adapterView, i17, j17, new or1.o0(s0Var, i17), new or1.p0(s0Var), i18, i19);
        return true;
    }
}
