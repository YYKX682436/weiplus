package org.chromium.net.impl;

/* loaded from: classes13.dex */
public class NativeCronetEngineBuilderWithLibraryLoaderImpl extends org.chromium.net.impl.NativeCronetEngineBuilderImpl {
    private org.chromium.net.impl.VersionSafeCallbacks.LibraryLoader mLibraryLoader;

    public NativeCronetEngineBuilderWithLibraryLoaderImpl(android.content.Context context) {
        super(context);
    }

    @Override // org.chromium.net.impl.CronetEngineBuilderImpl
    public org.chromium.net.impl.VersionSafeCallbacks.LibraryLoader libraryLoader() {
        return this.mLibraryLoader;
    }

    @Override // org.chromium.net.impl.NativeCronetEngineBuilderImpl, org.chromium.net.impl.CronetEngineBuilderImpl, org.chromium.net.ICronetEngineBuilder
    public org.chromium.net.impl.CronetEngineBuilderImpl setLibraryLoader(org.chromium.net.CronetEngine.Builder.LibraryLoader libraryLoader) {
        this.mLibraryLoader = new org.chromium.net.impl.VersionSafeCallbacks.LibraryLoader(libraryLoader);
        return this;
    }
}
