package uf2;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.widget.FrameLayout f427162a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.view.MMPAGView f427163b;

    /* renamed from: c, reason: collision with root package name */
    public android.graphics.Rect f427164c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f427165d;

    public a(android.widget.FrameLayout pagAreaLayout, com.tencent.mm.view.MMPAGView pagView, android.graphics.Rect rect, java.lang.String runningPagUrl, int i17, kotlin.jvm.internal.i iVar) {
        runningPagUrl = (i17 & 8) != 0 ? "" : runningPagUrl;
        kotlin.jvm.internal.o.g(pagAreaLayout, "pagAreaLayout");
        kotlin.jvm.internal.o.g(pagView, "pagView");
        kotlin.jvm.internal.o.g(runningPagUrl, "runningPagUrl");
        this.f427162a = pagAreaLayout;
        this.f427163b = pagView;
        this.f427164c = rect;
        this.f427165d = runningPagUrl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uf2.a)) {
            return false;
        }
        uf2.a aVar = (uf2.a) obj;
        return kotlin.jvm.internal.o.b(this.f427162a, aVar.f427162a) && kotlin.jvm.internal.o.b(this.f427163b, aVar.f427163b) && kotlin.jvm.internal.o.b(this.f427164c, aVar.f427164c) && kotlin.jvm.internal.o.b(this.f427165d, aVar.f427165d);
    }

    public int hashCode() {
        int hashCode = ((this.f427162a.hashCode() * 31) + this.f427163b.hashCode()) * 31;
        android.graphics.Rect rect = this.f427164c;
        return ((hashCode + (rect == null ? 0 : rect.hashCode())) * 31) + this.f427165d.hashCode();
    }

    public java.lang.String toString() {
        return "AllWidget(pagAreaLayout=" + this.f427162a + ", pagView=" + this.f427163b + ", rect=" + this.f427164c + ", runningPagUrl=" + this.f427165d + ')';
    }
}
