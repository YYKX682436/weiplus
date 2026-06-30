package com.tencent.mm.plugin.vlog.model;

/* loaded from: classes10.dex */
public abstract class r0 {
    public static final int a(android.media.MediaFormat mediaFormat, java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(mediaFormat, "<this>");
        kotlin.jvm.internal.o.g(name, "name");
        return mediaFormat.containsKey(name) ? mediaFormat.getInteger(name) : i17;
    }
}
