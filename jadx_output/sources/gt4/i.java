package gt4;

/* loaded from: classes5.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f275447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f275448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f275449f;

    public i(boolean z17, android.widget.TextView textView, android.content.Context context) {
        this.f275447d = z17;
        this.f275448e = textView;
        this.f275449f = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.TextView textView;
        if (this.f275447d && (textView = this.f275448e) != null && fp.h.c(28)) {
            textView.requestFocus();
        }
        ((com.tencent.mm.ui.MMActivity) this.f275449f).showVKB();
    }
}
