package rf4;

/* loaded from: classes4.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.story.ui.view.CommentsContainer f395077d;

    public k(com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer) {
        this.f395077d = commentsContainer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.story.ui.view.CommentsContainer.f171892r;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: animNext ");
        com.tencent.mm.plugin.story.ui.view.CommentsContainer commentsContainer = this.f395077d;
        sb6.append(commentsContainer.f171895f);
        sb6.append(' ');
        sb6.append(commentsContainer.isPause);
        sb6.append(' ');
        java.util.ArrayList arrayList = commentsContainer.f171894e;
        sb6.append(arrayList.size());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str = commentsContainer.f171893d;
        com.tencent.mars.xlog.Log.i(str, sb7);
        if (commentsContainer.isPause || arrayList.size() <= 0) {
            return;
        }
        int i18 = commentsContainer.f171895f + 1;
        commentsContainer.f171895f = i18;
        int size = i18 % arrayList.size();
        commentsContainer.f171895f = size;
        java.lang.Object obj = arrayList.get(size);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        gf4.a aVar = (gf4.a) obj;
        android.view.LayoutInflater from = android.view.LayoutInflater.from(commentsContainer.getContext());
        boolean z17 = aVar.f271336g;
        android.view.View inflate = from.inflate(z17 ? com.tencent.mm.R.layout.cwb : com.tencent.mm.R.layout.cwa, (android.view.ViewGroup) commentsContainer, false);
        inflate.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -2));
        android.view.View findViewById = inflate.findViewById(com.tencent.mm.R.id.nkz);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.tencent.mm.R.id.nl8);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.tencent.mm.R.id.f487124nl2);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        imageView.setClickable(false);
        com.tencent.mm.feature.avatar.w wVar = (com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class));
        java.lang.String str2 = aVar.f271330a;
        wVar.Ni(imageView, str2);
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str2, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = textView.getContext();
        java.lang.String g27 = n17 != null ? n17.g2() : null;
        if (g27 == null) {
            g27 = "";
        }
        float textSize = textView.getTextSize();
        ((ke0.e) xVar).getClass();
        java.lang.CharSequence j17 = com.tencent.mm.pluginsdk.ui.span.c0.j(context, g27, textSize);
        com.tencent.mm.storage.z3 n18 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(aVar.f271339j, true);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = textView.getContext();
        java.lang.String g28 = n18 != null ? n18.g2() : null;
        java.lang.String str3 = g28 == null ? "" : g28;
        float textSize2 = textView.getTextSize();
        ((ke0.e) xVar2).getClass();
        android.text.SpannableString j18 = com.tencent.mm.pluginsdk.ui.span.c0.j(context2, str3, textSize2);
        if (aVar.f271341l != 0) {
            j17 = ((java.lang.Object) j17) + ' ' + textView.getContext().getResources().getString(com.tencent.mm.R.string.f490541y0) + ' ' + ((java.lang.Object) j18);
        }
        textView.setText(j17);
        if (z17) {
            textView2.setVisibility(8);
            pm0.v.c(textView);
        } else {
            le0.x xVar3 = (le0.x) i95.n0.c(le0.x.class);
            android.content.Context context3 = textView2.getContext();
            float textSize3 = textView2.getTextSize();
            ((ke0.e) xVar3).getClass();
            textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context3, aVar.f271331b, textSize3));
        }
        inflate.setOnClickListener(new rf4.j(commentsContainer));
        com.tencent.mm.plugin.story.ui.view.CommentItemView commentItemView = (com.tencent.mm.plugin.story.ui.view.CommentItemView) inflate;
        int measuredHeight = (commentsContainer.getMeasuredHeight() * 2) / 3;
        com.tencent.mars.xlog.Log.i(str, "LogStory: is enhance comment " + aVar.f271338i);
        commentItemView.setId(size);
        commentItemView.setVisibility(4);
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = commentsContainer.getMeasuredHeight() - measuredHeight;
        commentsContainer.addView(commentItemView, layoutParams);
        commentsContainer.post(new rf4.i(commentItemView, commentsContainer, aVar, measuredHeight));
    }
}
