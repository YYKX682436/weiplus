package wr1;

/* loaded from: classes.dex */
public final class a extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488217ku;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xr1.e item = (xr1.e) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        android.view.ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        android.content.Context context = holder.f293121e;
        if (i17 == 0) {
            layoutParams.height = i65.a.b(context, 48);
        } else {
            layoutParams.height = i65.a.b(context, 68);
        }
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.alw);
        android.text.TextPaint paint = textView != null ? textView.getPaint() : null;
        if (paint != null) {
            paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        }
        android.text.TextPaint paint2 = textView != null ? textView.getPaint() : null;
        if (paint2 != null) {
            paint2.setStrokeWidth(0.8f);
        }
        textView.setText(item.f456186f);
        com.tencent.mars.xlog.Log.i("MicroMsg.BizPCRecentReadDateConvert", "dateTv.text = " + ((java.lang.Object) textView.getText()));
    }
}
