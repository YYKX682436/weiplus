package e33;

/* loaded from: classes8.dex */
public class o extends androidx.recyclerview.widget.k3 {
    public o(android.view.View view) {
        super(view);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.jec);
        if (t23.p0.k().f415297f == 4) {
            textView.setText(com.tencent.mm.R.string.f492191fk2);
            return;
        }
        if (t23.p0.k().f415298g == 2 || t23.p0.k().f415297f == 13) {
            textView.setText(com.tencent.mm.R.string.f492193fk4);
        } else if (t23.p0.k().f415298g == 1) {
            textView.setText(com.tencent.mm.R.string.f492192fk3);
        } else if (t23.p0.k().f415298g == 3) {
            textView.setText(com.tencent.mm.R.string.f492191fk2);
        }
    }
}
