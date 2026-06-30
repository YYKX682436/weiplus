package sr3;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f411848a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f411849b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f411850c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f411851d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f411852e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f411853f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f411854g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f411855h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f411856i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f411857j;

    public f(java.lang.String titleTag, java.lang.String unFocusButtonTvText, java.lang.String focusButtonTvText, java.lang.String cacheNickName, java.lang.String cacheDesc, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28) {
        kotlin.jvm.internal.o.g(titleTag, "titleTag");
        kotlin.jvm.internal.o.g(unFocusButtonTvText, "unFocusButtonTvText");
        kotlin.jvm.internal.o.g(focusButtonTvText, "focusButtonTvText");
        kotlin.jvm.internal.o.g(cacheNickName, "cacheNickName");
        kotlin.jvm.internal.o.g(cacheDesc, "cacheDesc");
        this.f411848a = titleTag;
        this.f411849b = unFocusButtonTvText;
        this.f411850c = focusButtonTvText;
        this.f411851d = cacheNickName;
        this.f411852e = cacheDesc;
        this.f411853f = z17;
        this.f411854g = z18;
        this.f411855h = z19;
        this.f411856i = z27;
        this.f411857j = z28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sr3.f)) {
            return false;
        }
        sr3.f fVar = (sr3.f) obj;
        return kotlin.jvm.internal.o.b(this.f411848a, fVar.f411848a) && kotlin.jvm.internal.o.b(this.f411849b, fVar.f411849b) && kotlin.jvm.internal.o.b(this.f411850c, fVar.f411850c) && kotlin.jvm.internal.o.b(this.f411851d, fVar.f411851d) && kotlin.jvm.internal.o.b(this.f411852e, fVar.f411852e) && this.f411853f == fVar.f411853f && this.f411854g == fVar.f411854g && this.f411855h == fVar.f411855h && this.f411856i == fVar.f411856i && this.f411857j == fVar.f411857j;
    }

    public int hashCode() {
        return (((((((((((((((((this.f411848a.hashCode() * 31) + this.f411849b.hashCode()) * 31) + this.f411850c.hashCode()) * 31) + this.f411851d.hashCode()) * 31) + this.f411852e.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f411853f)) * 31) + java.lang.Boolean.hashCode(this.f411854g)) * 31) + java.lang.Boolean.hashCode(this.f411855h)) * 31) + java.lang.Boolean.hashCode(this.f411856i)) * 31) + java.lang.Boolean.hashCode(this.f411857j);
    }

    public java.lang.String toString() {
        return "HeaderConfig(titleTag=" + this.f411848a + ", unFocusButtonTvText=" + this.f411849b + ", focusButtonTvText=" + this.f411850c + ", cacheNickName=" + this.f411851d + ", cacheDesc=" + this.f411852e + ", showFinderTv=" + this.f411853f + ", showAIMessage=" + this.f411854g + ", showLiveReserve=" + this.f411855h + ", showShopWindow=" + this.f411856i + ", shouldShowEnterButtonWhenUnFocus=" + this.f411857j + ')';
    }

    public /* synthetic */ f(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? "" : str, (i17 & 2) != 0 ? "" : str2, (i17 & 4) != 0 ? "" : str3, (i17 & 8) != 0 ? "" : str4, (i17 & 16) == 0 ? str5 : "", (i17 & 32) != 0 ? true : z17, (i17 & 64) != 0 ? true : z18, (i17 & 128) != 0 ? true : z19, (i17 & 256) == 0 ? z27 : true, (i17 & 512) != 0 ? false : z28);
    }
}
