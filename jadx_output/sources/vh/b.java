package vh;

/* loaded from: classes12.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.matrix.batterycanary.stats.k f436778d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vh.c f436779e;

    public b(vh.c cVar, com.tencent.matrix.batterycanary.stats.k kVar) {
        this.f436779e = cVar;
        this.f436778d = kVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.widget.PopupMenu popupMenu = new android.widget.PopupMenu(view.getContext(), this.f436779e.f436780a);
        popupMenu.getMenu().add("Process :main");
        this.f436778d.getClass();
        for (java.lang.String str : java.util.Collections.emptySet()) {
            if (!com.tencent.matrix.battery.accumulate.persist.FlattProperty.PROC_MM.equals(str)) {
                popupMenu.getMenu().add("Process :" + str);
            }
        }
        popupMenu.setOnMenuItemClickListener(new vh.a(this));
        popupMenu.show();
    }
}
