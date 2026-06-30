package org.chromium.net.impl;

/* loaded from: classes15.dex */
public final class Preconditions {
    private Preconditions() {
    }

    public static void checkDirect(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.isDirect()) {
            throw new java.lang.IllegalArgumentException("byteBuffer must be a direct ByteBuffer.");
        }
    }

    public static void checkHasRemaining(java.nio.ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new java.lang.IllegalArgumentException("ByteBuffer is already full.");
        }
    }
}
