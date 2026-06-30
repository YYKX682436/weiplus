package com.tencent.tencentmap.mapsdk.maps.model;

/* loaded from: classes13.dex */
public class LoggerConfig {
    private boolean mToFile = false;
    private boolean mToConsole = false;
    private int mLevel = 6;
    private java.lang.String[] mTags = new java.lang.String[0];
    private com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.LogCallback mLogCallback = null;

    /* loaded from: classes13.dex */
    public static class Builder {
        private final com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig mLoggerConfig;

        public Builder(com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig loggerConfig) {
            if (loggerConfig != null) {
                this.mLoggerConfig = loggerConfig;
            } else {
                this.mLoggerConfig = new com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig();
            }
        }

        public com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig build() {
            return this.mLoggerConfig;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.Builder level(int i17) {
            this.mLoggerConfig.mLevel = i17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.Builder logCallback(com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.LogCallback logCallback) {
            this.mLoggerConfig.mLogCallback = logCallback;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.Builder tags(java.lang.String... strArr) {
            this.mLoggerConfig.mTags = strArr;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.Builder toConsole(boolean z17) {
            this.mLoggerConfig.mToConsole = z17;
            return this;
        }

        public com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.Builder toFile(boolean z17) {
            this.mLoggerConfig.mToFile = z17;
            return this;
        }
    }

    /* loaded from: classes13.dex */
    public interface LogCallback {
        void onLog(java.lang.String str);
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.Builder newBuilder() {
        return newBuilder(null);
    }

    public int getLevel() {
        return this.mLevel;
    }

    public com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.LogCallback getLogCallback() {
        return this.mLogCallback;
    }

    public java.lang.String[] getTags() {
        return this.mTags;
    }

    public boolean isToConsole() {
        return this.mToConsole;
    }

    public boolean isToFile() {
        return this.mToFile;
    }

    public static com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.Builder newBuilder(com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig loggerConfig) {
        return new com.tencent.tencentmap.mapsdk.maps.model.LoggerConfig.Builder(loggerConfig);
    }
}
