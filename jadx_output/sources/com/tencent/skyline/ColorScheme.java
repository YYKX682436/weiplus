package com.tencent.skyline;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/tencent/skyline/ColorScheme;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", "None", "Light", "Dark", "skyline_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ColorScheme {
    None(0),
    Light(1),
    Dark(2);

    private final int value;

    ColorScheme(int i17) {
        this.value = i17;
    }

    public final int getValue() {
        return this.value;
    }
}
