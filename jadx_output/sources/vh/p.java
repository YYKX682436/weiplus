package vh;

/* loaded from: classes12.dex */
public class p extends vh.s implements android.view.View.OnClickListener {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f436813f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f436814g;

    public p(android.view.View view) {
        super(view);
        this.f436813f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqb);
        this.f436814g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqh);
        view.findViewById(com.tencent.mm.R.id.hyj).setOnClickListener(this);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventSimpleItem batteryStatsAdapter$Item$EventSimpleItem = (com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventSimpleItem) hVar;
        this.f436818d = batteryStatsAdapter$Item$EventSimpleItem;
        this.f436813f.setText(((java.text.DateFormat) vh.s.f436817e.b()).format(new java.util.Date(batteryStatsAdapter$Item$EventSimpleItem.f52600e)));
        this.f436814g.setText(batteryStatsAdapter$Item$EventSimpleItem.f52604g);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        android.view.View inflate = android.view.LayoutInflater.from(view.getContext()).inflate(com.tencent.mm.R.layout.cvh, (android.view.ViewGroup) null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.opf);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("EVENT_ID: ");
        sb6.append(((com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventSimpleItem) this.f436818d).f52630i.f52603f);
        sb6.append("\n\n");
        for (java.lang.String str : ((com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventSimpleItem) this.f436818d).f52630i.f52605h.keySet()) {
            sb6.append(str);
            sb6.append(" = ");
            sb6.append(((com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventSimpleItem) this.f436818d).f52630i.f52605h.get(str));
            sb6.append("\n\n");
        }
        textView.setText(sb6.toString());
        androidx.appcompat.app.l lVar = new androidx.appcompat.app.l(view.getContext());
        java.lang.String str2 = ((com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventSimpleItem) this.f436818d).f52604g;
        androidx.appcompat.app.h hVar = lVar.f9193a;
        hVar.f9132d = str2;
        hVar.f9135g = "确定";
        hVar.f9136h = null;
        hVar.f9139k = true;
        hVar.f9144p = inflate;
        lVar.a().show();
    }
}
