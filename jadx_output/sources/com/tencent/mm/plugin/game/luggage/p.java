package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public abstract class p {
    public static boolean a(android.os.Parcelable parcelable, java.lang.Class cls, com.tencent.mm.ipcinvoker.r rVar) {
        return com.tencent.mm.ipcinvoker.d0.e(com.tencent.mm.pluginsdk.model.g4.a() ? com.tencent.mm.sdk.platformtools.w9.f193053a : com.tencent.mm.sdk.platformtools.w9.f193055c, parcelable, cls, rVar, null);
    }

    public static boolean b(android.content.Context context) {
        return com.tencent.mm.pluginsdk.model.g4.a() ? com.tencent.mm.plugin.game.commlib.util.i.d(context, "com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI") || com.tencent.mm.plugin.game.commlib.util.i.d(context, "com.tencent.mm.plugin.game.ui.chat_tab.MMGameWebTabUI") || com.tencent.mm.plugin.game.commlib.util.i.d(context, "com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI") : com.tencent.mm.plugin.game.commlib.util.i.d(context, "com.tencent.mm.plugin.game.ui.chat_tab.GameChatTabUI") || com.tencent.mm.plugin.game.commlib.util.i.d(context, "com.tencent.mm.plugin.game.ui.chat_tab.GameWebTabUI") || com.tencent.mm.plugin.game.commlib.util.i.d(context, "com.tencent.mm.plugin.game.ui.chat_tab.ChatRoomTabUI");
    }
}
