package db5;

/* loaded from: classes15.dex */
public class y3 extends android.widget.ListView {

    /* renamed from: d, reason: collision with root package name */
    public boolean f228579d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f228580e;

    public y3(android.content.Context context, boolean z17, db5.w3 w3Var) {
        super(context, null, com.tencent.mm.R.attr.f478231e8);
        this.f228580e = z17;
        setCacheColorHint(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f228580e || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f228580e || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f228580e || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f228580e && this.f228579d) || super.isInTouchMode();
    }
}
