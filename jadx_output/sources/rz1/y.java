package rz1;

/* loaded from: classes2.dex */
public class y extends androidx.recyclerview.widget.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.datareport.sample.ScrollSampleUI f401795d;

    public y(com.tencent.mm.plugin.datareport.sample.ScrollSampleUI scrollSampleUI, rz1.p pVar) {
        this.f401795d = scrollSampleUI;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.ArrayList) com.tencent.mm.plugin.datareport.sample.ScrollSampleUI.g).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        android.widget.TextView textView;
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) com.tencent.mm.plugin.datareport.sample.ScrollSampleUI.g).get(i17);
        if (str == null || (textView = (android.widget.TextView) k3Var.itemView.findViewById(com.tencent.mm.R.id.lq6)) == null) {
            return;
        }
        textView.setText(str);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Mj(textView);
        if (i17 % 10 == 0) {
            k3Var.itemView.setOnLongClickListener(new rz1.w(this));
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).pk(textView, "view_id_" + i17);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).fk(textView, com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, str);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ok(textView, 100L);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).nk(textView, 0.30000001192092896d);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(textView, 40, 24184);
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        return new rz1.x(this, android.view.LayoutInflater.from(this.f401795d.getBaseContext()).inflate(com.tencent.mm.R.layout.cgl, viewGroup, false));
    }
}
