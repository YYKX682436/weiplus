package com.tencent.mm.pluginsdk.ui.tools;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class r5 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.r5[] f191877e;

    /* renamed from: d, reason: collision with root package name */
    public final int f191878d;

    static {
        com.tencent.mm.pluginsdk.ui.tools.r5[] r5VarArr = {new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_SHARE_TO_CHAT", 0, 303), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_FAVORITE", 1, 304), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_OPEN_BY_QB", 2, qf1.f.CTRL_INDEX), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_OPEN_ON_PC", 3, 311), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_OPEN_ON_DEVICE", 4, 0, 1, null), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_DEFAULT_APP", 5, 0, 1, null), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_OTHER_APP", 6, 305), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_SPLIT_SCREEN", 7, 0, 1, null), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_FLOATING_WINDOW", 8, com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_CONTENT_FLOAT_BALL", 9, com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_RELEASE), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_SAVE", 10, com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_ON_ERROR), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_QB_SEARCH", 11, com.tencent.thumbplayer.tplayer.plugins.ITPEventID.RICH_MEDIA_SYNCHRONIZER_SET_URL), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_MORE_FILE_FUNCTION", 12, 310), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_JUMP_CHAT", 13, 0, 1, null), new com.tencent.mm.pluginsdk.ui.tools.r5("MENU_ID_FIND_LINK_FILE", 14, 0, 1, null)};
        f191877e = r5VarArr;
        rz5.b.a(r5VarArr);
    }

    public r5(java.lang.String str, int i17, int i18) {
        this.f191878d = i18;
    }

    public static com.tencent.mm.pluginsdk.ui.tools.r5 valueOf(java.lang.String str) {
        return (com.tencent.mm.pluginsdk.ui.tools.r5) java.lang.Enum.valueOf(com.tencent.mm.pluginsdk.ui.tools.r5.class, str);
    }

    public static com.tencent.mm.pluginsdk.ui.tools.r5[] values() {
        return (com.tencent.mm.pluginsdk.ui.tools.r5[]) f191877e.clone();
    }

    public /* synthetic */ r5(java.lang.String str, int i17, int i18, int i19, kotlin.jvm.internal.i iVar) {
        this(str, i17, (i19 & 1) != 0 ? 0 : i18);
    }
}
