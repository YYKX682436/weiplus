package io.flutter.embedding.engine.loader;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public class ResourceExtractor {
    private static final java.lang.String[] SUPPORTED_ABIS = android.os.Build.SUPPORTED_ABIS;
    private static final java.lang.String TAG = "ResourceExtractor";
    private static final java.lang.String TIMESTAMP_PREFIX = "res_timestamp-";
    private final android.content.res.AssetManager mAssetManager;
    private final java.lang.String mDataDirPath;
    private io.flutter.embedding.engine.loader.ResourceExtractor.ExtractTask mExtractTask;
    private final android.content.pm.PackageManager mPackageManager;
    private final java.lang.String mPackageName;
    private final java.util.HashSet<java.lang.String> mResources = new java.util.HashSet<>();

    /* loaded from: classes13.dex */
    public static class ExtractTask extends android.os.AsyncTask<java.lang.Void, java.lang.Void, java.lang.Void> {
        private final android.content.res.AssetManager mAssetManager;
        private final java.lang.String mDataDirPath;
        private final android.content.pm.PackageManager mPackageManager;
        private final java.lang.String mPackageName;
        private final java.util.HashSet<java.lang.String> mResources;

        public ExtractTask(java.lang.String str, java.util.HashSet<java.lang.String> hashSet, java.lang.String str2, android.content.pm.PackageManager packageManager, android.content.res.AssetManager assetManager) {
            this.mDataDirPath = str;
            this.mResources = hashSet;
            this.mAssetManager = assetManager;
            this.mPackageName = str2;
            this.mPackageManager = packageManager;
        }

        private boolean extractAPK(java.io.File file) {
            java.util.Iterator<java.lang.String> it = this.mResources.iterator();
            while (it.hasNext()) {
                java.lang.String next = it.next();
                try {
                    java.io.File file2 = new java.io.File(file, next);
                    if (!file2.exists()) {
                        if (file2.getParentFile() != null) {
                            file2.getParentFile().mkdirs();
                        }
                        java.io.InputStream open = this.mAssetManager.open(next);
                        try {
                            java.io.FileOutputStream fileOutputStream = new java.io.FileOutputStream(file2);
                            try {
                                io.flutter.embedding.engine.loader.ResourceExtractor.copy(open, fileOutputStream);
                                fileOutputStream.close();
                                if (open != null) {
                                    open.close();
                                }
                            } catch (java.lang.Throwable th6) {
                                try {
                                    fileOutputStream.close();
                                } catch (java.lang.Throwable th7) {
                                    th6.addSuppressed(th7);
                                }
                                throw th6;
                                break;
                            }
                        } catch (java.lang.Throwable th8) {
                            if (open != null) {
                                try {
                                    open.close();
                                } catch (java.lang.Throwable th9) {
                                    th8.addSuppressed(th9);
                                }
                            }
                            throw th8;
                            break;
                        }
                    }
                } catch (java.io.FileNotFoundException unused) {
                } catch (java.io.IOException e17) {
                    io.flutter.Log.w(io.flutter.embedding.engine.loader.ResourceExtractor.TAG, "Exception unpacking resources: " + e17.getMessage());
                    io.flutter.embedding.engine.loader.ResourceExtractor.deleteFiles(this.mDataDirPath, this.mResources);
                    return false;
                }
            }
            return true;
        }

        @Override // android.os.AsyncTask
        public java.lang.Void doInBackground(java.lang.Void... voidArr) {
            java.io.File file = new java.io.File(this.mDataDirPath);
            java.lang.String checkTimestamp = io.flutter.embedding.engine.loader.ResourceExtractor.checkTimestamp(file, this.mPackageManager, this.mPackageName);
            if (checkTimestamp == null) {
                return null;
            }
            io.flutter.embedding.engine.loader.ResourceExtractor.deleteFiles(this.mDataDirPath, this.mResources);
            if (!extractAPK(file)) {
                return null;
            }
            try {
                new java.io.File(file, checkTimestamp).createNewFile();
            } catch (java.io.IOException unused) {
                io.flutter.Log.w(io.flutter.embedding.engine.loader.ResourceExtractor.TAG, "Failed to write resource timestamp");
            }
            return null;
        }
    }

    public ResourceExtractor(java.lang.String str, java.lang.String str2, android.content.pm.PackageManager packageManager, android.content.res.AssetManager assetManager) {
        this.mDataDirPath = str;
        this.mPackageName = str2;
        this.mPackageManager = packageManager;
        this.mAssetManager = assetManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String checkTimestamp(java.io.File file, android.content.pm.PackageManager packageManager, java.lang.String str) {
        try {
            android.content.pm.PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            if (packageInfo == null) {
                return TIMESTAMP_PREFIX;
            }
            java.lang.String str2 = TIMESTAMP_PREFIX + getVersionCode(packageInfo) + "-" + packageInfo.lastUpdateTime;
            java.lang.String[] existingTimestamps = getExistingTimestamps(file);
            if (existingTimestamps != null && existingTimestamps.length == 1 && str2.equals(existingTimestamps[0])) {
                return null;
            }
            return str2;
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
            return TIMESTAMP_PREFIX;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void copy(java.io.InputStream inputStream, java.io.OutputStream outputStream) {
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr);
            if (read < 0) {
                return;
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void deleteFiles(java.lang.String str, java.util.HashSet<java.lang.String> hashSet) {
        java.io.File file = new java.io.File(str);
        java.util.Iterator<java.lang.String> it = hashSet.iterator();
        while (it.hasNext()) {
            java.io.File file2 = new java.io.File(file, it.next());
            if (file2.exists()) {
                file2.delete();
            }
        }
        java.lang.String[] existingTimestamps = getExistingTimestamps(file);
        if (existingTimestamps == null) {
            return;
        }
        for (java.lang.String str2 : existingTimestamps) {
            new java.io.File(file, str2).delete();
        }
    }

    private static java.lang.String[] getExistingTimestamps(java.io.File file) {
        return file.list(new java.io.FilenameFilter() { // from class: io.flutter.embedding.engine.loader.ResourceExtractor.1
            @Override // java.io.FilenameFilter
            public boolean accept(java.io.File file2, java.lang.String str) {
                return str.startsWith(io.flutter.embedding.engine.loader.ResourceExtractor.TIMESTAMP_PREFIX);
            }
        });
    }

    public static long getVersionCode(android.content.pm.PackageInfo packageInfo) {
        return android.os.Build.VERSION.SDK_INT >= 28 ? packageInfo.getLongVersionCode() : packageInfo.versionCode;
    }

    public io.flutter.embedding.engine.loader.ResourceExtractor addResource(java.lang.String str) {
        this.mResources.add(str);
        return this;
    }

    public io.flutter.embedding.engine.loader.ResourceExtractor addResources(java.util.Collection<java.lang.String> collection) {
        this.mResources.addAll(collection);
        return this;
    }

    public io.flutter.embedding.engine.loader.ResourceExtractor start() {
        io.flutter.embedding.engine.loader.ResourceExtractor.ExtractTask extractTask = new io.flutter.embedding.engine.loader.ResourceExtractor.ExtractTask(this.mDataDirPath, this.mResources, this.mPackageName, this.mPackageManager, this.mAssetManager);
        this.mExtractTask = extractTask;
        extractTask.executeOnExecutor(android.os.AsyncTask.THREAD_POOL_EXECUTOR, new java.lang.Void[0]);
        return this;
    }

    public void waitForCompletion() {
        io.flutter.embedding.engine.loader.ResourceExtractor.ExtractTask extractTask = this.mExtractTask;
        if (extractTask == null) {
            return;
        }
        try {
            extractTask.get();
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException | java.util.concurrent.ExecutionException unused) {
            deleteFiles(this.mDataDirPath, this.mResources);
        }
    }
}
