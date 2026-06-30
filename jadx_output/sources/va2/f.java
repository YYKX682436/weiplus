package va2;

/* loaded from: classes2.dex */
public final class f extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f434237g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f434238h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.view.card.FinderProfileCardView f434239i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f434240m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f434240m = jz5.h.b(new va2.d(this));
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        android.widget.FrameLayout frameLayout = this.f452720e;
        this.f434237g = frameLayout != null ? (android.widget.TextView) frameLayout.findViewById(com.tencent.mm.R.id.ohd) : null;
        android.widget.FrameLayout frameLayout2 = this.f452720e;
        this.f434238h = frameLayout2 != null ? (android.widget.TextView) frameLayout2.findViewById(com.tencent.mm.R.id.ogu) : null;
        android.widget.FrameLayout frameLayout3 = this.f452720e;
        this.f434239i = frameLayout3 != null ? (com.tencent.mm.plugin.finder.view.card.FinderProfileCardView) frameLayout3.findViewById(com.tencent.mm.R.id.oh7) : null;
        java.lang.String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        V6(stringExtra);
        android.widget.TextView textView = this.f434237g;
        if (textView != null) {
            com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        android.widget.TextView textView2 = this.f434238h;
        if (textView2 == null) {
            return;
        }
        textView2.setText(getContext().getResources().getString(com.tencent.mm.R.string.f8n, "0"));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    @Override // x92.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void U6() {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: va2.f.U6():void");
    }

    public final void V6(java.lang.String str) {
        java.lang.String str2;
        android.widget.TextView textView = this.f434237g;
        if (textView == null) {
            return;
        }
        if (((java.lang.Boolean) ((jz5.n) this.f434240m).getValue()).booleanValue()) {
            str2 = getResources().getString(com.tencent.mm.R.string.f491993m16, str);
        } else {
            str2 = "#" + str;
        }
        textView.setText(str2);
    }
}
