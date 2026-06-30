package jn0;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f300475a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f300476b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f300477c;

    /* renamed from: d, reason: collision with root package name */
    public final int f300478d;

    /* renamed from: e, reason: collision with root package name */
    public final int f300479e;

    /* renamed from: f, reason: collision with root package name */
    public final android.graphics.Bitmap f300480f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f300481g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout f300482h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f300483i;

    /* renamed from: j, reason: collision with root package name */
    public final android.graphics.Bitmap f300484j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f300485k;

    public a(android.content.Context context, boolean z17, boolean z18, int i17, int i18, android.graphics.Bitmap bitmap, boolean z19, com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout, boolean z27, android.graphics.Bitmap bitmap2, boolean z28, int i19, kotlin.jvm.internal.i iVar) {
        boolean z29 = (i19 & 2) != 0 ? true : z17;
        boolean z37 = (i19 & 4) != 0 ? true : z18;
        int i27 = (i19 & 8) != 0 ? 2 : i17;
        int i28 = (i19 & 16) != 0 ? 12 : i18;
        android.graphics.Bitmap bitmap3 = (i19 & 32) != 0 ? null : bitmap;
        boolean z38 = (i19 & 64) != 0 ? false : z19;
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout2 = (i19 & 128) != 0 ? null : mMVideoFrameLayout;
        boolean z39 = (i19 & 256) == 0 ? z27 : false;
        android.graphics.Bitmap bitmap4 = (i19 & 512) == 0 ? bitmap2 : null;
        boolean z47 = (i19 & 1024) == 0 ? z28 : true;
        kotlin.jvm.internal.o.g(context, "context");
        this.f300475a = context;
        this.f300476b = z29;
        this.f300477c = z37;
        this.f300478d = i27;
        this.f300479e = i28;
        this.f300480f = bitmap3;
        this.f300481g = z38;
        this.f300482h = mMVideoFrameLayout2;
        this.f300483i = z39;
        this.f300484j = bitmap4;
        this.f300485k = z47;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn0.a)) {
            return false;
        }
        jn0.a aVar = (jn0.a) obj;
        return kotlin.jvm.internal.o.b(this.f300475a, aVar.f300475a) && this.f300476b == aVar.f300476b && this.f300477c == aVar.f300477c && this.f300478d == aVar.f300478d && this.f300479e == aVar.f300479e && kotlin.jvm.internal.o.b(this.f300480f, aVar.f300480f) && this.f300481g == aVar.f300481g && kotlin.jvm.internal.o.b(this.f300482h, aVar.f300482h) && this.f300483i == aVar.f300483i && kotlin.jvm.internal.o.b(this.f300484j, aVar.f300484j) && this.f300485k == aVar.f300485k;
    }

    public int hashCode() {
        int hashCode = ((((((((this.f300475a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f300476b)) * 31) + java.lang.Boolean.hashCode(this.f300477c)) * 31) + java.lang.Integer.hashCode(this.f300478d)) * 31) + java.lang.Integer.hashCode(this.f300479e)) * 31;
        android.graphics.Bitmap bitmap = this.f300480f;
        int hashCode2 = (((hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f300481g)) * 31;
        com.tencent.mm.plugin.mmplayer.player.view.MMVideoFrameLayout mMVideoFrameLayout = this.f300482h;
        int hashCode3 = (((hashCode2 + (mMVideoFrameLayout == null ? 0 : mMVideoFrameLayout.hashCode())) * 31) + java.lang.Boolean.hashCode(this.f300483i)) * 31;
        android.graphics.Bitmap bitmap2 = this.f300484j;
        return ((hashCode3 + (bitmap2 != null ? bitmap2.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f300485k);
    }

    public java.lang.String toString() {
        return "FloatModeDataParams(context=" + this.f300475a + ", forceMoveTask=" + this.f300476b + ", dontFinish=" + this.f300477c + ", generateType=" + this.f300478d + ", opType=" + this.f300479e + ", muteVideoImage=" + this.f300480f + ", isFluentFloatShow=" + this.f300481g + ", adVideoView=" + this.f300482h + ", isAnchorLandscapeMode=" + this.f300483i + ", floatAnimBitmap=" + this.f300484j + ", updateDrawSize=" + this.f300485k + ')';
    }
}
