package db5;

/* loaded from: classes8.dex */
public class g3 extends com.tencent.mm.ui.widget.dialog.z2 {
    public final android.widget.TextView L;
    public final android.widget.TextView M;
    public final android.widget.Button N;
    public final android.widget.Button P;
    public final android.widget.TextView Q;
    public final android.widget.ImageView R;
    public final android.widget.ImageView S;
    public boolean T;

    public g3(android.content.Context context) {
        super(context);
        this.T = false;
        i(com.tencent.mm.R.layout.biv);
        this.L = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.f487331ob2);
        this.M = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.oad);
        this.N = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.kao);
        this.P = (android.widget.Button) this.f212058g.findViewById(com.tencent.mm.R.id.b5i);
        this.Q = (android.widget.TextView) this.f212058g.findViewById(com.tencent.mm.R.id.oae);
        com.tencent.mm.view.MaxHeightScrollView maxHeightScrollView = (com.tencent.mm.view.MaxHeightScrollView) this.f212058g.findViewById(com.tencent.mm.R.id.f486751mc2);
        this.S = (android.widget.ImageView) this.f212058g.findViewById(com.tencent.mm.R.id.ocb);
        if (maxHeightScrollView != null) {
            maxHeightScrollView.setVisibility(0);
            if (maxHeightScrollView.getContext() instanceof android.app.Activity) {
                android.util.DisplayMetrics displayMetrics = maxHeightScrollView.getContext().getResources().getDisplayMetrics();
                if (displayMetrics != null) {
                    maxHeightScrollView.setMaxHeight((int) (displayMetrics.heightPixels * 0.45f));
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics.heightPixels = " + displayMetrics.heightPixels);
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "displayMetrics is null");
                }
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "display is null");
            }
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMHalfBottomTipsDoubleBtnDialog", "scroll is null");
        }
        this.R = (android.widget.ImageView) this.f212058g.findViewById(com.tencent.mm.R.id.d9m);
    }

    public db5.g3 D(android.view.View.OnClickListener onClickListener) {
        this.P.setOnClickListener(onClickListener);
        return this;
    }

    public db5.g3 E(android.view.View.OnClickListener onClickListener) {
        this.N.setOnClickListener(onClickListener);
        return this;
    }

    public db5.g3 F(java.lang.String str) {
        this.N.setText(str);
        return this;
    }

    public db5.g3 G(java.lang.String str) {
        android.widget.TextView textView = this.L;
        textView.setText(str);
        textView.setVisibility(0);
        return this;
    }

    public db5.g3 H(boolean z17) {
        this.Q.setVisibility(8);
        return this;
    }
}
