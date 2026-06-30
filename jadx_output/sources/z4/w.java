package z4;

/* loaded from: classes13.dex */
public class w extends y4.f {

    /* renamed from: a, reason: collision with root package name */
    public android.webkit.SafeBrowsingResponse f470078a;

    /* renamed from: b, reason: collision with root package name */
    public org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface f470079b;

    public w(java.lang.reflect.InvocationHandler invocationHandler) {
        this.f470079b = (org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface) org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil.castToSuppLibClass(org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface.class, invocationHandler);
    }

    public w(android.webkit.SafeBrowsingResponse safeBrowsingResponse) {
        this.f470078a = safeBrowsingResponse;
    }
}
