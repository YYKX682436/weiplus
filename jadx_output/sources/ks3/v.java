package ks3;

/* loaded from: classes8.dex */
public class v implements java.util.Comparator {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ks3.z f311754d;

    public v(ks3.z zVar) {
        this.f311754d = zVar;
    }

    @Override // java.util.Comparator
    public int compare(java.lang.Object obj, java.lang.Object obj2) {
        ks3.u uVar = (ks3.u) obj;
        ks3.u uVar2 = (ks3.u) obj2;
        java.lang.String str = uVar.f311753h;
        ks3.z zVar = this.f311754d;
        if (com.tencent.mm.sdk.platformtools.t8.y0(ks3.z.a(zVar, str)) && com.tencent.mm.sdk.platformtools.t8.y0(ks3.z.a(zVar, uVar2.f311753h))) {
            return uVar.f311753h.compareTo(uVar2.f311753h);
        }
        if (com.tencent.mm.sdk.platformtools.t8.y0(ks3.z.a(zVar, uVar.f311753h))) {
            return -1;
        }
        if (com.tencent.mm.sdk.platformtools.t8.y0(ks3.z.a(zVar, uVar2.f311753h))) {
            return 1;
        }
        return uVar.f311753h.compareTo(uVar2.f311753h);
    }
}
