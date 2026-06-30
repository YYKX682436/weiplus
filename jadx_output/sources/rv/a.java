package rv;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f399811a;

    /* renamed from: b, reason: collision with root package name */
    public final int f399812b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f399813c;

    /* renamed from: d, reason: collision with root package name */
    public final int f399814d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.drawable.Drawable f399815e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Integer f399816f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f399817g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f399818h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f399819i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f399820j;

    public a(java.lang.String actionID, int i17, java.lang.String actionName, int i18, android.graphics.drawable.Drawable drawable, java.lang.Integer num, boolean z17, boolean z18, boolean z19, boolean z27, int i19, kotlin.jvm.internal.i iVar) {
        drawable = (i19 & 16) != 0 ? null : drawable;
        num = (i19 & 32) != 0 ? null : num;
        z17 = (i19 & 64) != 0 ? false : z17;
        z18 = (i19 & 128) != 0 ? false : z18;
        z19 = (i19 & 256) != 0 ? false : z19;
        z27 = (i19 & 512) != 0 ? false : z27;
        kotlin.jvm.internal.o.g(actionID, "actionID");
        kotlin.jvm.internal.o.g(actionName, "actionName");
        this.f399811a = actionID;
        this.f399812b = i17;
        this.f399813c = actionName;
        this.f399814d = i18;
        this.f399815e = drawable;
        this.f399816f = num;
        this.f399817g = z17;
        this.f399818h = z18;
        this.f399819i = z19;
        this.f399820j = z27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rv.a)) {
            return false;
        }
        rv.a aVar = (rv.a) obj;
        return kotlin.jvm.internal.o.b(this.f399811a, aVar.f399811a) && this.f399812b == aVar.f399812b && kotlin.jvm.internal.o.b(this.f399813c, aVar.f399813c) && this.f399814d == aVar.f399814d && kotlin.jvm.internal.o.b(this.f399815e, aVar.f399815e) && kotlin.jvm.internal.o.b(this.f399816f, aVar.f399816f) && this.f399817g == aVar.f399817g && this.f399818h == aVar.f399818h && this.f399819i == aVar.f399819i && this.f399820j == aVar.f399820j;
    }

    public int hashCode() {
        int hashCode = ((((((this.f399811a.hashCode() * 31) + java.lang.Integer.hashCode(this.f399812b)) * 31) + this.f399813c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f399814d)) * 31;
        android.graphics.drawable.Drawable drawable = this.f399815e;
        int hashCode2 = (hashCode + (drawable == null ? 0 : drawable.hashCode())) * 31;
        java.lang.Integer num = this.f399816f;
        return ((((((((hashCode2 + (num != null ? num.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f399817g)) * 31) + java.lang.Boolean.hashCode(this.f399818h)) * 31) + java.lang.Boolean.hashCode(this.f399819i)) * 31) + java.lang.Boolean.hashCode(this.f399820j);
    }

    public java.lang.String toString() {
        return "BrandCustomSharePanelAction(actionID=" + this.f399811a + ", menuId=" + this.f399812b + ", actionName=" + this.f399813c + ", iconKey=" + this.f399814d + ", iconImage=" + this.f399815e + ", iconTintColor=" + this.f399816f + ", isDisabled=" + this.f399817g + ", isClient=" + this.f399818h + ", refreshBeforeShow=" + this.f399819i + ", canShowNewFlag=" + this.f399820j + ')';
    }
}
