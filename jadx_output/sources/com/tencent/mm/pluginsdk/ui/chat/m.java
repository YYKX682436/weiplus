package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes15.dex */
public class m implements com.tencent.mm.pluginsdk.ui.chat.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.AppPanel f190476a;

    public m(com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel) {
        this.f190476a = appPanel;
    }

    public int a(int i17) {
        com.tencent.mm.pluginsdk.ui.chat.AppPanel appPanel = this.f190476a;
        int i18 = appPanel.f189945w;
        if (i17 >= i18) {
            return (i17 < i18 || i17 >= appPanel.f189946x) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        int length = appPanel.f189933i.length;
        int i19 = 0;
        for (int i27 = 0; i27 < length; i27++) {
            if (appPanel.f189933i[i27]) {
                if (i19 == i17) {
                    return i27;
                }
                i19++;
            }
        }
        return Integer.MAX_VALUE;
    }
}
