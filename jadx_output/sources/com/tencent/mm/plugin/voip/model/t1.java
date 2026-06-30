package com.tencent.mm.plugin.voip.model;

/* loaded from: classes.dex */
public final class t1 {
    public t1(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        try {
            com.tencent.mars.xlog.Log.i("VoipModelUdrMgr", "Directories creation results: " + kz5.b0.c(java.lang.Boolean.valueOf(com.tencent.mm.vfs.w6.u(com.tencent.mm.plugin.voip.model.u1.f176807e))));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("VoipModelUdrMgr", e17, "Failed to create directories", new java.lang.Object[0]);
        }
    }

    public final java.lang.String b(java.lang.String basename) {
        kotlin.jvm.internal.o.g(basename, "basename");
        if (kotlin.jvm.internal.o.b(basename, c("rnnoise_16k.bin"))) {
            return "rnnoise_16k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("rnnoise_48k.bin"))) {
            return "rnnoise_48k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("cldnn_ns_16k.bin"))) {
            return "cldnn_ns_16k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("cldnn_ns_48k.bin"))) {
            return "cldnn_ns_48k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("channels_ns_16k.bin"))) {
            return "channels_ns_16k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("channels_ns_48k.bin"))) {
            return "channels_ns_48k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("fsnet_16k.bin"))) {
            return "fsnet_16k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("fsnet_48k.bin"))) {
            return "fsnet_48k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("rnnhowlsup_16k.bin"))) {
            return "rnnhowlsup_16k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("cldnnhowlsup_16k.bin"))) {
            return "cldnnhowlsup_16k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("cldnnhowlsup_48k.bin"))) {
            return "cldnnhowlsup_48k.bin";
        }
        if (kotlin.jvm.internal.o.b(basename, c("tfunet_aec_16k.xnet"))) {
            return "tfunet_aec_16k.xnet";
        }
        if (kotlin.jvm.internal.o.b(basename, c("cfn_ns_16k.xnet"))) {
            return "cfn_ns_16k.xnet";
        }
        if (kotlin.jvm.internal.o.b(basename, c("mcfusion_aec_16k.xnet"))) {
            return "mcfusion_aec_16k.xnet";
        }
        if (kotlin.jvm.internal.o.b(basename, c("mcfusion_aec_16k_asr.xnet"))) {
            return "mcfusion_aec_16k_asr.xnet";
        }
        if (kotlin.jvm.internal.o.b(basename, c("mcfusion_aec_32k.xnet"))) {
            return "mcfusion_aec_32k.xnet";
        }
        return null;
    }

    public final java.lang.String c(java.lang.String fullName) {
        kotlin.jvm.internal.o.g(fullName, "fullName");
        return r26.n0.t0(fullName, '.', null, 2, null);
    }
}
