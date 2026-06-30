package ix3;

/* loaded from: classes10.dex */
public final class n1 extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489404dw2;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ix3.l1 item = (ix3.l1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View view = holder.itemView;
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.k3s);
        com.tencent.mm.vfs.x1 x1Var = item.f295479d;
        textView.setText(x1Var.f213232b);
        long j17 = x1Var.f213235e;
        if (x1Var.f213236f) {
            ((com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.rkn)).setVisibility(0);
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mzv)).setText("文件夹");
            ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o7z)).setText(k35.m1.e(j17));
        } else {
            java.lang.String D = x1Var.f213237g.D(x1Var.f213231a, false);
            android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.o7z);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(x1Var instanceof com.tencent.mm.vfs.k5 ? "Link-" : "");
            sb6.append(k35.m1.e(j17));
            sb6.append(" wxam:");
            sb6.append(com.tencent.mm.sdk.platformtools.y1.g(D));
            textView2.setText(sb6.toString());
            ((com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.rkn)).setVisibility(4);
            long j18 = x1Var.f213233c;
            if (j18 < 1048576) {
                ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mzv)).setText(com.tencent.mm.sdk.platformtools.t8.f0(j18));
            } else if (j18 < 1073741824) {
                ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mzv)).setText(com.tencent.mm.sdk.platformtools.t8.h0(j18));
            } else {
                ((android.widget.TextView) view.findViewById(com.tencent.mm.R.id.mzv)).setText(com.tencent.mm.sdk.platformtools.t8.e0(j18, 10.0d));
            }
        }
        if (item.f295481f) {
            ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.hhb)).setBackgroundResource(com.tencent.mm.R.color.Green_100);
        } else {
            ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.hhb)).setBackgroundResource(com.tencent.mm.R.color.f478490b);
        }
    }
}
