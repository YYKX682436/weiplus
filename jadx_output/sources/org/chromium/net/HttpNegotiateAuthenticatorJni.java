package org.chromium.net;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public class HttpNegotiateAuthenticatorJni implements org.chromium.net.HttpNegotiateAuthenticator.Natives {
    public static final c56.a TEST_HOOKS = new c56.a() { // from class: org.chromium.net.HttpNegotiateAuthenticatorJni.1
        public void setInstanceForTesting(org.chromium.net.HttpNegotiateAuthenticator.Natives natives) {
            if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
                org.chromium.net.HttpNegotiateAuthenticatorJni.testInstance = natives;
                return;
            }
            throw new java.lang.RuntimeException("Tried to set a JNI mock when mocks aren't enabled!");
        }
    };
    private static org.chromium.net.HttpNegotiateAuthenticator.Natives testInstance;

    public static org.chromium.net.HttpNegotiateAuthenticator.Natives get() {
        if (org.jni_zero.GEN_JNI.TESTING_ENABLED) {
            org.chromium.net.HttpNegotiateAuthenticator.Natives natives = testInstance;
            if (natives != null) {
                return natives;
            }
            if (org.jni_zero.GEN_JNI.REQUIRE_MOCK) {
                throw new java.lang.UnsupportedOperationException("No mock found for the native implementation of HttpNegotiateAuthenticator.Natives. The current configuration requires implementations be mocked.");
            }
        }
        return new org.chromium.net.HttpNegotiateAuthenticatorJni();
    }

    @Override // org.chromium.net.HttpNegotiateAuthenticator.Natives
    public void setResult(long j17, org.chromium.net.HttpNegotiateAuthenticator httpNegotiateAuthenticator, int i17, java.lang.String str) {
        org.jni_zero.GEN_JNI.org_chromium_net_HttpNegotiateAuthenticator_setResult(j17, httpNegotiateAuthenticator, i17, str);
    }
}
