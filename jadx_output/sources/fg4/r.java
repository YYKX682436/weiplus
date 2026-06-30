package fg4;

/* loaded from: classes8.dex */
public class r implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference f262490d;

    public r(com.tencent.mm.plugin.subapp.ui.openapi.ServicePreference servicePreference) {
        this.f262490d = servicePreference;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        fg4.l lVar = this.f262490d.M;
        if (lVar != null) {
            lVar.f262480e = !lVar.f262480e;
            lVar.notifyDataSetChanged();
        }
        return true;
    }
}
