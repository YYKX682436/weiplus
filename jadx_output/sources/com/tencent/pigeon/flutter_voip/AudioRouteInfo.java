package com.tencent.pigeon.flutter_voip;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/AudioRouteInfo;", "", "deviceType", "Lcom/tencent/pigeon/flutter_voip/AudioDevice;", "deviceName", "", "(Lcom/tencent/pigeon/flutter_voip/AudioDevice;Ljava/lang/String;)V", "getDeviceName", "()Ljava/lang/String;", "getDeviceType", "()Lcom/tencent/pigeon/flutter_voip/AudioDevice;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toList", "", "toString", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AudioRouteInfo {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.tencent.pigeon.flutter_voip.AudioRouteInfo.Companion INSTANCE = new com.tencent.pigeon.flutter_voip.AudioRouteInfo.Companion(null);
    private final java.lang.String deviceName;
    private final com.tencent.pigeon.flutter_voip.AudioDevice deviceType;

    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/flutter_voip/AudioRouteInfo$Companion;", "", "()V", "fromList", "Lcom/tencent/pigeon/flutter_voip/AudioRouteInfo;", "list", "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.i iVar) {
            this();
        }

        public final com.tencent.pigeon.flutter_voip.AudioRouteInfo fromList(java.util.List<? extends java.lang.Object> list) {
            kotlin.jvm.internal.o.g(list, "list");
            com.tencent.pigeon.flutter_voip.AudioDevice.Companion companion = com.tencent.pigeon.flutter_voip.AudioDevice.INSTANCE;
            java.lang.Object obj = list.get(0);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Int");
            com.tencent.pigeon.flutter_voip.AudioDevice ofRaw = companion.ofRaw(((java.lang.Integer) obj).intValue());
            kotlin.jvm.internal.o.d(ofRaw);
            java.lang.Object obj2 = list.get(1);
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            return new com.tencent.pigeon.flutter_voip.AudioRouteInfo(ofRaw, (java.lang.String) obj2);
        }
    }

    public AudioRouteInfo(com.tencent.pigeon.flutter_voip.AudioDevice deviceType, java.lang.String deviceName) {
        kotlin.jvm.internal.o.g(deviceType, "deviceType");
        kotlin.jvm.internal.o.g(deviceName, "deviceName");
        this.deviceType = deviceType;
        this.deviceName = deviceName;
    }

    public static /* synthetic */ com.tencent.pigeon.flutter_voip.AudioRouteInfo copy$default(com.tencent.pigeon.flutter_voip.AudioRouteInfo audioRouteInfo, com.tencent.pigeon.flutter_voip.AudioDevice audioDevice, java.lang.String str, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            audioDevice = audioRouteInfo.deviceType;
        }
        if ((i17 & 2) != 0) {
            str = audioRouteInfo.deviceName;
        }
        return audioRouteInfo.copy(audioDevice, str);
    }

    /* renamed from: component1, reason: from getter */
    public final com.tencent.pigeon.flutter_voip.AudioDevice getDeviceType() {
        return this.deviceType;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public final com.tencent.pigeon.flutter_voip.AudioRouteInfo copy(com.tencent.pigeon.flutter_voip.AudioDevice deviceType, java.lang.String deviceName) {
        kotlin.jvm.internal.o.g(deviceType, "deviceType");
        kotlin.jvm.internal.o.g(deviceName, "deviceName");
        return new com.tencent.pigeon.flutter_voip.AudioRouteInfo(deviceType, deviceName);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.tencent.pigeon.flutter_voip.AudioRouteInfo)) {
            return false;
        }
        com.tencent.pigeon.flutter_voip.AudioRouteInfo audioRouteInfo = (com.tencent.pigeon.flutter_voip.AudioRouteInfo) other;
        return this.deviceType == audioRouteInfo.deviceType && kotlin.jvm.internal.o.b(this.deviceName, audioRouteInfo.deviceName);
    }

    public final java.lang.String getDeviceName() {
        return this.deviceName;
    }

    public final com.tencent.pigeon.flutter_voip.AudioDevice getDeviceType() {
        return this.deviceType;
    }

    public int hashCode() {
        return (this.deviceType.hashCode() * 31) + this.deviceName.hashCode();
    }

    public final java.util.List<java.lang.Object> toList() {
        return kz5.c0.i(java.lang.Integer.valueOf(this.deviceType.getRaw()), this.deviceName);
    }

    public java.lang.String toString() {
        return "AudioRouteInfo(deviceType=" + this.deviceType + ", deviceName=" + this.deviceName + ')';
    }
}
