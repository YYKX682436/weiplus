package org.chromium.net.impl;

/* loaded from: classes13.dex */
public class NativeCronetProvider extends org.chromium.net.CronetProvider {
    public NativeCronetProvider(android.content.Context context) {
        super(context);
    }

    @Override // org.chromium.net.CronetProvider
    public org.chromium.net.CronetEngine.Builder createBuilder() {
        return new org.chromium.net.ExperimentalCronetEngine.Builder(new org.chromium.net.impl.NativeCronetEngineBuilderWithLibraryLoaderImpl(this.mContext));
    }

    public boolean equals(java.lang.Object obj) {
        return obj == this || ((obj instanceof org.chromium.net.impl.NativeCronetProvider) && this.mContext.equals(((org.chromium.net.impl.NativeCronetProvider) obj).mContext));
    }

    @Override // org.chromium.net.CronetProvider
    public java.lang.String getName() {
        return org.chromium.net.CronetProvider.PROVIDER_NAME_APP_PACKAGED;
    }

    @Override // org.chromium.net.CronetProvider
    public java.lang.String getVersion() {
        return org.chromium.net.impl.ImplVersion.getCronetVersion();
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{org.chromium.net.impl.NativeCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        return true;
    }
}
