package s61;

/* loaded from: classes15.dex */
public class g implements r61.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI f403351a;

    public g(com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI) {
        this.f403351a = findMContactAddUI;
    }

    @Override // r61.l0
    public void notifyDataSetChanged() {
        com.tencent.mm.plugin.account.friend.ui.FindMContactAddUI findMContactAddUI = this.f403351a;
        int i17 = findMContactAddUI.f73128t;
        if (i17 == 2) {
            findMContactAddUI.f73124p.setText(findMContactAddUI.getString(com.tencent.mm.R.string.cg8, java.lang.Integer.valueOf(findMContactAddUI.f73117f.getCount())));
        } else if (i17 == 1) {
            findMContactAddUI.f73124p.setText(findMContactAddUI.getString(com.tencent.mm.R.string.cg9));
        } else {
            findMContactAddUI.f73124p.setText(findMContactAddUI.getString(com.tencent.mm.R.string.cg8, java.lang.Integer.valueOf(findMContactAddUI.f73117f.getCount())));
        }
        if (findMContactAddUI.f73117f.d()) {
            if (findMContactAddUI.f73128t != 1 && findMContactAddUI.f73124p.getVisibility() == 0 && findMContactAddUI.f73123o != null) {
                findMContactAddUI.f73124p.setVisibility(8);
                findMContactAddUI.f73123o.setVisibility(0);
            }
        } else if (findMContactAddUI.f73128t != 1 && findMContactAddUI.f73124p.getVisibility() == 8 && findMContactAddUI.f73123o != null) {
            findMContactAddUI.f73124p.setVisibility(0);
            findMContactAddUI.f73123o.setVisibility(8);
        }
        if (findMContactAddUI.f73117f.c() <= 0 || findMContactAddUI.f73128t == 1) {
            findMContactAddUI.f73120i.setText(findMContactAddUI.getResources().getQuantityString(com.tencent.mm.R.plurals.f489672i, findMContactAddUI.f73117f.getCount(), java.lang.Integer.valueOf(findMContactAddUI.f73117f.getCount())));
        } else {
            findMContactAddUI.f73120i.setText(findMContactAddUI.getResources().getQuantityString(com.tencent.mm.R.plurals.f489669f, findMContactAddUI.f73117f.c(), java.lang.Integer.valueOf(findMContactAddUI.f73117f.c())));
        }
    }
}
