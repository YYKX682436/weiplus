package iv0;

/* loaded from: classes5.dex */
public final class a extends gv0.c {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f295060d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f295061e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f295062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(iv0.b bVar, android.view.View itemView) {
        super(itemView);
        kotlin.jvm.internal.o.g(itemView, "itemView");
        android.view.View findViewById = itemView.findViewById(com.tencent.mm.R.id.q8t);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f295060d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = itemView.findViewById(com.tencent.mm.R.id.h5w);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f295061e = (android.widget.ImageView) findViewById2;
        android.view.View findViewById3 = itemView.findViewById(com.tencent.mm.R.id.f486827qa0);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f295062f = findViewById3;
    }

    @Override // gv0.c
    public void i(java.lang.Object obj, int i17) {
        mv0.a data = (mv0.a) obj;
        kotlin.jvm.internal.o.g(data, "data");
        mv0.b bVar = data.f331527a;
        boolean z17 = bVar.f331531b;
        android.widget.ImageView imageView = this.f295061e;
        android.widget.TextView textView = this.f295060d;
        int i18 = data.f331528b;
        if (z17) {
            imageView.setImageDrawable(j65.q.a(imageView.getContext()).getDrawable(i18, null));
            textView.setText(j65.q.a(imageView.getContext()).getText(com.tencent.mm.R.string.mtv));
        } else {
            imageView.setImageDrawable(j65.q.a(imageView.getContext()).getDrawable(i18, null));
            textView.setText(bVar.f331530a.f48483e);
        }
        if (data.f331529c) {
            textView.setTextColor(j65.q.a(textView.getContext()).getColor(com.tencent.mm.R.color.ag9, null));
            android.view.View view = this.f295062f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasAspectRatioAdapter$AspectRatioHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/models/CanvasAspectRatioInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasAspectRatioAdapter$AspectRatioHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/models/CanvasAspectRatioInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        textView.setTextColor(j65.q.a(textView.getContext()).getColor(com.tencent.mm.R.color.ac_, null));
        android.view.View view2 = this.f295062f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasAspectRatioAdapter$AspectRatioHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/models/CanvasAspectRatioInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/canvas/CanvasAspectRatioAdapter$AspectRatioHolder", "bind", "(Lcom/tencent/mm/mj_publisher/finder/movie_composing/panel/base/models/CanvasAspectRatioInfo;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
