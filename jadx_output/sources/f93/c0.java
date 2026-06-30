package f93;

/* loaded from: classes11.dex */
public final class c0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f260301e;

    public c0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel, java.lang.String str) {
        this.f260300d = contactEditLabel;
        this.f260301e = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        java.lang.String username = this.f260301e;
        kotlin.jvm.internal.o.f(username, "$username");
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260300d;
        com.tencent.mars.xlog.Log.i(contactEditLabel.f143191d, "cpan[dealRemoveContact]");
        java.util.ArrayList arrayList = contactEditLabel.f143201q;
        if (arrayList != null && arrayList.contains(username)) {
            contactEditLabel.f143201q.remove(username);
        }
        java.util.ArrayList arrayList2 = contactEditLabel.f143202r;
        if (arrayList2 != null && arrayList2.contains(username)) {
            contactEditLabel.f143205u.add(username);
        }
        java.util.HashSet hashSet = contactEditLabel.f143203s;
        if (hashSet != null && hashSet.contains(username)) {
            hashSet.remove(username);
            contactEditLabel.f143204t.remove(username);
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(contactEditLabel.f143195h)) {
            contactEditLabel.enableOptionMenu(true);
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = contactEditLabel.E;
        if (n3Var != null) {
            n3Var.sendEmptyMessage(contactEditLabel.f143193f);
        }
    }
}
