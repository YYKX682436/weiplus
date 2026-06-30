package zy2;

/* loaded from: classes10.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f477351a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.CheckBox f477352b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.ImageView f477353c;

    public b5(android.view.View root, android.widget.CheckBox checkBox, android.widget.ImageView thumbIv) {
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(checkBox, "checkBox");
        kotlin.jvm.internal.o.g(thumbIv, "thumbIv");
        this.f477351a = root;
        this.f477352b = checkBox;
        this.f477353c = thumbIv;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.b5)) {
            return false;
        }
        zy2.b5 b5Var = (zy2.b5) obj;
        return kotlin.jvm.internal.o.b(this.f477351a, b5Var.f477351a) && kotlin.jvm.internal.o.b(this.f477352b, b5Var.f477352b) && kotlin.jvm.internal.o.b(this.f477353c, b5Var.f477353c);
    }

    public int hashCode() {
        return (((this.f477351a.hashCode() * 31) + this.f477352b.hashCode()) * 31) + this.f477353c.hashCode();
    }

    public java.lang.String toString() {
        return "FinderMsgHistoryGalleryMediaItemViews(root=" + this.f477351a + ", checkBox=" + this.f477352b + ", thumbIv=" + this.f477353c + ')';
    }
}
