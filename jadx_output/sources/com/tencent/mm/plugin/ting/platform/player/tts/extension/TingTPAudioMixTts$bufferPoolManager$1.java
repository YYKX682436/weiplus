package com.tencent.mm.plugin.ting.platform.player.tts.extension;

@kotlin.Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004J!\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00060\b\"\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/tencent/mm/plugin/ting/platform/player/tts/extension/TingTPAudioMixTts$bufferPoolManager$1", "", "", "minSize", "", "copyData", "Ljava/nio/ByteBuffer;", "getBuffer", "", "buffers", "Ljz5/f0;", "returnBuffers", "([Ljava/nio/ByteBuffer;)V", "Ljava/util/ArrayDeque;", "bufferPool", "Ljava/util/ArrayDeque;", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes14.dex */
public final class TingTPAudioMixTts$bufferPoolManager$1 {
    private final java.util.ArrayDeque<java.nio.ByteBuffer> bufferPool = new java.util.ArrayDeque<>(3);

    public static /* synthetic */ java.nio.ByteBuffer getBuffer$default(com.tencent.mm.plugin.ting.platform.player.tts.extension.TingTPAudioMixTts$bufferPoolManager$1 tingTPAudioMixTts$bufferPoolManager$1, int i17, byte[] bArr, int i18, java.lang.Object obj) {
        if ((i18 & 2) != 0) {
            bArr = null;
        }
        return tingTPAudioMixTts$bufferPoolManager$1.getBuffer(i17, bArr);
    }

    public final java.nio.ByteBuffer getBuffer(int minSize, byte[] copyData) {
        java.nio.ByteBuffer poll = this.bufferPool.poll();
        if (poll != null) {
            if (!(poll.capacity() >= minSize)) {
                poll = null;
            }
            if (poll != null) {
                poll.clear();
                if (copyData != null) {
                    poll.put(copyData);
                }
                return poll;
            }
        }
        java.nio.ByteBuffer allocateDirect = java.nio.ByteBuffer.allocateDirect(java.lang.Math.max(minSize, copyData != null ? copyData.length : minSize));
        if (copyData != null) {
            allocateDirect.put(copyData);
        }
        kotlin.jvm.internal.o.f(allocateDirect, "apply(...)");
        return allocateDirect;
    }

    public final void returnBuffers(java.nio.ByteBuffer... buffers) {
        kotlin.jvm.internal.o.g(buffers, "buffers");
        for (java.nio.ByteBuffer byteBuffer : buffers) {
            byteBuffer.clear();
            if (this.bufferPool.size() < 5) {
                this.bufferPool.offer(byteBuffer);
            }
        }
    }
}
