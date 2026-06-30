package w82;

/* loaded from: classes11.dex */
public class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f443890d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w82.k0 f443891e;

    public j0(w82.k0 k0Var, android.view.View view) {
        this.f443891e = k0Var;
        this.f443890d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        w82.l0 l0Var = this.f443891e.f443904d.N;
        java.lang.String charSequence = ((android.widget.TextView) this.f443890d).getText().toString();
        com.tencent.mm.plugin.fav.ui.widget.FavSearchActionView favSearchActionView = ((w82.c0) l0Var).f443830d;
        favSearchActionView.f101550e.getClass();
        favSearchActionView.c(favSearchActionView.f101550e.getEditText());
        java.util.List list = favSearchActionView.f101551f;
        android.content.Context context = favSearchActionView.getContext();
        int i17 = -1;
        if (context != null) {
            if (context.getString(com.tencent.mm.R.string.cd9).equals(charSequence)) {
                i17 = 21;
            } else if (context.getString(com.tencent.mm.R.string.cdf).equals(charSequence)) {
                i17 = 5;
            } else if (context.getString(com.tencent.mm.R.string.f491211cd1).equals(charSequence)) {
                i17 = 8;
            } else if (context.getString(com.tencent.mm.R.string.cda).equals(charSequence)) {
                i17 = 7;
            } else if (context.getString(com.tencent.mm.R.string.cde).equals(charSequence)) {
                i17 = 17;
            } else if (context.getString(com.tencent.mm.R.string.cdh).equals(charSequence)) {
                i17 = 3;
            } else if (context.getString(com.tencent.mm.R.string.cdc).equals(charSequence)) {
                i17 = 18;
            } else if (context.getString(com.tencent.mm.R.string.cd_).equals(charSequence)) {
                i17 = 6;
            }
        }
        ((java.util.LinkedList) list).remove(i17);
        favSearchActionView.b();
        w82.e0 e0Var = favSearchActionView.f101554i;
        if (e0Var == null) {
            return;
        }
        ((com.tencent.mm.plugin.fav.ui.j5) e0Var).a(list, favSearchActionView.f101553h, favSearchActionView.f101552g, true);
    }
}
