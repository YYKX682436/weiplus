package io.flutter.plugins.sharedpreferences;

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
    public interface SharedPreferencesApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, sharedPreferencesApi.remove((java.lang.String) ((java.util.ArrayList) obj).get(0)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.sharedpreferences.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setBool((java.lang.String) arrayList2.get(0), (java.lang.Boolean) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.sharedpreferences.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setString((java.lang.String) arrayList2.get(0), (java.lang.String) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.sharedpreferences.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.String str = (java.lang.String) arrayList2.get(0);
            java.lang.Number number = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.sharedpreferences.Messages.wrapError(th6);
                }
            }
            arrayList.add(0, sharedPreferencesApi.setInt(str, valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setDouble((java.lang.String) arrayList2.get(0), (java.lang.Double) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.sharedpreferences.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.setStringList((java.lang.String) arrayList2.get(0), (java.util.List) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.sharedpreferences.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.clear((java.lang.String) arrayList2.get(0), (java.util.List) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.sharedpreferences.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi sharedPreferencesApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            try {
                arrayList.add(0, sharedPreferencesApi.getAll((java.lang.String) arrayList2.get(0), (java.util.List) arrayList2.get(1)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.sharedpreferences.Messages.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi sharedPreferencesApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.remove", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.lambda$setup$0(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setBool", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.lambda$setup$1(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setString", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.lambda$setup$2(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setInt", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.lambda$setup$3(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setDouble", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesApi != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.lambda$setup$4(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.setStringList", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesApi != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.lambda$setup$5(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel7 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.clear", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesApi != null) {
                basicMessageChannel7.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.lambda$setup$6(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel8 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.SharedPreferencesApi.getAll", getCodec(), binaryMessenger.makeBackgroundTaskQueue());
            if (sharedPreferencesApi != null) {
                basicMessageChannel8.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.sharedpreferences.Messages$SharedPreferencesApi$$h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.lambda$setup$7(io.flutter.plugins.sharedpreferences.Messages.SharedPreferencesApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
        }

        java.lang.Boolean clear(java.lang.String str, java.util.List<java.lang.String> list);

        java.util.Map<java.lang.String, java.lang.Object> getAll(java.lang.String str, java.util.List<java.lang.String> list);

        java.lang.Boolean remove(java.lang.String str);

        java.lang.Boolean setBool(java.lang.String str, java.lang.Boolean bool);

        java.lang.Boolean setDouble(java.lang.String str, java.lang.Double d17);

        java.lang.Boolean setInt(java.lang.String str, java.lang.Long l17);

        java.lang.Boolean setString(java.lang.String str, java.lang.String str2);

        java.lang.Boolean setStringList(java.lang.String str, java.util.List<java.lang.String> list);
    }

    public static java.util.ArrayList<java.lang.Object> wrapError(java.lang.Throwable th6) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(3);
        if (th6 instanceof io.flutter.plugins.sharedpreferences.Messages.FlutterError) {
            io.flutter.plugins.sharedpreferences.Messages.FlutterError flutterError = (io.flutter.plugins.sharedpreferences.Messages.FlutterError) th6;
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
