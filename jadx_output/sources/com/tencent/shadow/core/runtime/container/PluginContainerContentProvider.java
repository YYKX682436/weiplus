package com.tencent.shadow.core.runtime.container;

/* loaded from: classes16.dex */
public class PluginContainerContentProvider extends android.content.ContentProvider {
    private com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate;

    public PluginContainerContentProvider() {
        com.tencent.shadow.core.runtime.container.ContentProviderDelegateProviderHolder.setDelegateProviderHolderPrepareListener(new com.tencent.shadow.core.runtime.container.ContentProviderDelegateProviderHolder.DelegateProviderHolderPrepareListener() { // from class: com.tencent.shadow.core.runtime.container.PluginContainerContentProvider.1
            @Override // com.tencent.shadow.core.runtime.container.ContentProviderDelegateProviderHolder.DelegateProviderHolderPrepareListener
            public void onPrepare() {
                com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate;
                com.tencent.shadow.core.runtime.container.ContentProviderDelegateProvider contentProviderDelegateProvider = com.tencent.shadow.core.runtime.container.ContentProviderDelegateProviderHolder.contentProviderDelegateProvider;
                if (contentProviderDelegateProvider != null) {
                    hostContentProviderDelegate = contentProviderDelegateProvider.getHostContentProviderDelegate();
                    hostContentProviderDelegate.onCreate();
                } else {
                    hostContentProviderDelegate = null;
                }
                com.tencent.shadow.core.runtime.container.PluginContainerContentProvider.this.hostContentProviderDelegate = hostContentProviderDelegate;
            }
        });
    }

    private void checkHostContentProviderDelegate() {
        if (this.hostContentProviderDelegate != null) {
            return;
        }
        throw new java.lang.IllegalArgumentException("hostContentProviderDelegate is null ,请检查ContentProviderDelegateProviderHolder.setDelegateProviderHolderPrepareListener是否调用，或" + getClass().getSimpleName() + " 是否和插件在同一进程");
    }

    @Override // android.content.ContentProvider
    public int bulkInsert(android.net.Uri uri, android.content.ContentValues[] contentValuesArr) {
        checkHostContentProviderDelegate();
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            return hostContentProviderDelegate.bulkInsert(uri, contentValuesArr);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public android.os.Bundle call(java.lang.String str, java.lang.String str2, android.os.Bundle bundle) {
        checkHostContentProviderDelegate();
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            return hostContentProviderDelegate.call(str, str2, bundle);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        checkHostContentProviderDelegate();
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            return hostContentProviderDelegate.delete(uri, str, strArr);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public java.lang.String getType(android.net.Uri uri) {
        checkHostContentProviderDelegate();
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            return hostContentProviderDelegate.getType(uri);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        checkHostContentProviderDelegate();
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            return hostContentProviderDelegate.insert(uri, contentValues);
        }
        return null;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            hostContentProviderDelegate.onConfigurationChanged(configuration);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks
    public void onLowMemory() {
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            hostContentProviderDelegate.onLowMemory();
        }
    }

    @Override // android.content.ContentProvider, android.content.ComponentCallbacks2
    public void onTrimMemory(int i17) {
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            hostContentProviderDelegate.onTrimMemory(i17);
        }
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str) {
        checkHostContentProviderDelegate();
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            return hostContentProviderDelegate.openFile(uri, str);
        }
        return super.openFile(uri, str);
    }

    @Override // android.content.ContentProvider
    public android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        checkHostContentProviderDelegate();
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            return hostContentProviderDelegate.query(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        checkHostContentProviderDelegate();
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            return hostContentProviderDelegate.update(uri, contentValues, str, strArr);
        }
        return 0;
    }

    @Override // android.content.ContentProvider
    public android.os.ParcelFileDescriptor openFile(android.net.Uri uri, java.lang.String str, android.os.CancellationSignal cancellationSignal) {
        checkHostContentProviderDelegate();
        com.tencent.shadow.core.runtime.container.HostContentProviderDelegate hostContentProviderDelegate = this.hostContentProviderDelegate;
        if (hostContentProviderDelegate != null) {
            return hostContentProviderDelegate.openFile(uri, str, cancellationSignal);
        }
        return super.openFile(uri, str);
    }
}
