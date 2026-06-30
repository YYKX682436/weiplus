package io.flutter.plugins.pathprovider;

/* loaded from: classes13.dex */
public class PathProviderPlugin implements io.flutter.embedding.engine.plugins.FlutterPlugin, io.flutter.plugins.pathprovider.Messages.PathProviderApi {
    static final java.lang.String TAG = "PathProviderPlugin";
    private android.content.Context context;

    /* renamed from: io.flutter.plugins.pathprovider.PathProviderPlugin$1, reason: invalid class name */
    /* loaded from: classes16.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory;

        static {
            int[] iArr = new int[io.flutter.plugins.pathprovider.Messages.StorageDirectory.values().length];
            $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory = iArr;
            try {
                iArr[io.flutter.plugins.pathprovider.Messages.StorageDirectory.ROOT.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[io.flutter.plugins.pathprovider.Messages.StorageDirectory.MUSIC.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[io.flutter.plugins.pathprovider.Messages.StorageDirectory.PODCASTS.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[io.flutter.plugins.pathprovider.Messages.StorageDirectory.RINGTONES.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[io.flutter.plugins.pathprovider.Messages.StorageDirectory.ALARMS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[io.flutter.plugins.pathprovider.Messages.StorageDirectory.NOTIFICATIONS.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[io.flutter.plugins.pathprovider.Messages.StorageDirectory.PICTURES.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[io.flutter.plugins.pathprovider.Messages.StorageDirectory.MOVIES.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[io.flutter.plugins.pathprovider.Messages.StorageDirectory.DOWNLOADS.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[io.flutter.plugins.pathprovider.Messages.StorageDirectory.DCIM.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[io.flutter.plugins.pathprovider.Messages.StorageDirectory.DOCUMENTS.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
        }
    }

    private java.lang.String getApplicationSupportDirectory() {
        return io.flutter.util.PathUtils.getFilesDir(this.context);
    }

    private java.lang.String getPathProviderApplicationDocumentsDirectory() {
        return io.flutter.util.PathUtils.getDataDirectory(this.context);
    }

    private java.util.List<java.lang.String> getPathProviderExternalCacheDirectories() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : this.context.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private java.util.List<java.lang.String> getPathProviderExternalStorageDirectories(io.flutter.plugins.pathprovider.Messages.StorageDirectory storageDirectory) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.io.File file : this.context.getExternalFilesDirs(getStorageDirectoryString(storageDirectory))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private java.lang.String getPathProviderStorageDirectory() {
        java.io.File externalFilesDir = this.context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private java.lang.String getPathProviderTemporaryDirectory() {
        return this.context.getCacheDir().getPath();
    }

    private java.lang.String getStorageDirectoryString(io.flutter.plugins.pathprovider.Messages.StorageDirectory storageDirectory) {
        switch (io.flutter.plugins.pathprovider.PathProviderPlugin.AnonymousClass1.$SwitchMap$io$flutter$plugins$pathprovider$Messages$StorageDirectory[storageDirectory.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new java.lang.RuntimeException("Unrecognized directory: " + storageDirectory);
        }
    }

    private void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, android.content.Context context) {
        try {
            io.flutter.plugins.pathprovider.Messages.PathProviderApi.setup(binaryMessenger, this);
        } catch (java.lang.Exception unused) {
        }
        this.context = context;
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public java.lang.String getApplicationCachePath() {
        return this.context.getCacheDir().getPath();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public java.lang.String getApplicationDocumentsPath() {
        return getPathProviderApplicationDocumentsDirectory();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public java.lang.String getApplicationSupportPath() {
        return getApplicationSupportDirectory();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public java.util.List<java.lang.String> getExternalCachePaths() {
        return getPathProviderExternalCacheDirectories();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public java.lang.String getExternalStoragePath() {
        return getPathProviderStorageDirectory();
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public java.util.List<java.lang.String> getExternalStoragePaths(io.flutter.plugins.pathprovider.Messages.StorageDirectory storageDirectory) {
        return getPathProviderExternalStorageDirectories(storageDirectory);
    }

    @Override // io.flutter.plugins.pathprovider.Messages.PathProviderApi
    public java.lang.String getTemporaryPath() {
        return getPathProviderTemporaryDirectory();
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onAttachedToEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        setup(flutterPluginBinding.getBinaryMessenger(), flutterPluginBinding.getApplicationContext());
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public void onDetachedFromEngine(io.flutter.embedding.engine.plugins.FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        io.flutter.plugins.pathprovider.Messages.PathProviderApi.setup(flutterPluginBinding.getBinaryMessenger(), null);
    }
}
