package com.tencent.thumbplayer.api;

/* loaded from: classes16.dex */
public class TPOptionalParam {
    public static final int TP_OPTIONAL_PARAM_TYPE_BOOLEAN = 1;
    public static final int TP_OPTIONAL_PARAM_TYPE_FLOAT = 6;
    public static final int TP_OPTIONAL_PARAM_TYPE_INT = 8;
    public static final int TP_OPTIONAL_PARAM_TYPE_LONG = 2;
    public static final int TP_OPTIONAL_PARAM_TYPE_OBJECT = 7;
    public static final int TP_OPTIONAL_PARAM_TYPE_QUEUE_INT = 4;
    public static final int TP_OPTIONAL_PARAM_TYPE_QUEUE_STRING = 5;
    public static final int TP_OPTIONAL_PARAM_TYPE_STRING = 3;
    public static final int TP_OPTIONAL_PARAM_TYPE_UNKNOWN = -1;

    @com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId
    private int key;
    private com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamBoolean paramBoolean;
    private com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamFloat paramFloat;
    private com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamInt paramInt;
    private com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamLong paramLong;
    private com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamObject paramObject;
    private com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamQueueInt paramQueueInt;
    private com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamQueueString paramQueueString;
    private com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamString paramString;
    private int paramType = -1;

    /* loaded from: classes16.dex */
    public static class OptionalParamBoolean {
        public boolean value;
    }

    /* loaded from: classes16.dex */
    public static class OptionalParamFloat {
        public float param1;
        public float param2;
        public float value;
    }

    /* loaded from: classes16.dex */
    public static class OptionalParamInt {
        public int value;
    }

    /* loaded from: classes16.dex */
    public static class OptionalParamLong {
        public long param1;
        public long param2;
        public long value;
    }

    /* loaded from: classes16.dex */
    public static class OptionalParamObject {
        public java.lang.Object objectValue;
    }

    /* loaded from: classes16.dex */
    public static class OptionalParamQueueInt {
        public int[] queueValue;
    }

    /* loaded from: classes16.dex */
    public static class OptionalParamQueueString {
        public java.lang.String[] queueValue;
    }

    /* loaded from: classes16.dex */
    public static class OptionalParamString {
        public java.lang.String param1;
        public java.lang.String param2;
        public java.lang.String value;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildBoolean(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, boolean z17) {
        this.paramType = 1;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamBoolean optionalParamBoolean = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamBoolean();
        this.paramBoolean = optionalParamBoolean;
        optionalParamBoolean.value = z17;
        return this;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildFloat(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, float f17) {
        this.paramType = 6;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamFloat optionalParamFloat = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamFloat();
        this.paramFloat = optionalParamFloat;
        optionalParamFloat.value = f17;
        return this;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildInt(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, int i18) {
        this.paramType = 8;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamInt optionalParamInt = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamInt();
        this.paramInt = optionalParamInt;
        optionalParamInt.value = i18;
        return this;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildLong(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, long j17) {
        this.paramType = 2;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamLong optionalParamLong = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamLong();
        this.paramLong = optionalParamLong;
        optionalParamLong.value = j17;
        return this;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildObject(int i17, java.lang.Object obj) {
        this.paramType = 7;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamObject optionalParamObject = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamObject();
        this.paramObject = optionalParamObject;
        optionalParamObject.objectValue = obj;
        return this;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildQueueInt(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, int[] iArr) {
        this.paramType = 4;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamQueueInt optionalParamQueueInt = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamQueueInt();
        this.paramQueueInt = optionalParamQueueInt;
        optionalParamQueueInt.queueValue = iArr;
        return this;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildQueueString(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, java.lang.String[] strArr) {
        this.paramType = 5;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamQueueString optionalParamQueueString = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamQueueString();
        this.paramQueueString = optionalParamQueueString;
        optionalParamQueueString.queueValue = strArr;
        return this;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildString(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, java.lang.String str) {
        this.paramType = 3;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamString optionalParamString = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamString();
        this.paramString = optionalParamString;
        optionalParamString.value = str;
        return this;
    }

    @com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId
    public int getKey() {
        return this.key;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamBoolean getParamBoolean() {
        return this.paramBoolean;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamFloat getParamFloat() {
        return this.paramFloat;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamInt getParamInt() {
        return this.paramInt;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamLong getParamLong() {
        return this.paramLong;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamObject getParamObject() {
        return this.paramObject;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamQueueInt getParamQueueInt() {
        return this.paramQueueInt;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamQueueString getParamQueueString() {
        return this.paramQueueString;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamString getParamString() {
        return this.paramString;
    }

    public int getParamType() {
        return this.paramType;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = 0;
        switch (this.paramType) {
            case 1:
                sb6.append("type:long, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.getOptionalIdName(this.key));
                sb6.append(", value:");
                sb6.append(this.paramBoolean.value);
                break;
            case 2:
                sb6.append("type:long, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.getOptionalIdName(this.key));
                sb6.append(", value:");
                sb6.append(this.paramLong.value);
                sb6.append(", param1:");
                sb6.append(this.paramLong.param1);
                sb6.append(", param2:");
                sb6.append(this.paramLong.param2);
                break;
            case 3:
                sb6.append("type:string, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.getOptionalIdName(this.key));
                sb6.append(", value:");
                sb6.append(this.paramString.value);
                sb6.append(", param1:");
                sb6.append(this.paramString.param1);
                sb6.append(", param2:");
                sb6.append(this.paramString.param2);
                break;
            case 4:
                sb6.append("type:quint_int, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.getOptionalIdName(this.key));
                sb6.append(", value:");
                int[] iArr = this.paramQueueInt.queueValue;
                if (iArr != null) {
                    int length = iArr.length;
                    while (i17 < length) {
                        sb6.append(iArr[i17]);
                        sb6.append(", ");
                        i17++;
                    }
                    break;
                }
                break;
            case 5:
                sb6.append("type:quint_string, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.getOptionalIdName(this.key));
                sb6.append(", value:");
                java.lang.String[] strArr = this.paramQueueString.queueValue;
                if (strArr != null) {
                    int length2 = strArr.length;
                    while (i17 < length2) {
                        sb6.append(strArr[i17]);
                        sb6.append(", ");
                        i17++;
                    }
                    break;
                }
                break;
            case 6:
                sb6.append("type:float, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.getOptionalIdName(this.key));
                sb6.append(", value:");
                sb6.append(this.paramFloat.value);
                sb6.append(", param1:");
                sb6.append(this.paramFloat.param1);
                sb6.append(", param2:");
                sb6.append(this.paramFloat.param2);
                break;
            case 7:
                sb6.append("type:object, key:");
                sb6.append(this.key);
                sb6.append(", \nname:");
                sb6.append(com.tencent.thumbplayer.adapter.strategy.utils.TPNativeKeyMapUtil.getOptionalIdName(this.key));
                sb6.append(", value:");
                sb6.append(this.paramObject.objectValue);
                break;
            case 8:
                sb6.append("type:int, key:" + this.key + ", value:" + this.paramInt.value);
                break;
            default:
                sb6.append("type:unknown");
                break;
        }
        return sb6.toString();
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildFloat(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, float f17, float f18, float f19) {
        this.paramType = 6;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamFloat optionalParamFloat = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamFloat();
        this.paramFloat = optionalParamFloat;
        optionalParamFloat.value = f17;
        optionalParamFloat.param1 = f18;
        optionalParamFloat.param2 = f19;
        return this;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildLong(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, long j17, long j18, long j19) {
        this.paramType = 2;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamLong optionalParamLong = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamLong();
        this.paramLong = optionalParamLong;
        optionalParamLong.value = j17;
        optionalParamLong.param1 = j18;
        optionalParamLong.param2 = j19;
        return this;
    }

    public com.tencent.thumbplayer.api.TPOptionalParam buildString(@com.tencent.thumbplayer.api.TPCommonEnum.TPOptionalId int i17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.paramType = 3;
        this.key = i17;
        com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamString optionalParamString = new com.tencent.thumbplayer.api.TPOptionalParam.OptionalParamString();
        this.paramString = optionalParamString;
        optionalParamString.value = str;
        optionalParamString.param1 = str2;
        optionalParamString.param2 = str3;
        return this;
    }
}
