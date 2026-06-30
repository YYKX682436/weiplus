package qf4;

/* loaded from: classes4.dex */
public final class c extends qf4.e {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.ViewGroup f362682d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f362683e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf4.f f362684f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(qf4.f fVar, android.view.View view) {
        super(fVar, view);
        kotlin.jvm.internal.o.g(view, "view");
        this.f362684f = fVar;
        android.view.View findViewById = view.findViewById(com.tencent.mm.R.id.im9);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f362682d = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = view.findViewById(com.tencent.mm.R.id.f482868qb);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f362683e = (android.widget.ImageView) findViewById2;
    }

    @Override // qf4.e
    public void i(int i17) {
        qf4.f fVar = this.f362684f;
        boolean z17 = fVar.f362697m;
        android.widget.ImageView imageView = this.f362683e;
        android.view.ViewGroup viewGroup = this.f362682d;
        if (z17) {
            viewGroup.setVisibility(8);
            imageView.setVisibility(0);
            return;
        }
        int i18 = fVar.f362698n;
        ef4.w.f252468t.j();
        if (i18 > com.tencent.mm.sdk.platformtools.x2.f193071a.getSharedPreferences(com.tencent.mm.sdk.platformtools.x2.e(), 0).getInt("story_respone_count", 20)) {
            viewGroup.setVisibility(0);
            imageView.setVisibility(8);
        } else {
            viewGroup.setVisibility(0);
            imageView.setVisibility(8);
        }
    }
}
