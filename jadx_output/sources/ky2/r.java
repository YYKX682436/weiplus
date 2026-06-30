package ky2;

/* loaded from: classes.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f313575a;

    /* renamed from: b, reason: collision with root package name */
    public final ky2.s f313576b;

    /* renamed from: c, reason: collision with root package name */
    public int f313577c;

    public r(java.lang.String choice, ky2.s settingItem, int i17) {
        kotlin.jvm.internal.o.g(choice, "choice");
        kotlin.jvm.internal.o.g(settingItem, "settingItem");
        this.f313575a = choice;
        this.f313576b = settingItem;
        this.f313577c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky2.r)) {
            return false;
        }
        ky2.r rVar = (ky2.r) obj;
        return kotlin.jvm.internal.o.b(this.f313575a, rVar.f313575a) && kotlin.jvm.internal.o.b(this.f313576b, rVar.f313576b) && this.f313577c == rVar.f313577c;
    }

    public int hashCode() {
        return (((this.f313575a.hashCode() * 31) + this.f313576b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f313577c);
    }

    public java.lang.String toString() {
        return "VoteItem(choice=" + this.f313575a + ", settingItem=" + this.f313576b + ", itemType=" + this.f313577c + ')';
    }
}
