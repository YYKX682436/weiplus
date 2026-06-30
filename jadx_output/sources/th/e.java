package th;

/* loaded from: classes12.dex */
public class e implements android.widget.PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f419244a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f419245b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ th.h f419246c;

    public e(th.h hVar, java.util.List list, android.widget.TextView textView) {
        this.f419246c = hVar;
        this.f419244a = list;
        this.f419245b = textView;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String charSequence = menuItem.getTitle().toString();
        if (!charSequence.contains(":")) {
            return false;
        }
        java.lang.String substring = charSequence.substring(charSequence.lastIndexOf(":") + 1);
        for (m3.d dVar : this.f419244a) {
            if (charSequence.equals("Process :" + th.o.c((java.lang.String) dVar.f323093b))) {
                th.h hVar = this.f419246c;
                hVar.f419250e.f419266d = dVar;
                this.f419245b.setText(":" + substring);
                hVar.f419249d.setText(java.lang.String.valueOf(hVar.f419250e.f419266d.f323092a));
            }
        }
        return false;
    }
}
