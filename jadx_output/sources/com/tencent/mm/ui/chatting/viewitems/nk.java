package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes.dex */
public abstract class nk {

    /* renamed from: a, reason: collision with root package name */
    public static final android.widget.LinearLayout.LayoutParams f204932a = new android.widget.LinearLayout.LayoutParams(-1, -2);

    public static int a(java.lang.String str, int i17) {
        if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            return i17;
        }
        try {
            return android.graphics.Color.parseColor(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemDyeingTemplateDecorator", "parseFrom, ex = " + e17.getMessage());
            return i17;
        }
    }
}
