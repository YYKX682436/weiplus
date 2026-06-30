package tj4;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f419813a;

    /* renamed from: b, reason: collision with root package name */
    public final int f419814b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f419815c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ArrayList f419816d;

    /* renamed from: e, reason: collision with root package name */
    public int f419817e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f419818f;

    /* renamed from: g, reason: collision with root package name */
    public int f419819g;

    public a(java.lang.String dateStr, int i17, java.util.ArrayList iconIdList, java.util.ArrayList bgIdList, int i18, java.lang.String statusId, int i19) {
        kotlin.jvm.internal.o.g(dateStr, "dateStr");
        kotlin.jvm.internal.o.g(iconIdList, "iconIdList");
        kotlin.jvm.internal.o.g(bgIdList, "bgIdList");
        kotlin.jvm.internal.o.g(statusId, "statusId");
        this.f419813a = dateStr;
        this.f419814b = i17;
        this.f419815c = iconIdList;
        this.f419816d = bgIdList;
        this.f419817e = i18;
        this.f419818f = statusId;
        this.f419819g = i19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tj4.a)) {
            return false;
        }
        tj4.a aVar = (tj4.a) obj;
        return kotlin.jvm.internal.o.b(this.f419813a, aVar.f419813a) && this.f419814b == aVar.f419814b && kotlin.jvm.internal.o.b(this.f419815c, aVar.f419815c) && kotlin.jvm.internal.o.b(this.f419816d, aVar.f419816d) && this.f419817e == aVar.f419817e && kotlin.jvm.internal.o.b(this.f419818f, aVar.f419818f) && this.f419819g == aVar.f419819g;
    }

    public int hashCode() {
        return (((((((((((this.f419813a.hashCode() * 31) + java.lang.Integer.hashCode(this.f419814b)) * 31) + this.f419815c.hashCode()) * 31) + this.f419816d.hashCode()) * 31) + java.lang.Integer.hashCode(this.f419817e)) * 31) + this.f419818f.hashCode()) * 31) + java.lang.Integer.hashCode(this.f419819g);
    }

    public java.lang.String toString() {
        return "SelfIconData(dateStr=" + this.f419813a + ", dayDiff=" + this.f419814b + ", iconIdList=" + this.f419815c + ", bgIdList=" + this.f419816d + ", iconType=" + this.f419817e + ", statusId=" + this.f419818f + ", createTime=" + this.f419819g + ')';
    }
}
