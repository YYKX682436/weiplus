package io.flutter.plugins.pathprovider;

/* loaded from: classes11.dex */
public class Messages {

    /* loaded from: classes11.dex */
    public static class FlutterError extends java.lang.RuntimeException {
        public final java.lang.String code;
        public final java.lang.Object details;

        public FlutterError(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
            super(str2);
            this.code = str;
            this.details = obj;
        }
    }

    /* loaded from: classes16.dex */
    public interface PathProviderApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.pathprovider.Messages.PathProviderApi pathProviderApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getTemporaryPath());
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.pathprovider.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.pathprovider.Messages.PathProviderApi pathProviderApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getApplicationSupportPath());
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.pathprovider.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(io.flutter.plugins.pathprovider.Messages.PathProviderApi pathProviderApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getApplicationDocumentsPath());
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.pathprovider.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(io.flutter.plugins.pathprovider.Messages.PathProviderApi pathProviderApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getApplicationCachePath());
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.pathprovider.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(io.flutter.plugins.pathprovider.Messages.PathProviderApi pathProviderApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getExternalStoragePath());
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.pathprovider.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(io.flutter.plugins.pathprovider.Messages.PathProviderApi pathProviderApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, pathProviderApi.getExternalCachePaths());
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.pathprovider.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(io.flutter.plugins.pathprovider.Messages.PathProviderApi pathProviderApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, pathProviderApi.getExternalStoragePaths(arrayList2.get(0) == null ? null : io.flutter.plugins.pathprovider.Messages.StorageDirectory.values()[((java.lang.Integer) arrayList2.get(0)).intValue()]));
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.pathprovider.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.pathprovider.Messages.PathProviderApi pathProviderApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getTemporaryPath", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.Messages$PathProviderApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.pathprovider.Messages.PathProviderApi.lambda$setup$0(io.flutter.plugins.pathprovider.Messages.PathProviderApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getApplicationSupportPath", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.Messages$PathProviderApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.pathprovider.Messages.PathProviderApi.lambda$setup$1(io.flutter.plugins.pathprovider.Messages.PathProviderApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getApplicationDocumentsPath", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.Messages$PathProviderApi$$c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.pathprovider.Messages.PathProviderApi.lambda$setup$2(io.flutter.plugins.pathprovider.Messages.PathProviderApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getApplicationCachePath", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.Messages$PathProviderApi$$d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.pathprovider.Messages.PathProviderApi.lambda$setup$3(io.flutter.plugins.pathprovider.Messages.PathProviderApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePath", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.Messages$PathProviderApi$$e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.pathprovider.Messages.PathProviderApi.lambda$setup$4(io.flutter.plugins.pathprovider.Messages.PathProviderApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getExternalCachePaths", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.Messages$PathProviderApi$$f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.pathprovider.Messages.PathProviderApi.lambda$setup$5(io.flutter.plugins.pathprovider.Messages.PathProviderApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel7 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.PathProviderApi.getExternalStoragePaths", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (pathProviderApi != null) {
                basicMessageChannel7.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.pathprovider.Messages$PathProviderApi$$g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.pathprovider.Messages.PathProviderApi.lambda$setup$6(io.flutter.plugins.pathprovider.Messages.PathProviderApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
        }

        java.lang.String getApplicationCachePath();

        java.lang.String getApplicationDocumentsPath();

        java.lang.String getApplicationSupportPath();

        java.util.List<java.lang.String> getExternalCachePaths();

        java.lang.String getExternalStoragePath();

        java.util.List<java.lang.String> getExternalStoragePaths(io.flutter.plugins.pathprovider.Messages.StorageDirectory storageDirectory);

        java.lang.String getTemporaryPath();
    }

    /* loaded from: classes16.dex */
    public enum StorageDirectory {
        ROOT(0),
        MUSIC(1),
        PODCASTS(2),
        RINGTONES(3),
        ALARMS(4),
        NOTIFICATIONS(5),
        PICTURES(6),
        MOVIES(7),
        DOWNLOADS(8),
        DCIM(9),
        DOCUMENTS(10);

        final int index;

        StorageDirectory(int i17) {
            this.index = i17;
        }
    }

    public static java.util.ArrayList<java.lang.Object> wrapError(java.lang.Throwable th6) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(3);
        if (th6 instanceof io.flutter.plugins.pathprovider.Messages.FlutterError) {
            io.flutter.plugins.pathprovider.Messages.FlutterError flutterError = (io.flutter.plugins.pathprovider.Messages.FlutterError) th6;
            arrayList.add(flutterError.code);
            arrayList.add(flutterError.getMessage());
            arrayList.add(flutterError.details);
        } else {
            arrayList.add(th6.toString());
            arrayList.add(th6.getClass().getSimpleName());
            arrayList.add("Cause: " + th6.getCause() + ", Stacktrace: " + android.util.Log.getStackTraceString(th6));
        }
        return arrayList;
    }
}
