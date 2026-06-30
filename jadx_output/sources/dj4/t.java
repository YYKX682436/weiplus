package dj4;

/* loaded from: classes10.dex */
public final class t implements k70.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233045a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233046b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mj4.h f233047c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f233048d;

    public t(java.lang.String str, java.lang.String str2, mj4.h hVar, java.lang.String str3) {
        this.f233045a = str;
        this.f233046b = str2;
        this.f233047c = hVar;
        this.f233048d = str3;
    }

    @Override // k70.f0
    public final void a(java.lang.String str, android.graphics.Bitmap bitmap, java.lang.String str2) {
        if (bitmap == null) {
            return;
        }
        dj4.w.a(new dj4.s(this.f233045a, this.f233046b, this.f233047c, bitmap, this.f233048d));
    }
}
