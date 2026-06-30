package vh;

/* loaded from: classes12.dex */
public class n extends vh.s {

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f436809f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f436810g;

    public n(android.view.View view) {
        super(view);
        this.f436809f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqb);
        this.f436810g = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.oqh);
    }

    @Override // vh.s
    public void i(vh.h hVar) {
        com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel1Item batteryStatsAdapter$Item$EventLevel1Item = (com.tencent.matrix.batterycanary.stats.ui.BatteryStatsAdapter$Item$EventLevel1Item) hVar;
        this.f436818d = batteryStatsAdapter$Item$EventLevel1Item;
        this.f436809f.setText(((java.text.DateFormat) vh.s.f436817e.b()).format(new java.util.Date(batteryStatsAdapter$Item$EventLevel1Item.f52600e)));
        this.f436810g.setText(batteryStatsAdapter$Item$EventLevel1Item.f52628f);
    }
}
