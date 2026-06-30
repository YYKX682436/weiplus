package com.tencent.mm.plugin.magicbrush.report;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"com/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$MagicPkgScene", "", "Lcom/tencent/mm/plugin/magicbrush/report/IMagicBrushMonitor$MagicPkgScene;", "", "value", "I", "getValue", "()I", "<init>", "(Ljava/lang/String;II)V", "AutoPreCheck", "AutoCheck", "Clean", "Check", "Download", "IPXXDownload", "DownloadFinish", "Update", "UpdateMulti", "Get", "GetMulti", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class IMagicBrushMonitor$MagicPkgScene {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene[] $VALUES;
    private final int value;
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene AutoPreCheck = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("AutoPreCheck", 0, 0);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene AutoCheck = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("AutoCheck", 1, 1);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene Clean = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("Clean", 2, 2);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene Check = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("Check", 3, 3);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene Download = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("Download", 4, 4);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene IPXXDownload = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("IPXXDownload", 5, 5);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene DownloadFinish = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("DownloadFinish", 6, 6);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene Update = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("Update", 7, 7);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene UpdateMulti = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("UpdateMulti", 8, 8);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene Get = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("Get", 9, 9);
    public static final com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene GetMulti = new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene("GetMulti", 10, 10);

    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene[] $values() {
        return new com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene[]{AutoPreCheck, AutoCheck, Clean, Check, Download, IPXXDownload, DownloadFinish, Update, UpdateMulti, Get, GetMulti};
    }

    static {
        com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private IMagicBrushMonitor$MagicPkgScene(java.lang.String str, int i17, int i18) {
        this.value = i18;
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene) java.lang.Enum.valueOf(com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene.class, str);
    }

    public static com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene[] values() {
        return (com.tencent.mm.plugin.magicbrush.report.IMagicBrushMonitor$MagicPkgScene[]) $VALUES.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
