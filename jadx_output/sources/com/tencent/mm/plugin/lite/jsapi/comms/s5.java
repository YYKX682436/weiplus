package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes12.dex */
public final class s5 {
    public s5(kotlin.jvm.internal.i iVar) {
    }

    public final com.tencent.mm.plugin.lite.jsapi.comms.t5 a(java.lang.String fileType) {
        kotlin.jvm.internal.o.g(fileType, "fileType");
        int hashCode = fileType.hashCode();
        if (hashCode != 3143036) {
            if (hashCode != 100313435) {
                if (hashCode == 112202875 && fileType.equals("video")) {
                    return com.tencent.mm.plugin.lite.jsapi.comms.t5.f143783f;
                }
            } else if (fileType.equals("image")) {
                return com.tencent.mm.plugin.lite.jsapi.comms.t5.f143782e;
            }
        } else if (fileType.equals("file")) {
            return com.tencent.mm.plugin.lite.jsapi.comms.t5.f143784g;
        }
        return com.tencent.mm.plugin.lite.jsapi.comms.t5.f143784g;
    }
}
