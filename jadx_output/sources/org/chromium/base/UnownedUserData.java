package org.chromium.base;

/* loaded from: classes16.dex */
public interface UnownedUserData {
    default boolean informOnDetachmentFromHost() {
        return true;
    }

    default void onDetachedFromHost(org.chromium.base.UnownedUserDataHost unownedUserDataHost) {
    }
}
