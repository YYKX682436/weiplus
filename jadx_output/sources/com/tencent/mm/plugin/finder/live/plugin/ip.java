package com.tencent.mm.plugin.finder.live.plugin;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ip {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.ip f113000d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.ip f113001e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.ip f113002f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.live.plugin.ip f113003g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.ip[] f113004h;

    static {
        com.tencent.mm.plugin.finder.live.plugin.ip ipVar = new com.tencent.mm.plugin.finder.live.plugin.ip("OK", 0);
        f113000d = ipVar;
        com.tencent.mm.plugin.finder.live.plugin.ip ipVar2 = new com.tencent.mm.plugin.finder.live.plugin.ip("NETWORK", 1);
        f113001e = ipVar2;
        com.tencent.mm.plugin.finder.live.plugin.ip ipVar3 = new com.tencent.mm.plugin.finder.live.plugin.ip("WECOIN", 2);
        f113002f = ipVar3;
        com.tencent.mm.plugin.finder.live.plugin.ip ipVar4 = new com.tencent.mm.plugin.finder.live.plugin.ip("COMBO_ERR", 3);
        f113003g = ipVar4;
        com.tencent.mm.plugin.finder.live.plugin.ip[] ipVarArr = {ipVar, ipVar2, ipVar3, ipVar4};
        f113004h = ipVarArr;
        rz5.b.a(ipVarArr);
    }

    public ip(java.lang.String str, int i17) {
    }

    public static com.tencent.mm.plugin.finder.live.plugin.ip valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.finder.live.plugin.ip) java.lang.Enum.valueOf(com.tencent.mm.plugin.finder.live.plugin.ip.class, str);
    }

    public static com.tencent.mm.plugin.finder.live.plugin.ip[] values() {
        return (com.tencent.mm.plugin.finder.live.plugin.ip[]) f113004h.clone();
    }
}
