package nh5;

/* loaded from: classes.dex */
public final class k extends androidx.recyclerview.widget.k3 {
    public k(android.view.View view) {
        super(view);
        android.widget.TextView textView = (android.widget.TextView) this.itemView.findViewById(com.tencent.mm.R.id.f485893jg3);
        if (textView != null) {
            java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
            textView.setVisibility(0);
            textView.setText("build=" + com.tencent.mm.sdk.platformtools.z.f193105a + "\nrev=" + com.tencent.mm.sdk.platformtools.z.f193109e);
        }
    }
}
