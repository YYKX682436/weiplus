package o3;

/* loaded from: classes13.dex */
public final class a extends android.text.style.ClickableSpan {

    /* renamed from: d, reason: collision with root package name */
    public final int f342619d;

    /* renamed from: e, reason: collision with root package name */
    public final o3.l f342620e;

    /* renamed from: f, reason: collision with root package name */
    public final int f342621f;

    public a(int i17, o3.l lVar, int i18) {
        this.f342619d = i17;
        this.f342620e = lVar;
        this.f342621f = i18;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f342619d);
        this.f342620e.f342642a.performAction(this.f342621f, bundle);
    }
}
