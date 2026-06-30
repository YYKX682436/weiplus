package com.tencent.qqmusic.mediaplayer.upstream;

/* loaded from: classes13.dex */
public class Chunk {
    public final int bufferSize;
    public final long size;
    public final long start;

    public Chunk(int i17, long j17, long j18) {
        this.bufferSize = i17;
        this.start = j17;
        this.size = j18;
    }

    public boolean contains(long j17) {
        if (isEndless()) {
            return j17 >= this.start;
        }
        long j18 = this.start;
        return j17 >= j18 && j17 <= j18 + this.size;
    }

    public boolean isEndless() {
        return this.size == -1;
    }

    public java.lang.String toString() {
        return "Chunk{bufferSize=" + this.bufferSize + ", start=" + this.start + ", size=" + this.size + '}';
    }
}
