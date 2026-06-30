package hk0;

/* loaded from: classes3.dex */
public final class c extends hk0.a {

    /* renamed from: b, reason: collision with root package name */
    public final hk0.l f281704b;

    /* renamed from: c, reason: collision with root package name */
    public final hk0.h f281705c;

    /* renamed from: d, reason: collision with root package name */
    public final xk0.d f281706d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f281707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(hk0.l type, hk0.h brushType, xk0.d dVar, java.util.ArrayList arrayList, int i17, kotlin.jvm.internal.i iVar) {
        super(type);
        dVar = (i17 & 4) != 0 ? null : dVar;
        arrayList = (i17 & 8) != 0 ? null : arrayList;
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(brushType, "brushType");
        this.f281704b = type;
        this.f281705c = brushType;
        this.f281706d = dVar;
        this.f281707e = arrayList;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.c)) {
            return false;
        }
        hk0.c cVar = (hk0.c) obj;
        return this.f281704b == cVar.f281704b && this.f281705c == cVar.f281705c && kotlin.jvm.internal.o.b(this.f281706d, cVar.f281706d) && kotlin.jvm.internal.o.b(this.f281707e, cVar.f281707e);
    }

    public int hashCode() {
        int hashCode = ((this.f281704b.hashCode() * 31) + this.f281705c.hashCode()) * 31;
        xk0.d dVar = this.f281706d;
        int hashCode2 = (hashCode + (dVar == null ? 0 : dVar.hashCode())) * 31;
        java.util.ArrayList arrayList = this.f281707e;
        return hashCode2 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "BrushEditData(type=" + this.f281704b + ", brushType=" + this.f281705c + ", item=" + this.f281706d + ", itemList=" + this.f281707e + ')';
    }
}
