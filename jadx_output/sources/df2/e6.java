package df2;

/* loaded from: classes3.dex */
public final class e6 {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f230034a;

    /* renamed from: b, reason: collision with root package name */
    public final android.widget.FrameLayout f230035b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f230036c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f230037d;

    /* renamed from: e, reason: collision with root package name */
    public android.graphics.Rect f230038e;

    /* renamed from: f, reason: collision with root package name */
    public kotlinx.coroutines.r2 f230039f;

    public e6(android.widget.FrameLayout micLinkScaleLayout, android.widget.FrameLayout pagAreaLayout, com.tencent.mm.view.MMPAGView pagView, android.widget.TextView nickNameTv, android.graphics.Rect rect, kotlinx.coroutines.r2 r2Var) {
        kotlin.jvm.internal.o.g(micLinkScaleLayout, "micLinkScaleLayout");
        kotlin.jvm.internal.o.g(pagAreaLayout, "pagAreaLayout");
        kotlin.jvm.internal.o.g(pagView, "pagView");
        kotlin.jvm.internal.o.g(nickNameTv, "nickNameTv");
        this.f230034a = micLinkScaleLayout;
        this.f230035b = pagAreaLayout;
        this.f230036c = pagView;
        this.f230037d = nickNameTv;
        this.f230038e = rect;
        this.f230039f = r2Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof df2.e6)) {
            return false;
        }
        df2.e6 e6Var = (df2.e6) obj;
        return kotlin.jvm.internal.o.b(this.f230034a, e6Var.f230034a) && kotlin.jvm.internal.o.b(this.f230035b, e6Var.f230035b) && kotlin.jvm.internal.o.b(this.f230036c, e6Var.f230036c) && kotlin.jvm.internal.o.b(this.f230037d, e6Var.f230037d) && kotlin.jvm.internal.o.b(this.f230038e, e6Var.f230038e) && kotlin.jvm.internal.o.b(this.f230039f, e6Var.f230039f);
    }

    public int hashCode() {
        int hashCode = ((((((this.f230034a.hashCode() * 31) + this.f230035b.hashCode()) * 31) + this.f230036c.hashCode()) * 31) + this.f230037d.hashCode()) * 31;
        android.graphics.Rect rect = this.f230038e;
        int hashCode2 = (hashCode + (rect == null ? 0 : rect.hashCode())) * 31;
        kotlinx.coroutines.r2 r2Var = this.f230039f;
        return hashCode2 + (r2Var != null ? r2Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AllWidget(micLinkScaleLayout=" + this.f230034a + ", pagAreaLayout=" + this.f230035b + ", pagView=" + this.f230036c + ", nickNameTv=" + this.f230037d + ", rect=" + this.f230038e + ", executeJob=" + this.f230039f + ')';
    }
}
