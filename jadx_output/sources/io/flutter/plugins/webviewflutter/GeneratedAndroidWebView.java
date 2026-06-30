package io.flutter.plugins.webviewflutter;

/* loaded from: classes16.dex */
public class GeneratedAndroidWebView {

    /* loaded from: classes13.dex */
    public static final class ConsoleMessage {
        private io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel level;
        private java.lang.Long lineNumber;
        private java.lang.String message;
        private java.lang.String sourceId;

        /* loaded from: classes13.dex */
        public static final class Builder {
            private io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel level;
            private java.lang.Long lineNumber;
            private java.lang.String message;
            private java.lang.String sourceId;

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage build() {
                io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage consoleMessage = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage();
                consoleMessage.setLineNumber(this.lineNumber);
                consoleMessage.setMessage(this.message);
                consoleMessage.setLevel(this.level);
                consoleMessage.setSourceId(this.sourceId);
                return consoleMessage;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage.Builder setLevel(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel consoleMessageLevel) {
                this.level = consoleMessageLevel;
                return this;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage.Builder setLineNumber(java.lang.Long l17) {
                this.lineNumber = l17;
                return this;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage.Builder setMessage(java.lang.String str) {
                this.message = str;
                return this;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage.Builder setSourceId(java.lang.String str) {
                this.sourceId = str;
                return this;
            }
        }

        public static io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage consoleMessage = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage();
            java.lang.Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            consoleMessage.setLineNumber(valueOf);
            consoleMessage.setMessage((java.lang.String) arrayList.get(1));
            consoleMessage.setLevel(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel.values()[((java.lang.Integer) arrayList.get(2)).intValue()]);
            consoleMessage.setSourceId((java.lang.String) arrayList.get(3));
            return consoleMessage;
        }

        public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel getLevel() {
            return this.level;
        }

        public java.lang.Long getLineNumber() {
            return this.lineNumber;
        }

        public java.lang.String getMessage() {
            return this.message;
        }

        public java.lang.String getSourceId() {
            return this.sourceId;
        }

        public void setLevel(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel consoleMessageLevel) {
            if (consoleMessageLevel == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"level\" is null.");
            }
            this.level = consoleMessageLevel;
        }

        public void setLineNumber(java.lang.Long l17) {
            if (l17 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"lineNumber\" is null.");
            }
            this.lineNumber = l17;
        }

        public void setMessage(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"message\" is null.");
            }
            this.message = str;
        }

        public void setSourceId(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"sourceId\" is null.");
            }
            this.sourceId = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(4);
            arrayList.add(this.lineNumber);
            arrayList.add(this.message);
            io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessageLevel consoleMessageLevel = this.level;
            arrayList.add(consoleMessageLevel == null ? null : java.lang.Integer.valueOf(consoleMessageLevel.index));
            arrayList.add(this.sourceId);
            return arrayList;
        }
    }

    /* loaded from: classes13.dex */
    public enum ConsoleMessageLevel {
        DEBUG(0),
        ERROR(1),
        LOG(2),
        TIP(3),
        WARNING(4),
        UNKNOWN(5);

        final int index;

        ConsoleMessageLevel(int i17) {
            this.index = i17;
        }
    }

    /* loaded from: classes16.dex */
    public interface CookieManagerHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi cookieManagerHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            cookieManagerHostApi.attachInstance(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi cookieManagerHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.lang.String str2 = (java.lang.String) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            cookieManagerHostApi.setCookie(valueOf, str, str2);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi cookieManagerHostApi, java.lang.Object obj, final io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            cookieManagerHostApi.removeAllCookies(number == null ? null : java.lang.Long.valueOf(number.longValue()), new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result<java.lang.Boolean>() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.1
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void error(java.lang.Throwable th6) {
                    reply.reply(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6));
                }

                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void success(java.lang.Boolean bool) {
                    arrayList.add(0, bool);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi cookieManagerHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            cookieManagerHostApi.setAcceptThirdPartyCookies(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()), bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi cookieManagerHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.attachInstance", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setCookie", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.removeAllCookies", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi$$c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.lambda$setup$2(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CookieManagerHostApi.setAcceptThirdPartyCookies", getCodec());
            if (cookieManagerHostApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CookieManagerHostApi$$d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.lambda$setup$3(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CookieManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
        }

        void attachInstance(java.lang.Long l17);

        void removeAllCookies(java.lang.Long l17, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result<java.lang.Boolean> result);

        void setAcceptThirdPartyCookies(java.lang.Long l17, java.lang.Long l18, java.lang.Boolean bool);

        void setCookie(java.lang.Long l17, java.lang.String str, java.lang.String str2);
    }

    /* loaded from: classes16.dex */
    public static class CustomViewCallbackFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public CustomViewCallbackFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        public void create(java.lang.Long l17, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallbackFlutterApi.create", getCodec()).send(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CustomViewCallbackFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes16.dex */
    public interface CustomViewCallbackHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackHostApi customViewCallbackHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            customViewCallbackHostApi.onCustomViewHidden(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackHostApi customViewCallbackHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.CustomViewCallbackHostApi.onCustomViewHidden", getCodec());
            if (customViewCallbackHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$CustomViewCallbackHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.CustomViewCallbackHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }

        void onCustomViewHidden(java.lang.Long l17);
    }

    /* loaded from: classes16.dex */
    public static class DownloadListenerFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public DownloadListenerFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        public void onDownloadStart(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.Long l18, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.DownloadListenerFlutterApi.onDownloadStart", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, str, str2, str3, str4, l18)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes16.dex */
    public interface DownloadListenerHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerHostApi downloadListenerHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            downloadListenerHostApi.create(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerHostApi downloadListenerHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.DownloadListenerHostApi.create", getCodec());
            if (downloadListenerHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$DownloadListenerHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.DownloadListenerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }

        void create(java.lang.Long l17);
    }

    /* loaded from: classes16.dex */
    public enum FileChooserMode {
        OPEN(0),
        OPEN_MULTIPLE(1),
        SAVE(2);

        final int index;

        FileChooserMode(int i17) {
            this.index = i17;
        }
    }

    /* loaded from: classes16.dex */
    public static class FileChooserParamsFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public FileChooserParamsFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        public void create(java.lang.Long l17, java.lang.Boolean bool, java.util.List<java.lang.String> list, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserMode fileChooserMode, java.lang.String str, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserParamsFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FileChooserParamsFlutterApi.create", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, bool, list, java.lang.Integer.valueOf(fileChooserMode.index), str)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FileChooserParamsFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FileChooserParamsFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes16.dex */
    public interface FlutterAssetManagerHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, flutterAssetManagerHostApi.list((java.lang.String) ((java.util.ArrayList) obj).get(0)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                arrayList.add(0, flutterAssetManagerHostApi.getAssetFilePathByName((java.lang.String) ((java.util.ArrayList) obj).get(0)));
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi flutterAssetManagerHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.list", getCodec());
            if (flutterAssetManagerHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FlutterAssetManagerHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.FlutterAssetManagerHostApi.getAssetFilePathByName", getCodec());
            if (flutterAssetManagerHostApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$FlutterAssetManagerHostApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi.lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterAssetManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        java.lang.String getAssetFilePathByName(java.lang.String str);

        java.util.List<java.lang.String> list(java.lang.String str);
    }

    /* loaded from: classes15.dex */
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
    public static class GeolocationPermissionsCallbackFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public GeolocationPermissionsCallbackFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        public void create(java.lang.Long l17, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallbackFlutterApi.create", getCodec()).send(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$GeolocationPermissionsCallbackFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes16.dex */
    public interface GeolocationPermissionsCallbackHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(2);
            java.lang.Boolean bool2 = (java.lang.Boolean) arrayList2.get(3);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            geolocationPermissionsCallbackHostApi.invoke(valueOf, str, bool, bool2);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi geolocationPermissionsCallbackHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.GeolocationPermissionsCallbackHostApi.invoke", getCodec());
            if (geolocationPermissionsCallbackHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$GeolocationPermissionsCallbackHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.GeolocationPermissionsCallbackHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }

        void invoke(java.lang.Long l17, java.lang.String str, java.lang.Boolean bool, java.lang.Boolean bool2);
    }

    /* loaded from: classes16.dex */
    public static class HttpAuthHandlerFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public HttpAuthHandlerFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        public void create(java.lang.Long l17, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerFlutterApi.create", getCodec()).send(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes16.dex */
    public interface HttpAuthHandlerHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi httpAuthHandlerHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            arrayList.add(0, httpAuthHandlerHostApi.useHttpAuthUsernamePassword(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi httpAuthHandlerHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            httpAuthHandlerHostApi.cancel(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi httpAuthHandlerHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.lang.String str2 = (java.lang.String) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            httpAuthHandlerHostApi.proceed(valueOf, str, str2);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi httpAuthHandlerHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.useHttpAuthUsernamePassword", getCodec());
            if (httpAuthHandlerHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.cancel", getCodec());
            if (httpAuthHandlerHostApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerHostApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi.lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.HttpAuthHandlerHostApi.proceed", getCodec());
            if (httpAuthHandlerHostApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$HttpAuthHandlerHostApi$$c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi.lambda$setup$2(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.HttpAuthHandlerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
        }

        void cancel(java.lang.Long l17);

        void proceed(java.lang.Long l17, java.lang.String str, java.lang.String str2);

        java.lang.Boolean useHttpAuthUsernamePassword(java.lang.Long l17);
    }

    /* loaded from: classes16.dex */
    public interface InstanceManagerHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.InstanceManagerHostApi instanceManagerHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                instanceManagerHostApi.clear();
                arrayList.add(0, null);
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.InstanceManagerHostApi instanceManagerHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.InstanceManagerHostApi.clear", getCodec());
            if (instanceManagerHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$InstanceManagerHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.InstanceManagerHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.InstanceManagerHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }

        void clear();
    }

    /* loaded from: classes16.dex */
    public static class JavaObjectFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public JavaObjectFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        public void dispose(java.lang.Long l17, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaObjectFlutterApi.dispose", getCodec()).send(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaObjectFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes16.dex */
    public interface JavaObjectHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectHostApi javaObjectHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            javaObjectHostApi.dispose(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectHostApi javaObjectHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaObjectHostApi.dispose", getCodec());
            if (javaObjectHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaObjectHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaObjectHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }

        void dispose(java.lang.Long l17);
    }

    /* loaded from: classes16.dex */
    public static class JavaScriptChannelFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public JavaScriptChannelFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        public void postMessage(java.lang.Long l17, java.lang.String str, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelFlutterApi.postMessage", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, str)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes16.dex */
    public interface JavaScriptChannelHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelHostApi javaScriptChannelHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            javaScriptChannelHostApi.create(valueOf, str);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelHostApi javaScriptChannelHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.JavaScriptChannelHostApi.create", getCodec());
            if (javaScriptChannelHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$JavaScriptChannelHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.JavaScriptChannelHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
        }

        void create(java.lang.Long l17, java.lang.String str);
    }

    /* loaded from: classes16.dex */
    public static class PermissionRequestFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public PermissionRequestFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        public void create(java.lang.Long l17, java.util.List<java.lang.String> list, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestFlutterApi.create", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, list)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$PermissionRequestFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes16.dex */
    public interface PermissionRequestHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi permissionRequestHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.util.List<java.lang.String> list = (java.util.List) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            permissionRequestHostApi.grant(valueOf, list);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi permissionRequestHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            permissionRequestHostApi.deny(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi permissionRequestHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.grant", getCodec());
            if (permissionRequestHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$PermissionRequestHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.PermissionRequestHostApi.deny", getCodec());
            if (permissionRequestHostApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$PermissionRequestHostApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi.lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.PermissionRequestHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        void deny(java.lang.Long l17);

        void grant(java.lang.Long l17, java.util.List<java.lang.String> list);
    }

    /* loaded from: classes13.dex */
    public interface Result<T> {
        void error(java.lang.Throwable th6);

        void success(T t17);
    }

    /* loaded from: classes16.dex */
    public static class ViewFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public ViewFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        public void create(java.lang.Long l17, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ViewFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.ViewFlutterApi.create", getCodec()).send(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$ViewFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ViewFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes16.dex */
    public static class WebChromeClientFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public WebChromeClientFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onJsConfirm$9(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply reply, java.lang.Object obj) {
            reply.reply((java.lang.Boolean) obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onJsPrompt$10(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply reply, java.lang.Object obj) {
            reply.reply((java.lang.String) obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onShowFileChooser$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply reply, java.lang.Object obj) {
            reply.reply((java.util.List) obj);
        }

        public void onConsoleMessage(java.lang.Long l17, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage consoleMessage, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onConsoleMessage", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, consoleMessage)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$k
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onGeolocationPermissionsHidePrompt(java.lang.Long l17, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsHidePrompt", getCodec()).send(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$g
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onGeolocationPermissionsShowPrompt(java.lang.Long l17, java.lang.Long l18, java.lang.String str, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onGeolocationPermissionsShowPrompt", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, str)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$e
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onHideCustomView(java.lang.Long l17, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onHideCustomView", getCodec()).send(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$f
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onJsAlert(java.lang.Long l17, java.lang.String str, java.lang.String str2, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsAlert", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, str, str2)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$b
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onJsConfirm(java.lang.Long l17, java.lang.String str, java.lang.String str2, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Boolean> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsConfirm", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, str, str2)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$d
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.lambda$onJsConfirm$9(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this, obj);
                }
            });
        }

        public void onJsPrompt(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.String> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onJsPrompt", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, str, str2, str3)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$c
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.lambda$onJsPrompt$10(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this, obj);
                }
            });
        }

        public void onPermissionRequest(java.lang.Long l17, java.lang.Long l18, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onPermissionRequest", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onProgressChanged(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onProgressChanged", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$h
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onShowCustomView(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowCustomView", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$j
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onShowFileChooser(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply<java.util.List<java.lang.String>> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientFlutterApi.onShowFileChooser", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientFlutterApi$$i
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.lambda$onShowFileChooser$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApi.Reply.this, obj);
                }
            });
        }
    }

    /* loaded from: classes13.dex */
    public static class WebChromeClientFlutterApiCodec extends io.flutter.plugin.common.StandardMessageCodec {
        public static final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApiCodec INSTANCE = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientFlutterApiCodec();

        private WebChromeClientFlutterApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public java.lang.Object readValueOfType(byte b17, java.nio.ByteBuffer byteBuffer) {
            return b17 != Byte.MIN_VALUE ? super.readValueOfType(b17, byteBuffer) : io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage.fromList((java.util.ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
            if (!(obj instanceof io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.ConsoleMessage) obj).toList());
            }
        }
    }

    /* loaded from: classes16.dex */
    public interface WebChromeClientHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webChromeClientHostApi.create(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnConsoleMessage(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnJsAlert(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnJsConfirm(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webChromeClientHostApi.setSynchronousReturnValueForOnJsPrompt(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi webChromeClientHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.create", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnShowFileChooser", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnConsoleMessage", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$2(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsAlert", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$3(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsConfirm", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$4(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebChromeClientHostApi.setSynchronousReturnValueForOnJsPrompt", getCodec());
            if (webChromeClientHostApi != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebChromeClientHostApi$$f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.lambda$setup$5(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebChromeClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
        }

        void create(java.lang.Long l17);

        void setSynchronousReturnValueForOnConsoleMessage(java.lang.Long l17, java.lang.Boolean bool);

        void setSynchronousReturnValueForOnJsAlert(java.lang.Long l17, java.lang.Boolean bool);

        void setSynchronousReturnValueForOnJsConfirm(java.lang.Long l17, java.lang.Boolean bool);

        void setSynchronousReturnValueForOnJsPrompt(java.lang.Long l17, java.lang.Boolean bool);

        void setSynchronousReturnValueForOnShowFileChooser(java.lang.Long l17, java.lang.Boolean bool);
    }

    /* loaded from: classes15.dex */
    public static final class WebResourceErrorData {
        private java.lang.String description;
        private java.lang.Long errorCode;

        /* loaded from: classes15.dex */
        public static final class Builder {
            private java.lang.String description;
            private java.lang.Long errorCode;

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData build() {
                io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData webResourceErrorData = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData();
                webResourceErrorData.setErrorCode(this.errorCode);
                webResourceErrorData.setDescription(this.description);
                return webResourceErrorData;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData.Builder setDescription(java.lang.String str) {
                this.description = str;
                return this;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData.Builder setErrorCode(java.lang.Long l17) {
                this.errorCode = l17;
                return this;
            }
        }

        public static io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData webResourceErrorData = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData();
            java.lang.Object obj = arrayList.get(0);
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            webResourceErrorData.setErrorCode(valueOf);
            webResourceErrorData.setDescription((java.lang.String) arrayList.get(1));
            return webResourceErrorData;
        }

        public java.lang.String getDescription() {
            return this.description;
        }

        public java.lang.Long getErrorCode() {
            return this.errorCode;
        }

        public void setDescription(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"description\" is null.");
            }
            this.description = str;
        }

        public void setErrorCode(java.lang.Long l17) {
            if (l17 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"errorCode\" is null.");
            }
            this.errorCode = l17;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            arrayList.add(this.errorCode);
            arrayList.add(this.description);
            return arrayList;
        }
    }

    /* loaded from: classes15.dex */
    public static final class WebResourceRequestData {
        private java.lang.Boolean hasGesture;
        private java.lang.Boolean isForMainFrame;
        private java.lang.Boolean isRedirect;
        private java.lang.String method;
        private java.util.Map<java.lang.String, java.lang.String> requestHeaders;
        private java.lang.String url;

        /* loaded from: classes15.dex */
        public static final class Builder {
            private java.lang.Boolean hasGesture;
            private java.lang.Boolean isForMainFrame;
            private java.lang.Boolean isRedirect;
            private java.lang.String method;
            private java.util.Map<java.lang.String, java.lang.String> requestHeaders;
            private java.lang.String url;

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData build() {
                io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData webResourceRequestData = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData();
                webResourceRequestData.setUrl(this.url);
                webResourceRequestData.setIsForMainFrame(this.isForMainFrame);
                webResourceRequestData.setIsRedirect(this.isRedirect);
                webResourceRequestData.setHasGesture(this.hasGesture);
                webResourceRequestData.setMethod(this.method);
                webResourceRequestData.setRequestHeaders(this.requestHeaders);
                return webResourceRequestData;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData.Builder setHasGesture(java.lang.Boolean bool) {
                this.hasGesture = bool;
                return this;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData.Builder setIsForMainFrame(java.lang.Boolean bool) {
                this.isForMainFrame = bool;
                return this;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData.Builder setIsRedirect(java.lang.Boolean bool) {
                this.isRedirect = bool;
                return this;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData.Builder setMethod(java.lang.String str) {
                this.method = str;
                return this;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData.Builder setRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
                this.requestHeaders = map;
                return this;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData.Builder setUrl(java.lang.String str) {
                this.url = str;
                return this;
            }
        }

        public static io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData webResourceRequestData = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData();
            webResourceRequestData.setUrl((java.lang.String) arrayList.get(0));
            webResourceRequestData.setIsForMainFrame((java.lang.Boolean) arrayList.get(1));
            webResourceRequestData.setIsRedirect((java.lang.Boolean) arrayList.get(2));
            webResourceRequestData.setHasGesture((java.lang.Boolean) arrayList.get(3));
            webResourceRequestData.setMethod((java.lang.String) arrayList.get(4));
            webResourceRequestData.setRequestHeaders((java.util.Map) arrayList.get(5));
            return webResourceRequestData;
        }

        public java.lang.Boolean getHasGesture() {
            return this.hasGesture;
        }

        public java.lang.Boolean getIsForMainFrame() {
            return this.isForMainFrame;
        }

        public java.lang.Boolean getIsRedirect() {
            return this.isRedirect;
        }

        public java.lang.String getMethod() {
            return this.method;
        }

        public java.util.Map<java.lang.String, java.lang.String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public java.lang.String getUrl() {
            return this.url;
        }

        public void setHasGesture(java.lang.Boolean bool) {
            if (bool == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"hasGesture\" is null.");
            }
            this.hasGesture = bool;
        }

        public void setIsForMainFrame(java.lang.Boolean bool) {
            if (bool == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"isForMainFrame\" is null.");
            }
            this.isForMainFrame = bool;
        }

        public void setIsRedirect(java.lang.Boolean bool) {
            this.isRedirect = bool;
        }

        public void setMethod(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"method\" is null.");
            }
            this.method = str;
        }

        public void setRequestHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
            if (map == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"requestHeaders\" is null.");
            }
            this.requestHeaders = map;
        }

        public void setUrl(java.lang.String str) {
            if (str == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"url\" is null.");
            }
            this.url = str;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(6);
            arrayList.add(this.url);
            arrayList.add(this.isForMainFrame);
            arrayList.add(this.isRedirect);
            arrayList.add(this.hasGesture);
            arrayList.add(this.method);
            arrayList.add(this.requestHeaders);
            return arrayList;
        }
    }

    /* loaded from: classes16.dex */
    public interface WebSettingsHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.create(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setDomStorageEnabled(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setDisplayZoomControls(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setBuiltInZoomControls(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setAllowFileAccess(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setTextZoom(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            arrayList.add(0, webSettingsHostApi.getUserAgentString(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setSupportMultipleWindows(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setJavaScriptEnabled(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setUserAgentString(valueOf, str);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setMediaPlaybackRequiresUserGesture(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setSupportZoom(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setLoadWithOverviewMode(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webSettingsHostApi.setUseWideViewPort(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi webSettingsHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.create", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setDomStorageEnabled", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setJavaScriptCanOpenWindowsAutomatically", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$2(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setSupportMultipleWindows", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$3(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setJavaScriptEnabled", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$4(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setUserAgentString", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$5(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel7 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setMediaPlaybackRequiresUserGesture", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel7.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$6(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel8 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setSupportZoom", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel8.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$7(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel9 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setLoadWithOverviewMode", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel9.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$8(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel10 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setUseWideViewPort", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel10.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$9(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel11 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setDisplayZoomControls", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel11.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$10(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel12 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setBuiltInZoomControls", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel12.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$11(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel13 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setAllowFileAccess", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel13.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$12(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel14 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.setTextZoom", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel14.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$j
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$13(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel15 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebSettingsHostApi.getUserAgentString", getCodec());
            if (webSettingsHostApi != null) {
                basicMessageChannel15.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebSettingsHostApi$$k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.lambda$setup$14(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebSettingsHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
        }

        void create(java.lang.Long l17, java.lang.Long l18);

        java.lang.String getUserAgentString(java.lang.Long l17);

        void setAllowFileAccess(java.lang.Long l17, java.lang.Boolean bool);

        void setBuiltInZoomControls(java.lang.Long l17, java.lang.Boolean bool);

        void setDisplayZoomControls(java.lang.Long l17, java.lang.Boolean bool);

        void setDomStorageEnabled(java.lang.Long l17, java.lang.Boolean bool);

        void setJavaScriptCanOpenWindowsAutomatically(java.lang.Long l17, java.lang.Boolean bool);

        void setJavaScriptEnabled(java.lang.Long l17, java.lang.Boolean bool);

        void setLoadWithOverviewMode(java.lang.Long l17, java.lang.Boolean bool);

        void setMediaPlaybackRequiresUserGesture(java.lang.Long l17, java.lang.Boolean bool);

        void setSupportMultipleWindows(java.lang.Long l17, java.lang.Boolean bool);

        void setSupportZoom(java.lang.Long l17, java.lang.Boolean bool);

        void setTextZoom(java.lang.Long l17, java.lang.Long l18);

        void setUseWideViewPort(java.lang.Long l17, java.lang.Boolean bool);

        void setUserAgentString(java.lang.Long l17, java.lang.String str);
    }

    /* loaded from: classes16.dex */
    public interface WebStorageHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webStorageHostApi.create(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webStorageHostApi.deleteAllData(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi webStorageHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.create", getCodec());
            if (webStorageHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebStorageHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebStorageHostApi.deleteAllData", getCodec());
            if (webStorageHostApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebStorageHostApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi.lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebStorageHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        void create(java.lang.Long l17);

        void deleteAllData(java.lang.Long l17);
    }

    /* loaded from: classes16.dex */
    public static class WebViewClientFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes16.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public WebViewClientFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApiCodec.INSTANCE;
        }

        public void doUpdateVisitedHistory(java.lang.Long l17, java.lang.Long l18, java.lang.String str, java.lang.Boolean bool, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.doUpdateVisitedHistory", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, str, bool)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$f
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onPageFinished(java.lang.Long l17, java.lang.Long l18, java.lang.String str, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageFinished", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, str)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$e
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onPageStarted(java.lang.Long l17, java.lang.Long l18, java.lang.String str, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onPageStarted", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, str)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$c
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onReceivedError(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.String str, java.lang.String str2, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedError", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19, str, str2)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$g
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onReceivedHttpAuthRequest(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.String str, java.lang.String str2, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedHttpAuthRequest", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19, str, str2)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$h
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onReceivedRequestError(java.lang.Long l17, java.lang.Long l18, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData webResourceRequestData, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData webResourceErrorData, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.onReceivedRequestError", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, webResourceRequestData, webResourceErrorData)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void requestLoading(java.lang.Long l17, java.lang.Long l18, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData webResourceRequestData, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.requestLoading", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, webResourceRequestData)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$b
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void urlLoading(java.lang.Long l17, java.lang.Long l18, java.lang.String str, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientFlutterApi.urlLoading", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, str)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientFlutterApi$$d
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes15.dex */
    public static class WebViewClientFlutterApiCodec extends io.flutter.plugin.common.StandardMessageCodec {
        public static final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApiCodec INSTANCE = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientFlutterApiCodec();

        private WebViewClientFlutterApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public java.lang.Object readValueOfType(byte b17, java.nio.ByteBuffer byteBuffer) {
            return b17 != Byte.MIN_VALUE ? b17 != -127 ? super.readValueOfType(b17, byteBuffer) : io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData.fromList((java.util.ArrayList) readValue(byteBuffer)) : io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData.fromList((java.util.ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
            if (obj instanceof io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData) {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceErrorData) obj).toList());
            } else if (!(obj instanceof io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(129);
                writeValue(byteArrayOutputStream, ((io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebResourceRequestData) obj).toList());
            }
        }
    }

    /* loaded from: classes16.dex */
    public interface WebViewClientHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewClientHostApi.create(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi webViewClientHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.create", getCodec());
            if (webViewClientHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewClientHostApi.setSynchronousReturnValueForShouldOverrideUrlLoading", getCodec());
            if (webViewClientHostApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewClientHostApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi.lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewClientHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
        }

        void create(java.lang.Long l17);

        void setSynchronousReturnValueForShouldOverrideUrlLoading(java.lang.Long l17, java.lang.Boolean bool);
    }

    /* loaded from: classes13.dex */
    public static class WebViewFlutterApi {
        private final io.flutter.plugin.common.BinaryMessenger binaryMessenger;

        /* loaded from: classes13.dex */
        public interface Reply<T> {
            void reply(T t17);
        }

        public WebViewFlutterApi(io.flutter.plugin.common.BinaryMessenger binaryMessenger) {
            this.binaryMessenger = binaryMessenger;
        }

        public static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return new io.flutter.plugin.common.StandardMessageCodec();
        }

        public void create(java.lang.Long l17, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.create", getCodec()).send(new java.util.ArrayList(java.util.Collections.singletonList(l17)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewFlutterApi$$b
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply.this.reply(null);
                }
            });
        }

        public void onScrollChanged(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Long l27, java.lang.Long l28, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply<java.lang.Void> reply) {
            new io.flutter.plugin.common.BasicMessageChannel(this.binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewFlutterApi.onScrollChanged", getCodec()).send(new java.util.ArrayList(java.util.Arrays.asList(l17, l18, l19, l27, l28)), new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewFlutterApi$$a
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public final void reply(java.lang.Object obj) {
                    io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewFlutterApi.Reply.this.reply(null);
                }
            });
        }
    }

    /* loaded from: classes16.dex */
    public interface WebViewHostApi {
        static io.flutter.plugin.common.MessageCodec<java.lang.Object> getCodec() {
            return io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApiCodec.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.create(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.lang.String str2 = (java.lang.String) arrayList2.get(2);
            java.lang.String str3 = (java.lang.String) arrayList2.get(3);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.loadData(valueOf, str, str2, str3);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$10(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.reload(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$11(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Boolean bool = (java.lang.Boolean) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.clearCache(valueOf, bool);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$12(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, final io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            final java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            webViewHostApi.evaluateJavascript(number == null ? null : java.lang.Long.valueOf(number.longValue()), (java.lang.String) arrayList2.get(1), new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result<java.lang.String>() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.1
                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void error(java.lang.Throwable th6) {
                    reply.reply(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6));
                }

                @Override // io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result
                public void success(java.lang.String str) {
                    arrayList.add(0, str);
                    reply.reply(arrayList);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$13(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            arrayList.add(0, webViewHostApi.getTitle(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$14(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            java.lang.Number number3 = (java.lang.Number) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.scrollTo(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()), number3 == null ? null : java.lang.Long.valueOf(number3.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$15(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            java.lang.Number number3 = (java.lang.Number) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.scrollBy(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()), number3 == null ? null : java.lang.Long.valueOf(number3.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$16(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            arrayList.add(0, webViewHostApi.getScrollX(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$17(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            arrayList.add(0, webViewHostApi.getScrollY(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$18(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            arrayList.add(0, webViewHostApi.getScrollPosition(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$19(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            try {
                webViewHostApi.setWebContentsDebuggingEnabled((java.lang.Boolean) ((java.util.ArrayList) obj).get(0));
                arrayList.add(0, null);
            } catch (java.lang.Throwable th6) {
                arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
            }
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$2(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.lang.String str2 = (java.lang.String) arrayList2.get(2);
            java.lang.String str3 = (java.lang.String) arrayList2.get(3);
            java.lang.String str4 = (java.lang.String) arrayList2.get(4);
            java.lang.String str5 = (java.lang.String) arrayList2.get(5);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.loadDataWithBaseUrl(valueOf, str, str2, str3, str4, str5);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$20(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.setWebViewClient(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$21(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.addJavaScriptChannel(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$22(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.removeJavaScriptChannel(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$23(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.setDownloadListener(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$24(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.setWebChromeClient(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$25(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.Number number2 = (java.lang.Number) arrayList2.get(1);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.setBackgroundColor(valueOf, number2 == null ? null : java.lang.Long.valueOf(number2.longValue()));
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$3(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            java.util.Map<java.lang.String, java.lang.String> map = (java.util.Map) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.loadUrl(valueOf, str, map);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$4(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.util.ArrayList arrayList2 = (java.util.ArrayList) obj;
            java.lang.Number number = (java.lang.Number) arrayList2.get(0);
            java.lang.String str = (java.lang.String) arrayList2.get(1);
            byte[] bArr = (byte[]) arrayList2.get(2);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.postUrl(valueOf, str, bArr);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$5(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            arrayList.add(0, webViewHostApi.getUrl(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$6(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            arrayList.add(0, webViewHostApi.canGoBack(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$7(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            arrayList.add(0, webViewHostApi.canGoForward(valueOf));
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$8(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.goBack(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ void lambda$setup$9(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi, java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
            java.lang.Long valueOf;
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
            java.lang.Number number = (java.lang.Number) ((java.util.ArrayList) obj).get(0);
            if (number == null) {
                valueOf = null;
            } else {
                try {
                    valueOf = java.lang.Long.valueOf(number.longValue());
                } catch (java.lang.Throwable th6) {
                    arrayList = io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.wrapError(th6);
                }
            }
            webViewHostApi.goForward(valueOf);
            arrayList.add(0, null);
            reply.reply(arrayList);
        }

        static void setup(io.flutter.plugin.common.BinaryMessenger binaryMessenger, final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi webViewHostApi) {
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.create", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$a
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$0(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel2 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadData", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel2.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$c
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$1(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel2.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel3 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadDataWithBaseUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel3.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$j
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$2(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel3.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel4 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.loadUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel4.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$k
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$3(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel4.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel5 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.postUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel5.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$m
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$4(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel5.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel6 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getUrl", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel6.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$n
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$5(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel6.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel7 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoBack", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel7.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$o
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$6(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel7.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel8 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.canGoForward", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel8.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$p
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$7(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel8.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel9 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goBack", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel9.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$q
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$8(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel9.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel10 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.goForward", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel10.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$r
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$9(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel10.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel11 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.reload", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel11.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$l
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$10(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel11.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel12 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.clearCache", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel12.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$s
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$11(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel12.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel13 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.evaluateJavascript", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel13.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$t
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$12(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel13.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel14 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getTitle", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel14.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$u
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$13(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel14.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel15 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollTo", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel15.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$v
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$14(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel15.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel16 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.scrollBy", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel16.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$w
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$15(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel16.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel17 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollX", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel17.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$x
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$16(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel17.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel18 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollY", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel18.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$y
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$17(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel18.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel19 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.getScrollPosition", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel19.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$z
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$18(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel19.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel20 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebContentsDebuggingEnabled", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel20.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$b
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$19(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel20.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel21 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebViewClient", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel21.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$d
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$20(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel21.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel22 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.addJavaScriptChannel", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel22.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$e
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$21(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel22.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel23 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.removeJavaScriptChannel", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel23.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$f
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$22(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel23.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel24 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setDownloadListener", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel24.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$g
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$23(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel24.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel25 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setWebChromeClient", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel25.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$h
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$24(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel25.setMessageHandler(null);
            }
            io.flutter.plugin.common.BasicMessageChannel basicMessageChannel26 = new io.flutter.plugin.common.BasicMessageChannel(binaryMessenger, "dev.flutter.pigeon.webview_flutter_android.WebViewHostApi.setBackgroundColor", getCodec());
            if (webViewHostApi != null) {
                basicMessageChannel26.setMessageHandler(new io.flutter.plugin.common.BasicMessageChannel.MessageHandler() { // from class: io.flutter.plugins.webviewflutter.GeneratedAndroidWebView$WebViewHostApi$$i
                    @Override // io.flutter.plugin.common.BasicMessageChannel.MessageHandler
                    public final void onMessage(java.lang.Object obj, io.flutter.plugin.common.BasicMessageChannel.Reply reply) {
                        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.lambda$setup$25(io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApi.this, obj, reply);
                    }
                });
            } else {
                basicMessageChannel26.setMessageHandler(null);
            }
        }

        void addJavaScriptChannel(java.lang.Long l17, java.lang.Long l18);

        java.lang.Boolean canGoBack(java.lang.Long l17);

        java.lang.Boolean canGoForward(java.lang.Long l17);

        void clearCache(java.lang.Long l17, java.lang.Boolean bool);

        void create(java.lang.Long l17);

        void evaluateJavascript(java.lang.Long l17, java.lang.String str, io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.Result<java.lang.String> result);

        io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint getScrollPosition(java.lang.Long l17);

        java.lang.Long getScrollX(java.lang.Long l17);

        java.lang.Long getScrollY(java.lang.Long l17);

        java.lang.String getTitle(java.lang.Long l17);

        java.lang.String getUrl(java.lang.Long l17);

        void goBack(java.lang.Long l17);

        void goForward(java.lang.Long l17);

        void loadData(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3);

        void loadDataWithBaseUrl(java.lang.Long l17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5);

        void loadUrl(java.lang.Long l17, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map);

        void postUrl(java.lang.Long l17, java.lang.String str, byte[] bArr);

        void reload(java.lang.Long l17);

        void removeJavaScriptChannel(java.lang.Long l17, java.lang.Long l18);

        void scrollBy(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19);

        void scrollTo(java.lang.Long l17, java.lang.Long l18, java.lang.Long l19);

        void setBackgroundColor(java.lang.Long l17, java.lang.Long l18);

        void setDownloadListener(java.lang.Long l17, java.lang.Long l18);

        void setWebChromeClient(java.lang.Long l17, java.lang.Long l18);

        void setWebContentsDebuggingEnabled(java.lang.Boolean bool);

        void setWebViewClient(java.lang.Long l17, java.lang.Long l18);
    }

    /* loaded from: classes13.dex */
    public static class WebViewHostApiCodec extends io.flutter.plugin.common.StandardMessageCodec {
        public static final io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApiCodec INSTANCE = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewHostApiCodec();

        private WebViewHostApiCodec() {
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public java.lang.Object readValueOfType(byte b17, java.nio.ByteBuffer byteBuffer) {
            return b17 != Byte.MIN_VALUE ? super.readValueOfType(b17, byteBuffer) : io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint.fromList((java.util.ArrayList) readValue(byteBuffer));
        }

        @Override // io.flutter.plugin.common.StandardMessageCodec
        public void writeValue(java.io.ByteArrayOutputStream byteArrayOutputStream, java.lang.Object obj) {
            if (!(obj instanceof io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint)) {
                super.writeValue(byteArrayOutputStream, obj);
            } else {
                byteArrayOutputStream.write(128);
                writeValue(byteArrayOutputStream, ((io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint) obj).toList());
            }
        }
    }

    /* loaded from: classes13.dex */
    public static final class WebViewPoint {

        /* renamed from: x, reason: collision with root package name */
        private java.lang.Long f293377x;

        /* renamed from: y, reason: collision with root package name */
        private java.lang.Long f293378y;

        /* loaded from: classes13.dex */
        public static final class Builder {

            /* renamed from: x, reason: collision with root package name */
            private java.lang.Long f293379x;

            /* renamed from: y, reason: collision with root package name */
            private java.lang.Long f293380y;

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint build() {
                io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint webViewPoint = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint();
                webViewPoint.setX(this.f293379x);
                webViewPoint.setY(this.f293380y);
                return webViewPoint;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint.Builder setX(java.lang.Long l17) {
                this.f293379x = l17;
                return this;
            }

            public io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint.Builder setY(java.lang.Long l17) {
                this.f293380y = l17;
                return this;
            }
        }

        public static io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint fromList(java.util.ArrayList<java.lang.Object> arrayList) {
            java.lang.Long valueOf;
            io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint webViewPoint = new io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.WebViewPoint();
            java.lang.Object obj = arrayList.get(0);
            java.lang.Long l17 = null;
            if (obj == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Long.valueOf(obj instanceof java.lang.Integer ? ((java.lang.Integer) obj).intValue() : ((java.lang.Long) obj).longValue());
            }
            webViewPoint.setX(valueOf);
            java.lang.Object obj2 = arrayList.get(1);
            if (obj2 != null) {
                l17 = java.lang.Long.valueOf(obj2 instanceof java.lang.Integer ? ((java.lang.Integer) obj2).intValue() : ((java.lang.Long) obj2).longValue());
            }
            webViewPoint.setY(l17);
            return webViewPoint;
        }

        public java.lang.Long getX() {
            return this.f293377x;
        }

        public java.lang.Long getY() {
            return this.f293378y;
        }

        public void setX(java.lang.Long l17) {
            if (l17 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"x\" is null.");
            }
            this.f293377x = l17;
        }

        public void setY(java.lang.Long l17) {
            if (l17 == null) {
                throw new java.lang.IllegalStateException("Nonnull field \"y\" is null.");
            }
            this.f293378y = l17;
        }

        public java.util.ArrayList<java.lang.Object> toList() {
            java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(2);
            arrayList.add(this.f293377x);
            arrayList.add(this.f293378y);
            return arrayList;
        }
    }

    public static java.util.ArrayList<java.lang.Object> wrapError(java.lang.Throwable th6) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>(3);
        if (th6 instanceof io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterError) {
            io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterError flutterError = (io.flutter.plugins.webviewflutter.GeneratedAndroidWebView.FlutterError) th6;
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
