package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes.dex */
public abstract class h9 {
    public static java.lang.String a(java.lang.String str) {
        int indexOf;
        return (!com.tencent.mm.sdk.platformtools.t8.K0(str) && (indexOf = str.indexOf("#")) >= 0) ? str.substring(0, indexOf) : str;
    }
}
