package cw3;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f224157a;

    /* renamed from: b, reason: collision with root package name */
    public int f224158b;

    /* renamed from: c, reason: collision with root package name */
    public int f224159c;

    /* renamed from: d, reason: collision with root package name */
    public int f224160d;

    /* renamed from: e, reason: collision with root package name */
    public int f224161e;

    public d(int i17, int i18, int i19, int i27, int i28, int i29, kotlin.jvm.internal.i iVar) {
        i17 = (i29 & 1) != 0 ? com.tencent.mm.R.raw.icons_filled_done : i17;
        i18 = (i29 & 2) != 0 ? i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479704cz) : i18;
        i19 = (i29 & 4) != 0 ? i65.a.h(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.dimen.f479693cs) : i19;
        i27 = (i29 & 8) != 0 ? i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.Brand_100) : i27;
        i28 = (i29 & 16) != 0 ? i65.a.d(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.color.f478873jj) : i28;
        this.f224157a = i17;
        this.f224158b = i18;
        this.f224159c = i19;
        this.f224160d = i27;
        this.f224161e = i28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cw3.d)) {
            return false;
        }
        cw3.d dVar = (cw3.d) obj;
        return this.f224157a == dVar.f224157a && this.f224158b == dVar.f224158b && this.f224159c == dVar.f224159c && this.f224160d == dVar.f224160d && this.f224161e == dVar.f224161e;
    }

    public int hashCode() {
        return (((((((java.lang.Integer.hashCode(this.f224157a) * 31) + java.lang.Integer.hashCode(this.f224158b)) * 31) + java.lang.Integer.hashCode(this.f224159c)) * 31) + java.lang.Integer.hashCode(this.f224160d)) * 31) + java.lang.Integer.hashCode(this.f224161e);
    }

    public java.lang.String toString() {
        return "BehaviorStatusViewConfig(successImgRes=" + this.f224157a + ", successImgSize=" + this.f224158b + ", progressViewSize=" + this.f224159c + ", successImgColor=" + this.f224160d + ", progressViewColor=" + this.f224161e + ')';
    }
}
