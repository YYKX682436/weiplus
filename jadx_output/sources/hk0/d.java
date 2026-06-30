package hk0;

/* loaded from: classes3.dex */
public final class d extends hk0.a {

    /* renamed from: b, reason: collision with root package name */
    public final hk0.l f281713b;

    /* renamed from: c, reason: collision with root package name */
    public final xk0.c f281714c;

    /* renamed from: d, reason: collision with root package name */
    public final int f281715d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f281716e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hk0.l type, xk0.c cropItem, int i17, boolean z17) {
        super(type);
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(cropItem, "cropItem");
        this.f281713b = type;
        this.f281714c = cropItem;
        this.f281715d = i17;
        this.f281716e = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.d)) {
            return false;
        }
        hk0.d dVar = (hk0.d) obj;
        return this.f281713b == dVar.f281713b && kotlin.jvm.internal.o.b(this.f281714c, dVar.f281714c) && this.f281715d == dVar.f281715d && this.f281716e == dVar.f281716e;
    }

    public int hashCode() {
        return (((((this.f281713b.hashCode() * 31) + this.f281714c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f281715d)) * 31) + java.lang.Boolean.hashCode(this.f281716e);
    }

    public java.lang.String toString() {
        return "CropEditData(type=" + this.f281713b + ", cropItem=" + this.f281714c + ", rotate=" + this.f281715d + ", currentHasCrop=" + this.f281716e + ')';
    }
}
