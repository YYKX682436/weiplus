package lj2;

/* loaded from: classes8.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f318968a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f318969b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f318970c;

    public z0(android.view.View view, com.tencent.mm.ui.widget.imageview.WeImageView weImageView, android.widget.TextView textView) {
        this.f318968a = view;
        this.f318969b = weImageView;
        this.f318970c = textView;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj2.z0)) {
            return false;
        }
        lj2.z0 z0Var = (lj2.z0) obj;
        return kotlin.jvm.internal.o.b(this.f318968a, z0Var.f318968a) && kotlin.jvm.internal.o.b(this.f318969b, z0Var.f318969b) && kotlin.jvm.internal.o.b(this.f318970c, z0Var.f318970c);
    }

    public int hashCode() {
        android.view.View view = this.f318968a;
        int hashCode = (view == null ? 0 : view.hashCode()) * 31;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f318969b;
        int hashCode2 = (hashCode + (weImageView == null ? 0 : weImageView.hashCode())) * 31;
        android.widget.TextView textView = this.f318970c;
        return hashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "MicModeViewGroup(layout=" + this.f318968a + ", icon=" + this.f318969b + ", text=" + this.f318970c + ')';
    }
}
