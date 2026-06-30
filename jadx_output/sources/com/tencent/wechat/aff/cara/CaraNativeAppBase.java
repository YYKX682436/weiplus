package com.tencent.wechat.aff.cara;

/* loaded from: classes15.dex */
public interface CaraNativeAppBase {
    java.lang.String documentUser();

    java.lang.String exptValue(java.lang.String str);

    boolean isDebugging();

    boolean isForeground();

    java.util.Optional<java.lang.Boolean> kitchenBoolValue(java.lang.String str);

    java.util.Optional<java.lang.Float> kitchenFloatValue(java.lang.String str);

    java.util.Optional<java.lang.Integer> kitchenIntValue(java.lang.String str);

    java.util.Optional<java.lang.String> kitchenStringValue(java.lang.String str);

    java.util.Optional<byte[]> packageServerData(int i17);

    void reportKV(int i17, java.lang.String str);

    double serverNow();
}
