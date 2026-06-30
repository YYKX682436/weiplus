package v24;

/* loaded from: classes5.dex */
public class q extends com.tencent.mm.ui.widget.dialog.z2 {
    public final android.widget.TextView L;
    public final android.widget.TextView M;
    public final android.widget.Button N;
    public final android.widget.Button P;
    public final android.widget.TextView Q;
    public boolean R;
    public final android.widget.LinearLayout S;
    public final android.view.View T;

    public q(android.content.Context context) {
        super(context);
        this.R = false;
        if (!(context instanceof android.app.Activity)) {
            android.view.View inflate = com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.bix, (android.view.ViewGroup) null);
            this.T = inflate;
            this.L = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.f487331ob2);
            this.M = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oad);
            this.N = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.kao);
            this.P = (android.widget.Button) inflate.findViewById(com.tencent.mm.R.id.b5i);
            android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.oae);
            this.Q = textView;
            textView.setText(context.getResources().getString(com.tencent.mm.R.string.f493014io2));
            com.tencent.mm.view.MaxHeightScrollView maxHeightScrollView = (com.tencent.mm.view.MaxHeightScrollView) inflate.findViewById(com.tencent.mm.R.id.f486751mc2);
            this.S = (android.widget.LinearLayout) inflate.findViewById(com.tencent.mm.R.id.f483438au5);
            if (maxHeightScrollView != null) {
                int i17 = context.getResources().getDisplayMetrics().heightPixels;
                if (i17 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "screenHeight is 0");
                    return;
                }
                maxHeightScrollView.setMaxHeight((int) (i17 * 0.45f));
                com.tencent.mars.xlog.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "screenHeight = " + i17);
                return;
            }
            return;
        }
        i(com.tencent.mm.R.layout.bix);
        this.L = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.f487331ob2);
        this.M = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.oad);
        this.N = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.kao);
        this.P = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.b5i);
        android.widget.TextView textView2 = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.oae);
        this.Q = textView2;
        textView2.setText(context.getResources().getString(com.tencent.mm.R.string.f493014io2));
        com.tencent.mm.view.MaxHeightScrollView maxHeightScrollView2 = (com.tencent.mm.view.MaxHeightScrollView) this.f212058g.findViewById(com.tencent.mm.R.id.f486751mc2);
        this.S = (android.widget.LinearLayout) this.f212058g.findViewById(com.tencent.mm.R.id.f483438au5);
        if (maxHeightScrollView2 != null) {
            if (!(maxHeightScrollView2.getContext() instanceof android.app.Activity)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "display is null");
                return;
            }
            android.util.DisplayMetrics displayMetrics = maxHeightScrollView2.getContext().getResources().getDisplayMetrics();
            if (displayMetrics == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics is null");
                return;
            }
            maxHeightScrollView2.setMaxHeight((int) (displayMetrics.heightPixels * 0.45f));
            com.tencent.mars.xlog.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics.heightPixels = " + displayMetrics.heightPixels);
        }
    }
}
