package s61;

/* loaded from: classes15.dex */
public class s implements r61.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI f403388a;

    public s(com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI) {
        this.f403388a = findMContactInviteUI;
    }

    @Override // r61.l0
    public void notifyDataSetChanged() {
        com.tencent.mm.plugin.account.friend.ui.FindMContactInviteUI findMContactInviteUI = this.f403388a;
        int i17 = findMContactInviteUI.f73145s;
        if (i17 == 2) {
            findMContactInviteUI.f73142p.setText(findMContactInviteUI.getString(com.tencent.mm.R.string.cgg, java.lang.Integer.valueOf(findMContactInviteUI.f73135f.getCount())));
        } else if (i17 == 1) {
            findMContactInviteUI.f73142p.setText(findMContactInviteUI.getString(com.tencent.mm.R.string.cgh));
        } else {
            findMContactInviteUI.f73142p.setText(findMContactInviteUI.getString(com.tencent.mm.R.string.cgg, java.lang.Integer.valueOf(findMContactInviteUI.f73135f.getCount())));
        }
        if (findMContactInviteUI.f73135f.d()) {
            if (findMContactInviteUI.f73145s != 1 && findMContactInviteUI.f73142p.getVisibility() == 0 && findMContactInviteUI.f73141o != null) {
                findMContactInviteUI.f73142p.setVisibility(8);
                findMContactInviteUI.f73141o.setVisibility(0);
            }
        } else if (findMContactInviteUI.f73145s != 1 && findMContactInviteUI.f73142p.getVisibility() == 8 && findMContactInviteUI.f73141o != null) {
            findMContactInviteUI.f73142p.setVisibility(0);
            findMContactInviteUI.f73141o.setVisibility(8);
        }
        if (findMContactInviteUI.f73135f.c() <= 0 || findMContactInviteUI.f73145s == 1) {
            findMContactInviteUI.f73138i.setText(findMContactInviteUI.getResources().getQuantityString(com.tencent.mm.R.plurals.f489671h, findMContactInviteUI.f73135f.getCount(), java.lang.Integer.valueOf(findMContactInviteUI.f73135f.getCount())));
        } else {
            findMContactInviteUI.f73138i.setText(findMContactInviteUI.getResources().getQuantityString(com.tencent.mm.R.plurals.f489670g, findMContactInviteUI.f73135f.c(), java.lang.Integer.valueOf(findMContactInviteUI.f73135f.c())));
        }
    }
}
