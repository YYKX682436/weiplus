package ri5;

/* loaded from: classes.dex */
public final class c extends in5.r {
    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f489331el2;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        ri5.j item = (ri5.j) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        android.view.View view = holder.itemView;
        view.setTag(com.tencent.mm.R.id.txo, 1);
        ((android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.ciy)).setBackgroundResource(com.tencent.mm.R.drawable.f481311q7);
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.mj_);
        kotlin.jvm.internal.o.f(weImageView, "getSelectIcon(...)");
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.g_u);
        kotlin.jvm.internal.o.f(textView, "getFoldTip(...)");
        si5.c cVar2 = item.f396113h;
        vi5.d dVar = cVar2 instanceof vi5.d ? (vi5.d) cVar2 : null;
        boolean z18 = dVar != null ? dVar.f437618i : false;
        int i19 = dVar != null ? dVar.f437619j : 0;
        if (z18) {
            weImageView.setRotation(0.0f);
            textView.setText(textView.getResources().getString(com.tencent.mm.R.string.b1p, java.lang.Integer.valueOf(i19)));
        } else {
            weImageView.setRotation(180.0f);
            android.content.res.Resources resources = textView.getResources();
            textView.setText(resources != null ? resources.getString(com.tencent.mm.R.string.b1q) : null);
        }
        textView.post(new ri5.b(textView));
    }
}
