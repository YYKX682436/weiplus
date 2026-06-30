package mu2;

/* loaded from: classes2.dex */
public final class a extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f331391a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.View f331392b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f331393c;

    public a(android.text.SpannableString spannableString, android.view.View view, long j17) {
        this.f331391a = spannableString;
        this.f331392b = view;
        this.f331393c = j17;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            android.text.SpannableString spannableString = this.f331391a;
            java.lang.Object[] spans = spannableString.getSpans(0, spannableString.length(), com.tencent.mm.plugin.finder.view.yl.class);
            kotlin.jvm.internal.o.f(spans, "getSpans(...)");
            for (com.tencent.mm.plugin.finder.view.yl ylVar : (com.tencent.mm.plugin.finder.view.yl[]) spans) {
                if (ylVar.f133404f) {
                    mu2.b bVar = mu2.b.f331394a;
                    android.content.Context context = this.f331392b.getContext();
                    kotlin.jvm.internal.o.f(context, "getContext(...)");
                    bVar.a(context, "link_topic_tag", 0, this.f331393c, 0L, ylVar.f133402d);
                }
            }
        }
    }
}
