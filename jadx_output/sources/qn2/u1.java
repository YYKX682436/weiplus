package qn2;

/* loaded from: classes3.dex */
public final class u1 {

    /* renamed from: a, reason: collision with root package name */
    public final qn2.i0 f365162a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f365163b;

    /* renamed from: c, reason: collision with root package name */
    public final android.view.View f365164c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f365165d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f365166e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f365167f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f365168g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f365169h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f365170i;

    /* renamed from: j, reason: collision with root package name */
    public android.view.View f365171j;

    /* renamed from: k, reason: collision with root package name */
    public android.widget.TextView f365172k;

    /* renamed from: l, reason: collision with root package name */
    public qn2.c0 f365173l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f365174m;

    public u1(qn2.i0 visitorCardPlugin, android.view.ViewGroup doneWinnerListContainer, android.view.View cardContainer, android.view.View card) {
        kotlin.jvm.internal.o.g(visitorCardPlugin, "visitorCardPlugin");
        kotlin.jvm.internal.o.g(doneWinnerListContainer, "doneWinnerListContainer");
        kotlin.jvm.internal.o.g(cardContainer, "cardContainer");
        kotlin.jvm.internal.o.g(card, "card");
        this.f365162a = visitorCardPlugin;
        this.f365163b = doneWinnerListContainer;
        this.f365164c = cardContainer;
        this.f365165d = card;
        this.f365166e = "VisitorLotteryCardDoneWidget";
    }

    public final void a(r45.ht1 ht1Var) {
        r45.jz1 jz1Var;
        java.util.LinkedList linkedList = null;
        r45.cz1 cz1Var = ht1Var != null ? (r45.cz1) ht1Var.getCustom(1) : null;
        android.widget.TextView textView = this.f365168g;
        android.view.ViewGroup viewGroup = this.f365163b;
        if (textView != null) {
            java.lang.String string = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.dsc);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = cz1Var != null ? java.lang.Integer.valueOf(cz1Var.getInteger(10)) : null;
            java.lang.String format = java.lang.String.format(string, java.util.Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.o.f(format, "format(...)");
            textView.setText(format);
        }
        android.widget.TextView textView2 = this.f365169h;
        if (textView2 != null) {
            java.lang.String string2 = viewGroup.getContext().getResources().getString(com.tencent.mm.R.string.f491639dr4);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = cz1Var != null ? java.lang.Integer.valueOf(cz1Var.getInteger(7)) : null;
            java.lang.String format2 = java.lang.String.format(string2, java.util.Arrays.copyOf(objArr2, 1));
            kotlin.jvm.internal.o.f(format2, "format(...)");
            textView2.setText(format2);
        }
        qn2.c0 c0Var = this.f365173l;
        if (c0Var != null) {
            if (ht1Var != null && (jz1Var = (r45.jz1) ht1Var.getCustom(4)) != null) {
                linkedList = jz1Var.getList(0);
            }
            c0Var.y(linkedList, cz1Var);
        }
        qn2.c0 c0Var2 = this.f365173l;
        if (c0Var2 != null) {
            c0Var2.notifyDataSetChanged();
        }
    }
}
