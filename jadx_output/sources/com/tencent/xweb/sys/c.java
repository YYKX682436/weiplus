package com.tencent.xweb.sys;

/* loaded from: classes13.dex */
public class c implements tx5.d {

    /* renamed from: a, reason: collision with root package name */
    public final y4.b f220548a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f220549b = new java.util.concurrent.ConcurrentHashMap();

    public c() {
        try {
            if (!com.tencent.xweb.o2.c() || !y4.n.a(org.chromium.support_lib_boundary.util.Features.MULTI_PROFILE)) {
                by5.c4.f("SysProfileStoreWrapper", "SysProfileStoreWrapper not used, isSupportMultiProfile:" + com.tencent.xweb.o2.c() + ", isFeatureSupported:" + y4.n.a(org.chromium.support_lib_boundary.util.Features.MULTI_PROFILE));
                return;
            }
            try {
                if (!z4.e0.f470065g.b()) {
                    throw z4.e0.a();
                }
                if (z4.u.f470075b == null) {
                    z4.u.f470075b = new z4.u(z4.g0.f470067a.getProfileStore());
                }
                this.f220548a = z4.u.f470075b;
            } catch (java.lang.Exception e17) {
                java.lang.String stackTraceString = android.util.Log.getStackTraceString(e17);
                by5.c4.g("SysProfileStoreWrapper", "Create sys profile store failed." + stackTraceString);
                xx5.g.a(4, stackTraceString, 3, java.lang.String.valueOf(by5.e.d()));
            }
        } catch (java.lang.Exception e18) {
            by5.c4.d("SysProfileStoreWrapper", "SysProfileStoreWrapper init failed.", e18);
        }
    }

    @Override // tx5.d
    public tx5.c getOrCreateProfile(java.lang.String str) {
        if (this.f220548a == null) {
            by5.c4.c("SysProfileStoreWrapper", "getOrCreateProfile failed, mProfileStore is null");
            return null;
        }
        com.tencent.xweb.sys.b bVar = (com.tencent.xweb.sys.b) ((java.util.concurrent.ConcurrentHashMap) this.f220549b).get(str);
        if (bVar == null) {
            synchronized (this.f220549b) {
                z4.u uVar = (z4.u) this.f220548a;
                uVar.getClass();
                if (!z4.e0.f470065g.b()) {
                    throw z4.e0.a();
                }
                bVar = new com.tencent.xweb.sys.b(new z4.t((org.chromium.support_lib_boundary.ProfileBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.ProfileBoundaryInterface.class, uVar.f470076a.getOrCreateProfile(str))));
                ((java.util.concurrent.ConcurrentHashMap) this.f220549b).put(str, bVar);
            }
        }
        by5.c4.f("SysProfileStoreWrapper", "getOrCreateProfile, name:" + str + ", profile:" + bVar);
        return bVar;
    }
}
