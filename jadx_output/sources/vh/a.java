package vh;

/* loaded from: classes12.dex */
public class a implements android.widget.PopupMenu.OnMenuItemClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vh.b f436777a;

    public a(vh.b bVar) {
        this.f436777a = bVar;
    }

    @Override // android.widget.PopupMenu.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        java.lang.String charSequence = menuItem.getTitle().toString();
        if (charSequence.contains(":")) {
            java.lang.String substring = charSequence.substring(charSequence.lastIndexOf(":") + 1);
            vh.b bVar = this.f436777a;
            bVar.f436779e.f436780a.setText(":" + substring);
            vh.c cVar = bVar.f436779e;
            vh.y yVar = cVar.f436781b.f52622d;
            yVar.f436829e = substring;
            yVar.f436828d = 0;
            yVar.f436827c.post(new vh.w(yVar));
            cVar.f436781b.f52622d.b();
            com.tencent.matrix.batterycanary.stats.ui.BatteryStatsActivity.O6(cVar.f436781b, 0);
        }
        return false;
    }
}
