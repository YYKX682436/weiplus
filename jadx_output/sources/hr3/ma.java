package hr3;

/* loaded from: classes11.dex */
public class ma implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hr3.oa f283799d;

    public ma(hr3.oa oaVar) {
        this.f283799d = oaVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        hr3.oa oaVar = this.f283799d;
        if (itemId == 1) {
            hr3.va vaVar = oaVar.f283859f;
            vaVar.a(vaVar.f284109e.L.d1());
            return;
        }
        if (itemId == 5) {
            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference = oaVar.f283859f.f284109e;
            android.content.Context context = normalUserFooterPreference.f197770d;
            db5.e1.u(context, context.getString(com.tencent.mm.storage.z3.m4(normalUserFooterPreference.L.d1()) ? com.tencent.mm.R.string.bfe : com.tencent.mm.R.string.bfd), oaVar.f283859f.f284109e.f197770d.getString(com.tencent.mm.R.string.bfc), new hr3.la(this), null);
        } else {
            if (itemId != 8) {
                return;
            }
            hr3.va vaVar2 = oaVar.f283859f;
            com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference normalUserFooterPreference2 = vaVar2.f284109e;
            c01.e2.F0(normalUserFooterPreference2.L);
            normalUserFooterPreference2.L.r3();
            if (normalUserFooterPreference2.X) {
                normalUserFooterPreference2.H1.setVisibility(8);
                vaVar2.f();
            }
        }
    }
}
