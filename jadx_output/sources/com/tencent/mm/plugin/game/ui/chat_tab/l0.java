package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class l0 extends java.util.LinkedHashMap {
    public l0(com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2 gameTabData2) {
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem put(java.lang.String str, com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem tabItem) {
        tabItem.A = size() + 1;
        return (com.tencent.mm.plugin.game.ui.chat_tab.GameTabData2.TabItem) super.put(str, tabItem);
    }
}
