package qk;

/* loaded from: classes2.dex */
public final class aa {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f364012a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.g80 f364013b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f364014c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f364015d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View.OnClickListener f364016e;

    public aa(android.app.Activity context, bw5.g80 listenLikeRequest, boolean z17, java.lang.String str, android.view.View.OnClickListener onClickListener, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 4) != 0 ? false : z17;
        str = (i17 & 8) != 0 ? null : str;
        onClickListener = (i17 & 16) != 0 ? null : onClickListener;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(listenLikeRequest, "listenLikeRequest");
        this.f364012a = context;
        this.f364013b = listenLikeRequest;
        this.f364014c = z17;
        this.f364015d = str;
        this.f364016e = onClickListener;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qk.aa)) {
            return false;
        }
        qk.aa aaVar = (qk.aa) obj;
        return kotlin.jvm.internal.o.b(this.f364012a, aaVar.f364012a) && kotlin.jvm.internal.o.b(this.f364013b, aaVar.f364013b) && this.f364014c == aaVar.f364014c && kotlin.jvm.internal.o.b(this.f364015d, aaVar.f364015d) && kotlin.jvm.internal.o.b(this.f364016e, aaVar.f364016e);
    }

    public int hashCode() {
        int hashCode = ((((this.f364012a.hashCode() * 31) + this.f364013b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f364014c)) * 31;
        java.lang.String str = this.f364015d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        android.view.View.OnClickListener onClickListener = this.f364016e;
        return hashCode2 + (onClickListener != null ? onClickListener.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "TingLikeMusicRequest(context=" + this.f364012a + ", listenLikeRequest=" + this.f364013b + ", showSuccessToast=" + this.f364014c + ", successToastWording=" + this.f364015d + ", sucessToastJumpDetailClickListener=" + this.f364016e + ')';
    }
}
