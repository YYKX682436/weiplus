package com.tencent.mm.plugin.finder.ui.fav;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.ui.fav.d[] f129155d;

    static {
        com.tencent.mm.plugin.finder.ui.fav.d[] dVarArr = {new com.tencent.mm.plugin.finder.ui.fav.d(com.tencent.tmassistantsdk.downloadclient.TMAssistantDownloadSDKClientBase.CONNTECTSTATE_INIT, 0), new com.tencent.mm.plugin.finder.ui.fav.d("LOADING", 1), new com.tencent.mm.plugin.finder.ui.fav.d("LOADED", 2), new com.tencent.mm.plugin.finder.ui.fav.d("FAILURE", 3)};
        f129155d = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.ui.fav.d valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.ui.fav.d) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.ui.fav.d.class, str);
    }

    public static com.tencent.mm.plugin.finder.ui.fav.d[] values() {
        return (com.tencent.mm.plugin.finder.ui.fav.d[]) f129155d.clone();
    }
}
