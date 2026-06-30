package ed5;

/* loaded from: classes5.dex */
public final class r extends ed5.s {

    /* renamed from: a, reason: collision with root package name */
    public final int f251380a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f251381b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f251382c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f251383d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(int i17, java.lang.String sectionKey, java.lang.String displayText, android.view.View anchorView) {
        super(null);
        kotlin.jvm.internal.o.g(sectionKey, "sectionKey");
        kotlin.jvm.internal.o.g(displayText, "displayText");
        kotlin.jvm.internal.o.g(anchorView, "anchorView");
        this.f251380a = i17;
        this.f251381b = sectionKey;
        this.f251382c = displayText;
        this.f251383d = anchorView;
    }

    @Override // ed5.s
    public android.view.View a() {
        return this.f251383d;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed5.r)) {
            return false;
        }
        ed5.r rVar = (ed5.r) obj;
        return this.f251380a == rVar.f251380a && kotlin.jvm.internal.o.b(this.f251381b, rVar.f251381b) && kotlin.jvm.internal.o.b(this.f251382c, rVar.f251382c) && kotlin.jvm.internal.o.b(this.f251383d, rVar.f251383d);
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f251380a) * 31) + this.f251381b.hashCode()) * 31) + this.f251382c.hashCode()) * 31) + this.f251383d.hashCode();
    }

    public java.lang.String toString() {
        return "TimelineItem(adapterPosition=" + this.f251380a + ", sectionKey=" + this.f251381b + ", displayText=" + this.f251382c + ", anchorView=" + this.f251383d + ')';
    }
}
