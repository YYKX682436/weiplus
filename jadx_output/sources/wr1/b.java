package wr1;

/* loaded from: classes8.dex */
public final class b extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488219kw;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        xr1.e item = (xr1.e) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        super.h(holder, item, i17, i18, z17, list);
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = (com.tencent.mm.ui.widget.MMNeat7extView) holder.itemView.findViewById(com.tencent.mm.R.id.f483398am1);
        android.widget.TextView textView = (android.widget.TextView) holder.itemView.findViewById(com.tencent.mm.R.id.alz);
        r45.yk ykVar = item.f456184d;
        java.lang.String str = ykVar.f391164f;
        if (str != null) {
            mMNeat7extView.b(str);
        }
        textView.setText(ykVar.f391165g);
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) holder.itemView.findViewById(com.tencent.mm.R.id.f483397am0);
        if (ykVar.f391168m == 10) {
            frameLayout.setVisibility(8);
            return;
        }
        frameLayout.setVisibility(0);
        frameLayout.removeAllViews();
        int i19 = ykVar.f391168m;
        android.content.Context context = holder.f293121e;
        if (i19 == 7) {
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            imageView.setBackgroundColor(i65.a.d(context, com.tencent.mm.R.color.f478492d));
            android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(i65.a.b(context, 40), i65.a.b(context, 40));
            layoutParams.gravity = 17;
            fq1.e.h(fq1.e.f265507a, imageView, i65.a.b(context, 20), false, false, 12, null);
            frameLayout.addView(imageView, layoutParams);
            android.widget.ImageView imageView2 = new android.widget.ImageView(context);
            imageView2.setImageResource(com.tencent.mm.R.raw.biz_voice_playing_icon_black_inner3);
            android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(i65.a.b(context, 20), i65.a.b(context, 20));
            layoutParams2.gravity = 17;
            frameLayout.addView(imageView2, layoutParams2);
            return;
        }
        android.widget.ImageView imageView3 = new android.widget.ImageView(context);
        imageView3.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        fq1.e.h(fq1.e.f265507a, imageView3, i65.a.b(context, 2), false, false, 12, null);
        frameLayout.addView(imageView3, new android.widget.FrameLayout.LayoutParams(-1, -1));
        o11.f fVar = new o11.f();
        fVar.f342093q = com.tencent.mm.R.color.f478869jf;
        fVar.f342079c = true;
        fVar.f342077a = true;
        fVar.D = "bizRecentReading";
        n11.a.b().h(ykVar.f391162d, imageView3, fVar.a());
        int i27 = ykVar.f391168m;
        if (i27 == 5) {
            android.widget.ImageView imageView4 = new android.widget.ImageView(context);
            imageView4.setImageResource(com.tencent.mm.R.drawable.bxo);
            android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(i65.a.b(context, 24), i65.a.b(context, 24));
            layoutParams3.gravity = 17;
            frameLayout.addView(imageView4, layoutParams3);
            return;
        }
        if (i27 == 8) {
            android.widget.ImageView imageView5 = new android.widget.ImageView(context);
            imageView5.setImageResource(com.tencent.mm.R.raw.biz_timeline_pic_1_1);
            android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(i65.a.b(context, 16), i65.a.b(context, 16));
            layoutParams4.gravity = 8388693;
            layoutParams4.setMargins(0, 0, i65.a.b(context, 2), i65.a.b(context, 2));
            frameLayout.addView(imageView5, layoutParams4);
        }
    }
}
