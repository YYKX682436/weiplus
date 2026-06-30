package com.tme.karaoke.lib_singreverb;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\b\u0001\u0018\u0000 \u00172\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0086 J\u0011\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0086 J\u0019\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0086 J\u0019\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0086 J\u0019\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0086 J\u0019\u0010\u000f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0086 J\t\u0010\u0011\u001a\u00020\u0010H\u0086 R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/tme/karaoke/lib_singreverb/ReverbNativeBridge;", "", "", "sampleRate", "channel", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT, dm.i4.COL_ID, "", "setReverbId", "Ljava/nio/ByteBuffer;", "byteBuffer", "len", "accompanyProcess", "voicePreProcess", "voicePostProcess", "mixProcess", "Ljz5/f0;", "unInit", "", "nativeHandle", "J", "<init>", "()V", "Companion", "ny5/b", "lib_singreverb_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes10.dex */
public final class ReverbNativeBridge {
    public static final ny5.b Companion = new ny5.b(null);
    private static boolean loadRet;
    private long nativeHandle;

    static {
        if (loadRet) {
            return;
        }
        loadRet = ny5.d.f341478a.a();
    }

    public final native int accompanyProcess(java.nio.ByteBuffer byteBuffer, int len);

    public final native int init(int sampleRate, int channel);

    public final native int mixProcess(java.nio.ByteBuffer byteBuffer, int len);

    public final native boolean setReverbId(int id6);

    public final native void unInit();

    public final native int voicePostProcess(java.nio.ByteBuffer byteBuffer, int len);

    public final native int voicePreProcess(java.nio.ByteBuffer byteBuffer, int len);
}
