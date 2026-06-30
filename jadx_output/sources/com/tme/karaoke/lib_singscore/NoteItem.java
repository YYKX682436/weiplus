package com.tme.karaoke.lib_singscore;

/* loaded from: classes10.dex */
public class NoteItem {
    public static final int INVALID_GROVE_VALUE = -1;
    public static final int MAX_GROVE_VALUE = 100;
    public static final int MAX_VOICE_PITCH_VALUE = 90;
    public int duration;
    public int endTime;
    public int height;
    public int startTime;

    public int getEndTime() {
        return this.startTime + this.duration;
    }

    public boolean isSame(int i17) {
        return java.lang.Math.abs(this.height - i17) < 11 && this.height > 0 && i17 > 0;
    }

    public java.lang.String toString() {
        return java.lang.String.format("startTime = %d ; endTime = %d ; duration = %d ; height = %d;", java.lang.Integer.valueOf(this.startTime), java.lang.Integer.valueOf(this.endTime), java.lang.Integer.valueOf(this.duration), java.lang.Integer.valueOf(this.height));
    }
}
