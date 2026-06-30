package io.flutter.embedding.engine.systemchannels;

/* loaded from: classes15.dex */
public class SettingsChannel {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.String ALWAYS_USE_24_HOUR_FORMAT = "alwaysUse24HourFormat";
    private static final java.lang.String BRIEFLY_SHOW_PASSWORD = "brieflyShowPassword";
    public static final java.lang.String CHANNEL_NAME = "flutter/settings";
    private static final java.lang.String CONFIGURATION_ID = "configurationId";
    private static final io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue CONFIGURATION_QUEUE = new io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue();
    private static final java.lang.String NATIVE_SPELL_CHECK_SERVICE_DEFINED = "nativeSpellCheckServiceDefined";
    private static final java.lang.String PLATFORM_BRIGHTNESS = "platformBrightness";
    private static final java.lang.String TAG = "SettingsChannel";
    private static final java.lang.String TEXT_SCALE_FACTOR = "textScaleFactor";
    public final io.flutter.plugin.common.BasicMessageChannel<java.lang.Object> channel;

    /* loaded from: classes15.dex */
    public static class ConfigurationQueue {
        private io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration currentConfiguration;
        private io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration previousEnqueuedConfiguration;
        private final java.util.concurrent.ConcurrentLinkedQueue<io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration> sentQueue = new java.util.concurrent.ConcurrentLinkedQueue<>();

        /* loaded from: classes15.dex */
        public static class SentConfiguration {
            private static int nextConfigGeneration = Integer.MIN_VALUE;
            private final android.util.DisplayMetrics displayMetrics;
            public final int generationNumber;

            public SentConfiguration(android.util.DisplayMetrics displayMetrics) {
                int i17 = nextConfigGeneration;
                nextConfigGeneration = i17 + 1;
                this.generationNumber = i17;
                this.displayMetrics = displayMetrics;
            }
        }

        public io.flutter.plugin.common.BasicMessageChannel.Reply enqueueConfiguration(io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration sentConfiguration) {
            this.sentQueue.add(sentConfiguration);
            final io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration sentConfiguration2 = this.previousEnqueuedConfiguration;
            this.previousEnqueuedConfiguration = sentConfiguration;
            if (sentConfiguration2 == null) {
                return null;
            }
            return new io.flutter.plugin.common.BasicMessageChannel.Reply() { // from class: io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.1
                @Override // io.flutter.plugin.common.BasicMessageChannel.Reply
                public void reply(java.lang.Object obj) {
                    io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.this.sentQueue.remove(sentConfiguration2);
                    if (io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.this.sentQueue.isEmpty()) {
                        return;
                    }
                    io.flutter.Log.e(io.flutter.embedding.engine.systemchannels.SettingsChannel.TAG, "The queue becomes empty after removing config generation " + java.lang.String.valueOf(sentConfiguration2.generationNumber));
                }
            };
        }

        public io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration getConfiguration(int i17) {
            io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration sentConfiguration;
            if (this.currentConfiguration == null) {
                this.currentConfiguration = this.sentQueue.poll();
            }
            while (true) {
                sentConfiguration = this.currentConfiguration;
                if (sentConfiguration == null || sentConfiguration.generationNumber >= i17) {
                    break;
                }
                this.currentConfiguration = this.sentQueue.poll();
            }
            if (sentConfiguration == null) {
                io.flutter.Log.e(io.flutter.embedding.engine.systemchannels.SettingsChannel.TAG, "Cannot find config with generation: " + java.lang.String.valueOf(i17) + ", after exhausting the queue.");
                return null;
            }
            if (sentConfiguration.generationNumber == i17) {
                return sentConfiguration;
            }
            io.flutter.Log.e(io.flutter.embedding.engine.systemchannels.SettingsChannel.TAG, "Cannot find config with generation: " + java.lang.String.valueOf(i17) + ", the oldest config is now: " + java.lang.String.valueOf(this.currentConfiguration.generationNumber));
            return null;
        }
    }

    /* loaded from: classes15.dex */
    public static class MessageBuilder {
        private final io.flutter.plugin.common.BasicMessageChannel<java.lang.Object> channel;
        private android.util.DisplayMetrics displayMetrics;
        private java.util.Map<java.lang.String, java.lang.Object> message = new java.util.HashMap();

        public MessageBuilder(io.flutter.plugin.common.BasicMessageChannel<java.lang.Object> basicMessageChannel) {
            this.channel = basicMessageChannel;
        }

        public void send() {
            io.flutter.Log.v(io.flutter.embedding.engine.systemchannels.SettingsChannel.TAG, "Sending message: \ntextScaleFactor: " + this.message.get(io.flutter.embedding.engine.systemchannels.SettingsChannel.TEXT_SCALE_FACTOR) + "\nalwaysUse24HourFormat: " + this.message.get(io.flutter.embedding.engine.systemchannels.SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT) + "\nplatformBrightness: " + this.message.get(io.flutter.embedding.engine.systemchannels.SettingsChannel.PLATFORM_BRIGHTNESS));
            android.util.DisplayMetrics displayMetrics = this.displayMetrics;
            if (!io.flutter.embedding.engine.systemchannels.SettingsChannel.hasNonlinearTextScalingSupport() || displayMetrics == null) {
                this.channel.send(this.message);
                return;
            }
            io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration sentConfiguration = new io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration(displayMetrics);
            io.flutter.plugin.common.BasicMessageChannel.Reply<java.lang.Object> enqueueConfiguration = io.flutter.embedding.engine.systemchannels.SettingsChannel.CONFIGURATION_QUEUE.enqueueConfiguration(sentConfiguration);
            this.message.put(io.flutter.embedding.engine.systemchannels.SettingsChannel.CONFIGURATION_ID, java.lang.Integer.valueOf(sentConfiguration.generationNumber));
            this.channel.send(this.message, enqueueConfiguration);
        }

        public io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder setBrieflyShowPassword(boolean z17) {
            this.message.put(io.flutter.embedding.engine.systemchannels.SettingsChannel.BRIEFLY_SHOW_PASSWORD, java.lang.Boolean.valueOf(z17));
            return this;
        }

        public io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder setDisplayMetrics(android.util.DisplayMetrics displayMetrics) {
            this.displayMetrics = displayMetrics;
            return this;
        }

        public io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder setNativeSpellCheckServiceDefined(boolean z17) {
            this.message.put(io.flutter.embedding.engine.systemchannels.SettingsChannel.NATIVE_SPELL_CHECK_SERVICE_DEFINED, java.lang.Boolean.valueOf(z17));
            return this;
        }

        public io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder setPlatformBrightness(io.flutter.embedding.engine.systemchannels.SettingsChannel.PlatformBrightness platformBrightness) {
            this.message.put(io.flutter.embedding.engine.systemchannels.SettingsChannel.PLATFORM_BRIGHTNESS, platformBrightness.name);
            return this;
        }

        public io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder setTextScaleFactor(float f17) {
            this.message.put(io.flutter.embedding.engine.systemchannels.SettingsChannel.TEXT_SCALE_FACTOR, java.lang.Float.valueOf(f17));
            return this;
        }

        public io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder setUse24HourFormat(boolean z17) {
            this.message.put(io.flutter.embedding.engine.systemchannels.SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT, java.lang.Boolean.valueOf(z17));
            return this;
        }
    }

    /* loaded from: classes11.dex */
    public enum PlatformBrightness {
        light("light"),
        dark("dark");

        public java.lang.String name;

        PlatformBrightness(java.lang.String str) {
            this.name = str;
        }
    }

    public SettingsChannel(io.flutter.embedding.engine.dart.DartExecutor dartExecutor) {
        this.channel = new io.flutter.plugin.common.BasicMessageChannel<>(dartExecutor, CHANNEL_NAME, io.flutter.plugin.common.JSONMessageCodec.INSTANCE);
    }

    public static android.util.DisplayMetrics getPastDisplayMetrics(int i17) {
        io.flutter.embedding.engine.systemchannels.SettingsChannel.ConfigurationQueue.SentConfiguration configuration = CONFIGURATION_QUEUE.getConfiguration(i17);
        if (configuration == null) {
            return null;
        }
        return configuration.displayMetrics;
    }

    public static boolean hasNonlinearTextScalingSupport() {
        return android.os.Build.VERSION.SDK_INT >= 34;
    }

    public io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder startMessage() {
        return new io.flutter.embedding.engine.systemchannels.SettingsChannel.MessageBuilder(this.channel);
    }
}
