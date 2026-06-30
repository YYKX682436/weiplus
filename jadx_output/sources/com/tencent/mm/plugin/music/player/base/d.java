package com.tencent.mm.plugin.music.player.base;

/* loaded from: classes13.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static com.tencent.mm.plugin.music.player.base.j f150653a = new com.tencent.mm.plugin.music.player.base.AudioPlayerUtils$DefaultMusicLoadLibrary(null);

    /* renamed from: b, reason: collision with root package name */
    public static boolean f150654b = false;

    /* renamed from: c, reason: collision with root package name */
    public static boolean f150655c = false;

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Set f150656d = new java.util.HashSet(java.util.Arrays.asList(com.tencent.qqmusic.mediaplayer.NativeLibs.nlog.getName(), com.tencent.qqmusic.mediaplayer.NativeLibs.audioCommon.getName()));

    public static synchronized boolean a() {
        synchronized (com.tencent.mm.plugin.music.player.base.d.class) {
            if (f150654b) {
                return true;
            }
            com.tencent.mm.plugin.music.player.base.j jVar = f150653a;
            if (jVar == null) {
                return false;
            }
            com.tencent.qqmusic.mediaplayer.NativeLibs nativeLibs = com.tencent.qqmusic.mediaplayer.NativeLibs.nlog;
            jVar.load(nativeLibs.getName());
            f150653a.load(com.tencent.qqmusic.mediaplayer.NativeLibs.audioCommon.getName());
            if (!f150653a.checkLoaded(nativeLibs.getName())) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerUtils", "enableNativeLog fail");
                return false;
            }
            try {
                f150654b = com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.enableNativeLog(null);
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Audio.AudioPlayerUtils", th6, "checkNLogLoad", new java.lang.Object[0]);
                if (!fp.h.a(20)) {
                    throw th6;
                }
                f150654b = com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.enableNativeLog(null);
            }
            if (f150654b) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerUtils", "enableNativeLog success");
            }
            return f150654b;
        }
    }

    public static void b() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Audio.AudioPlayerUtils", "configQQMusicSdkConfig");
        com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.setLog(new com.tencent.mm.plugin.music.player.base.a());
        com.tencent.qqmusic.mediaplayer.AudioPlayerConfigure.setSoLibraryLoader(new com.tencent.mm.plugin.music.player.base.b());
        if (f150654b || f150655c) {
            return;
        }
        f150655c = true;
        s75.d.b(new com.tencent.mm.plugin.music.player.base.c(), "audio load NLog");
    }
}
