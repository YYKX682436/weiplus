package com.tencent.mm.plugin.magicbrush.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/tencent/mm/plugin/magicbrush/api/IMBNetworkService$Key", "", "Lcom/tencent/mm/plugin/magicbrush/api/IMBNetworkService$Key;", "<init>", "(Ljava/lang/String;I)V", "Download", "CDNDownload", "Request", "mb-api_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class IMBNetworkService$Key {
    private static final /* synthetic */ rz5.a $ENTRIES;
    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key[] $VALUES;
    public static final com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key Download = new com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key("Download", 0);
    public static final com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key CDNDownload = new com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key("CDNDownload", 1);
    public static final com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key Request = new com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key("Request", 2);

    private static final /* synthetic */ com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key[] $values() {
        return new com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key[]{Download, CDNDownload, Request};
    }

    static {
        com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key[] $values = $values();
        $VALUES = $values;
        $ENTRIES = rz5.b.a($values);
    }

    private IMBNetworkService$Key(java.lang.String str, int i17) {
    }

    public static rz5.a getEntries() {
        return $ENTRIES;
    }

    public static com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key valueOf(java.lang.String str) {
        return (com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key) java.lang.Enum.valueOf(com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key.class, str);
    }

    public static com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key[] values() {
        return (com.tencent.mm.plugin.magicbrush.api.IMBNetworkService$Key[]) $VALUES.clone();
    }
}
