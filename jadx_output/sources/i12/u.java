package i12;

/* loaded from: classes15.dex */
public final class u implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i12.x f287245d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ra f287246e;

    public u(i12.x xVar, bw5.ra raVar) {
        this.f287245d = xVar;
        this.f287246e = raVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        i12.x xVar = this.f287245d;
        xVar.f287260r.removeAllViews();
        java.util.LinkedList linkedList = this.f287246e.G;
        kotlin.jvm.internal.o.d(linkedList);
        int size = linkedList.size();
        if (size != 0) {
            float width = (xVar.f287260r.getWidth() + 32.0f) / 96.0f;
            double d17 = width;
            float min = java.lang.Math.min(size, java.lang.Math.max(((double) java.lang.Math.abs(width - ((float) java.lang.Math.floor(d17)))) > 0.5d ? ((float) java.lang.Math.floor(d17)) + 1 : (float) java.lang.Math.floor(d17), 4));
            float floor = (float) java.lang.Math.floor((r3 - ((min - 1) * 32.0f)) / min);
            int i17 = (int) min;
            for (int i18 = 0; i18 < i17; i18++) {
                r45.ri0 ri0Var = (r45.ri0) linkedList.get(i18);
                android.widget.ImageView imageView = new android.widget.ImageView(xVar.f287251f);
                int i19 = (int) floor;
                imageView.setLayoutParams(new com.google.android.flexbox.FlexboxLayout.LayoutParams(i19, i19));
                n11.a b17 = n11.a.b();
                java.lang.String str = ri0Var.f384888f;
                b17.h(str, imageView, y12.f.b(ri0Var.f384892m, str));
                imageView.setBackground(xVar.f287251f.getDrawable(com.tencent.mm.R.drawable.emoji_store_designer_pack_list_item_for_finder_image_background));
                imageView.setOnClickListener(new i12.t(xVar, ri0Var));
                xVar.f287260r.addView(imageView);
            }
        }
    }
}
