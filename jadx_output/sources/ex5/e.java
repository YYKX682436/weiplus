package ex5;

/* loaded from: classes7.dex */
public class e implements android.widget.AdapterView.OnItemLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.weui.base.preference.WeUIPreference f257249d;

    public e(com.tencent.weui.base.preference.WeUIPreference weUIPreference) {
        this.f257249d = weUIPreference;
    }

    @Override // android.widget.AdapterView.OnItemLongClickListener
    public boolean onItemLongClick(android.widget.AdapterView adapterView, android.view.View view, int i17, long j17) {
        com.tencent.weui.base.preference.WeUIPreference weUIPreference = this.f257249d;
        if (i17 < weUIPreference.A.getHeaderViewsCount()) {
            return false;
        }
        int headerViewsCount = i17 - weUIPreference.A.getHeaderViewsCount();
        if (headerViewsCount >= weUIPreference.f220127z.getCount()) {
            com.tencent.mm.ui.yk.b("MicroMsg.mmui.WeUIPreference", "itemlongclick, outofindex, %d, %d", java.lang.Integer.valueOf(headerViewsCount), java.lang.Integer.valueOf(weUIPreference.f220127z.getCount()));
            return false;
        }
        ex5.g gVar = weUIPreference.f220127z;
        android.widget.ListView listView = weUIPreference.A;
        weUIPreference.getClass();
        return false;
    }
}
