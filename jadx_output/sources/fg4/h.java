package fg4;

/* loaded from: classes8.dex */
public class h implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.subapp.ui.openapi.AppPreference f262475d;

    public h(com.tencent.mm.plugin.subapp.ui.openapi.AppPreference appPreference) {
        this.f262475d = appPreference;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        fg4.e eVar = this.f262475d.M;
        if (eVar != null) {
            eVar.f262471e = !eVar.f262471e;
            eVar.notifyDataSetChanged();
        }
        return true;
    }
}
