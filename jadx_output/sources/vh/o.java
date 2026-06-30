package vh;

/* loaded from: classes12.dex */
public class o extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f436811f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f436812g;

    public o(android.view.View view) {
        super(view);
        this.f436811f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqb);
        this.f436812g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqh);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel2Item batteryStatsAdapter$Item$EventLevel2Item = (com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel2Item) hVar;
        this.f436818d = batteryStatsAdapter$Item$EventLevel2Item;
        this.f436811f.setText(((java.text.DateFormat) vh.s.f436817e.b()).format(new java.util.Date(batteryStatsAdapter$Item$EventLevel2Item.f52600e)));
        this.f436812g.setText(batteryStatsAdapter$Item$EventLevel2Item.f52629f);
    }
}
