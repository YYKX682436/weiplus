package h93;

/* loaded from: classes3.dex */
public final class q extends h93.c {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f279725g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f279725g = "MicroMsg.NotFoundPanel";
    }

    @Override // h93.c
    public int P6() {
        return 0;
    }

    @Override // h93.c
    public java.lang.String R6() {
        return this.f279725g;
    }

    @Override // h93.c
    public void S6() {
        super.S6();
        android.view.View V6 = V6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((com.tencent.mm.ui.widget.MMTextView) V6().findViewById(com.tencent.mm.R.id.f483906sz5)).setOnClickListener(new h93.p(this));
    }

    @Override // h93.c
    public void U6(java.lang.String keyword, java.util.List list) {
        kotlin.jvm.internal.o.g(keyword, "keyword");
        if (list == null || (!list.isEmpty())) {
            android.view.View V6 = V6();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(V6, arrayList.toArray(), "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            V6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(V6, "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View V62 = V6();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(V62, arrayList2.toArray(), "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        V62.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(V62, "com/tencent/mm/plugin/label/ui/label/NotFoundPanel", "onSearchStateChanged", "(Ljava/lang/String;Ljava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.lang.String string = getString(com.tencent.mm.R.string.o76);
        int L = r26.n0.L(string, "%s", 0, false, 6, null);
        java.lang.String substring = string.substring(0, L);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        java.lang.String substring2 = string.substring(L + 2);
        kotlin.jvm.internal.o.f(substring2, "substring(...)");
        android.text.SpannableString spannableString = new android.text.SpannableString(substring + keyword + substring2);
        int length = substring.length();
        spannableString.setSpan(new android.text.style.ForegroundColorSpan(getColor(com.tencent.mm.R.color.Brand_100)), length, keyword.length() + length, 33);
        O6().setTextColor(getColor(com.tencent.mm.R.color.FG_1));
        O6().setText(spannableString);
    }

    public android.view.View V6() {
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.f483905sz4);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // h93.c
    /* renamed from: W6, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.ui.widget.MMTextView O6() {
        android.view.View findViewById = V6().findViewById(com.tencent.mm.R.id.sz6);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        return (com.tencent.mm.ui.widget.MMTextView) findViewById;
    }
}
