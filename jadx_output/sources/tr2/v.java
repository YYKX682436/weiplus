package tr2;

/* loaded from: classes8.dex */
public final class v extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f421413d;

    /* renamed from: e, reason: collision with root package name */
    public int f421414e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f421415f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f421416g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f421417h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f421418i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup f421419m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.api.IEmojiInfo f421420n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Long f421421o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f421422p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f421423q;

    /* renamed from: r, reason: collision with root package name */
    public android.view.View f421424r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f421425s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f421425s = jz5.h.a(jz5.i.f302831f, new tr2.m(this));
    }

    public final void O6(com.tencent.mm.api.IEmojiInfo iEmojiInfo) {
        if (iEmojiInfo == null) {
            android.widget.ImageView imageView = this.f421417h;
            if (imageView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(imageView, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Integer.valueOf(intValue));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(imageView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "onEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                imageView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(imageView, "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "onEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                yj0.a.f(imageView, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f421423q;
            if (weImageView != null) {
                weImageView.setImageResource(com.tencent.mm.R.raw.likeeasteregg_regular);
            }
            com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f421423q;
            if (weImageView2 != null) {
                weImageView2.setIconColor(getContext().getColor(com.tencent.mm.R.color.abw));
            }
            android.widget.TextView textView = this.f421422p;
            if (textView != null) {
                textView.setTextColor(getContext().getColor(com.tencent.mm.R.color.abw));
            }
            android.widget.TextView textView2 = this.f421422p;
            if (textView2 != null) {
                textView2.setText(com.tencent.mm.R.string.om7);
                return;
            }
            return;
        }
        android.widget.ImageView imageView2 = this.f421417h;
        if (imageView2 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(imageView2, arrayList3.toArray(), "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue2 = ((java.lang.Integer) arrayList3.get(0)).intValue();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(java.lang.Integer.valueOf(intValue2));
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(imageView2, arrayList4.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "onEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            imageView2.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(imageView2, "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "onEmojiChanged", "(Lcom/tencent/mm/api/IEmojiInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(imageView2, "com/tencent/mm/kt/CommonKt", "visible", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.ImageView imageView3 = this.f421417h;
        if (imageView3 != null) {
            ox2.r0.a(imageView3, iEmojiInfo, true, "Finder.PostInteractionEasterEggUIC onEmojiChanged loadCover");
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f421423q;
        if (weImageView3 != null) {
            weImageView3.setImageResource(com.tencent.mm.R.raw.likeeasteregg_filled);
        }
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f421423q;
        if (weImageView4 != null) {
            weImageView4.setIconColor(getContext().getColor(com.tencent.mm.R.color.Brand_100));
        }
        android.widget.TextView textView3 = this.f421422p;
        if (textView3 != null) {
            textView3.setTextColor(getContext().getColor(com.tencent.mm.R.color.Brand_100));
        }
        android.widget.TextView textView4 = this.f421422p;
        if (textView4 != null) {
            textView4.setText(com.tencent.mm.R.string.om8);
        }
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.g(activity, "activity");
        com.tencent.mm.plugin.finder.post.PostMainUIC postMainUIC = (com.tencent.mm.plugin.finder.post.PostMainUIC) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.finder.post.PostMainUIC.class);
        if (postMainUIC.X == sr2.z2.f411825f) {
            postMainUIC.M7(null, sr2.z2.f411823d);
        }
    }

    public final void P6() {
        this.f421414e = 2;
        com.tencent.mm.api.IEmojiInfo iEmojiInfo = this.f421420n;
        this.f421413d = iEmojiInfo;
        O6(iEmojiInfo);
        android.view.ViewGroup viewGroup = this.f421419m;
        if (viewGroup != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(viewGroup, arrayList.toArray(), "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(viewGroup, arrayList2.toArray(), "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "useLastEmoji", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            viewGroup.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(viewGroup, "com/tencent/mm/plugin/finder/post/interactioneasteregg/PostInteractionEasterEggUIC", "useLastEmoji", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(viewGroup, "com/tencent/mm/kt/CommonKt", "gone", "(Landroid/view/View;)Landroid/view/View;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0396  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x02ee  */
    @Override // com.tencent.mm.ui.component.UIComponent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1453
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr2.v.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        if ((r7.getVisibility() == 0) == true) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreateAfter(android.os.Bundle r7) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tr2.v.onCreateAfter(android.os.Bundle):void");
    }
}
