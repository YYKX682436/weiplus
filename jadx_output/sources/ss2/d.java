package ss2;

/* loaded from: classes10.dex */
public final class d implements ya2.r1 {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f411931d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.MMEditText f411932e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f411933f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f411934g;

    /* renamed from: h, reason: collision with root package name */
    public int f411935h;

    /* renamed from: i, reason: collision with root package name */
    public final int f411936i;

    public d(android.app.Activity activity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f411931d = activity;
        this.f411936i = 3000;
    }

    public final void a() {
        android.app.Activity context = this.f411931d;
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ss2.l lVar = (ss2.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(ss2.l.class);
        ss2.d dVar = lVar.f411960i;
        if (!(dVar != null && dVar.f411934g)) {
            lVar.Q6().setEnabled(false);
        } else if (lVar.f411959h != null) {
            lVar.Q6().setEnabled(true);
        } else {
            lVar.Q6().setEnabled(false);
        }
    }

    public final com.tencent.mm.ui.widget.MMEditText b() {
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f411932e;
        if (mMEditText != null) {
            return mMEditText;
        }
        kotlin.jvm.internal.o.o("descTv");
        throw null;
    }

    public final android.widget.TextView c() {
        android.widget.TextView textView = this.f411933f;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.o.o("textCountTv");
        throw null;
    }
}
