package ps3;

/* loaded from: classes11.dex */
public final class f implements ps3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ps3.m f358081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f358082b;

    public f(ps3.m mVar, java.lang.String str, long j17) {
        this.f358081a = mVar;
        this.f358082b = j17;
    }

    @Override // ps3.d
    public void a(boolean z17, boolean z18, java.lang.String str, java.lang.String str2) {
        ps3.m mVar = this.f358081a;
        if (z17) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            if (((int) n17.E2) > 0) {
                c01.e2.m0(n17);
            }
            ps3.m.b(mVar, str, 1);
            if (kz5.n0.O(mVar.f358104f, str)) {
                kotlin.jvm.internal.m0.a(mVar.f358104f).remove(str);
            }
        } else if (z18) {
            if (str != null && !mVar.f358104f.contains(str)) {
                mVar.f358104f.add(str);
            }
            ps3.m.b(mVar, str, 2);
        }
        mVar.f358108m.post(new ps3.h(mVar, z17, z18, str2, str, this.f358082b));
    }
}
