package pw0;

/* loaded from: classes5.dex */
public final class n extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f358646d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MCRoundCornerAnimateView f358647e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f358648f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f358649g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ProgressBar f358650h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f358651i;

    /* renamed from: m, reason: collision with root package name */
    public final android.view.View f358652m;

    /* renamed from: n, reason: collision with root package name */
    public final android.graphics.drawable.ColorDrawable f358653n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f358654o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(pw0.o oVar, android.view.View view) {
        super(view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f358646d = view;
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MCRoundCornerAnimateView mCRoundCornerAnimateView = (com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MCRoundCornerAnimateView) view.findViewById(com.tencent.mm.R.id.rsa);
        this.f358647e = mCRoundCornerAnimateView;
        this.f358648f = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.s9u);
        this.f358649g = (android.widget.ImageView) view.findViewById(com.tencent.mm.R.id.q7y);
        this.f358650h = (android.widget.ProgressBar) view.findViewById(com.tencent.mm.R.id.d3u);
        this.f358651i = view.findViewById(com.tencent.mm.R.id.q4i);
        this.f358652m = view.findViewById(com.tencent.mm.R.id.s5_);
        this.f358653n = new android.graphics.drawable.ColorDrawable(j65.q.a(mCRoundCornerAnimateView.getContext()).getColor(com.tencent.mm.R.color.f479402ad3, null));
        java.lang.String string = j65.q.a(mCRoundCornerAnimateView.getContext()).getString(com.tencent.mm.R.string.mub);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        this.f358654o = string;
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        sw0.d data = (sw0.d) obj;
        kotlin.jvm.internal.o.g(data, "data");
        android.view.View view = this.f358652m;
        view.setBackgroundResource(com.tencent.mm.R.drawable.cml);
        view.setSelected(data.f413424c);
        android.graphics.drawable.ColorDrawable colorDrawable = this.f358653n;
        com.tencent.mm.mj_publisher.finder.movie_composing.widgets.MCRoundCornerAnimateView mCRoundCornerAnimateView = this.f358647e;
        mCRoundCornerAnimateView.setBackground(colorDrawable);
        com.tencent.maas.material.MJMaterialInfo mJMaterialInfo = data.f413422a;
        java.lang.String str = mJMaterialInfo.f48224b;
        boolean b17 = kotlin.jvm.internal.o.b(str, "EMPTY_ANIM_PRESET_ID");
        android.widget.ProgressBar progressBar = this.f358650h;
        android.widget.ImageView imageView = this.f358649g;
        android.widget.TextView textView = this.f358648f;
        if (b17) {
            textView.setText("");
            mCRoundCornerAnimateView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
            imageView.setVisibility(8);
            progressBar.setVisibility(8);
            android.view.View view2 = this.f358651i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mCRoundCornerAnimateView.y();
            mCRoundCornerAnimateView.setImageResource(com.tencent.mm.R.drawable.cwq);
            return;
        }
        if (kotlin.jvm.internal.o.b(str, "BUILTIN_ANIM_PRESET_ID")) {
            textView.setText(this.f358654o);
            imageView.setVisibility(8);
            progressBar.setVisibility(8);
            android.view.View view3 = this.f358651i;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindBuiltin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindBuiltin", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mCRoundCornerAnimateView.y();
            mCRoundCornerAnimateView.setImageDrawable(null);
            return;
        }
        zu0.i iVar = zu0.i.f475674d;
        zu0.i iVar2 = data.f413423b;
        if (iVar2 == iVar) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        if (iVar2 == zu0.i.f475675e) {
            progressBar.setVisibility(0);
            android.view.View view4 = this.f358651i;
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view4, arrayList3.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindNormal", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view4.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view4, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindNormal", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        } else {
            progressBar.setVisibility(8);
            android.view.View view5 = this.f358651i;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view5, arrayList4.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindNormal", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view5.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view5, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/adapter/TextStyleAnimAdapter$Holder", "bindNormal", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/text/modes/TextMaterialInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        textView.setText("");
        mCRoundCornerAnimateView.setScaleType(android.widget.ImageView.ScaleType.CENTER_INSIDE);
        cy0.c cVar = by0.q.f36347a;
        java.lang.String str2 = mJMaterialInfo.f48227e;
        kotlin.jvm.internal.o.f(str2, "getPreviewImageURL(...)");
        new cy0.g(new ip0.a(str2), by0.q.f36347a).c(mCRoundCornerAnimateView);
    }
}
